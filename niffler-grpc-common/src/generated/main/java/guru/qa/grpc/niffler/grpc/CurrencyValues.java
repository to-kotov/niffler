// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: niffler-currency.proto

package guru.qa.grpc.niffler.grpc;

/**
 * Protobuf enum {@code guru.qa.grpc.niffler.CurrencyValues}
 */
public enum CurrencyValues
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RUB = 0;</code>
   */
  RUB(0),
  /**
   * <code>USD = 1;</code>
   */
  USD(1),
  /**
   * <code>EUR = 2;</code>
   */
  EUR(2),
  /**
   * <code>KZT = 3;</code>
   */
  KZT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>RUB = 0;</code>
   */
  public static final int RUB_VALUE = 0;
  /**
   * <code>USD = 1;</code>
   */
  public static final int USD_VALUE = 1;
  /**
   * <code>EUR = 2;</code>
   */
  public static final int EUR_VALUE = 2;
  /**
   * <code>KZT = 3;</code>
   */
  public static final int KZT_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CurrencyValues valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CurrencyValues forNumber(int value) {
    switch (value) {
      case 0: return RUB;
      case 1: return USD;
      case 2: return EUR;
      case 3: return KZT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CurrencyValues>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CurrencyValues> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CurrencyValues>() {
          public CurrencyValues findValueByNumber(int number) {
            return CurrencyValues.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return guru.qa.grpc.niffler.grpc.NifflerCurrencyProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final CurrencyValues[] VALUES = values();

  public static CurrencyValues valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CurrencyValues(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:guru.qa.grpc.niffler.CurrencyValues)
}

