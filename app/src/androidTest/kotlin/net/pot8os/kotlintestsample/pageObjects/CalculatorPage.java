package net.pot8os.kotlintestsample.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorPage {

    private final AndroidDriver driver;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Locators for buttons
    private final By digit1btn = By.id("net.pot8os.kotlintestsample:id/button_1");
    private final By digit2btn = By.id("net.pot8os.kotlintestsample:id/button_2");
    private final By digit3btn = By.id("net.pot8os.kotlintestsample:id/button_3");
    private final By digit4btn = By.id("net.pot8os.kotlintestsample:id/button_4");
    private final By digit5btn = By.id("net.pot8os.kotlintestsample:id/button_5");
    private final By digit6btn = By.id("net.pot8os.kotlintestsample:id/button_6");
    private final By digit7btn = By.id("net.pot8os.kotlintestsample:id/button_7");
    private final By digit8btn = By.id("net.pot8os.kotlintestsample:id/button_8");
    private final By digit9btn = By.id("net.pot8os.kotlintestsample:id/button_9");
    private final By digit0btn = By.id("net.pot8os.kotlintestsample:id/button_0");

    private final By divisionOperationBtn = By.id("net.pot8os.kotlintestsample:id/button_div");
    private final By multiplicationOperationBtn = By.id("net.pot8os.kotlintestsample:id/button_mul");
    private final By subtractionOperationBtn = By.id("net.pot8os.kotlintestsample:id/button_sub");
    private final By summationOperationBtn = By.id("net.pot8os.kotlintestsample:id/button_sum");

    private final By calculateResultBtn = By.id("net.pot8os.kotlintestsample:id/button_calc");
    private final By clearAllBtn = By.id("net.pot8os.kotlintestsample:id/button_all_clear");

    private final By calculationField = By.id("net.pot8os.kotlintestsample:id/field");

    public By getDigit2btn() {
        return digit2btn;
    }

    public By getDigit3btn() {
        return digit3btn;
    }

    public By getDigit4btn() {
        return digit4btn;
    }

    public By getDigit5btn() {
        return digit5btn;
    }

    public By getDigit6btn() {
        return digit6btn;
    }

    public By getDigit7btn() {
        return digit7btn;
    }

    public By getDigit8btn() {
        return digit8btn;
    }

    public By getDigit9btn() {
        return digit9btn;
    }

    public By getDigit0btn() {
        return digit0btn;
    }

    public By getDivisionOperationBtn() {
        return divisionOperationBtn;
    }

    public By getMultiplicationOperationBtn() {
        return multiplicationOperationBtn;
    }

    public By getSubtractionOperationBtn() {
        return subtractionOperationBtn;
    }

    public By getSummationOperationBtn() {
        return summationOperationBtn;
    }

    public By getCalculateResultBtn() {
        return calculateResultBtn;
    }

    public By getClearAllBtn() {
        return clearAllBtn;
    }

    public By getCalculationField() {
        return calculationField;
    }

    // Functions to tap buttons using their locators
    public void tapDigitButton(By buttonLocator) {
        WebElement button = driver.findElement(buttonLocator);
        button.click();
    }

    // Functions to tap individual digit buttons
    public void tapDigit1Btn() {
        tapDigitButton(digit1btn);
    }

    public void tapDigit2Btn() {
        tapDigitButton(digit2btn);
    }

    public void tapDigit3Btn() {
        tapDigitButton(digit3btn);
    }

    public void tapDigit4Btn() {
        tapDigitButton(digit4btn);
    }

    public void tapDigit5Btn() {
        tapDigitButton(digit5btn);
    }

    public void tapDigit6Btn() {
        tapDigitButton(digit6btn);
    }

    public void tapDigit7Btn() {
        tapDigitButton(digit7btn);
    }

    public void tapDigit8Btn() {
        tapDigitButton(digit8btn);
    }

    public void tapDigit9Btn() {
        tapDigitButton(digit9btn);
    }

    public void tapDigit0Btn() {
        tapDigitButton(digit0btn);
    }

    // Functions to tap operation buttons
    public void tapDivisionOperationBtn() {
        tapDigitButton(divisionOperationBtn);
    }

    public void tapMultiplicationOperationBtn() {
        tapDigitButton(multiplicationOperationBtn);
    }

    public void tapSubtractionOperationButton() {
        tapDigitButton(subtractionOperationBtn);
    }

    public void tapSummationOperationButton() {
        tapDigitButton(summationOperationBtn);
    }

    public void tapCalculateResultBtn() {
        tapDigitButton(calculateResultBtn);
    }

    public void tapClearAllBtn() {
        tapDigitButton(clearAllBtn);
    }

}