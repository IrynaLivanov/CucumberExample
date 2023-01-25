Feature: To Test Login Functionality


  Background:
    Given user open website
    And verify user is on login page

  @Smoke
  Scenario: verify User Can Login Into Application
    When  user enter username "admin" password "admin123"
    Then verify home page is displayed
    And user open website

  @Smoke @Chirag
  Scenario Outline: verify User cannot Login with invalid credentials
    When user enter username "<username>" password "<password>"
    Then verify invalid login error message is displayed
    And close browser

    Examples:
      | username | password |
      | user     | test123  |
      | admin    | test123  |
      | user     | admin123 |
      | admin    |          |
      | admin    | admin123 |
      |          |          |

  Scenario: Verify dropdown options
    Then  verify dropdown options
      | Art      |
      | Baby     |
      | Books    |
      | Business |
      | Watches  |

Scenario: Verify data in the website
  Then verify table data
    | Airi Satou         | Accountant                    | Tokyo         | 33 | 11/27/2008 |
    | Angelica Ramos     | Chief Executive Officer (CEO) | London        | 47 | 10/8/2009  |
    | Ashton Cox         | Junior Technical Author       | San Francisco | 66 | 1/11/2009  |
    | Bradley Greer      | Software Engineer             | London        | 41 | 10/12/2012 |
    | Brenden Wagner     | Software Engineer             | San Francisco | 28 | 6/6/2011   |
    | Brielle Williamson | Integration Specialist        | New York      | 61 | 12/1/2012  |
    | Bruno Nash         | Software Engineer             | London        | 38 | 5/2/2011   |
    | Caesar Vance       | Pre-Sales Support             | New York      | 21 | 12/11/2011 |
    | Cara Stevens       | Sales Assistant               | New York      | 46 | 12/5/2011  |
    | Cedric Kelly       | Senior Javascript Developer   | Edinburgh     | 22 | 3/28/2012  |
