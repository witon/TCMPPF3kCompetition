plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.example.tcmppf3kcompetition"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.tcmppf3kcompetition"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
        packaging {
            jniLibs.pickFirsts.add("lib/arm64-v8a/libc++_shared.so")
            jniLibs.pickFirsts.add("lib/armeabi/libc++_shared.so")
            jniLibs.pickFirsts.add("lib/armeabi-v7a/libc++_shared.so")
            jniLibs.pickFirsts.add("lib/arm64-v8a/libmarsxlog.so")
            jniLibs.pickFirsts.add("lib/armeabi/libmarsxlog.so")
            jniLibs.pickFirsts.add("lib/armeabi-v7a/libmarsxlog.so")
            jniLibs.pickFirsts.add("lib/arm64-v8a/libv8jni.so")
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    implementation("com.google.android.material:material:1.3.0-alpha03")
    implementation("androidx.core:core-ktx:1.6.0")
    //gosn
    implementation("com.google.code.gson:gson:2.8.6")
    // ok-http
    implementation("com.squareup.okhttp3:okhttp:3.12.13")
    //x5静态内核 start
    implementation("com.tencent.tmf.android:tbscore:20230412_185455_20230412_185455")
    implementation("com.tencent.tmf.android:mini_extra_static_x5:1.4.4.0")
    //x5静态内核 end
    // mini app start
    kapt("com.tencent.tmf.android:mini_annotation_processor:1.4.1.1")
    implementation("com.tencent.tmf.android:mini_core:1.4.83.9")
    // mini app end
}