LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://socket.c file://config.c file://client.c file://mbuf_cache.c file://udp.c file://port.c file://mbuf.c file://arp.c file://icmp.c file://tcp.c file://tick.c file://http.c file://net_stats.c file://flow.c file://work_space.c file://cpuload.c file://config_keyword.c file://socket_timer.c file://ip.c file://eth.c file://server.c file://dpdk.c file://ctl.c file://icmp6.c file://neigh.c file://vxlan.c file://csum.c file://kni.c file://bond.c file://lldp.c file://rss.c file://ip_list.c file://http_parse.c file://trace.c file://socket.h file://config.h file://client.h file://mbuf_cache.h file://udp.h file://port.h file://mbuf.h file://arp.h file://icmp.h file://tcp.h file://tick.h file://http.h file://net_stats.h file://flow.h file://work_space.h file://cpuload.h file://config_keyword.h file://socket_timer.h file://ip.h file://eth.h file://server.h file://dpdk.h file://ctl.h file://icmp6.h file://neigh.h file://vxlan.h file://csum.h file://kni.h file://bond.h file://lldp.h file://rss.h file://ip_list.h file://http_parse.h file://trace.h file://loop.h file://version.h file://ip_range.h file://main.c"

S = "${WORKDIR}"

COMPATIBLE_MACHINE = "qemux86-64"
COMPATIBLE_HOST:libc-musl:class-target = "null"
COMPATIBLE_HOST:linux-gnux32 = "null"

DEPENDS = "dpdk dpdk-module"

inherit pkgconfig

do_compile(){
	${CC} ${CFLAGS} ${LDFLAGS} ${WORKDIR}/main.c ${WORKDIR}/socket.c ${WORKDIR}/config.c ${WORKDIR}/client.c ${WORKDIR}/mbuf_cache.c ${WORKDIR}/udp.c ${WORKDIR}/port.c ${WORKDIR}/mbuf.c ${WORKDIR}/arp.c ${WORKDIR}/icmp.c ${WORKDIR}/tcp.c ${WORKDIR}/tick.c ${WORKDIR}/http.c ${WORKDIR}/net_stats.c ${WORKDIR}/flow.c ${WORKDIR}/work_space.c ${WORKDIR}/cpuload.c ${WORKDIR}/config_keyword.c ${WORKDIR}/socket_timer.c ${WORKDIR}/ip.c ${WORKDIR}/eth.c ${WORKDIR}/server.c ${WORKDIR}/dpdk.c ${WORKDIR}/ctl.c ${WORKDIR}/icmp6.c ${WORKDIR}/neigh.c ${WORKDIR}/vxlan.c ${WORKDIR}/csum.c ${WORKDIR}/kni.c ${WORKDIR}/bond.c ${WORKDIR}/lldp.c ${WORKDIR}/rss.c ${WORKDIR}/ip_list.c ${WORKDIR}/http_parse.c ${WORKDIR}/trace.c -I=${WORKDIR}/socket.c -I=${WORKDIR}/config.c -I=${WORKDIR}/client.c -I=${WORKDIR}/mbuf_cache.c -I=${WORKDIR}/udp.c -I=${WORKDIR}/port.c -I=${WORKDIR}/mbuf.c -I=${WORKDIR}/arp.c -I=${WORKDIR}/icmp.c -I=${WORKDIR}/tcp.c -I=${WORKDIR}/tick.c -I=${WORKDIR}/http.c -I=${WORKDIR}/net_stats.c -I=${WORKDIR}/flow.c -I=${WORKDIR}/work_space.c -I=${WORKDIR}/cpuload.c -I=${WORKDIR}/config_keyword.c -I=${WORKDIR}/socket_timer.c -I=${WORKDIR}/ip.c -I=${WORKDIR}/eth.c -I=${WORKDIR}/server.c -I=${WORKDIR}/dpdk.c -I=${WORKDIR}/ctl.c -I=${WORKDIR}/icmp6.c -I=${WORKDIR}/neigh.c -I=${WORKDIR}/vxlan.c -I=${WORKDIR}/csum.c -I=${WORKDIR}/kni.c -I=${WORKDIR}/bond.c -I=${WORKDIR}/lldp.c -I=${WORKDIR}/rss.c -I=${WORKDIR}/ip_list.c -I=${WORKDIR}/http_parse.c -I=${WORKDIR}/trace.c -I=${WORKDIR}/socket.h -I=${WORKDIR}/config.h -I=${WORKDIR}/client.h -I=${WORKDIR}/mbuf_cache.h -I=${WORKDIR}/udp.h -I=${WORKDIR}/port.h -I=${WORKDIR}/mbuf.h -I=${WORKDIR}/arp.h -I=${WORKDIR}/icmp.h -I=${WORKDIR}/tcp.h -I=${WORKDIR}/tick.h -I=${WORKDIR}/http.h -I=${WORKDIR}/net_stats.h -I=${WORKDIR}/flow.h -I=${WORKDIR}/work_space.h -I=${WORKDIR}/cpuload.h -I=${WORKDIR}/config_keyword.h -I=${WORKDIR}/socket_timer.h -I=${WORKDIR}/ip.h -I=${WORKDIR}/eth.h -I=${WORKDIR}/server.h -I=${WORKDIR}/dpdk.h -I=${WORKDIR}/ctl.h -I=${WORKDIR}/icmp6.h -I=${WORKDIR}/neigh.h -I=${WORKDIR}/vxlan.h -I=${WORKDIR}/csum.h -I=${WORKDIR}/kni.h -I=${WORKDIR}/bond.h -I=${WORKDIR}/lldp.h -I=${WORKDIR}/rss.h -I=${WORKDIR}/ip_list.h -I=${WORKDIR}/http_parse.h -I=${WORKDIR}/trace.h -I=${WORKDIR}/loop.h -I=${WORKDIR}/version.h -I=${WORKDIR}/ip_range.h -include rte_config.h -O3 -g -DHTTP_PARSE -Wno-address-of-packed-member -o dperf -lpthread -lrte_net_bond -lrte_bus_pci -lrte_bus_vdev -lrte_node -lrte_graph -lrte_pipeline -lrte_table -lrte_pdump -lrte_port -lrte_fib -lrte_ipsec -lrte_vhost -lrte_stack -lrte_security -lrte_sched -lrte_reorder -lrte_rib -lrte_dmadev -lrte_mldev -lrte_regexdev -lrte_rawdev -lrte_power -lrte_pcapng -lrte_member -lrte_lpm -lrte_latencystats -lrte_kni -lrte_jobstats -lrte_ip_frag -lrte_gso -lrte_gro -lrte_gpudev -lrte_eventdev -lrte_efd -lrte_distributor -lrte_cryptodev -lrte_compressdev -lrte_cfgfile -lrte_bpf -lrte_bitratestats -lrte_bbdev -lrte_acl -lrte_timer -lrte_hash -lrte_metrics -lrte_cmdline -lrte_pci -lrte_ethdev -lrte_meter -lrte_net -lrte_mbuf -lrte_mempool -lrte_rcu -lrte_ring -lrte_eal -lrte_telemetry -lrte_kvargs
}

do_install:append(){
    # Install examples
    install -d ${D}${bindir}
    install -m 0755 dperf ${D}${bindir}
}



