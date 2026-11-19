package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ClOrdIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ClRequestIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.CrossIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.FirmIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.InstrumentIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.MatchIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.NumSplitsField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.QuantityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.SideField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups.TradeSplitsEntry;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups.TradeSplitsList;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Message;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * Represents the ModifyTradeMessage message from the Otto protocol.
 *
 * <p>The Modify Trade request is used to change clearing information on an existing trade as well as split a trade into multiple components with different clearing assignments. The trade to be changed is identified by the MatchId field. Acknowledged by Modify Trade Response.</p>
 */
public final class ModifyTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'M';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 55;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Trade Message";

    /**
     * Firm ID (e.g. ABCD, 123A)
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * Instrument ID, as specified by Option Directory notifications
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Client identifier of the request. It is echoed back with either Mass Cancel Response or Reject
     */
    private final ClRequestIdField clRequestId = new ClRequestIdField();

    /**
     * See Client Order Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * CrossId of the trade being modified
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * MatchId of the trade to be modified
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * B=Buy, S=Sell
     */
    private final SideField side = new SideField();

    /**
     * Number of contracts
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Number of parties this trade is being split into (1 &lt;= n &lt;= 10)
     */
    private final NumSplitsField numSplits = new NumSplitsField();

    /**
     * Trade Splits [1..10] of Modify Trade: clearing configuration for each party the trade is being split into
     */
    private final TradeSplitsList tradeSplits = new TradeSplitsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(firmId, instrumentId, clRequestId, clOrdId, crossId, matchId, side, quantity, numSplits);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Firm ID (e.g. ABCD, 123A)
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * Instrument ID, as specified by Option Directory notifications
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Client identifier of the request. It is echoed back with either Mass Cancel Response or Reject
     *
     * @return the ClRequestId field
     */
    public ClRequestIdField clRequestId() {
        return clRequestId;
    }

    /**
     * See Client Order Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * CrossId of the trade being modified
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * MatchId of the trade to be modified
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * B=Buy, S=Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Number of contracts
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Number of parties this trade is being split into (1 &lt;= n &lt;= 10)
     *
     * @return the NumSplits field
     */
    public NumSplitsField numSplits() {
        return numSplits;
    }

    /**
     * Trade Splits [1..10] of Modify Trade: clearing configuration for each party the trade is being split into
     *
     * <p>Encode writes this list's size to the NumSplits field.</p>
     *
     * @return the TradeSplits entries
     */
    public TradeSplitsList tradeSplits() {
        return tradeSplits;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + tradeSplits.byteLength();
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
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!clRequestId.parse(data, cursor)) {
            return false;
        }
        cursor += ClRequestIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!numSplits.parse(data, cursor)) {
            return false;
        }
        cursor += NumSplitsField.BYTE_LENGTH;
        if (!tradeSplits.parse(data, cursor, end, numSplits.value())) {
            return false;
        }
        cursor += tradeSplits.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (tradeSplits.size() > 65535) {
            throw new IllegalStateException("tradeSplits holds " + tradeSplits.size() + " entries, more than its count field can state");
        }
        numSplits.value(tradeSplits.size());
        int cursor = offset;
        cursor = firmId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = clRequestId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = crossId.encode(data, cursor);
        cursor = matchId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = numSplits.encode(data, cursor);
        cursor = tradeSplits.encode(data, cursor);
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
        tradeSplits.clear();
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
            if (field != numSplits && !field.isRecognized()) {
                return false;
            }
        }
        return tradeSplits.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numSplits && !field.isValid()) {
                return false;
            }
        }
        if (!tradeSplits.isValid()) {
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
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!clRequestId.isDecoded()) {
            return Optional.of(clRequestId);
        }
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!crossId.isDecoded()) {
            return Optional.of(crossId);
        }
        if (!matchId.isDecoded()) {
            return Optional.of(matchId);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!quantity.isDecoded()) {
            return Optional.of(quantity);
        }
        if (!numSplits.isDecoded()) {
            return Optional.of(numSplits);
        }
        if (!tradeSplits.isDecoded()) {
            return Optional.of(tradeSplits.failedEntry().flatMap(TradeSplitsEntry::failedAt).orElse(numSplits));
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
            case "FirmId" -> Optional.of(firmId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "ClRequestId" -> Optional.of(clRequestId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "CrossId" -> Optional.of(crossId);
            case "MatchId" -> Optional.of(matchId);
            case "Side" -> Optional.of(side);
            case "Quantity" -> Optional.of(quantity);
            case "NumSplits" -> Optional.of(numSplits);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyTradeMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(tradeSplits.diffFields(message.tradeSplits));
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
            tradeSplits.toFormattedString(builder, options);
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
        tradeSplits.toFormattedString(builder, nested);
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
        if (!(other instanceof ModifyTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && tradeSplits.equals(message.tradeSplits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, tradeSplits);
    }
}
