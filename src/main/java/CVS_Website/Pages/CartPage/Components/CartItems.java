package CVS_Website.Pages.CartPage.Components;

import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.HomePage.components.Announcement;
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
import java.util.List;

public class CartItems extends BasePage {
    private static final Logger logger = LoggerFactory.getLogger(Announcement.class);
    private WebElement cartItemContainer;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * constructor to initialize page
     *
     * @param driver                WebDriver driver instance
     * @param cartItemContainer WebElement container for Announcement section
     */
    public CartItems(WebDriver driver, WebElement cartItemContainer) {

        super(driver);
        this.cartItemContainer = cartItemContainer;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    /**
     * Wait for list of cart items element to be visible and extract css values from element to check if the correct products are added
     */
    public void checkCartItems() {

        try {

            logger.info("Waiting for list of cart items element to be visible");
            WebElement cartItems = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.xpath("//*[@class='StoreItem-module__listItem']")));
            List<WebElement> listOfCartItems = driver.findElements(By.xpath("//*[@class='StoreItem-module__listItem']"));
            logger.debug("List of cart items element is now visible");

            logger.info("Attempting to extract attribute values from list of cart items element");
            for (WebElement element : listOfCartItems) {
                String cartItem = element.getAttribute("data-testid");
                System.out.println(cartItem);

            }
            logger.debug("Successfully extracted attribute value from list of cart items element");


        } catch (TimeoutException e) {

            logger.error("List of cart items element was not visible within timeout");
            throw e;

        }

    }

    /**
     * Wait for change store button element to be visible and click on element
     */
    public void clickChangeStore() {

        try {

            logger.info("Waiting for change store button element to be visible");
            WebElement changeStore = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.xpath("//*[@id='change-store']")));
            logger.debug("Change store button element is now visible");

            logger.info("Attempting to click on change store button element");
            clickElement(changeStore);
            logger.debug("Successfully clicked on change store button element");

        } catch (TimeoutException e) {

            logger.error("Change store button element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for location text box element to be visible and click on element
     */
    public void sendLocationText(String zIPOrAddress) {

        try {

            logger.info("Waiting for change location text box element to be visible");
            WebElement textBox = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.xpath("//*[@name='search-submit']")));
            logger.debug("Change location text box element is now visible");

            logger.info("Attempting to send text to change location text box element");
            enterText(textBox, zIPOrAddress);
            logger.debug("Successfully sent text to change location text box element");

        } catch (TimeoutException e) {

            logger.error("Change location text box element was not visible and could not be send text within timeout");
            throw e;

        }
    }

    /**
     * Wait for search store button element to be visible and click on element
     */
    public void clickSearchStore() {

        try {

            logger.info("Waiting for search store button element to be visible");
            WebElement searchStoreButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.xpath("//*[@id='change-zip']")));
            logger.debug("Search store button element is now visible");

            logger.info("Attempting to click on search store button element");
            clickElement(searchStoreButton);
            logger.debug("Successfully clicked on search store button element");

        } catch (TimeoutException e) {

            logger.error("Search store button element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for list of store locations element to be visible and extract css values from element to check if the correct products are added
     */
    public void checkTextLocatedStores() {

        try {

            logger.info("Waiting for list of store locations element to be visible");
            WebElement storeList = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.xpath("//*[@class='StoreCard-module__title']")));
            List<WebElement> listOfNearbyStores = driver.findElements(By.xpath("//*[@class='StoreCard-module__title']"));
            logger.debug("List of store locations element is now visible");

            logger.info("Attempting to extract css values from list of store locations element");
            for (WebElement element : listOfNearbyStores) {
                String nearbyStores = getTextFromElement(element);
                System.out.println(nearbyStores);
            }
            logger.debug("Successfully extracted css value from list of store locations element");


        } catch (TimeoutException e) {

            logger.error("List of store locations element was not visible within timeout");
            throw e;

        }

    }

    /**
     * Wait for select store button element to be visible and click on element
     */
    public void clickSelectStore(int index) {

        try {

            logger.info("Waiting for select store button element to be visible");
            WebElement selectStoreButton = driver.findElements(By.xpath("//*[@class='ps-button  ps-button-solid ps-button-sm']")).get(index);
            selectStoreButton.isDisplayed();
            logger.debug("Select store button element is now visible");

            logger.info("Attempting to click on select store button element");
            clickElement(selectStoreButton);
            logger.debug("Successfully clicked on select store button element");

        } catch (TimeoutException e) {

            logger.error("Select store button element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for close button element to be visible and click on element
     */
    public void clickCloseStoreFinder() {

        try {

            logger.info("Waiting for close button element to be visible");
            WebElement closeStoreFinderButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer,By.xpath("//*[@class='ps-button  ps-button-text ps-button-reversed ps-button-sm']")));
            logger.debug("Close button element is now visible");

            logger.info("Attempting to click on close button element");
            clickElement(closeStoreFinderButton);
            logger.debug("Successfully clicked on close button element");

        } catch (TimeoutException e) {

            logger.error("Close button element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for change ZIP button element to be visible and click on element
     */
    public void clickChangeZIP() {

        try {

            logger.info("Waiting for change ZIP button element to be visible");
            WebElement changeZIP = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.xpath("//*[@id='change-zip']")));
            logger.debug("Change ZIP button element is now visible");

            logger.info("Attempting to click on change ZIP button element");
            clickElement(changeZIP);
            logger.debug("Successfully clicked on change ZIP button element");

        } catch (TimeoutException e) {

            logger.error("Change ZIP button element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for ZIP code text box element to be visible and click on element
     */
    public void sendZIP(String zIP) {

        try {

            logger.info("Waiting for ZIP code text box element to be visible");
            WebElement textBox = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.xpath("//*[@id='zip-input']")));
            logger.debug("ZIP code text box element is now visible");

            logger.info("Attempting to send text to ZIP code text box element");
            enterText(textBox, zIP);
            logger.debug("Successfully sent text to ZIP code text box element");

        } catch (TimeoutException e) {

            logger.error("ZIP code text box element was not visible and could not send text within timeout");
            throw e;

        }
    }

    /**
     * Wait for update ZIP code button element to be visible and click on element
     */
    public void clickUpdateZIP() {

        try {

            logger.info("Waiting for update ZIP code button element to be visible");
            WebElement updateZIPButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.xpath("//*[@class='ChangeZipModal-module__updateButton']")));
            logger.debug("Update ZIP code button element is now visible");

            logger.info("Attempting to click on update ZIP code button element");
            clickElement(updateZIPButton);
            logger.debug("Successfully clicked on update ZIP code button element");

        } catch (TimeoutException e) {

            logger.error("Update ZIP code button element element was not visible and could not send text within timeout");
            throw e;

        }
    }

    /**
     * Wait for cancel update ZIP code button element to be visible and click on element
     */
    public void clickCancelUpdateZIP() {

        try {

            logger.info("Waiting for cancel update ZIP code button element to be visible");
            WebElement cancelUpdateZIPButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.xpath("//*[@class='ChangeZipModal-module__cancelButton']")));
            logger.debug("Cancel update ZIP code button element is now visible");

            logger.info("Attempting to click on cancel update ZIP code button element");
            clickElement(cancelUpdateZIPButton);
            logger.debug("Successfully clicked on cancel update ZIP code button element");

        } catch (TimeoutException e) {

            logger.error("Cancel update ZIP code button element was not visible and could not send text within timeout");
            throw e;

        }
    }

    /**
     * Wait for remove product button element to be visible and click on element
     */
    public void clickRemoveProduct(int index) {

        try {

            logger.info("Waiting for remove product button element to be visible");
            WebElement selectStoreButton = driver.findElements(By.xpath("//*[@class='ps-button  ps-button-solid ps-button-sm']")).get(index);
            selectStoreButton.isDisplayed();
            logger.debug("Remove product button element is now visible");

            logger.info("Attempting to click on remove product button element");
            clickElement(selectStoreButton);
            logger.debug("Successfully clicked on remove product button element");

        } catch (TimeoutException e) {

            logger.error("Remove product button element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for quantity dropdown menu element to be visible and click on element
     */
    public void cartQuantityDropMenu(int index) {

        try {

            logger.info("Waiting for quantity dropdown menu element to be visible");
            WebElement cartQuantityDropdownMenu = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.cssSelector("select[id='quantity-selector']")));
            Select quantityDropMenu = new Select(cartQuantityDropdownMenu);
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
     * Wait for change fulfillment button element to be visible and click on element
     */
    public void clickChangeFulfillmentMethod() {

        try {

            logger.info("Waiting for change fulfillment button element to be visible");
            WebElement changeFulfillmentButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.xpath("//*[@id='change-options-shipping-627997']")));
            logger.debug("Change fulfillment button element is now visible");

            logger.info("Attempting to click on change fulfillment button element");
            clickElement(changeFulfillmentButton);
            logger.debug("Successfully clicked on change fulfillment button element");

        } catch (TimeoutException e) {

            logger.error("Change fulfillment button element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for change fulfillment button element to be visible and click on element
     */
    public void selectFulfillmentMethod(int index) {

        try {

            logger.info("Waiting for fulfillment options element to be visible");
            WebElement selectStoreButton = driver.findElements(By.xpath("//*[@class='ps-custom-radio FulfillmentSelection-module__container']")).get(index);
            selectStoreButton.isDisplayed();
            logger.debug("Fulfillment options element is now visible");

            logger.info("Attempting to click on fulfillment options element");
            clickElement(selectStoreButton);
            logger.debug("Successfully clicked on fulfillment options element");

        } catch (TimeoutException e) {

            logger.error("fulfillment options element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }

    /**
     * Wait for save button element to be visible and click on element
     */
    public void clickSave() {

        try {

            logger.info("Waiting for save button element to be visible");
            WebElement selectStoreButton = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(cartItemContainer, By.xpath("//*[@class='ps-button  ps-button-solid']")));
            logger.debug("Save button element is now visible");

            logger.info("Attempting to click on save button element");
            clickElement(selectStoreButton);
            logger.debug("Successfully clicked on save button element");

        } catch (TimeoutException e) {

            logger.error("Save button element was not visible and could not be clicked on within timeout");
            throw e;

        }
    }
}
