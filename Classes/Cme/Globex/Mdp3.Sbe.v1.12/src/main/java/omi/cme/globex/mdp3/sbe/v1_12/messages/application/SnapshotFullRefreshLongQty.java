package omi.cme.globex.mdp3.sbe.v1_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_12.fields.HighLimitPriceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.LastMsgSeqNumProcessedField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.LastUpdateTimeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.LowLimitPriceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MaxPriceVariationField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MdSecurityTradingStatusField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.RptSeqField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TotNumReportsField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TradeDateField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TransactTimeField;
import omi.cme.globex.mdp3.sbe.v1_12.structs.SnapshotFullRefreshLongGroups;
import omi.cme.globex.mdp3.sbe.v1_12.types.Field;
import omi.cme.globex.mdp3.sbe.v1_12.types.Message;
import omi.cme.globex.mdp3.sbe.v1_12.types.PrintOptions;

/**
 * Represents the SnapshotFullRefreshLongQty message from the Mdp3 protocol.
 *
 * <p>SnapshotFullRefreshLongQty</p>
 */
public final class SnapshotFullRefreshLongQty implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 62;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Snapshot Full Refresh Long Qty";

    /**
     * Sequence number of the last Incremental feed packet processed. This value is used to synchronize the snapshot loop with the real-time feed
     */
    private final LastMsgSeqNumProcessedField lastMsgSeqNumProcessed = new LastMsgSeqNumProcessedField();

    /**
     * Total number of messages replayed in the loop
     */
    private final TotNumReportsField totNumReports = new TotNumReportsField();

    /**
     * Security ID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Sequence number of the last Market Data entry processed for the instrument
     */
    private final RptSeqField rptSeq = new RptSeqField();

    /**
     * Start of event processing time in number of nanoseconds since Unix epoch
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * UTC Date and time of last Security Definition add, update or delete on a given Market Data channel
     */
    private final LastUpdateTimeField lastUpdateTime = new LastUpdateTimeField();

    /**
     * Trade Session Date
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Identifies the current trading state of the instrument
     */
    private final MdSecurityTradingStatusField mdSecurityTradingStatus = new MdSecurityTradingStatusField();

    /**
     * Upper price threshold for the instrument
     */
    private final HighLimitPriceField highLimitPrice = new HighLimitPriceField();

    /**
     * Lower price threshold for the instrument
     */
    private final LowLimitPriceField lowLimitPrice = new LowLimitPriceField();

    /**
     * Differential value for price banding
     */
    private final MaxPriceVariationField maxPriceVariation = new MaxPriceVariationField();

    /**
     * NoMDEntries Block
     */
    private final SnapshotFullRefreshLongGroups snapshotFullRefreshLongGroups = new SnapshotFullRefreshLongGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(lastMsgSeqNumProcessed, totNumReports, securityId, rptSeq, transactTime, lastUpdateTime, tradeDate, mdSecurityTradingStatus, highLimitPrice, lowLimitPrice, maxPriceVariation);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Sequence number of the last Incremental feed packet processed. This value is used to synchronize the snapshot loop with the real-time feed
     *
     * @return the LastMsgSeqNumProcessed field
     */
    public LastMsgSeqNumProcessedField lastMsgSeqNumProcessed() {
        return lastMsgSeqNumProcessed;
    }

    /**
     * Total number of messages replayed in the loop
     *
     * @return the TotNumReports field
     */
    public TotNumReportsField totNumReports() {
        return totNumReports;
    }

    /**
     * Security ID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Sequence number of the last Market Data entry processed for the instrument
     *
     * @return the RptSeq field
     */
    public RptSeqField rptSeq() {
        return rptSeq;
    }

    /**
     * Start of event processing time in number of nanoseconds since Unix epoch
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * UTC Date and time of last Security Definition add, update or delete on a given Market Data channel
     *
     * @return the LastUpdateTime field
     */
    public LastUpdateTimeField lastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Trade Session Date
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Identifies the current trading state of the instrument
     *
     * @return the MdSecurityTradingStatus field
     */
    public MdSecurityTradingStatusField mdSecurityTradingStatus() {
        return mdSecurityTradingStatus;
    }

    /**
     * Upper price threshold for the instrument
     *
     * @return the HighLimitPrice field
     */
    public HighLimitPriceField highLimitPrice() {
        return highLimitPrice;
    }

    /**
     * Lower price threshold for the instrument
     *
     * @return the LowLimitPrice field
     */
    public LowLimitPriceField lowLimitPrice() {
        return lowLimitPrice;
    }

    /**
     * Differential value for price banding
     *
     * @return the MaxPriceVariation field
     */
    public MaxPriceVariationField maxPriceVariation() {
        return maxPriceVariation;
    }

    /**
     * NoMDEntries Block
     *
     * @return the SnapshotFullRefreshLongGroups record
     */
    public SnapshotFullRefreshLongGroups snapshotFullRefreshLongGroups() {
        return snapshotFullRefreshLongGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + snapshotFullRefreshLongGroups.byteLength() - SnapshotFullRefreshLongGroups.MINIMUM_BYTE_LENGTH;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!lastMsgSeqNumProcessed.parse(data, cursor)) {
            return false;
        }
        cursor += LastMsgSeqNumProcessedField.BYTE_LENGTH;
        if (!totNumReports.parse(data, cursor)) {
            return false;
        }
        cursor += TotNumReportsField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!rptSeq.parse(data, cursor)) {
            return false;
        }
        cursor += RptSeqField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!lastUpdateTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateTimeField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!mdSecurityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += MdSecurityTradingStatusField.BYTE_LENGTH;
        if (!highLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPriceField.BYTE_LENGTH;
        if (!lowLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowLimitPriceField.BYTE_LENGTH;
        if (!maxPriceVariation.parse(data, cursor)) {
            return false;
        }
        cursor += MaxPriceVariationField.BYTE_LENGTH;
        if (!snapshotFullRefreshLongGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += snapshotFullRefreshLongGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = lastMsgSeqNumProcessed.encode(data, cursor);
        cursor = totNumReports.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = rptSeq.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = lastUpdateTime.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = mdSecurityTradingStatus.encode(data, cursor);
        cursor = highLimitPrice.encode(data, cursor);
        cursor = lowLimitPrice.encode(data, cursor);
        cursor = maxPriceVariation.encode(data, cursor);
        cursor = snapshotFullRefreshLongGroups.encode(data, cursor);
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
        snapshotFullRefreshLongGroups.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        return snapshotFullRefreshLongGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!snapshotFullRefreshLongGroups.isValid()) {
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
        if (!lastMsgSeqNumProcessed.isDecoded()) {
            return Optional.of(lastMsgSeqNumProcessed);
        }
        if (!totNumReports.isDecoded()) {
            return Optional.of(totNumReports);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!rptSeq.isDecoded()) {
            return Optional.of(rptSeq);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!lastUpdateTime.isDecoded()) {
            return Optional.of(lastUpdateTime);
        }
        if (!tradeDate.isDecoded()) {
            return Optional.of(tradeDate);
        }
        if (!mdSecurityTradingStatus.isDecoded()) {
            return Optional.of(mdSecurityTradingStatus);
        }
        if (!highLimitPrice.isDecoded()) {
            return Optional.of(highLimitPrice);
        }
        if (!lowLimitPrice.isDecoded()) {
            return Optional.of(lowLimitPrice);
        }
        if (!maxPriceVariation.isDecoded()) {
            return Optional.of(maxPriceVariation);
        }
        if (!snapshotFullRefreshLongGroups.isDecoded()) {
            return snapshotFullRefreshLongGroups.failedAt();
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
            case "LastMsgSeqNumProcessed" -> Optional.of(lastMsgSeqNumProcessed);
            case "TotNumReports" -> Optional.of(totNumReports);
            case "SecurityId" -> Optional.of(securityId);
            case "RptSeq" -> Optional.of(rptSeq);
            case "TransactTime" -> Optional.of(transactTime);
            case "LastUpdateTime" -> Optional.of(lastUpdateTime);
            case "TradeDate" -> Optional.of(tradeDate);
            case "MdSecurityTradingStatus" -> Optional.of(mdSecurityTradingStatus);
            case "HighLimitPrice" -> Optional.of(highLimitPrice);
            case "LowLimitPrice" -> Optional.of(lowLimitPrice);
            case "MaxPriceVariation" -> Optional.of(maxPriceVariation);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SnapshotFullRefreshLongQty message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(snapshotFullRefreshLongGroups.diffFields(message.snapshotFullRefreshLongGroups));
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
            snapshotFullRefreshLongGroups.toFormattedString(builder, options);
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
        snapshotFullRefreshLongGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof SnapshotFullRefreshLongQty message)) {
            return false;
        }
        return fields.equals(message.fields) && snapshotFullRefreshLongGroups.equals(message.snapshotFullRefreshLongGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, snapshotFullRefreshLongGroups);
    }
}
