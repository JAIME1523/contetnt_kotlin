// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

import com.example.client_content.transaction_service.data.proto.trsanction_proto.Transactions

@kotlin.jvm.JvmName("-initializetransactionNotification")
public inline fun transactionNotification(block: TransactionNotificationKt.Dsl.() -> kotlin.Unit): Messages.TransactionNotification =
  TransactionNotificationKt.Dsl._create(Messages.TransactionNotification.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `TransactionNotification`
 */
public object TransactionNotificationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: Messages.TransactionNotification.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: Messages.TransactionNotification.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): Messages.TransactionNotification = _builder.build()

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
     * `optional .Transaction transaction = 2;`
     */
    public var transaction: Transactions.Transaction
      @JvmName("getTransaction")
      get() = _builder.getTransaction()
      @JvmName("setTransaction")
      set(value) {
        _builder.setTransaction(value)
      }
    /**
     * `optional .Transaction transaction = 2;`
     */
    public fun clearTransaction() {
      _builder.clearTransaction()
    }
    /**
     * `optional .Transaction transaction = 2;`
     * @return Whether the transaction field is set.
     */
    public fun hasTransaction(): kotlin.Boolean {
      return _builder.hasTransaction()
    }
    public val TransactionNotificationKt.Dsl.transactionOrNull: Transactions.Transaction?
      get() = _builder.transactionOrNull

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
    public val TransactionNotificationKt.Dsl.errorOrNull: Messages.MetaError?
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
    public val TransactionNotificationKt.Dsl.authDataOrNull: Messages.AuthData?
      get() = _builder.authDataOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun Messages.TransactionNotification.copy(block: TransactionNotificationKt.Dsl.() -> kotlin.Unit): Messages.TransactionNotification =
  TransactionNotificationKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val Messages.TransactionNotificationOrBuilder.transactionOrNull: Transactions.Transaction?
  get() = if (hasTransaction()) getTransaction() else null

public val Messages.TransactionNotificationOrBuilder.errorOrNull: Messages.MetaError?
  get() = if (hasError()) getError() else null

public val Messages.TransactionNotificationOrBuilder.authDataOrNull: Messages.AuthData?
  get() = if (hasAuthData()) getAuthData() else null

