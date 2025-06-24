package CVS_Website.Pages.CartPage;

import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.CartPage.Components.CartItems;
import CVS_Website.Pages.CartPage.Components.CartOrderSummary;
import CVS_Website.Pages.ProductPage.Components.AddToCartFinalization;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;

public class CartPage extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(CartPage.class);
    private WebDriver driver;
    private CartItems cartItems;
    private CartOrderSummary cartOrderSummary;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param driver WebDriver driver instance
     */
    public CartPage(WebDriver driver) {

        super(driver);
        this.cartItems = new CartItems(driver, cartItemsContainer);
        this.cartOrderSummary = new CartOrderSummary(driver, orderSummaryContainer);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "div[class='ItemSelection-module__container']")
    private WebElement cartItemsContainer;

    //hero section
    @FindBy(css = "div[class='Review-module__container']")
    private WebElement orderSummaryContainer;

    public void checkCartItems() {

        cartItems.checkCartItems();

    }

    public void clickChangeStore() {

        cartItems.clickChangeStore();

    }

    public void sendLocationText(String location) {

        cartItems.sendLocationText(location);

    }

    public void clickSearchStore() {

        cartItems.clickSearchStore();

    }

    public void checkTextLocatedStores() {

        cartItems.checkTextLocatedStores();

    }

    public void clickSelectStore(int index) {

        cartItems.clickSelectStore(index);

    }

    public void clickChangeZIP() {

        cartItems.clickChangeZIP();

    }

    public void sendZIP(String zip) {

        cartItems.sendZIP(zip);

    }

    public void clickUpdateZIP() {

        cartItems.clickUpdateZIP();

    }

    public void cartQuantityDropMenu(int index) {

        cartItems.cartQuantityDropMenu(index);

    }

    public void clickChangeFulfillmentMethod() {

        cartItems.clickChangeFulfillmentMethod();

    }

    public void selectFulfillmentMethod(int index) {

        cartItems.selectFulfillmentMethod(index);

    }

    public void clickSave() {

        cartItems.clickSave();

    }

    public String getCartItemCount() {

        return cartOrderSummary.getCartItemCount();

    }

    public String getOrderSubTotal() {

        return cartOrderSummary.getOrderSubTotal();

    }

    public String getSavingsTotal() {

        return cartOrderSummary.getSavingsTotal();

    }

    public String getShippingCost() {

        return cartOrderSummary.getShippingCost();

    }

    public String getOrderEstimatedTotal() {

        return cartOrderSummary.getOrderEstimatedTotal();

    }

    public void clickCheckOut() {

        cartOrderSummary.clickCheckOut();

    }

}
