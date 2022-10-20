// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://gitlab.com/api/v4/projects/40398438/packages/maven/KMMBridgeSampleKotlin/shared-kmmbridge/0.6.1666294644675/shared-kmmbridge-0.6.1666294644675.zip"
let remoteKotlinChecksum = "130cc2e849dcae99658b773cfe58e6f7b0cfed3825af9b70c8fa322f5cc9191f"
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