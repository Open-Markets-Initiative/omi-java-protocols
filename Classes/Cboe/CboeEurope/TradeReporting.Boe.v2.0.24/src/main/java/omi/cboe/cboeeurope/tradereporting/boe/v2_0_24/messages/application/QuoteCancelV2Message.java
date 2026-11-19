package omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.ClearingFirmField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.NoQuoteEntriesField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.NumberOfQuoteCancelV2BitfieldsField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.QuoteCancelV2BitfieldField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.QuoteIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.groups.QuoteCancelRptGrpEntry;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.groups.QuoteCancelRptGrpList;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.types.Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.types.Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.types.PrintOptions;

/**
 * Represents the QuoteCancelV2Message message from the TradeReporting protocol.
 *
 * <p>Quote Cancel V2 Message.</p>
 */
public final class QuoteCancelV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 22;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Cancel V 2 Message";

    /**
     * Corresponds to QuoteID (117) in Cboe FIX. Mandatory unique ID chosen by client for a Quote or QuoteCancel. 18 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. Please note that the last two bytes are for inter- nal use. Note: Cboe only enforces the uniqueness of QuoteID values among currently live quotes. However, we strongly recommend that you keep your QuoteID values day unique.
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfQuoteCancelV2BitfieldsField numberOfQuoteCancelV2Bitfields = new NumberOfQuoteCancelV2BitfieldsField();

    /**
     * BitSet QuoteCancelV2 byte 1.
     */
    private final QuoteCancelV2BitfieldField quoteCancelV2Bitfield = new QuoteCancelV2BitfieldField();

    /**
     * Mandatory. Corresponds to NoQuoteEntries- Text (295) in Cboe FIX. Indicates the number of repeating groups to fol- low. Currently, can be 0 or 1. 0 - Cancel all symbols 1 - Cancel quote for the specified symbol
     */
    private final NoQuoteEntriesField noQuoteEntries = new NoQuoteEntriesField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Repeating group stated NoQuoteEntries times.
     */
    private final QuoteCancelRptGrpList quoteCancelRptGrp = new QuoteCancelRptGrpList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(quoteId, numberOfQuoteCancelV2Bitfields, quoteCancelV2Bitfield, noQuoteEntries, clearingFirm);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to QuoteID (117) in Cboe FIX. Mandatory unique ID chosen by client for a Quote or QuoteCancel. 18 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. Please note that the last two bytes are for inter- nal use. Note: Cboe only enforces the uniqueness of QuoteID values among currently live quotes. However, we strongly recommend that you keep your QuoteID values day unique.
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfQuoteCancelV2Bitfields field
     */
    public NumberOfQuoteCancelV2BitfieldsField numberOfQuoteCancelV2Bitfields() {
        return numberOfQuoteCancelV2Bitfields;
    }

    /**
     * BitSet QuoteCancelV2 byte 1.
     *
     * @return the QuoteCancelV2Bitfield field
     */
    public QuoteCancelV2BitfieldField quoteCancelV2Bitfield() {
        return quoteCancelV2Bitfield;
    }

    /**
     * Mandatory. Corresponds to NoQuoteEntries- Text (295) in Cboe FIX. Indicates the number of repeating groups to fol- low. Currently, can be 0 or 1. 0 - Cancel all symbols 1 - Cancel quote for the specified symbol
     *
     * @return the NoQuoteEntries field
     */
    public NoQuoteEntriesField noQuoteEntries() {
        return noQuoteEntries;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Repeating group stated NoQuoteEntries times.
     *
     * <p>Encode writes this list's size to the NoQuoteEntries field.</p>
     *
     * @return the QuoteCancelRptGrp entries
     */
    public QuoteCancelRptGrpList quoteCancelRptGrp() {
        return quoteCancelRptGrp;
    }

    /**
     * Returns whether the fields before the QuoteCancelV2Bitfield put it on the wire.
     *
     * <p>Decode reads the QuoteCancelV2Bitfield where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteCancelV2Bitfield is on the wire
     */
    public boolean quoteCancelV2BitfieldPresent() {
        return numberOfQuoteCancelV2Bitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfQuoteCancelV2Bitfields.value() >= 1L) && (quoteCancelV2BitfieldPresent() && quoteCancelV2Bitfield.quoteCancelV2Bitfield1ClearingFirm());
    }

    private boolean onWire(Field field) {
        return (field != quoteCancelV2Bitfield || quoteCancelV2BitfieldPresent()) && (field != clearingFirm || clearingFirmPresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        quoteCancelRptGrp.inputs(OptionalLong.of(numberOfQuoteCancelV2Bitfields.value()), quoteCancelV2BitfieldPresent() ? OptionalLong.of(quoteCancelV2Bitfield.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (quoteCancelV2BitfieldPresent() ? QuoteCancelV2BitfieldField.BYTE_LENGTH : 0) + quoteCancelRptGrp.byteLength() + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0);
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
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!numberOfQuoteCancelV2Bitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfQuoteCancelV2BitfieldsField.BYTE_LENGTH;
        if (quoteCancelV2BitfieldPresent()) {
            if (end - 1 - cursor < QuoteCancelV2BitfieldField.BYTE_LENGTH || !quoteCancelV2Bitfield.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteCancelV2BitfieldField.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!noQuoteEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoQuoteEntriesField.BYTE_LENGTH;
        giveEntryInputs();
        if (!quoteCancelRptGrp.parse(data, cursor, end, noQuoteEntries.value())) {
            return false;
        }
        cursor += quoteCancelRptGrp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (quoteCancelRptGrp.size() > 255) {
            throw new IllegalStateException("quoteCancelRptGrp holds " + quoteCancelRptGrp.size() + " entries, more than its count field can state");
        }
        noQuoteEntries.value((short) quoteCancelRptGrp.size());
        if (quoteCancelV2BitfieldPresent() != quoteCancelV2Bitfield.hasValue()) {
            throw new IllegalStateException(quoteCancelV2Bitfield.hasValue() ? "quoteCancelV2Bitfield holds a value the fields before it leave off the wire" : "quoteCancelV2Bitfield holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = quoteId.encode(data, cursor);
        cursor = numberOfQuoteCancelV2Bitfields.encode(data, cursor);
        if (quoteCancelV2BitfieldPresent()) {
            cursor = quoteCancelV2Bitfield.encode(data, cursor);
        }
        cursor = noQuoteEntries.encode(data, cursor);
        cursor = quoteCancelRptGrp.encode(data, cursor);
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
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
        quoteCancelRptGrp.clear();
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
        for (Field field : fields()) {
            if (field != noQuoteEntries && !field.isRecognized()) {
                return false;
            }
        }
        return quoteCancelRptGrp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != noQuoteEntries && !field.isValid()) {
                return false;
            }
        }
        if (!quoteCancelRptGrp.isValid()) {
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
        if (!quoteId.isDecoded()) {
            return Optional.of(quoteId);
        }
        if (!numberOfQuoteCancelV2Bitfields.isDecoded()) {
            return Optional.of(numberOfQuoteCancelV2Bitfields);
        }
        if (quoteCancelV2BitfieldPresent() && !quoteCancelV2Bitfield.isDecoded()) {
            return Optional.of(quoteCancelV2Bitfield);
        }
        if (!noQuoteEntries.isDecoded()) {
            return Optional.of(noQuoteEntries);
        }
        if (!quoteCancelRptGrp.isDecoded()) {
            return Optional.of(quoteCancelRptGrp.failedEntry().flatMap(QuoteCancelRptGrpEntry::failedAt).orElse(noQuoteEntries));
        }
        if (clearingFirmPresent() && !clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "QuoteId" -> Optional.of(quoteId);
            case "NumberOfQuoteCancelV2Bitfields" -> Optional.of(numberOfQuoteCancelV2Bitfields);
            case "QuoteCancelV2Bitfield" -> Optional.of(quoteCancelV2Bitfield);
            case "NoQuoteEntries" -> Optional.of(noQuoteEntries);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteCancelV2Message message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quoteCancelRptGrp.diffFields(message.quoteCancelRptGrp));
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            quoteCancelRptGrp.toFormattedString(builder, options);
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
        quoteCancelRptGrp.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteCancelV2Message message)) {
            return false;
        }
        return fields.equals(message.fields) && quoteCancelRptGrp.equals(message.quoteCancelRptGrp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quoteCancelRptGrp);
    }
}
