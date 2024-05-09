package FirstWebTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
  public static void main(String[] args) {
    openChrome();
  }
  public static void openChrome(){
    //设置Selenium WebDriver启动Chrome浏览器时所需的ChromeDriver路径
    System.setProperty("webdriver.chrome.driver", "C:\\IDEA\\Maven-project\\java01\\src\\test\\resource\\chromedriver.exe");
    //打开浏览器
    ChromeDriver chromeDriver=new ChromeDriver();
    //访问百度
    chromeDriver.get("http://www.baidu.com");

  }

}
