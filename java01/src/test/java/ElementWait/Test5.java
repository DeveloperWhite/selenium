package ElementWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Test5 {
  public static ChromeDriver chromeDriver;
  public static void main(String[] args) throws InterruptedException {
    openChrome();
    //隐式等待
    //在driver实例化完成之后设置隐式等待，可以设置超时时间5秒，后面是单位表示秒，不是每次都要5秒钟，只要你在5秒内反映出来都可以
    //chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    chromeDriver.get("http://www.baidu.com");
    chromeDriver.findElement(By.id("kw")).sendKeys("腾讯课堂");
    chromeDriver.findElement(By.id("su")).click();
    //硬性等待
    //如果不设置硬性等待的话，可能会来不及访问就会报错
    //缺点：比如1秒能加载，这边写3秒，就会浪费2秒
    //Thread.sleep(3000);
    //显示等待
    //先设置一个WebDriverWait对象，传入实例和超时时间
    //下面调用里面的直到什么条件的方法，这里是直到关键词显示
    WebDriverWait webDriverWait=new WebDriverWait(chromeDriver,5);
    webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='_专业的在线教育平台']")));
    chromeDriver.findElement(By.xpath("//a[text()='_专业的在线教育平台']")).click();
    //隐式等待



  }
  public static void openChrome(){
    System.setProperty("webdriver.chrome.driver","C:\\IDEA\\Maven-project\\java01\\src\\test\\resource\\chromedriver.exe");
    chromeDriver=new ChromeDriver();
  }
}
