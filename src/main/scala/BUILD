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


scala_library(
    name = "common",
    srcs = glob(["common/*.scala"]),
    visibility = ["//visibility:public"],
    deps = ["@third_party//3rdparty/jvm/com/typesafe/play:play_2_11", "@third_party//3rdparty/jvm/com/typesafe/play:play_json_2_11", "@third_party//3rdparty/jvm/org/reactivemongo:play2_reactivemongo_2_12"]
)

scala_binary(
    name = "main-bin",
    # srcs = [
    #         "//src/main/scala/main2/*.scala",
    #         ],
    main_class = "Main",
    deps = ["//src/main/scala/main2:mainlib", ":mylib", ":a", ":common", "//src/main/scala/ipv6_test:ipv6_test", "@ipv6_jar//jar", "@third_party//3rdparty/jvm/com/softwaremill/macwire:macros_2_11"],
)

# scala_image(
#     name = "main-docker",
#     srcs = [
#             "main/Main.scala",
#             ],
#     base = "//:custom_java_base",
#     main_class = "Main",
#     deps = [":mylib", ":a", "//src/repository:repository", "//src/ipv6_test:ipv6_test", "@ipv6_jar//jar", "@third_party//3rdparty/jvm/com/softwaremill/macwire:macros_2_11"],
# )
