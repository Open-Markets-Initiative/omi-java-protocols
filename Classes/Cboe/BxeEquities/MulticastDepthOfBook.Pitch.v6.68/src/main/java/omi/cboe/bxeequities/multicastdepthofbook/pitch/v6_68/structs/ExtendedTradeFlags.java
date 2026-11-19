package omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.AlgorithmicIndicatorField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.BenchmarkReferencePriceIndicatorField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.CrossingTradeField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.DeferralOrEnrichmentTypeField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.DuplicativeIndicatorField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.MarketMechanismField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.ModificationIndicatorField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.NegotiatedTradeField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.OffBookAutomatedIndicatorField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.PriceFormationDiscoveryProcessField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.PublicationModeDeferralReasonField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.SpecialDividendField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.TradingModeField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.fields.TransactionCategoryField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.types.Field;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.types.GroupEntry;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.types.PrintOptions;

/**
 * The ExtendedTradeFlags record a message holds.
 *
 * <p>Extended Trade Flags</p>
 */
public final class ExtendedTradeFlags implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 14;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "ExtendedTradeFlags";

    /**
     * MMT Level level 1
     */
    private final MarketMechanismField marketMechanism = new MarketMechanismField();

    /**
     * MMT Level level 2
     */
    private final TradingModeField tradingMode = new TradingModeField();

    /**
     * MMT Level 3.1 and 3.13
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * MMT Levels 3.2
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
    private final BenchmarkReferencePriceIndicatorField benchmarkReferencePriceIndicator = new BenchmarkReferencePriceIndicatorField();

    /**
     * MMT Level 3.6
     */
    private final SpecialDividendField specialDividend = new SpecialDividendField();

    /**
     * MMT Level 3.7
     */
    private final OffBookAutomatedIndicatorField offBookAutomatedIndicator = new OffBookAutomatedIndicatorField();

    /**
     * MMT Level 3.8
     */
    private final PriceFormationDiscoveryProcessField priceFormationDiscoveryProcess = new PriceFormationDiscoveryProcessField();

    /**
     * MMT Level 3.9
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * MMT Level 4.1
     */
    private final PublicationModeDeferralReasonField publicationModeDeferralReason = new PublicationModeDeferralReasonField();

    /**
     * MMT Level 4.2
     */
    private final DeferralOrEnrichmentTypeField deferralOrEnrichmentType = new DeferralOrEnrichmentTypeField();

    /**
     * MMT Level 5
     */
    private final DuplicativeIndicatorField duplicativeIndicator = new DuplicativeIndicatorField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketMechanism, tradingMode, transactionCategory, negotiatedTrade, crossingTrade, modificationIndicator, benchmarkReferencePriceIndicator, specialDividend, offBookAutomatedIndicator, priceFormationDiscoveryProcess, algorithmicIndicator, publicationModeDeferralReason, deferralOrEnrichmentType, duplicativeIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * MMT Level level 1
     *
     * @return the MarketMechanism field
     */
    public MarketMechanismField marketMechanism() {
        return marketMechanism;
    }

    /**
     * MMT Level level 2
     *
     * @return the TradingMode field
     */
    public TradingModeField tradingMode() {
        return tradingMode;
    }

    /**
     * MMT Level 3.1 and 3.13
     *
     * @return the TransactionCategory field
     */
    public TransactionCategoryField transactionCategory() {
        return transactionCategory;
    }

    /**
     * MMT Levels 3.2
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
     * @return the BenchmarkReferencePriceIndicator field
     */
    public BenchmarkReferencePriceIndicatorField benchmarkReferencePriceIndicator() {
        return benchmarkReferencePriceIndicator;
    }

    /**
     * MMT Level 3.6
     *
     * @return the SpecialDividend field
     */
    public SpecialDividendField specialDividend() {
        return specialDividend;
    }

    /**
     * MMT Level 3.7
     *
     * @return the OffBookAutomatedIndicator field
     */
    public OffBookAutomatedIndicatorField offBookAutomatedIndicator() {
        return offBookAutomatedIndicator;
    }

    /**
     * MMT Level 3.8
     *
     * @return the PriceFormationDiscoveryProcess field
     */
    public PriceFormationDiscoveryProcessField priceFormationDiscoveryProcess() {
        return priceFormationDiscoveryProcess;
    }

    /**
     * MMT Level 3.9
     *
     * @return the AlgorithmicIndicator field
     */
    public AlgorithmicIndicatorField algorithmicIndicator() {
        return algorithmicIndicator;
    }

    /**
     * MMT Level 4.1
     *
     * @return the PublicationModeDeferralReason field
     */
    public PublicationModeDeferralReasonField publicationModeDeferralReason() {
        return publicationModeDeferralReason;
    }

    /**
     * MMT Level 4.2
     *
     * @return the DeferralOrEnrichmentType field
     */
    public DeferralOrEnrichmentTypeField deferralOrEnrichmentType() {
        return deferralOrEnrichmentType;
    }

    /**
     * MMT Level 5
     *
     * @return the DuplicativeIndicator field
     */
    public DuplicativeIndicatorField duplicativeIndicator() {
        return duplicativeIndicator;
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
        if (!benchmarkReferencePriceIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BenchmarkReferencePriceIndicatorField.BYTE_LENGTH;
        if (!specialDividend.parse(data, cursor)) {
            return false;
        }
        cursor += SpecialDividendField.BYTE_LENGTH;
        if (!offBookAutomatedIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OffBookAutomatedIndicatorField.BYTE_LENGTH;
        if (!priceFormationDiscoveryProcess.parse(data, cursor)) {
            return false;
        }
        cursor += PriceFormationDiscoveryProcessField.BYTE_LENGTH;
        if (!algorithmicIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AlgorithmicIndicatorField.BYTE_LENGTH;
        if (!publicationModeDeferralReason.parse(data, cursor)) {
            return false;
        }
        cursor += PublicationModeDeferralReasonField.BYTE_LENGTH;
        if (!deferralOrEnrichmentType.parse(data, cursor)) {
            return false;
        }
        cursor += DeferralOrEnrichmentTypeField.BYTE_LENGTH;
        return duplicativeIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketMechanism.encode(data, cursor);
        cursor = tradingMode.encode(data, cursor);
        cursor = transactionCategory.encode(data, cursor);
        cursor = negotiatedTrade.encode(data, cursor);
        cursor = crossingTrade.encode(data, cursor);
        cursor = modificationIndicator.encode(data, cursor);
        cursor = benchmarkReferencePriceIndicator.encode(data, cursor);
        cursor = specialDividend.encode(data, cursor);
        cursor = offBookAutomatedIndicator.encode(data, cursor);
        cursor = priceFormationDiscoveryProcess.encode(data, cursor);
        cursor = algorithmicIndicator.encode(data, cursor);
        cursor = publicationModeDeferralReason.encode(data, cursor);
        cursor = deferralOrEnrichmentType.encode(data, cursor);
        cursor = duplicativeIndicator.encode(data, cursor);
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
            case "MarketMechanism" -> Optional.of(marketMechanism);
            case "TradingMode" -> Optional.of(tradingMode);
            case "TransactionCategory" -> Optional.of(transactionCategory);
            case "NegotiatedTrade" -> Optional.of(negotiatedTrade);
            case "CrossingTrade" -> Optional.of(crossingTrade);
            case "ModificationIndicator" -> Optional.of(modificationIndicator);
            case "BenchmarkReferencePriceIndicator" -> Optional.of(benchmarkReferencePriceIndicator);
            case "SpecialDividend" -> Optional.of(specialDividend);
            case "OffBookAutomatedIndicator" -> Optional.of(offBookAutomatedIndicator);
            case "PriceFormationDiscoveryProcess" -> Optional.of(priceFormationDiscoveryProcess);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "PublicationModeDeferralReason" -> Optional.of(publicationModeDeferralReason);
            case "DeferralOrEnrichmentType" -> Optional.of(deferralOrEnrichmentType);
            case "DuplicativeIndicator" -> Optional.of(duplicativeIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof ExtendedTradeFlags message)) {
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
        if (!(other instanceof ExtendedTradeFlags message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
