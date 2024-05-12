package pokemmo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test7 {
  public static ChromeDriver chromeDriver;
  public static void main(String[] args) throws InterruptedException {
    openChrome();
    //浏览器全屏
    chromeDriver.manage().window().maximize();
    //打开该网页
    chromeDriver.get("C:\\Users\\20961\\Desktop\\20200510128_曹晓猛_pokemmo游戏网页\\dazuoye.html");
    //打开视频
    WebElement videoPlayer = chromeDriver.findElement(By.className("shiping"));
    videoPlayer.click();
    Thread.sleep(30000);
    //检查各种链接按钮是否跳转
    chromeDriver.findElement(By.linkText("资料")).click();
    Thread.sleep(3000);
    //navigate对象
    WebDriver.Navigation navigation= chromeDriver.navigate();
    //回退
    navigation.back();
    Thread.sleep(3000);
    chromeDriver.findElement(By.linkText("账号")).click();
    Thread.sleep(3000);
    navigation.back();
    Thread.sleep(3000);
    chromeDriver.findElement(By.linkText("论坛")).click();
    Thread.sleep(3000);
    navigation.back();
    Thread.sleep(3000);
    chromeDriver.findElement(By.linkText("查看更多图片！")).click();
    Thread.sleep(3000);
    navigation.back();
    Thread.sleep(3000);
    chromeDriver.findElement(By.linkText("立即注册!")).click();
    //注册模块测试
    Thread.sleep(3000);
    //用户名
    chromeDriver.findElement(By.id("yonhu")).sendKeys("123456");
    //邮箱
    chromeDriver.findElement(By.id("txt")).sendKeys("12345678@qq.com");
    chromeDriver.findElement(By.id("btn")).click();
    Thread.sleep(2000);
    //邮箱格式校验
    Alert alert=chromeDriver.switchTo().alert();
    alert.accept();
    Thread.sleep(2000);
    //密码
    chromeDriver.findElement(By.id("mima")).sendKeys("12345");
    //确认密码
    chromeDriver.findElement(By.id("queren")).sendKeys("12345");
    //验证码
    chromeDriver.findElement(By.id("yanzhen")).sendKeys("YVTNAUN");
    //订阅
    chromeDriver.findElement(By.className("checkbox")).click();
    Thread.sleep(3000);
    //注册
    chromeDriver.findElement(By.id("zhuce")).click();
    Thread.sleep(2000);
    navigation.back();
    Thread.sleep(2000);
    navigation.back();
  }
  public static void openChrome(){
    System.setProperty("webdriver.chrome.driver","C:\\IDEA\\Maven-project\\java01\\src\\test\\resource\\chromedriver.exe");
    chromeDriver=new ChromeDriver();
  }
}
