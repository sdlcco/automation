@All
 Feature: Thor Fi
 Background: Navigation
 Given user switches to first tab
 And user waits "3" seconds
 When user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "MetamaskSwitchChainButton" button on "feature10" page
 Scenario: Claim Thor
 And user clicks "AvaxNetworkButton" button on "feature10" page
 Given user navigates to "https://app.thor.financial/farm"
 When user clicks "ThorClaimButton" button on "feature10" page
 And user waits "10" seconds
 Then user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "ConfirmButton" button on "feature10" page
 Scenario: Compound Vapor
 And user clicks "AvaxNetworkButton" button on "feature10" page
 Given user navigates to "https://app.vapornodes.finance/nodes"
 When user mousehover clicks "CompoundallButton" button on "feature9" page
 When user mousehover clicks "CompoundAllButton" button on "feature9" page
 And user waits for "3" seconds
 And user switches to latest tab
 And user refreshes tab
 And user waits for "5" seconds
 Then user clicks "ConfirmButton" button on "feature10" page
 Scenario: Hydrate Drip
 And user clicks "BinanceNetworkButton" button on "feature10" page
 Given user navigates to "https://drip.community/faucet"
 When user clicks "DripHydrateButton" button on "feature10" page
 Then user switches to latest tab
 And user refreshes tab
 Then user waits for "10" seconds
 And user clicks "ConfirmButton" button on "feature10" page
 Scenario: Claim Cubo
 And user clicks "PolygonNetworkButton" button on "feature9" page
 Given user navigates to "https://cubo.money/app#"
 And user waits for "15" seconds
 When user clicks "CuboCollectButton" button on "feature10" page
 And user waits for "3" seconds
 And user switches to latest tab
 And user refreshes tab
 And user waits for "5" seconds
 Then user clicks "ConfirmButton" button on "feature10" page
 Scenario: Harvest Farm
 And user clicks "BinanceNetworkButton" button on "feature10" page
 Given user navigates to "https://theanimal.farm/farms"
 Then user waits for "10" seconds
 When user clicks "FarmHarvestButton" button on "feature10" page
 Then user waits for "5" seconds
 Then user switches to latest tab
 Then user waits for "1" seconds
 And user clicks "ConfirmButton" button on "feature10" page