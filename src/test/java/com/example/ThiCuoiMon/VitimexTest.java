package com.example.ThiCuoiMon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VitimexTest {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testTimKiem() throws InterruptedException{
        driver.get("https://vitimex.com.vn/");
        Thread.sleep(3000);
        driver.findElement(By.className("h-search")).click();
        driver.findElement(By.id("inputSearchAuto")).sendKeys("Quần");
        driver.findElement(By.id("search-header-btn")).click();
        Thread.sleep(3000);
    }
    @Test
    public void testThemSanPham() throws InterruptedException{
        driver.get("https://vitimex.com.vn/search?q=Qu%E1%BA%A7n");
        Thread.sleep(3000);
        driver.findElement(By.className("add-to-cart")).click();
        Thread.sleep(3000);
    }
}
