plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":moduleA"))
    implementation(project(":moduleABinary"))
    implementation(project(":moduleB"))
    implementation(project(":moduleBBinary"))
}