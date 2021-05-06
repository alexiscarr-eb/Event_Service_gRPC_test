package com.eventbrite.eventservice.client

import io.grpc.ManagedChannelBuilder

suspend fun main() {
    val port = 50051
    val channel = ManagedChannelBuilder
        .forAddress("localhost", port)
        .usePlaintext()
        .build()
    val client = EventServiceClient(channel)
    println(client.create(
        "1",
        "My first event",
        "This is the first \"event\" that I'm making using gRPC and Kotlin."
    ))
}
