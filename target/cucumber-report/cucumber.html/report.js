$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("logintest.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page Test",
  "description": "",
  "id": "login-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7858550900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User should see Orange HRM Logo",
  "description": "",
  "id": "login-page-test;user-should-see-orange-hrm-logo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    },
    {
      "line": 9,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I Should Verify Logo is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UserTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 171581300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iShouldVerifyLogoIsDisplayed()"
});
formatter.result({
  "duration": 197085700,
  "status": "passed"
});
formatter.after({
  "duration": 858234200,
  "status": "passed"
});
formatter.uri("usertest.feature");
formatter.feature({
  "line": 1,
  "name": "User Test",
  "description": "",
  "id": "user-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10831405700,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Search the user that created and Verify that user",
  "description": "",
  "id": "user-test;search-the-user-that-created-and-verify-that-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@smoke"
    },
    {
      "line": 19,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I Login to Application",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I click on Admin Tab",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I Should Verify System Users Text",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I enter Username",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I Select User Role",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I Select the Status Enable",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I Click on Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I Should Verify the User should be in Result list",
  "keyword": "Then "
});
formatter.match({
  "location": "UserTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 14800,
  "status": "passed"
});
formatter.match({
  "location": "UserTestSteps.iLoginToApplication()"
});
formatter.result({
  "duration": 1531125000,
  "status": "passed"
});
formatter.match({
  "location": "UserTestSteps.iClickOnAdminTab()"
});
formatter.result({
  "duration": 1332429400,
  "status": "passed"
});
formatter.match({
  "location": "UserTestSteps.iShouldVerifySystemUsersText()"
});
formatter.result({
  "duration": 512694100,
  "status": "passed"
});
formatter.match({
  "location": "UserTestSteps.iEnterUsername()"
});
formatter.result({
  "duration": 88250000,
  "status": "passed"
});
formatter.match({
  "location": "UserTestSteps.iSelectUserRole()"
});
formatter.result({
  "duration": 6986236600,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d113.0.5672.127)\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [ff2fff8bb22b916dcf1a92b5525e056f, clickElement {id\u003d9E0FE2D42190ECCD6FA421D6A9BDB4C4_element_27}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.127, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\44741\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50751}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50751/devtoo..., se:cdpVersion: 113.0.5672.127, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (ff2fff8bb22b916dcf1a92b5525e056f)] -\u003e xpath: //div[@class\u003d\u0027oxd-grid-4 orangehrm-full-width-grid\u0027]/div[2]/div/div[2]/div/div/div[2]/i]\nSession ID: ff2fff8bb22b916dcf1a92b5525e056f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:257)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:78)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat com.orangehrmlive.demo.utility.Utility.clickOnElement(Utility.java:52)\r\n\tat com.orangehrmlive.demo.pages.AddUserPage.selectAdminForUserRole(AddUserPage.java:84)\r\n\tat com.orangehrmlive.demo.steps.UserTestSteps.iSelectUserRole(UserTestSteps.java:89)\r\n\tat ✽.And I Select User Role(usertest.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserTestSteps.iSelectTheStatusEnable()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserTestSteps.iClickOnSearchButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserTestSteps.iShouldVerifyTheUserShouldBeInResultList()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 15120000,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d113.0.5672.127)\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [ff2fff8bb22b916dcf1a92b5525e056f, screenshot {}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.127, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\44741\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50751}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50751/devtoo..., se:cdpVersion: 113.0.5672.127, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: ff2fff8bb22b916dcf1a92b5525e056f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:598)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:602)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:318)\r\n\tat com.orangehrmlive.demo.utility.Utility.getScreenshot(Utility.java:334)\r\n\tat com.orangehrmlive.demo.Hooks.tearDown(Hooks.java:23)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n",
  "status": "failed"
});
});