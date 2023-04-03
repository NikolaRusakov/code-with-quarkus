# code-with-quarkus

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./gradlew quarkusDev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./gradlew build
```
It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.

The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./gradlew build -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar build/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./gradlew build -Dquarkus.package.type=native
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./build/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/gradle-tooling.

## Related Guides

- Kogito Add-On Events Decisions ([guide](https://quarkus.io/guides/kogito-dmn)): Kogito Add-On for processing events on Decisions (DMN) based projects
- Minio Client extension ([guide](https://quarkiverse.github.io/quarkiverse-docs/quarkus-minio/dev/index.html)): Integrates MinIO Java SDK for Amazon S3 Compatible Cloud Storage
- Kogito - Decisions (DMN) ([guide](https://quarkus.io/guides/kogito-dmn)): Add Kogito decision (DMN) capabilities - Include Drools DMN engine
- SmallRye JWT ([guide](https://quarkus.io/guides/security-jwt)): Secure your applications with JSON Web Token
- SmallRye GraphQL ([guide](https://quarkus.io/guides/microprofile-graphql)): Create GraphQL Endpoints using the code-first approach from MicroProfile GraphQL
- Kogito Add-On Persistence FileSystem ([guide](https://quarkus.io/guides/kogito)): Kogito Add-On support for persistence on FileSystem
- Dapr ([guide](https://quarkiverse.github.io/quarkiverse-docs/quarkus-dapr/dev/index.html)): Dapr SDK
- SmallRye OpenAPI ([guide](https://quarkus.io/guides/openapi-swaggerui)): Document your REST APIs with OpenAPI - comes with Swagger UI
- Kogito - Rules (DRL) ([guide](https://quarkus.io/guides/kogito-drl)): Add Kogito rules (DRL) capabilities - Include Drools engine
- Kogito Add-On Events Predictions ([guide](https://quarkus.io/guides/kogito-pmml)): Kogito Add-On for processing events on Predictions (PMML) based projects
- SmallRye Reactive Messaging - Kafka Connector ([guide](https://quarkus.io/guides/kafka-reactive-getting-started)): Connect to Kafka with Reactive Messaging
- SmallRye GraphQL Client ([guide](https://quarkus.io/guides/smallrye-graphql-client)): Create GraphQL Clients
- Kotlin ([guide](https://quarkus.io/guides/kotlin)): Write your services in Kotlin
- Kogito Add-On Jobs Service ([guide](https://quarkus.io/guides/kogito)): Kogito Add-On to interact with Kogito Jobs Service
- Apache Kafka Streams ([guide](https://quarkus.io/guides/kafka-streams)): Implement stream processing applications based on Apache Kafka
- Kogito - Serverless Workflow ([guide](https://quarkus.io/guides/kogito)): Add Kogito Serverless Workflows (SW) capabilities - Includes the Process engine and Knative Eventing capabilities
- Reactive Routes ([guide](https://quarkus.io/guides/reactive-routes)): REST framework offering the route model to define non blocking endpoints
- Kogito - Predictions (PMML) ([guide](https://quarkus.io/guides/kogito-pmml)): Add Kogito predictions (PMML) capabilities - Include Drools PMML engine
- Kogito Serverless Workflow Tools ([guide](https://quarkus.io/guides/kogito)): Runtime development tools for Serverless Workflows
- Kogito Add-On Events Rules ([guide](https://quarkus.io/guides/kogito-drl)): Kogito Add-On for processing events on Rules (DRL) based projects
- Kogito - Process (jBPM) ([guide](https://quarkus.io/guides/kogito)): Add Kogito Processes capabilities - Includes Process (jBPM) Engine
- Kogito Add-On Events Process ([guide](https://quarkus.io/guides/kogito)): Kogito Add-On for Processes Events
- Apache Kafka Client ([guide](https://quarkus.io/guides/kafka)): Connect to Apache Kafka with its native API
- Apache Avro ([guide](https://quarkus.io/guides/kafka)): Provide support for the Avro data serialization system
- Vault ([guide](https://quarkiverse.github.io/quarkiverse-docs/quarkus-vault/dev/index.html)): Store your credentials securely in HashiCorp Vault
- Kogito Add-On Persistence Kafka ([guide](https://quarkus.io/guides/kogito)): Kogito Add-On support for persistence on Kafka
- WebSockets Client ([guide](https://quarkus.io/guides/websockets)): Client for WebSocket communication channel
- Logging GELF ([guide](https://quarkus.io/guides/centralized-log-management)): Log using the Graylog Extended Log Format and centralize your logs in ELK or EFK
- WebSockets ([guide](https://quarkus.io/guides/websockets)): WebSocket communication channel support
- OpenID Connect ([guide](https://quarkus.io/guides/security-openid-connect)): Verify Bearer access tokens and authenticate users with Authorization Code Flow
- Liquibase ([guide](https://quarkus.io/guides/liquibase)): Handle your database schema migrations with Liquibase
- Redis Client ([guide](https://quarkus.io/guides/redis)): Connect to Redis in either imperative or reactive style

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)

### SmallRye GraphQL

Start coding with this Hello GraphQL Query

[Related guide section...](https://quarkus.io/guides/smallrye-graphql)

### WebSockets

WebSocket communication channel starter code

[Related guide section...](https://quarkus.io/guides/websockets)
