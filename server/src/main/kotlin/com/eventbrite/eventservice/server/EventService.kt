package com.eventbrite.eventservice.server

import com.eventbrite.eventservice.proto.*

class EventService : EventServiceGrpcKt.EventServiceCoroutineImplBase() {
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