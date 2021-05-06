package com.eventbrite.eventservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.0)",
    comments = "Source: event_service.proto")
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final String SERVICE_NAME = "com.eventbrite.eventservice.EventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.eventbrite.eventservice.CreateEventRequest,
      com.eventbrite.eventservice.CreateResponse> getCreateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEvent",
      requestType = com.eventbrite.eventservice.CreateEventRequest.class,
      responseType = com.eventbrite.eventservice.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventbrite.eventservice.CreateEventRequest,
      com.eventbrite.eventservice.CreateResponse> getCreateEventMethod() {
    io.grpc.MethodDescriptor<com.eventbrite.eventservice.CreateEventRequest, com.eventbrite.eventservice.CreateResponse> getCreateEventMethod;
    if ((getCreateEventMethod = EventServiceGrpc.getCreateEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getCreateEventMethod = EventServiceGrpc.getCreateEventMethod) == null) {
          EventServiceGrpc.getCreateEventMethod = getCreateEventMethod =
              io.grpc.MethodDescriptor.<com.eventbrite.eventservice.CreateEventRequest, com.eventbrite.eventservice.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventbrite.eventservice.CreateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventbrite.eventservice.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("CreateEvent"))
              .build();
        }
      }
    }
    return getCreateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eventbrite.eventservice.UpdateEventRequest,
      com.eventbrite.eventservice.UpdateEventResponse> getUpdateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEvent",
      requestType = com.eventbrite.eventservice.UpdateEventRequest.class,
      responseType = com.eventbrite.eventservice.UpdateEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventbrite.eventservice.UpdateEventRequest,
      com.eventbrite.eventservice.UpdateEventResponse> getUpdateEventMethod() {
    io.grpc.MethodDescriptor<com.eventbrite.eventservice.UpdateEventRequest, com.eventbrite.eventservice.UpdateEventResponse> getUpdateEventMethod;
    if ((getUpdateEventMethod = EventServiceGrpc.getUpdateEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getUpdateEventMethod = EventServiceGrpc.getUpdateEventMethod) == null) {
          EventServiceGrpc.getUpdateEventMethod = getUpdateEventMethod =
              io.grpc.MethodDescriptor.<com.eventbrite.eventservice.UpdateEventRequest, com.eventbrite.eventservice.UpdateEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventbrite.eventservice.UpdateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventbrite.eventservice.UpdateEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("UpdateEvent"))
              .build();
        }
      }
    }
    return getUpdateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eventbrite.eventservice.GetEventsRequest,
      com.eventbrite.eventservice.GetEventsResponse> getGetEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvents",
      requestType = com.eventbrite.eventservice.GetEventsRequest.class,
      responseType = com.eventbrite.eventservice.GetEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eventbrite.eventservice.GetEventsRequest,
      com.eventbrite.eventservice.GetEventsResponse> getGetEventsMethod() {
    io.grpc.MethodDescriptor<com.eventbrite.eventservice.GetEventsRequest, com.eventbrite.eventservice.GetEventsResponse> getGetEventsMethod;
    if ((getGetEventsMethod = EventServiceGrpc.getGetEventsMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetEventsMethod = EventServiceGrpc.getGetEventsMethod) == null) {
          EventServiceGrpc.getGetEventsMethod = getGetEventsMethod =
              io.grpc.MethodDescriptor.<com.eventbrite.eventservice.GetEventsRequest, com.eventbrite.eventservice.GetEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventbrite.eventservice.GetEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eventbrite.eventservice.GetEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetEvents"))
              .build();
        }
      }
    }
    return getGetEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceStub>() {
        @java.lang.Override
        public EventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceStub(channel, callOptions);
        }
      };
    return EventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub>() {
        @java.lang.Override
        public EventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceBlockingStub(channel, callOptions);
        }
      };
    return EventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub>() {
        @java.lang.Override
        public EventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceFutureStub(channel, callOptions);
        }
      };
    return EventServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EventServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createEvent(com.eventbrite.eventservice.CreateEventRequest request,
        io.grpc.stub.StreamObserver<com.eventbrite.eventservice.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEventMethod(), responseObserver);
    }

    /**
     */
    public void updateEvent(com.eventbrite.eventservice.UpdateEventRequest request,
        io.grpc.stub.StreamObserver<com.eventbrite.eventservice.UpdateEventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEventMethod(), responseObserver);
    }

    /**
     */
    public void getEvents(com.eventbrite.eventservice.GetEventsRequest request,
        io.grpc.stub.StreamObserver<com.eventbrite.eventservice.GetEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.eventbrite.eventservice.CreateEventRequest,
                com.eventbrite.eventservice.CreateResponse>(
                  this, METHODID_CREATE_EVENT)))
          .addMethod(
            getUpdateEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.eventbrite.eventservice.UpdateEventRequest,
                com.eventbrite.eventservice.UpdateEventResponse>(
                  this, METHODID_UPDATE_EVENT)))
          .addMethod(
            getGetEventsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.eventbrite.eventservice.GetEventsRequest,
                com.eventbrite.eventservice.GetEventsResponse>(
                  this, METHODID_GET_EVENTS)))
          .build();
    }
  }

  /**
   */
  public static final class EventServiceStub extends io.grpc.stub.AbstractAsyncStub<EventServiceStub> {
    private EventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     */
    public void createEvent(com.eventbrite.eventservice.CreateEventRequest request,
        io.grpc.stub.StreamObserver<com.eventbrite.eventservice.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEvent(com.eventbrite.eventservice.UpdateEventRequest request,
        io.grpc.stub.StreamObserver<com.eventbrite.eventservice.UpdateEventResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEvents(com.eventbrite.eventservice.GetEventsRequest request,
        io.grpc.stub.StreamObserver<com.eventbrite.eventservice.GetEventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.eventbrite.eventservice.CreateResponse createEvent(com.eventbrite.eventservice.CreateEventRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eventbrite.eventservice.UpdateEventResponse updateEvent(com.eventbrite.eventservice.UpdateEventRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eventbrite.eventservice.GetEventsResponse getEvents(com.eventbrite.eventservice.GetEventsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EventServiceFutureStub> {
    private EventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventbrite.eventservice.CreateResponse> createEvent(
        com.eventbrite.eventservice.CreateEventRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventbrite.eventservice.UpdateEventResponse> updateEvent(
        com.eventbrite.eventservice.UpdateEventRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eventbrite.eventservice.GetEventsResponse> getEvents(
        com.eventbrite.eventservice.GetEventsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EVENT = 0;
  private static final int METHODID_UPDATE_EVENT = 1;
  private static final int METHODID_GET_EVENTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((com.eventbrite.eventservice.CreateEventRequest) request,
              (io.grpc.stub.StreamObserver<com.eventbrite.eventservice.CreateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT:
          serviceImpl.updateEvent((com.eventbrite.eventservice.UpdateEventRequest) request,
              (io.grpc.stub.StreamObserver<com.eventbrite.eventservice.UpdateEventResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS:
          serviceImpl.getEvents((com.eventbrite.eventservice.GetEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.eventbrite.eventservice.GetEventsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.eventbrite.eventservice.EventServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventService");
    }
  }

  private static final class EventServiceFileDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier {
    EventServiceFileDescriptorSupplier() {}
  }

  private static final class EventServiceMethodDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
              .addMethod(getCreateEventMethod())
              .addMethod(getUpdateEventMethod())
              .addMethod(getGetEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
