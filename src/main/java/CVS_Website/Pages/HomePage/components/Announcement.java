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

public class Announcement extends BasePage {
    private static final Logger logger = LoggerFactory.getLogger(Announcement.class);
    private WebElement announcementContainer;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param driver                WebDriver driver instance
     * @param announcementContainer WebElement container for Announcement section
     */
    public Announcement(WebDriver driver, WebElement announcementContainer) {

        super(driver);
        this.announcementContainer = announcementContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    /**
     * Wait for Announcement header element to become visible and get text
     *
     * @return text content from Announcement header element
     */
    public String getHeader() {

        try {

            logger.info("Waiting for Announcement header element to become visible ");
            WebElement announcementHeader = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(announcementContainer, By.cssSelector("h2[class='bold']")));
            logger.debug("Element is not visible");

            logger.info("Attempting to get text from Announcement header element");
            String acquiredText = getTextFromElement(announcementHeader);
            logger.debug("Successfully got text from Announcement header element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Announcement header element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for Announcement p1 text element to be visible is get text
     *
     * @return text content from Announcement p1 element
     */
    public String getP1() {

        try {

            logger.info("Waiting for Announcement p1 element to be visible");
            WebElement announcementP1 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(announcementContainer, By.cssSelector("p[class='normal']")));
            logger.debug("Announcement p1 element is now visible");

            logger.info("Attempting to get text from Announcement p1 element");
            String p1Text = getTextFromElement(announcementP1);
            logger.debug("Successfully acquired Announcement p1 text");

            return p1Text;

        } catch (TimeoutException e) {

            logger.error("Announcement p1 element was not visible and could not get text");
            throw e;

        }
    }

    /**
     * Wait for Announcement p2 element to be visible and get text
     *
     * @return text content from Announcement p2 element
     */
    public String getP2() {

        try {

            logger.info("Waiting for Announcement p2 element to be visible");
            WebElement announcementP2 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(announcementContainer, By.cssSelector("div[class='section3']")));
            logger.debug("Announcement p2 element is now visible");

            logger.info("Attempting to get text from Announcement p2 element");
            String p2Text = getTextFromElement(announcementP2);
            logger.debug("Successfully got text from Announcement p2 element");

            return p2Text;

        } catch (TimeoutException e) {

            logger.error("Announcement p2 element was not visible and could not get text within timeout");
            throw e;

        }
    }

    /**
     * Wait for Announcement phone number element to be visible and get text
     *
     * @return text content from Announcement phone number element
     */
    public String getPhoneNumber() {

        try {

            logger.info("Waiting for Announcement phone number element to be visible");
            WebElement phoneNumber = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(announcementContainer, By.cssSelector("a[class='disclink']")));
            logger.debug("Announcement phone number element is now visible");

            logger.info("Attempting to get text from Announcement phone number element");
            String phoneNumberText = getTextFromElement(phoneNumber);
            logger.debug("Successfully got text from Announcement phone number element");

            return phoneNumberText;

        } catch (TimeoutException e) {

            logger.error("Announcement phone number element was not visible and text could not be gotten within timeout");
            throw e;

        }
    }

    /**
     * Wait for transfer link element to be visible and click on element
     */
    public void clickTransferOnline() {

        try {

            logger.info("Waiting for transfer link element to be visible");
            WebElement transferOnlineLink = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(announcementContainer, (By.cssSelector("a[id='sec-link-637']"))));
            logger.debug("Transfer link element is now visible");

            logger.info("Attempting to click on transfer link element");
            clickElement(transferOnlineLink);
            logger.debug("Successfully clicked on transfer link element");

        } catch (TimeoutException e) {

            logger.error("Transfer link element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }
}
//xpath for annoucnement contianer //*[@class='bnts-637 aem-ssr-web-content_container__JJecC']