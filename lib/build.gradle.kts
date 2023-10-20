plugins {
    kotlin("jvm")
    id("maven-publish")
}

kotlin {
    explicitApi()
}

version = "1.0.0"
group = "com.msignoretto"


publishing {
    publications {
        create<MavenPublication>("lib") {
            from(components["kotlin"])
        }
    }
}
