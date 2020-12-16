package(
    default_visibility = ["//visibility:public"],
)

scala_binary(
    name = "amm",
    srcs = [],
    deps = ["@third_party//3rdparty/jvm/com/lihaoyi:ammonite_2_12_8",
            "@third_party//3rdparty/jvm/org/typelevel:cats_core",
            "@third_party//3rdparty/jvm/org/typelevel:cats_effect",
            "@third_party//3rdparty/jvm/org/typelevel:squants",
            "@rediscala//:rediscala",
            "//src/main:mylib",],
    main_class = "ammonite.Main"
)


# this is the base docker image used for all scala_image targets
# adoptopenjdk is great, but their images do not have the `java` executable at the path expected by rules_docker

container_image(
    name = "custom_java_base",
    base = "@openjdk-base//image",
    symlinks = {"/usr/bin/java": "/opt/java/openjdk/bin/java"},
    visibility = ["//visibility:public"],
)
