package omi.nyse.nationalequities.bbo.pillar.v2_5_d.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.HaltConditionField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.MarketStateField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.Price1Field;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.Price2Field;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.SecurityStatusField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.SessionStateField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.SourceTimeField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.SourceTimeNsField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.SsrStateField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.SsrTriggeringExchangeIdField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.SsrTriggeringVolumeField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.SymbolIndexField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.SymbolSeqNumField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.fields.TimeField;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.types.Field;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.types.Message;
import omi.nyse.nationalequities.bbo.pillar.v2_5_d.types.PrintOptions;

/**
 * Represents the SecurityStatusMessage message from the Bbo protocol.
 *
 * <p>This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc.</p>
 */
public final class SecurityStatusMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Status Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 18, 4 };

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset (UTC Time) from the Time Reference message.
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The ID of the symbol in the Symbol Index message.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * The symbol sequence number.
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * The new status that this security is transitioning to.
     */
    private final SecurityStatusField securityStatus = new SecurityStatusField();

    /**
     * The halt or other condition associated with the security status change.
     */
    private final HaltConditionField haltCondition = new HaltConditionField();

    /**
     * Default value is 0. If securityStatus = A and this security is listed on this exchange, then this field is the SSR Triggering Trade Price. If securityStatus = G or I, then this field is the Indication Low Price.
     */
    private final Price1Field price1 = new Price1Field();

    /**
     * Default value is 0. If securityStatus = G or I, then this field is the Indication High Price.
     */
    private final Price2Field price2 = new Price2Field();

    /**
     * This field is only populated when securityStatus = A and this security is listed on this exchange. Otherwise it is defaulted to 0x20.
     */
    private final SsrTriggeringExchangeIdField ssrTriggeringExchangeId = new SsrTriggeringExchangeIdField();

    /**
     * Default value is 0. This field is only populated when securityStatus = A and this security is listed on this exchange.
     */
    private final SsrTriggeringVolumeField ssrTriggeringVolume = new SsrTriggeringVolumeField();

    /**
     * Default value is 0. Format: HHMMSSmmm (mmm = milliseconds). If securityStatus = A and this security is listed on this exchange, then this field is the SSR Trigger Time.
     */
    private final TimeField time = new TimeField();

    /**
     * The current SSR state, which this msg updates if the Security Status field contains an SSR Code.
     */
    private final SsrStateField ssrState = new SsrStateField();

    /**
     * The current Market State, which this msg updates if the Security Status field contains a Market State Code.
     */
    private final MarketStateField marketState = new MarketStateField();

    /**
     * Unused. Defaulted to 0x00.
     */
    private final SessionStateField sessionState = new SessionStateField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, symbolIndex, symbolSeqNum, securityStatus, haltCondition, price1, price2, ssrTriggeringExchangeId, ssrTriggeringVolume, time, ssrState, marketState, sessionState);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     *
     * @return the SourceTime field
     */
    public SourceTimeField sourceTime() {
        return sourceTime;
    }

    /**
     * The nanosecond offset (UTC Time) from the Time Reference message.
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * The ID of the symbol in the Symbol Index message.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * The symbol sequence number.
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * The new status that this security is transitioning to.
     *
     * @return the SecurityStatus field
     */
    public SecurityStatusField securityStatus() {
        return securityStatus;
    }

    /**
     * The halt or other condition associated with the security status change.
     *
     * @return the HaltCondition field
     */
    public HaltConditionField haltCondition() {
        return haltCondition;
    }

    /**
     * Default value is 0. If securityStatus = A and this security is listed on this exchange, then this field is the SSR Triggering Trade Price. If securityStatus = G or I, then this field is the Indication Low Price.
     *
     * @return the Price1 field
     */
    public Price1Field price1() {
        return price1;
    }

    /**
     * Default value is 0. If securityStatus = G or I, then this field is the Indication High Price.
     *
     * @return the Price2 field
     */
    public Price2Field price2() {
        return price2;
    }

    /**
     * This field is only populated when securityStatus = A and this security is listed on this exchange. Otherwise it is defaulted to 0x20.
     *
     * @return the SsrTriggeringExchangeId field
     */
    public SsrTriggeringExchangeIdField ssrTriggeringExchangeId() {
        return ssrTriggeringExchangeId;
    }

    /**
     * Default value is 0. This field is only populated when securityStatus = A and this security is listed on this exchange.
     *
     * @return the SsrTriggeringVolume field
     */
    public SsrTriggeringVolumeField ssrTriggeringVolume() {
        return ssrTriggeringVolume;
    }

    /**
     * Default value is 0. Format: HHMMSSmmm (mmm = milliseconds). If securityStatus = A and this security is listed on this exchange, then this field is the SSR Trigger Time.
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    /**
     * The current SSR state, which this msg updates if the Security Status field contains an SSR Code.
     *
     * @return the SsrState field
     */
    public SsrStateField ssrState() {
        return ssrState;
    }

    /**
     * The current Market State, which this msg updates if the Security Status field contains a Market State Code.
     *
     * @return the MarketState field
     */
    public MarketStateField marketState() {
        return marketState;
    }

    /**
     * Unused. Defaulted to 0x00.
     *
     * @return the SessionState field
     */
    public SessionStateField sessionState() {
        return sessionState;
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
        if (!sourceTime.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeField.BYTE_LENGTH;
        if (!sourceTimeNs.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeNsField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
        if (!securityStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityStatusField.BYTE_LENGTH;
        if (!haltCondition.parse(data, cursor)) {
            return false;
        }
        cursor += HaltConditionField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!price1.parse(data, cursor)) {
            return false;
        }
        cursor += Price1Field.BYTE_LENGTH;
        if (!price2.parse(data, cursor)) {
            return false;
        }
        cursor += Price2Field.BYTE_LENGTH;
        if (!ssrTriggeringExchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += SsrTriggeringExchangeIdField.BYTE_LENGTH;
        if (!ssrTriggeringVolume.parse(data, cursor)) {
            return false;
        }
        cursor += SsrTriggeringVolumeField.BYTE_LENGTH;
        if (!time.parse(data, cursor)) {
            return false;
        }
        cursor += TimeField.BYTE_LENGTH;
        if (!ssrState.parse(data, cursor)) {
            return false;
        }
        cursor += SsrStateField.BYTE_LENGTH;
        if (!marketState.parse(data, cursor)) {
            return false;
        }
        cursor += MarketStateField.BYTE_LENGTH;
        if (!sessionState.parse(data, cursor)) {
            return false;
        }
        cursor += SessionStateField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = securityStatus.encode(data, cursor);
        cursor = haltCondition.encode(data, cursor);
        if (buffer != null && buffer.length >= 18 + 4) {
            System.arraycopy(buffer, 18, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = price1.encode(data, cursor);
        cursor = price2.encode(data, cursor);
        cursor = ssrTriggeringExchangeId.encode(data, cursor);
        cursor = ssrTriggeringVolume.encode(data, cursor);
        cursor = time.encode(data, cursor);
        cursor = ssrState.encode(data, cursor);
        cursor = marketState.encode(data, cursor);
        cursor = sessionState.encode(data, cursor);
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
            case "SourceTime" -> Optional.of(sourceTime);
            case "SourceTimeNs" -> Optional.of(sourceTimeNs);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "SecurityStatus" -> Optional.of(securityStatus);
            case "HaltCondition" -> Optional.of(haltCondition);
            case "Price1" -> Optional.of(price1);
            case "Price2" -> Optional.of(price2);
            case "SsrTriggeringExchangeId" -> Optional.of(ssrTriggeringExchangeId);
            case "SsrTriggeringVolume" -> Optional.of(ssrTriggeringVolume);
            case "Time" -> Optional.of(time);
            case "SsrState" -> Optional.of(ssrState);
            case "MarketState" -> Optional.of(marketState);
            case "SessionState" -> Optional.of(sessionState);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityStatusMessage message)) {
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
        if (!(other instanceof SecurityStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
