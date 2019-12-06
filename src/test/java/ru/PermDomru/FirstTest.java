package ru.PermDomru;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends WebDriverSettings {

    @Test
    public void FIrstTest() {
        driver.get("https://perm.domru.ru/digitalization");

        driver.findElement(By.cssSelector("[href=\"#connect\"]")).click();

    }

    @Test
    public void FIrstTest2() {
        driver.get("https://perm.domru.ru/digitalization");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Купить ТВ-приставку Movix от провайдера Дом.ru в Перми"));

    }

}
