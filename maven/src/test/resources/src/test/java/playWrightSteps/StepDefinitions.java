package playWrightSteps;


	import com.microsoft.playwright.*;
	import io.cucumber.java.en.*;

	public class StepDefinitions {

	    Playwright playwright;
	    Browser browser;
	    BrowserContext context;
	    Page page;

	    @Given("I launch the Chrome browser")
	    public void iLaunchTheChromeBrowser() {
	        // Initialize Playwright and launch the browser
	        playwright = Playwright.create();
	        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	        context = browser.newContext();
	        page = context.newPage();
	    }

	    @When("I navigate to {string}")
	    public void iNavigateTo(String url) {
	        // Navigate to the specified URL
	        page.navigate("https://testautomationpractice.blogspot.com/");
	    }

	    @Then("I verify the page title is {string}")
	    public void iVerifyThePageTitleIs(String expectedTitle) {
	    	Locator element = page.locator("xpath=//h1[normalize-space()='Automation Testing Practice']");

	        String actualTitle = page.title();
	        if (!actualTitle.equals("Automation Testing Practice")) {
	            throw new AssertionError("Expectedtext: " + expectedTitle + ", but got: " + actualTitle);
	        }
	        System.out.println("Page title verified successfully: " + actualTitle);

	        // Cleanup: Close the browser
	        browser.close();
	        playwright.close();
	    }
	}


