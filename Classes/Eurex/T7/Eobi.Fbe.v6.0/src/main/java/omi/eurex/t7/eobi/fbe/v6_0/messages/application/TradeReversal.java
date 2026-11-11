package omi.eurex.t7.eobi.fbe.v6_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v6_0.fields.LastPxField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.LastQtyField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.NoMdEntriesField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.SecurityIdField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.TradeConditionField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.TransactTimeField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.TrdMatchIdField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.TrdRegTsExecutionTimeField;
import omi.eurex.t7.eobi.fbe.v6_0.groups.MdTradeEntryGrpCompEntry;
import omi.eurex.t7.eobi.fbe.v6_0.groups.MdTradeEntryGrpCompList;
import omi.eurex.t7.eobi.fbe.v6_0.types.Field;
import omi.eurex.t7.eobi.fbe.v6_0.types.Message;
import omi.eurex.t7.eobi.fbe.v6_0.types.PrintOptions;

/**
 * Represents the TradeReversal message from the Eobi protocol.
 */
public final class TradeReversal implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 288;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Reversal";

    /**
     * The number of slots that MdTradeEntryGrpComp carries on the wire.
     */
    public static final int MD_TRADE_ENTRY_GRP_COMP_COUNT = 15;

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 41, 6, 61, 3, 77, 3, 93, 3, 109, 3, 125, 3, 141, 3, 157, 3, 173, 3, 189, 3, 205, 3, 221, 3, 237, 3, 253, 3, 269, 3, 285, 3 };

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Trd Match Id
     */
    private final TrdMatchIdField trdMatchId = new TrdMatchIdField();

    /**
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Trd Reg Ts Execution Time
     */
    private final TrdRegTsExecutionTimeField trdRegTsExecutionTime = new TrdRegTsExecutionTimeField();

    /**
     * Trade Condition
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * No Md Entries
     */
    private final NoMdEntriesField noMdEntries = new NoMdEntriesField();

    /**
     * Md Trade Entry Grp Comp
     */
    private final MdTradeEntryGrpCompList mdTradeEntryGrpComp = new MdTradeEntryGrpCompList(MD_TRADE_ENTRY_GRP_COMP_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, transactTime, trdMatchId, lastQty, lastPx, trdRegTsExecutionTime, tradeCondition, noMdEntries);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Trd Match Id
     *
     * @return the TrdMatchId field
     */
    public TrdMatchIdField trdMatchId() {
        return trdMatchId;
    }

    /**
     * Last Qty
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Trd Reg Ts Execution Time
     *
     * @return the TrdRegTsExecutionTime field
     */
    public TrdRegTsExecutionTimeField trdRegTsExecutionTime() {
        return trdRegTsExecutionTime;
    }

    /**
     * Trade Condition
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
    }

    /**
     * No Md Entries
     *
     * @return the NoMdEntries field
     */
    public NoMdEntriesField noMdEntries() {
        return noMdEntries;
    }

    /**
     * Md Trade Entry Grp Comp
     *
     * <p>The wire always carries 15 slots, and this list holds those in use: encode writes its size to the NoMdEntries field and fills the rest.</p>
     *
     * @return the MdTradeEntryGrpComp entries
     */
    public MdTradeEntryGrpCompList mdTradeEntryGrpComp() {
        return mdTradeEntryGrpComp;
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
            mdTradeEntryGrpComp.keep(buffer, offset);
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
        if (!tradeCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradeConditionField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!noMdEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoMdEntriesField.BYTE_LENGTH;
        if (!mdTradeEntryGrpComp.parse(data, cursor, end, noMdEntries.value())) {
            return false;
        }
        cursor += mdTradeEntryGrpComp.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        if (mdTradeEntryGrpComp.size() > 255) {
            throw new IllegalStateException("mdTradeEntryGrpComp holds " + mdTradeEntryGrpComp.size() + " entries, more than its count field can state");
        }
        noMdEntries.value((short) mdTradeEntryGrpComp.size());
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = trdMatchId.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = trdRegTsExecutionTime.encode(data, cursor);
        cursor = tradeCondition.encode(data, cursor);
        if (buffer != null && buffer.length >= 47) {
            System.arraycopy(buffer, 41, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = noMdEntries.encode(data, cursor);
        cursor = mdTradeEntryGrpComp.encode(data, cursor);
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
        mdTradeEntryGrpComp.clear();
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
        return mdTradeEntryGrpComp.isRecognized();
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
        if (!mdTradeEntryGrpComp.isValid()) {
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
        if (!tradeCondition.isDecoded()) {
            return Optional.of(tradeCondition);
        }
        if (!noMdEntries.isDecoded()) {
            return Optional.of(noMdEntries);
        }
        if (!mdTradeEntryGrpComp.isDecoded()) {
            return Optional.of(mdTradeEntryGrpComp.failedEntry().flatMap(MdTradeEntryGrpCompEntry::failedAt).orElse(noMdEntries));
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
            case "TradeCondition" -> Optional.of(tradeCondition);
            case "NoMdEntries" -> Optional.of(noMdEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeReversal message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(mdTradeEntryGrpComp.diffFields(message.mdTradeEntryGrpComp));
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
            mdTradeEntryGrpComp.toFormattedString(builder, options);
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
        mdTradeEntryGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof TradeReversal message)) {
            return false;
        }
        return fields.equals(message.fields) && mdTradeEntryGrpComp.equals(message.mdTradeEntryGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, mdTradeEntryGrpComp);
    }
}
