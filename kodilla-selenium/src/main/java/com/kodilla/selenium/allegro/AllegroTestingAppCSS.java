package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AllegroTestingAppCSS {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "/Users/Dagmara/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebElement alert = driver.findElement(By.cssSelector("div>button[class*='m7er_0k']"));
        alert.click();

        WebElement category = driver.findElement(By.cssSelector("div>select[class*='mr3m_1']"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);

        WebElement searchItem = driver.findElement(By.cssSelector("div>form>input"));
        searchItem.sendKeys("Mavic mini");
        searchItem.submit();

        List<WebElement> listOfProducts = driver.findElements(By.cssSelector("section>article"));
        for (WebElement product : listOfProducts) {
            System.out.println(product.getText());
        }
    }
}