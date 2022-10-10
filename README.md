# KMMBridgeSampleKotlin
Sample showing usage of the [KMMBridge](https://github.com/touchlab/KMMBridge) gradle plugin for publishing both Swift Package Manager and 
CocoaPods iOS frameworks using GitHub releases to store published artifacts. See [the setup guide](https://touchlab.github.io/KMMBridge/docs/DEFAULT_GITHUB_FLOW) for more info. 

## Project Structure
This repo contains an Android `app` module and a simple multiplatform `shared` module. The Android app depends on the `shared` module directly through a 
gradle project dependency. The `shared` module is also published as a CocoaPod remote podspec to [touchlab/PublicPodspecs](https://github.com/touchlab/PublicPodspecs/blob/main/README.md),
and as an SPM Package directly in this repo with a `Package.swift` in the repo root. Publishing is done with via a manually triggered GitHub action [here](https://github.com/touchlab/KMMBridgeSampleKotlin/blob/main/.github/workflows/main.yml) 
that demonstrates using the KMMBridgeGitHubWorkflow. 

The CocoaPod is used in [this project](https://github.com/touchlab/KMMBridgeSampleCocoaPods) and the SPM Package is used in [this project](https://github.com/touchlab/KMMBridgeSampleKotlin).  
