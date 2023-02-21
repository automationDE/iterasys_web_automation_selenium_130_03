import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;

public class AlertHandlingDemo {
    public static void main(String[] args) throws NoAlertPresentException,InterruptedException {
        System.setProperty("webdriver.chrome.driver","Path_of_Chrome_Driver"); //mention dummy path or variable that stores chrome driver path
        WebDriver driver = new ChromeDriver(); driver.get("https://iterasys.com.br/pt/cursos");

        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert(); // switch to alert

        String alertMessage= driver.switchTo().alert().getText(); // capture alert message

        System.out.println(alertMessage); // Print Alert Message
        Thread.sleep(5000);
        alert.accept();
    }
}