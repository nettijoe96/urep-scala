scala_library(
    name = "mylib",
    srcs = glob(["lib/*.scala"]),
    visibility = ["//visibility:public"]
)

scala_library(
    name = "a",
    srcs = glob(["a/*.scala"]),
    visibility = ["//visibility:public"],
)

# scala_library(
#     name = "ipv6_test",
#     srcs = glob(["ipv6_test/*.scala"]),
#     deps = ["@ipv6_jar//jar"],
#     visibility = ["//visibility:public"],
# )

scala_binary(
    name = "main-bin",
    srcs = [
            "main/Main.scala",
            ],
    main_class = "Main",
    deps = [":mylib", ":a", "//src/ipv6_test:ipv6_test", "@ipv6_jar//jar"],
    #deps = [":mylib", ":a", "//src/ipv6_test:ipv6_test"],


)

scala_image(
    name = "main-docker",
    srcs = [
            "main/Main.scala",
            ],
    base = "//:custom_java_base",
    main_class = "Main",
    deps = [":mylib", ":a", "//src/ipv6_test:ipv6_test", "@ipv6_jar//jar"],
    #deps = [":mylib", ":a", "//src/ipv6_test:ipv6_test"],

)
