// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

import com.example.client_content.transaction_service.data.proto.trsanction_proto.Transactions

@kotlin.jvm.JvmName("-initializegetStatusResponse")
public inline fun getStatusResponse(block: GetStatusResponseKt.Dsl.() -> kotlin.Unit): Messages.GetStatusResponse =
  GetStatusResponseKt.Dsl._create(Messages.GetStatusResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `GetStatusResponse`
 */
public object GetStatusResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: Messages.GetStatusResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: Messages.GetStatusResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): Messages.GetStatusResponse = _builder.build()

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
     * `optional .TransactionStatus status = 2;`
     */
    public var status: Transactions.TransactionStatus
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    public var statusValue: kotlin.Int
      @JvmName("getStatusValue")
      get() = _builder.getStatusValue()
      @JvmName("setStatusValue")
      set(value) {
        _builder.setStatusValue(value)
      }
    /**
     * `optional .TransactionStatus status = 2;`
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }
    /**
     * `optional .TransactionStatus status = 2;`
     * @return Whether the status field is set.
     */
    public fun hasStatus(): kotlin.Boolean {
      return _builder.hasStatus()
    }

    /**
     * `optional .MetaError error = 3;`
     */
    public var error: Messages.MetaError
      @JvmName("getError")
      get() = _builder.getError()
      @JvmName("setError")
      set(value) {
        _builder.setError(value)
      }
    /**
     * `optional .MetaError error = 3;`
     */
    public fun clearError() {
      _builder.clearError()
    }
    /**
     * `optional .MetaError error = 3;`
     * @return Whether the error field is set.
     */
    public fun hasError(): kotlin.Boolean {
      return _builder.hasError()
    }
    public val GetStatusResponseKt.Dsl.errorOrNull: Messages.MetaError?
      get() = _builder.errorOrNull

    /**
     * `.AuthData authData = 4;`
     */
    public var authData: Messages.AuthData
      @JvmName("getAuthData")
      get() = _builder.getAuthData()
      @JvmName("setAuthData")
      set(value) {
        _builder.setAuthData(value)
      }
    /**
     * `.AuthData authData = 4;`
     */
    public fun clearAuthData() {
      _builder.clearAuthData()
    }
    /**
     * `.AuthData authData = 4;`
     * @return Whether the authData field is set.
     */
    public fun hasAuthData(): kotlin.Boolean {
      return _builder.hasAuthData()
    }
    public val GetStatusResponseKt.Dsl.authDataOrNull: Messages.AuthData?
      get() = _builder.authDataOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun Messages.GetStatusResponse.copy(block: GetStatusResponseKt.Dsl.() -> kotlin.Unit): Messages.GetStatusResponse =
  GetStatusResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val Messages.GetStatusResponseOrBuilder.errorOrNull: Messages.MetaError?
  get() = if (hasError()) getError() else null

public val Messages.GetStatusResponseOrBuilder.authDataOrNull: Messages.AuthData?
  get() = if (hasAuthData()) getAuthData() else null

