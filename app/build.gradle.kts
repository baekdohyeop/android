plugins {
    id(App.BuildPlugins.androidApplication)
    kotlin(App.BuildPlugins.KotlinScope.android)
}

android {
    compileSdk = App.AndroidConfigs.compileSdk

    defaultConfig {
        applicationId = App.AndroidConfigs.applicationId
        minSdk = App.AndroidConfigs.minSdk
        targetSdk = App.AndroidConfigs.targetSdk
        versionCode = App.AndroidConfigs.versionCode
        versionName = App.AndroidConfigs.versionName
        testInstrumentationRunner = App.AndroidConfigs.testRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Application dependencies
    implementation(Libraries.ktxCore)
    implementation(Libraries.appCompat)
    implementation(Libraries.material)

    // Android tests dependencies
    testImplementation(TestLibraries.junit4)
    androidTestImplementation(TestLibraries.testExtJunit)
    androidTestImplementation(TestLibraries.espressoCore)
}
