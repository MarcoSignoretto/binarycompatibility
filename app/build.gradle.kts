plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":moduleA"))
    implementation(project(":moduleB"))
}