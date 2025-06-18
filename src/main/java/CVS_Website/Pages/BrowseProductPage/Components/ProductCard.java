package CVS_Website.Pages.BrowseProductPage.Components;

import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.HomePage.components.Announcement;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class ProductCard extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(ProductCard.class);
    private WebElement productCardContainer;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param driver                WebDriver driver instance
     * @param productCardContainer WebElement container for Announcement section
     */
    public ProductCard(WebDriver driver, WebElement productCardContainer) {

        super(driver);
        this.productCardContainer = productCardContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    /**
     * Wait for product card element to be visible and click on product card element
     */
    public void clickOnProduct(int slot){

        try {

            logger.info("Waiting for product card element to be visible");
            WebElement productCards = wait.until(ExpectedConditions.presenceOfNestedElementsLocatedBy((By) productCardContainer, By.cssSelector("div[class='css-1dbjc4n r-1pi2tsx']"))).get(slot);
            logger.debug("Product card element is now visible");

            logger.info("Attempting to scroll to product card element");
            scrollIntoElement(productCards);
            logger.debug("Successfully scrolled to product card element");

            logger.info("Attempting to click on product card element");
            clickElement(productCards);
            logger.debug("Successfully clicked on product card element");

        } catch (TimeoutException e) {

            logger.error("Product card element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }


}
