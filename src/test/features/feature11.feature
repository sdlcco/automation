@Thor
 Feature: Thor Fi
 Background: Navigation
 Given user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "button50" button on "feature11" page
 Scenario: Claim Thor
 And user clicks "button70" button on "feature11" page
 Given user navigates to "https://app.thor.financial/farm"
 When user clicks "button90" button on "feature11" page
 And user waits "10" seconds
 Then user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "button120" button on "feature11" page
 Scenario: Hydrate Drip
 And user clicks "button140" button on "feature11" page
 Given user navigates to "https://drip.community/faucet"
 And user clicks "button160" button on "feature11" page
 And user clicks "button170" button on "feature11" page
 Then user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html" in new tab
 When user clicks "button190" button on "feature11" page
 Then user switches to latest tab
 And user refreshes tab
 Then user waits for "10" seconds
 And user clicks "button230" button on "feature11" page