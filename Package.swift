// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://touchlabtest.jfrog.io/artifactory/faktorygradle/KMMBridgeSampleKotlin/shared-kmmbridge/0.6.1666192882571/shared-kmmbridge-0.6.1666192882571.zip"
let remoteKotlinChecksum = "15543f383381150f83a9dfec51c0a4de90a48576bdccda02f114050933aa7303"
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