// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
@kotlin.jvm.JvmName("-initializeregisterClientRequest")
public inline fun registerClientRequest(block: RegisterClientRequestKt.Dsl.() -> kotlin.Unit): Messages.RegisterClientRequest =
  RegisterClientRequestKt.Dsl._create(Messages.RegisterClientRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `RegisterClientRequest`
 */
public object RegisterClientRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: Messages.RegisterClientRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: Messages.RegisterClientRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): Messages.RegisterClientRequest = _builder.build()

    /**
     * `string randomCode = 1;`
     */
    public var randomCode: kotlin.String
      @JvmName("getRandomCode")
      get() = _builder.getRandomCode()
      @JvmName("setRandomCode")
      set(value) {
        _builder.setRandomCode(value)
      }
    /**
     * `string randomCode = 1;`
     */
    public fun clearRandomCode() {
      _builder.clearRandomCode()
    }

    /**
     * `string publicKey = 2;`
     */
    public var publicKey: kotlin.String
      @JvmName("getPublicKey")
      get() = _builder.getPublicKey()
      @JvmName("setPublicKey")
      set(value) {
        _builder.setPublicKey(value)
      }
    /**
     * `string publicKey = 2;`
     */
    public fun clearPublicKey() {
      _builder.clearPublicKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun Messages.RegisterClientRequest.copy(block: RegisterClientRequestKt.Dsl.() -> kotlin.Unit): Messages.RegisterClientRequest =
  RegisterClientRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

