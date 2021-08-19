object Kotlin {
    const val standardLibrary = "1.5.21"
}

object Project {
    object Versions {
        const val buildToolsVersion = "7.0.1"
        const val kotlinStdLibVersion = Kotlin.standardLibrary
    }

    object BuildPlugins {
        const val androidGradlePlugin =
            "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
        const val kotlinGradlePlugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinStdLibVersion}"
    }
}

object App {
    object AndroidConfigs {
        const val applicationId = "com.reloler.bodyprofile"
        const val minSdk = 23
        const val compileSdk = 31
        const val targetSdk = 31
        const val versionCode = 1
        const val versionName = "1.0.0"
        const val testRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    object BuildPlugins {
        const val androidApplication = "com.android.application"

        object KotlinScope {
            const val android = "android"
        }
    }
}

object Libraries {
    object Versions {
        const val navigation = "2.4.0-alpha06"
        const val ktxNav = "2.3.5"
        const val facebookSdk = "11.1.0"
        const val retrofit = "2.9.0"
        const val okHttp = "4.9.0"
        const val rxJava = "3.0.6"
        const val rxKotlin = "3.0.1"
        const val ktxCore = "1.6.0"
        const val appCompat = "1.3.1"
        const val material = "1.4.0"
    }

    object Navigation {
        const val compose = "androidx.navigation:navigation-compose:${Versions.navigation}"
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.ktxNav}"
        const val ui = "androidx.navigation:navigation-ui-ktx:${Versions.ktxNav}"
        const val dff =
            "androidx.navigation:navigation-dynamic-features-fragment:${Versions.ktxNav}"
    }

    object OAuth {
        const val facebook = "com.facebook.android:facebook-login:${Versions.facebookSdk}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    }

    object ReactiveX {
        const val rxJava = "io.reactivex.rxjava3:rxjava:${Versions.rxJava}"
        const val rxKotlin = "io.reactivex.rxjava3:rxkotlin:${Versions.rxKotlin}"
    }

    const val ktxCore = "androidx.core:core-ktx:${Versions.ktxCore}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
}

object TestLibraries {
    object Versions {
        const val junit4 = "4.13.2"
        const val testExtJunit = "1.1.3"
        const val espressoCore = "3.4.0"
    }

    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testExtJunit = "androidx.test.ext:junit:${Versions.testExtJunit}"
    const val espressoCore =  "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}
