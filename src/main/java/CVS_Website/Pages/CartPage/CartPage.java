package CVS_Website.Pages.CartPage;

import CVS_Website.Pages.BasePage;
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
    private WebElement cartContainer;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param driver WebDriver driver instance
     */
    public CartPage(WebDriver driver, WebElement cartContainer) {

        super(driver);
        this.cartContainer = cartContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "div[class='ItemSelection-module__container']")
    private WebElement cartItemsContainer;

    //hero section
    @FindBy(css = "div[class='Review-module__container']")
    private WebElement orderSummaryContainer;



}
