# KMMBridgeSampleKotlin
Sample showing usage of the [KMMBridge](https://github.com/touchlab/KMMBridge) gradle plugin for publishing both Swift Package Manager and 
CocoaPods iOS frameworks using Github releases to store published artifacts. See [the setup guide](https://github.com/touchlab/KMMBridge/blob/main/docs/DEFAULT_GITHUB_FLOW.md) for more info. 

## Project Structure
This repo contains an Android `app` module and a simple multiplatform `shared` module. The Android app depends on the `shared` module directly through a 
gradle project dependency. The `shared` module is also published as CocoaPod remote podspec to [this repo](https://github.com/touchlab/PublicPodspecs/blob/main/README.md)
as an an SPM Package directly in this repo with a `Package.swift` in the repo root. Publishing is done with via a manually triggered GitHub action [here](https://github.com/touchlab/KMMBridgeSampleKotlin/blob/main/.github/workflows/main.yml) 
that demonstrates using the KMMBridgeGitHubWorkflow. 

The CocoaPod is used in [this project](https://github.com/touchlab/KMMBridgeSampleCocoaPods) and the SPM Package is used in [this project](https://github.com/touchlab/KMMBridgeSampleKotlin).  
