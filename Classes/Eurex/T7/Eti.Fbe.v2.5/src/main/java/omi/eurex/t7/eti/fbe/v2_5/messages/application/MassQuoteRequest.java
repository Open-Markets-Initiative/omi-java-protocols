package omi.eurex.t7.eti.fbe.v2_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v2_5.fields.ComplianceIdField;
import omi.eurex.t7.eti.fbe.v2_5.fields.EnrichmentRuleIdField;
import omi.eurex.t7.eti.fbe.v2_5.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v2_5.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v2_5.fields.NoQuoteEntriesField;
import omi.eurex.t7.eti.fbe.v2_5.fields.PriceValidityCheckTypeField;
import omi.eurex.t7.eti.fbe.v2_5.fields.QuoteIdField;
import omi.eurex.t7.eti.fbe.v2_5.fields.QuoteSizeTypeField;
import omi.eurex.t7.eti.fbe.v2_5.groups.QuoteEntryGrpCompEntry;
import omi.eurex.t7.eti.fbe.v2_5.groups.QuoteEntryGrpCompList;
import omi.eurex.t7.eti.fbe.v2_5.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v2_5.types.Field;
import omi.eurex.t7.eti.fbe.v2_5.types.Message;
import omi.eurex.t7.eti.fbe.v2_5.types.PrintOptions;

/**
 * Represents the MassQuoteRequest message from the Eti protocol.
 */
