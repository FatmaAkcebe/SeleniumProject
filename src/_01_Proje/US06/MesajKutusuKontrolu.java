package _01_Proje.US06;

import Unity.BaseDriver;
import Unity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class MesajKutusuKontrolu extends BaseDriver {
    @Test
    public void test() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);
        WebElement login = driver.findElement(By.cssSelector("[id='H_rl_v8'] > :nth-child(1)+a"));
        login.click();
        MyFunc.Bekle(2);

        WebElement eMail = driver.findElement(By.xpath("//span[@class='frm_v8'] / input[@name='life']"));
        eMail.sendKeys("lafewo8415@rogtat.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@class='t' and @name='lifp']"));
        password.sendKeys("Password123");
        MyFunc.Bekle(2);

        WebElement login2 = driver.findElement(By.cssSelector("[type='submit'][class='s'][value='Giriş yap']"));
        login2.click();
        MyFunc.Bekle(2);

        WebElement account = driver.findElement(By.xpath("//a[@title='Hesabım']"));
        account.click();
        MyFunc.Bekle(2);

        WebElement account2 = driver.findElement(By.xpath("//a[text()='Hesabım']"));
        account2.click();
        MyFunc.Bekle(2);

        WebElement Mesajlarim = driver.findElement(By.xpath("//li/a[text()='Mesajlarım']"));
        Mesajlarim.click();
        MyFunc.Bekle(2);

        try {
            WebElement mesaj = driver.findElement(By.xpath("//p[contains(text(),'Listelenecek mesaj bulunamadı.')]"));
            System.out.println("Listelenecek mesaj bulunamadı.");
        } catch (NoSuchElementException e) {
            System.out.println("Mesaj bildiriminiz var veya mesaj bulunamadı.");
        }
        //2.yol
//        List<WebElement> mesaj=driver.findElements(By.cssSelector("[class='wbb_v8']>p"));
//        Assert.assertTrue("Listelenecek mesaj bulunamadı.",!mesaj.isEmpty());
        BekleKapat();
}
}