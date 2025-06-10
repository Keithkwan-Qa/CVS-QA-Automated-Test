package UI_validation_testing;
import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.HomePage.components.*;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CVS_Homepage_UI_Validation extends UI_Validation_Test_Parent {

    private BasePage basePage;
    private CVS_Website.Pages.HomePage.components.Announcement announcement;
    private Wellness Wellness;
    private Commitment commitment;
    private HeroSection heroSection;
    private Highlights highlights;
    private HowWeSupportTheCommunitySlider howWeSupportTheCommunitySlider;

@Test(description = "Check the Announcement container for the correct text")

    public void checkAnnouncementContainerText(){

    Assert.assertEquals(announcement.getHeader(),"");
    Assert.assertEquals(announcement.getP1(),"");
    Assert.assertEquals(announcement.getP2(),"");
    Assert.assertEquals(announcement.getPhoneNumber(),"");
    logger.pass("Successfully checked Announcement container for visibility of elements and correct text");

}

    @Test(description = "Click on the link within the Announcement container and check if we landed on the correct page")

    public void clickAnnouncementContainerLink(){

        announcement.clickTransferOnline();
        logger.pass("Successfully clicked on Announcement container link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Check the hero section container for the correct text")

    public void checkHeroSectionContainerText(){

        Assert.assertEquals(heroSection.getHeroSectionHeader(),"");
        Assert.assertEquals(heroSection.getHeroSectionLink1(),"");
        Assert.assertEquals(heroSection.getHeroSectionLink2(),"");
        Assert.assertEquals(heroSection.getHeroSectionLink3(),"");
        logger.pass("Successfully checked hero section container for visibility of elements and correct text");

    }

    @Test(description = "Click on the hero section link 1 and check if we landed on the correct page")

    public void clickHeroSectionContainerLink1(){

        heroSection.clickManageAndRefillPrescriptionLink();
        logger.pass("Successfully clicked on hero section container link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Click on the hero section link 2 and check if we landed on the correct page")

    public void clickHeroSectionContainerLink2(){

        heroSection.clickScheduleVaccinationsLink();
        logger.pass("Successfully clicked on hero section container link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Click on the hero section link 3 and check if we landed on the correct page")

    public void clickHeroSectionContainerLink3(){

        heroSection.clickScheduleMinuteClinicAppointmentLink();
        logger.pass("Successfully clicked on hero section container link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Acquire css values for the hero section image")
    public void checkHeroSectionIMG(){

    heroSection.checkImage();
    logger.pass("Successfully returned CSS values for hero section IMG");

    }

    @Test(description = "Check the wellness header for the correct text")
    public void checkwellnessHeader() {

        try {
            String actualText = Wellness.getWellnessHeader();
            logger.pass("Successfully located wellness header");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated wellness header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Check the wellness shop all products link for the correct text")
    public void checkwellnessShopAllProductsText() {

        try {
            String actualText = Wellness.getShopAllProductsText();
            logger.pass("Successfully located wellness shop all products link");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated wellness header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Click on the wellness shop all products link and check if we landed on the correct page")

    public void clickWellnessShopAllProductsLink(){

        Wellness.clickShopAllProductsLink();
        logger.pass("Successfully clicked on wellness shop all products link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Check for visibility of wellness section icons")
    public void checkWellnessIcons() {

        try {
            Wellness.isHealthAndMedicineIconVisible();
            logger.pass("Successfully located health and medicine icon");
            Wellness.isVitaminsIconVisible();
            logger.pass("Successfully located vitamins icon");
            Wellness.isPersonalCareIconVisible();
            logger.pass("Successfully located personal care icon");
            Wellness.isShopWeeklyAdsIconVisible();
            logger.pass("Successfully located shop weekly ads icon");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Click on the wellness health and medicine link and check if we landed on the correct page")

    public void clickWellnessHealthAndMedicineLink(){

        Wellness.clickHealthAndMedicineLink();
        logger.pass("Successfully clicked on wellness health and medicine link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Click on the wellness vitamins link and check if we landed on the correct page")

    public void clickWellnessVitaminsLink(){

        Wellness.clickVitaminsLink();
        logger.pass("Successfully clicked on wellness vitamins link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Click on the wellness personal care link and check if we landed on the correct page")

    public void clickWellnessPersonalCareLink(){

        Wellness.clickPersonalCareLink();
        logger.pass("Successfully clicked on wellness health and medicine link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Click on the wellness shop weekly deals link and check if we landed on the correct page")

    public void clickWellnessShopWeeklyDealsLink(){

        Wellness.clickShopWeeklyDealsLink();
        logger.pass("Successfully clicked on wellness shop weekly deals link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Acquire css values for the Highlights section image")
    public void checkHighlightsIMG(){

        highlights.checkHighlightsImage();
        logger.pass("Successfully returned CSS values for Highlights section IMG");

    }

    @Test(description = "Check the Highlights header for the correct text")
    public void checkHighlightsHeader() {

        try {
            String actualText = highlights.getHighlightsHeader();
            logger.pass("Successfully located Highlights header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Highlights header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Check the Highlights sub header for the correct text")
    public void checkHighlightsSubHeaderText() {

        try {
            String actualText = highlights.getHighlightsSubHeader();
            logger.pass("Successfully located Highlights sub header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Highlights sub header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Check the Highlights paragraph for the correct text")
    public void checkHighlightsParagraphText() {

        try {
            String actualText = highlights.getHighlightsParagraph();
            logger.pass("Successfully located Highlights sub header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Highlights sub header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Check the Highlights link 1 for the correct text")
    public void checkHighlightsLink1Text() {

        try {
            String actualText = highlights.getHighlightsLink1();
            logger.pass("Successfully located Highlights sub header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Highlights sub header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Click on the Highlights link 1 and check if we landed on the correct page")

    public void clickHighlightsLink1(){

        highlights.clickHighlightsLink1();
        logger.pass("Successfully clicked on CTA shop weekly deals link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Check the Highlights link 2 for the correct text")
    public void checkHighlightsLink2Text() {

        try {
            String actualText = highlights.getHighlightsLink2();
            logger.pass("Successfully located Highlights sub header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Highlights sub header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Click on the Highlights link 2 and check if we landed on the correct page")

    public void clickHighlightsLink2(){

        highlights.clickHighlightsLink2();
        logger.pass("Successfully clicked on Highlights link 2");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Acquire css values for the Highlights mini card image")
    public void checkHighlightsMiniCardIMG(){

        highlights.checkHighlightsMiniCardImage();
        logger.pass("Successfully returned CSS values for Highlights section IMG");

    }

    @Test(description = "Check the Highlights mini card header for the correct text")
    public void checkHighlightsMiniCardHeader() {

        try {
            String actualText = highlights.getHighlightsMiniCardHeader();
            logger.pass("Successfully located Highlights header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Highlights header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Check the Highlights mini card link for the correct text")
    public void checkHighlightsMiniCardLinkText() {

        try {
            String actualText = highlights.getHighlightsMiniCardLinkText();
            logger.pass("Successfully located Highlights header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Highlights header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Click on the Highlights mini card link and check if we landed on the correct page")

    public void clickHighlightsMiniCardLink(){

        highlights.clickHighlightsMiniCardLink();
        logger.pass("Successfully clicked on Highlights mini card link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Acquire css values for the Commitment mini card 1 image")
    public void checkCommitmentMiniCard1IMG(){

        commitment.checkCommitmentMiniCard1Image();
        logger.pass("Successfully returned CSS values for Commitment mini card 1 IMG");

    }

    @Test(description = "Check the Commitment mini card 1 header for the correct text")
    public void checkCommitmentMiniCard1Header() {

        try {
            String actualText = commitment.getCommitmentMiniCard1Header();
            logger.pass("Successfully located Commitment mini card 1 text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Commitment mini card 1 text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Check the Commitment mini card 1 link for the correct text")
    public void checkCommitmentMiniCard1LinkText() {

        try {
            String actualText = commitment.getCommitmentMiniCard1LinkText();
            logger.pass("Successfully located Commitment mini card 1 header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Commitment mini card 1 text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Click on the Commitment mini card 1 link and check if we landed on the correct page")

    public void clickCommitmentMiniCard1Link(){

        commitment.clickCommitmentMiniCard1Link();
        logger.pass("Successfully clicked on Commitment mini card 1 link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Acquire css values for the Commitment mini card 2 image")
    public void checkCommitmentMiniCard2IMG(){

        commitment.checkCommitmentMiniCard2Image();
        logger.pass("Successfully returned CSS values for Commitment mini card 2 IMG");

    }

    @Test(description = "Check the Commitment mini card 2 header for the correct text")
    public void checkCommitmentMiniCard2Header() {

        try {
            String actualText = commitment.getCommitmentMiniCard2Header();
            logger.pass("Successfully located Commitment mini card 2 header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Commitment mini card 2 header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Check the Commitment mini card 2 link for the correct text")
    public void checkCommitmentMiniCard2LinkText() {

        try {
            String actualText = commitment.getCommitmentMiniCard2LinkText();
            logger.pass("Successfully located Commitment mini card 2 header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Commitment mini card 2 header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Click on the Commitment mini card 2 link and check if we landed on the correct page")

    public void clickCommitmentMiniCard2Link(){

        commitment.clickCommitmentMiniCard2Link();
        logger.pass("Successfully clicked on Commitment mini card 2 link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Acquire css values for the Commitment mini card 3 image")
    public void checkCommitmentMiniCard3IMG(){

        commitment.checkCommitmentMiniCard3Image();
        logger.pass("Successfully returned CSS values for Commitment mini card 3 IMG");

    }

    @Test(description = "Check the Commitment mini card 3 header for the correct text")
    public void checkCommitmentMiniCard3Header() {

        try {
            String actualText = commitment.getCommitmentMiniCard3Header();
            logger.pass("Successfully located Commitment mini card 3 header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Commitment mini card 3 header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Check the Commitment mini card 3 link for the correct text")
    public void checkCommitmentMiniCard3LinkText() {

        try {
            String actualText = commitment.getCommitmentMiniCard3LinkText();
            logger.pass("Successfully located Commitment mini card 3 header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated Commitment mini card 3 header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Click on the Commitment mini card 3 link and check if we landed on the correct page")

    public void clickCommitmentMiniCard3Link(){

        commitment.clickCommitmentMiniCard1Link();
        logger.pass("Successfully clicked on Commitment mini card 3 link");
        Assert.assertEquals(driver.get().getCurrentUrl(), "");
        logger.pass("Successfully arrived at correct page");

    }

    @Test(description = "Check the community slider header for the correct text")
    public void checkCommunitySliderHeader() {

        try {
            String actualText = howWeSupportTheCommunitySlider.getCommunitySliderSectionHeader();
            logger.pass("Successfully located community slider section header text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated community slider section header text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Check the community slider slide 1 for the correct text")
    public void checkCommunitySliderSlide1Text() {

        try {
            String actualText = howWeSupportTheCommunitySlider.getCommunitySliderSlide1Text();
            logger.pass("Successfully located community slider section slide 1 text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated community slider section slide 1 text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "")

    public void clickCommunitySliderArrows(){

        howWeSupportTheCommunitySlider.clickCommunitySliderRightArrowSlide1To2();
        logger.pass("Successfully clicked on community slider right arrow slide 1 To 2");
        howWeSupportTheCommunitySlider.clickCommunitySliderRightArrowSlide2To3();
        logger.pass("Successfully clicked on community slider right arrow slide 2 To 3");
        howWeSupportTheCommunitySlider.clickCommunitySliderRightArrowSlide3To4();
        logger.pass("Successfully clicked on community slider right arrow slide 3 To 4");
        howWeSupportTheCommunitySlider.clickCommunitySliderLeftArrowSlide4To3();
        logger.pass("Successfully clicked on community slider right arrow slide 4 To 3");
        howWeSupportTheCommunitySlider.clickCommunitySliderLeftArrowSlide3To2();
        logger.pass("Successfully clicked on community slider right arrow slide 3 To 2");
        howWeSupportTheCommunitySlider.clickCommunitySliderLeftArrowSlide2To1();
        logger.pass("Successfully clicked on community slider right arrow slide 2 To 1");
    }

    @Test(description = "Check the community slider slide 2 for the correct text")
    public void checkCommunitySliderSlide2Text() {

        try {
            String actualText = howWeSupportTheCommunitySlider.getCommunitySliderSlide2Text();
            logger.pass("Successfully located community slider section slide 1 text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated community slider section slide 1 text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Check the community slider slide 3 for the correct text")
    public void checkCommunitySliderSlide3Text() {

        try {
            String actualText = howWeSupportTheCommunitySlider.getCommunitySliderSlide3Text();
            logger.pass("Successfully located community slider section slide 1 text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated community slider section slide 1 text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

    @Test(description = "Check the community slider slide 4 for the correct text")
    public void checkCommunitySliderSlide4Text() {

        try {
            String actualText = howWeSupportTheCommunitySlider.getCommunitySliderSlide4Text();
            logger.pass("Successfully located community slider section slide 1 text");
            Assert.assertEquals(actualText,"");
            logger.pass("Successfully validated community slider section slide 1 text");

        } catch (TimeoutException e) {

            throw e;

        }

    }

}
