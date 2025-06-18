package CVS_Website.Pages.CartPage.Components;

import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.HomePage.components.Announcement;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class CartOrderSummary extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(Announcement.class);
    private WebElement orderSummaryContainer;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param driver                WebDriver driver instance
     * @param orderSummaryContainer WebElement container for Announcement section
     */
    public CartOrderSummary(WebDriver driver, WebElement orderSummaryContainer) {

        super(driver);
        this.orderSummaryContainer = orderSummaryContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    /**
     * Wait for cart items count element to become visible and get text
     *
     * @return text content from cart items count element
     */
    public String getCartItemCount() {

        try {

            logger.info("Waiting for cart items count element to become visible ");
            WebElement orderSummaryItemCount = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(orderSummaryContainer, By.xpath("//*[@data-testid='StoreItemCount']")));
            logger.debug("cart items count element is now visible");

            logger.info("Attempting to get text from cart items count element");
            String acquiredText = getTextFromElement(orderSummaryItemCount);
            logger.debug("Successfully got text from cart items count element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("cart items count element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for cart sub order total element to become visible and get text
     *
     * @return sub total cost text value from order summary element
     */
    public String getOrderSubTotal() {

        try {

            logger.info("Waiting for cart order total element to become visible ");
            WebElement orderSubTotal = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(orderSummaryContainer, By.xpath("//*[@data-testid='StoreItemCountValue']")));
            logger.debug("Cart order total element is now visible");

            logger.info("Attempting to get text from cart order total element");
            String acquiredText = getTextFromElement(orderSubTotal);
            logger.debug("Successfully got text from cart order total element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Cart order total element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for total savings element to become visible and get text
     *
     * @return total savings text value from order summary element
     */
    public String getSavingsTotal() {

        try {

            logger.info("Waiting for total savings element to become visible ");
            WebElement totalSavings = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(orderSummaryContainer, By.xpath("//*[@data-testid='savingsRedeemedValue']")));
            logger.debug("Total savings element is now visible");

            logger.info("Attempting to get text from total savings element");
            String acquiredText = getTextFromElement(totalSavings);
            logger.debug("Successfully got text from total savings element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Total savings element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for shipping cost element to become visible and get text
     *
     * @return shipping cost text value from order summary element
     */
    public String getShippingCost() {

        try {

            logger.info("Waiting for shipping cost element to become visible ");
            WebElement shippingCost = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(orderSummaryContainer, By.xpath("//*[@data-testid='savingsRedeemedValue']")));
            logger.debug("Shipping cost element is now visible");

            logger.info("Attempting to get text from shipping cost element");
            String acquiredText = getTextFromElement(shippingCost);
            logger.debug("Successfully got text from shipping cost element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Shipping cost element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for estimated order total element to become visible and get text
     *
     * @return estimated total cost text value from order summary element
     */
    public String getOrderEstimatedTotal() {

        try {

            logger.info("Waiting for cart estimated order total element to become visible ");
            WebElement orderSubTotal = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(orderSummaryContainer, By.xpath("//*[@data-testid='estimatedTotalValue']")));
            logger.debug("Cart estimated order total element is now visible");

            logger.info("Attempting to get text from cart estimated order total element");
            String acquiredText = getTextFromElement(orderSubTotal);
            logger.debug("Successfully got text from cart estimated order total element");

            return acquiredText;

        } catch (TimeoutException e) {

            logger.error("Cart estimated order total element not found within timeout");
            throw e;

        }
    }

    /**
     * Wait for check out button element to be visible and click on element
     */
    public void clickCheckOut() {

        try {

            logger.info("Waiting for check out button element to be visible");
            WebElement checkOutButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(orderSummaryContainer, By.xpath("//*[@id='checkout-button']")));
            logger.debug("Check out button element is now visible");

            logger.info("Attempting to click on check out button element");
            clickElement(checkOutButton);
            logger.debug("Successfully clicked on check out button element");

        } catch (TimeoutException e) {

            logger.error("Check out button element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }
}

