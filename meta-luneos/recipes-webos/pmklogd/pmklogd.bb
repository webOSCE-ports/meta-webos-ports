# Copyright (c) 2011-2014 LG Electronics, Inc.

SUMMARY = "Kernel logging daemon"
SECTION = "webos/base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "glib-2.0"

PV = "2.0.0-17+git${SRCPV}"
SRCREV = "a522e00024095613fb0501ea1875c464c7463282"

inherit webos_public_repo
inherit webos_cmake
inherit pkgconfig

SRC_URI = "${OPENWEBOS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"
