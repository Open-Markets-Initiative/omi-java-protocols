package omi.bse.bseindia.eobi.fbe.v1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.FastMarketIndicatorField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.LastUpdateTimeField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.NoMdEntriesField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.NoOfTradesField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.SecurityIdField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.SecurityStatusField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.SecurityTradingStatusField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.TotNoOrdersField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.TradeVolumeField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.TrdRegTsExecutionTimeField;
import omi.bse.bseindia.eobi.fbe.v1_4.groups.MdInstrumentEntryGrpEntry;
import omi.bse.bseindia.eobi.fbe.v1_4.groups.MdInstrumentEntryGrpList;
import omi.bse.bseindia.eobi.fbe.v1_4.types.Field;
import omi.bse.bseindia.eobi.fbe.v1_4.types.Message;
import omi.bse.bseindia.eobi.fbe.v1_4.types.PrintOptions;

/**
 * Represents the InstrumentSummaryMessage message from the Eobi protocol.
 *
 * <p>Published for each instrument in one snapshot cycle, carrying instrument state information and trade statistics.</p>
 */
public final class InstrumentSummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 408;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Summary Message";

    /**
     * The number of slots that MdInstrumentEntryGrp carries on the wire.
     */
    public static final int MD_INSTRUMENT_ENTRY_GRP_COUNT = 15;

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 44, 4, 65, 7, 89, 7, 113, 7, 137, 7, 161, 7, 185, 7, 209, 7, 233, 7, 257, 7, 281, 7, 305, 7, 329, 7, 353, 7, 377, 7, 401, 7 };

    /**
     * Unique instrument identifier.
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Last update time of the corresponding order book.
     */
    private final LastUpdateTimeField lastUpdateTime = new LastUpdateTimeField();

    /**
     * Last matching execution timestamp.
     */
    private final TrdRegTsExecutionTimeField trdRegTsExecutionTime = new TrdRegTsExecutionTimeField();

    /**
     * Corresponding number of orders for this instrument.
     */
    private final TotNoOrdersField totNoOrders = new TotNoOrdersField();

    /**
     * Instrument status.
     */
    private final SecurityStatusField securityStatus = new SecurityStatusField();

    /**
     * Instrument state status.
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * Indicates if product is in the state Fast Market.
     */
    private final FastMarketIndicatorField fastMarketIndicator = new FastMarketIndicatorField();

    /**
     * Number of entries in Market Data message for MDEntryGrp.
     */
    private final NoMdEntriesField noMdEntries = new NoMdEntriesField();

    /**
     * Cumulative volume of units traded in the day.
     */
    private final TradeVolumeField tradeVolume = new TradeVolumeField();

    /**
     * Total number of trades.
     */
    private final NoOfTradesField noOfTrades = new NoOfTradesField();

    /**
     * Instrument trade statistics repeated NoMDEntries times in the Instrument Summary Message. The group is not cut off by design.
     */
    private final MdInstrumentEntryGrpList mdInstrumentEntryGrp = new MdInstrumentEntryGrpList(MD_INSTRUMENT_ENTRY_GRP_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, lastUpdateTime, trdRegTsExecutionTime, totNoOrders, securityStatus, securityTradingStatus, fastMarketIndicator, noMdEntries, tradeVolume, noOfTrades);

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
     * Last update time of the corresponding order book.
     *
     * @return the LastUpdateTime field
     */
    public LastUpdateTimeField lastUpdateTime() {
        return lastUpdateTime;
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
     * Corresponding number of orders for this instrument.
     *
     * @return the TotNoOrders field
     */
    public TotNoOrdersField totNoOrders() {
        return totNoOrders;
    }

    /**
     * Instrument status.
     *
     * @return the SecurityStatus field
     */
    public SecurityStatusField securityStatus() {
        return securityStatus;
    }

    /**
     * Instrument state status.
     *
     * @return the SecurityTradingStatus field
     */
    public SecurityTradingStatusField securityTradingStatus() {
        return securityTradingStatus;
    }

    /**
     * Indicates if product is in the state Fast Market.
     *
     * @return the FastMarketIndicator field
     */
    public FastMarketIndicatorField fastMarketIndicator() {
        return fastMarketIndicator;
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
     * Cumulative volume of units traded in the day.
     *
     * @return the TradeVolume field
     */
    public TradeVolumeField tradeVolume() {
        return tradeVolume;
    }

    /**
     * Total number of trades.
     *
     * @return the NoOfTrades field
     */
    public NoOfTradesField noOfTrades() {
        return noOfTrades;
    }

    /**
     * Instrument trade statistics repeated NoMDEntries times in the Instrument Summary Message. The group is not cut off by design.
     *
     * <p>The wire always carries 15 slots, and this list holds those in use: encode writes its size to the NoMdEntries field and fills the rest.</p>
     *
     * @return the MdInstrumentEntryGrp entries
     */
    public MdInstrumentEntryGrpList mdInstrumentEntryGrp() {
        return mdInstrumentEntryGrp;
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
            mdInstrumentEntryGrp.keep(buffer, offset);
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
        if (!fastMarketIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FastMarketIndicatorField.BYTE_LENGTH;
        if (!noMdEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoMdEntriesField.BYTE_LENGTH;
        if (!tradeVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TradeVolumeField.BYTE_LENGTH;
        if (!noOfTrades.parse(data, cursor)) {
            return false;
        }
        cursor += NoOfTradesField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!mdInstrumentEntryGrp.parse(data, cursor, end, noMdEntries.value())) {
            return false;
        }
        cursor += mdInstrumentEntryGrp.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        if (mdInstrumentEntryGrp.size() > 255) {
            throw new IllegalStateException("mdInstrumentEntryGrp holds " + mdInstrumentEntryGrp.size() + " entries, more than its count field can state");
        }
        noMdEntries.value((short) mdInstrumentEntryGrp.size());
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = lastUpdateTime.encode(data, cursor);
        cursor = trdRegTsExecutionTime.encode(data, cursor);
        cursor = totNoOrders.encode(data, cursor);
        cursor = securityStatus.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = fastMarketIndicator.encode(data, cursor);
        cursor = noMdEntries.encode(data, cursor);
        cursor = tradeVolume.encode(data, cursor);
        cursor = noOfTrades.encode(data, cursor);
        if (buffer != null && buffer.length >= 48) {
            System.arraycopy(buffer, 44, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = mdInstrumentEntryGrp.encode(data, cursor);
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
        mdInstrumentEntryGrp.clear();
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
        return mdInstrumentEntryGrp.isRecognized();
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
        if (!mdInstrumentEntryGrp.isValid()) {
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
        if (!fastMarketIndicator.isDecoded()) {
            return Optional.of(fastMarketIndicator);
        }
        if (!noMdEntries.isDecoded()) {
            return Optional.of(noMdEntries);
        }
        if (!tradeVolume.isDecoded()) {
            return Optional.of(tradeVolume);
        }
        if (!noOfTrades.isDecoded()) {
            return Optional.of(noOfTrades);
        }
        if (!mdInstrumentEntryGrp.isDecoded()) {
            return Optional.of(mdInstrumentEntryGrp.failedEntry().flatMap(MdInstrumentEntryGrpEntry::failedAt).orElse(noMdEntries));
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
            case "FastMarketIndicator" -> Optional.of(fastMarketIndicator);
            case "NoMdEntries" -> Optional.of(noMdEntries);
            case "TradeVolume" -> Optional.of(tradeVolume);
            case "NoOfTrades" -> Optional.of(noOfTrades);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentSummaryMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(mdInstrumentEntryGrp.diffFields(message.mdInstrumentEntryGrp));
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
            mdInstrumentEntryGrp.toFormattedString(builder, options);
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
        mdInstrumentEntryGrp.toFormattedString(builder, nested);
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
        if (!(other instanceof InstrumentSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && mdInstrumentEntryGrp.equals(message.mdInstrumentEntryGrp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, mdInstrumentEntryGrp);
    }
}
