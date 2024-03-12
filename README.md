# facetagrSDK_android

## Simple Toast

### Add JitPack Repository and Dependency

#### Step 1. Add the JitPack repository and dependency

In your Gradle file (build.gradle), add the JitPack repository to the `dependencyResolutionManagement` block and include the `facetagrSDK_android` library:

```gradle
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}

dependencies {
	        implementation 'com.github.mohamedathil-haliscape:facetagrSDK_android:Tag'
	}
