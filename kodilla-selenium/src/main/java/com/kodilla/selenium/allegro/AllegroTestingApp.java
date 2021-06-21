package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "/Users/Dagmara/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebElement alert = driver.findElement(By.xpath("//button[@data-role='accept-consent']"));
        alert.click();

        WebElement category = driver.findElement(By.xpath("//select[contains(@class,\"mr3m_1 m7er_k4\") and contains(@data-role,\"filters-dropdown\") and contains(@aria-label,\"Kategoria\")]"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);

        WebElement searchItem = driver.findElement(By.xpath("//input[@type='search']"));
        searchItem.sendKeys("Mavic mini");
        searchItem.submit();
    }
}