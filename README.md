## Introduction

This repository contains two barebone applications over HTTP & HTTPS respectively

### HTTP Application
```
java -jar http-1.0-SNAPSHOT.jar --server.port=8080
```

Endpoints:
- /
- /another

### HTTPS Application
```
java -jar https-1.0-SNAPSHOT.jar --server.port=8080  --spring.config.location=file://<SOME_PATH>

```

Endpoints:
- /
- /another