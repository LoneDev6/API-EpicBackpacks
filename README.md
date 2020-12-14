# ✨ EpicBackpacks - API
This repository only serves the point of providing access to the method signatures of EpicBackpacks's Java API.<br>
**This repository does NOT contain the source code of EpicBackpacks, to test and use this, you will still require a copy of [EpicBackpacks](https://www.spigotmc.org/resources/28981/)!**<br>

<hr>
<h3 align="center">
<a href="https://EpicBackpacks.plugin.ga/developers/java-api">☕ Java documentation</a> | <a href="https://EpicBackpacks.plugin.ga/developers/skript-api">📓 Skript documentation</a>
</h3>
<hr>

## 📦 Packages
You can find an overview of all packages here:<br>
https://github.com/LoneDev6/EpicBackpacks-API/packages/

Alternatively you can directly reference this library using [Maven](#developer-reference-maven) or [Gradle](#developer-reference-gradle) by following the instructions outlined below.

### Developer reference (Maven)
To build your project against this library, simply include one of the following references in your `pom.xml`:

#### 1. via `maven.pkg.github.com` (requires authentication)

Add this to your **&lt;repositories&gt;** section:
```xml
<repository>
    <id>EpicBackpacks-repo</id>
    <url>https://maven.pkg.github.com/LoneDev6/EpicBackpacks-API</url>
</repository>
```

In your **&lt;dependencies&gt;** section (Replace `VERSION` with the [latest release](https://github.com/LoneDev6/EpicBackpacks-API/packages?ecosystem=maven) of this package):
```xml
<dependency>
    <groupId>dev.lone</groupId>
    <artifactId>EpicBackpacks-api</artifactId>
    <version>VERSION</version>
    <scope>provided</scope>
</dependency>
```

Note here that the GitHub package repository requires authentication! ([Read more](https://docs.github.com/en/free-pro-team@latest/packages/guides/configuring-apache-maven-for-use-with-github-packages#authenticating-to-github-packages))<br>
Alternatively, you can also include the dependency using [jitpack.io](https://jitpack.io/#LoneDev6/EpicBackpacks-API).

## 2. via `jitpack.io`
Add this to your **&lt;repositories&gt;** section:
```xml
<repository>
    <id>jitpack-repo</id>
    <url>https://jitpack.io</url>
</repository>
```

In your **&lt;dependencies&gt;** section (Replace `VERSION` with the [latest release](https://github.com/LoneDev6/EpicBackpacks-API/packages?ecosystem=maven) of this package):
```xml
<dependency>
    <groupId>com.github.LoneDev6</groupId>
    <artifactId>EpicBackpacks-api</artifactId>
    <version>VERSION</version>
    <scope>provided</scope>
</dependency>
```

### Developer reference (Gradle)

#### 1. via `maven.pkg.github.com` (requires authentication)
Repository:
```
repositories {
    maven {
        url 'https://maven.pkg.github.com/LoneDev6/EpicBackpacks-API'
    }
}
```

Artifact (Replace `VERSION` with the [latest release](https://github.com/LoneDev6/EpicBackpacks-API/packages?ecosystem=maven) of this package):
```
dependencies {
    implementation 'dev.lone:EpicBackpacks-api:VERSION'
}
```

Note here that the GitHub package repository requires authentication! ([Read more](https://docs.github.com/en/free-pro-team@latest/packages/guides/configuring-apache-maven-for-use-with-github-packages#authenticating-to-github-packages))<br>
Alternatively, you can also include the dependency using [jitpack.io](https://jitpack.io/#LoneDev6/EpicBackpacks-API).

#### 2. via `jitpack.io`
Repository:
```
repositories {
    maven {
        url 'https://jitpack.io'
    }
}
```

Artifact (Replace `VERSION` with the [latest release](https://github.com/LoneDev6/EpicBackpacks-API/packages?ecosystem=maven) of this package):
```
dependencies {
    implementation 'com.github.LoneDev6:EpicBackpacks-API:VERSION'
}
```

