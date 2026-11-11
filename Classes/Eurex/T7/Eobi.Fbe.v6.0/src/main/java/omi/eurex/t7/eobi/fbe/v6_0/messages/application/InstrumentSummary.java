package omi.eurex.t7.eobi.fbe.v6_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v6_0.fields.FastMarketIndicatorField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.LastUpdateTimeField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.MarketConditionField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.NoMdEntriesField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.SecurityIdField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.SecurityStatusField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.SecurityTradingEventField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.SecurityTradingStatusField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.TotNoOrdersField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.TrdRegTsExecutionTimeField;
import omi.eurex.t7.eobi.fbe.v6_0.groups.MdInstrumentEntryGrpCompEntry;
import omi.eurex.t7.eobi.fbe.v6_0.groups.MdInstrumentEntryGrpCompList;
import omi.eurex.t7.eobi.fbe.v6_0.types.Field;
import omi.eurex.t7.eobi.fbe.v6_0.types.Message;
import omi.eurex.t7.eobi.fbe.v6_0.types.PrintOptions;

/**
 * Represents the InstrumentSummary message from the Eobi protocol.
 */
public final class InstrumentSummary implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 272;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Summary";

    /**
     * The number of slots that MdInstrumentEntryGrpComp carries on the wire.
     */
    public static final int MD_INSTRUMENT_ENTRY_GRP_COMP_COUNT = 15;

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 46, 2, 62, 2, 78, 2, 94, 2, 110, 2, 126, 2, 142, 2, 158, 2, 174, 2, 190, 2, 206, 2, 222, 2, 238, 2, 254, 2, 270, 2 };

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Last Update Time
     */
    private final LastUpdateTimeField lastUpdateTime = new LastUpdateTimeField();

    /**
     * Trd Reg Ts Execution Time
     */
    private final TrdRegTsExecutionTimeField trdRegTsExecutionTime = new TrdRegTsExecutionTimeField();

    /**
     * Tot No Orders
     */
    private final TotNoOrdersField totNoOrders = new TotNoOrdersField();

    /**
     * Security Status
     */
    private final SecurityStatusField securityStatus = new SecurityStatusField();

    /**
     * Security Trading Status
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * Market Condition
     */
    private final MarketConditionField marketCondition = new MarketConditionField();

    /**
     * Fast Market Indicator
     */
    private final FastMarketIndicatorField fastMarketIndicator = new FastMarketIndicatorField();

    /**
     * Security Trading Event
     */
    private final SecurityTradingEventField securityTradingEvent = new SecurityTradingEventField();

    /**
     * No Md Entries
     */
    private final NoMdEntriesField noMdEntries = new NoMdEntriesField();

    /**
     * Md Instrument Entry Grp Comp
     */
    private final MdInstrumentEntryGrpCompList mdInstrumentEntryGrpComp = new MdInstrumentEntryGrpCompList(MD_INSTRUMENT_ENTRY_GRP_COMP_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, lastUpdateTime, trdRegTsExecutionTime, totNoOrders, securityStatus, securityTradingStatus, marketCondition, fastMarketIndicator, securityTradingEvent, noMdEntries);

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
     * Last Update Time
     *
     * @return the LastUpdateTime field
     */
    public LastUpdateTimeField lastUpdateTime() {
        return lastUpdateTime;
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
     * Tot No Orders
     *
     * @return the TotNoOrders field
     */
    public TotNoOrdersField totNoOrders() {
        return totNoOrders;
    }

    /**
     * Security Status
     *
     * @return the SecurityStatus field
     */
    public SecurityStatusField securityStatus() {
        return securityStatus;
    }

    /**
     * Security Trading Status
     *
     * @return the SecurityTradingStatus field
     */
    public SecurityTradingStatusField securityTradingStatus() {
        return securityTradingStatus;
    }

    /**
     * Market Condition
     *
     * @return the MarketCondition field
     */
    public MarketConditionField marketCondition() {
        return marketCondition;
    }

    /**
     * Fast Market Indicator
     *
     * @return the FastMarketIndicator field
     */
    public FastMarketIndicatorField fastMarketIndicator() {
        return fastMarketIndicator;
    }

    /**
     * Security Trading Event
     *
     * @return the SecurityTradingEvent field
     */
    public SecurityTradingEventField securityTradingEvent() {
        return securityTradingEvent;
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
     * Md Instrument Entry Grp Comp
     *
     * <p>The wire always carries 15 slots, and this list holds those in use: encode writes its size to the NoMdEntries field and fills the rest.</p>
     *
     * @return the MdInstrumentEntryGrpComp entries
     */
    public MdInstrumentEntryGrpCompList mdInstrumentEntryGrpComp() {
        return mdInstrumentEntryGrpComp;
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
        return Optional.ofNullable(lastUpdateTime.value());
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
            mdInstrumentEntryGrpComp.keep(buffer, offset);
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
        if (!lastUpdateTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateTimeField.BYTE_LENGTH;
        if (!trdRegTsExecutionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRegTsExecutionTimeField.BYTE_LENGTH;
        if (!totNoOrders.parse(data, cursor)) {
            return false;
        }
        cursor += TotNoOrdersField.BYTE_LENGTH;
        if (!securityStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityStatusField.BYTE_LENGTH;
        if (!securityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingStatusField.BYTE_LENGTH;
        if (!marketCondition.parse(data, cursor)) {
            return false;
        }
        cursor += MarketConditionField.BYTE_LENGTH;
        if (!fastMarketIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FastMarketIndicatorField.BYTE_LENGTH;
        if (!securityTradingEvent.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingEventField.BYTE_LENGTH;
        if (!noMdEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoMdEntriesField.BYTE_LENGTH;
        if (!mdInstrumentEntryGrpComp.parse(data, cursor, end, noMdEntries.value())) {
            return false;
        }
        cursor += mdInstrumentEntryGrpComp.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        if (mdInstrumentEntryGrpComp.size() > 255) {
            throw new IllegalStateException("mdInstrumentEntryGrpComp holds " + mdInstrumentEntryGrpComp.size() + " entries, more than its count field can state");
        }
        noMdEntries.value((short) mdInstrumentEntryGrpComp.size());
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = lastUpdateTime.encode(data, cursor);
        cursor = trdRegTsExecutionTime.encode(data, cursor);
        cursor = totNoOrders.encode(data, cursor);
        cursor = securityStatus.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = marketCondition.encode(data, cursor);
        cursor = fastMarketIndicator.encode(data, cursor);
        cursor = securityTradingEvent.encode(data, cursor);
        cursor = noMdEntries.encode(data, cursor);
        cursor = mdInstrumentEntryGrpComp.encode(data, cursor);
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
        mdInstrumentEntryGrpComp.clear();
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
        return mdInstrumentEntryGrpComp.isRecognized();
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
        if (!mdInstrumentEntryGrpComp.isValid()) {
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
        if (!lastUpdateTime.isDecoded()) {
            return Optional.of(lastUpdateTime);
        }
        if (!trdRegTsExecutionTime.isDecoded()) {
            return Optional.of(trdRegTsExecutionTime);
        }
        if (!totNoOrders.isDecoded()) {
            return Optional.of(totNoOrders);
        }
        if (!securityStatus.isDecoded()) {
            return Optional.of(securityStatus);
        }
        if (!securityTradingStatus.isDecoded()) {
            return Optional.of(securityTradingStatus);
        }
        if (!marketCondition.isDecoded()) {
            return Optional.of(marketCondition);
        }
        if (!fastMarketIndicator.isDecoded()) {
            return Optional.of(fastMarketIndicator);
        }
        if (!securityTradingEvent.isDecoded()) {
            return Optional.of(securityTradingEvent);
        }
        if (!noMdEntries.isDecoded()) {
            return Optional.of(noMdEntries);
        }
        if (!mdInstrumentEntryGrpComp.isDecoded()) {
            return Optional.of(mdInstrumentEntryGrpComp.failedEntry().flatMap(MdInstrumentEntryGrpCompEntry::failedAt).orElse(noMdEntries));
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
            case "LastUpdateTime" -> Optional.of(lastUpdateTime);
            case "TrdRegTsExecutionTime" -> Optional.of(trdRegTsExecutionTime);
            case "TotNoOrders" -> Optional.of(totNoOrders);
            case "SecurityStatus" -> Optional.of(securityStatus);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            case "MarketCondition" -> Optional.of(marketCondition);
            case "FastMarketIndicator" -> Optional.of(fastMarketIndicator);
            case "SecurityTradingEvent" -> Optional.of(securityTradingEvent);
            case "NoMdEntries" -> Optional.of(noMdEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentSummary message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(mdInstrumentEntryGrpComp.diffFields(message.mdInstrumentEntryGrpComp));
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
            mdInstrumentEntryGrpComp.toFormattedString(builder, options);
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
        mdInstrumentEntryGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof InstrumentSummary message)) {
            return false;
        }
        return fields.equals(message.fields) && mdInstrumentEntryGrpComp.equals(message.mdInstrumentEntryGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, mdInstrumentEntryGrpComp);
    }
}
