package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IntrinsicVolatilityField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IsinField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PrerequisiteCostField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SensitivityDeltaField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SensitivityDeltaSignField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SensitivityGammaField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SensitivityGammaSignField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SensitivityRhoField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SensitivityRhoSignField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SensitivityThetaField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SensitivityThetaSignField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SensitivityVegaField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SensitivityVegaSignField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TheoreticalWarrantPriceField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TimeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the ElwInvestmentIndicatorSensitivityMessage message from the Koscom protocol.
 *
 * <p>ELW Investment Indicator Sensitivity. Theoretical warrant price plus signed Delta/Gamma/Theta/Vega/Rho sensitivities, intrinsic volatility, and prerequisite cost.</p>
 */
public final class ElwInvestmentIndicatorSensitivityMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 105;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Elw Investment Indicator Sensitivity Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 98, 6 };

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     */
    private final IsinField isin = new IsinField();

    /**
     * During market: HHMMSS (Time:min:Sec) 090000 ~ Market Closing: JUNJJJ.
     */
    private final TimeField time = new TimeField();

    /**
     * 9(8)9V9(2).
     */
    private final TheoreticalWarrantPriceField theoreticalWarrantPrice = new TheoreticalWarrantPriceField();

    /**
     * "+", "-", " ".
     */
    private final SensitivityDeltaSignField sensitivityDeltaSign = new SensitivityDeltaSignField();

    /**
     * 9V9(6).
     */
    private final SensitivityDeltaField sensitivityDelta = new SensitivityDeltaField();

    /**
     * "+", "-", " ".
     */
    private final SensitivityGammaSignField sensitivityGammaSign = new SensitivityGammaSignField();

    /**
     * 9V9(6).
     */
    private final SensitivityGammaField sensitivityGamma = new SensitivityGammaField();

    /**
     * "+", "-", " ".
     */
    private final SensitivityThetaSignField sensitivityThetaSign = new SensitivityThetaSignField();

    /**
     * 9(6)V9(6).
     */
    private final SensitivityThetaField sensitivityTheta = new SensitivityThetaField();

    /**
     * "+", "-", " ".
     */
    private final SensitivityVegaSignField sensitivityVegaSign = new SensitivityVegaSignField();

    /**
     * 9(6)V9(6).
     */
    private final SensitivityVegaField sensitivityVega = new SensitivityVegaField();

    /**
     * "+", "-", " ".
     */
    private final SensitivityRhoSignField sensitivityRhoSign = new SensitivityRhoSignField();

    /**
     * 9(6)V9(6).
     */
    private final SensitivityRhoField sensitivityRho = new SensitivityRhoField();

    /**
     * 9(3)V9(2) "0" for Early Closed ELW.
     */
    private final IntrinsicVolatilityField intrinsicVolatility = new IntrinsicVolatilityField();

    /**
     * 9(8)V9(2) "0" for Standard ELW.
     */
    private final PrerequisiteCostField prerequisiteCost = new PrerequisiteCostField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(isin, time, theoreticalWarrantPrice, sensitivityDeltaSign, sensitivityDelta, sensitivityGammaSign, sensitivityGamma, sensitivityThetaSign, sensitivityTheta, sensitivityVegaSign, sensitivityVega, sensitivityRhoSign, sensitivityRho, intrinsicVolatility, prerequisiteCost, endKeyword);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * During market: HHMMSS (Time:min:Sec) 090000 ~ Market Closing: JUNJJJ.
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    /**
     * 9(8)9V9(2).
     *
     * @return the TheoreticalWarrantPrice field
     */
    public TheoreticalWarrantPriceField theoreticalWarrantPrice() {
        return theoreticalWarrantPrice;
    }

    /**
     * "+", "-", " ".
     *
     * @return the SensitivityDeltaSign field
     */
    public SensitivityDeltaSignField sensitivityDeltaSign() {
        return sensitivityDeltaSign;
    }

    /**
     * 9V9(6).
     *
     * @return the SensitivityDelta field
     */
    public SensitivityDeltaField sensitivityDelta() {
        return sensitivityDelta;
    }

    /**
     * "+", "-", " ".
     *
     * @return the SensitivityGammaSign field
     */
    public SensitivityGammaSignField sensitivityGammaSign() {
        return sensitivityGammaSign;
    }

    /**
     * 9V9(6).
     *
     * @return the SensitivityGamma field
     */
    public SensitivityGammaField sensitivityGamma() {
        return sensitivityGamma;
    }

    /**
     * "+", "-", " ".
     *
     * @return the SensitivityThetaSign field
     */
    public SensitivityThetaSignField sensitivityThetaSign() {
        return sensitivityThetaSign;
    }

    /**
     * 9(6)V9(6).
     *
     * @return the SensitivityTheta field
     */
    public SensitivityThetaField sensitivityTheta() {
        return sensitivityTheta;
    }

    /**
     * "+", "-", " ".
     *
     * @return the SensitivityVegaSign field
     */
    public SensitivityVegaSignField sensitivityVegaSign() {
        return sensitivityVegaSign;
    }

    /**
     * 9(6)V9(6).
     *
     * @return the SensitivityVega field
     */
    public SensitivityVegaField sensitivityVega() {
        return sensitivityVega;
    }

    /**
     * "+", "-", " ".
     *
     * @return the SensitivityRhoSign field
     */
    public SensitivityRhoSignField sensitivityRhoSign() {
        return sensitivityRhoSign;
    }

    /**
     * 9(6)V9(6).
     *
     * @return the SensitivityRho field
     */
    public SensitivityRhoField sensitivityRho() {
        return sensitivityRho;
    }

    /**
     * 9(3)V9(2) "0" for Early Closed ELW.
     *
     * @return the IntrinsicVolatility field
     */
    public IntrinsicVolatilityField intrinsicVolatility() {
        return intrinsicVolatility;
    }

    /**
     * 9(8)V9(2) "0" for Standard ELW.
     *
     * @return the PrerequisiteCost field
     */
    public PrerequisiteCostField prerequisiteCost() {
        return prerequisiteCost;
    }

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     *
     * @return the EndKeyword field
     */
    public EndKeywordField endKeyword() {
        return endKeyword;
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
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!time.parse(data, cursor)) {
            return false;
        }
        cursor += TimeField.BYTE_LENGTH;
        if (!theoreticalWarrantPrice.parse(data, cursor)) {
            return false;
        }
        cursor += TheoreticalWarrantPriceField.BYTE_LENGTH;
        if (!sensitivityDeltaSign.parse(data, cursor)) {
            return false;
        }
        cursor += SensitivityDeltaSignField.BYTE_LENGTH;
        if (!sensitivityDelta.parse(data, cursor)) {
            return false;
        }
        cursor += SensitivityDeltaField.BYTE_LENGTH;
        if (!sensitivityGammaSign.parse(data, cursor)) {
            return false;
        }
        cursor += SensitivityGammaSignField.BYTE_LENGTH;
        if (!sensitivityGamma.parse(data, cursor)) {
            return false;
        }
        cursor += SensitivityGammaField.BYTE_LENGTH;
        if (!sensitivityThetaSign.parse(data, cursor)) {
            return false;
        }
        cursor += SensitivityThetaSignField.BYTE_LENGTH;
        if (!sensitivityTheta.parse(data, cursor)) {
            return false;
        }
        cursor += SensitivityThetaField.BYTE_LENGTH;
        if (!sensitivityVegaSign.parse(data, cursor)) {
            return false;
        }
        cursor += SensitivityVegaSignField.BYTE_LENGTH;
        if (!sensitivityVega.parse(data, cursor)) {
            return false;
        }
        cursor += SensitivityVegaField.BYTE_LENGTH;
        if (!sensitivityRhoSign.parse(data, cursor)) {
            return false;
        }
        cursor += SensitivityRhoSignField.BYTE_LENGTH;
        if (!sensitivityRho.parse(data, cursor)) {
            return false;
        }
        cursor += SensitivityRhoField.BYTE_LENGTH;
        if (!intrinsicVolatility.parse(data, cursor)) {
            return false;
        }
        cursor += IntrinsicVolatilityField.BYTE_LENGTH;
        if (!prerequisiteCost.parse(data, cursor)) {
            return false;
        }
        cursor += PrerequisiteCostField.BYTE_LENGTH;
        cursor += 6; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = isin.encode(data, cursor);
        cursor = time.encode(data, cursor);
        cursor = theoreticalWarrantPrice.encode(data, cursor);
        cursor = sensitivityDeltaSign.encode(data, cursor);
        cursor = sensitivityDelta.encode(data, cursor);
        cursor = sensitivityGammaSign.encode(data, cursor);
        cursor = sensitivityGamma.encode(data, cursor);
        cursor = sensitivityThetaSign.encode(data, cursor);
        cursor = sensitivityTheta.encode(data, cursor);
        cursor = sensitivityVegaSign.encode(data, cursor);
        cursor = sensitivityVega.encode(data, cursor);
        cursor = sensitivityRhoSign.encode(data, cursor);
        cursor = sensitivityRho.encode(data, cursor);
        cursor = intrinsicVolatility.encode(data, cursor);
        cursor = prerequisiteCost.encode(data, cursor);
        if (buffer != null && buffer.length >= 104) {
            System.arraycopy(buffer, 98, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = endKeyword.encode(data, cursor);
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
            case "Isin" -> Optional.of(isin);
            case "Time" -> Optional.of(time);
            case "TheoreticalWarrantPrice" -> Optional.of(theoreticalWarrantPrice);
            case "SensitivityDeltaSign" -> Optional.of(sensitivityDeltaSign);
            case "SensitivityDelta" -> Optional.of(sensitivityDelta);
            case "SensitivityGammaSign" -> Optional.of(sensitivityGammaSign);
            case "SensitivityGamma" -> Optional.of(sensitivityGamma);
            case "SensitivityThetaSign" -> Optional.of(sensitivityThetaSign);
            case "SensitivityTheta" -> Optional.of(sensitivityTheta);
            case "SensitivityVegaSign" -> Optional.of(sensitivityVegaSign);
            case "SensitivityVega" -> Optional.of(sensitivityVega);
            case "SensitivityRhoSign" -> Optional.of(sensitivityRhoSign);
            case "SensitivityRho" -> Optional.of(sensitivityRho);
            case "IntrinsicVolatility" -> Optional.of(intrinsicVolatility);
            case "PrerequisiteCost" -> Optional.of(prerequisiteCost);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ElwInvestmentIndicatorSensitivityMessage message)) {
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
        if (!(other instanceof ElwInvestmentIndicatorSensitivityMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
