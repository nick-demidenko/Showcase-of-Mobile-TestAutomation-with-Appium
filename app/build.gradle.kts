import com.android.build.api.dsl.Packaging

plugins {
  id("com.android.application")
  kotlin("android")
  id("com.google.devtools.ksp") version "1.9.22-1.0.17" apply false
}

android {
  namespace = "net.pot8os.kotlintestsample"
  compileSdk = 34

  defaultConfig {
    applicationId = "net.pot8os.kotlintestsample"
    minSdk = 23
    targetSdk = 34
    versionCode = 1
    versionName = "1.0"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  buildTypes {
    getByName("release") {
      proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
    }
  }

  sourceSets {
    getByName("main") {
      java.srcDirs("src/main/kotlin")
    }
    getByName("test") {
      java.srcDirs("src/test/kotlin", "src/testShared/kotlin")
    }
    getByName("androidTest") {
      java.srcDirs("src/androidTest/kotlin", "src/testShared/kotlin")
    }
  }

  kotlinOptions {
    jvmTarget = "17"
  }

  buildFeatures.dataBinding = true
  packaging {
    resources {
      excludes += setOf("META-INF/proguard/androidx-annotations.pro")
      excludes += ("META-INF/DEPENDENCIES");
    }
  }

  testOptions {
    // To run Android relevant tests under test dir.
    // See also http://robolectric.org/migrating/#project-configuration
    unitTests.isIncludeAndroidResources = true
  }
}

dependencies {
  testImplementation("androidx.test:testing-junit:1.4.0")
  androidTestImplementation("androidx.test:core-ktx:1.5.0")
  androidTestImplementation ("io.appium:java-client:9.2.0")
  androidTestImplementation ("org.seleniumhq.selenium:selenium-java:4.18.1")
  implementation ("org.apache.httpcomponents:httpcore:4.4.16");
  implementation ("org.apache.httpcomponents:httpclient:4.5.14");
  kotlin()
  compat()
  fragment()
  layout()
  viewmodel()
  test()
}

repositories {
  google()
  mavenCentral()
}