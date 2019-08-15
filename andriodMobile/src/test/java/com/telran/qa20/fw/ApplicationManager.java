package com.telran.qa20.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationManager {
    AppiumDriver driver;
    SessionHelper session;

    public void setSession(SessionHelper session) {
        this.session = session;
    }

    public void init() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "qa20_class");
        caps.setCapability("platformVersion", "8.0");
        caps.setCapability("automationName", "Appium");
        caps.setCapability("appPackage", "com.trello");
        caps.setCapability("appActivity", ".home.HomeActivity");
        caps.setCapability("app", "C:/Users/alex/Documents/alexandra/QA-20/Automation/com.trello_12562_apps.evozi.com.apk");


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        session= new SessionHelper(driver);

    }
    public SessionHelper getSession() {
        return session;
    }

    public void stop() {
    }
}
