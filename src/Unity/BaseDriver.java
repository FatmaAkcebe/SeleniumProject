package Unity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
  public static WebDriver driver;
  static {
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));// 20 sn sayfayı yüklemek için mühlet
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn  elementi bulmak için mühlet

  }
  public static void BekleKapat(){
    MyFunc.Bekle(2);
    driver.quit();
  }
}