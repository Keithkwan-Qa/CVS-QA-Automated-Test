package UI_validation_testing;

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
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CVS_Add_Product_Test extends UI_Validation_Test_Parent {

    private BasePage basePage;
    private Highlights highlights;
    private CVS_BrowseProductsPage cvsBrowseProductsPage;
    private ProductCard productCard;
    private CVS_ProductPage cvsProductPage;
    private AddToCartFinalization addToCartFinalization;
    private ProductDisplay productDisplay;
    private CartPage cartPage;
    private CartOrderSummary cartOrderSummary;
    private CartItems cartItems;
    private CVS_Homepage cvsHomepage;

    @Test(description = "We want to navigate from the homepage to the highlights section in order to click into the main link. We will land on a page to browse products and select one to click into. From here we will add the product into our cart and check for correct values")

    public void addProductToCart() {

        try {

            cvsHomepage.scrollToHighlightsContainer();
            logger.pass("Successfully scrolled to highlights container");

            highlights.clickHighlightsLink1();
            logger.pass("Successfully clicked on highlights link 1");

            Assert.assertEquals(driver.get().getCurrentUrl(), "");
            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            throw e;

        }

        try {

            productCard.clickOnProduct(0);
            logger.pass("Successfully clicked on desired product link");

            Assert.assertEquals(driver.get().getCurrentUrl(), "");
            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            throw e;

        }

        try {

            addToCartFinalization.quantitySelectDropMenu(2);
            logger.pass("Successfully changed quantity of product to desired amount");

            addToCartFinalization.clickShipping();
            logger.pass("Successfully clicked on shipping fulfillment method");

            addToCartFinalization.clickAddToCart();
            logger.pass("Successfully clicked add to cart button");

            addToCartFinalization.clickCheckout();
            logger.pass("Successfully clicked checkout button");

        } catch (TimeoutException e) {

            throw e;

        }

        try {

            cartItems.checkCartItems();
            logger.pass("Successfully printed out list of cart items");

            cartItems.clickChangeStore();
            logger.pass("Successfully clicked change store button");

            cartItems.sendLocationText("11364");
            logger.pass("Successfully sent desired text to store locator text box");

            cartItems.clickSearchStore();
            logger.pass("Successfully clicked on search store button");

            cartItems.checkTextLocatedStores();
            logger.pass("Successfully got text results for nearby stores located");

            cartItems.clickSelectStore(1);
            logger.pass("Successfully selected desired store");

            cartItems.clickChangeZIP();
            logger.pass("Successfully clicked change zip code button");

            cartItems.sendZIP("11364");
            logger.pass("Successfully sent text to the zipcode text box");

            cartItems.clickUpdateZIP();
            logger.pass("Successfully clicked on the update button");

            cartItems.cartQuantityDropMenu(0);
            logger.pass("Successfully changed quantity of product to desired amount");

            cartItems.clickChangeFulfillmentMethod();
            logger.pass("Successfully clicked on change fulfillment method button");

            cartItems.selectFulfillmentMethod(2);
            logger.pass("Successfully selected desired fulfillment method");

            cartItems.clickSave();
            logger.pass("Successfully clicked the save button to save selected fulfillment method");

        } catch (TimeoutException e) {

            throw e;

        }

        try {

            String itemCount = cartOrderSummary.getCartItemCount();
            logger.pass("Successfully got text value for cart item count");

            Assert.assertEquals(itemCount, "");
            logger.pass("Successfully checked for correct value");

            String subTotal = cartOrderSummary.getOrderSubTotal();
            logger.pass("Successfully got text value for subtotal of order");

            Assert.assertEquals(subTotal, "");
            logger.pass("Successfully checked for correct value");

            String savingsTotal = cartOrderSummary.getSavingsTotal();
            logger.pass("Successfully got text value for total savings from order");

            Assert.assertEquals(savingsTotal, "");
            logger.pass("Successfully checked for correct value");

            String shippingCost = cartOrderSummary.getShippingCost();
            logger.pass("Successfully got text value for shipping cost");

            Assert.assertEquals(shippingCost, "");
            logger.pass("Successfully checked for correct value");

            String estimatedTotal = cartOrderSummary.getOrderEstimatedTotal();
            logger.pass("Successfully got text value for estimated total of order");

            Assert.assertEquals(estimatedTotal, "");
            logger.pass("Successfully checked for correct value");

            System.out.println("Items in cart: " + itemCount);
            System.out.println("Cart subtotal: " + subTotal);
            System.out.println("Total savings: " + savingsTotal);
            System.out.println("Cost of shipping: " + shippingCost);
            System.out.println("Estimated order total: " + estimatedTotal);

            cartOrderSummary.clickCheckOut();
            logger.pass("Successfully clicked checkout button");

        } catch (TimeoutException e) {

            throw e;

        }

    }
}

