package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepsDefinition.Hooks;

public class PaginationPage {

	WebDriver driver = Hooks.driver;

	By PaginationIcon2 = By.xpath("//button[normalize-space()='2']");
	By textcheckpage2 = By.xpath("//span[contains(text(),'11 à 20 de 49 Evaluations')]");
	By PaginationIcon3 = By.xpath("//button[normalize-space()='3']");
	By textcheckpage3 = By.xpath("/html[1]/body[1]/app-root[1]/app-admin[1]/app-sessiondetails[1]/div[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[3]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span[1]");
	By filterIcon = By.xpath("//body[1]/app-root[1]/app-admin[1]/app-sessiondetails[1]/div[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[3]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/p-dropdown[1]/div[1]/div[2]");
	By filternumber = By.xpath("//li[@id='p-highlighted-option']");
	By textcheckfilter = By.xpath("/html[1]/body[1]/app-root[1]/app-admin[1]/app-sessiondetails[1]/div[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[3]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span[1]");
	By leftIcon = By.xpath("//body/app-root[1]/app-admin[1]/app-sessiondetails[1]/div[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[3]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/button[2]/span[1]");
	By textcheckpreviouspage = By.xpath("/html[1]/body[1]/app-root[1]/app-admin[1]/app-sessiondetails[1]/div[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[3]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span[1]");
	By rightIcon = By.xpath("/html[1]/body[1]/app-root[1]/app-admin[1]/app-sessiondetails[1]/div[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[3]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/button[3]/span[1]");
	By textchecknextpage = By.xpath("/html[1]/body[1]/app-root[1]/app-admin[1]/app-sessiondetails[1]/div[1]/p-tabview[1]/div[1]/div[2]/p-tabpanel[3]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span[1]");

	public PaginationPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickonPaginationIcon2() {
		driver.findElement(PaginationIcon2).click();
	}
	public void checktextpage2() {
		driver.findElement(textcheckpage2).isDisplayed();
	}
	public void clickonPaginationIcon3() {
		driver.findElement(PaginationIcon3).click();
	}
	public void checktextpage3() {
		driver.findElement(textcheckpage3).isDisplayed();
	}
	public void clickonfilterIcon() {
		driver.findElement(filterIcon).click();
	}
	public void clickonfilternumber() {
		driver.findElement(filternumber).click();
	}
	public void checkfilterpage() {
		driver.findElement(textcheckfilter).isDisplayed();
	}
	
	public void clickonleftIcon() {
		driver.findElement(leftIcon).click();
	}
	public void textcheckpreviouspage() {
		driver.findElement(textcheckpreviouspage).isDisplayed();
	}
	public void clickonrightIcon() {
		driver.findElement(rightIcon).click();
	}
	public void textchecknextpage() {
		driver.findElement(textchecknextpage).isDisplayed();
	}
}
