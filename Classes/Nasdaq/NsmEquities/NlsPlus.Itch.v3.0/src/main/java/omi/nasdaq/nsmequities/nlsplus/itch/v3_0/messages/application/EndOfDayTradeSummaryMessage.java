package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.ConsolidatedClosingPriceField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.ConsolidatedHighPriceField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.ConsolidatedLowPriceField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.ConsolidatedOpenPriceField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.ConsolidatedVolumeField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.IssueSymbolField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.MarketCategoryField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.Field;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.Message;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.PrintOptions;

/**
 * Represents the EndOfDayTradeSummaryMessage message from the NlsPlus protocol.
 *
 * <p>Summarises the consolidated trading activity for an issue at the end of the trading day.</p>
 */
public final class EndOfDayTradeSummaryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'J';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "End Of Day Trade Summary Message";

    /**
     * Denotes the Nasdaq-assigned issue symbol of the security for which the trade report is being generated
     */
    private final IssueSymbolField issueSymbol = new IssueSymbolField();

    /**
     * Indicates the listing market or listing market tier for the issue
     */
    private final MarketCategoryField marketCategory = new MarketCategoryField();

    /**
     * The consolidated high price for the issue for the trading day
     */
    private final ConsolidatedHighPriceField consolidatedHighPrice = new ConsolidatedHighPriceField();

    /**
     * The consolidated low price for the issue for the trading day
     */
    private final ConsolidatedLowPriceField consolidatedLowPrice = new ConsolidatedLowPriceField();

    /**
     * The consolidated closing price for the issue for the trading day
     */
    private final ConsolidatedClosingPriceField consolidatedClosingPrice = new ConsolidatedClosingPriceField();

    /**
     * Reflects the volume for the Issue Symbol as reported on the consolidated market data feed at the time the trade message was generated
     */
    private final ConsolidatedVolumeField consolidatedVolume = new ConsolidatedVolumeField();

    /**
     * The consolidated opening price for the issue for the trading day
     */
    private final ConsolidatedOpenPriceField consolidatedOpenPrice = new ConsolidatedOpenPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(issueSymbol, marketCategory, consolidatedHighPrice, consolidatedLowPrice, consolidatedClosingPrice, consolidatedVolume, consolidatedOpenPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Denotes the Nasdaq-assigned issue symbol of the security for which the trade report is being generated
     *
     * @return the IssueSymbol field
     */
    public IssueSymbolField issueSymbol() {
        return issueSymbol;
    }

    /**
     * Indicates the listing market or listing market tier for the issue
     *
     * @return the MarketCategory field
     */
    public MarketCategoryField marketCategory() {
        return marketCategory;
    }

    /**
     * The consolidated high price for the issue for the trading day
     *
     * @return the ConsolidatedHighPrice field
     */
    public ConsolidatedHighPriceField consolidatedHighPrice() {
        return consolidatedHighPrice;
    }

    /**
     * The consolidated low price for the issue for the trading day
     *
     * @return the ConsolidatedLowPrice field
     */
    public ConsolidatedLowPriceField consolidatedLowPrice() {
        return consolidatedLowPrice;
    }

    /**
     * The consolidated closing price for the issue for the trading day
     *
     * @return the ConsolidatedClosingPrice field
     */
    public ConsolidatedClosingPriceField consolidatedClosingPrice() {
        return consolidatedClosingPrice;
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
     * The consolidated opening price for the issue for the trading day
     *
     * @return the ConsolidatedOpenPrice field
     */
    public ConsolidatedOpenPriceField consolidatedOpenPrice() {
        return consolidatedOpenPrice;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!issueSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += IssueSymbolField.BYTE_LENGTH;
        if (!marketCategory.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCategoryField.BYTE_LENGTH;
        if (!consolidatedHighPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedHighPriceField.BYTE_LENGTH;
        if (!consolidatedLowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedLowPriceField.BYTE_LENGTH;
        if (!consolidatedClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedClosingPriceField.BYTE_LENGTH;
        if (!consolidatedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedVolumeField.BYTE_LENGTH;
        return consolidatedOpenPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = issueSymbol.encode(data, cursor);
        cursor = marketCategory.encode(data, cursor);
        cursor = consolidatedHighPrice.encode(data, cursor);
        cursor = consolidatedLowPrice.encode(data, cursor);
        cursor = consolidatedClosingPrice.encode(data, cursor);
        cursor = consolidatedVolume.encode(data, cursor);
        cursor = consolidatedOpenPrice.encode(data, cursor);
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
            case "IssueSymbol" -> Optional.of(issueSymbol);
            case "MarketCategory" -> Optional.of(marketCategory);
            case "ConsolidatedHighPrice" -> Optional.of(consolidatedHighPrice);
            case "ConsolidatedLowPrice" -> Optional.of(consolidatedLowPrice);
            case "ConsolidatedClosingPrice" -> Optional.of(consolidatedClosingPrice);
            case "ConsolidatedVolume" -> Optional.of(consolidatedVolume);
            case "ConsolidatedOpenPrice" -> Optional.of(consolidatedOpenPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EndOfDayTradeSummaryMessage message)) {
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
        if (!(other instanceof EndOfDayTradeSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
