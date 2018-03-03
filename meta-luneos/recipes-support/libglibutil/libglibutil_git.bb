SUMMARY = "Library of glib utilities"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://src/gutil_history.c;beginline=1;endline=31;md5=1c54614e6a69f1a8a246d298d62a242b"

PV = "1.0.28+gitr${SRCPV}"

SRC_URI = "git://git.merproject.org/mer-core/libglibutil.git"
SRCREV = "b535e47e5c598165bab8d9e0cafc5bb6a32d9b4b"

inherit pkgconfig

DEPENDS = "glib-2.0 gobject-introspection"

#INHIBIT_DEFAULT_DEPS = "1"

S = "${WORKDIR}/git"

do_install() {
	install -Dm 0644 ${S}/include/gutil_history.h ${D}${includedir}/gutil_history.h
	install -Dm 0644 ${S}/include/gutil_idlepool.h ${D}${includedir}/gutil_idlepool.h
	install -Dm 0644 ${S}/include/gutil_idlequeue.h ${D}${includedir}/gutil_idlequeue.h
	install -Dm 0644 ${S}/include/gutil_inotify.h ${D}${includedir}/gutil_inotify.h
	install -Dm 0644 ${S}/include/gutil_intarray.h ${D}${includedir}/gutil_intarray.h
	install -Dm 0644 ${S}/include/gutil_ints.h ${D}${includedir}/gutil_ints.h
	install -Dm 0644 ${S}/include/gutil_log.h ${D}${includedir}/gutil_log.h
	install -Dm 0644 ${S}/include/gutil_macros.h ${D}${includedir}/gutil_macros.h
	install -Dm 0644 ${S}/include/gutil_misc.h ${D}${includedir}/gutil_misc.h
	install -Dm 0644 ${S}/include/gutil_ring.h ${D}${includedir}/gutil_ring.h
	install -Dm 0644 ${S}/include/gutil_strv.h ${D}${includedir}/gutil_strv.h
	install -Dm 0644 ${S}/include/gutil_timenotify.h ${D}${includedir}/gutil_timenotify.h
	install -Dm 0644 ${S}/include/gutil_types.h ${D}${includedir}/gutil_types.h
}
