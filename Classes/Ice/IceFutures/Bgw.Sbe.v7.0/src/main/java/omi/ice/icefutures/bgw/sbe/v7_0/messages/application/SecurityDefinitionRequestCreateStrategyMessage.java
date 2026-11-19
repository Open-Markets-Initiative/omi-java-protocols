package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.EndDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MarketTypeIDIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ProductIDInt32NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityReqIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityRequestTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecuritySubTypeInt16NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityTypeSecurityTypeEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.StartDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityDefinitionRequestCreateStrategyMessageNoLegsGroups;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the SecurityDefinitionRequestCreateStrategyMessage message from the Bgw protocol.
 *
 * <p>SecurityDefinitionRequest_CreateStrategyMessage</p>
 */
public final class SecurityDefinitionRequestCreateStrategyMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 24;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Request Create Strategy Message";

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
     * securitySubType
     */
    private final SecuritySubTypeInt16NullField securitySubTypeInt16Null = new SecuritySubTypeInt16NullField();

    /**
     * productID
     */
    private final ProductIDInt32NullField productIDInt32Null = new ProductIDInt32NullField();

    /**
     * startDate
     */
    private final StartDateField startDate = new StartDateField();

    /**
     * endDate
     */
    private final EndDateField endDate = new EndDateField();

    /**
     * securityType
     */
    private final SecurityTypeSecurityTypeEnumField securityTypeSecurityTypeEnum = new SecurityTypeSecurityTypeEnumField();

    /**
     * noLegs Block
     */
    private final SecurityDefinitionRequestCreateStrategyMessageNoLegsGroups securityDefinitionRequestCreateStrategyMessageNoLegsGroups = new SecurityDefinitionRequestCreateStrategyMessageNoLegsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityReqId, securityRequestType, marketTypeIDInt, securitySubTypeInt16Null, productIDInt32Null, startDate, endDate, securityTypeSecurityTypeEnum);

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
     * securitySubType
     *
     * @return the SecuritySubTypeInt16Null field
     */
    public SecuritySubTypeInt16NullField securitySubTypeInt16Null() {
        return securitySubTypeInt16Null;
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
     * startDate
     *
     * @return the StartDate field
     */
    public StartDateField startDate() {
        return startDate;
    }

    /**
     * endDate
     *
     * @return the EndDate field
     */
    public EndDateField endDate() {
        return endDate;
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
     * noLegs Block
     *
     * @return the SecurityDefinitionRequestCreateStrategyMessageNoLegsGroups record
     */
    public SecurityDefinitionRequestCreateStrategyMessageNoLegsGroups securityDefinitionRequestCreateStrategyMessageNoLegsGroups() {
        return securityDefinitionRequestCreateStrategyMessageNoLegsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + securityDefinitionRequestCreateStrategyMessageNoLegsGroups.byteLength() - SecurityDefinitionRequestCreateStrategyMessageNoLegsGroups.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
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
        if (!securitySubTypeInt16Null.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeInt16NullField.BYTE_LENGTH;
        if (!productIDInt32Null.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIDInt32NullField.BYTE_LENGTH;
        if (!startDate.parse(data, cursor)) {
            return false;
        }
        cursor += StartDateField.BYTE_LENGTH;
        if (!endDate.parse(data, cursor)) {
            return false;
        }
        cursor += EndDateField.BYTE_LENGTH;
        if (!securityTypeSecurityTypeEnum.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeSecurityTypeEnumField.BYTE_LENGTH;
        if (!securityDefinitionRequestCreateStrategyMessageNoLegsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += securityDefinitionRequestCreateStrategyMessageNoLegsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = securityReqId.encode(data, cursor);
        cursor = securityRequestType.encode(data, cursor);
        cursor = marketTypeIDInt.encode(data, cursor);
        cursor = securitySubTypeInt16Null.encode(data, cursor);
        cursor = productIDInt32Null.encode(data, cursor);
        cursor = startDate.encode(data, cursor);
        cursor = endDate.encode(data, cursor);
        cursor = securityTypeSecurityTypeEnum.encode(data, cursor);
        cursor = securityDefinitionRequestCreateStrategyMessageNoLegsGroups.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        securityDefinitionRequestCreateStrategyMessageNoLegsGroups.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return securityDefinitionRequestCreateStrategyMessageNoLegsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!securityDefinitionRequestCreateStrategyMessageNoLegsGroups.isValid()) {
            return false;
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
        if (!securityReqId.isDecoded()) {
            return Optional.of(securityReqId);
        }
        if (!securityRequestType.isDecoded()) {
            return Optional.of(securityRequestType);
        }
        if (!marketTypeIDInt.isDecoded()) {
            return Optional.of(marketTypeIDInt);
        }
        if (!securitySubTypeInt16Null.isDecoded()) {
            return Optional.of(securitySubTypeInt16Null);
        }
        if (!productIDInt32Null.isDecoded()) {
            return Optional.of(productIDInt32Null);
        }
        if (!startDate.isDecoded()) {
            return Optional.of(startDate);
        }
        if (!endDate.isDecoded()) {
            return Optional.of(endDate);
        }
        if (!securityTypeSecurityTypeEnum.isDecoded()) {
            return Optional.of(securityTypeSecurityTypeEnum);
        }
        if (!securityDefinitionRequestCreateStrategyMessageNoLegsGroups.isDecoded()) {
            return securityDefinitionRequestCreateStrategyMessageNoLegsGroups.failedAt();
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
            case "SecuritySubTypeInt16Null" -> Optional.of(securitySubTypeInt16Null);
            case "ProductIDInt32Null" -> Optional.of(productIDInt32Null);
            case "StartDate" -> Optional.of(startDate);
            case "EndDate" -> Optional.of(endDate);
            case "SecurityTypeSecurityTypeEnum" -> Optional.of(securityTypeSecurityTypeEnum);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionRequestCreateStrategyMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(securityDefinitionRequestCreateStrategyMessageNoLegsGroups.diffFields(message.securityDefinitionRequestCreateStrategyMessageNoLegsGroups));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            securityDefinitionRequestCreateStrategyMessageNoLegsGroups.toFormattedString(builder, options);
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
        securityDefinitionRequestCreateStrategyMessageNoLegsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof SecurityDefinitionRequestCreateStrategyMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && securityDefinitionRequestCreateStrategyMessageNoLegsGroups.equals(message.securityDefinitionRequestCreateStrategyMessageNoLegsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, securityDefinitionRequestCreateStrategyMessageNoLegsGroups);
    }
}
