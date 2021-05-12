# Event_Service_gRPC_test

This is NOT Event Service. 

This is a proto-Event Service playground (see what I did there?). 

Only very simple endpoints with a scaled down proto will be implemented. Just to get a feel for what developing in gRPC and Kotlin with gradle is like. 

At most the most it'll have a DynamoDB data persistence layer. No caching. No pub/sub. Just a stand-alone "proto-Event Service" to mess around in.

## How to build and run:
Start the server:
```shell
./gradlew build
./gradlew server:run
```
in a separate tab run the client
```shell
./gradlew build
./gradlew client:run
```