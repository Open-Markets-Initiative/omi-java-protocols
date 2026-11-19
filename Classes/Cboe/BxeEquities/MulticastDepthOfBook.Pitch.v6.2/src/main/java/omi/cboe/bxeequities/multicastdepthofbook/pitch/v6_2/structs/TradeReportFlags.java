package omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.fields.BatsTradeTimingIndicatorField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.fields.BatsTransactionSubCategoryField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.fields.BenchmarkIndicatorField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.fields.CrossingTradeField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.fields.ExCumDividendField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.fields.MarketMechanismField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.fields.ModificationIndicatorField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.fields.NegotiatedTradeField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.fields.PublicationModeField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.fields.TradingModeField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.fields.TransactionCategoryField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.types.Field;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.types.GroupEntry;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_2.types.PrintOptions;

/**
 * The TradeReportFlags record a message holds.
 *
 * <p>Trade Report Flags</p>
 */
public final class TradeReportFlags implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 11;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "TradeReportFlags";

    /**
     * MMT Level n/a
     */
    private final BatsTradeTimingIndicatorField batsTradeTimingIndicator = new BatsTradeTimingIndicatorField();

    /**
     * MMT Level 1
     */
    private final MarketMechanismField marketMechanism = new MarketMechanismField();

    /**
     * MMT Level 2
     */
    private final TradingModeField tradingMode = new TradingModeField();

    /**
     * MMT Level 3.1
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * MMT Level 3.2
     */
    private final NegotiatedTradeField negotiatedTrade = new NegotiatedTradeField();

    /**
     * MMT Level 3.3
     */
    private final CrossingTradeField crossingTrade = new CrossingTradeField();

    /**
     * MMT Level 3.4
     */
    private final ModificationIndicatorField modificationIndicator = new ModificationIndicatorField();

    /**
     * MMT Level 3.5
     */
    private final BenchmarkIndicatorField benchmarkIndicator = new BenchmarkIndicatorField();

    /**
     * MMT Level 3.6
     */
    private final ExCumDividendField exCumDividend = new ExCumDividendField();

    /**
     * MMT Level 4
     */
    private final PublicationModeField publicationMode = new PublicationModeField();

    /**
     * MMT Level n/a
     */
    private final BatsTransactionSubCategoryField batsTransactionSubCategory = new BatsTransactionSubCategoryField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(batsTradeTimingIndicator, marketMechanism, tradingMode, transactionCategory, negotiatedTrade, crossingTrade, modificationIndicator, benchmarkIndicator, exCumDividend, publicationMode, batsTransactionSubCategory);

    private byte[] buffer;

    private boolean decoded;

    /**
     * MMT Level n/a
     *
     * @return the BatsTradeTimingIndicator field
     */
    public BatsTradeTimingIndicatorField batsTradeTimingIndicator() {
        return batsTradeTimingIndicator;
    }

    /**
     * MMT Level 1
     *
     * @return the MarketMechanism field
     */
    public MarketMechanismField marketMechanism() {
        return marketMechanism;
    }

    /**
     * MMT Level 2
     *
     * @return the TradingMode field
     */
    public TradingModeField tradingMode() {
        return tradingMode;
    }

    /**
     * MMT Level 3.1
     *
     * @return the TransactionCategory field
     */
    public TransactionCategoryField transactionCategory() {
        return transactionCategory;
    }

    /**
     * MMT Level 3.2
     *
     * @return the NegotiatedTrade field
     */
    public NegotiatedTradeField negotiatedTrade() {
        return negotiatedTrade;
    }

    /**
     * MMT Level 3.3
     *
     * @return the CrossingTrade field
     */
    public CrossingTradeField crossingTrade() {
        return crossingTrade;
    }

    /**
     * MMT Level 3.4
     *
     * @return the ModificationIndicator field
     */
    public ModificationIndicatorField modificationIndicator() {
        return modificationIndicator;
    }

    /**
     * MMT Level 3.5
     *
     * @return the BenchmarkIndicator field
     */
    public BenchmarkIndicatorField benchmarkIndicator() {
        return benchmarkIndicator;
    }

    /**
     * MMT Level 3.6
     *
     * @return the ExCumDividend field
     */
    public ExCumDividendField exCumDividend() {
        return exCumDividend;
    }

    /**
     * MMT Level 4
     *
     * @return the PublicationMode field
     */
    public PublicationModeField publicationMode() {
        return publicationMode;
    }

    /**
     * MMT Level n/a
     *
     * @return the BatsTransactionSubCategory field
     */
    public BatsTransactionSubCategoryField batsTransactionSubCategory() {
        return batsTransactionSubCategory;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
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
        if (!batsTradeTimingIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BatsTradeTimingIndicatorField.BYTE_LENGTH;
        if (!marketMechanism.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMechanismField.BYTE_LENGTH;
        if (!tradingMode.parse(data, cursor)) {
            return false;
        }
        cursor += TradingModeField.BYTE_LENGTH;
        if (!transactionCategory.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionCategoryField.BYTE_LENGTH;
        if (!negotiatedTrade.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiatedTradeField.BYTE_LENGTH;
        if (!crossingTrade.parse(data, cursor)) {
            return false;
        }
        cursor += CrossingTradeField.BYTE_LENGTH;
        if (!modificationIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ModificationIndicatorField.BYTE_LENGTH;
        if (!benchmarkIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BenchmarkIndicatorField.BYTE_LENGTH;
        if (!exCumDividend.parse(data, cursor)) {
            return false;
        }
        cursor += ExCumDividendField.BYTE_LENGTH;
        if (!publicationMode.parse(data, cursor)) {
            return false;
        }
        cursor += PublicationModeField.BYTE_LENGTH;
        return batsTransactionSubCategory.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = batsTradeTimingIndicator.encode(data, cursor);
        cursor = marketMechanism.encode(data, cursor);
        cursor = tradingMode.encode(data, cursor);
        cursor = transactionCategory.encode(data, cursor);
        cursor = negotiatedTrade.encode(data, cursor);
        cursor = crossingTrade.encode(data, cursor);
        cursor = modificationIndicator.encode(data, cursor);
        cursor = benchmarkIndicator.encode(data, cursor);
        cursor = exCumDividend.encode(data, cursor);
        cursor = publicationMode.encode(data, cursor);
        cursor = batsTransactionSubCategory.encode(data, cursor);
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "BatsTradeTimingIndicator" -> Optional.of(batsTradeTimingIndicator);
            case "MarketMechanism" -> Optional.of(marketMechanism);
            case "TradingMode" -> Optional.of(tradingMode);
            case "TransactionCategory" -> Optional.of(transactionCategory);
            case "NegotiatedTrade" -> Optional.of(negotiatedTrade);
            case "CrossingTrade" -> Optional.of(crossingTrade);
            case "ModificationIndicator" -> Optional.of(modificationIndicator);
            case "BenchmarkIndicator" -> Optional.of(benchmarkIndicator);
            case "ExCumDividend" -> Optional.of(exCumDividend);
            case "PublicationMode" -> Optional.of(publicationMode);
            case "BatsTransactionSubCategory" -> Optional.of(batsTransactionSubCategory);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof TradeReportFlags message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof TradeReportFlags message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
