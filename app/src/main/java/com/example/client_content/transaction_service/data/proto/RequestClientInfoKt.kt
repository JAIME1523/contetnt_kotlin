// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: test_conect.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

package com.example.client_content.transaction_service.data.proto

@kotlin.jvm.JvmName("-initializerequestClientInfo")
public inline fun requestClientInfo(block: RequestClientInfoKt.Dsl.() -> kotlin.Unit): TestConect.RequestClientInfo =
  RequestClientInfoKt.Dsl._create(TestConect.RequestClientInfo.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `RequestClientInfo`
 */
public object RequestClientInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: TestConect.RequestClientInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: TestConect.RequestClientInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): TestConect.RequestClientInfo = _builder.build()

    /**
     * `bool status = 1;`
     */
    public var status: kotlin.Boolean
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    /**
     * `bool status = 1;`
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun TestConect.RequestClientInfo.copy(block: RequestClientInfoKt.Dsl.() -> kotlin.Unit): TestConect.RequestClientInfo =
  RequestClientInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()
