package omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.fields.BuyBrokerIdField;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.fields.BypassField;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.fields.CrossTypeField;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.fields.InstrumentIdField;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.fields.MatchNumberField;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.fields.PriceField;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.fields.SellBrokerIdField;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.fields.SettlementTypeField;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.fields.SharesField;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.fields.TimestampField;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.types.Field;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.types.Message;
import omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.types.PrintOptions;

/**
 * Represents the CrossTradeMessage message from the TcpLevel2 protocol.
 *
 * <p>Cross trades are only accepted on Omega ATS.</p>
 */
public final class CrossTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Q';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 31;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cross Trade Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 29, 2 };

    /**
     * The kind of cross being reported
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Internal instrument identifier for Omega ATS and Lynx ATS
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Total number of shares associated with the order being added to the book
     */
    private final SharesField shares = new SharesField();

    /**
     * The display price of the new order.
     */
    private final PriceField price = new PriceField();

    /**
     * Day unique Match Number for this execution.
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * Buy broker number or '1' for anonymous
     */
    private final BuyBrokerIdField buyBrokerId = new BuyBrokerIdField();

    /**
     * Sell broker number or '1' for anonymous
     */
    private final SellBrokerIdField sellBrokerId = new SellBrokerIdField();

    /**
     * Whether the cross bypassed the order book
     */
    private final BypassField bypass = new BypassField();

    /**
     * Settlement terms of the cross
     */
    private final SettlementTypeField settlementType = new SettlementTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(crossType, instrumentId, timestampField, shares, price, matchNumber, buyBrokerId, sellBrokerId, bypass, settlementType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The kind of cross being reported
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * Internal instrument identifier for Omega ATS and Lynx ATS
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Total number of shares associated with the order being added to the book
     *
     * @return the Shares field
     */
    public SharesField shares() {
        return shares;
    }

    /**
     * The display price of the new order.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Day unique Match Number for this execution.
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
    }

    /**
     * Buy broker number or '1' for anonymous
     *
     * @return the BuyBrokerId field
     */
    public BuyBrokerIdField buyBrokerId() {
        return buyBrokerId;
    }

    /**
     * Sell broker number or '1' for anonymous
     *
     * @return the SellBrokerId field
     */
    public SellBrokerIdField sellBrokerId() {
        return sellBrokerId;
    }

    /**
     * Whether the cross bypassed the order book
     *
     * @return the Bypass field
     */
    public BypassField bypass() {
        return bypass;
    }

    /**
     * Settlement terms of the cross
     *
     * @return the SettlementType field
     */
    public SettlementTypeField settlementType() {
        return settlementType;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        return PADDING.clone();
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
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!shares.parse(data, cursor)) {
            return false;
        }
        cursor += SharesField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        if (!buyBrokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BuyBrokerIdField.BYTE_LENGTH;
        if (!sellBrokerId.parse(data, cursor)) {
            return false;
        }
        cursor += SellBrokerIdField.BYTE_LENGTH;
        if (!bypass.parse(data, cursor)) {
            return false;
        }
        cursor += BypassField.BYTE_LENGTH;
        if (!settlementType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTypeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = crossType.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = shares.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = buyBrokerId.encode(data, cursor);
        cursor = sellBrokerId.encode(data, cursor);
        cursor = bypass.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        if (buffer != null && buffer.length >= 31) {
            System.arraycopy(buffer, 29, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
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
            case "CrossType" -> Optional.of(crossType);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Timestamp" -> Optional.of(timestampField);
            case "Shares" -> Optional.of(shares);
            case "Price" -> Optional.of(price);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "BuyBrokerId" -> Optional.of(buyBrokerId);
            case "SellBrokerId" -> Optional.of(sellBrokerId);
            case "Bypass" -> Optional.of(bypass);
            case "SettlementType" -> Optional.of(settlementType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CrossTradeMessage message)) {
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
        if (!(other instanceof CrossTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
