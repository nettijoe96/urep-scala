scala_library(
    name = "ipv6_test",
    srcs = glob(["*.scala"]),
    deps = ["@ipv6_jar//jar", "@third_party//3rdparty/jvm/com/softwaremill/macwire:macros_2_11"],
    visibility = ["//visibility:public"],
)

scala_binary(
    name = "ipv6_bin",
    srcs = glob(["*.scala"]),
    main_class = "IPv6_test",
    deps = ["@ipv6_jar//jar", "@third_party//3rdparty/jvm/com/softwaremill/macwire:macros_2_11"],
)
