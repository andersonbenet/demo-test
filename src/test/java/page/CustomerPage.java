package page;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Author: andersondacruzbenet@gmail.com
 */
public class CustomerPage {
	
	public WebDriver driver;
	public WebElement element;
	WebDriverWait wait;
	
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"src//test//java//util//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void openPage(String url) {
		driver.get(url);
	}
	
	public void updateVersion(int opcao){
		
		driver.findElement(By.id("switch-version-select")).click();
		driver.findElement(By.xpath("//*[@id=\"switch-version-select\"]/option[" + opcao+ "]")).click();
	}

	public void addCustomer(String name, String lastName,
			String contactFirstName, String phone, String addressLine1,
			String addressLine2, String city, String state, String postalCode,
			String country, int employeer, String creditLimit){

		driver.findElement(By.linkText("Add Customer")).click();
		driver.findElement(By.id("field-customerName")).sendKeys(name);
		driver.findElement(By.id("field-contactLastName")).sendKeys(lastName);
		driver.findElement(By.id("field-contactFirstName")).sendKeys(
				contactFirstName);
		driver.findElement(By.id("field-phone")).sendKeys(phone);
		driver.findElement(By.id("field-addressLine1")).sendKeys(addressLine1);
		driver.findElement(By.id("field-addressLine2")).sendKeys(addressLine2);
		driver.findElement(By.id("field-city")).sendKeys(city);
		driver.findElement(By.id("field-state")).sendKeys(state);
		driver.findElement(By.id("field-postalCode")).sendKeys(postalCode);
		driver.findElement(By.id("field-country")).sendKeys(country);

		driver.findElement(By.id("field-creditLimit")).sendKeys(creditLimit);
		driver.findElement(By.xpath(".//*[@id='field_salesRepEmployeeNumber_chosen']/a")).click();
		driver.findElement(By.xpath(".//*[@id='field_salesRepEmployeeNumber_chosen']/div/ul/li[8]")).click();
		

	}

	public void saveCustomer() {
		driver.findElement(By.id("form-button-save")).click();
	}

	public void saveAndGoBackList() {
		driver.findElement(By.id("save-and-go-back-button")).click();
	}

	public void searchCustomer(String name) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		element = driver.findElement(By.xpath(".//*[@id='gcrud-search-form']/div[1]/div[2]/a[3]"));
		try {
			if (element.isDisplayed() && element.isEnabled()) {
				element.click();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		element = driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[2]/a[3]/input"));

		wait = new WebDriverWait(driver, 10);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[2]/a[3]/input")));
		element.sendKeys(name);
		element.sendKeys(Keys.TAB);
	
		
		
	}

	public void deleteCustomer() throws InterruptedException {
		Thread.sleep(10000);
		Actions actions = new Actions(driver);
		element = driver.findElement(By.xpath("//form[@id='gcrud-search-form']/div[2]/table/thead/tr/td[1]/div/input[1]"));
		actions.moveToElement(element);
		actions.click().build().perform();
		
		element = driver.findElement(By.xpath(".//*[@id='gcrud-search-form']/div[2]/table/thead/tr[2]/td[2]/div[1]/a/span"));
		element.click();

	}
	
	public String confirmButtonDeleteCustomer() {
		wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]")));
		element.click();
		
		String msg="";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		element = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[1]"));
		
		
		try {
			if (element.isDisplayed() && element.isEnabled()) {
				element.click();
				msg = element.getText();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return msg;
		
	}
	
	public String msgDeleteCustomer(){
		
		String mensagem="";
		
		element = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]"));
		
		
		mensagem = element.getText();
		
		return mensagem;
		
	}
	
	public String msgDeleteCustomers(){
		
		String mensagem="";
		
		element = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[1]"));
		
		mensagem = element.getText();
		
		return mensagem;
		
	}
	
	
	
	
	public String countDeleteCustomer() {	
		String count="";
				
		element = driver.findElement(By.xpath(".//*[@id='gcrud-search-form']/div[3]/div[3]/span[2]"));
		
		count = element.getText();
		
		return count;
		
	}
	

	public String getMenssageDeleteCustomerSuccess() {
		String msg;
		wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[3]/span[3]/p")));
		msg = element.getText();
		return msg;
	}
	
	

	public String getMenssageSaveCustomerSuccess() {
		String msg;
		wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='report-success']/p")));
		msg = element.getText();
		return msg;
	}
	

	public void close() {
		driver.close();
	}


}
