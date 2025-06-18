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

public class Commitment extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(Commitment.class);
    private WebElement commitmentContainer;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param commitmentContainer WebElement container for Commitment section
     * @param driver              WebDriver driver instance
     */
    public Commitment(WebDriver driver, WebElement commitmentContainer) {

        super(driver);
        this.commitmentContainer = commitmentContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    /**
     * Wait for Commitment mini card 1 IMG element to be visible and extract attribute values from element
     */
    public void checkCommitmentMiniCard1Image() {

        try {

            logger.info("Waiting for Commitment mini card 1 IMG element to be visible");
            WebElement commitmentMiniCard1IMG = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.cssSelector("img[alt='A child receives a sports physical at MinuteClinic.']")));
            logger.debug("Commitment mini card 1 IMG element is now visible");

            logger.info("Attempting to extract css values from Commitment mini card 1 IMG element");
            imageCheckCSS(commitmentContainer,"img[alt='A child receives a sports physical at MinuteClinic.']");
            logger.debug("Successfully extracted css values from Commitment mini card 1 IMG element");


        } catch (TimeoutException e) {

            logger.error("Commitment mini card 1 IMG element was not visible within timeout");
            throw e;

        }

    }

    /**
     * Wait for Commitment mini card 1 header element to become visible and get text
     *
     * @return text content from Commitment mini card 1 header element
     */
    public String getCommitmentMiniCard1Header() {

        try {

            logger.info("Waiting for Commitment mini card 1 header element to become visible ");
            WebElement commitmentMiniCard1MinuteClinicSectionHeader = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.xpath("//*[text()='MinuteClinic']")));
            WebElement commitmentMiniCard1TextSectionHeader = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.xpath("//*[text()=' providers do sports and camp physicals, too.']")));
            logger.debug("Commitment mini card 1 header element is now visible");

            logger.info("Attempting to get text from Commitment mini card 1 header element");
            String acquiredText = getTextFromElement(commitmentMiniCard1MinuteClinicSectionHeader) + " " + getTextFromElement(commitmentMiniCard1TextSectionHeader);
            logger.debug("Successfully got text from Commitment mini card 1 header element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Commitment mini card 1 header element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Commitment mini card 1 link text element to become visible and get text
     *
     * @return text content from Commitment mini card 1 link text element
     */
    public String getCommitmentMiniCard1LinkText() {

        try {

            logger.info("Waiting for Commitment mini card 1 link text element to become visible ");
            WebElement commitmentMiniCard1Link = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.xpath("//*[text()='Explore MinuteClinic services']")));
            logger.debug("Commitment mini card 1 link text element is now visible");

            logger.info("Attempting to get text from Commitment mini card 1 link text element");
            String acquiredText = getTextFromElement(commitmentMiniCard1Link);
            logger.debug("Successfully got text from Commitment mini card 1 link text element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Commitment mini card 1 link text element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Commitment mini card 1 link element to be visible and click on element
     */
    public void clickCommitmentMiniCard1Link() {

        try {

            logger.info("Waiting for Commitment mini card 1 link element to be visible");
            WebElement commitmentMiniCard1Link = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.xpath("//*[text()='Explore MinuteClinic services']")));
            logger.debug("Commitment mini card 1 link element is now visible");

            logger.info("Attempting to click on Commitment mini card 1 link element");
            clickElement(commitmentMiniCard1Link);
            logger.debug("Successfully clicked on Commitment mini card 1 link element");

        } catch (TimeoutException e) {

            logger.error("Commitment mini card 1 link element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for Commitment mini card 2 IMG element to be visible and extract css values from element
     */
    public void checkCommitmentMiniCard2Image() {

        try {

            logger.info("Waiting for Commitment mini card 2 IMG element to be visible");
            WebElement commitmentMiniCard2IMG = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.cssSelector("img[alt='A person picks up their prescriptions at the drive-through line at CVS.']")));
            logger.debug("Commitment mini card 2 IMG element is now visible");

            logger.info("Attempting to extract css values from Commitment mini card 2 IMG element");
            imageCheckCSS(commitmentContainer,"img[alt='A person picks up their prescriptions at the drive-through line at CVS.']");
            logger.debug("Successfully extracted css values from Commitment mini card 2 IMG element");


        } catch (TimeoutException e) {

            logger.error("Commitment mini card 2 IMG element was not visible within timeout");
            throw e;

        }

    }

    /**
     * Wait for Commitment mini card 2 header element to become visible and get text
     *
     * @return text content from Commitment mini card 2 header element
     */
    public String getCommitmentMiniCard2Header() {

        try {

            logger.info("Waiting for Commitment mini card 2 header element to become visible ");
            WebElement commitmentMiniCard2Header = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.xpath("//*[text()='Are you moving? We’ll still be around the corner.']")));
            logger.debug("Commitment mini card 2 header element is now visible");

            logger.info("Attempting to get text from Commitment mini card 2 header element");
            String acquiredText = getTextFromElement(commitmentMiniCard2Header);
            logger.debug("Successfully got text from Commitment mini card 2 header element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Commitment mini card 2 header element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Commitment mini card 2 link text element to become visible and get text
     *
     * @return text content from Commitment mini card 2 link text element
     */
    public String getCommitmentMiniCard2LinkText() {

        try {

            logger.info("Waiting for Commitment mini card 2 link text element to become visible ");
            WebElement commitmentMiniCard2Link = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.xpath("//*[text()='Transfer your prescriptions']")));
            logger.debug("Commitment mini card 2 link text element is now visible");

            logger.info("Attempting to get text from Commitment mini card 2 link text element");
            String acquiredText = getTextFromElement(commitmentMiniCard2Link);
            logger.debug("Successfully got text from Commitment mini card 2 link text element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Commitment mini card 2 link text element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Commitment mini card 2 link element to be visible and click on element
     */
    public void clickCommitmentMiniCard2Link() {

        try {

            logger.info("Waiting for Commitment mini card 2 link element to be visible");
            WebElement commitmentMiniCard2Link = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.xpath("//*[text()='Transfer your prescriptions']")));
            logger.debug("Commitment mini card 2 link element is now visible");

            logger.info("Attempting to click on Commitment mini card 2 link element");
            clickElement(commitmentMiniCard2Link);
            logger.debug("Successfully clicked on Commitment mini card 2 link element");

        } catch (TimeoutException e) {

            logger.error("Commitment mini card 2 link element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for Commitment mini card 3 IMG element to be visible and extract css values from element
     */
    public void checkCommitmentMiniCard3Image() {

        try {

            logger.info("Waiting for Commitment mini card 3 IMG element to be visible");
            WebElement commitmentMiniCard3IMG = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.cssSelector("img[alt='A patient looks up flu shot information online.']")));
            logger.debug("Commitment mini card 3 IMG element is now visible");

            logger.info("Attempting to extract css values from Commitment mini card 3 IMG element");
            imageCheckCSS(commitmentContainer,"img[alt='A patient looks up flu shot information online.");
            logger.debug("Successfully extracted css values from Commitment mini card 3 IMG element");


        } catch (TimeoutException e) {

            logger.error("Commitment mini card 3 IMG element was not visible within timeout");
            throw e;

        }

    }

    /**
     * Wait for Commitment mini card 3 header element to become visible and get text
     *
     * @return text content from Commitment mini card 3 header element
     */
    public String getCommitmentMiniCard3Header() {

        try {

            logger.info("Waiting for Commitment mini card 3 header element to become visible ");
            WebElement commitmentMiniCard3Header = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.xpath("//*[text()='Traveling abroad? We have vaccines for that, too.']")));
            logger.debug("Commitment mini card 3 header element is now visible");

            logger.info("Attempting to get text from Commitment mini card 3 header element");
            String acquiredText = getTextFromElement(commitmentMiniCard3Header);
            logger.debug("Successfully got text from Commitment mini card 3 header element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Commitment mini card 3 header element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Commitment mini card 3 link text element to become visible and get text
     *
     * @return text content from Commitment mini card 3 link text element
     */
    public String getCommitmentMiniCard3LinkText() {

        try {

            logger.info("Waiting for Commitment mini card 3 link text element to become visible ");
            WebElement commitmentMiniCard3Link = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.xpath("//*[text()='Learn more about our 14+ vaccines']")));
            logger.debug("Commitment mini card 3 link text element is now visible");

            logger.info("Attempting to get text from Commitment mini card 3 link text element");
            String acquiredText = getTextFromElement(commitmentMiniCard3Link);
            logger.debug("Successfully got text from Commitment mini card 3 link text element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Commitment mini card 3 link text element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Commitment mini card 3 link element to be visible and click on element
     */
    public void clickCommitmentMiniCard3Link() {

        try {

            logger.info("Waiting for Commitment mini card 3 link element to be visible");
            WebElement commitmentMiniCard3Link = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(commitmentContainer, By.xpath("//*[text()='Learn more about our 14+ vaccines']")));
            logger.debug("Commitment mini card 3 link element is now visible");

            logger.info("Attempting to click on Commitment mini card 3 link element");
            clickElement(commitmentMiniCard3Link);
            logger.debug("Successfully clicked on Commitment mini card 3 link element");

        } catch (TimeoutException e) {

            logger.error("Commitment mini card 3 link element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

}

