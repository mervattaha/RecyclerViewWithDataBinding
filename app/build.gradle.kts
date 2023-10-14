plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
  id ("com.google.dagger.hilt.android")


}

android {
    namespace = "com.example.recyclerviewwithdatabinding"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.recyclerviewwithdatabinding"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    hilt {
        enableAggregatingTask = true
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        dataBinding = true
        viewBinding = true
    }
    kapt {
        correctErrorTypes= true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.4")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.4")
    // LiveData
    implementation ("androidx.activity:activity-compose:1.8.0")
    //implementation ("androidx.lifecycle:lifecycleviewmodel:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.6.2")
    implementation ("androidx.lifecycle:lifecycle-common-java8:2.6.2")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-process:2.6.2")
    implementation ("com.google.dagger:hilt-android:2.48.1")
    kapt ("com.google.dagger:hilt-compiler:2.48.1")

    // For instrumentation tests
    androidTestImplementation  ("com.google.dagger:hilt-android-testing:2.48.1")
    kaptAndroidTest ("com.google.dagger:hilt-compiler:2.48.1")
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    // Kotlin Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")




    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")

    implementation("androidx.collection:collection-ktx:1.3.0")

    implementation("androidx.activity:activity-ktx:1.8.0")

    implementation ("androidx.fragment:fragment-ktx:1.6.1")



    // For local unit tests
    testImplementation ("com.google.dagger:hilt-android-testing:2.48.1")
    kaptTest ("com.google.dagger:hilt-compiler:2.48.1")
}





