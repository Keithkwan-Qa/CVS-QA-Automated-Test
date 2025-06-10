package CVS_Website.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

/**
 * base class for all page objects
 */
public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected static final Logger logger = LoggerFactory.getLogger(BasePage.class);
    private JavascriptExecutor jse;
    //initilize page objects

    /**
     * constructor to initialize page
     *
     * @param driver WebDriver instance
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.jse = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Wait for element to be clickable and click
     *
     * @param element WebElement to enter text
     */
    protected void clickElement(WebElement element) {
        try {
            logger.info("waiting for element to be clickable");
            WebElement clickOn = wait.until(ExpectedConditions.elementToBeClickable(element));
            logger.debug("Element is now clickable");
            logger.info("Attempting to click on element: {}", element.getTagName());
            clickOn.click();
            logger.debug("Element has been clicked successfully");
        } catch (TimeoutException e) {
            logger.error("Element not clickable within timeout: {}", element.getTagName());
            throw e;
        }
    }

    /**
     * Wait for element to be visible and enter text
     *
     * @param element WebElement to enter text
     * @param text    Text to enter
     */
    protected void enterText(WebElement element, String text) {

        try {

            logger.info("Waiting for element to be visible");
            WebElement textbox = wait.until(ExpectedConditions.visibilityOf(element));
            logger.debug("Text box element is now visible");

            logger.info("Attempting to clear contents of element: {}", element.getTagName());
            textbox.clear();
            logger.debug("Element contents have been successfully cleared on");

            logger.info("Attempting to send text to element: {}", element.getTagName());
            element.sendKeys(text);
            logger.debug("Successfully sent text to element");

        } catch (TimeoutException e) {

            logger.error("Element was not visible and could not send text within timeout: {}", element.getTagName());

        }
    }

    /**
     * Get text from an element after it's become visible
     *
     * @param element WebElement to get text from
     * @return Text content of the element
     */
    protected String getTextFromElement(WebElement element) {

        try {

            logger.info("Waiting for element to be visible");
            WebElement textToGet = wait.until(ExpectedConditions.visibilityOf(element));
            logger.debug("Element is now visible");

            logger.info("Attempting to get text from element: {}", element.getTagName());
            String acquiredText = textToGet.getText();
            logger.debug("Successfully got text from element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Element was not visible and coudl not get text withing timeout: {}", element.getTagName());
            throw e;

        }
    }

    /**
     * Get Css values from an element after it's become visible
     *
     * @param element  WebElement to get Css value from
     * @param cssValue String to choose which Css value
     * @return Css attribute of element
     */
    protected String getCSSAttributes(WebElement element, String cssValue) {

        try {
            logger.info("Waiting for element to be visible");
            WebElement elementToGetCssValue = wait.until(ExpectedConditions.visibilityOf(element));
            logger.debug("Element is now visible");

            logger.info("Attempting to acquire desired css value from element: {}", element.getTagName());
            String elementCssValue = elementToGetCssValue.getCssValue(cssValue);
            logger.debug("Successfully got css value");

            return elementCssValue;

        } catch (TimeoutException e) {

            logger.error("Element was not visible and could not acquire css value within timeout: {}", element.getTagName());
            throw e;

        }
    }

    /**
     * Check if element is visible
     *
     * @param element WebElement to check
     */
    protected boolean visible(WebElement element) {

        try {

            logger.info("Waiting for element to be visible");
            wait.until(ExpectedConditions.visibilityOf(element));
            logger.debug("Element is now visible");

            return true;

        } catch (NoSuchElementException e) {

            logger.error("Element was not visible within timeout:{}", element.getTagName());
            return false;

        }
    }

    /**
     * Wait for element to be visible and scroll into view
     *
     * @param element WebElement to enter text
     */
    protected void scrollIntoElement(WebElement element) {

        try {

            logger.info("Waiting for element to be visible");
            WebElement elementToScrollTo = wait.until(ExpectedConditions.visibilityOf(element));
            logger.debug("Element is now visible");

            logger.info("Attempting to scroll to element: {}", element.getTagName());
            jse.executeScript("arguments[0], scrollIntoView(true);", elementToScrollTo);
            logger.debug("Element successfully scrolled to");

        } catch (TimeoutException e) {

            logger.error("Element was not visible and could not scroll into view within timeout: {}", element.getTagName());

        }
    }

}

