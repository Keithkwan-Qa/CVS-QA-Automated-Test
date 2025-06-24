package E2E_Test;

import CVS_Website.Pages.*;
import CVS_Website.Pages.BrowseProductPage.CVS_BrowseProductsPage;
import CVS_Website.Pages.BrowseProductPage.Components.ProductCard;
import CVS_Website.Pages.CartPage.CartPage;
import CVS_Website.Pages.CartPage.Components.CartItems;
import CVS_Website.Pages.CartPage.Components.CartOrderSummary;
import CVS_Website.Pages.HomePage.CVS_Homepage;
import CVS_Website.Pages.HomePage.components.*;
import CVS_Website.Pages.ProductPage.CVS_ProductPage;
import CVS_Website.Pages.ProductPage.Components.AddToCartFinalization;
import CVS_Website.Pages.ProductPage.Components.ProductDisplay;
import UI_validation_testing.Test_Parent;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CVS_Add_Product_Test extends Test_Parent {


    private CVS_BrowseProductsPage cvsBrowseProductsPage;
    private CVS_ProductPage cvsProductPage;
    private CartPage cartPage;
    private CVS_Homepage cvs_Homepage;
    private SoftAssert soft = new SoftAssert();

    @BeforeClass

    public void pageInit(){

        cvs_Homepage = new CVS_Homepage(getDriver());
        cvsBrowseProductsPage = new CVS_BrowseProductsPage(getDriver());
        cvsProductPage = new CVS_ProductPage(getDriver());
        cartPage = new CartPage(getDriver());

    }
    @Test(description = "We want to navigate from the homepage to the highlights section in order to click into the main link. We will land on a page to browse products and select one to click into. From here we will add the product into our cart and check for correct values")

    public void addProductToCart() {

        try {

            cvs_Homepage.scrollToHighlightsContainer();
            logger.info("Scrolling to highlights container");

            cvs_Homepage.clickHighlightsLink1();
            logger.info("Clicking on highlights link 1");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully navigated to browse products from highlight link");

        } catch (TimeoutException e) {

            logger.fail("Unsuccessful in navigating to browse products page: " + e.getMessage());
            throw e;

        }

        try {

            cvsBrowseProductsPage.clickOnDesiredProduct(1);
            logger.info("Clicking on desired product link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully navigated to desired product");

        } catch (TimeoutException e) {

            logger.fail("Unsuccessful in navigating to desired product page: " + e.getMessage());
            throw e;

        }

        try {

            cvsProductPage.selectQuantity(0);
            logger.info("Changing quantity of product to desired amount");

            cvsProductPage.clickShipping();
            logger.info("Clicking on shipping fulfillment method");

            cvsProductPage.clickAddToCart();
            logger.info("Clicking add to cart button");

            cvsProductPage.clickCheckout();
            logger.info("Clicking checkout button");

            logger.pass("Successfully changed quantity, fulfillment method, and navigated to cart");

        } catch (TimeoutException e) {

            logger.fail("Unsuccessful in changing quantity, fulfillment method, and navigating to cart page: " + e.getMessage());
            throw e;

        }

        try {

            cartPage.checkCartItems();
            logger.info("Printing out list of cart items");

            cartPage.clickChangeStore();
            logger.info("Clicking change store button");

            cartPage.sendLocationText("");
            logger.info("Sending desired text to store locator text box");

            cartPage.clickSearchStore();
            logger.info("Clicking on search store button");

            cartPage.checkTextLocatedStores();
            logger.info("Grabbing text results for nearby stores located");

            cartPage.clickSelectStore(1);
            logger.info("Selecting desired store");

            cartPage.clickChangeZIP();
            logger.info("Clicking change zip code button");

            cartPage.sendZIP("11364");
            logger.info("Sending text to the zipcode text box");

            cartPage.clickUpdateZIP();
            logger.info("Clicking on the update button");

            cartPage.cartQuantityDropMenu(0);
            logger.info("Changing quantity of product to desired amount");

            cartPage.clickChangeFulfillmentMethod();
            logger.info("Clicking on change fulfillment method button");

            cartPage.selectFulfillmentMethod(2);
            logger.info("Selecting desired fulfillment method");

            cartPage.clickSave();
            logger.info("Clicking the save button to save selected fulfillment method");

            logger.pass("Successfully updated store location and address info");

        } catch (TimeoutException e) {

            logger.fail("Unsuccessful in updated store location and address info: " + e.getMessage());
            throw e;

        }

        try {

            String itemCount = cartPage.getCartItemCount();
            logger.info("Grabbing text value for cart item count");

            soft.assertEquals(itemCount, "");
            logger.info("Checking for correct value");

            String subTotal = cartPage.getOrderSubTotal();
            logger.info("Grabbing text value for subtotal of order");

            soft.assertEquals(subTotal, "");
            logger.info("Checking for correct value");

            String savingsTotal = cartPage.getSavingsTotal();
            logger.info("Grabbing text value for total savings from order");

            soft.assertEquals(savingsTotal, "");
            logger.info("Checking for correct value");

            String shippingCost = cartPage.getShippingCost();
            logger.info("Grabbing text value for shipping cost");

            soft.assertEquals(shippingCost, "");
            logger.info("Checking for correct value");

            String estimatedTotal = cartPage.getOrderEstimatedTotal();
            logger.info("Grabbing text value for estimated total of order");

            soft.assertEquals(estimatedTotal, "");
            logger.info("Checking for correct value");

            System.out.println("Items in cart: " + itemCount);
            System.out.println("Cart subtotal: " + subTotal);
            System.out.println("Total savings: " + savingsTotal);
            System.out.println("Cost of shipping: " + shippingCost);
            System.out.println("Estimated order total: " + estimatedTotal);
            logger.info("Printing out order summary");

            cartPage.clickCheckOut();
            logger.info("Clicking checkout button");

            logger.pass("Successfully grabbed and validated order summary info");

        } catch (TimeoutException e) {

            logger.fail("Unsuccessful in grabbing order summary and validating info: " + e.getMessage());
            throw e;

        }

    }
}

