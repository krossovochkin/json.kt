[![](https://img.shields.io/badge/Download-v0.1.0-yellowgreen)](https://bintray.com/krossovochkin/json.kt/json)

# json.kt

Json Parser and formatter library written in Kotlin.

# Getting started

Add dependency:

```
implementation "com.krossovochkin.json:json.kt:$version"
```

Parse Json:

```
val json = JsonParser().parse(text)
```

Format Json:

```
MinifiedJsonFormatter().format(json)
```

# Tests

Test results for corner cases one can see [here](https://github.com/krossovochkin/JSONTestSuite)

Comparison with Gson in corner-cases tests:

!{](https://raw.githubusercontent.com/krossovochkin/json.kt/master/image/Screenshot_1.png)
