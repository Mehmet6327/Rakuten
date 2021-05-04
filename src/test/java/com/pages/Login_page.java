package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page extends BasePage {
    @FindBy(xpath ="//a[@href='/es/sessions/sign_in'][@data-test-id='menu-desktop-login-link']" )
    public WebElement login;
    @FindBy(xpath = "//div[@id='root']//input[@name='email'][@placeholder='Escribe tu dirección de email o Rakuten ID']")
    public WebElement email_Element;
    @FindBy(xpath = "//div[@id='root']//a[@href='/es/passwords/recovery']/../input")
    public WebElement password_Element;
    @FindBy(xpath = "//div[@id='root']//button[@class='button button--yellow button--full']//div[@class='button__contents']")
    public WebElement get_in;
    @FindBy(xpath = "//div[@id='root']//div[@class='nav__items__user nav__items__user--notifications']")
    public WebElement notification;
    public void login(String userName, String password){
        email_Element.sendKeys(userName);
        password_Element.sendKeys(password);
        get_in.click();

    }

















































}
