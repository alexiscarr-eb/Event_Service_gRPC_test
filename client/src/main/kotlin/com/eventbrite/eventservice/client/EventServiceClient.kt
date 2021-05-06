package com.eventbrite.eventservice.client

import com.eventbrite.eventservice.proto.CreateEventRequest
import com.eventbrite.eventservice.proto.EventServiceGrpcKt
import io.grpc.ManagedChannel
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