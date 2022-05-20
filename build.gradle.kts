buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
//        implementation("org.jetbrains.kotlin:kotlin-stdlib")
    }
}
subprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}
