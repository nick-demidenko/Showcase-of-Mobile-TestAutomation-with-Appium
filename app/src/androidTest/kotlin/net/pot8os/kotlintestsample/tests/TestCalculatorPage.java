package net.pot8os.kotlintestsample.tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URL;


import net.pot8os.kotlintestsample.pageObjects.CalculatorPage;
import net.pot8os.kotlintestsample.utilities.AppiumUtilities;

@RunWith(JUnit4.class)
public class TestCalculatorPage {

    private AndroidDriver driver;
    private CalculatorPage calculatorPage;

    @Before
    public void setup() {
        driver = AppiumUtilities.createAppiumDriver();
        calculatorPage = new CalculatorPage(driver);
    }

    @Test
    public void testInputProvisioningAndCleanup() {
        calculatorPage.tapDigit1Btn();
        calculatorPage.tapDigit2Btn();
        calculatorPage.tapDigit3Btn();
        String text = driver.findElement(calculatorPage.getCalculationField()).getText();
        assertEquals("123", text);
        calculatorPage.tapClearAllBtn();
        text = driver.findElement(calculatorPage.getCalculationField()).getText();
        assertEquals("0", text);
    }

    @Test
    public void testSummation() {
        calculatorPage.tapDigit1Btn();
        calculatorPage.tapDigit2Btn();
        calculatorPage.tapDigit3Btn();
        calculatorPage.tapSummationOperationButton();
        calculatorPage.tapDigit4Btn();
        calculatorPage.tapDigit5Btn();
        calculatorPage.tapDigit6Btn();
        calculatorPage.tapCalculateResultBtn();
        String text = driver.findElement(calculatorPage.getCalculationField()).getText();
        assertEquals("579", text);
        calculatorPage.tapClearAllBtn();
    }

    @Test
    public void testSubtraction() {
        calculatorPage.tapDigit8Btn();
        calculatorPage.tapDigit5Btn();
        calculatorPage.tapDigit0Btn();
        calculatorPage.tapSubtractionOperationButton();
        calculatorPage.tapDigit2Btn();
        calculatorPage.tapDigit5Btn();
        calculatorPage.tapCalculateResultBtn();
        String text = driver.findElement(calculatorPage.getCalculationField()).getText();
        assertEquals("825", text);
        calculatorPage.tapClearAllBtn();
    }

    @Test
    public void testDivision() {
        calculatorPage.tapDigit9Btn();
        calculatorPage.tapDigit9Btn();
        calculatorPage.tapDigit9Btn();
        calculatorPage.tapDivisionOperationBtn();
        calculatorPage.tapDigit3Btn();
        calculatorPage.tapDigit3Btn();
        calculatorPage.tapDigit3Btn();
        calculatorPage.tapCalculateResultBtn();
        String text = driver.findElement(calculatorPage.getCalculationField()).getText();
        assertEquals("3", text);
        calculatorPage.tapClearAllBtn();
    }

    @Test
    public void testMultiplication() {
        calculatorPage.tapDigit9Btn();
        calculatorPage.tapDigit9Btn();
        calculatorPage.tapDigit9Btn();
        calculatorPage.tapMultiplicationOperationBtn();
        calculatorPage.tapDigit3Btn();
        calculatorPage.tapDigit3Btn();
        calculatorPage.tapDigit3Btn();
        calculatorPage.tapCalculateResultBtn();
        String text = driver.findElement(calculatorPage.getCalculationField()).getText();
        assertEquals("332,667", text);
        calculatorPage.tapClearAllBtn();
    }

    @After
    public void tearDown() {
        try {
                driver.quit();
        } catch (NullPointerException e) {
            System.err.println("Error quitting Appium driver.");
        }
    }



}