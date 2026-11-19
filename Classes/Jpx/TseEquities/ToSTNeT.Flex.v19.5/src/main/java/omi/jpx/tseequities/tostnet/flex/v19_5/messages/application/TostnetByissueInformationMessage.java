package omi.jpx.tseequities.tostnet.flex.v19_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.jpx.tseequities.tostnet.flex.v19_5.fields.MarketIdentificationFlagField;
import omi.jpx.tseequities.tostnet.flex.v19_5.fields.ReservedField;
import omi.jpx.tseequities.tostnet.flex.v19_5.fields.TransactionIdentificationFlagField;
import omi.jpx.tseequities.tostnet.flex.v19_5.structs.Price;
import omi.jpx.tseequities.tostnet.flex.v19_5.structs.TradingHalt;
import omi.jpx.tseequities.tostnet.flex.v19_5.structs.TradingVolume;
import omi.jpx.tseequities.tostnet.flex.v19_5.structs.Turnover;
import omi.jpx.tseequities.tostnet.flex.v19_5.types.Field;
import omi.jpx.tseequities.tostnet.flex.v19_5.types.Message;
import omi.jpx.tseequities.tostnet.flex.v19_5.types.PrintOptions;

/**
 * Represents the TostnetByissueInformationMessage message from the ToSTNeT protocol.
 *
 * <p>In this tag, information concerning trade and trading halt for an issue (single-issue transaction, basket transaction, or closing price transaction) on the ToSTNeT is set. This data appears as part of realtime data.</p>
 */
public final class TostnetByissueInformationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 72;

    /**
     * This message's declared name.
     */
    public static final String NAME = "ToSTNeT By-Issue Information Message";

    /**
     * This item is reserved.
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * Indicates the flag for identifying ToSTNeT market.
     */
    private final MarketIdentificationFlagField marketIdentificationFlag = new MarketIdentificationFlagField();

    /**
     * Indicates the identification of the transaction.
     */
    private final TransactionIdentificationFlagField transactionIdentificationFlag = new TransactionIdentificationFlagField();

    /**
     * Trading Halt
     */
    private final TradingHalt tradingHalt = new TradingHalt();

    /**
     * Price
     */
    private final Price price = new Price();

    /**
     * Trading Volume
     */
    private final TradingVolume tradingVolume = new TradingVolume();

    /**
     * Turnover
     */
    private final Turnover turnover = new Turnover();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(reserved), List.<Field>of(marketIdentificationFlag), tradingHalt.fields(), List.<Field>of(transactionIdentificationFlag), price.fields(), tradingVolume.fields(), turnover.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This item is reserved.
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
    }

    /**
     * Indicates the flag for identifying ToSTNeT market.
     *
     * @return the MarketIdentificationFlag field
     */
    public MarketIdentificationFlagField marketIdentificationFlag() {
        return marketIdentificationFlag;
    }

    /**
     * Indicates the identification of the transaction.
     *
     * @return the TransactionIdentificationFlag field
     */
    public TransactionIdentificationFlagField transactionIdentificationFlag() {
        return transactionIdentificationFlag;
    }

    /**
     * Trading Halt
     *
     * @return the TradingHalt record
     */
    public TradingHalt tradingHalt() {
        return tradingHalt;
    }

    /**
     * Price
     *
     * @return the Price record
     */
    public Price price() {
        return price;
    }

    /**
     * Trading Volume
     *
     * @return the TradingVolume record
     */
    public TradingVolume tradingVolume() {
        return tradingVolume;
    }

    /**
     * Turnover
     *
     * @return the Turnover record
     */
    public Turnover turnover() {
        return turnover;
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
        if (!reserved.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedField.BYTE_LENGTH;
        if (!marketIdentificationFlag.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdentificationFlagField.BYTE_LENGTH;
        if (!tradingHalt.parseFrom(data, cursor, end - 61)) {
            return false;
        }
        cursor += tradingHalt.byteLength();
        if (!transactionIdentificationFlag.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdentificationFlagField.BYTE_LENGTH;
        if (!price.parseFrom(data, cursor, end - 30)) {
            return false;
        }
        cursor += price.byteLength();
        if (!tradingVolume.parseFrom(data, cursor, end - 15)) {
            return false;
        }
        cursor += tradingVolume.byteLength();
        return turnover.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = reserved.encode(data, cursor);
        cursor = marketIdentificationFlag.encode(data, cursor);
        cursor = tradingHalt.encode(data, cursor);
        cursor = transactionIdentificationFlag.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = tradingVolume.encode(data, cursor);
        cursor = turnover.encode(data, cursor);
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
        tradingHalt.clear();
        price.clear();
        tradingVolume.clear();
        turnover.clear();
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
            case "Reserved" -> Optional.of(reserved);
            case "MarketIdentificationFlag" -> Optional.of(marketIdentificationFlag);
            case "TransactionIdentificationFlag" -> Optional.of(transactionIdentificationFlag);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TostnetByissueInformationMessage message)) {
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
        if (!(other instanceof TostnetByissueInformationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
