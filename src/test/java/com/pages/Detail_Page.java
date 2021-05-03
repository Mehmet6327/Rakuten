package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Detail_Page extends BasePage {


    @FindBy(xpath = "(//span[@class='round-action__element'])[2]")
    public WebElement actionElement;

    @FindBy(xpath = "//li[@class='navmenu__parent navmenu__parent--profile navmenu__parent--with-childs']/div")
    public WebElement navmenu;

    @FindBy(xpath = "//span[@class='icon__wishlist']")
    public WebElement wishList;

    @FindBy(xpath = "//div[@class='scrollable__items']//span[@class='artwork__title']")
    public List<WebElement> contentList;

    @FindBy(xpath = "//div[@class='scrollable__items']//span[@class='artwork__title']")
    public WebElement content;

































}
