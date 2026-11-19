package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MarketTypeIDIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MaturityDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ProductIDInt32NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityReqIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityRequestTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityTypeSecurityTypeEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.StrikePriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SymbolInt32NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the SecurityDefinitionRequestCreateFlexMessage message from the Bgw protocol.
 *
 * <p>SecurityDefinitionRequest_CreateFlexMessage</p>
 */
public final class SecurityDefinitionRequestCreateFlexMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 28;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Request Create Flex Message";

    /**
     * securityReqID
     */
    private final SecurityReqIdField securityReqId = new SecurityReqIdField();

    /**
     * securityRequestType
     */
    private final SecurityRequestTypeField securityRequestType = new SecurityRequestTypeField();

    /**
     * marketTypeID
     */
    private final MarketTypeIDIntField marketTypeIDInt = new MarketTypeIDIntField();

    /**
     * securityType
     */
    private final SecurityTypeSecurityTypeEnumField securityTypeSecurityTypeEnum = new SecurityTypeSecurityTypeEnumField();

    /**
     * maturityDate
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * productID
     */
    private final ProductIDInt32NullField productIDInt32Null = new ProductIDInt32NullField();

    /**
     * symbol
     */
    private final SymbolInt32NullField symbolInt32Null = new SymbolInt32NullField();

    /**
     * strikePrice
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityReqId, securityRequestType, marketTypeIDInt, securityTypeSecurityTypeEnum, maturityDate, productIDInt32Null, symbolInt32Null, strikePrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * securityReqID
     *
     * @return the SecurityReqId field
     */
    public SecurityReqIdField securityReqId() {
        return securityReqId;
    }

    /**
     * securityRequestType
     *
     * @return the SecurityRequestType field
     */
    public SecurityRequestTypeField securityRequestType() {
        return securityRequestType;
    }

    /**
     * marketTypeID
     *
     * @return the MarketTypeIDInt field
     */
    public MarketTypeIDIntField marketTypeIDInt() {
        return marketTypeIDInt;
    }

    /**
     * securityType
     *
     * @return the SecurityTypeSecurityTypeEnum field
     */
    public SecurityTypeSecurityTypeEnumField securityTypeSecurityTypeEnum() {
        return securityTypeSecurityTypeEnum;
    }

    /**
     * maturityDate
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * productID
     *
     * @return the ProductIDInt32Null field
     */
    public ProductIDInt32NullField productIDInt32Null() {
        return productIDInt32Null;
    }

    /**
     * symbol
     *
     * @return the SymbolInt32Null field
     */
    public SymbolInt32NullField symbolInt32Null() {
        return symbolInt32Null;
    }

    /**
     * strikePrice
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!securityReqId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityReqIdField.BYTE_LENGTH;
        if (!securityRequestType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityRequestTypeField.BYTE_LENGTH;
        if (!marketTypeIDInt.parse(data, cursor)) {
            return false;
        }
        cursor += MarketTypeIDIntField.BYTE_LENGTH;
        if (!securityTypeSecurityTypeEnum.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeSecurityTypeEnumField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!productIDInt32Null.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIDInt32NullField.BYTE_LENGTH;
        if (!symbolInt32Null.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolInt32NullField.BYTE_LENGTH;
        return strikePrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityReqId.encode(data, cursor);
        cursor = securityRequestType.encode(data, cursor);
        cursor = marketTypeIDInt.encode(data, cursor);
        cursor = securityTypeSecurityTypeEnum.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = productIDInt32Null.encode(data, cursor);
        cursor = symbolInt32Null.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "SecurityReqId" -> Optional.of(securityReqId);
            case "SecurityRequestType" -> Optional.of(securityRequestType);
            case "MarketTypeIDInt" -> Optional.of(marketTypeIDInt);
            case "SecurityTypeSecurityTypeEnum" -> Optional.of(securityTypeSecurityTypeEnum);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "ProductIDInt32Null" -> Optional.of(productIDInt32Null);
            case "SymbolInt32Null" -> Optional.of(symbolInt32Null);
            case "StrikePrice" -> Optional.of(strikePrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionRequestCreateFlexMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecurityDefinitionRequestCreateFlexMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
