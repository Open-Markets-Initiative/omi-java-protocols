package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.ConsolidatedVolumeField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.CorrectedTradeControlNumberField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.CorrectedTradePriceLongField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.CorrectedTradeSizeField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.IssueSymbolField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.OriginalTradeControlNumberField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.OriginalTradePriceLongField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.OriginalTradeSizeField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.OriginatingMarketCenterIdentifierField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.SecurityClassField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.structs.CorrectedSaleConditionModifier;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.structs.OriginalSaleConditionModifier;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.Field;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.Message;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.PrintOptions;

/**
 * Represents the LongFormTradeCorrectionMessage message from the NlsPlus protocol.
 *
 * <p>Trade Correction carrying eight byte original and corrected trade prices.</p>
 */
public final class LongFormTradeCorrectionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'c';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 70;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Long Form Trade Correction Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Denotes the Nasdaq market system that generated the trade report message
     */
    private final OriginatingMarketCenterIdentifierField originatingMarketCenterIdentifier = new OriginatingMarketCenterIdentifierField();

    /**
     * Denotes the Nasdaq-assigned issue symbol of the security for which the trade report is being generated
     */
    private final IssueSymbolField issueSymbol = new IssueSymbolField();

    /**
     * Indicates the primary listing market for the issue
     */
    private final SecurityClassField securityClass = new SecurityClassField();

    /**
     * Indicates the source's internal control number associated with the original trade transaction
     */
    private final OriginalTradeControlNumberField originalTradeControlNumber = new OriginalTradeControlNumberField();

    /**
     * The price reported on the original trade transaction
     */
    private final OriginalTradePriceLongField originalTradePriceLong = new OriginalTradePriceLongField();

    /**
     * The number of shares reported on the original trade transaction
     */
    private final OriginalTradeSizeField originalTradeSize = new OriginalTradeSizeField();

    /**
     * Indicates the source's internal control number associated with the corrected trade transaction
     */
    private final CorrectedTradeControlNumberField correctedTradeControlNumber = new CorrectedTradeControlNumberField();

    /**
     * The price reported on the corrected trade transaction
     */
    private final CorrectedTradePriceLongField correctedTradePriceLong = new CorrectedTradePriceLongField();

    /**
     * The number of shares reported on the corrected trade transaction
     */
    private final CorrectedTradeSizeField correctedTradeSize = new CorrectedTradeSizeField();

    /**
     * Reflects the volume for the Issue Symbol as reported on the consolidated market data feed at the time the trade message was generated
     */
    private final ConsolidatedVolumeField consolidatedVolume = new ConsolidatedVolumeField();

    /**
     * The sale condition modifier reported on the original trade transaction
     */
    private final OriginalSaleConditionModifier originalSaleConditionModifier = new OriginalSaleConditionModifier();

    /**
     * The sale condition modifier reported on the corrected trade transaction
     */
    private final CorrectedSaleConditionModifier correctedSaleConditionModifier = new CorrectedSaleConditionModifier();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(originatingMarketCenterIdentifier), List.<Field>of(issueSymbol), List.<Field>of(securityClass), List.<Field>of(originalTradeControlNumber), List.<Field>of(originalTradePriceLong), List.<Field>of(originalTradeSize), originalSaleConditionModifier.fields(), List.<Field>of(correctedTradeControlNumber), List.<Field>of(correctedTradePriceLong), List.<Field>of(correctedTradeSize), correctedSaleConditionModifier.fields(), List.<Field>of(consolidatedVolume)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Denotes the Nasdaq market system that generated the trade report message
     *
     * @return the OriginatingMarketCenterIdentifier field
     */
    public OriginatingMarketCenterIdentifierField originatingMarketCenterIdentifier() {
        return originatingMarketCenterIdentifier;
    }

    /**
     * Denotes the Nasdaq-assigned issue symbol of the security for which the trade report is being generated
     *
     * @return the IssueSymbol field
     */
    public IssueSymbolField issueSymbol() {
        return issueSymbol;
    }

    /**
     * Indicates the primary listing market for the issue
     *
     * @return the SecurityClass field
     */
    public SecurityClassField securityClass() {
        return securityClass;
    }

    /**
     * Indicates the source's internal control number associated with the original trade transaction
     *
     * @return the OriginalTradeControlNumber field
     */
    public OriginalTradeControlNumberField originalTradeControlNumber() {
        return originalTradeControlNumber;
    }

    /**
     * The price reported on the original trade transaction
     *
     * @return the OriginalTradePriceLong field
     */
    public OriginalTradePriceLongField originalTradePriceLong() {
        return originalTradePriceLong;
    }

    /**
     * The number of shares reported on the original trade transaction
     *
     * @return the OriginalTradeSize field
     */
    public OriginalTradeSizeField originalTradeSize() {
        return originalTradeSize;
    }

    /**
     * Indicates the source's internal control number associated with the corrected trade transaction
     *
     * @return the CorrectedTradeControlNumber field
     */
    public CorrectedTradeControlNumberField correctedTradeControlNumber() {
        return correctedTradeControlNumber;
    }

    /**
     * The price reported on the corrected trade transaction
     *
     * @return the CorrectedTradePriceLong field
     */
    public CorrectedTradePriceLongField correctedTradePriceLong() {
        return correctedTradePriceLong;
    }

    /**
     * The number of shares reported on the corrected trade transaction
     *
     * @return the CorrectedTradeSize field
     */
    public CorrectedTradeSizeField correctedTradeSize() {
        return correctedTradeSize;
    }

    /**
     * Reflects the volume for the Issue Symbol as reported on the consolidated market data feed at the time the trade message was generated
     *
     * @return the ConsolidatedVolume field
     */
    public ConsolidatedVolumeField consolidatedVolume() {
        return consolidatedVolume;
    }

    /**
     * The sale condition modifier reported on the original trade transaction
     *
     * @return the OriginalSaleConditionModifier record
     */
    public OriginalSaleConditionModifier originalSaleConditionModifier() {
        return originalSaleConditionModifier;
    }

    /**
     * The sale condition modifier reported on the corrected trade transaction
     *
     * @return the CorrectedSaleConditionModifier record
     */
    public CorrectedSaleConditionModifier correctedSaleConditionModifier() {
        return correctedSaleConditionModifier;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!originatingMarketCenterIdentifier.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatingMarketCenterIdentifierField.BYTE_LENGTH;
        if (!issueSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += IssueSymbolField.BYTE_LENGTH;
        if (!securityClass.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityClassField.BYTE_LENGTH;
        if (!originalTradeControlNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeControlNumberField.BYTE_LENGTH;
        if (!originalTradePriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradePriceLongField.BYTE_LENGTH;
        if (!originalTradeSize.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeSizeField.BYTE_LENGTH;
        if (!originalSaleConditionModifier.parseFrom(data, cursor, end - 34)) {
            return false;
        }
        cursor += originalSaleConditionModifier.byteLength();
        if (!correctedTradeControlNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradeControlNumberField.BYTE_LENGTH;
        if (!correctedTradePriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradePriceLongField.BYTE_LENGTH;
        if (!correctedTradeSize.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradeSizeField.BYTE_LENGTH;
        if (!correctedSaleConditionModifier.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += correctedSaleConditionModifier.byteLength();
        if (!consolidatedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedVolumeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = originatingMarketCenterIdentifier.encode(data, cursor);
        cursor = issueSymbol.encode(data, cursor);
        cursor = securityClass.encode(data, cursor);
        cursor = originalTradeControlNumber.encode(data, cursor);
        cursor = originalTradePriceLong.encode(data, cursor);
        cursor = originalTradeSize.encode(data, cursor);
        cursor = originalSaleConditionModifier.encode(data, cursor);
        cursor = correctedTradeControlNumber.encode(data, cursor);
        cursor = correctedTradePriceLong.encode(data, cursor);
        cursor = correctedTradeSize.encode(data, cursor);
        cursor = correctedSaleConditionModifier.encode(data, cursor);
        cursor = consolidatedVolume.encode(data, cursor);
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
        originalSaleConditionModifier.clear();
        correctedSaleConditionModifier.clear();
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
            case "OriginatingMarketCenterIdentifier" -> Optional.of(originatingMarketCenterIdentifier);
            case "IssueSymbol" -> Optional.of(issueSymbol);
            case "SecurityClass" -> Optional.of(securityClass);
            case "OriginalTradeControlNumber" -> Optional.of(originalTradeControlNumber);
            case "OriginalTradePriceLong" -> Optional.of(originalTradePriceLong);
            case "OriginalTradeSize" -> Optional.of(originalTradeSize);
            case "CorrectedTradeControlNumber" -> Optional.of(correctedTradeControlNumber);
            case "CorrectedTradePriceLong" -> Optional.of(correctedTradePriceLong);
            case "CorrectedTradeSize" -> Optional.of(correctedTradeSize);
            case "ConsolidatedVolume" -> Optional.of(consolidatedVolume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LongFormTradeCorrectionMessage message)) {
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
        if (!(other instanceof LongFormTradeCorrectionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
