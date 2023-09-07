plugins {
    id("java")
}

group = "klaxon.klaxon"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(files("libs/over_ecs-1.0.jar"))
}

tasks.test {
    useJUnitPlatform()
}