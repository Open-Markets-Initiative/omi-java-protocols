package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.BuyOrderIdField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.MatchIdField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.NewLeg1PriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.NewLeg2PriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.NewPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.OldLeg1PriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.OldLeg2PriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.OldPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.fields.SellOrderIdField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.structs.InstrHeader;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.types.Field;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.types.Message;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.types.PrintOptions;

/**
 * Represents the SpreadTradeAmendMessage message from the MarketDataApi protocol.
 *
 * <p>SpreadTradeAmendMessage</p>
 */
public final class SpreadTradeAmendMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 94;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Spread Trade Amend Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * matchId
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * buyOrderId
     */
    private final BuyOrderIdField buyOrderId = new BuyOrderIdField();

    /**
     * sellOrderId
     */
    private final SellOrderIdField sellOrderId = new SellOrderIdField();

    /**
     * oldPrice
     */
    private final OldPriceField oldPrice = new OldPriceField();

    /**
     * newPrice
     */
    private final NewPriceField newPrice = new NewPriceField();

    /**
     * oldLeg1Price
     */
    private final OldLeg1PriceField oldLeg1Price = new OldLeg1PriceField();

    /**
     * newLeg1Price
     */
    private final NewLeg1PriceField newLeg1Price = new NewLeg1PriceField();

    /**
     * oldLeg2Price
     */
    private final OldLeg2PriceField oldLeg2Price = new OldLeg2PriceField();

    /**
     * newLeg2Price
     */
    private final NewLeg2PriceField newLeg2Price = new NewLeg2PriceField();

    /**
     * Instrument Header
     */
    private final InstrHeader instrHeader = new InstrHeader();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(instrHeader.fields(), List.<Field>of(matchId), List.<Field>of(buyOrderId), List.<Field>of(sellOrderId), List.<Field>of(oldPrice), List.<Field>of(newPrice), List.<Field>of(oldLeg1Price), List.<Field>of(newLeg1Price), List.<Field>of(oldLeg2Price), List.<Field>of(newLeg2Price)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * matchId
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * buyOrderId
     *
     * @return the BuyOrderId field
     */
    public BuyOrderIdField buyOrderId() {
        return buyOrderId;
    }

    /**
     * sellOrderId
     *
     * @return the SellOrderId field
     */
    public SellOrderIdField sellOrderId() {
        return sellOrderId;
    }

    /**
     * oldPrice
     *
     * @return the OldPrice field
     */
    public OldPriceField oldPrice() {
        return oldPrice;
    }

    /**
     * newPrice
     *
     * @return the NewPrice field
     */
    public NewPriceField newPrice() {
        return newPrice;
    }

    /**
     * oldLeg1Price
     *
     * @return the OldLeg1Price field
     */
    public OldLeg1PriceField oldLeg1Price() {
        return oldLeg1Price;
    }

    /**
     * newLeg1Price
     *
     * @return the NewLeg1Price field
     */
    public NewLeg1PriceField newLeg1Price() {
        return newLeg1Price;
    }

    /**
     * oldLeg2Price
     *
     * @return the OldLeg2Price field
     */
    public OldLeg2PriceField oldLeg2Price() {
        return oldLeg2Price;
    }

    /**
     * newLeg2Price
     *
     * @return the NewLeg2Price field
     */
    public NewLeg2PriceField newLeg2Price() {
        return newLeg2Price;
    }

    /**
     * Instrument Header
     *
     * @return the InstrHeader record
     */
    public InstrHeader instrHeader() {
        return instrHeader;
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
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(instrHeader.transactTime().value());
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
        if (!instrHeader.parseFrom(data, cursor, end - 72)) {
            return false;
        }
        cursor += instrHeader.byteLength();
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
        if (!buyOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += BuyOrderIdField.BYTE_LENGTH;
        if (!sellOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SellOrderIdField.BYTE_LENGTH;
        if (!oldPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OldPriceField.BYTE_LENGTH;
        if (!newPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NewPriceField.BYTE_LENGTH;
        if (!oldLeg1Price.parse(data, cursor)) {
            return false;
        }
        cursor += OldLeg1PriceField.BYTE_LENGTH;
        if (!newLeg1Price.parse(data, cursor)) {
            return false;
        }
        cursor += NewLeg1PriceField.BYTE_LENGTH;
        if (!oldLeg2Price.parse(data, cursor)) {
            return false;
        }
        cursor += OldLeg2PriceField.BYTE_LENGTH;
        if (!newLeg2Price.parse(data, cursor)) {
            return false;
        }
        cursor += NewLeg2PriceField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrHeader.encode(data, cursor);
        cursor = matchId.encode(data, cursor);
        cursor = buyOrderId.encode(data, cursor);
        cursor = sellOrderId.encode(data, cursor);
        cursor = oldPrice.encode(data, cursor);
        cursor = newPrice.encode(data, cursor);
        cursor = oldLeg1Price.encode(data, cursor);
        cursor = newLeg1Price.encode(data, cursor);
        cursor = oldLeg2Price.encode(data, cursor);
        cursor = newLeg2Price.encode(data, cursor);
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
        instrHeader.clear();
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
            case "MatchId" -> Optional.of(matchId);
            case "BuyOrderId" -> Optional.of(buyOrderId);
            case "SellOrderId" -> Optional.of(sellOrderId);
            case "OldPrice" -> Optional.of(oldPrice);
            case "NewPrice" -> Optional.of(newPrice);
            case "OldLeg1Price" -> Optional.of(oldLeg1Price);
            case "NewLeg1Price" -> Optional.of(newLeg1Price);
            case "OldLeg2Price" -> Optional.of(oldLeg2Price);
            case "NewLeg2Price" -> Optional.of(newLeg2Price);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SpreadTradeAmendMessage message)) {
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
        if (!(other instanceof SpreadTradeAmendMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
