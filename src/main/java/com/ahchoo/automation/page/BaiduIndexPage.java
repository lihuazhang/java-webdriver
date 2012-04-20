package com.ahchoo.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaiduIndexPage {

    private WebDriver driver;
    private final String url = "http://www.baidu.com";

    public BaiduIndexPage(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
    }

    public SearchResultPage searchFor(String term) {
        // Baidu search input id is "kw"
        WebElement searchField = driver.findElement(By.id("kw"));
        searchField.clear();
        searchField.sendKeys(term);
        searchField.submit();
        return new SearchResultPage(driver);
    }
}
