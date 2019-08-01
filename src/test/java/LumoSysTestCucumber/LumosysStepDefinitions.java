package LumoSysTestCucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import junit.framework.Assert;

public class LumosysStepDefinitions {

	private WebDriver driver;
	
	
	@Given("^I have opened the Lumosys site$")
	public void I_have_opened_the_Lumosys_site() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		driver.get("https://pruebas.lumosystem.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	}
	@When ("^I Login with an exist user$")
	public void I_Login_with_an_exist_user( ) {
		//find element user with Id("USU_USERNAME")
		driver.findElement(By.id("USU_USERNAME")).sendKeys("MCORDOVA");
		//find element password with Id("USU_PASSWORD")
		driver.findElement(By.id("USU_PASSWORD")).sendKeys("Qa#123456");
		// find element Button Enter with Id("btnIngresar")
		driver.findElement(By.id("btnIngresar")).click();
	}
	@Then ("^I validate there are Login$")
	public void I_validate_there_are_Login( ) {
	List<WebElement>MenuList=driver.findElements(By.linkText("Fondeos"));
		for (int i=0;i<MenuList.size();i++) {
		String CurrentMenu = MenuList.get(i).getText();
		if (CurrentMenu.contains("Fondeos")) {
			WebElement Menufondeos = MenuList.get(i);
			System.out.println(MenuList.get(i).getText());
			MenuList.get(i).click();
			 
			}
		}
	}
	@Given("^I enter and use submenu charges$")
	public void I_enter_and_use_submenu_charges() {
	driver.get("https://pruebas.lumosystem.com/Creditos/Cargas");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
	}
	@When("^After making a charge, I will look for the charge$")
	public void After_making_a_charge_I_will_look_for_the_charge() {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
			}
		}