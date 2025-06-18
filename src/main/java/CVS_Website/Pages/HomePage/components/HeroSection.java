package CVS_Website.Pages.HomePage.components;

import CVS_Website.Pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class HeroSection extends BasePage {
    private static final Logger logger = LoggerFactory.getLogger(HeroSection.class);
    private WebElement heroSectionContainer;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param heroSectionContainer WebElement container for hero section
     * @param driver               WebDriver driver instance
     */
    public HeroSection(WebDriver driver, WebElement heroSectionContainer) {

        super(driver);
        this.heroSectionContainer = heroSectionContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    /**
     * Wait for hero section header element to become visible and get text
     *
     * @return text content from hero section header element
     */
    public String getHeroSectionHeader() {

        try {

            logger.info("Waiting for hero section header element to become visible");
            WebElement heroSectionHeader = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(heroSectionContainer, By.xpath("//*[@class='head1' and text()='Let’s make healthier happen together']")));
            logger.debug("Hero section header element is now visible");

            logger.info("Attempting to get text from hero section header element");
            String acquiredText = getTextFromElement(heroSectionHeader);
            logger.debug("Successfully got text from hero section header element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Hero section header element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for hero section link 1 element to become visible and get text
     *
     * @return text content from hero section link 1 element
     */
    public String getHeroSectionLink1() {

        try {

            logger.info("Waiting for hero section link 1 element to become visible ");
            WebElement heroSectionLink1Text = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(heroSectionContainer, By.xpath("//*[text()='Manage and refill prescriptions']")));
            logger.debug("Hero section link 1 element is now visible");

            logger.info("Attempting to get text from hero section link 1 element");
            String acquiredText = getTextFromElement(heroSectionLink1Text);
            logger.debug("Successfully got text from hero section link 1 element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Hero section link 1 element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for manage and refill prescription link element to be visible and click on element
     */
    public void clickManageAndRefillPrescriptionLink() {

        try {

            logger.info("Waiting for manage and refill prescription link element to be visible");
            WebElement manageAndRefillPrescriptionLink = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(heroSectionContainer, By.xpath("//*[text()='Manage and refill prescriptions']")));
            logger.debug("Manage and refill prescription link element is now visible");

            logger.info("Attempting to click on manage and refill prescription link element");
            clickElement(manageAndRefillPrescriptionLink);
            logger.debug("Successfully clicked on manage and refill prescription link element");

        } catch (TimeoutException e) {

            logger.error("manage and refill prescription link element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for hero section link 2 element to become visible and get text
     *
     * @return text content from element
     */
    public String getHeroSectionLink2() {

        try {

            logger.info("Waiting for hero section link 2 element to become visible ");
            WebElement heroSectionLink2Text = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(heroSectionContainer, By.xpath("//*[text()='Schedule vaccinations']")));
            logger.debug("Hero section link 2 element is now visible");

            logger.info("Attempting to get text from hero section link 2 element");
            String acquiredText = getTextFromElement(heroSectionLink2Text);
            logger.debug("Successfully got text from hero section link 2 element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Hero section link 2 element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for schedule vaccinations link element to be visible and click on element
     */
    public void clickScheduleVaccinationsLink() {

        try {

            logger.info("Waiting for schedule vaccinations link element to be visible");
            WebElement scheduleVaccinationsLink = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(heroSectionContainer, By.xpath("//*[text()='Schedule vaccinations']")));
            logger.debug("Schedule vaccinations link element is now visible");

            logger.info("Attempting to click on schedule vaccinations link element");
            clickElement(scheduleVaccinationsLink);
            logger.debug("Successfully clicked on schedule vaccinations link element");

        } catch (TimeoutException e) {

            logger.error("Schedule vaccinations link element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for hero section link 3 element to become visible and get text
     *
     * @return text content from hero section link 3 element
     */
    public String getHeroSectionLink3() {

        try {

            logger.info("Waiting for hero section link 3 element to become visible ");
            WebElement heroSectionLink3Text = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(heroSectionContainer, By.xpath("//*[text()='Schedule a MinuteClinic appointment']")));
            logger.debug("Element is now visible");

            logger.info("Attempting to get text from hero section link 3 element");
            String acquiredText = getTextFromElement(heroSectionLink3Text);
            logger.debug("Successfully got text from hero section link 3 element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Hero section link 3 element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for schedule minute clinic appointment link element to be visible and click on element
     */
    public void clickScheduleMinuteClinicAppointmentLink() {

        try {

            logger.info("Waiting for schedule minute clinic appointment link element to be visible");
            WebElement scheduleMinuteClinicAppointmentLink = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(heroSectionContainer, By.xpath("//*[text()='Schedule a MinuteClinic appointment']")));
            logger.debug("Schedule minute clinic appointment link element is now visible");

            logger.info("Attempting to click on schedule minute clinic appointment link element");
            clickElement(scheduleMinuteClinicAppointmentLink);
            logger.debug("Successfully clicked on schedule minute clinic appointment link element");

        } catch (TimeoutException e) {

            logger.error("Schedule minute clinic appointment link element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for hero section IMG element to be visible and extract css values from element
     */
    public void checkImage() {

        try {

            logger.info("Waiting for hero section IMG element to be visible");
            WebElement heroSectionIMG = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(heroSectionContainer, By.cssSelector("img[alt='Friends get food from a grill during a backyard barbecue.']")));
            logger.debug("Hero section IMG element is now visible");

            logger.info("Attempting to extract css values from hero section IMG element");
            imageCheckCSS(heroSectionContainer,"img[alt='Friends get food from a grill during a backyard barbecue.']");
            logger.debug("Successfully extracted css values from hero section IMG element");

        } catch (TimeoutException e) {

            logger.error("Hero section IMG element was not visible within timeout");
            throw e;

        }

    }

}
