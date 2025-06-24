package CVS_Website.Pages.HomePage;

import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.HomePage.components.*;
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
    private BasePage basePage;
    private Announcement announcement;
    private Wellness wellness;
    private Commitment commitment;
    private HeroSection heroSection;
    private Highlights highlights;
    private HowWeSupportTheCommunitySlider howWeSupportTheCommunitySlider;
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
        this.announcement = new Announcement(driver, announcementContainer);
        this.heroSection = new HeroSection(driver, heroSectionContainer);
        this.wellness = new Wellness(driver, wellnessContainer);
        this.commitment = new Commitment(driver, commitmentContainer);
        this.highlights = new Highlights(driver, highlightsContainer);
        this.howWeSupportTheCommunitySlider = new HowWeSupportTheCommunitySlider(driver, communitySliderContainer);

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

    public String getAnnouncementHeader() {

        return announcement.getHeader();

    }

    public String getAnnouncementP1() {

        return announcement.getP1();
    }

    public String getAnnouncementP2() {

        return announcement.getP2();
    }

    public String getAnnouncementPhoneNumber() {

        return announcement.getPhoneNumber();
    }
    public void clickAnnouncementLink() {

        announcement.clickTransferOnline();

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

    public String getHeroSectionHeader() {

        return heroSection.getHeroSectionHeader();

    }

    public String getHeroSectionLink1() {

        return heroSection.getHeroSectionLink1();

    }

    public void clickHeroSectionLink1() {

        heroSection.clickManageAndRefillPrescriptionLink();

    }

    public String getHeroSectionLink2() {

        return heroSection.getHeroSectionLink2();

    }

    public void clickHeroSectionLink2() {

        heroSection.clickScheduleVaccinationsLink();

    }

    public String getHeroSectionLink3() {

        return heroSection.getHeroSectionLink3();

    }

    public void clickHeroSectionLink3() {

        heroSection.clickScheduleMinuteClinicAppointmentLink();

    }

    public void checkHeroSectionIMG() {

        heroSection.checkImage();

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

    public String getWellnessSectionHeader() {

        return wellness.getWellnessHeader();

    }

    public boolean healthandMedicineIconVisibility() {

        return wellness.isHealthAndMedicineIconVisible();

    }

    public void clickHealthAndMedicineLink() {

        wellness.clickHealthAndMedicineLink();

    }

    public boolean vitaminsIconVisibility() {

        return wellness.isVitaminsIconVisible();

    }

    public void clickVitaminsLink() {

        wellness.clickVitaminsLink();

    }
    public boolean personalCareIconVisibility() {

        return wellness.isPersonalCareIconVisible();

    }

    public void clickPersonalCareLink() {

        wellness.clickPersonalCareLink();

    }
    public boolean shopWeeklyAdsIconVisibility() {

        return wellness.isShopWeeklyAdsIconVisible();

    }

    public void clickShopWeeklyAdsIconLink() {

        wellness.clickShopWeeklyDealsLink();

    }

    public String getShopAllProductsText() {

        return wellness.getShopAllProductsText();

    }

    public void clickShopAllProductsLink() {

        wellness.clickShopAllProductsLink();

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

    public String getHighlightsHeaderText() {

        return highlights.getHighlightsHeader();

    }

    public void checkHighlightsIMG() {

        highlights.checkHighlightsImage();

    }

    public String getHighlightsSubHeaderText() {

        return highlights.getHighlightsSubHeader();

    }

    public String getHighlightsParagraphText() {

        return highlights.getHighlightsParagraph();

    }

    public String getHighlightsLink1Text() {

        return highlights.getHighlightsLink1();

    }

    public void clickHighlightsLink1() {

        highlights.clickHighlightsLink1();

    }

    public String getHighlightsLink2Text() {

        return highlights.getHighlightsLink2();

    }

    public void clickHighlightsLink2() {

        highlights.clickHighlightsLink2();

    }

    public void checkHighlightsMiniCardIMG() {

        highlights.checkHighlightsMiniCardImage();

    }

    public String getHighlightsMiniCardHeaderText() {

        return highlights.getHighlightsMiniCardHeader();

    }

    public String getHighlightsMiniCardLinkText() {

        return highlights.getHighlightsMiniCardLinkText();

    }

    public void clickHighlightsMiniCardLink() {

        highlights.clickHighlightsMiniCardLink();

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

    public void checkCommitmentMiniCard1Image() {

        commitment.checkCommitmentMiniCard1Image();

    }

    public String getCommitmentMiniCard1Header() {

        return commitment.getCommitmentMiniCard1Header();

    }

    public String getCommitmentMiniCard1LinkText() {

        return commitment.getCommitmentMiniCard1LinkText();

    }

    public void clickCommitmentMiniCard1Link() {

        commitment.clickCommitmentMiniCard1Link();

    }

    public void checkCommitmentMiniCard2Image() {

        commitment.checkCommitmentMiniCard2Image();

    }

    public String getCommitmentMiniCard2Header() {

        return commitment.getCommitmentMiniCard2Header();

    }

    public String getCommitmentMiniCard2LinkText() {

        return commitment.getCommitmentMiniCard2LinkText();

    }

    public void clickCommitmentMiniCard2Link() {

        commitment.clickCommitmentMiniCard2Link();

    }

    public void checkCommitmentMiniCard3Image() {

        commitment.checkCommitmentMiniCard3Image();

    }

    public String getCommitmentMiniCard3Header() {

        return commitment.getCommitmentMiniCard3Header();

    }

    public String getCommitmentMiniCard3LinkText() {

        return commitment.getCommitmentMiniCard3LinkText();

    }

    public void clickCommitmentMiniCard3Link() {

        commitment.clickCommitmentMiniCard3Link();

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

    public String getCommunitySliderHeaderText() {

        return howWeSupportTheCommunitySlider.getCommunitySliderSectionHeader();

    }

    public String getCommunitySliderSlide1Text() {

        return howWeSupportTheCommunitySlider.getCommunitySliderSlide1Text();

    }

    public void clickCommunitySliderRightArrowSlide1To2() {

        howWeSupportTheCommunitySlider.clickCommunitySliderRightArrowSlide1To2();

    }
    public String getCommunitySliderSlide2Text() {

        return howWeSupportTheCommunitySlider.getCommunitySliderSlide2Text();

    }

    public void clickCommunitySliderRightArrowSlide2To3() {

        howWeSupportTheCommunitySlider.clickCommunitySliderRightArrowSlide2To3();

    }
    public String getCommunitySliderSlide3Text() {

        return howWeSupportTheCommunitySlider.getCommunitySliderSlide3Text();

    }

    public void clickCommunitySliderRightArrowSlide3To4() {

        howWeSupportTheCommunitySlider.clickCommunitySliderRightArrowSlide3To4();

    }
    public String getCommunitySliderSlide4Text() {

        return howWeSupportTheCommunitySlider.getCommunitySliderSlide4Text();

    }

    public void clickCommunitySliderLeftArrowSlide4To3() {

        howWeSupportTheCommunitySlider.clickCommunitySliderLeftArrowSlide4To3();

    }

    public void clickCommunitySliderLeftArrowSlide3To2() {

        howWeSupportTheCommunitySlider.clickCommunitySliderLeftArrowSlide3To2();

    }

    public void clickCommunitySliderLeftArrowSlide2To1() {

        howWeSupportTheCommunitySlider.clickCommunitySliderLeftArrowSlide2To1();

    }

}
