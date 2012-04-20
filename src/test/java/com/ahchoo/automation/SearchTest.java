package com.ahchoo.automation;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ahchoo.automation.page.BaiduIndexPage;
import com.ahchoo.automation.page.SearchResultPage;

/**
 * Unit test for simple App.
 */
public class SearchTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void searchTest() {
        BaiduIndexPage home = new BaiduIndexPage(driver);
        SearchResultPage searchResult = home.searchFor("pizza");
        assertTrue(searchResult.getTitle().contains("pizza"));
        assertTrue(searchResult.getContent().contains("pizza"));
//        driver.get("http://www.baidu.com");
//        WebElement input = driver.findElement(By.id("kw"));
//        input.clear();
//        input.sendKeys("Pizza");
//        input.submit();
//        assertTrue(driver.getTitle().contains("Pizza"));
//        assertTrue(driver.getPageSource().contains("Pizza"));

    }
}
