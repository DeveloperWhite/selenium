package ElementLocate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
  //定义全局变量，如果像Test1中一样，只是定义在openChrome方法中作用域只在该方法内
  //在这定义之后就能在该类的所有方法中直接调用
  private static ChromeDriver chromeDriver;
  public static void main(String[] args) {
    openChrome();
//    定位到百度的搜索框元素，并搜数据，通过id（id名）来定位
//    chromeDriver.findElement(By.id("kw")).sendKeys("腾讯课堂");
//    定位到搜索框元素，通过name（名字）来定位
//    chromeDriver.findElement(By.name("wd")).sendKeys("腾讯课堂");
//    定位到搜索框元素，通过tagName(标签名)来定位--他找到的元素是多个，默认会找html页面中第一个，不推荐
//    chromeDriver.findElement(By.tagName("input")).sendKeys("腾讯课堂");//会报错
//    定位到搜索框元素，通过className(类名)来定位--也可能有多个，有可能会有复合类名，需要选择其中一个唯一的一部分当做类名去定位
//    chromeDriver.findElement(By.className("s_ipt")).sendKeys("腾讯课堂");
//    根据超链接文本来定位元素--超链接的完整文本
//    chromeDriver.findElement(By.linkText("新闻")).click();
//    根据超链接文本来定位元素--超链接的部分文本
    chromeDriver.findElement(By.partialLinkText("闻")).click();

//    cssSelect元素定位，css选择器，根据css样式来选择
//    根据tagName（标签名）定位--会报错，input标签有多个
//    chromeDriver.findElement(By.cssSelector("input")).click();
//    根据id（id名）定位，在后面id名前要加上#
//    chromeDriver.findElement(By.cssSelector("#kw")).sendKeys("腾讯课堂");
//    根据className（类名）定位，在后面类名前要加上.
//    chromeDriver.findElement(By.cssSelector(".s_ipt")).sendKeys("腾讯课堂");

//    css精确定位 标签名[属性名='属性值']
//    chromeDriver.findElement(By.cssSelector("input[maxlength='255']")).sendKeys("腾讯课堂");
//    更精准的定位，多属性定位
//    chromeDriver.findElement(By.cssSelector("input[maxlength='255'][autocomplete='off']")).sendKeys("腾讯课堂");
//    xpath元素定位，相当于元素的坐标--使用笔记里的格式，在定位多属性时和上面不同，写在一个中括号内，每个属性前都要加@
//    chromeDriver.findElement(By.xpath("//input[@maxlength='255' and @autocomplete='off']")).sendKeys("腾讯课堂")
//    xpath定位我们想获取文本关键字，完整文字
//    chromeDriver.findElement(By.xpath("//a[text()='新闻']")).click();
//    xpath定位我们想获取文本关键字，部分文字，用到contains（）函数
//    chromeDriver.findElement(By.xpath("//a[contains(text(),'o123')]")).click();
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
