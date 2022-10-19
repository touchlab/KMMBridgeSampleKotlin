// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://touchlabtest.jfrog.io/artifactory/faktorygradle/KMMBridgeSampleKotlin/shared-kmmbridge/0.6.1666186801129/shared-kmmbridge-0.6.1666186801129.zip"
let remoteKotlinChecksum = "b8c6722de8d4d1ceb2c23fabe8cb578304c447d1caf7c077ca31357985f0f8ec"
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