package com.eventbrite.eventservice

import io.grpc.Server
import io.grpc.ServerBuilder

class EventServiceServer(private val port: Int) {
    val server: Server = ServerBuilder
        .forPort(port)
        .addService(EventService())
        .build()

    fun start() {
        server.start()
        println("Server started, listening on $port")
        Runtime.getRuntime().addShutdownHook(
            Thread {
                println("*** shutting down gRPC server since JVM is shutting down ***")
                this@EventServiceServer.stop()
                println("*** server shut down ***")
            }
        )
    }

    private fun stop() {
        server.shutdown()
    }

    fun blockUntilShutdown() {
        server.awaitTermination()
    }

    private class EventService : EventServiceGrpcKt.EventServiceCoroutineImplBase() {
        override suspend fun createEvent(request: CreateEventRequest): CreateResponse {
            return CreateResponse
                .newBuilder()
                .setId(request.id)
                .setEventName(request.eventName)
                .setEventDescription(request.eventDescription)
                .setCreated("created")
                .build()
        }


        override suspend fun updateEvent(request: UpdateEventRequest) : UpdateEventResponse {
            return UpdateEventResponse
                .newBuilder()
                .setId(request.id)
                .setEventName(request.eventName)
                .setEventDescription(request.eventDescription)
                .setUpdated("updated")
                .build()
        }

        override suspend fun getEvents(request: GetEventsRequest): GetEventsResponse {
            /*
                * Will eventually implement logic to get events from persistence layer
             */
            return GetEventsResponse
                .newBuilder()
                .setId(request.id)
                .build()
        }
    }
}

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 50051
    val server = EventServiceServer(port)
    server.start()
    server.blockUntilShutdown()
}