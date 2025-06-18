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

public class HowWeSupportTheCommunitySlider extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(HowWeSupportTheCommunitySlider.class);
    private WebElement sliderContainer;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param sliderContainer WebElement container for hero section
     * @param driver              WebDriver driver instance
     */
    public HowWeSupportTheCommunitySlider(WebDriver driver, WebElement sliderContainer) {

        super(driver);
        this.sliderContainer = sliderContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    /**
     * Wait for community slider section header element to become visible and get text
     *
     * @return text content from community slider section header element
     */
    public String getCommunitySliderSectionHeader() {

        try {

            logger.info("Waiting for community slider section header element to become visible ");
            WebElement communitySliderSectionHeader = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[text()='How we support our community']")));
            logger.debug("Community slider section header element is now visible");

            logger.info("Attempting to get text from community slider section header element");
            String acquiredText = getTextFromElement(communitySliderSectionHeader);
            logger.debug("Successfully got text from community slider section header element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Community slider section header element not found within timeout");
            throw e;

        }

    }

    /**
     * Negative test that should fail
     * Wait for community slider left arrow slide 1 element to be visible and click on element
     */
    public void clickCommunitySliderLeftArrowSlide1() {

        try {

            logger.info("Waiting for community slider left arrow slide 1 element to be visible");
            WebElement communitySliderLeftArrowSlide1 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[@class='arrow-label left']")));
            logger.debug("Community slider left arrow slide 1 element are now visible");

            logger.info("Attempting to click on community slider left arrow slide 1 element");
            clickElement(communitySliderLeftArrowSlide1);
            logger.debug("Successfully clicked on community slider left arrow slide 1 element");

        } catch (TimeoutException e) {

            logger.error("Community slider left arrow slide 1 element were not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for community slider slide 1 text element to become visible and get text
     *
     * @return text content from community slider slide 1 text element
     */
    public String getCommunitySliderSlide1Text() {

        try {

            logger.info("Waiting for community slider slide 1 text element to become visible ");
            WebElement communitySliderSlide1Text = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[text()='“I’m very impressed with MinuteClinic. I have already recommended it to multiple people.”']")));
            WebElement communitySliderSlide1Author = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[text()='— Christy K.']")));
            logger.debug("Community slider slide 1 text element is now visible");

            logger.info("Attempting to get text from community slider slide 1 text element");
            String acquiredText = getTextFromElement(communitySliderSlide1Text) + " " + getTextFromElement(communitySliderSlide1Author);
            logger.debug("Successfully got text from community slider slide 1 text element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Community slider slide 1 text element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for community slider right arrow slide 1 to 2 element to be visible and click on element
     */
    public void clickCommunitySliderRightArrowSlide1To2() {

        try {

            logger.info("Waiting for community slider right arrow slide 1 to 2 element to be visible");
            WebElement communitySliderRightArrowSlide1 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[@class='arrow-label right' and @for='slide2']")));
            logger.debug("Community slider right arrow slide 1 to 2 element are now visible");

            logger.info("Attempting to click on community slider right arrow slide 1 to 2 element");
            clickElement(communitySliderRightArrowSlide1);
            logger.debug("Successfully clicked on community slider right arrow slide 1 to 2 element");

        } catch (TimeoutException e) {

            logger.error("Community slider right arrow slide 1 to 2 element were not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for community slider slide 2 text element to become visible and get text
     *
     * @return text content from community slider slide 2 text element
     */
    public String getCommunitySliderSlide2Text() {

        try {

            logger.info("Waiting for community slider slide 2 text element to become visible ");
            WebElement communitySliderSlide2Text = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[text()='“Polly was fabulous! She helped me understand just how much I could save.”']")));
            WebElement communitySliderSlide2Author = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[text()='— Valued CVS customer']")));
            logger.debug("Community slider slide 2 text element is now visible");

            logger.info("Attempting to get text from community slider slide 2 text element");
            String acquiredText = getTextFromElement(communitySliderSlide2Text) + " " + getTextFromElement(communitySliderSlide2Author);
            logger.debug("Successfully got text from community slider slide 2 text element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Community slider slide 2 text element not found within timeout");
            throw e;

        }

    }

    /**
     * Wait for community slider right arrow slide 2 to 3 element to be visible and click on element
     */
    public void clickCommunitySliderRightArrowSlide2To3() {

        try {

            logger.info("Waiting for community slider right arrow slide 2 to 3 element to be visible");
            WebElement communitySliderRightArrowSlide2 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[@class='arrow-label right' and @for='slide3']")));
            logger.debug("Community slider right arrow slide 2 to 3 element are now visible");

            logger.info("Attempting to click on community slider right arrow slide 2 to 3 element");
            clickElement(communitySliderRightArrowSlide2);
            logger.debug("Successfully clicked on community slider right arrow slide 2 to 3 element");

        } catch (TimeoutException e) {

            logger.error("Community slider right arrow slide 2 to 3 element were not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for community slider slide 3 text element to become visible and get text
     *
     * @return text content from community slider slide 3 text element
     */
    public String getCommunitySliderSlide3Text() {

        try {

            logger.info("Waiting for community slider slide 3 text element to become visible ");
            WebElement communitySliderSlide3Text = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[text()='“CVS customer service is one of the biggest reasons I do so much shopping with you.”']")));
            WebElement communitySliderSlide3Author = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[text()='— Valued CVS customer']")));
            logger.debug("Community slider slide 3 text element is now visible");

            logger.info("Attempting to get text from community slider slide 3 text element");
            String acquiredText = getTextFromElement(communitySliderSlide3Text) + " " + getTextFromElement(communitySliderSlide3Author);
            logger.debug("Successfully got text from community slider slide 3 text element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Community slider slide 3 text element not found within timeout");
            throw e;

        }

    }
    //leave in a little error to engage viewers to find^( the xpath text value actually has two indexes and we are calling the incorrect one for this card)

    /**
     * Wait for community slider right arrow slide 3 to 4 element to be visible and click on element
     */
    public void clickCommunitySliderRightArrowSlide3To4() {

        try {

            logger.info("Waiting for community slider right arrow slide 3 to 4 element to be visible");
            WebElement communitySliderRightArrowSlide3To4 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[@class='arrow-label right' and @for='slide4']")));
            logger.debug("Community slider right arrow slide 3 to 4 element are now visible");

            logger.info("Attempting to click on community slider right arrow slide 3 to 4 element");
            clickElement(communitySliderRightArrowSlide3To4);
            logger.debug("Successfully clicked on community slider right arrow slide 3 to 4 element");

        } catch (TimeoutException e) {

            logger.error("Community slider right arrow slide 3 to 4 element were not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for community slider slide 4 text element to become visible and get text
     *
     * @return text content from element
     */
    public String getCommunitySliderSlide4Text() {

        try {

            logger.info("Waiting for community slider slide 4 text element to become visible ");
            WebElement communitySliderSlide4Text = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[text()='“My pharmacist went above and beyond. I hope she stays at this CVS Pharmacy location.”']")));
            WebElement communitySliderSlide4Author = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[text()='— Juanita K.']")));
            logger.debug("Community slider slide 4 text element is now visible");

            logger.info("Attempting to get text from community slider slide 4 text element");
            String acquiredText = getTextFromElement(communitySliderSlide4Text) + " " + getTextFromElement(communitySliderSlide4Author);
            logger.debug("Successfully got text from community slider slide 4 text element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Community slider slide 4 text element not found within timeout");
            throw e;

        }

    }

    /**
     * Check for community slider right arrow slide 4 element to be visible and click on element
     */
    public void clickCommunitySliderRightArrowSlide4() {

        try {

            logger.info("Waiting for community slider right arrow slide 4 element to be visible");
            WebElement communitySliderRightArrowSlide4 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[@class='arrow-label right' and @for='slide4']")));
            logger.debug("Community slider right arrow slide 4 elements are now visible");

            logger.info("Attempting to click on community slider right arrow slide 4 element");
            clickElement(communitySliderRightArrowSlide4);
            logger.debug("Successfully clicked on community slider right arrow slide 4 element");

        } catch (TimeoutException e) {

            logger.error("Community slider right arrow slide 4 element were not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for community slider left arrow slide 4 to 3 element to be visible and click on element
     */
    public void clickCommunitySliderLeftArrowSlide4To3() {

        try {

            logger.info("Waiting for community slider left arrow slide 4 to 3 element to be visible");
            WebElement communitySliderLeftArrowSlide3 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[@class='arrow-label left' and @for='slide3']")));
            logger.debug("Community slider left arrow slide 4 to 3 element are now visible");

            logger.info("Attempting to click on community slider left arrow slide 4 to 3 element");
            clickElement(communitySliderLeftArrowSlide3);
            logger.debug("Successfully clicked on community slider left arrow slide 4 to 3 element");

        } catch (TimeoutException e) {

            logger.error("Community slider left arrow slide 4 to 3 element were not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for community slider left arrow slide 3 to 2 element to be visible and click on element
     */
    public void clickCommunitySliderLeftArrowSlide3To2() {

        try {

            logger.info("Waiting for community slider left arrow slide 3 to 2 element to be visible");
            WebElement communitySliderLeftArrowSlide2 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[@class='arrow-label left' and @for='slide2']")));
            logger.debug("Community slider left arrow slide 3 to 2 element are now visible");

            logger.info("Attempting to click on community slider left arrow slide 3 to 2 element");
            clickElement(communitySliderLeftArrowSlide2);
            logger.debug("Successfully clicked on community slider left arrow slide 3 to 2 element");

        } catch (TimeoutException e) {

            logger.error("Community slider left arrow slide 3 to 2 element were not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for community slider left arrow slide 1 element to be visible and click on element
     */
    public void clickCommunitySliderLeftArrowSlide2To1() {

        try {

            logger.info("Waiting for community slider left arrow slide 1 element to be visible");
            WebElement communitySliderLeftArrowSlide1 = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(sliderContainer, By.xpath("//*[@class='arrow-label left' and @for='slide1']")));
            logger.debug("Community slider left arrow slide 1 element are now visible");

            logger.info("Attempting to click on community slider left arrow slide 1 element");
            clickElement(communitySliderLeftArrowSlide1);
            logger.debug("Successfully clicked on community slider left arrow slide 1 element");

        } catch (TimeoutException e) {

            logger.error("Community slider left arrow slide 1 element were not visible and could not be clicked on within timeout");
            throw e;

        }

    }

}

