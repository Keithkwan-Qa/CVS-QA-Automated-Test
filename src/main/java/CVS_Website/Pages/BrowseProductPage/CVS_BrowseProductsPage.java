package CVS_Website.Pages.BrowseProductPage;

import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.BrowseProductPage.Components.ProductCard;
import CVS_Website.Pages.HomePage.CVS_Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class CVS_BrowseProductsPage extends BasePage{

    private static final Logger logger = LoggerFactory.getLogger(CVS_BrowseProductsPage.class);
    private WebDriver driver;
    private ProductCard productCard;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param driver WebDriver driver instance
     */
    public CVS_BrowseProductsPage(WebDriver driver) {

        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.productCard = new ProductCard(driver,browseProductsContainer);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class='css-1dbjc4n r-150rngu r-n2h5ot r-13awgt0 r-eqz5dr r-16y2uox r-1wbh5a2 r-1oy2gb8 r-11yh6sk r-1rnoaur r-9aemit r-1sncvnh']")
    private WebElement browseProductsContainer;

    public void clickOnDesiredProduct(int index) {
        productCard.clickOnProduct(index);
    }
}
