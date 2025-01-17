// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
@kotlin.jvm.JvmName("-initializeregisterTransactionResponse")
public inline fun registerTransactionResponse(block: RegisterTransactionResponseKt.Dsl.() -> kotlin.Unit): Messages.RegisterTransactionResponse =
  RegisterTransactionResponseKt.Dsl._create(Messages.RegisterTransactionResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `RegisterTransactionResponse`
 */
public object RegisterTransactionResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: Messages.RegisterTransactionResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: Messages.RegisterTransactionResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): Messages.RegisterTransactionResponse = _builder.build()

    /**
     * `optional string id = 1;`
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * `optional string id = 1;`
     */
    public fun clearId() {
      _builder.clearId()
    }
    /**
     * `optional string id = 1;`
     * @return Whether the id field is set.
     */
    public fun hasId(): kotlin.Boolean {
      return _builder.hasId()
    }

    /**
     * `optional .MetaError error = 2;`
     */
    public var error: Messages.MetaError
      @JvmName("getError")
      get() = _builder.getError()
      @JvmName("setError")
      set(value) {
        _builder.setError(value)
      }
    /**
     * `optional .MetaError error = 2;`
     */
    public fun clearError() {
      _builder.clearError()
    }
    /**
     * `optional .MetaError error = 2;`
     * @return Whether the error field is set.
     */
    public fun hasError(): kotlin.Boolean {
      return _builder.hasError()
    }
    public val RegisterTransactionResponseKt.Dsl.errorOrNull: Messages.MetaError?
      get() = _builder.errorOrNull

    /**
     * `.AuthData authData = 3;`
     */
    public var authData: Messages.AuthData
      @JvmName("getAuthData")
      get() = _builder.getAuthData()
      @JvmName("setAuthData")
      set(value) {
        _builder.setAuthData(value)
      }
    /**
     * `.AuthData authData = 3;`
     */
    public fun clearAuthData() {
      _builder.clearAuthData()
    }
    /**
     * `.AuthData authData = 3;`
     * @return Whether the authData field is set.
     */
    public fun hasAuthData(): kotlin.Boolean {
      return _builder.hasAuthData()
    }
    public val RegisterTransactionResponseKt.Dsl.authDataOrNull: Messages.AuthData?
      get() = _builder.authDataOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun Messages.RegisterTransactionResponse.copy(block: RegisterTransactionResponseKt.Dsl.() -> kotlin.Unit): Messages.RegisterTransactionResponse =
  RegisterTransactionResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val Messages.RegisterTransactionResponseOrBuilder.errorOrNull: Messages.MetaError?
  get() = if (hasError()) getError() else null

public val Messages.RegisterTransactionResponseOrBuilder.authDataOrNull: Messages.AuthData?
  get() = if (hasAuthData()) getAuthData() else null

