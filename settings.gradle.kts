rootProject.name = "BodyProfile"
rootDir
    .walk()
    .maxDepth(2)
    .filter {
        it.name != "buildSrc" &&
        it.isDirectory &&
        file("${it.absolutePath}/build.gradle.kts").exists()
    }
    .forEach {
        if (it.parentFile.name != rootDir.name) {
            include(":${it.parentFile.name}:${it.name}")
        } else {
            include(":${it.name}")
        }
    }
