package ch3_2_auto.page;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

import common.Configuration;


class Ex03VerifyTitleFail {
	@Test
	
	void testValidacionTitulo() {
        WebDriver driver = Configuration.createChromeDriver();
        driver.get(Configuration.BLOG_URL);
        String titulo_esperado="Your Store";
        String titulo_actual= driver.getTitle();
        assertEquals(titulo_esperado,titulo_actual,"VALIDACIÓN TITULO PAG PRINCIPAL");
        		
        driver.quit();
       
	}
	
	
}
