$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Test Vegetable Site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the Vegetable availale",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "VegetableTest.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "URL is \"https://rahulshettyacademy.com/seleniumPractise/#/\"",
  "keyword": "When "
});
formatter.match({
  "location": "VegetableTest.url_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches \"Tomato\" then Tomato should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "VegetableTest.user_searches_then_Tomato_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on top deals link",
  "keyword": "And "
});
formatter.match({
  "location": "VegetableTest.click_on_top_deals_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"GreenKart - veg and fruits kart\"",
  "keyword": "Then "
});
formatter.match({
  "location": "VegetableTest.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Tomato\" in search field",
  "keyword": "When "
});
formatter.match({
  "location": "VegetableTest.user_enters_in_search_field(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027search-field\u0027]\"}\n  (Session info: chrome\u003d107.0.5304.88)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-99ROH4T\u0027, ip: \u0027192.168.0.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002719\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.88, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:58295}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 26aa635a9766d4a903db6c9c669da04e\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027search-field\u0027]}\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:484)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.clear(Unknown Source)\r\n\tat PageObjects.VegetablePage.searchVegi(VegetablePage.java:61)\r\n\tat StepDefinitions.VegetableTest.user_enters_in_search_field(VegetableTest.java:73)\r\n\tat ✽.user enters \"Tomato\" in search field(file:Features/Login.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "VegetableTest.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});