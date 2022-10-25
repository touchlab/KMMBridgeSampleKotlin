// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://gitlab.com/api/v4/projects/40400272/packages/maven/KMMBridgeSampleKotlin/shared-kmmbridge/0.6.1666703897449/shared-kmmbridge-0.6.1666703897449.zip"
let remoteKotlinChecksum = "bd8f21b6b8a71f73ffbb41d0af2906c570f4796b081266848a012611ca1703be"
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