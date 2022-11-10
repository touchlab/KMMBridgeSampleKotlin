// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/touchlab/KMMBridgeSampleKotlin/KMMBridgeSampleKotlin/shared-kmmbridge/0.7.1668108741559/shared-kmmbridge-0.7.1668108741559.zip"
let remoteKotlinChecksum = "1c3755d679937ce8809c6ec1cd6ca9bd83be8438a7b7bc7a2f6b6ba9e8824918"
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