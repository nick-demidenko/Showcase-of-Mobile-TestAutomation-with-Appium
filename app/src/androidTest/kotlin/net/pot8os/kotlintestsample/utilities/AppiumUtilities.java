package net.pot8os.kotlintestsample.utilities;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class AppiumUtilities {

    private static String appiumServerURL =
            "http://localhost:4723/wd/hub";
    private static String testingDeviceName =
            "Samsung_A54_API_34";
    private static String applicationFilePath =
            "/path/to/your/calculator.apk";
    private static String applicationPackageName =
            "package net.pot8os.kotlintestsample";
    private static String applicationMainActivity =
            "package net.pot8os.kotlintestsample.MainActivity";

    public static AndroidDriver createAppiumDriver() {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setAvd(testingDeviceName);
        options.setAppPackage(applicationPackageName);
        options.setAppActivity(applicationMainActivity);

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(appiumServerURL);

        try (CloseableHttpResponse response = httpClient.execute(httpGet)){
            String responseString = EntityUtils.toString(response.getEntity());
            return new AndroidDriver(new URL(responseString), options);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create Appium driver.");
        }
    }
}
