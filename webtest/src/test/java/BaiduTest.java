import static org.junit.Assert.assertEquals;

import org.apache.tomcat.jni.Time;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaiduTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "B:/下载软件/火狐/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.baidu.com/");
	}

	@Test
	public void test01() {
		WebElement element01 = driver.findElement(By.id("kw"));
		element01.sendKeys("selenium");
		element01.submit();
	}
	
	@Test
	public void test02() {
		WebElement element02 = driver.findElement(By.cssSelector("#u1 > a.lb"));
		assertEquals(element02.getText(),"登录");
	}
	
	@Test
	public void test03() {
		WebElement element03 = driver.findElement(By.cssSelector("#u1 > a:nth-child(2)"));
		boolean result = element03.isDisplayed();
		System.out.println("新闻按钮是否可见："+result);
	}
	
	@Test
	public void test04() {
		WebElement element04 = driver.findElement(By.id("kw"));
		System.out.println("搜索框的尺寸为："+element04.getSize());
	}
	
//	@Test
//	void test05() {
//		WebElement element05 = driver.findElement(By.cssSelector("#u1 > a:nth-child(2)"));
//		assertEquals(element05.click().currentUrl,"http://news.baidu.com/");
//	}


}