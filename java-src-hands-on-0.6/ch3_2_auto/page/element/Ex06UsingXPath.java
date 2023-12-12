package ch3_2_auto.page.element;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex06UsingXPath extends BaseTest1 {
	
	/*
	 * Identifies Username text field with Absolute XPath (Tag name)
	 * Don't do this in pofessional work. Absolute XPaths are evil :-)
	 */
	//@Test
	void test00() throws Exception {
        WebElement element = driver.findElement(By.xpath("/html/body/div/form/p/label/input"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}

	/*
	 * Now onwards we stick to relative XPaths as abolsute xpaths brittle
	 * Identifies Username text field with XPath (Tag name)
	 */
	@Test
	void test01() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}
	
	
	/*
	 * Identifies Username text field with XPath (Tag name and attr name)
	 */
	@Test
	void test02() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@type]"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}
	
	/*
	 * Identifies Password text field with XPath (Tag name and attr value)
	 */
	@Test
	void test03_01() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
        SeleniumUtils.printElementInfo("Password text box", element);
	}
	
	/*
	 * Identifies Username text field with XPath - Variant of test03_01: ID
	 */
	@Test
	void test03_02() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@id='input-email']"));
        SeleniumUtils.printElementInfo("Username text field", element);
	}

	/*
	 * Identifies Username text field with XPath - Variant of test03_01: Class Name
	 */
	@Test
	void test03_03() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@class='form-control']"));
        SeleniumUtils.printElementInfo("Username text field", element);
	}

	/*
	 * Identifies Username text field with XPath - Variant of test03_01: Name
	 */
	@Test
	void test03_04() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
        SeleniumUtils.printElementInfo("Username text field", element);
	}	

	/*
	 * Identifies Username text field with XPath - Variant of test03_01: Any Tag with attr value
	 */
	@Test
	void test03_05() throws Exception {
        WebElement element = driver.findElement(By.xpath("//*[@name='email']"));
        SeleniumUtils.printElementInfo("Username text field", element);
	}	

	
	/*
	 * Identifies Lost your password link with XPath - Text
	 */
	@Test
	void test04() throws Exception {
        WebElement element = driver.findElement(By.xpath("//*[text()='Forgotten Password']"));
        SeleniumUtils.printElementInfo("Password Lost link", element);
	}
	
	/*
	 * Identifies Username text field with XPath - Relationships - Child
	 */
	@Test
	void test05_01() throws Exception {
        WebElement element = driver.findElement(By.xpath("//div/input[@id='input-email']"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}

	/*
	 * Identifies Username text field with XPath - Relationships - Following Sibling
	 */
	@Test
	void test05_02() throws Exception {
        WebElement element = driver.findElement(By.xpath("//label/following-sibling::input[@id='input-email']"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}
	
	/*
	 * Identifies Username text field with XPath - Partial Match - Attr value Contains
	 */
	@Test
	void test06_01() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[contains(@id, 'ass')]"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}
	
	/*
	 * Identifies Username text field with XPath - Partial Match - Attr value Starts With
	 */
	@Test
	void test06_02() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[starts-with(@id, 'input-pass')]"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}
	
	/*
	 * Identifies Username text field with XPath - Partial Match - Attr value Ends With
	 * NO SOPORTADO
	 */
	@Test
	void test06_03() throws Exception {
		// ends-with is not supported in current browsers. As it requires Xpath 2.0 where
		// all browsers use Xpath 1.0
		WebElement userNameTxtField = driver.findElement(By.xpath("//*[ends-with(@id, 'password')]"));
        System.out.println(userNameTxtField);
	}
	
	
	/*
	 * Identifies Lost Password link with XPath - Partial Match - Text contains
	 */
	@Test
	void test06_04() throws Exception {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'Forgotten')]"));
        SeleniumUtils.printElementInfo("Lost password link", element);
	}

	/*
	 * Identifies ULost Password link with XPath - Partial Match - Text starts with
	 */
	@Test
	void test06_05() throws Exception {
        WebElement element = driver.findElement(By.xpath("//a[starts-with(text(), 'Forgotten')]"));
        SeleniumUtils.printElementInfo("Lost password link", element);
	}
	
	/*
	 * Identifies Username text box with XPath - Logical OR : Using or keyword
	 */
	@Test
	void test07_01() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@class='input' or @id ='input-email']"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}

	/*
	 * Identifies Password text field with XPath - Logical AND : Using and keyword
	 */
	@Test
	void test07_02() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@type='text' and @id='input-email']"));
        SeleniumUtils.printElementInfo("Password text box", element);
	}


	/*
	 * Identifies Password text field with XPath - Logical Not : Using not() function
	 */
	@Test
	void test07_03() throws Exception {
        WebElement element = driver.findElement(By.xpath("//*[@class='form-control' and not(@name ='email')]"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}
	
	/*
	 * Identifies Form with XPath - Hierarchy (Axis) - Parent
	 */
	@Test
	void test08_01() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@id='input-email']/../.."));
        SeleniumUtils.printElementInfo("Login Form", element);
	}
	
	/*
	 * Identifies Username text field with XPath - Hierarchy (Axis) - Descendant (Using // instead of / between form and input)
	 */
	@Test
	void test08_02() throws Exception {
        WebElement element = driver.findElement(By.xpath("//form//input[@id='input-email']"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}
	
	/*
	 * Identifies Form with XPath - Hierarchy (Axis) - Ancestor (Using /ancestor)
	 */
	@Test
	void test08_03() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@id='input-email']/ancestor::form"));
        SeleniumUtils.printElementInfo("Form", element);
	}

	/*
	 * Identifies Username text field with XPath - Hierarchy (Axis) - Preceding Sibling (starting from submit paragraph)
	 */
	@Test
	void test08_04() throws Exception {
        WebElement element = driver.findElement(By.xpath("//div/preceding-sibling::div/input[@id='input-email']"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}


	/*
	 * Identifies Username text field with XPath - Index (Index uses Human counting)
	 * This variant looks at chidren of the same parent.
	 * That is the reason //input[2] does not point to Password field
	 */
	@Test
	void test09_01() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[2]"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}

	/*
	 * Identifies Username text field with XPath - Index (Index uses Human counting)
	 * This variant looks at elements across the DOM.
	 * Here (//input)[2] would point to password field
	*/
	@Test
	void test09_02() throws Exception {
        WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}
	
	/*
	 * Identifies Username text field with XPath - Multi attr names
	 */
	@Test
	void test10_01() throws Exception {
        WebElement element = driver.findElement(By.xpath("//input[@type and @name]"));
        SeleniumUtils.printElementInfo("Username text box", element);
	}
	
	/*
	 * Identifies Username text field with XPath - Multi attr names and values
	 */
	@Test
	void test10_02() throws Exception {
        WebElement element = driver.findElement(By.xpath("//*[@class='form-control' and @name='password']"));
        SeleniumUtils.printElementInfo("Password text box", element);
	}

}
