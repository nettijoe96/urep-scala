scala_library(
    name = "mainlib",
    srcs = glob(["*.scala"]),
    visibility = ["//visibility:public"],
    deps = ["//src/main/scala:mylib", "//src/main/scala:a", "//src/main/scala:common", "//src/main/scala/ipv6_test:ipv6_test", "@ipv6_jar//jar", "@third_party//3rdparty/jvm/com/softwaremill/macwire:macros_2_11"],
)