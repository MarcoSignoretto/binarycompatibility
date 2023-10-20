pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}

rootProject.name = "BinaryCompatibility"
include(":app")
include(":moduleA")
include(":moduleB")
include(":moduleABinary")
include(":moduleBBinary")
include(":lib")
