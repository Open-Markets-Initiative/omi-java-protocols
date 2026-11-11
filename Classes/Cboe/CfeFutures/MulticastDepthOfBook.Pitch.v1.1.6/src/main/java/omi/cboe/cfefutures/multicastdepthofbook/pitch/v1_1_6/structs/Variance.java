package omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.DiscountFactorField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.FedFundsRateField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.InitialStrikeField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.NumElapsedReturnsField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.NumExpectedPricesField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.PreviousArmvmField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.PreviousSettlementField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.RealizedVarianceField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.groups.FutureLegEntry;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.groups.FutureLegList;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.Field;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.GroupEntry;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.PrintOptions;

/**
 * The Variance record a message holds.
 *
 * <p>Variance</p>
 */
public final class Variance implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 52;

    /**
     * This entry takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "Variance";

    /**
     * Realized Variance to date (signed 64-bit decimal with 8 implied decimal places)
     */
    private final RealizedVarianceField realizedVariance = new RealizedVarianceField();

    /**
     * Number of expected SP500 prices to be used for calculating returns during the life of the contract
     */
    private final NumExpectedPricesField numExpectedPrices = new NumExpectedPricesField();

    /**
     * Number of returns elapsed as of the beginning of the trading day
     */
    private final NumElapsedReturnsField numElapsedReturns = new NumElapsedReturnsField();

    /**
     * Previous day Settlement Value
     */
    private final PreviousSettlementField previousSettlement = new PreviousSettlementField();

    /**
     * Discount Factor (signed 64-bit decimal with 16 implied decimal places)
     */
    private final DiscountFactorField discountFactor = new DiscountFactorField();

    /**
     * Initial strike
     */
    private final InitialStrikeField initialStrike = new InitialStrikeField();

    /**
     * ARMVM that was used to adjust the previous day settlement price (signed 64-bit decimal value with 6 implied decimal places)
     */
    private final PreviousArmvmField previousArmvm = new PreviousArmvmField();

    /**
     * Fed Funds rate of prior day (signed 64-bit number with 6 implied decimal places)
     */
    private final FedFundsRateField fedFundsRate = new FedFundsRateField();

    /**
     * Future Leg
     */
    private final FutureLegList futureLeg = new FutureLegList();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(realizedVariance, numExpectedPrices, numElapsedReturns, previousSettlement, discountFactor, initialStrike, previousArmvm, fedFundsRate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Realized Variance to date (signed 64-bit decimal with 8 implied decimal places)
     *
     * @return the RealizedVariance field
     */
    public RealizedVarianceField realizedVariance() {
        return realizedVariance;
    }

    /**
     * Number of expected SP500 prices to be used for calculating returns during the life of the contract
     *
     * @return the NumExpectedPrices field
     */
    public NumExpectedPricesField numExpectedPrices() {
        return numExpectedPrices;
    }

    /**
     * Number of returns elapsed as of the beginning of the trading day
     *
     * @return the NumElapsedReturns field
     */
    public NumElapsedReturnsField numElapsedReturns() {
        return numElapsedReturns;
    }

    /**
     * Previous day Settlement Value
     *
     * @return the PreviousSettlement field
     */
    public PreviousSettlementField previousSettlement() {
        return previousSettlement;
    }

    /**
     * Discount Factor (signed 64-bit decimal with 16 implied decimal places)
     *
     * @return the DiscountFactor field
     */
    public DiscountFactorField discountFactor() {
        return discountFactor;
    }

    /**
     * Initial strike
     *
     * @return the InitialStrike field
     */
    public InitialStrikeField initialStrike() {
        return initialStrike;
    }

    /**
     * ARMVM that was used to adjust the previous day settlement price (signed 64-bit decimal value with 6 implied decimal places)
     *
     * @return the PreviousArmvm field
     */
    public PreviousArmvmField previousArmvm() {
        return previousArmvm;
    }

    /**
     * Fed Funds rate of prior day (signed 64-bit number with 6 implied decimal places)
     *
     * @return the FedFundsRate field
     */
    public FedFundsRateField fedFundsRate() {
        return fedFundsRate;
    }

    /**
     * Future Leg
     *
     * <p>Its entries are counted by the LegCount outside this message: its reader writes this list's size there.</p>
     *
     * @return the FutureLeg entries
     */
    public FutureLegList futureLeg() {
        return futureLeg;
    }

    private long legCountInput;

    private boolean legCountInputGiven;

    private boolean legCountInputKnown;

    /**
     * Gives this message the LegCount that the bytes around it state, which its rules read.
     *
     * <p>Where none is given, a decode reads entries until the bytes it is handed end. A given value is kept until another is given.</p>
     *
     * @param value the LegCount
     */
    public void legCountInput(long value) {
        this.legCountInput = value;
        this.legCountInputGiven = true;
        this.legCountInputKnown = true;
    }

    /**
     * Returns the LegCount this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the LegCount, or empty when none is given or known
     */
    public OptionalLong legCountInput() {
        return legCountInputKnown ? OptionalLong.of(legCountInput) : OptionalLong.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + futureLeg.byteLength();
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
        if (!realizedVariance.parse(data, cursor)) {
            return false;
        }
        cursor += RealizedVarianceField.BYTE_LENGTH;
        if (!numExpectedPrices.parse(data, cursor)) {
            return false;
        }
        cursor += NumExpectedPricesField.BYTE_LENGTH;
        if (!numElapsedReturns.parse(data, cursor)) {
            return false;
        }
        cursor += NumElapsedReturnsField.BYTE_LENGTH;
        if (!previousSettlement.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousSettlementField.BYTE_LENGTH;
        if (!discountFactor.parse(data, cursor)) {
            return false;
        }
        cursor += DiscountFactorField.BYTE_LENGTH;
        if (!initialStrike.parse(data, cursor)) {
            return false;
        }
        cursor += InitialStrikeField.BYTE_LENGTH;
        if (!previousArmvm.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousArmvmField.BYTE_LENGTH;
        if (!fedFundsRate.parse(data, cursor)) {
            return false;
        }
        cursor += FedFundsRateField.BYTE_LENGTH;
        if (!(legCountInputGiven ? futureLeg.parse(data, cursor, end, legCountInput) : futureLeg.parse(data, cursor, end))) {
            return false;
        }
        cursor += futureLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (futureLeg.size() > 255) {
            throw new IllegalStateException("futureLeg holds " + futureLeg.size() + " entries, more than its count field can state");
        }
        int cursor = offset;
        cursor = realizedVariance.encode(data, cursor);
        cursor = numExpectedPrices.encode(data, cursor);
        cursor = numElapsedReturns.encode(data, cursor);
        cursor = previousSettlement.encode(data, cursor);
        cursor = discountFactor.encode(data, cursor);
        cursor = initialStrike.encode(data, cursor);
        cursor = previousArmvm.encode(data, cursor);
        cursor = fedFundsRate.encode(data, cursor);
        cursor = futureLeg.encode(data, cursor);
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
        futureLeg.clear();
        this.legCountInputKnown = legCountInputGiven;
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
        return futureLeg.isRecognized();
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
        if (!futureLeg.isValid()) {
            return false;
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
        if (!realizedVariance.isDecoded()) {
            return Optional.of(realizedVariance);
        }
        if (!numExpectedPrices.isDecoded()) {
            return Optional.of(numExpectedPrices);
        }
        if (!numElapsedReturns.isDecoded()) {
            return Optional.of(numElapsedReturns);
        }
        if (!previousSettlement.isDecoded()) {
            return Optional.of(previousSettlement);
        }
        if (!discountFactor.isDecoded()) {
            return Optional.of(discountFactor);
        }
        if (!initialStrike.isDecoded()) {
            return Optional.of(initialStrike);
        }
        if (!previousArmvm.isDecoded()) {
            return Optional.of(previousArmvm);
        }
        if (!fedFundsRate.isDecoded()) {
            return Optional.of(fedFundsRate);
        }
        if (!futureLeg.isDecoded()) {
            return futureLeg.failedEntry().flatMap(FutureLegEntry::failedAt);
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
            case "RealizedVariance" -> Optional.of(realizedVariance);
            case "NumExpectedPrices" -> Optional.of(numExpectedPrices);
            case "NumElapsedReturns" -> Optional.of(numElapsedReturns);
            case "PreviousSettlement" -> Optional.of(previousSettlement);
            case "DiscountFactor" -> Optional.of(discountFactor);
            case "InitialStrike" -> Optional.of(initialStrike);
            case "PreviousArmvm" -> Optional.of(previousArmvm);
            case "FedFundsRate" -> Optional.of(fedFundsRate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof Variance message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(futureLeg.diffFields(message.futureLeg));
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
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            futureLeg.toFormattedString(builder, options);
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
        futureLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof Variance message)) {
            return false;
        }
        return fields.equals(message.fields) && futureLeg.equals(message.futureLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, futureLeg);
    }
}
