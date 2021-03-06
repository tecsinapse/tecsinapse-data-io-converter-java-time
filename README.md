Tecsinapse Data Input and Output
==========
[![License (LGPL version 3)](https://img.shields.io/badge/license-GNU%20LGPL%20version%203.0-blue.svg)](https://github.com/tecsinapse/tecsinapse-data-io-converter-java-time/blob/master/LICENCE)
[![Build Status](https://travis-ci.org/tecsinapse/tecsinapse-data-io-converter-java-time.svg?branch=master)](https://travis-ci.org/tecsinapse/tecsinapse-data-io-converter-java-time)
[![Coverage Status](https://img.shields.io/coveralls/tecsinapse/tecsinapse-data-io-converter-java-time.svg?branch=master)](https://coveralls.io/github/tecsinapse/tecsinapse-data-io-converter-java-time?branch=master)
[![Dependency Status](https://www.versioneye.com/user/projects/57c373ca939fc600508e8c55/badge.svg)](https://www.versioneye.com/user/projects/57c373ca939fc600508e8c55)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/br.com.tecsinapse/tecsinapse-data-io-converter-java-time/badge.svg)](https://maven-badges.herokuapp.com/maven-central/br.com.tecsinapse/tecsinapse-data-io-converter-java-time/)
[![Javadoc](http://www.javadoc.io/badge/br.com.tecsinapse/tecsinapse-data-io-converter-java-time.svg)](http://www.javadoc.io/doc/br.com.tecsinapse/tecsinapse-data-io-converter-java-time)

Wants to contribute to tecsinapse-data-io-converter-java-time?
---
Before working on the code, if you plan to contribute changes, please read the following [CONTRIBUTING](CONTRIBUTING.md) document.

Using tecsinapse-data-io-converter-java-time
---

Maven:

``` xml
<dependency>
  <groupId>br.com.tecsinapse</groupId>
  <artifactId>tecsinapse-data-io-converter-java-time</artifactId>
  <version>1.0.0</version>
</dependency>
```

Gradle:

```groovy
compile "br.com.tecsinapse:tecsinapse-data-io-converter-java-time:1.0.0"
```

If you want to use snapshots first config OSS Sonatype Snapshots repository:

Maven:

``` xml
<repositories>
    <repository>
        <id>oss-snapshots</id>
        <name>OSS Snapshots</name>
        <url>https://oss.sonatype.org/content/repositories/snapshots</url>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```

Gradle:

```groovy
repositories {
    maven {
        url 'https://oss.sonatype.org/content/repositories/snapshots'
    }
}
```

And then the dependency:

``` xml
<dependency>
  <groupId>br.com.tecsinapse</groupId>
  <artifactId>tecsinapse-data-io-converter-java-time</artifactId>
  <version>1.0.1-SNAPSHOT</version>
</dependency>
```

Gradle:

```groovy
compile 'br.com.tecsinapse:tecsinapse-data-io-converter-java-time:1.0.1-SNAPSHOT'
```

Documentation and samples
---

For documentation and samples check out our [wiki](https://github.com/tecsinapse/tecsinapse-data-io-converter-java-time/wiki)

Need help or found an issue?
---

When reporting an issue through the [issue tracker](https://github.com/tecsinapse/tecsinapse-data-io-converter-java-time/issues?state=open)
on GitHub, please use the following guidelines:

* Check existing issues to see if it has been addressed already
* The version of tecsinapse-data-io-converter-java-time you are using
* A short description of the issue you are experiencing and the expected outcome
* Description of how someone else can reproduce the problem
* Paste error output or logs in your issue or in a Gist. If pasting them in the GitHub issue, wrap 
it in three backticks: ```  so that it renders nicely
* Write a unit test to show the issue!

License
---

This project and its documentation are licensed under the LGPL license. Refer to [LICENCE](LICENCE) for more information.
