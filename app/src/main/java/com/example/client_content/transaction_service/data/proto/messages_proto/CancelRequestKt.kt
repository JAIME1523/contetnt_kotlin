// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

import com.example.client_content.transaction_service.data.proto.trsanction_proto.Transactions

@kotlin.jvm.JvmName("-initializecancelRequest")
public inline fun cancelRequest(block: CancelRequestKt.Dsl.() -> kotlin.Unit): Messages.CancelRequest =
  CancelRequestKt.Dsl._create(Messages.CancelRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `CancelRequest`
 */
public object CancelRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: Messages.CancelRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: Messages.CancelRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): Messages.CancelRequest = _builder.build()

    /**
     * `string id = 1;`
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * `string id = 1;`
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * `.Transaction transaction = 2;`
     */
    public var transaction: Transactions.Transaction
      @JvmName("getTransaction")
      get() = _builder.getTransaction()
      @JvmName("setTransaction")
      set(value) {
        _builder.setTransaction(value)
      }
    /**
     * `.Transaction transaction = 2;`
     */
    public fun clearTransaction() {
      _builder.clearTransaction()
    }
    /**
     * `.Transaction transaction = 2;`
     * @return Whether the transaction field is set.
     */
    public fun hasTransaction(): kotlin.Boolean {
      return _builder.hasTransaction()
    }
    public val CancelRequestKt.Dsl.transactionOrNull: Transactions.Transaction?
      get() = _builder.transactionOrNull

    /**
     * `string origin = 3;`
     */
    public var origin: kotlin.String
      @JvmName("getOrigin")
      get() = _builder.getOrigin()
      @JvmName("setOrigin")
      set(value) {
        _builder.setOrigin(value)
      }
    /**
     * `string origin = 3;`
     */
    public fun clearOrigin() {
      _builder.clearOrigin()
    }

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
    public val CancelRequestKt.Dsl.authDataOrNull: Messages.AuthData?
      get() = _builder.authDataOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun Messages.CancelRequest.copy(block: CancelRequestKt.Dsl.() -> kotlin.Unit): Messages.CancelRequest =
  CancelRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val Messages.CancelRequestOrBuilder.transactionOrNull: Transactions.Transaction?
  get() = if (hasTransaction()) getTransaction() else null

public val Messages.CancelRequestOrBuilder.authDataOrNull: Messages.AuthData?
  get() = if (hasAuthData()) getAuthData() else null

