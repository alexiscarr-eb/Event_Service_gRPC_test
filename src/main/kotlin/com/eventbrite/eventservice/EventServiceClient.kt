package com.eventbrite.eventservice

import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import java.io.Closeable
import java.util.concurrent.TimeUnit

class EventServiceClient(private val channel: ManagedChannel) : Closeable {
    private val stub: EventServiceGrpcKt.EventServiceCoroutineStub = EventServiceGrpcKt.EventServiceCoroutineStub(channel)

    suspend fun create(id: String, name: String, desc: String) {
        val request = CreateEventRequest
            .newBuilder()
            .setId(id)
            .setEventName(name)
            .setEventDescription(desc)
            .build()
        val response = stub.createEvent(request)
        println("Received! Here's your event:\n${response.id}\n${response.eventName}\n${response.eventDescription}\n${response.created}")
    }

    override fun close() {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS)
    }
}

suspend fun main() {
    val port = 50051
    val channel = ManagedChannelBuilder
        .forAddress("localhost", port)
        .usePlaintext()
        .build()
    val client = EventServiceClient(channel)
    println(client.create("1",
        "My first event",
        "This is the first \"event\" that I'm making using gRPC and Kotlin."
    ))
}