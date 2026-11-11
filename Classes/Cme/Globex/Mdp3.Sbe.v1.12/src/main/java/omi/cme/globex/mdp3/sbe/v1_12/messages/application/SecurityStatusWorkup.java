package omi.cme.globex.mdp3.sbe.v1_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_12.fields.HaltReasonField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MatchEventIndicatorField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MdEntryPxOptionalExField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityTradingEventField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TradeDateField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TradeLinkIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TransactTimeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.WorkupTradingStatusField;
import omi.cme.globex.mdp3.sbe.v1_12.structs.SecurityStatusWorkupGroups;
import omi.cme.globex.mdp3.sbe.v1_12.types.Field;
import omi.cme.globex.mdp3.sbe.v1_12.types.Message;
import omi.cme.globex.mdp3.sbe.v1_12.types.PrintOptions;

/**
 * Represents the SecurityStatusWorkup message from the Mdp3 protocol.
 *
 * <p>SecurityStatusWorkup</p>
 */
public final class SecurityStatusWorkup implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Status Workup";

    /**
     * Start of event processing time in number of nanoseconds since Unix epoch
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Workup price
     */
    private final MdEntryPxOptionalExField mdEntryPxOptionalEx = new MdEntryPxOptionalExField();

    /**
     * Security ID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * MatchEventIndicator bit set
     */
    private final MatchEventIndicatorField matchEventIndicator = new MatchEventIndicatorField();

    /**
     * Trade Session Date
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Contains the workup ID; unique per instrument per day
     */
    private final TradeLinkIdField tradeLinkId = new TradeLinkIdField();

    /**
     * Identifies the trading status applicable to the instrument
     */
    private final WorkupTradingStatusField workupTradingStatus = new WorkupTradingStatusField();

    /**
     * Identifies the reason for the status change
     */
    private final HaltReasonField haltReason = new HaltReasonField();

    /**
     * Identifies an additional event or a rule related to the status
     */
    private final SecurityTradingEventField securityTradingEvent = new SecurityTradingEventField();

    /**
     * NoOrderIDEntries Block
     */
    private final SecurityStatusWorkupGroups securityStatusWorkupGroups = new SecurityStatusWorkupGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, mdEntryPxOptionalEx, securityId, matchEventIndicator, tradeDate, tradeLinkId, workupTradingStatus, haltReason, securityTradingEvent);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Start of event processing time in number of nanoseconds since Unix epoch
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Workup price
     *
     * @return the MdEntryPxOptionalEx field
     */
    public MdEntryPxOptionalExField mdEntryPxOptionalEx() {
        return mdEntryPxOptionalEx;
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
     * MatchEventIndicator bit set
     *
     * @return the MatchEventIndicator field
     */
    public MatchEventIndicatorField matchEventIndicator() {
        return matchEventIndicator;
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
     * Contains the workup ID; unique per instrument per day
     *
     * @return the TradeLinkId field
     */
    public TradeLinkIdField tradeLinkId() {
        return tradeLinkId;
    }

    /**
     * Identifies the trading status applicable to the instrument
     *
     * @return the WorkupTradingStatus field
     */
    public WorkupTradingStatusField workupTradingStatus() {
        return workupTradingStatus;
    }

    /**
     * Identifies the reason for the status change
     *
     * @return the HaltReason field
     */
    public HaltReasonField haltReason() {
        return haltReason;
    }

    /**
     * Identifies an additional event or a rule related to the status
     *
     * @return the SecurityTradingEvent field
     */
    public SecurityTradingEventField securityTradingEvent() {
        return securityTradingEvent;
    }

    /**
     * NoOrderIDEntries Block
     *
     * @return the SecurityStatusWorkupGroups record
     */
    public SecurityStatusWorkupGroups securityStatusWorkupGroups() {
        return securityStatusWorkupGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + securityStatusWorkupGroups.byteLength() - SecurityStatusWorkupGroups.MINIMUM_BYTE_LENGTH;
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!mdEntryPxOptionalEx.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntryPxOptionalExField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!matchEventIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MatchEventIndicatorField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!tradeLinkId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeLinkIdField.BYTE_LENGTH;
        if (!workupTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += WorkupTradingStatusField.BYTE_LENGTH;
        if (!haltReason.parse(data, cursor)) {
            return false;
        }
        cursor += HaltReasonField.BYTE_LENGTH;
        if (!securityTradingEvent.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingEventField.BYTE_LENGTH;
        if (!securityStatusWorkupGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += securityStatusWorkupGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = mdEntryPxOptionalEx.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = matchEventIndicator.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = tradeLinkId.encode(data, cursor);
        cursor = workupTradingStatus.encode(data, cursor);
        cursor = haltReason.encode(data, cursor);
        cursor = securityTradingEvent.encode(data, cursor);
        cursor = securityStatusWorkupGroups.encode(data, cursor);
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
        securityStatusWorkupGroups.clear();
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
        return securityStatusWorkupGroups.isRecognized();
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
        if (!securityStatusWorkupGroups.isValid()) {
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
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!mdEntryPxOptionalEx.isDecoded()) {
            return Optional.of(mdEntryPxOptionalEx);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!matchEventIndicator.isDecoded()) {
            return Optional.of(matchEventIndicator);
        }
        if (!tradeDate.isDecoded()) {
            return Optional.of(tradeDate);
        }
        if (!tradeLinkId.isDecoded()) {
            return Optional.of(tradeLinkId);
        }
        if (!workupTradingStatus.isDecoded()) {
            return Optional.of(workupTradingStatus);
        }
        if (!haltReason.isDecoded()) {
            return Optional.of(haltReason);
        }
        if (!securityTradingEvent.isDecoded()) {
            return Optional.of(securityTradingEvent);
        }
        if (!securityStatusWorkupGroups.isDecoded()) {
            return securityStatusWorkupGroups.failedAt();
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
            case "TransactTime" -> Optional.of(transactTime);
            case "MdEntryPxOptionalEx" -> Optional.of(mdEntryPxOptionalEx);
            case "SecurityId" -> Optional.of(securityId);
            case "MatchEventIndicator" -> Optional.of(matchEventIndicator);
            case "TradeDate" -> Optional.of(tradeDate);
            case "TradeLinkId" -> Optional.of(tradeLinkId);
            case "WorkupTradingStatus" -> Optional.of(workupTradingStatus);
            case "HaltReason" -> Optional.of(haltReason);
            case "SecurityTradingEvent" -> Optional.of(securityTradingEvent);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityStatusWorkup message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(securityStatusWorkupGroups.diffFields(message.securityStatusWorkupGroups));
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
            securityStatusWorkupGroups.toFormattedString(builder, options);
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
        securityStatusWorkupGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof SecurityStatusWorkup message)) {
            return false;
        }
        return fields.equals(message.fields) && securityStatusWorkupGroups.equals(message.securityStatusWorkupGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, securityStatusWorkupGroups);
    }
}
