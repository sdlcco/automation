@All
 Feature: Thor Fi
 Background: Navigation
 Given user switches to first tab
 And user waits "3" seconds
 When user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "SwitchChainButton" button on "feature9" page
 @Thor
 Scenario: Claim Thor
 And user clicks "AvaxNetworkButton" button on "feature9" page
 Given user navigates to "https://app.thor.financial/farm"
 When user clicks "ThorClaimRewardsButton" button on "feature9" page
 And user waits "10" seconds
 Then user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "ConfirmButton" button on "feature9" page
 @Vapor
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
 @Drip
 Scenario: Hydrate Drip
 And user clicks "BinanceSmartChainButton" button on "feature9" page
 Given user navigates to "https://drip.community/faucet"
 When user clicks "DripHydrateButton" button on "feature9" page
 Then user switches to latest tab
 And user refreshes tab
 Then user waits for "10" seconds
 And user clicks "ConfirmButton" button on "feature9" page
 @Cubo
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
 @Farm
 Scenario: Harvest Farm
 And user clicks "BinanceSmartChainButton" button on "feature9" page
 Given user navigates to "https://theanimal.farm/farms"
 Then user waits for "10" seconds
 When user clicks "HarvestButton" button on "feature9" page
 Then user waits for "5" seconds
 Then user switches to latest tab
 Then user waits for "1" seconds
 And user clicks "ConfirmButton" button on "feature9" page