public final class MassQuoteRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 50;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Quote Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Quote Id
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Compliance Id
     */
    private final ComplianceIdField complianceId = new ComplianceIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Enrichment Rule Id
     */
    private final EnrichmentRuleIdField enrichmentRuleId = new EnrichmentRuleIdField();

    /**
     * Price Validity Check Type
     */
    private final PriceValidityCheckTypeField priceValidityCheckType = new PriceValidityCheckTypeField();

    /**
     * Quote Size Type
     */
    private final QuoteSizeTypeField quoteSizeType = new QuoteSizeTypeField();

    /**
     * No Quote Entries
     */
    private final NoQuoteEntriesField noQuoteEntries = new NoQuoteEntriesField();

    /**
     * Quote Entry Grp Comp
     */
    private final QuoteEntryGrpCompList quoteEntryGrpComp = new QuoteEntryGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(quoteId), List.<Field>of(complianceId), List.<Field>of(marketSegmentId), List.<Field>of(enrichmentRuleId), List.<Field>of(priceValidityCheckType), List.<Field>of(quoteSizeType), List.<Field>of(noQuoteEntries)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Network Msg Id
     *
     * @return the NetworkMsgId field
     */
    public NetworkMsgIdField networkMsgId() {
        return networkMsgId;
    }

    /**
     * Quote Id
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * Compliance Id
     *
     * @return the ComplianceId field
     */
    public ComplianceIdField complianceId() {
        return complianceId;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Enrichment Rule Id
     *
     * @return the EnrichmentRuleId field
     */
    public EnrichmentRuleIdField enrichmentRuleId() {
        return enrichmentRuleId;
    }

    /**
     * Price Validity Check Type
     *
     * @return the PriceValidityCheckType field
     */
    public PriceValidityCheckTypeField priceValidityCheckType() {
        return priceValidityCheckType;
    }

    /**
     * Quote Size Type
     *
     * @return the QuoteSizeType field
     */
    public QuoteSizeTypeField quoteSizeType() {
        return quoteSizeType;
    }

    /**
     * No Quote Entries
     *
     * @return the NoQuoteEntries field
     */
    public NoQuoteEntriesField noQuoteEntries() {
        return noQuoteEntries;
    }

    /**
     * Quote Entry Grp Comp
     *
     * <p>Encode writes this list's size to the NoQuoteEntries field.</p>
     *
     * @return the QuoteEntryGrpComp entries
     */
    public QuoteEntryGrpCompList quoteEntryGrpComp() {
        return quoteEntryGrpComp;
    }

    /**
     * Request Header Comp
     *
     * @return the RequestHeaderComp record
     */
    public RequestHeaderComp requestHeaderComp() {
        return requestHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + quoteEntryGrpComp.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 8;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RequestHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RequestHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(7);
        cursor += 7;
        cursor += quoteEntryGrpComp.byteLength();
        return cursor;
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 32)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!complianceId.parse(data, cursor)) {
            return false;
        }
        cursor += ComplianceIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!enrichmentRuleId.parse(data, cursor)) {
            return false;
        }
        cursor += EnrichmentRuleIdField.BYTE_LENGTH;
        if (!priceValidityCheckType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceValidityCheckTypeField.BYTE_LENGTH;
        if (!quoteSizeType.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteSizeTypeField.BYTE_LENGTH;
        if (!noQuoteEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoQuoteEntriesField.BYTE_LENGTH;
        cursor += 7; // padding
        if (!quoteEntryGrpComp.parse(data, cursor, end, noQuoteEntries.value())) {
            return false;
        }
        cursor += quoteEntryGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (quoteEntryGrpComp.size() > 255) {
            throw new IllegalStateException("quoteEntryGrpComp holds " + quoteEntryGrpComp.size() + " entries, more than its count field can state");
        }
        noQuoteEntries.value((short) quoteEntryGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = complianceId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = enrichmentRuleId.encode(data, cursor);
        cursor = priceValidityCheckType.encode(data, cursor);
        cursor = quoteSizeType.encode(data, cursor);
        cursor = noQuoteEntries.encode(data, cursor);
        if (buffer != null && buffer.length >= 50) {
            System.arraycopy(buffer, 43, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
        cursor = quoteEntryGrpComp.encode(data, cursor);
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
        requestHeaderComp.clear();
        quoteEntryGrpComp.clear();
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
            if (field != noQuoteEntries && !field.isRecognized()) {
                return false;
            }
        }
        return quoteEntryGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noQuoteEntries && !field.isValid()) {
                return false;
            }
        }
        if (!quoteEntryGrpComp.isValid()) {
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
        if (!networkMsgId.isDecoded()) {
            return Optional.of(networkMsgId);
        }
        if (!requestHeaderComp.isDecoded()) {
            return requestHeaderComp.failedAt();
        }
        if (!quoteId.isDecoded()) {
            return Optional.of(quoteId);
        }
        if (!complianceId.isDecoded()) {
            return Optional.of(complianceId);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!enrichmentRuleId.isDecoded()) {
            return Optional.of(enrichmentRuleId);
        }
        if (!priceValidityCheckType.isDecoded()) {
            return Optional.of(priceValidityCheckType);
        }
        if (!quoteSizeType.isDecoded()) {
            return Optional.of(quoteSizeType);
        }
        if (!noQuoteEntries.isDecoded()) {
            return Optional.of(noQuoteEntries);
        }
        if (!quoteEntryGrpComp.isDecoded()) {
            return Optional.of(quoteEntryGrpComp.failedEntry().flatMap(QuoteEntryGrpCompEntry::failedAt).orElse(noQuoteEntries));
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
            case "NetworkMsgId" -> Optional.of(networkMsgId);
            case "QuoteId" -> Optional.of(quoteId);
            case "ComplianceId" -> Optional.of(complianceId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "EnrichmentRuleId" -> Optional.of(enrichmentRuleId);
            case "PriceValidityCheckType" -> Optional.of(priceValidityCheckType);
            case "QuoteSizeType" -> Optional.of(quoteSizeType);
            case "NoQuoteEntries" -> Optional.of(noQuoteEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassQuoteRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quoteEntryGrpComp.diffFields(message.quoteEntryGrpComp));
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
            quoteEntryGrpComp.toFormattedString(builder, options);
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
        quoteEntryGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof MassQuoteRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && quoteEntryGrpComp.equals(message.quoteEntryGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quoteEntryGrpComp);
    }
}
