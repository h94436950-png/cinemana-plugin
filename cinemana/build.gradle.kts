// use an integer for version numbers
version = 1

cloudstream {
    language = "ar"
    authors = listOf("okibcn")
    status = 1
    tvTypes = listOf(
        "Movie",
        "TvSeries",
    )
    // iconUrl = "https://..."
}

android {
    namespace = "com.cinemana"
    buildFeatures {
        buildConfig = true
    }
    kotlinOptions {
        freeCompilerArgs += "-XXLanguage:+BreakContinueInInlineLambdas"
    }
}

dependencies {
    val implementation by configurations
    implementation("com.google.android.material:material:1.13.0")
    implementation("androidx.browser:browser:1.9.0")
    implementation("androidx.room:room-ktx:2.8.0")
    implementation("androidx.preference:preference-ktx:1.2.1")
}
