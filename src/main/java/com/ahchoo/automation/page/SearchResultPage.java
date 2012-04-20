package com.ahchoo.automation.page;

import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    private WebDriver driver;
    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }
    
    public String getContent() {
        return driver.getPageSource();
    }
}
