package omi.tmx.tsx.level1.qrtmd.v2_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.ExchangeIdField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.TotalNumberOfStockGroupsField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.TotalNumberOfSymbolsField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.TradingSystemTimeStampField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.TradingTierIdField;
import omi.tmx.tsx.level1.qrtmd.v2_8.types.Field;
import omi.tmx.tsx.level1.qrtmd.v2_8.types.Message;
import omi.tmx.tsx.level1.qrtmd.v2_8.types.PrintOptions;

/**
 * Represents the TradingTierStatusMessage message from the Level1 protocol.
 *
 * <p>Statistical information on the number of symbols and stock groups for the current trading day, sent at the beginning of each trading day.</p>
 */
public final class TradingTierStatusMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trading Tier Status Message";

    /**
     * Identifies the exchange from which the message originated.
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * The total number of stocks per trading tier and Exchange ID.
     */
    private final TotalNumberOfSymbolsField totalNumberOfSymbols = new TotalNumberOfSymbolsField();

    /**
     * Total number of stock groups per trading tier and exchange ID.
     */
    private final TotalNumberOfStockGroupsField totalNumberOfStockGroups = new TotalNumberOfStockGroupsField();

    /**
     * The time at which the business action occurred.
     */
    private final TradingSystemTimeStampField tradingSystemTimeStamp = new TradingSystemTimeStampField();

    /**
     * A Trading Engine identifier.
     */
    private final TradingTierIdField tradingTierId = new TradingTierIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, totalNumberOfSymbols, totalNumberOfStockGroups, tradingSystemTimeStamp, tradingTierId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identifies the exchange from which the message originated.
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * The total number of stocks per trading tier and Exchange ID.
     *
     * @return the TotalNumberOfSymbols field
     */
    public TotalNumberOfSymbolsField totalNumberOfSymbols() {
        return totalNumberOfSymbols;
    }

    /**
     * Total number of stock groups per trading tier and exchange ID.
     *
     * @return the TotalNumberOfStockGroups field
     */
    public TotalNumberOfStockGroupsField totalNumberOfStockGroups() {
        return totalNumberOfStockGroups;
    }

    /**
     * The time at which the business action occurred.
     *
     * @return the TradingSystemTimeStamp field
     */
    public TradingSystemTimeStampField tradingSystemTimeStamp() {
        return tradingSystemTimeStamp;
    }

    /**
     * A Trading Engine identifier.
     *
     * @return the TradingTierId field
     */
    public TradingTierIdField tradingTierId() {
        return tradingTierId;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!totalNumberOfSymbols.parse(data, cursor)) {
            return false;
        }
        cursor += TotalNumberOfSymbolsField.BYTE_LENGTH;
        if (!totalNumberOfStockGroups.parse(data, cursor)) {
            return false;
        }
        cursor += TotalNumberOfStockGroupsField.BYTE_LENGTH;
        if (!tradingSystemTimeStamp.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSystemTimeStampField.BYTE_LENGTH;
        return tradingTierId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = totalNumberOfSymbols.encode(data, cursor);
        cursor = totalNumberOfStockGroups.encode(data, cursor);
        cursor = tradingSystemTimeStamp.encode(data, cursor);
        cursor = tradingTierId.encode(data, cursor);
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "TotalNumberOfSymbols" -> Optional.of(totalNumberOfSymbols);
            case "TotalNumberOfStockGroups" -> Optional.of(totalNumberOfStockGroups);
            case "TradingSystemTimeStamp" -> Optional.of(tradingSystemTimeStamp);
            case "TradingTierId" -> Optional.of(tradingTierId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradingTierStatusMessage message)) {
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
        if (!(other instanceof TradingTierStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
