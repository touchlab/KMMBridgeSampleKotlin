// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://gitlab.com/api/v4/projects/40400272/packages/maven/KMMBridgeSampleKotlin/shared-kmmbridge/0.6.1666704070748/shared-kmmbridge-0.6.1666704070748.zip"
let remoteKotlinChecksum = "321dad57e95bb253a7e3dfa89f5588f20ff94227bc481c64068de33cdd9568c3"
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