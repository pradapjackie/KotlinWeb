import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeGroups
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

 class MainClass {

     val driver = ChromeDriver()
     val wait= WebDriverWait(driver,60)

     @BeforeMethod
     fun BeforeMethod()
     {

         driver.manage().window().maximize()
         driver.get("https://www.google.com/")


     }

     @Test
     fun TestCase_1()
     {
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='gLFyf gsfi']")))
         driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Hello World")

     }


     @AfterMethod
     fun Aftermethod()
     {
         driver.close()
         driver.quit()
     }

}