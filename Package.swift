// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://touchlabartifactory.jfrog.io/artifactory/example-repo-local//KMMBridgeSampleKotlin/shared-kmmbridge/0.8.3/shared-kmmbridge-0.8.3.zip"
let remoteKotlinChecksum = "ddbae078ec2f8b373ae3be301fa8114290321b70b77cbb521ee5c3d71c89310d"
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