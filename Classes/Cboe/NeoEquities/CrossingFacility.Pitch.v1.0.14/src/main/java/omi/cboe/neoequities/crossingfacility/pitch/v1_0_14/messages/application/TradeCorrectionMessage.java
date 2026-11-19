package omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.CorrectedPriceField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.CorrectedQuantityField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.CorrectedSettlementDateField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.CorrectedSettlementTypeField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.ExecutionIdField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.OrderBookTypeField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.OriginalPriceField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.OriginalQuantityField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.OriginalSettlementDateField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.OriginalSettlementTypeField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.SymbolField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.fields.TimestampField;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.types.Field;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.types.Message;
import omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.types.PrintOptions;

/**
 * Represents the TradeCorrectionMessage message from the CrossingFacility protocol.
 *
 * <p>Sent whenever an execution on Cboe Canada NEO is corrected. Applications that simply build a Cboe Canada NEO book can ignore Trade Correction messages.</p>
 */
public final class TradeCorrectionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 65;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Correction Message";

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Order book to which the trading status applies.
     */
    private final OrderBookTypeField orderBookType = new OrderBookTypeField();

    /**
     * Symbol (right padded with spaces).
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Original number of shares executed or reported.
     */
    private final OriginalQuantityField originalQuantity = new OriginalQuantityField();

    /**
     * Original price of the execution.
     */
    private final OriginalPriceField originalPrice = new OriginalPriceField();

    /**
     * Original settlement terms of the order.
     */
    private final OriginalSettlementTypeField originalSettlementType = new OriginalSettlementTypeField();

    /**
     * Original date the order would settle.
     */
    private final OriginalSettlementDateField originalSettlementDate = new OriginalSettlementDateField();

    /**
     * Corrected number of shares executed or reported.
     */
    private final CorrectedQuantityField correctedQuantity = new CorrectedQuantityField();

    /**
     * Corrected price of the execution.
     */
    private final CorrectedPriceField correctedPrice = new CorrectedPriceField();

    /**
     * Corrected settlement terms of the order.
     */
    private final CorrectedSettlementTypeField correctedSettlementType = new CorrectedSettlementTypeField();

    /**
     * Corrected date the order would settle.
     */
    private final CorrectedSettlementDateField correctedSettlementDate = new CorrectedSettlementDateField();

    /**
     * Cboe Canada NEO generated day-unique execution identifier of this execution. Execution Id is also referenced in the Trade Break and Trade Correction messages.
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderBookType, symbol, originalQuantity, originalPrice, originalSettlementType, originalSettlementDate, correctedQuantity, correctedPrice, correctedSettlementType, correctedSettlementDate, executionId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Order book to which the trading status applies.
     *
     * @return the OrderBookType field
     */
    public OrderBookTypeField orderBookType() {
        return orderBookType;
    }

    /**
     * Symbol (right padded with spaces).
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Original number of shares executed or reported.
     *
     * @return the OriginalQuantity field
     */
    public OriginalQuantityField originalQuantity() {
        return originalQuantity;
    }

    /**
     * Original price of the execution.
     *
     * @return the OriginalPrice field
     */
    public OriginalPriceField originalPrice() {
        return originalPrice;
    }

    /**
     * Original settlement terms of the order.
     *
     * @return the OriginalSettlementType field
     */
    public OriginalSettlementTypeField originalSettlementType() {
        return originalSettlementType;
    }

    /**
     * Original date the order would settle.
     *
     * @return the OriginalSettlementDate field
     */
    public OriginalSettlementDateField originalSettlementDate() {
        return originalSettlementDate;
    }

    /**
     * Corrected number of shares executed or reported.
     *
     * @return the CorrectedQuantity field
     */
    public CorrectedQuantityField correctedQuantity() {
        return correctedQuantity;
    }

    /**
     * Corrected price of the execution.
     *
     * @return the CorrectedPrice field
     */
    public CorrectedPriceField correctedPrice() {
        return correctedPrice;
    }

    /**
     * Corrected settlement terms of the order.
     *
     * @return the CorrectedSettlementType field
     */
    public CorrectedSettlementTypeField correctedSettlementType() {
        return correctedSettlementType;
    }

    /**
     * Corrected date the order would settle.
     *
     * @return the CorrectedSettlementDate field
     */
    public CorrectedSettlementDateField correctedSettlementDate() {
        return correctedSettlementDate;
    }

    /**
     * Cboe Canada NEO generated day-unique execution identifier of this execution. Execution Id is also referenced in the Trade Break and Trade Correction messages.
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!orderBookType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookTypeField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!originalQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalQuantityField.BYTE_LENGTH;
        if (!originalPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalPriceField.BYTE_LENGTH;
        if (!originalSettlementType.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSettlementTypeField.BYTE_LENGTH;
        if (!originalSettlementDate.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSettlementDateField.BYTE_LENGTH;
        if (!correctedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedQuantityField.BYTE_LENGTH;
        if (!correctedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedPriceField.BYTE_LENGTH;
        if (!correctedSettlementType.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSettlementTypeField.BYTE_LENGTH;
        if (!correctedSettlementDate.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSettlementDateField.BYTE_LENGTH;
        return executionId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderBookType.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = originalQuantity.encode(data, cursor);
        cursor = originalPrice.encode(data, cursor);
        cursor = originalSettlementType.encode(data, cursor);
        cursor = originalSettlementDate.encode(data, cursor);
        cursor = correctedQuantity.encode(data, cursor);
        cursor = correctedPrice.encode(data, cursor);
        cursor = correctedSettlementType.encode(data, cursor);
        cursor = correctedSettlementDate.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "OrderBookType" -> Optional.of(orderBookType);
            case "Symbol" -> Optional.of(symbol);
            case "OriginalQuantity" -> Optional.of(originalQuantity);
            case "OriginalPrice" -> Optional.of(originalPrice);
            case "OriginalSettlementType" -> Optional.of(originalSettlementType);
            case "OriginalSettlementDate" -> Optional.of(originalSettlementDate);
            case "CorrectedQuantity" -> Optional.of(correctedQuantity);
            case "CorrectedPrice" -> Optional.of(correctedPrice);
            case "CorrectedSettlementType" -> Optional.of(correctedSettlementType);
            case "CorrectedSettlementDate" -> Optional.of(correctedSettlementDate);
            case "ExecutionId" -> Optional.of(executionId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCorrectionMessage message)) {
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
        if (!(other instanceof TradeCorrectionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
