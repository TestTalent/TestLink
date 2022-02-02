package jobs.aog.pages.otherWebsite.facebook;

import jobs.aog.locators.Element;
import jobs.aog.locators.Page;
import jobs.aog.locators.XPath;

/**
 * Created by aaste on 01.12.2016.
 */
@Page
public class FacebookVisiblePage {
    private static Element facebookLogoLink = new XPath("//a[contains(.,'Facebook')]");
    private static Element userFullNameTextarea = new XPath("//a//span[contains(@id,'timeline-cover-name')]");

    public static Element getFacebookLogoLink() {
        return facebookLogoLink;
    }

    public static Element getUserFullNameTextarea() {
        return userFullNameTextarea;
    }
}
