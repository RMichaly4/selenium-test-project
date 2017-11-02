package com.mycompany.selenium.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class WebDriverHelper {
    public static void selectDropdownValueByText(WebElement dropdownElement, String visibleText) {
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(visibleText);

    }
}