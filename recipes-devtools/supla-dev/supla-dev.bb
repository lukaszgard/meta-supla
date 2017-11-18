# Copyright (C) 2017 Gardon Lukasz <garjack555@gmail.com>

DESCRIPTION = "Software for executive devices built based on Raspberry PI, Arduino or ESP8266 microcomputer."
HOMEPAGE = "https://www.supla.org/en/"
LICENSE = "CLOSED"

PR = "r1"

SRCREV = "0bfe2a48775b1b524f15e9c41684db08b31c6c67"

SRC_URI = "git://github.com/SUPLA/supla-core.git;protocol=https"

S = "${WORKDIR}/git/supla-dev"

do_compile() {
    cd ${S}/Release/ 
    make supla-dev
}    
