SUMMARY = "Server packagegroup"
DESCRIPTION = ""

inherit packagegroup

RDEPENDS:${PN} += "mc nano htop"
RDEPENDS:${PN} += "tcpdump iptables"
RDEPENDS:${PN} += "wireguard-tools"
