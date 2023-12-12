package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ch5_2_auto.refactoring.Configuration;
import common.BaseTest2;

class Ex12KeyboardInteraction extends BaseTest2{
	
	/*
	 * Sending sequence of keys with Keys.chord
	 */
	//@Test
	void test01() throws Exception {
		String title = "Sample";
		WebElement postTitle = getDriver().findElement(By.name("search"));
		
		postTitle.sendKeys(Keys.chord(Keys.SHIFT, title));
		Thread.sleep(3000);
		assertEquals(title.toUpperCase(), postTitle.getAttribute("value"), "Assert upper case title");
	}
	
	/*
	 * Holding and releasing a key while other keystrokes are simulated
	 */
	@Test
	void test02() throws Exception {
		String title = "Sample";
		WebElement postTitle = getDriver().findElement(By.name("search"));
		
		Actions actions = new Actions(getDriver());
		actions.keyDown(Keys.SHIFT)
		.sendKeys(postTitle, title)
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		Thread.sleep(3000);
		
		assertEquals(title.toUpperCase(), postTitle.getAttribute("value"), "Assert upper case title");
	}
	
}
