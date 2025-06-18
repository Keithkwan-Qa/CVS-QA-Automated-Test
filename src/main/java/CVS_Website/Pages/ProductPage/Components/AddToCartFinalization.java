package CVS_Website.Pages.ProductPage.Components;

import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.ProductPage.CVS_ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class AddToCartFinalization extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(AddToCartFinalization.class);
    private WebDriver driver;
    private WebElement addToCartContainer;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param driver WebDriver driver instance
     */
    public AddToCartFinalization(WebDriver driver, WebElement addToCartContainer) {

        super(driver);
        this.addToCartContainer = addToCartContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    /**
     * Wait for pickup button element to be visible and click on element
     */
    public void clickPickUp() {

        try {

            logger.info("Waiting for pick up button element to be visible");
            WebElement pickUpButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(addToCartContainer, By.xpath("//*[text()='Pickup']")));
            logger.debug("Pick up button element is now visible");

            logger.info("Attempting to click on pick up button element");
            clickElement(pickUpButton);
            logger.debug("Successfully clicked on pick up button element");

        } catch (TimeoutException e) {

            logger.error("Pick up button element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for same day delivery button element to be visible and click on element
     */
    public void clickSameDayDelivery() {

        try {

            logger.info("Waiting for same day delivery button element to be visible");
            WebElement pickUpButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(addToCartContainer, By.xpath("//*[@aria-label='Same day delivery not selected ']")));
            logger.debug("Same day delivery button element is now visible");

            logger.info("Attempting to click on same day delivery button element");
            clickElement(pickUpButton);
            logger.debug("Successfully clicked on same day delivery button element");

        } catch (TimeoutException e) {

            logger.error("Same day delivery button element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for same day delivery button element to be visible and click on element
     */
    public void clickSameDayDeliveryChangeAddress() {

        try {

            logger.info("Waiting for same day delivery change address button element to be visible");
            WebElement sameDayDelivery_ChangeAddressButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(addToCartContainer, By.xpath("//*[@aria-label='Change address']")));
            logger.debug("Same day delivery change address button element is now visible");

            logger.info("Attempting to click on same day delivery change address button element");
            clickElement(sameDayDelivery_ChangeAddressButton);
            logger.debug("Successfully clicked on same day delivery change address button element");

        } catch (TimeoutException e) {

            logger.error("Same day delivery change address button element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for shipping button element to be visible and click on element
     */
    public void clickShipping() {

        try {

            logger.info("Waiting for shipping button element to be visible");
            WebElement shippingButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(addToCartContainer, By.xpath("//*[text()='Shipping']")));
            logger.debug("Shipping button element is now visible");

            logger.info("Attempting to click on shipping button element");
            clickElement(shippingButton);
            logger.debug("Successfully clicked on shipping button element");

        } catch (TimeoutException e) {

            logger.error("Shipping button element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for shipping policies button element to be visible and click on element
     */
    public void clickShippingPolicies() {

        try {

            logger.info("Waiting for shipping policies button element to be visible");
            WebElement shippingButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(addToCartContainer, By.cssSelector("button[id='shipping-policies-list-button']")));
            logger.debug("Shipping policies button element is now visible");

            logger.info("Attempting to click on shipping policies button element");
            clickElement(shippingButton);
            logger.debug("Successfully clicked on shipping policies button element");

        } catch (TimeoutException e) {

            logger.error("Shipping policies button element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for change ZIP button element to be visible and click on element
     */
    public void clickChangeZIP() {

        try {

            logger.info("Waiting for change ZIP button element to be visible");
            WebElement shippingButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(addToCartContainer, By.cssSelector("button[id='change-zip-list-button']")));
            logger.debug("Change ZIP button element is now visible");

            logger.info("Attempting to click on change ZIP button element");
            clickElement(shippingButton);
            logger.debug("Successfully clicked on change ZIP button element");

        } catch (TimeoutException e) {

            logger.error("Change ZIP button element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for quantity dropdown menu element to be visible and click on element
     */
    public void quantitySelectDropMenu(int index) {

        try {

            logger.info("Waiting for quantity dropdown menu element to be visible");
            WebElement quantityDropdownMenu = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(addToCartContainer, By.cssSelector("select[id='quantity-selector']")));
            Select quantityDropMenu = new Select(quantityDropdownMenu);
            logger.debug("Quantity dropdown menu element is now visible");

            logger.info("Attempting to select by index for quantity dropdown menu element");
            quantityDropMenu.selectByIndex(index);
            logger.debug("Successfully selected by index for quantity dropdown menu element");

        } catch (TimeoutException e) {

            logger.error("Quantity dropdown menu element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for add to cart button element to be visible and click on element
     */
    public void clickAddToCart() {

        try {

            logger.info("Waiting for add to cart button element to be visible");
            WebElement addToCart = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(addToCartContainer, By.xpath("//*[text()='Add for shipping']")));
            logger.debug("Add to cart button element is now visible");

            logger.info("Attempting to click on add to cart button element");
            clickElement(addToCart);
            logger.debug("Successfully clicked on add to cart button element");

        } catch (TimeoutException e) {

            logger.error("Add to cart button element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for continue shopping button element to be visible and click on element
     */
    public void clickContinueShopping() {

        try {

            logger.info("Waiting for continue shopping button element to be visible");
            WebElement continueShopping = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(addToCartContainer, By.xpath("//*[text()='Continue shopping']")));
            logger.debug("Continue shopping button element is now visible");

            logger.info("Attempting to click on continue shopping button element");
            clickElement(continueShopping);
            logger.debug("Successfully clicked on continue shopping button element");

        } catch (TimeoutException e) {

            logger.error("Continue shopping button element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

    /**
     * Wait for check out button element to be visible and click on element
     */
    public void clickCheckout() {

        try {

            logger.info("Waiting for check out button element to be visible");
            WebElement continueShopping = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(addToCartContainer, By.xpath("//*[text()='Continue shopping']")));
            logger.debug("Check out button element is now visible");

            logger.info("Attempting to click on check out button element");
            clickElement(continueShopping);
            logger.debug("Successfully clicked on check out button element");

        } catch (TimeoutException e) {

            logger.error("Check out button element was not visible and could not be clicked on within timeout");
            throw e;

        }

    }

}

