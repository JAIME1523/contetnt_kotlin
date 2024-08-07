// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: transactions.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

import com.example.client_content.transaction_service.data.proto.trsanction_proto.Transactions

@kotlin.jvm.JvmName("-initializetransaction")
public inline fun transaction(block: TransactionKt.Dsl.() -> kotlin.Unit): Transactions.Transaction =
  TransactionKt.Dsl._create(Transactions.Transaction.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `Transaction`
 */
public object TransactionKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: Transactions.Transaction.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: Transactions.Transaction.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): Transactions.Transaction = _builder.build()

    /**
     * `.TransactionStatus status = 1;`
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
     * `.TransactionStatus status = 1;`
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }

    /**
     * `.TransactionType type = 2;`
     */
    public var type: Transactions.TransactionType
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    public var typeValue: kotlin.Int
      @JvmName("getTypeValue")
      get() = _builder.getTypeValue()
      @JvmName("setTypeValue")
      set(value) {
        _builder.setTypeValue(value)
      }
    /**
     * `.TransactionType type = 2;`
     */
    public fun clearType() {
      _builder.clearType()
    }

    /**
     * `int32 amount = 3;`
     */
    public var amount: kotlin.Int
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * `int32 amount = 3;`
     */
    public fun clearAmount() {
      _builder.clearAmount()
    }

    /**
     * `optional string referenceNumber = 4;`
     */
    public var referenceNumber: kotlin.String
      @JvmName("getReferenceNumber")
      get() = _builder.getReferenceNumber()
      @JvmName("setReferenceNumber")
      set(value) {
        _builder.setReferenceNumber(value)
      }
    /**
     * `optional string referenceNumber = 4;`
     */
    public fun clearReferenceNumber() {
      _builder.clearReferenceNumber()
    }
    /**
     * `optional string referenceNumber = 4;`
     * @return Whether the referenceNumber field is set.
     */
    public fun hasReferenceNumber(): kotlin.Boolean {
      return _builder.hasReferenceNumber()
    }

    /**
     * `optional string arqc = 5;`
     */
    public var arqc: kotlin.String
      @JvmName("getArqc")
      get() = _builder.getArqc()
      @JvmName("setArqc")
      set(value) {
        _builder.setArqc(value)
      }
    /**
     * `optional string arqc = 5;`
     */
    public fun clearArqc() {
      _builder.clearArqc()
    }
    /**
     * `optional string arqc = 5;`
     * @return Whether the arqc field is set.
     */
    public fun hasArqc(): kotlin.Boolean {
      return _builder.hasArqc()
    }

    /**
     * `optional string maskPan = 6;`
     */
    public var maskPan: kotlin.String
      @JvmName("getMaskPan")
      get() = _builder.getMaskPan()
      @JvmName("setMaskPan")
      set(value) {
        _builder.setMaskPan(value)
      }
    /**
     * `optional string maskPan = 6;`
     */
    public fun clearMaskPan() {
      _builder.clearMaskPan()
    }
    /**
     * `optional string maskPan = 6;`
     * @return Whether the maskPan field is set.
     */
    public fun hasMaskPan(): kotlin.Boolean {
      return _builder.hasMaskPan()
    }

    /**
     * `optional string authorizationNumber = 7;`
     */
    public var authorizationNumber: kotlin.String
      @JvmName("getAuthorizationNumber")
      get() = _builder.getAuthorizationNumber()
      @JvmName("setAuthorizationNumber")
      set(value) {
        _builder.setAuthorizationNumber(value)
      }
    /**
     * `optional string authorizationNumber = 7;`
     */
    public fun clearAuthorizationNumber() {
      _builder.clearAuthorizationNumber()
    }
    /**
     * `optional string authorizationNumber = 7;`
     * @return Whether the authorizationNumber field is set.
     */
    public fun hasAuthorizationNumber(): kotlin.Boolean {
      return _builder.hasAuthorizationNumber()
    }

    /**
     * `optional string stan = 8;`
     */
    public var stan: kotlin.String
      @JvmName("getStan")
      get() = _builder.getStan()
      @JvmName("setStan")
      set(value) {
        _builder.setStan(value)
      }
    /**
     * `optional string stan = 8;`
     */
    public fun clearStan() {
      _builder.clearStan()
    }
    /**
     * `optional string stan = 8;`
     * @return Whether the stan field is set.
     */
    public fun hasStan(): kotlin.Boolean {
      return _builder.hasStan()
    }

    /**
     * `optional string resultCode = 9;`
     */
    public var resultCode: kotlin.String
      @JvmName("getResultCode")
      get() = _builder.getResultCode()
      @JvmName("setResultCode")
      set(value) {
        _builder.setResultCode(value)
      }
    /**
     * `optional string resultCode = 9;`
     */
    public fun clearResultCode() {
      _builder.clearResultCode()
    }
    /**
     * `optional string resultCode = 9;`
     * @return Whether the resultCode field is set.
     */
    public fun hasResultCode(): kotlin.Boolean {
      return _builder.hasResultCode()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun Transactions.Transaction.copy(block: TransactionKt.Dsl.() -> kotlin.Unit): Transactions.Transaction =
  TransactionKt.Dsl._create(this.toBuilder()).apply { block() }._build()
