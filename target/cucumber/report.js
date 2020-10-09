$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/crm/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate Free CRM HOme Page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is on login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate signup button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate classic CRM",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_opens_browser()"
});
formatter.result({
  "duration": 18044712900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_Page()"
});
formatter.result({
  "duration": 22270400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.validate_signup_button()"
});
formatter.result({
  "duration": 55157800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.validate_classic_CRM()"
});
formatter.result({
  "duration": 27648500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_logs_into_app()"
});
formatter.result({
  "duration": 337468800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.validate_home_page_title()"
});
formatter.result({
  "duration": 7788900,
  "error_message": "java.lang.AssertionError: expected [Cogmento CR] but found [Cogmento CRM]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:575)\r\n\tat org.testng.Assert.assertEquals(Assert.java:585)\r\n\tat com.qa.crm.stepdefinition.LoginStepDefinition.validate_home_page_title(LoginStepDefinition.java:65)\r\n\tat ✽.Then validate home page title(src/main/java/com/qa/crm/features/Login.feature:11)\r\n",
  "status": "failed"
});
});