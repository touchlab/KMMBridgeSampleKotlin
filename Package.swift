// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://touchlabtest.jfrog.io/artifactory/faktorygradle/KMMBridgeSampleKotlin/shared-kmmbridge/0.6.1666031825611/shared-kmmbridge-0.6.1666031825611.zip"
let remoteKotlinChecksum = "e1426054f2847fb1550acd170249902b362b8627e06ffe4254dd306c25ad1252"
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