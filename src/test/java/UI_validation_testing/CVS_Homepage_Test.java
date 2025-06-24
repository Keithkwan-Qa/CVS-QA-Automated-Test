package UI_validation_testing;

import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.HomePage.CVS_Homepage;
import CVS_Website.Pages.HomePage.components.*;
import org.openqa.selenium.TimeoutException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CVS_Homepage_Test extends Test_Parent {

    private CVS_Homepage cvs_homepage;
    private SoftAssert soft = new SoftAssert();

    @BeforeClass

    public void pageInit() {

        cvs_homepage = new CVS_Homepage(getDriver());

    }

    @Test(description = "Check the Announcement container for the correct text")

    public void checkAnnouncementContainerText() {

        try {

            cvs_homepage.scrollToAnnouncementContainer();
            soft.assertEquals(cvs_homepage.getAnnouncementHeader(), "");
            logger.info("Checked announcement header: " + cvs_homepage.getAnnouncementHeader());
            soft.assertEquals(cvs_homepage.getAnnouncementP1(), "");
            logger.info("Checked announcement P1: " + cvs_homepage.getAnnouncementP1());
            soft.assertEquals(cvs_homepage.getAnnouncementP2(), "");
            logger.info("Checked announcement P2: " + cvs_homepage.getAnnouncementP2());
            soft.assertEquals(cvs_homepage.getAnnouncementPhoneNumber(), "");
            logger.info("Checked announcement phone number: " + cvs_homepage.getAnnouncementPhoneNumber());

            logger.pass("Successfully checked Announcement container for visibility of elements and correct text");

        } catch (AssertionError e) {
            logger.fail("Assertion of announcement section text failed: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the link within the Announcement container and check if we landed on the correct page")

    public void clickAnnouncementContainerLink() {

        try {

            cvs_homepage.clickAnnouncementLink();
            logger.info("Clicked on Announcement container link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking if landed on the correct page");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate announcement section link within timeout or incorrect URL: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the hero section container for the correct text")

    public void checkHeroSectionContainerText() {

        try {

            soft.assertEquals(cvs_homepage.getHeroSectionHeader(), "");
            logger.info("Checked hero section header: " + cvs_homepage.getHeroSectionHeader());
            soft.assertEquals(cvs_homepage.getHeroSectionLink1(), "");
            logger.info("Checked hero section link 1: " + cvs_homepage.getHeroSectionLink1());
            soft.assertEquals(cvs_homepage.getHeroSectionLink2(), "");
            logger.info("Checked hero section link 2: " + cvs_homepage.getHeroSectionLink2());
            soft.assertEquals(cvs_homepage.getHeroSectionLink3(), "");
            logger.info("Checked hero section link 3: " + cvs_homepage.getHeroSectionLink3());

            logger.pass("Successfully checked hero section container for visibility of elements and correct text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate hero section text within timeout or incorrect text values displayed: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the hero section link 1 and check if we landed on the correct page")

    public void clickHeroSectionContainerLink1() {

        try {

            cvs_homepage.clickHeroSectionLink1();
            logger.info("Clicked on hero section container link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate hero section link 1 within timeout or incorrect URL: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the hero section link 2 and check if we landed on the correct page")

    public void clickHeroSectionContainerLink2() {

        try {

            cvs_homepage.clickHeroSectionLink2();
            logger.info("Clicked on hero section container link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate hero section link 2 within timeout or incorrect URL: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the hero section link 3 and check if we landed on the correct page")

    public void clickHeroSectionContainerLink3() {

        try {

            cvs_homepage.clickHeroSectionLink3();
            logger.info("Clicked on hero section container link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate hero section link 3 within timeout or incorrect URL: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Acquire css values for the hero section image")
    public void checkHeroSectionIMG() {

        try {

            cvs_homepage.checkHeroSectionIMG();
            logger.info("Grabbing hero section IMG css values");

            logger.pass("Successfully returned CSS values for hero section IMG");

        } catch (TimeoutException e) {

            logger.fail("Could not locate hero section IMG within timeout or incorrect values: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the wellness section header for the correct text")
    public void checkwellnessHeader() {

        try {

            String actualText = cvs_homepage.getWellnessSectionHeader();
            logger.info("Locating wellness header");

            soft.assertEquals(actualText, "");
            logger.info("Checking text from wellness section header");

            logger.pass("Successfully validated wellness section header text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate wellness section header within timeout or incorrect values: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the wellness shop all products link for the correct text")
    public void checkwellnessShopAllProductsText() {

        try {

            String actualText = cvs_homepage.getShopAllProductsText();
            logger.info("Locating wellness shop all products link");

            soft.assertEquals(actualText, "");
            logger.info("Checking text from wellness shop all products link");

            logger.pass("Successfully validated wellness shop all product link text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate wellness shop all products link within timeout or incorrect values: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the wellness shop all products link and check if we landed on the correct page")
    public void clickWellnessShopAllProductsLink() {

        try {

            cvs_homepage.clickShopAllProductsLink();
            logger.info("Clicking on wellness shop all products link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate wellness shop all products link within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check for visibility of wellness section icons")
    public void checkWellnessIcons() {

        try {
            cvs_homepage.healthandMedicineIconVisibility();
            logger.info("Locating health and medicine icon");

            cvs_homepage.vitaminsIconVisibility();
            logger.info("Locating vitamins icon");

            cvs_homepage.personalCareIconVisibility();
            logger.info("Locating personal care icon");

            cvs_homepage.shopWeeklyAdsIconVisibility();
            logger.info("Locating shop weekly ads icon");

            logger.pass("Successfully located all wellness section icons");

        } catch (TimeoutException e) {

            logger.fail("Could not locate wellness section icons within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the wellness health and medicine link and check if we landed on the correct page")

    public void clickWellnessHealthAndMedicineLink() {

        try {

            cvs_homepage.clickHealthAndMedicineLink();
            logger.info("Successfully clicked on wellness health and medicine link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate wellness health and medicine link within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the wellness vitamins link and check if we landed on the correct page")

    public void clickWellnessVitaminsLink() {

        try {

            cvs_homepage.clickVitaminsLink();
            logger.info("Clicking on wellness vitamins link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate wellness vitamins link within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the wellness personal care link and check if we landed on the correct page")

    public void clickWellnessPersonalCareLink() {

        try {

            cvs_homepage.clickPersonalCareLink();
            logger.info("Clicking on wellness personal care link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate wellness personal care link within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the wellness shop weekly deals link and check if we landed on the correct page")

    public void clickWellnessShopWeeklyDealsLink() {

        try {

            cvs_homepage.clickShopWeeklyAdsIconLink();
            logger.info("Clicking on wellness shop weekly deals link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate wellness shop weekly deals link within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Acquire css values for the highlights section image")
    public void checkHighlightsIMG() {

        try {

            cvs_homepage.checkHighlightsIMG();
            logger.info("Grabbing highlights section IMG css values");

            logger.pass("Successfully returned CSS values for highlights section IMG");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights section IMG within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the highlights header for the correct text")
    public void checkHighlightsHeader() {

        try {

            String actualText = cvs_homepage.getHighlightsHeaderText();
            logger.info("Locating highlights header text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated highlights header text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights section IMG within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the highlights sub header for the correct text")
    public void checkHighlightsSubHeaderText() {

        try {

            String actualText = cvs_homepage.getHighlightsSubHeaderText();
            logger.info("Locating highlights sub header text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated highlights sub header text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights sub header within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the highlights paragraph for the correct text")
    public void checkHighlightsParagraphText() {

        try {

            String actualText = cvs_homepage.getHighlightsParagraphText();
            logger.info("Locating highlights paragraph text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated highlights paragraph text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights paragraph text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the highlights link 1 for the correct text")
    public void checkHighlightsLink1Text() {

        try {

            String actualText = cvs_homepage.getHighlightsLink1Text();
            logger.info("Locating highlights link 1 text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated highlights link 1 text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights link 1 text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the highlights link 1 and check if we landed on the correct page")

    public void clickHighlightsLink1() {

        try {

            cvs_homepage.clickHighlightsLink1();
            logger.info("Clicking on highlights link 1");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights link 1 within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the highlights link 2 for the correct text")
    public void checkHighlightsLink2Text() {

        try {

            String actualText = cvs_homepage.getHighlightsLink2Text();
            logger.info("Successfully located highlights link 2 text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated highlights link 2 text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights link 2 within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the Highlights link 2 and check if we landed on the correct page")

    public void clickHighlightsLink2() {
        try {

            cvs_homepage.clickHighlightsLink2();
            logger.info("Clicking on Highlights link 2");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights link 2 within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Acquire css values for the highlights mini card image")
    public void checkHighlightsMiniCardIMG() {

        try {

            cvs_homepage.checkHighlightsMiniCardIMG();
            logger.info("Grabbing highlights mini card IMG css values");

            logger.pass("Successfully returned CSS values for highlights mini card IMG");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights mini card IMG within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the Highlights mini card header for the correct text")
    public void checkHighlightsMiniCardHeader() {

        try {
            String actualText = cvs_homepage.getHighlightsMiniCardHeaderText();
            logger.info("Locating highlights mini card header text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated highlights mini card header text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights mini card header text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the highlights mini card link for the correct text")
    public void checkHighlightsMiniCardLinkText() {

        try {
            String actualText = cvs_homepage.getHighlightsMiniCardLinkText();
            logger.pass("Locating highlights mini card link text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated highlights mini card link text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights mini card link text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the highlights mini card link and check if we landed on the correct page")

    public void clickHighlightsMiniCardLink() {

        try {

            cvs_homepage.clickHighlightsMiniCardLink();
            logger.info("Successfully clicked on highlights mini card link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate highlights mini card link within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Acquire css values for the Commitment mini card 1 image")
    public void checkCommitmentMiniCard1IMG() {

        try {

            cvs_homepage.checkCommitmentMiniCard1Image();
            logger.info("Grabbing commitment mini card 1 IMG css values");

            logger.pass("Successfully returned CSS values for Commitment mini card 1 IMG");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 1 IMG within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the commitment mini card 1 header for the correct text")
    public void checkCommitmentMiniCard1Header() {

        try {
            String actualText = cvs_homepage.getCommitmentMiniCard1Header();
            logger.info("Locating commitment mini card 1 header text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated commitment mini card 1 header text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 1 header text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the commitment mini card 1 link for the correct text")
    public void checkCommitmentMiniCard1LinkText() {

        try {
            String actualText = cvs_homepage.getCommitmentMiniCard1LinkText();
            logger.info("Locating commitment mini card 1 link text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated commitment mini card 1 link text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 1 link text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the commitment mini card 1 link and check if we landed on the correct page")

    public void clickCommitmentMiniCard1Link() {

        try {

            cvs_homepage.clickCommitmentMiniCard1Link();
            logger.info("Clicking on commitment mini card 1 link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 1 link within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Acquire css values for the commitment mini card 2 image")
    public void checkCommitmentMiniCard2IMG() {

        try {

            cvs_homepage.checkCommitmentMiniCard2Image();
            logger.info("Grabbing commitment mini card 2 IMG css values");

            logger.pass("Successfully returned CSS values for commitment mini card 2 IMG");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 2 image within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the commitment mini card 2 header for the correct text")
    public void checkCommitmentMiniCard2Header() {

        try {

            String actualText = cvs_homepage.getCommitmentMiniCard2Header();
            logger.info("Locating commitment mini card 2 header text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated commitment mini card 2 header text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 2 header text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the commitment mini card 2 link for the correct text")
    public void checkCommitmentMiniCard2LinkText() {

        try {

            String actualText = cvs_homepage.getCommitmentMiniCard2LinkText();
            logger.info("Locating commitment mini card 2 link text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated commitment mini card 2 link text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 2 link text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the commitment mini card 2 link and check if we landed on the correct page")

    public void clickCommitmentMiniCard2Link() {

        try {

            cvs_homepage.clickCommitmentMiniCard2Link();
            logger.info("Successfully clicked on commitment mini card 2 link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 2 link within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Acquire css values for the commitment mini card 3 image")
    public void checkCommitmentMiniCard3IMG() {

        try {

            cvs_homepage.checkCommitmentMiniCard3Image();
            logger.info("Grabbing commitment mini card 3 IMG css values");

            logger.pass("Successfully returned CSS values for commitment mini card 3 IMG");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 3 image within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the commitment mini card 3 header for the correct text")
    public void checkCommitmentMiniCard3Header() {

        try {

            String actualText = cvs_homepage.getCommitmentMiniCard3Header();
            logger.info("Locating commitment mini card 3 header text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated commitment mini card 3 header text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 3 header within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the commitment mini card 3 link for the correct text")
    public void checkCommitmentMiniCard3LinkText() {

        try {

            String actualText = cvs_homepage.getCommitmentMiniCard3LinkText();
            logger.info("Locating commitment mini card 3 link text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated commitment mini card 3 link text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 3 link text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Click on the commitment mini card 3 link and check if we landed on the correct page")

    public void clickCommitmentMiniCard3Link() {

        try {

            cvs_homepage.clickCommitmentMiniCard3Link();
            logger.info("Successfully clicked on commitment mini card 3 link");

            soft.assertEquals(driver.get().getCurrentUrl(), "");
            logger.info("Checking for correct URL");

            logger.pass("Successfully arrived at correct page");

        } catch (TimeoutException e) {

            logger.fail("Could not locate commitment mini card 3 link within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the community slider header for the correct text")
    public void checkCommunitySliderHeader() {

        try {

            String actualText = cvs_homepage.getCommunitySliderHeaderText();
            logger.info("Locating community slider section header text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated community slider section header text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate community slider header within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the community slider slide 1 for the correct text")
    public void checkCommunitySliderSlide1Text() {

        try {

            String actualText = cvs_homepage.getCommunitySliderSlide1Text();
            logger.pass("Locating community slider section slide 1 text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated community slider section slide 1 text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate community slider slide 1 text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "click through all slides from right to left to validate functionality")

    public void clickCommunitySliderArrows() {

        try {

            cvs_homepage.clickCommunitySliderRightArrowSlide1To2();
            logger.info("Clicking on community slider right arrow slide 1 To 2");

            cvs_homepage.clickCommunitySliderRightArrowSlide2To3();
            logger.info("Clicking on community slider right arrow slide 2 To 3");

            cvs_homepage.clickCommunitySliderRightArrowSlide3To4();
            logger.info("Clicking on community slider right arrow slide 3 To 4");

            cvs_homepage.clickCommunitySliderLeftArrowSlide4To3();
            logger.info("Clicking on community slider right arrow slide 4 To 3");

            cvs_homepage.clickCommunitySliderLeftArrowSlide3To2();
            logger.info("Clicking on community slider right arrow slide 3 To 2");

            cvs_homepage.clickCommunitySliderLeftArrowSlide2To1();
            logger.info("Clicking on community slider right arrow slide 2 To 1");

            logger.pass("Successfully clicked through all slides from right to left");

        } catch (TimeoutException e) {

            logger.fail("Could not locate community slider right arrow button within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the community slider slide 2 for the correct text")
    public void checkCommunitySliderSlide2Text() {

        try {

            String actualText = cvs_homepage.getCommunitySliderSlide2Text();
            logger.info("Locating community slider section slide 1 text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated community slider section slide 1 text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate community slider slide 2 text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the community slider slide 3 for the correct text")
    public void checkCommunitySliderSlide3Text() {

        try {

            String actualText = cvs_homepage.getCommunitySliderSlide3Text();
            logger.info("Locating community slider section slide 1 text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated community slider section slide 1 text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate community slider slide 3 text within timeout: " + e.getMessage());
            throw e;

        }

    }

    @Test(description = "Check the community slider slide 4 for the correct text")
    public void checkCommunitySliderSlide4Text() {

        try {

            String actualText = cvs_homepage.getCommunitySliderSlide4Text();
            logger.info("Locating community slider section slide 1 text");

            soft.assertEquals(actualText, "");
            logger.info("Checking for correct text");

            logger.pass("Successfully validated community slider section slide 1 text");

        } catch (TimeoutException e) {

            logger.fail("Could not locate community slider slide 4 text within timeout: " + e.getMessage());
            throw e;

        }

    }

}
