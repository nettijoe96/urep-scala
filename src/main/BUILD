scala_library(
    name = "mylib",
    srcs = glob(["scala/lib/*.scala"]),
    visibility = ["//visibility:public"]
)

scala_binary(
    name = "main-bin2",
    srcs = [
            "scala/Main.scala",
            ],
    main_class = "Main",
    deps = [":mylib", "//src/main/scala/common:formatter"]
)

# scala_image(
#     name = "main-docker2",
#     srcs = [
#             "scala/Main.scala",
#             ],
#     base = "//:custom_java_base",
#     main_class = "Main",
#     deps = [":mylib"],
# )
