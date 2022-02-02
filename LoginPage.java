package jobs.aog.pages.google;

import jobs.aog.locators.Element;
import jobs.aog.locators.Page;
import jobs.aog.locators.XPath;

@Page
public class LoginPage {
    private static Element emailInput = new XPath("//input[type='email']");
    private static Element emailNextButton = new XPath("//div[id='identifierNext']");
    private static Element passwordInput = new XPath("//input[@type='password']");
    private static Element passwordNextButton = new XPath("//div[id='passwordNext']");

    public static Element getEmailInput() {
        return emailInput;
    }

    public static Element getEmailNextButton() {
        return emailNextButton;
    }

    public static Element getPasswordInput() {
        return passwordInput;
    }

    public static Element getPasswordNextButton() {
        return passwordNextButton;
    }
}
