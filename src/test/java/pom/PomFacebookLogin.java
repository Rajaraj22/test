package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class PomFacebookLogin implements AutoConstant {

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(name = "pass")
	private WebElement pwd;

	@FindBy(name = "logi")
	private WebElement login;

	public PomFacebookLogin(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void login() throws Exception {

		email.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 0));
		pwd.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 1));
		login.click();
	}

}
