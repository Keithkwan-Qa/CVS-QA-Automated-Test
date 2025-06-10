package CVS_Website.Pages.HomePage.components;

import CVS_Website.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class Wellness extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(Announcement.class);
    private WebElement cTAContainer;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param cTAContainer WebElement container for hero section
     * @param driver       WebDriver driver instance
     */
    public Wellness(WebDriver driver, WebElement cTAContainer) {

        super(driver);
        this.cTAContainer = cTAContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    /**
     * Wait for wellness header element to become visible and get text
     *
     * @return text content from wellness header element
     */
    public String getWellnessHeader() {

        try {

            logger.info("Waiting for wellness header element to become visible ");
            WebElement cTAHeader = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cTAContainer, By.xpath("//*[text()='Essentials']")));
            logger.debug("Wellness header element is not visible");

            logger.info("Attempting to get text from wellness header element");
            String acquiredText = getTextFromElement(cTAHeader);
            logger.debug("Successfully got text from wellness header element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Wellness header element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for health and medicine icon element to be visible
     *
     * @return whether health and medicine icon element is visible or not
     */
    public boolean isHealthAndMedicineIconVisible() {

        try {

            logger.info("Waiting for health and medicine icon element to be visible");
            WebElement healthAndMedicineIcon = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cTAContainer, By.xpath("//*[@class='mcimg img5']")));
            logger.debug("Health and medicine icon element is now visible");

            return healthAndMedicineIcon.isDisplayed();

        } catch (TimeoutException e) {

            logger.error("Health and medicine icon element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for health and medicine link element to be visible and click on element
     */
    public void clickHealthAndMedicineLink() {

        try {

            logger.info("Waiting for health and medicine link element to be visible");
            WebElement healthAndMedicineLink = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cTAContainer, By.xpath("//*[@id='sec4-link8']")));
            logger.debug("Health and medicine link element is now visible");

            logger.info("Attempting to click on health and medicine link element");
            clickElement(healthAndMedicineLink);
            logger.debug("Successfully clicked on health and medicine link element");

        } catch (TimeoutException e) {

            logger.error("Health and medicine link element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for vitamins icon element to be visible
     *
     * @return whether vitamins icon element is visible or not
     */
    public boolean isVitaminsIconVisible() {

        try {

            logger.info("Waiting for vitamins icon element to be visible");
            WebElement vitaminsIcon = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cTAContainer, By.xpath("//*[@class='mcimg img2']")));
            logger.debug("Vitamins icon element is now visible");
            return vitaminsIcon.isDisplayed();

        } catch (TimeoutException e) {

            logger.error("Vitamins icon element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for vitamins link element to be visible and click on element
     */
    public void clickVitaminsLink() {

        try {

            logger.info("Waiting for vitamins link element to be visible");
            WebElement vitaminsLink = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cTAContainer, By.xpath("//*[@id='sec4-link5']")));
            logger.debug("Vitamins link element is now visible");

            logger.info("Attempting to click on vitamins link element");
            clickElement(vitaminsLink);
            logger.debug("Successfully clicked on vitamins link element");

        } catch (TimeoutException e) {

            logger.error("Vitamins link element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for personal care icon element to be visible
     *
     * @return whether personal care icon element is visible or not
     */
    public boolean isPersonalCareIconVisible() {

        try {

            logger.info("Waiting for personal care icon element to be visible");
            WebElement personalCareIcon = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cTAContainer, By.xpath("//*[@class='mcimg img1']")));
            logger.debug("Personal care icon element is now visible");
            return personalCareIcon.isDisplayed();

        } catch (TimeoutException e) {

            logger.error("Personal care icon element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for personal care link element to be visible and click on element
     */
    public void clickPersonalCareLink() {

        try {

            logger.info("Waiting for personal care link element to be visible");
            WebElement personalCareLink = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cTAContainer, By.xpath("//*[@id='sec4-link4']")));
            logger.debug("Personal care link element is now visible");

            logger.info("Attempting to click on personal care link element");
            clickElement(personalCareLink);
            logger.debug("Successfully clicked on personal care link element");

        } catch (TimeoutException e) {

            logger.error("Personal care link element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for shop weekly ads icon element to be visible
     *
     * @return Whether shop weekly ads icon element is visible or not
     */
    public boolean isShopWeeklyAdsIconVisible() {

        try {

            logger.info("Waiting for shop weekly ads icon element to be visible");
            WebElement shopWeeklyAdsIcon = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cTAContainer, By.xpath("//*[@class='mcimg img4']")));
            logger.debug("Shop weekly ads icon element is now visible");
            return shopWeeklyAdsIcon.isDisplayed();

        } catch (TimeoutException e) {

            logger.error("Shop weekly ads icon element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for shop weekly ads link element to be visible and click on element
     */
    public void clickShopWeeklyDealsLink() {

        try {

            logger.info("Waiting for shop weekly ads link element to be visible");
            WebElement shopWeeklyAdsLink = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cTAContainer, By.xpath("//*[@id='sec4-link6']")));
            logger.debug("Shop weekly ads link element is now visible");

            logger.info("Attempting to click on shop weekly ads link element");
            clickElement(shopWeeklyAdsLink);
            logger.debug("Successfully clicked on shop weekly ads link element");

        } catch (TimeoutException e) {

            logger.error("Shop weekly ads link element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for shop all products text element to become visible and get text
     *
     * @return text content from shop all products text element
     */
    public String getShopAllProductsText() {

        try {

            logger.info("Waiting for shop all products text element to become visible ");
            WebElement shopAllProductsText = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cTAContainer, By.xpath("//*[text()='Shop all products']")));
            logger.debug("Shop all products text element is now visible");

            logger.info("Attempting to get text from shop all products text element");
            String acquiredText = getTextFromElement(shopAllProductsText);
            logger.debug("Successfully got text from shop all products text element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Shop all products text element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for shop all products link element to be visible and click on element
     */
    public void clickShopAllProductsLink() {

        try {

            logger.info("Waiting for shop all products link element to be visible");
            WebElement shopAllProductsLink = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cTAContainer, By.xpath("//*[@id='sec1-link4']")));
            logger.debug("Shop all products link element is now visible");

            logger.info("Attempting to click on shop all products link element");
            clickElement(shopAllProductsLink);
            logger.debug("Successfully clicked on shop all products link element");

        } catch (TimeoutException e) {

            logger.error("Shop all products link element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

}
