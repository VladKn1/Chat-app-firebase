

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
 //   id("com.google.firebase.crashlytics")
}

android {
    namespace = "com.androidcodeman.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.androidcodeman.myapplication"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.compose.runtime:runtime:1.0.0-beta07")

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    val work_version = "2.5.0"
    //firebase dependencies
    implementation ("com.google.firebase:firebase-analytics:17.5.0")
    implementation ("com.google.firebase:firebase-database:19.3.1")
    implementation ("com.google.firebase:firebase-core:17.5.0")
    implementation ("com.google.firebase:firebase-auth:19.3.2")
    implementation ("com.google.firebase:firebase-storage:19.1.1")

    //material design library
    implementation ("com.google.android.material:material:1.2.0")

    //circle image view library
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    //glide library
    implementation ("com.github.bumptech.glide:glide:4.11.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.11.0")

    // FCM
    implementation ("com.google.firebase:firebase-messaging:20.1.7")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.5")

    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.6.2")
    implementation ("com.squareup.retrofit2:converter-gson:2.6.0")

    implementation ("com.google.android.material:material:1.2.0-alpha02")





//
//
//
}