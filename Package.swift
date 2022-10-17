// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://touchlabtest.jfrog.io/artifactory/faktorygradle/KMMBridgeSampleKotlin/shared-kmmbridge/0.6.1666026826305/shared-kmmbridge-0.6.1666026826305.zip"
let remoteKotlinChecksum = "5a9231f0a02283aee7722711fd79f71bed8c3e73ee07abe8c9f944e3bf8705c2"
let packageName = "shared"

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)