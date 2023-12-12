package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest2;

public class Ex08HandlingFrames  extends BaseTest2{
//URL_FRAMES
	@Test
    public void addPost() throws InterruptedException{
       
		//Switch frame A by string id
		getDriver().switchTo().frame("id_frame_a");
        String title = "FRAME A";
        WebElement titleBox = getDriver().findElement(By.id("id_input-frame_a"));
        titleBox.sendKeys(title);
        Thread.sleep(3000);
        assertEquals(title, titleBox.getAttribute("value"), "Assert post title");
        
        // Once an iframe is handled, switch back to default content (dom root)
        getDriver().switchTo().defaultContent();
        
        
        //Switch frame B by string name
        String text = "FRAME B";
        getDriver().switchTo().frame("name_frame_b");
        WebElement content = getDriver().findElement(By.id("id_input-frame_b"));
        content.sendKeys(text);
        Thread.sleep(3000);

        //assertEquals(text, content.getText(), "Assert post content");
        
        //frame C by webelement
        WebElement frm_c = getDriver().findElement(By.id("id_frame_c"));
        getDriver().switchTo().frame(frm_c);
        String textC = "FRAME C";
        WebElement input = getDriver().findElement(By.id("id_input-frame_c"));
        input.sendKeys(textC);
        Thread.sleep(3000);

        //assertEquals(textC, input.getText(), "Assert post content");
        
        // Once an iframe is handled, switch back to default content (dom root)
        getDriver().switchTo().defaultContent();
        
        //Clicking on Publish Button
        String text_default = "FRAME DEFAULT";
        WebElement frm_default = getDriver().findElement(By.id("id_input-default"));
        frm_default.sendKeys(text_default);
        Thread.sleep(3000);

    }
}
