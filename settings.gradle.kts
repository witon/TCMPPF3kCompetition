pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            setUrl("https://tmf-work-maven.pkg.coding.net/repository/tmf/android/")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
        maven {
            setUrl("https://tmf-work-maven.pkg.coding.net/repository/tmf/android/")
        }
    }
}

rootProject.name = "TCMPPF3kCompetition"
include(":app")
