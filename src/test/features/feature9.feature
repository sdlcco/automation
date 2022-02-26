@Thor
 Feature: Thor Fi
 Background: Navigation
 Given user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "SwitchChainButton" button on "feature9" page
 Scenario: Claim Thor
 And user clicks "AvaxNetworkButton" button on "feature9" page
 Given user navigates to "https://app.thor.financial/farm"
 When user clicks "ThorClaimRewardsButton" button on "feature9" page
 And user waits "10" seconds
 Then user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "ConfirmButton" button on "feature9" page
 Scenario: Hydrate Drip
 And user clicks "BinanceSmartChainButton" button on "feature9" page
 Given user navigates to "https://drip.community/faucet"
 When user clicks "DripHydrateButton" button on "feature9" page
 Then user switches to latest tab
 And user refreshes tab
 Then user waits for "10" seconds
 And user clicks "ConfirmButton" button on "feature9" page
 Scenario: Claim Cubo
 And user clicks "PolygonMainnetButton" button on "feature9" page
 Given user navigates to "https://cubo.money/app#"
 And user waits for "15" seconds
 When user clicks "CuboCollectButton" button on "feature9" page
 And user waits for "3" seconds
 And user switches to latest tab
 And user refreshes tab
 And user waits for "5" seconds
 Then user clicks "ConfirmButton" button on "feature9" page
 Scenario: Compound Vapor
 And user clicks "AvaxNetworkButton" button on "feature9" page
 Given user navigates to "https://app.vapornodes.finance/nodes"
 When user mousehover clicks "CompoundallButton" button on "feature9" page
 When user mousehover clicks "CompoundAllButton" button on "feature9" page
 And user waits for "3" seconds
 And user switches to latest tab
 And user refreshes tab
 And user waits for "5" seconds
 Then user clicks "ConfirmButton" button on "feature9" page