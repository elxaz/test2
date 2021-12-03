Feature: test

  Scenario Outline: test

    Given go to page
    When step1
    Then enter <login> and <password>
    And step2
    Then next page loaded

    Examples:

    |login|password|
    |"lexa.pan2014@gmail.com"|"01122000"|
    |"123"                   |"123"     |