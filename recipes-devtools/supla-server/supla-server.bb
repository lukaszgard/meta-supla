# Copyright (C) 2017 Gardon Lukasz <garjack555@gmail.com>

DESCRIPTION = "Software for executive devices built based on Raspberry PI, Arduino or ESP8266 microcomputer."
HOMEPAGE = "https://www.supla.org/en/"
LICENSE = "CLOSED"

PR = "r1"

inherit supla-core

S = "${WORKDIR}/git/supla-server"

do_compile() {
    cd ${S}/Release/
    make supla-server
}
