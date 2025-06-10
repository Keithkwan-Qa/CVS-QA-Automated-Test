package CVS_Website.Pages.HomePage;

import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.HomePage.components.Announcement;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class CVS_Homepage extends BasePage {
    private static final Logger logger = LoggerFactory.getLogger(Announcement.class);
    private WebElement sliderContainer;
    private WebDriver driver;
    private WebDriverWait wait;
    private static final String pageURL = "https://www.cvs.com";


    /**
     * constructor to initialize page
     *
     * @param sliderContainer WebElement container for hero section
     * @param driver          WebDriver driver instance
     */
    public CVS_Homepage(WebDriver driver, WebElement sliderContainer) {

        super(driver);
        this.sliderContainer = sliderContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }


    //Announcement section
    @FindBy(css = "div[class='bnts-637 aem-ssr-web-content_container__JJecC']")
    private WebElement announcementContainer;

    //hero section
    @FindBy(css = "div[class='hero-section']")
    private WebElement heroSectionContainer;


    //wellness section
    @FindBy(css = "div[class='wellness-sec']")
    private WebElement wellnessContainer;

    //Highlights section
    @FindBy(css = "div[class='Highlights']")
    private WebElement highlightsContainer;

    //Commitment section
    @FindBy(css = "div[class='commitments']")
    private WebElement commitmentContainer;

    //How we support the community section
    @FindBy(css = "div[class='slider-sec']")
    private WebElement communitySliderContainer;


    /**
     * Wait for Announcement container to become visible and scroll into element
     */
    public void scrollToAnnouncementContainer() {

        try {

            logger.info("Attempting to scroll into the Announcement container");
            scrollIntoElement(announcementContainer);
            logger.debug("Successfully scrolled into Announcement container");

        } catch (TimeoutException e) {

            logger.error("Unable to scroll into Announcement container");
            throw e;

        }

    }

    /**
     * Wait for hero section container to become visible and scroll into element
     */
    public void scrollToHeroSectionContainer() {

        try {

            logger.info("Attempting to scroll into the Announcement container");
            scrollIntoElement(heroSectionContainer);
            logger.debug("Successfully scrolled into Announcement container");

        } catch (TimeoutException e) {

            logger.error("Unable to scroll into Announcement container");
            throw e;

        }

    }

    /**
     * Wait for wellness container to become visible and scroll into element
     */
    public void scrollToWellnessContainer() {

        try {

            logger.info("Attempting to scroll into the wellness container");
            scrollIntoElement(wellnessContainer);
            logger.debug("Successfully scrolled into wellness container");

        } catch (TimeoutException e) {

            logger.error("Unable to scroll into wellness container");
            throw e;

        }

    }

    /**
     * Wait for Highlights container to become visible and scroll into element
     */
    public void scrollToHighlightsContainer() {

        try {

            logger.info("Attempting to scroll into the Highlights container");
            scrollIntoElement(highlightsContainer);
            logger.debug("Successfully scrolled into Highlights container");

        } catch (TimeoutException e) {

            logger.error("Unable to scroll into Highlights container");
            throw e;

        }

    }

    /**
     * Wait for Commitment container to become visible and scroll into element
     */
    public void scrollToCommitmentContainer() {

        try {

            logger.info("Attempting to scroll into the Commitment container");
            scrollIntoElement(commitmentContainer);
            logger.debug("Successfully scrolled into Commitment container");

        } catch (TimeoutException e) {

            logger.error("Unable to scroll into Commitment container");
            throw e;

        }

    }

    /**
     * Wait for Commitment container to become visible and scroll into element
     */
    public void scrollToCommunitySliderContainer() {

        try {

            logger.info("Attempting to scroll into the community slider container");
            scrollIntoElement(communitySliderContainer);
            logger.debug("Successfully scrolled into community slider container");

        } catch (TimeoutException e) {

            logger.error("Unable to scroll into community slider container");
            throw e;

        }

    }

}
//the headers are dropdown menus
//the quick links each kind of  do serve their own behaviour-probably better to have each independently identified rather than using a list
//for icons i can validate ui by checking if it's visible, checking accessibility through it's alt text, and get the color; size; and font

//add this to the page when applicable :logger.info("Attempting to scroll to element");
//            jse.executeScript("arguments[0],scrollIntoView(true);",heroSectionHeader);
//            logger.debug("Successfully scrolled to element");