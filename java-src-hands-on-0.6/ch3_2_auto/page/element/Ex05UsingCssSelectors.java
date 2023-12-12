package ch3_2_auto.page.element;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex05UsingCssSelectors extends BaseTest1 {

	/*
	 * Identifies Username text field with CSS Selector (Tag name)
	 */
	@Test
	void test01() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}

	/*
	 * Identifies Username text field with CSS Selector (Tag name and a given attribute)
	 */
	@Test
	void test02() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[type]"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}

	/*
	 * Identifies Password text field with CSS Selector (Tag name, a given attribute and attribute value)
	 */
	@Test
	void test03_01() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[type='password']"));
        SeleniumUtils.printElementInfo("Password text box", element);
	}

	/*
	 * Identifies Username text field with CSS Selector (ID - variant of test03)
	 */
	@Test
	void test03_02() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[id='input-email']"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}

	/*
	 * Identifies Username text field with CSS Selector (Class - variant of test03)
	 */
	@Test
	void test03_03() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[class='form-control']"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}
	
	/*
	 * Identifies Username text field with CSS Selector (Name - variant of test03)
	 */
	@Test
	void test03_04() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[name='email']"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}

	
	/*
	 * Identifies Username text field with CSS Selector Special Symbols - (# means ID)
	 */
	@Test
	void test04_01() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("#input-email"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}
	
	/*
	 * Identifies Username text field with CSS Selector Special Symbols - (. means Class)
	 */
	@Test
	void test04_02() throws Exception {
        WebElement element = driver.findElement(By.cssSelector(".form-control"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}


	/*
	 * Identifies Username text field with CSS Selector Special Symbols - (* to mean any tag)
	 */
	@Test
	void test04_03() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("*[name='email']"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}

	/*
	 * Identifies Username text field with CSS Selector - Relationship (Parent-Child). Denoted with > 
	 */
	@Test
	void test05_01() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("div>input"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}
	
	/*
	 * Identifies Username text field with CSS Selector - Relationship (Sibling) Denoted with +
	 */
	@Test
	void test05_02() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("label + #input-password"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}

	/*
	 * Identifies Username text field with CSS Selector - Partial Match - Contains - *=
	 */
	@Test
	void test06_01() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[id*='assw'"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}

	/*
	 * Identifies Username text field with CSS Selector - Partial Match - Start with - ^=
	 */
	@Test
	void test06_02() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[id^='input-pa'"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}
	
	/*
	 * Identifies Username text field with CSS Selector - Partial Match - Ends with - $=
	 */
	@Test
	void test06_03() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[id$='word"));
        SeleniumUtils.printElementInfo("User Name Text box", element);
	}

	/*
	 * Identifies Submit button with CSS Selector - Partial Match - Contains Word - ~=
	 */
	@Test
	void test06_04() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[class ~= 'form-control'][id='input-email']"));
        SeleniumUtils.printElementInfo("Log In button", element);
	}
	
	/*
	 * Identifies Username text field with CSS Selector - Logical OR (comma ,)
	 */
	@Test
	void test07_01() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input, *[name='email']"));
        SeleniumUtils.printElementInfo("Username text field", element);
	}
	
	/*
	 * Identifies User name text field with CSS Selector - You can give a class
	 * with . operator which acts as an and condition on the previous part of CSS Selector
	 */
	@Test
	void test07_02() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input.form-control"));
        SeleniumUtils.printElementInfo("Username text field", element);
	}

	/*
	 * Identifies Password text field with CSS Selector - You can give an identifier
	 * with # operator which acts as an and condition on the previous part of CSS Selector
	 */
	@Test
	void test07_03() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input#input-email"));
        SeleniumUtils.printElementInfo("Password text box", element);
	}


	/*
	 * Identifies Password text field with CSS Selector - Using not() function
	 */
	@Test
	void test07_04() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input:not([name='input-email'])"));
        SeleniumUtils.printElementInfo("Password text box", element);
	}
	
	/*
	 * Identifies Username text field with CSS Selector - Multiple Attr (only attr names)
	 */
	@Test
	void test08_01() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[type][name]"));
        SeleniumUtils.printElementInfo("Username text field", element);
	}
	
	/*
	 * Identifies Username text field with CSS Selector - Multiple Attr with values
	 */
	@Test
	void test08_02() throws Exception {
        WebElement element = driver.findElement(By.cssSelector("input[type='text'][name='email']"));
        SeleniumUtils.printElementInfo("Username text field", element);
	}
	


}
