package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepsDefinition.Hooks;

public class AjouterPage {
	WebDriver driver = Hooks.driver;
	By cursusIcon = By.xpath("//span[contains(text(),'Cursus')]");
	By editcontentIcon = By.xpath("//tbody/tr[1]/td[6]/em[1]");
	By AjouterButton = By.xpath("//span[contains(text(),'Ajouter')]");
	By textTitre = By.xpath("/html[1]/body[1]/app-root[1]/app-admin[1]/app-module-admin[1]/p-dialog[1]/div[1]/div[1]/div[3]/form[1]/div[1]/input[1]");
	By textReference = By.xpath("//input[@id='ref']");
	By textDescription = By.xpath("//textarea[@id='description']");
	By textIntructionModule = By.xpath("//input[@id='instructionModule']");
	By textType = By.xpath("//input[@id='type']");
	By textDurée = By.xpath("//input[@id='duration']");
	By ajouetButton = By.xpath("//body/app-root[1]/app-admin[1]/app-module-admin[1]/p-dialog[1]/div[1]/div[1]/div[4]/button[2]/span[2]");
	By checkaddmodule = By.xpath("//div[contains(text(),'Ajout effectué avec succès')]");

	public AjouterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickoncursusIcon() {
		driver.findElement(cursusIcon).click();
	}

	public void clickoneditcontentIcon() {
		driver.findElement(editcontentIcon).click();
	}

	public void clickonajouterbutton() {
		driver.findElement(AjouterButton).click();
	}

	public void entersTitre(String Titre) {
		driver.findElement(textTitre).sendKeys(Titre);
	}
		public void entersRéférence(String Référence) {
			driver.findElement(textReference).sendKeys(Référence);
		}
		
		public void entersDescription( String Description) {	
		driver.findElement(textDescription).sendKeys(Description);
		}
		public void entersinstructionmodule( String instruction_Module) {
		driver.findElement(textIntructionModule).sendKeys(instruction_Module);
		}
		public void entersType(String Type) {
		driver.findElement(textType).sendKeys(Type);
		}
		public void entersDurée(String Durée) {
		driver.findElement(textDurée).sendKeys(Durée);
	}
	public void clickonajouterButton() {
		driver.findElement(ajouetButton).click();
	}
	public void checkaddModule() {
		driver.findElement(checkaddmodule).isDisplayed();
	}
}
