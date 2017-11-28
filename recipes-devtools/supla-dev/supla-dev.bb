# Copyright (C) 2017 Gardon Lukasz <garjack555@gmail.com>

DESCRIPTION = "Software for executive devices built based on Raspberry PI, Arduino or ESP8266 microcomputer."
HOMEPAGE = "https://www.supla.org/en/"
LICENSE = "CLOSED"

PR = "r1"

inherit supla-core

SRC_URI += "file://001-allows-to-use-cross-compiler-in-makefile-and-add-prefix-to-libs.patch"
S = "${WORKDIR}/git/supla-dev"

COMPATIBLE_MACHINE = "^rpi$"

DEPENDS = "openssl"

CXX += "-nostartfiles"

do_compile() {
    cd "${S}/Release/"
    make supla-dev
}    

do_install() {
    install -d ${D}${bindir}
    install -m 0755 "${S}/Release/supla-dev" ${D}${bindir}
}

FILES_${PN} += "${bindir}"
FILES_${PN}-dbg += "${bindir}/.debug/*"
