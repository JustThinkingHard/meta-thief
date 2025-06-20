SUMMARY = "Thief image with no graphics support"
DESCRIPTION = "no graphics support in this image"
LICENSE = "MIT"
inherit core-image

IMAGE_FEATURES:append = " package-management"

IMAGE_INSTALL:append = " networkmanager gnupg ntp ca-certificates coreutils git perl go python3-pip curl aircrack-ng" 

IMAGE_ROOTFS_EXTRA_SPACE = "5485760"
