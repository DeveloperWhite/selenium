package SpecialElementLocate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.temporal.ChronoField;
import java.util.Set;

public class Test6 {
  public static ChromeDriver chromeDriver;
  public static void main(String[] args) throws InterruptedException {
    openChrome();
//    //访问本地的html文件，alert模态框
//    chromeDriver.get("C:\\Users\\20961\\Desktop\\web自动化测试\\模态框\\alert.html");
//    //休眠2秒
//    Thread.sleep(2000);
//    //点击按钮
//    chromeDriver.findElement(By.id("al")).click();
//    //休眠2秒
//    Thread.sleep(2000);
//    //找到对应的弹出框（switchTo.alert），并用Alert类型去接收
//    Alert alert=chromeDriver.switchTo().alert();
//    //确认弹出框
//    //alert.accept();
//    //取消弹出框
//    //alert.dismiss();
//    //显示弹出框文本
//    //System.out.println(alert.getText());

//    //访问本地的html文件，confirm模态框
//    chromeDriver.get("C:\\Users\\20961\\Desktop\\web自动化测试\\模态框\\confirm.html");
//    //休眠2秒
//    Thread.sleep(2000);
//    //点击按钮
//    chromeDriver.findElement(By.id("su")).click();
//    //休眠2秒
//    Thread.sleep(2000);
//    //找到对应的弹出框（switchTo.confirm），并用Alert类型去接收
//    Alert alert=chromeDriver.switchTo().alert();
//    //确认弹出框
//    //alert.accept();
//    //取消弹出框
//    //alert.dismiss();
//    //显示弹出框文本
//    System.out.println(alert.getText());

//    //iframe处理
//    chromeDriver.get("C:\\Users\\20961\\Desktop\\web自动化测试\\iframe框架\\a.html");
//    //在默认输入页面找输入框输入数据
//    chromeDriver.findElement(By.id("aa")).sendKeys("1111");
//    Thread.sleep(3000);
//    //进入第一个内嵌页面定位元素，输入数据
//    //切换成内嵌页面
//    chromeDriver.switchTo().frame("bframe");
//    chromeDriver.findElement(By.id("bb")).sendKeys("222");
//    Thread.sleep(3000);
//    //进入第二个内嵌页面定位元素，输入数据
//    //切换成内嵌页面
//    chromeDriver.switchTo().frame("cframe");
//    chromeDriver.findElement(By.id("cc")).sendKeys("333");
//    Thread.sleep(3000);
//    //回到默认的页面，否则会找不到元素
//    chromeDriver.switchTo().defaultContent();
//    //回到默认页面后，输入文字
//    chromeDriver.findElement(By.id("aa")).sendKeys("回到了默认页面");

//    //window处理
//    chromeDriver.get("C:\\Users\\20961\\Desktop\\web自动化测试\\windows切换\\a.html");
//    Thread.sleep(2000);
//    chromeDriver.findElement(By.id("aa")).sendKeys("第一个窗口");
//    //句柄
//    System.out.println("跳转前的句柄"+chromeDriver.getWindowHandle());
//    //切换B窗口
//    chromeDriver.findElement(By.id("bhre")).click();
//    Thread.sleep(2000);
//    System.out.println("跳转后的句柄"+chromeDriver.getWindowHandle());
//    //跳转前和跳转后的句柄都是一样的，所以句柄还是在a窗口中
//    //句柄可以视为标识浏览器窗口、标签页或页面内特定元素（如iframe、弹出对话框）的唯一标识符
//    //句柄的切换，先获取所有的窗口句柄，用Set<String>来接收
//    Set<String> handles= chromeDriver.getWindowHandles();
//    //对集合进行遍历
//    for(String handle :handles){
//      //切换句柄
//      chromeDriver.switchTo().window(handle);
//      //如果网页的标题为b网页，则句柄切换成功
//      if(chromeDriver.getTitle().equals("b.html")){
//        break;
//      }
//    }
//    Thread.sleep(3000);
//    chromeDriver.findElement(By.id("bb")).sendKeys("第二个窗口");

//    //select下拉框自动设置
//    chromeDriver.get("C:\\Users\\20961\\Desktop\\ceshi\\html\\html基础语法.html");
//    //定位到时间下拉框
//   WebElement webElement=chromeDriver.findElement(By.id("su"));
//   //把webElement封装成select对象
//    Select select=new Select(webElement);
//    //选择上海，索引值是从0开始的
//    select.selectByIndex(1);
//    Thread.sleep(3000);
//    //根据文字选择下拉框中的选项
//    select.selectByVisibleText("南京");

//    //时间日期控件自动定位和操作
//    chromeDriver.get("https://www.fliggy.com/");
//    //不限制输入，直接在输入框输入时间
//    chromeDriver.findElement(By.id("form_depDate")).sendKeys("2024,5,14");
//    //限制输入，只能选择时间
//    //
//    //

//      //鼠标操作
//     chromeDriver.get("https://www.treejs.cn/v3/demo/cn/exedit/drag.html");
//     //原来的元素定位
//     WebElement sourceElement= chromeDriver.findElement(By.id("treeDemo_2_a"));
//     //目标元素的定位
//     WebElement targetElement=chromeDriver.findElement(By.id("treeDemo_3_span"));
//     //实例化Actions对象，鼠标的相关操作
//     Actions actions=new Actions(chromeDriver);
//     Thread.sleep(3000);
//     //clickandhold点击然后按住原元素，move移动到目标元素的位置上，.release().build().perform()最后三个是固定的
//     actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();

//     //文件上传
//    //input写入文件路径上传,用sendkeys上传
//    chromeDriver.get("C:\\Users\\20961\\Desktop\\web自动化测试\\文件上传\\文件上传.html");
//    Thread.sleep(3000);
//    chromeDriver.findElement(By.id("aa")).sendKeys("C:\\Users\\20961\\Desktop\\web自动化测试\\文件上传\\R.jpg");
//    //上传
//    chromeDriver.findElement(By.id("bb")).click();
//    //第三方控件上传文件：autoit

    //验证码
    //万能验证码




  }
  public static void openChrome(){
    System.setProperty("webdriver.chrome.driver","C:\\IDEA\\Maven-project\\java01\\src\\test\\resource\\chromedriver.exe");
    chromeDriver=new ChromeDriver();
  }
}
