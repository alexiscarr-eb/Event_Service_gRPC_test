package com.eventbrite.eventservice.server

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

}

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 50051
    val server = EventServiceServer(port)
    server.start()
    server.blockUntilShutdown()
}