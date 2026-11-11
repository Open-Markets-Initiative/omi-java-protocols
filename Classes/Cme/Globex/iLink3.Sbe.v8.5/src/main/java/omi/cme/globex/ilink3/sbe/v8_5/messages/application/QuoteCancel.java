package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LiquidityFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LocationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManualOrderIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.QuoteCancelTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.QuoteIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SenderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.QuoteCancelEntriesGroups;
import omi.cme.globex.ilink3.sbe.v8_5.structs.QuoteCancelSetsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the QuoteCancel message from the iLink3 protocol.
 *
 * <p>The Quote Cancel message is used by a market maker to cancel all quotes or a partial set of quotes submitted during a specific session which are still tradeable and have not been rejected or expired. Quote Cancel messages are processed upon receipt by CME regardless of whether the corresponding resting quotes are completely or partially filled.</p>
 */
public final class QuoteCancel implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 58;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Cancel";

    /**
     * Refers to the ID of the related PartyDetailsDefinitionRequest message which will logically be tied to this message
     */
    private final PartyDetailsListReqIdField partyDetailsListReqId = new PartyDetailsListReqIdField();

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     */
    private final SendingTimeEpochField sendingTimeEpoch = new SendingTimeEpochField();

    /**
     * Indicates if the order was initially received manually (as opposed to electronically)
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Sequence number as assigned to message
     */
    private final SeqNumField seqNum = new SeqNumField();

    /**
     * Operator ID. Should be unique per Firm ID. Assigned value used to identify specific message originator. Represents last individual or team in charge of the system which modifies the order before submission to the Globex platform, or if not modified from initiator (party role=118), last individual or team in charge of the system, which submit the order to the Globex platform
     */
    private final SenderIdField senderId = new SenderIdField();

    /**
     * Text describing sender's location (i.e. geopraphic location and/or desk)
     */
    private final LocationField location = new LocationField();

    /**
     * Unique identifier for mass quote populated by the client system
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Identifies the type of Quote Cancel. A working quote can be cancelled by providing either it's instrument, instrument group or by cancelling all.
     */
    private final QuoteCancelTypeField quoteCancelType = new QuoteCancelTypeField();

    /**
     * New field added to capture if an order was submitted for market making obligation or not. Applicable only for EU fixed income markets
     */
    private final LiquidityFlagField liquidityFlag = new LiquidityFlagField();

    /**
     * NoQuoteEntries Block
     */
    private final QuoteCancelEntriesGroups quoteCancelEntriesGroups = new QuoteCancelEntriesGroups();

    /**
     * NoQuoteSets Block
     */
    private final QuoteCancelSetsGroups quoteCancelSetsGroups = new QuoteCancelSetsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(partyDetailsListReqId, sendingTimeEpoch, manualOrderIndicator, seqNum, senderId, location, quoteId, quoteCancelType, liquidityFlag);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Refers to the ID of the related PartyDetailsDefinitionRequest message which will logically be tied to this message
     *
     * @return the PartyDetailsListReqId field
     */
    public PartyDetailsListReqIdField partyDetailsListReqId() {
        return partyDetailsListReqId;
    }

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     *
     * @return the SendingTimeEpoch field
     */
    public SendingTimeEpochField sendingTimeEpoch() {
        return sendingTimeEpoch;
    }

    /**
     * Indicates if the order was initially received manually (as opposed to electronically)
     *
     * @return the ManualOrderIndicator field
     */
    public ManualOrderIndicatorField manualOrderIndicator() {
        return manualOrderIndicator;
    }

    /**
     * Sequence number as assigned to message
     *
     * @return the SeqNum field
     */
    public SeqNumField seqNum() {
        return seqNum;
    }

    /**
     * Operator ID. Should be unique per Firm ID. Assigned value used to identify specific message originator. Represents last individual or team in charge of the system which modifies the order before submission to the Globex platform, or if not modified from initiator (party role=118), last individual or team in charge of the system, which submit the order to the Globex platform
     *
     * @return the SenderId field
     */
    public SenderIdField senderId() {
        return senderId;
    }

    /**
     * Text describing sender's location (i.e. geopraphic location and/or desk)
     *
     * @return the Location field
     */
    public LocationField location() {
        return location;
    }

    /**
     * Unique identifier for mass quote populated by the client system
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * Identifies the type of Quote Cancel. A working quote can be cancelled by providing either it's instrument, instrument group or by cancelling all.
     *
     * @return the QuoteCancelType field
     */
    public QuoteCancelTypeField quoteCancelType() {
        return quoteCancelType;
    }

    /**
     * New field added to capture if an order was submitted for market making obligation or not. Applicable only for EU fixed income markets
     *
     * @return the LiquidityFlag field
     */
    public LiquidityFlagField liquidityFlag() {
        return liquidityFlag;
    }

    /**
     * NoQuoteEntries Block
     *
     * @return the QuoteCancelEntriesGroups record
     */
    public QuoteCancelEntriesGroups quoteCancelEntriesGroups() {
        return quoteCancelEntriesGroups;
    }

    /**
     * NoQuoteSets Block
     *
     * @return the QuoteCancelSetsGroups record
     */
    public QuoteCancelSetsGroups quoteCancelSetsGroups() {
        return quoteCancelSetsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + quoteCancelEntriesGroups.byteLength() - QuoteCancelEntriesGroups.MINIMUM_BYTE_LENGTH + quoteCancelSetsGroups.byteLength() - QuoteCancelSetsGroups.MINIMUM_BYTE_LENGTH;
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
        return Optional.ofNullable(sendingTimeEpoch.value());
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
        if (!partyDetailsListReqId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailsListReqIdField.BYTE_LENGTH;
        if (!sendingTimeEpoch.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeEpochField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!seqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SeqNumField.BYTE_LENGTH;
        if (!senderId.parse(data, cursor)) {
            return false;
        }
        cursor += SenderIdField.BYTE_LENGTH;
        if (!location.parse(data, cursor)) {
            return false;
        }
        cursor += LocationField.BYTE_LENGTH;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!quoteCancelType.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteCancelTypeField.BYTE_LENGTH;
        if (!liquidityFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityFlagField.BYTE_LENGTH;
        if (!quoteCancelEntriesGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += quoteCancelEntriesGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!quoteCancelSetsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += quoteCancelSetsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = seqNum.encode(data, cursor);
        cursor = senderId.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = quoteCancelType.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = quoteCancelEntriesGroups.encode(data, cursor);
        cursor = quoteCancelSetsGroups.encode(data, cursor);
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
        quoteCancelEntriesGroups.clear();
        quoteCancelSetsGroups.clear();
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
        if (!quoteCancelEntriesGroups.isRecognized()) {
            return false;
        }
        return quoteCancelSetsGroups.isRecognized();
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
        if (!quoteCancelEntriesGroups.isValid()) {
            return false;
        }
        if (!quoteCancelSetsGroups.isValid()) {
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
        if (!partyDetailsListReqId.isDecoded()) {
            return Optional.of(partyDetailsListReqId);
        }
        if (!sendingTimeEpoch.isDecoded()) {
            return Optional.of(sendingTimeEpoch);
        }
        if (!manualOrderIndicator.isDecoded()) {
            return Optional.of(manualOrderIndicator);
        }
        if (!seqNum.isDecoded()) {
            return Optional.of(seqNum);
        }
        if (!senderId.isDecoded()) {
            return Optional.of(senderId);
        }
        if (!location.isDecoded()) {
            return Optional.of(location);
        }
        if (!quoteId.isDecoded()) {
            return Optional.of(quoteId);
        }
        if (!quoteCancelType.isDecoded()) {
            return Optional.of(quoteCancelType);
        }
        if (!liquidityFlag.isDecoded()) {
            return Optional.of(liquidityFlag);
        }
        if (!quoteCancelEntriesGroups.isDecoded()) {
            return quoteCancelEntriesGroups.failedAt();
        }
        if (!quoteCancelSetsGroups.isDecoded()) {
            return quoteCancelSetsGroups.failedAt();
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
            case "PartyDetailsListReqId" -> Optional.of(partyDetailsListReqId);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "SeqNum" -> Optional.of(seqNum);
            case "SenderId" -> Optional.of(senderId);
            case "Location" -> Optional.of(location);
            case "QuoteId" -> Optional.of(quoteId);
            case "QuoteCancelType" -> Optional.of(quoteCancelType);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteCancel message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quoteCancelEntriesGroups.diffFields(message.quoteCancelEntriesGroups));
        changed.addAll(quoteCancelSetsGroups.diffFields(message.quoteCancelSetsGroups));
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
            quoteCancelEntriesGroups.toFormattedString(builder, options);
            builder.append(", ");
            quoteCancelSetsGroups.toFormattedString(builder, options);
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
        quoteCancelEntriesGroups.toFormattedString(builder, nested);
        quoteCancelSetsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteCancel message)) {
            return false;
        }
        return fields.equals(message.fields) && quoteCancelEntriesGroups.equals(message.quoteCancelEntriesGroups) && quoteCancelSetsGroups.equals(message.quoteCancelSetsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quoteCancelEntriesGroups, quoteCancelSetsGroups);
    }
}
