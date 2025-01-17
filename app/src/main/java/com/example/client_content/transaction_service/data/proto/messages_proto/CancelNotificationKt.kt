// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

import com.example.client_content.transaction_service.data.proto.trsanction_proto.Transactions

@kotlin.jvm.JvmName("-initializecancelNotification")
public inline fun cancelNotification(block: CancelNotificationKt.Dsl.() -> kotlin.Unit): Messages.CancelNotification =
  CancelNotificationKt.Dsl._create(Messages.CancelNotification.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `CancelNotification`
 */
public object CancelNotificationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: Messages.CancelNotification.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: Messages.CancelNotification.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): Messages.CancelNotification = _builder.build()

    /**
     * `optional .TransactionStatus status = 1;`
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
     * `optional .TransactionStatus status = 1;`
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }
    /**
     * `optional .TransactionStatus status = 1;`
     * @return Whether the status field is set.
     */
    public fun hasStatus(): kotlin.Boolean {
      return _builder.hasStatus()
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
    public val CancelNotificationKt.Dsl.errorOrNull: Messages.MetaError?
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
    public val CancelNotificationKt.Dsl.authDataOrNull: Messages.AuthData?
      get() = _builder.authDataOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun Messages.CancelNotification.copy(block: CancelNotificationKt.Dsl.() -> kotlin.Unit): Messages.CancelNotification =
  CancelNotificationKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val Messages.CancelNotificationOrBuilder.errorOrNull: Messages.MetaError?
  get() = if (hasError()) getError() else null

public val Messages.CancelNotificationOrBuilder.authDataOrNull: Messages.AuthData?
  get() = if (hasAuthData()) getAuthData() else null

