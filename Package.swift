// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://api.github.com/repos/touchlab/KMMBridgeSampleKotlin/releases/assets/80065174.zip"
let remoteKotlinChecksum = "fd96f700f51a9afdf4eee9286bfcb879385944bb550b3d8515d86fa16c84d289"
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