Feature: login
  Scenario: login
    Given user navigate "http://opencart.abstracta.us/"
    When  user source "mac"
    And   user save Product to System.setProperty
    And   user navigate new Window "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"
    And   user log in
    And   user click admin
    And   user write on username input this Product
    Then  user save Screen












