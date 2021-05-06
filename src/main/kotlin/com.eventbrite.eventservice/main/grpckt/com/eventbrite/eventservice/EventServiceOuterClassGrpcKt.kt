package com.eventbrite.eventservice

import com.eventbrite.eventservice.EventServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * com.eventbrite.eventservice.EventService.
 */
object EventServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = EventServiceGrpc.getServiceDescriptor()

  val createEventMethod: MethodDescriptor<CreateEventRequest, CreateResponse>
    @JvmStatic
    get() = EventServiceGrpc.getCreateEventMethod()

  val updateEventMethod: MethodDescriptor<UpdateEventRequest, UpdateEventResponse>
    @JvmStatic
    get() = EventServiceGrpc.getUpdateEventMethod()

  val getEventsMethod: MethodDescriptor<GetEventsRequest, GetEventsResponse>
    @JvmStatic
    get() = EventServiceGrpc.getGetEventsMethod()

  /**
   * A stub for issuing RPCs to a(n) com.eventbrite.eventservice.EventService service as suspending
   * coroutines.
   */
  @StubFor(EventServiceGrpc::class)
  class EventServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<EventServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): EventServiceCoroutineStub =
        EventServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun createEvent(request: CreateEventRequest): CreateResponse = unaryRpc(
      channel,
      EventServiceGrpc.getCreateEventMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun updateEvent(request: UpdateEventRequest): UpdateEventResponse = unaryRpc(
      channel,
      EventServiceGrpc.getUpdateEventMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getEvents(request: GetEventsRequest): GetEventsResponse = unaryRpc(
      channel,
      EventServiceGrpc.getGetEventsMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the com.eventbrite.eventservice.EventService service based on Kotlin
   * coroutines.
   */
  abstract class EventServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for com.eventbrite.eventservice.EventService.CreateEvent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createEvent(request: CreateEventRequest): CreateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.eventbrite.eventservice.EventService.CreateEvent is unimplemented"))

    /**
     * Returns the response to an RPC for com.eventbrite.eventservice.EventService.UpdateEvent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateEvent(request: UpdateEventRequest): UpdateEventResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.eventbrite.eventservice.EventService.UpdateEvent is unimplemented"))

    /**
     * Returns the response to an RPC for com.eventbrite.eventservice.EventService.GetEvents.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getEvents(request: GetEventsRequest): GetEventsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.eventbrite.eventservice.EventService.GetEvents is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getCreateEventMethod(),
      implementation = ::createEvent
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getUpdateEventMethod(),
      implementation = ::updateEvent
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getGetEventsMethod(),
      implementation = ::getEvents
    )).build()
  }
}
