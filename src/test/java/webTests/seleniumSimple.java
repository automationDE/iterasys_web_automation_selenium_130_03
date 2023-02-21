// 1 - Packages
package webTests;

// 2 - Libraries
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;

import static org.testng.Assert.assertEquals;


// - Classes

public class seleniumSimple {
    // 3.1 - Attributes

    WebDriver driver;
    // 3.2 - Methods and functions

    @Test
    public void consultCourse(){
        // A - Begin
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\railton.oliveira\\IdeaProjects\\iterasys_web_automation_selenium_130_03\\drivers\\chrome\\110.0.5481.104\\chromedriver.exe" );
        driver = new ChromeDriver();

        // B - Realize the test
        driver.get("https://iterasys.com.br/pt/cursos");
        driver.findElement(By.xpath("//a[@class='bs-alert-close']")).click();

        driver.findElement(By.id("button-text")).click();
        //driver.findElement(By.id("Buscar...")).click();
        //driver.findElement(By.id("searchtext")).clear();
        driver.findElement(By.id("Buscar...")).sendKeys("mantis");

        driver.findElement(By.id("btn_form_search")).click();
        assertEquals(driver.findElement(By.cssSelector("h3")).getText(), "Cursos > \"mantis\"");


    }
}
