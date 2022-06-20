@Quest
 Feature: Submit Quest Timesheet
 Background:
 Given user navigates to "https://augustus.iqnavigator.com/security/login?service=https://augustus.iqnavigator.com/FO/CasRedirect"
 Scenario: Login and Enter Time
 When user enters "mhossain19" text on "UsernameText" textbox "feature12" page
 And user enters "PasswordTextboxText" text on "Password" textbox "feature12" page
 Then user clicks "LoginButton" button on "feature12" page