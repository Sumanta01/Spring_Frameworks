package com.docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerApp {
	public static void main(String[] args) throws MalformedURLException {
		
		
		ChromeOptions options = new ChromeOptions();
        URL url = new URL("http://localhost:4444/wd/hub");

        // Create a RemoteWebDriver instance with Chrome options
        RemoteWebDriver remoteWebDriver = new RemoteWebDriver(url, options);

        remoteWebDriver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Title of the page: " + remoteWebDriver.getTitle());

        remoteWebDriver.quit();
		
		
		
	}

	
	

}
