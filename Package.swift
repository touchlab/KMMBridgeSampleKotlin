// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/touchlab/KMMBridgeSampleKotlin/KMMBridgeSampleKotlin/shared-kmmbridge/0.8.1/shared-kmmbridge-0.8.1.zip"
let remoteKotlinChecksum = "2d7aa0f7574de2a97455af627d7e90b88393a68cd34f61d76a8f866a9e68254e"
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