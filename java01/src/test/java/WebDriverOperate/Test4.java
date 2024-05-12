package WebDriverOperate;

import okio.Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
  public static ChromeDriver chromeDriver;
  public static void main(String[] args) throws InterruptedException {
    openChrome();
    //getCurrentUrl获取当前url链接
    System.out.println(chromeDriver.getCurrentUrl());
    //获取当前页面标题
    System.out.println(chromeDriver.getTitle());
    //获取当前页面源代码
    System.out.println(chromeDriver.getPageSource());
    //关闭驱动对象以及所有相关的接口
    chromeDriver.quit();

    //close（）方法，关闭当前窗口，若同时打开了多个窗口只会关闭一个当前窗口
    chromeDriver.findElement(By.id("kw")).sendKeys("腾讯课堂");
    chromeDriver.findElement(By.id("su")).click();
    //句柄就相当于一个网页的身份证号，每一个网页都有一个身份证
    //打开新窗口前的当前句柄
    System.out.println("打开前"+chromeDriver.getWindowHandle());
    //打开新窗口前的所有句柄
    System.out.println("打开前所有"+chromeDriver.getWindowHandles());
    //这里需要等待几秒，因为网页加载有时间，有可能会没有加载到导致报错
    Thread.sleep(1000);
    chromeDriver.findElement(By.name("label")).click();
    Thread.sleep(3000);
    //打开新窗口后的当前句柄
    System.out.println("打开后"+chromeDriver.getWindowHandle());
    //打开新窗口后的所有句柄
    System.out.println("打开后所有"+chromeDriver.getWindowHandles());
    //chromeDriver.close();

    //manage（）方法可以获取Options-浏览器菜单操作对象，例如让浏览器全屏
    WebDriver.Options options = chromeDriver.manage();
    //引用方法，浏览器全屏
    //还有各种方法，例如获取页面大小，高度，宽度等等，用数据类型去接收，都可以打印下来，还有position等，x，y轴等等
    options.window().fullscreen();

    //navigate对象
    WebDriver.Navigation navigation= chromeDriver.navigate();
    Thread.sleep(3000);
    //访问url，例如打开百度后去访问京东
    navigation.to("http://www.jd.com");
    Thread.sleep(3000);
    //刷新网页
    navigation.refresh();
    Thread.sleep(3000);
    //回退
    navigation.back();
    Thread.sleep(3000);
    //前进
    navigation.forward();
  }
  public static void openChrome(){
    //设置Selenium WebDriver启动Chrome浏览器时所需的ChromeDriver路径
    System.setProperty("webdriver.chrome.driver", "C:\\IDEA\\Maven-project\\java01\\src\\test\\resource\\chromedriver.exe");
    //打开浏览器
    chromeDriver=new ChromeDriver();
    //访问百度
    //访问指定的url页面
    chromeDriver.get("http://www.baidu.com");

  }
}
