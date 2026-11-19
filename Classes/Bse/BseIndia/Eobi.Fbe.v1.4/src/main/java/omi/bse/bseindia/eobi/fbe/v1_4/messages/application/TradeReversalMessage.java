package omi.bse.bseindia.eobi.fbe.v1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.LastPxField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.LastQtyField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.NoMdEntriesField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.SecurityIdField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.TransactTimeField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.TrdMatchIdField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.TrdRegTsExecutionTimeField;
import omi.bse.bseindia.eobi.fbe.v1_4.groups.MdTradeEntryGrpEntry;
import omi.bse.bseindia.eobi.fbe.v1_4.groups.MdTradeEntryGrpList;
import omi.bse.bseindia.eobi.fbe.v1_4.types.Field;
import omi.bse.bseindia.eobi.fbe.v1_4.types.Message;
import omi.bse.bseindia.eobi.fbe.v1_4.types.PrintOptions;

/**
 * Represents the TradeReversalMessage message from the Eobi protocol.
 *
 * <p>Published when a trade is reversed.</p>
 */
public final class TradeReversalMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 416;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Reversal Message";

    /**
     * The number of slots that MdTradeEntryGrp carries on the wire.
     */
    public static final int MD_TRADE_ENTRY_GRP_COUNT = 15;

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 20, 4, 49, 7, 73, 7, 97, 7, 121, 7, 145, 7, 169, 7, 193, 7, 217, 7, 241, 7, 265, 7, 289, 7, 313, 7, 337, 7, 361, 7, 385, 7, 409, 7 };

    /**
     * Unique instrument identifier.
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Transaction timestamp.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Unique identifier for each price level of a match event.
     */
    private final TrdMatchIdField trdMatchId = new TrdMatchIdField();

    /**
     * The potential matchable quantity for the auction.
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Indicating the potential Auction price for a crossed order book.
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Last matching execution timestamp.
     */
    private final TrdRegTsExecutionTimeField trdRegTsExecutionTime = new TrdRegTsExecutionTimeField();

    /**
     * Number of entries in Market Data message for MDEntryGrp.
     */
    private final NoMdEntriesField noMdEntries = new NoMdEntriesField();

    /**
     * Trade statistics repeated NoMDEntries times in the Trade Reversal Message.
     */
    private final MdTradeEntryGrpList mdTradeEntryGrp = new MdTradeEntryGrpList(MD_TRADE_ENTRY_GRP_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, transactTime, trdMatchId, lastQty, lastPx, trdRegTsExecutionTime, noMdEntries);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique instrument identifier.
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Transaction timestamp.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Unique identifier for each price level of a match event.
     *
     * @return the TrdMatchId field
     */
    public TrdMatchIdField trdMatchId() {
        return trdMatchId;
    }

    /**
     * The potential matchable quantity for the auction.
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Indicating the potential Auction price for a crossed order book.
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Last matching execution timestamp.
     *
     * @return the TrdRegTsExecutionTime field
     */
    public TrdRegTsExecutionTimeField trdRegTsExecutionTime() {
        return trdRegTsExecutionTime;
    }

    /**
     * Number of entries in Market Data message for MDEntryGrp.
     *
     * @return the NoMdEntries field
     */
    public NoMdEntriesField noMdEntries() {
        return noMdEntries;
    }

    /**
     * Trade statistics repeated NoMDEntries times in the Trade Reversal Message.
     *
     * <p>The wire always carries 15 slots, and this list holds those in use: encode writes its size to the NoMdEntries field and fills the rest.</p>
     *
     * @return the MdTradeEntryGrp entries
     */
    public MdTradeEntryGrpList mdTradeEntryGrp() {
        return mdTradeEntryGrp;
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
        return Optional.ofNullable(transactTime.value());
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
        if (decoded) {
            mdTradeEntryGrp.keep(buffer, offset);
        }
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!trdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += TrdMatchIdField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!trdRegTsExecutionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRegTsExecutionTimeField.BYTE_LENGTH;
        if (!noMdEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoMdEntriesField.BYTE_LENGTH;
        cursor += 7; // padding
        if (!mdTradeEntryGrp.parse(data, cursor, end, noMdEntries.value())) {
            return false;
        }
        cursor += mdTradeEntryGrp.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        if (mdTradeEntryGrp.size() > 255) {
            throw new IllegalStateException("mdTradeEntryGrp holds " + mdTradeEntryGrp.size() + " entries, more than its count field can state");
        }
        noMdEntries.value((short) mdTradeEntryGrp.size());
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = trdMatchId.encode(data, cursor);
        if (buffer != null && buffer.length >= 24) {
            System.arraycopy(buffer, 20, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = lastQty.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = trdRegTsExecutionTime.encode(data, cursor);
        cursor = noMdEntries.encode(data, cursor);
        if (buffer != null && buffer.length >= 56) {
            System.arraycopy(buffer, 49, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
        cursor = mdTradeEntryGrp.encode(data, cursor);
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
        mdTradeEntryGrp.clear();
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
            if (field != noMdEntries && !field.isRecognized()) {
                return false;
            }
        }
        return mdTradeEntryGrp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noMdEntries && !field.isValid()) {
                return false;
            }
        }
        if (!mdTradeEntryGrp.isValid()) {
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
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!trdMatchId.isDecoded()) {
            return Optional.of(trdMatchId);
        }
        if (!lastQty.isDecoded()) {
            return Optional.of(lastQty);
        }
        if (!lastPx.isDecoded()) {
            return Optional.of(lastPx);
        }
        if (!trdRegTsExecutionTime.isDecoded()) {
            return Optional.of(trdRegTsExecutionTime);
        }
        if (!noMdEntries.isDecoded()) {
            return Optional.of(noMdEntries);
        }
        if (!mdTradeEntryGrp.isDecoded()) {
            return Optional.of(mdTradeEntryGrp.failedEntry().flatMap(MdTradeEntryGrpEntry::failedAt).orElse(noMdEntries));
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
            case "SecurityId" -> Optional.of(securityId);
            case "TransactTime" -> Optional.of(transactTime);
            case "TrdMatchId" -> Optional.of(trdMatchId);
            case "LastQty" -> Optional.of(lastQty);
            case "LastPx" -> Optional.of(lastPx);
            case "TrdRegTsExecutionTime" -> Optional.of(trdRegTsExecutionTime);
            case "NoMdEntries" -> Optional.of(noMdEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeReversalMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(mdTradeEntryGrp.diffFields(message.mdTradeEntryGrp));
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
            mdTradeEntryGrp.toFormattedString(builder, options);
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
        mdTradeEntryGrp.toFormattedString(builder, nested);
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
        if (!(other instanceof TradeReversalMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && mdTradeEntryGrp.equals(message.mdTradeEntryGrp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, mdTradeEntryGrp);
    }
}
