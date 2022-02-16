@Thor
 Feature: Thor Fi
 Background: Navigation
 Given user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "SwitchChainButton" button on "feature11" page
 Scenario: Claim Thor
 And user clicks "AvaxButton" button on "feature11" page
 Given user navigates to "https://app.thor.financial/farm"
 When user clicks "ClaimRewardsButton" button on "feature11" page
 And user waits "10" seconds
 Then user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "ConfirmButton" button on "feature11" page
 Scenario: Hydrate Drip
 And user clicks "BinanceSmartChainButton" button on "feature11" page
 Given user navigates to "https://drip.community/faucet"
 And user mousehover clicks "ConnectWalletButton" button on "feature11" page
 And user clicks "ConnectToMetamaskButton" button on "feature11" page
 Then user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html" in new tab
 When user clicks "HydrateButton" button on "feature11" page
 Then user switches to latest tab
 And user refreshes tab
 Then user waits for "10" seconds
 And user clicks "ConfirmButton" button on "feature11" page
 Scenario: Claim Cubo
 And user clicks "PolygonMainnetButton" button on "feature11" page
 Given user navigates to "https://cubo.money/app#"
 And user waits for "15" seconds
 When user clicks "CollectButton" button on "feature11" page
 And user waits for "3" seconds
 And user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html" in new tab
 And user switches to latest tab
 And user waits for "5" seconds
 And user refreshes tab
 And user waits for "5" seconds
 Then user clicks "ConfirmButton" button on "feature11" page