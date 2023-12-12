package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import common.BaseTest2;
import common.Configuration;

public class Ex07HandlingWindows  extends BaseTest2{
//URL_PRODUCTO_APPLE
	@Test
    public void createNewTab() throws InterruptedException{
		//Titulo actual
        System.out.println(getDriver().getTitle());
        String mainWin = getDriver().getWindowHandle();
        Thread.sleep(5000);
        
       // Open blog url in new window/tab
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        
        js.executeScript("window.open(arguments[0]);", Configuration.BLOG_URL);
        Thread.sleep(5000);
        
        //Busca pestaña diferente a main y la cierra
        for (String handle: getDriver().getWindowHandles()) {
            if (!handle.equals(mainWin)) {
                getDriver().switchTo().window(handle);
                System.out.println(getDriver().getTitle());
                getDriver().close();
            }
        }
        Thread.sleep(5000);
        //regreso a main
        getDriver().switchTo().window(mainWin);
        System.out.println(getDriver().getTitle());
        Thread.sleep(5000);
        // Assert that the new window was closed
        assertEquals(getDriver().getWindowHandles().size(), 1, "Verifying whether new window is closed");
    }
}
