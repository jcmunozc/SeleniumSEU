package ch3_2_auto.page.element;

import common.BaseTest1;
import common.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class EjercicioLocators extends BaseTest1 {

    @Test
    public void test1_name() {
        WebElement locatorNombre = driver.findElement(By.name("email"));
        System.out.println(locatorNombre);
        SeleniumUtils.printElementInfo("Name", locatorNombre);
    }

    @Test
    public void test2_ID() {
        WebElement locatorID = driver.findElement(By.id("SubmitLogin"));
        System.out.println(locatorID);
        SeleniumUtils.printElementInfo("ID", locatorID);
    }

    @Test
    public void test3_LinkText() {
        WebElement locatorText = driver.findElement(By.linkText("Forgot your password?"));
        System.out.println(locatorText);
        SeleniumUtils.printElementInfo("Link text", locatorText);
    }

    @Test
    public void test4_PartialLink() {
        //Sirve cuando tenemos espacios, enters o caracteres que puedan afectar el locator de LinkText
        WebElement locatorPartial = driver.findElement(By.partialLinkText("F"));
        System.out.println(locatorPartial);
        SeleniumUtils.printElementInfo("Partial Link: ", locatorPartial);
    }

    @Test
    public void test5_className() {
        WebElement locatorClassName = driver.findElement(By.className("home"));
        System.out.println(locatorClassName);
        SeleniumUtils.printElementInfo("className", locatorClassName);
    }

    @Test
    public void test6_TagName() {
        WebElement locatorTagName = driver.findElement(By.tagName("h3"));
//        System.out.println(locatorTagName);
        SeleniumUtils.printElementInfo("tagName", locatorTagName);
    }
}
