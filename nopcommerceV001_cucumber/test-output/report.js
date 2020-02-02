$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Addcustomer.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com https://www.youtube.com/watch?v\u003dG5AW7gtHKY4"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "User add the customer in the site",
  "description": "I want to use this template for my feature file",
  "id": "user-add-the-customer-in-the-site",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "User add customer to database",
  "description": "",
  "id": "user-add-the-customer-in-the-site;user-add-customer-to-database",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@Addcustomer_TC"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User enters Email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User click on Customers menu",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User click on Customers Submenu",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User click on Add new button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#When User enters customer info \"\u003cemail\u003e\" \"\u003cpassword\u003e\" \"\u003cfname\u003e\" \"\u003clname\u003e\" \"\u003cgender\u003e\" \"\u003cdob\u003e\" \"\u003ccompname\u003e\" \"\u003cvalue\u003e\" \"\u003cvalue2\u003e\""
    }
  ],
  "line": 34,
  "name": "User enters customers info",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Page should contain \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User click on Log out link",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "duration": 4146342500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 1529629700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "Steps.user_enters_Email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 3331898000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "duration": 5255940500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 83444800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_Customers_menu()"
});
formatter.result({
  "duration": 3180306800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_Customers_Submenu()"
});
formatter.result({
  "duration": 3159981400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_Add_new_button()"
});
formatter.result({
  "duration": 1169368400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enters_customers_info()"
});
formatter.result({
  "duration": 1202908100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_save_button()"
});
formatter.result({
  "duration": 1969906400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully.",
      "offset": 21
    }
  ],
  "location": "Steps.page_should_contain(String)"
});
formatter.result({
  "duration": 149531800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "duration": 3025199000,
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-IVDV5BS\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\POWERB~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:59640}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 46b91e80702828548fffdb56428c9c05\n*** Element info: {Using\u003dlink text, value\u003dLogout}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat pageobjects.Loginpage.clickLogout(Loginpage.java:77)\r\n\tat stepdefinitions.Steps.user_click_on_Log_out_link(Steps.java:83)\r\n\tat ✽.When User click on Log out link(./Features/Addcustomer.feature:37)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});