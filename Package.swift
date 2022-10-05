// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://api.github.com/repos/touchlab/KMMBridgeSampleKotlin/releases/assets/80073144.zip"
let remoteKotlinChecksum = "4c1e9a5d2cf360f4ff2fba4574f5acb6b0129868b8cdb8e043f641ddd8a08104"
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