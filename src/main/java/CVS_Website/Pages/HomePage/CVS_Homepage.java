package CVS_Website.Pages.HomePage;

import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.HomePage.components.Announcement;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class CVS_Homepage extends BasePage {
    private static final Logger logger = LoggerFactory.getLogger(CVS_Homepage.class);
    private WebDriver driver;
    private WebDriverWait wait;
    private static final String pageURL = "https://www.cvs.com";


    /**
     * constructor to initialize page
     *
     * @param driver WebDriver driver instance
     */
    public CVS_Homepage(WebDriver driver) {

        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

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
