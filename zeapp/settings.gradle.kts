enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("androidx.*")
                includeGroupByRegex("com\\.google.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("androidx\\..*")
                includeGroupByRegex("com\\.android\\..*")
                includeGroupByRegex("com\\.google.*")
            }
        }
        maven {
            setUrl("https://jitpack.io")
            content {
                includeGroup("com.github.mik3y")
                includeGroup("com.github.Commit451.coil-transformations")
            }
        }
        mavenCentral()
    }
}

rootProject.name = "ZeBadge"
include(":android")
include(":benchmark")
include(":desktop")
include(":terminal")
include(":server")
include(":badge")
