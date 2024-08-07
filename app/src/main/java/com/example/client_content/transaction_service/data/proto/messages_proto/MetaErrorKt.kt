// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
@kotlin.jvm.JvmName("-initializemetaError")
public inline fun metaError(block: MetaErrorKt.Dsl.() -> kotlin.Unit): Messages.MetaError =
  MetaErrorKt.Dsl._create(Messages.MetaError.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `MetaError`
 */
public object MetaErrorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: Messages.MetaError.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: Messages.MetaError.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): Messages.MetaError = _builder.build()

    /**
     * `.MetaErrorCode code = 1;`
     */
    public var code: Messages.MetaErrorCode
      @JvmName("getCode")
      get() = _builder.getCode()
      @JvmName("setCode")
      set(value) {
        _builder.setCode(value)
      }
    public var codeValue: kotlin.Int
      @JvmName("getCodeValue")
      get() = _builder.getCodeValue()
      @JvmName("setCodeValue")
      set(value) {
        _builder.setCodeValue(value)
      }
    /**
     * `.MetaErrorCode code = 1;`
     */
    public fun clearCode() {
      _builder.clearCode()
    }

    /**
     * `optional string errorMsg = 2;`
     */
    public var errorMsg: kotlin.String
      @JvmName("getErrorMsg")
      get() = _builder.getErrorMsg()
      @JvmName("setErrorMsg")
      set(value) {
        _builder.setErrorMsg(value)
      }
    /**
     * `optional string errorMsg = 2;`
     */
    public fun clearErrorMsg() {
      _builder.clearErrorMsg()
    }
    /**
     * `optional string errorMsg = 2;`
     * @return Whether the errorMsg field is set.
     */
    public fun hasErrorMsg(): kotlin.Boolean {
      return _builder.hasErrorMsg()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun Messages.MetaError.copy(block: MetaErrorKt.Dsl.() -> kotlin.Unit): Messages.MetaError =
  MetaErrorKt.Dsl._create(this.toBuilder()).apply { block() }._build()
