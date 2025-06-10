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

public class Highlights extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(Announcement.class);
    private WebElement highlightsContainer;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param highlightsContainer WebElement container for hero section
     * @param driver              WebDriver driver instance
     */
    public Highlights(WebDriver driver, WebElement highlightsContainer) {

        super(driver);
        this.highlightsContainer = highlightsContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    /**
     * Wait for Highlights header element to become visible and get text
     *
     * @return text content from Highlights header element
     */
    public String getHighlightsHeader() {

        try {

            logger.info("Waiting for element to become visible ");
            WebElement highlightsHeader = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.xpath("//*[text()='Essentials']")));
            logger.debug("Element is now visible");

            logger.info("Attempting to get text from element");
            String acquiredText = getTextFromElement(highlightsHeader);
            logger.debug("Successfully got text from element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Highlights header Element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Highlights IMG element to be visible and extract css values from element
     */
    public void checkHighlightsImage() {

        try {

            logger.info("Waiting for element to be visible");
            WebElement highlightsIMG = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.xpath("//img[@alt='BOGO 50% off. Cerave mineral sunscreen stick, Neutrogena Ultra Sheer spray-on sunscreen and Aveeno Protect plus Hydrate sunscreen lotion.']")));
            logger.debug("Highlights IMG element is now visible");

            logger.info("Attempting to extract css values from Highlights IMG element");
            String heroSectionIMG_Width = getCSSAttributes(highlightsIMG,"width");
            String heroSectionIMG_Height = getCSSAttributes(highlightsIMG,"Height");
            String heroSectionIMG_SRC = getCSSAttributes(highlightsIMG,"src");
            System.out.println("Height: " + heroSectionIMG_Height);
            System.out.println("Width: " + heroSectionIMG_Width);
            System.out.println("SRC: " + heroSectionIMG_SRC);


        } catch (TimeoutException e) {

            logger.error("Highlights IMG element was not visible within timeout");
            throw e;

        }

    }

    /**
     * Wait for Highlights sub header element to become visible and get text
     *
     * @return text content from Highlights sub header element
     */
    public String getHighlightsSubHeader() {

        try {

            logger.info("Waiting for Highlights sub header element to become visible ");
            WebElement highlightsSubHeader = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.xpath("//*[text()='Sunscreen packed? Here are some deals to stock back up on.']")));
            logger.debug("Highlights sub header element is now visible");

            logger.info("Attempting to get text from Highlights sub header element");
            String acquiredText = getTextFromElement(highlightsSubHeader);
            logger.debug("Successfully got text from Highlights sub header element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Highlights sub header element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Highlights paragraph element to become visible and get text
     *
     * @return text content from Highlights paragraph element
     */
    public String getHighlightsParagraph() {

        try {

            logger.info("Waiting for Highlights paragraph element to become visible ");
            WebElement highlightsParagraph = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.xpath("//*[text()='Buy one Neutrogena, Aveeno or CeraVe sun care product and get one 50% off.']")));
            logger.debug("Highlights paragraph element is now visible");

            logger.info("Attempting to get text from Highlights paragraph element");
            String acquiredText = getTextFromElement(highlightsParagraph);
            logger.debug("Successfully got text from Highlights paragraph element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Highlights paragraph element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Highlights link 1 element to become visible and get text
     *
     * @return text content from Highlights link 1 element
     */
    public String getHighlightsLink1() {

        try {

            logger.info("Waiting for Highlights link 1 element to become visible");
            WebElement highlightsLink1 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.xpath("//*[text()='Shop sun care deals']")));
            logger.debug("Highlights link 1 element is now visible");

            logger.info("Attempting to get text from Highlights link 1 element");
            String acquiredText = getTextFromElement(highlightsLink1);
            logger.debug("Successfully got text from Highlights link 1 element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Highlights link 1 element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Highlights link 1 element to be visible and click on element
     */
    public void clickHighlightsLink1() {

        try {

            logger.info("Waiting for Highlights link 1 element to be visible");
            WebElement highlightsLink1 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.xpath("//*[text()='Shop sun care deals']")));
            logger.debug("Highlights link 1 element is now visible");

            logger.info("Attempting to click on Highlights link 1 element");
            clickElement(highlightsLink1);
            logger.debug("Successfully clicked on Highlights link 1 element");

        } catch (TimeoutException e) {

            logger.error("Highlights link 1 element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for Highlights link 2 element to become visible and get text
     *
     * @return text content from Highlights link 2 element
     */
    public String getHighlightsLink2() {

        try {

            logger.info("Waiting for Highlights link 2 element to become visible");
            WebElement highlightsLink2 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.xpath("//*[text()='Explore sunscreen by skin type']")));
            logger.debug("Highlights link 2 element is now visible");

            logger.info("Attempting to get text from Highlights link 2 element");
            String acquiredText = getTextFromElement(highlightsLink2);
            logger.debug("Successfully got text from Highlights link 2 element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Highlights link 2 element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Highlights link 2 element to be visible and click on element
     */
    public void clickHighlightsLink2() {

        try {

            logger.info("Waiting for Highlights link 2 element to be visible");
            WebElement clickHighlightsLink2 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.xpath("//*[text()='Explore sunscreen by skin type']")));
            logger.debug("Highlights link 2 element is now visible");

            logger.info("Attempting to click on Highlights link 2 element");
            clickElement(clickHighlightsLink2);
            logger.debug("Successfully clicked on Highlights link 2 element");

        } catch (TimeoutException e) {

            logger.error("Highlights link 2 element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for Highlights mini card IMG element to be visible and extract css values from element
     */
    public void checkHighlightsMiniCardImage() {

        try {

            logger.info("Waiting for Highlights mini card IMG element to be visible");
            WebElement highlightsMiniCardIMG = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.cssSelector("img[src='https://www.cvs.com/content/dam/enterprise/cvsretail/homepage/hp00001/2025/wk22/summer-celebration.png?im=Resize=(393.6,367.76)']")));
            logger.debug("Highlights mini card IMG element is now visible");

            logger.info("Attempting to extract css values from Highlights mini card IMG element");
            String highlightsMiniCardIMG_Width = getCSSAttributes(highlightsMiniCardIMG,"width");
            String highlightsMiniCardIMG_Height = getCSSAttributes(highlightsMiniCardIMG,"Height");
            String highlightsMiniCardIMG_SRC = getCSSAttributes(highlightsMiniCardIMG,"src");
            System.out.println("Height: " + highlightsMiniCardIMG_Height);
            System.out.println("Width: " + highlightsMiniCardIMG_Width);
            System.out.println("SRC: " + highlightsMiniCardIMG_SRC);


        } catch (TimeoutException e) {

            logger.error("Highlights mini card IMG element was not visible within timeout");
            throw e;

        }

    }

    /**
     * Wait for Highlights mini card header element to become visible and get text
     *
     * @return text content from Highlights mini card header element
     */
    public String getHighlightsMiniCardHeader() {

        try {

            logger.info("Waiting for Highlights mini card header element to become visible ");
            WebElement highlightsMiniCardHeader = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.xpath("//*[text()='Let the summer celebration begin!']")));
            logger.debug("Highlights mini card header element is now visible");

            logger.info("Attempting to get text from Highlights mini card header element");
            String acquiredText = getTextFromElement(highlightsMiniCardHeader);
            logger.debug("Successfully got text from Highlights mini card header element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Highlights mini card header element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Highlights mini card link element to become visible and get text
     *
     * @return text content from Highlights mini card link element
     */
    public String getHighlightsMiniCardLinkText() {

        try {

            logger.info("Waiting for Highlights mini card link element to become visible ");
            WebElement highlightsMiniCardLink = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.xpath("//*[text()='Shop summer essentials']")));
            logger.debug("Highlights mini card link element is now visible");

            logger.info("Attempting to get text from Highlights mini card link element");
            String acquiredText = getTextFromElement(highlightsMiniCardLink);
            logger.debug("Successfully got text from Highlights mini card link element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Highlights mini card link element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for Highlights mini card link element to be visible and click on element
     */
    public void clickHighlightsMiniCardLink() {

        try {

            logger.info("Waiting for Highlights mini card link element to be visible");
            WebElement highlightsMiniCardLink = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(highlightsContainer, By.xpath("//a[@href='/shop/seasonal-shops/summer?icid=cvs-home-s3-l3-theme-fs-summer']")));
            logger.debug("Highlights mini card link element is now visible");

            logger.info("Attempting to click on Highlights mini card link element");
            clickElement(highlightsMiniCardLink);
            logger.debug("Successfully clicked on Highlights mini card link element");

        } catch (TimeoutException e) {

            logger.error("Highlights mini card link element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

}
