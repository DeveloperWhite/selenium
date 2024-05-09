package ElementOperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//元素操作常见API
public class Test3 {
  public static ChromeDriver chromeDriver;
  public static void main(String[] args) throws InterruptedException {
    openChrome();
//    //删除搜索框的内容
//    chromeDriver.findElement(By.id("kw")).sendKeys("腾讯课堂");
//    //等待三秒
//    Thread.sleep(3000);
//    //删除搜索内容--用clear方法
//    chromeDriver.findElement(By.id("kw")).clear();
    //获取元素的标签名，查看后返回值类型是WebElement，用webElement去接收
    WebElement webElement=chromeDriver.findElement(By.id("kw"));
    //获取元素的标签名
    System.out.println(webElement.getTagName());
    //获取元素某个属性的属性值，或者链接等等
    System.out.println(webElement.getAttribute("maxlength"));
    //先用xpath部分文本定位到元素位置，获取元素的文本值
    WebElement webElement1=chromeDriver.findElement(By.xpath("//a[contains(text(),'库')]"));
    System.out.println(webElement1.getText());
    //查看元素是否显示
    System.out.println(webElement1.isDisplayed());
  }
  public static void openChrome(){
    //设置Selenium WebDriver启动Chrome浏览器时所需的ChromeDriver路径
    System.setProperty("webdriver.chrome.driver", "C:\\IDEA\\Maven-project\\java01\\src\\test\\resource\\chromedriver.exe");
    //打开浏览器
    chromeDriver=new ChromeDriver();
    //访问百度
    chromeDriver.get("http://www.baidu.com");

  }
}
