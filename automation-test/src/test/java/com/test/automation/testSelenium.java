package com.test.automation;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.in28minutes.datadriventests.ExcelReadUtil;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class testSelenium extends AbstractWebDriverClass {
	@Test
	@Ignore

	public void testFacebookdotcom() {

		webDriver.get("http://www.facebook.com");
		System.out.println(webDriver.getTitle());
		System.out.println(webDriver.getCurrentUrl());
		String actualTitle = webDriver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		assertEquals(expectedTitle, actualTitle);

	}

	@Test
	@Ignore
	public void testAmazonWebElement() {

		webDriver.get("https://www.amazon.com");
		WebElement ele = webDriver.findElement(By.tagName("a"));
		// System.out.println(ele.getTagName());
		System.out.println(ele.getAttribute("href"));
		System.out.println(webDriver.getTitle());
		System.out.println(webDriver.getCurrentUrl());
		String actualTitle = webDriver.getTitle();
		String expectedTitle = "Amazon.com. Spend less. Smile more.";
		assertEquals(expectedTitle, actualTitle);

	}

	@Test
	@Ignore
	public void WebElement() {

		webDriver.get("http://127.0.0.1:8887/login.html");
		List<WebElement> eles = webDriver.findElements(By.tagName("a"));
		// System.out.println(ele.getTagName());
		for (WebElement ele : eles) {
			System.out.println(ele.getAttribute("href"));
			System.out.println(ele.getText());
			System.out.println(ele.getAttribute("class"));
		}

		System.out.println(webDriver.getTitle());
		System.out.println(webDriver.getCurrentUrl());
		String actualTitle = webDriver.getTitle();
		String expectedTitle = "New Shop a E-Commerce Online Shopping Category Flat Bootstrap Responsive Website Template | Login :: w3layouts";
		assertEquals(expectedTitle, actualTitle);

	}

	@Test
	@Ignore
	public void testLogin() throws InterruptedException {

		webDriver.get("https://miniguru.in/student/signIn");
		Thread.sleep(2000);
		WebElement email = webDriver.findElement(By.id("email"));
		email.sendKeys("azaz@gmail.com");
		Thread.sleep(2000);
		WebElement pass = webDriver.findElement(By.id("password"));
		pass.sendKeys("azaz123");
		Thread.sleep(2000);
		WebElement login = webDriver.findElement(By.id("submitStudentSignIn"));
		login.click();
	}

	@Test
	@Ignore
	public void testDemo() {
		webDriver.get("https://www.stealmylogin.com/demo.html");
		WebElement user = webDriver.findElement(By.name("username"));
		user.sendKeys("Arya@gmail.com");
		WebElement pass = webDriver.findElement(By.name("password"));
		pass.sendKeys("Password");
		WebElement btn = null;
		List<WebElement> inputTags = webDriver.findElements(By.tagName("input"));
		for (WebElement it : inputTags) {
			if (it.getAttribute("type").equals("submit")) {
				btn = it;
			}
		}
		btn.click();

		assertEquals("https://example.com/", webDriver.getCurrentUrl());
	}

	@DataProvider
	public static Object[][] linkDataProvider() {
		return (ExcelReadUtil.readExcelInto2DArray(".\\src\\test\\resources\\covidData.xlsx", "Sheet1", 23));
	}

	@Test
	@Ignore
	public void readExcel() {
		String[][] readExcelInto2DArray = ExcelReadUtil.readExcelInto2DArray(".\\src\\test\\resources\\hcsc.xlsx",
				"Sheet1", 1);
		System.out.println(Arrays.deepToString(readExcelInto2DArray));
	}

//	@Test
//	@Ignore
//	@UseDataProvider("linkDataProvider")
//	public void testNewShop(String lk) {
////		webDriver.get("http://www.testyou.in/Login.aspx");
//		webDriver.get(lk);
////		Thread.sleep(2000);
//		String lnk = webDriver.getPageSource();
//		// System.out.println(lnk);
//		System.out.println(lnk.contains("GTM-N53HMJJ"));
//		if (lnk.contains("GTM-N53HMJJ")) {
//			System.out.println("GTM code found at " + webDriver.getCurrentUrl());
//		} else {
//			System.out.println("Munchkin Code not found at " + webDriver.getCurrentUrl());
//		}
//
////		lnk.click();
////		System.out.println(webDriver.getCurrentUrl());
////		for(WebElement ele:lnk) {
////			System.out.println(ele.getText());
////		}
//
//	}

	@Test
	@UseDataProvider("linkDataProvider")
	public void testForms(String a, String b, String c, String d, String e, String f, String g, String h, String i,
			String j, String k, String l, String m, String n, String o, String p, String q, String r, String s,
			String t, String u, String v, String w) throws InterruptedException {
		ArrayList<String> arr = new ArrayList<String>(23);
		arr.add(a);
		arr.add(b);
		arr.add(c);
		arr.add(d);
		arr.add(e);
		arr.add(f);
		arr.add(g);
		arr.add(h);
		arr.add(i);
		arr.add(j);
		arr.add(k);
		arr.add(l);
		arr.add(m);
		arr.add(n);
		arr.add(o);
		arr.add(p);
		arr.add(q);
		arr.add(r);
		arr.add(s);
		arr.add(t);
		arr.add(u);
		arr.add(v);
		arr.add(w);
		int count = 0;
		webDriver.get(
				"https://docs.google.com/forms/d/e/1FAIpQLSc3nGqiS4HqfcwnnF-mlhsuckaRdpS8rZPXDesuOmvjPd6Y5A/viewform?usp=sf_link");
		Thread.sleep(3000);
		WebElement name = webDriver.findElement(By.xpath("//*[@id='i1']"));
		List<WebElement> nametb = webDriver.findElements(By.className("quantumWizTextinputPaperinputInput"));
		System.out.println(name.getText());
		
		for (WebElement nm : nametb) {
			//nm.click();
			nm.sendKeys(arr.get(count));
//			Thread.sleep(1000);
			count++;
		}
		arr.clear();
		count=0;
		WebElement submitBtn=webDriver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div/span/span"));
		submitBtn.click();
		Thread.sleep(2000);
//		WebElement anotherRes=webDriver.findElement(By.xpath());
//		System.out.println(arr);

	}
}
