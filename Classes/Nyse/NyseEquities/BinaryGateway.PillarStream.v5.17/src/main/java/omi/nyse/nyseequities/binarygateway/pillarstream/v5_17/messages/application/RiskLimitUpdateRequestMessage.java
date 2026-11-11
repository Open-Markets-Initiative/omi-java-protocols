package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.BreachActionRequestField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ClOrdIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ClearingNumberField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.CountLimitField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.IocAttributionField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MarketMakerNulField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MpidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MpsubidField2;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.PercentageLimitField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.PriceScaleField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.RiskControlActivationField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.RiskControlTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.RiskMinimumValueField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.RiskRangeIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.RiskUserCrdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.RiskUserTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SymbolIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.TimeLimitField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.UsdLimitField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.PrintOptions;

/**
 * Represents the RiskLimitUpdateRequestMessage message from the BinaryGateway protocol.
 *
 * <p>Risk limit update request used by Risk Admin to configure or update risk controls for a specified risk entity. Field applicability depends on RiskControlType; non-applicable fields should be set to 0 or ignored as documented.</p>
 */
public final class RiskLimitUpdateRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 268;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Risk Limit Update Request Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 22, 4, 78, 190 };

    /**
     * Identification number assigned to the security
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Firm Identifier – MPID.
     */
    private final MpidField mpid = new MpidField();

    /**
     * Risk Entity. Options Market Maker identifier – alphanumeric MMID associated with the specified MPID. Populate if applicable.
     */
    private final MarketMakerNulField marketMakerNul = new MarketMakerNulField();

    /**
     * Risk Entity – SubID associated with the specified MPID. Populate if applicable.
     */
    private final MpsubidField2 mpsubid = new MpsubidField2();

    /**
     * Reserved for future use. Risk Entity – Clearing Number associated with the specified MPID. Populate if applicable.
     */
    private final ClearingNumberField clearingNumber = new ClearingNumberField();

    /**
     * Unique ID of the new Order, Cancel/Replace, Cancel, Modify, or Bulk Cancel request as assigned by the firm.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Risk User – CRD of the firm that owns the risk control represented by this message.
     */
    private final RiskUserCrdField riskUserCrd = new RiskUserCrdField();

    /**
     * Risk User – type of firm that owns the risk control represented by this message. E = Entering Firm, C = Clearing Firm, O = Options Market Maker Firm.
     */
    private final RiskUserTypeField riskUserType = new RiskUserTypeField();

    /**
     * Risk Control Type enum
     */
    private final RiskControlTypeField riskControlType = new RiskControlTypeField();

    /**
     * Risk Control Activation enum
     */
    private final RiskControlActivationField riskControlActivation = new RiskControlActivationField();

    /**
     * US Dollar limit. Must be specified for RiskControlTypes: Single Order Max Notional Value; Gross Credit – Executed/Open/Open+Executed; Limit Order Price Protection – Custom Limits. For other RiskControlTypes set to 0.
     */
    private final UsdLimitField usdLimit = new UsdLimitField();

    /**
     * Microsecond time period. Must be specified for RiskControlTypes: Activity-based Rolling Transaction/Volume/Percentage; Activity-based Global Risk Mitigation Protection; Max Duplicative Orders; Order Rate Threshold – Max Orders across All Symbols. For other RiskControlTypes set to 0.
     */
    private final TimeLimitField timeLimit = new TimeLimitField();

    /**
     * Percentage (%). Must be specified for RiskControlTypes: Activity-based – Percentage; Limit Order Price Protection – Custom Limits; Single Order Maximum Quantity as Percentage of Symbol ADV. For other RiskControlTypes set to 0.
     */
    private final PercentageLimitField percentageLimit = new PercentageLimitField();

    /**
     * Count
     */
    private final CountLimitField countLimit = new CountLimitField();

    /**
     * Breach Action Request enum
     */
    private final BreachActionRequestField breachActionRequest = new BreachActionRequestField();

    /**
     * IOC Attribution enum
     */
    private final IocAttributionField iocAttribution = new IocAttributionField();

    /**
     * Quantity or price range to which the risk limit is applied. 0=Not Applicable/Optional per RiskControlType, 1..10=[see below]. Range meanings depend on RiskControlType (e.g., ADV buckets for RiskControlType 22; price buckets for RiskControlType 23).
     */
    private final RiskRangeIdField riskRangeId = new RiskRangeIdField();

    /**
     * Minimum value for which to apply the risk control. For RiskControlType 22 may specify minimum Symbol ADV threshold; for other RiskControlTypes set to 0.
     */
    private final RiskMinimumValueField riskMinimumValue = new RiskMinimumValueField();

    /**
     * 0=no decimals; interpret as integer. 2=two decimals; interpret with two decimals (e.g., USDLimit=25 with PriceScale=2 represents $0.25). Must be specified for Limit Order Price Protection - Custom Limits and applied to USDLimit; otherwise set to 0.
     */
    private final PriceScaleField priceScale = new PriceScaleField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolId, mpid, marketMakerNul, mpsubid, clearingNumber, clOrdId, riskUserCrd, riskUserType, riskControlType, riskControlActivation, usdLimit, timeLimit, percentageLimit, countLimit, breachActionRequest, iocAttribution, riskRangeId, riskMinimumValue, priceScale);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identification number assigned to the security
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Firm Identifier – MPID.
     *
     * @return the Mpid field
     */
    public MpidField mpid() {
        return mpid;
    }

    /**
     * Risk Entity. Options Market Maker identifier – alphanumeric MMID associated with the specified MPID. Populate if applicable.
     *
     * @return the MarketMakerNul field
     */
    public MarketMakerNulField marketMakerNul() {
        return marketMakerNul;
    }

    /**
     * Risk Entity – SubID associated with the specified MPID. Populate if applicable.
     *
     * @return the Mpsubid field
     */
    public MpsubidField2 mpsubid() {
        return mpsubid;
    }

    /**
     * Reserved for future use. Risk Entity – Clearing Number associated with the specified MPID. Populate if applicable.
     *
     * @return the ClearingNumber field
     */
    public ClearingNumberField clearingNumber() {
        return clearingNumber;
    }

    /**
     * Unique ID of the new Order, Cancel/Replace, Cancel, Modify, or Bulk Cancel request as assigned by the firm.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Risk User – CRD of the firm that owns the risk control represented by this message.
     *
     * @return the RiskUserCrd field
     */
    public RiskUserCrdField riskUserCrd() {
        return riskUserCrd;
    }

    /**
     * Risk User – type of firm that owns the risk control represented by this message. E = Entering Firm, C = Clearing Firm, O = Options Market Maker Firm.
     *
     * @return the RiskUserType field
     */
    public RiskUserTypeField riskUserType() {
        return riskUserType;
    }

    /**
     * Risk Control Type enum
     *
     * @return the RiskControlType field
     */
    public RiskControlTypeField riskControlType() {
        return riskControlType;
    }

    /**
     * Risk Control Activation enum
     *
     * @return the RiskControlActivation field
     */
    public RiskControlActivationField riskControlActivation() {
        return riskControlActivation;
    }

    /**
     * US Dollar limit. Must be specified for RiskControlTypes: Single Order Max Notional Value; Gross Credit – Executed/Open/Open+Executed; Limit Order Price Protection – Custom Limits. For other RiskControlTypes set to 0.
     *
     * @return the UsdLimit field
     */
    public UsdLimitField usdLimit() {
        return usdLimit;
    }

    /**
     * Microsecond time period. Must be specified for RiskControlTypes: Activity-based Rolling Transaction/Volume/Percentage; Activity-based Global Risk Mitigation Protection; Max Duplicative Orders; Order Rate Threshold – Max Orders across All Symbols. For other RiskControlTypes set to 0.
     *
     * @return the TimeLimit field
     */
    public TimeLimitField timeLimit() {
        return timeLimit;
    }

    /**
     * Percentage (%). Must be specified for RiskControlTypes: Activity-based – Percentage; Limit Order Price Protection – Custom Limits; Single Order Maximum Quantity as Percentage of Symbol ADV. For other RiskControlTypes set to 0.
     *
     * @return the PercentageLimit field
     */
    public PercentageLimitField percentageLimit() {
        return percentageLimit;
    }

    /**
     * Count
     *
     * @return the CountLimit field
     */
    public CountLimitField countLimit() {
        return countLimit;
    }

    /**
     * Breach Action Request enum
     *
     * @return the BreachActionRequest field
     */
    public BreachActionRequestField breachActionRequest() {
        return breachActionRequest;
    }

    /**
     * IOC Attribution enum
     *
     * @return the IocAttribution field
     */
    public IocAttributionField iocAttribution() {
        return iocAttribution;
    }

    /**
     * Quantity or price range to which the risk limit is applied. 0=Not Applicable/Optional per RiskControlType, 1..10=[see below]. Range meanings depend on RiskControlType (e.g., ADV buckets for RiskControlType 22; price buckets for RiskControlType 23).
     *
     * @return the RiskRangeId field
     */
    public RiskRangeIdField riskRangeId() {
        return riskRangeId;
    }

    /**
     * Minimum value for which to apply the risk control. For RiskControlType 22 may specify minimum Symbol ADV threshold; for other RiskControlTypes set to 0.
     *
     * @return the RiskMinimumValue field
     */
    public RiskMinimumValueField riskMinimumValue() {
        return riskMinimumValue;
    }

    /**
     * 0=no decimals; interpret as integer. 2=two decimals; interpret with two decimals (e.g., USDLimit=25 with PriceScale=2 represents $0.25). Must be specified for Limit Order Price Protection - Custom Limits and applied to USDLimit; otherwise set to 0.
     *
     * @return the PriceScale field
     */
    public PriceScaleField priceScale() {
        return priceScale;
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
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!mpid.parse(data, cursor)) {
            return false;
        }
        cursor += MpidField.BYTE_LENGTH;
        if (!marketMakerNul.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMakerNulField.BYTE_LENGTH;
        if (!mpsubid.parse(data, cursor)) {
            return false;
        }
        cursor += MpsubidField2.BYTE_LENGTH;
        cursor += 4; // padding
        if (!clearingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingNumberField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!riskUserCrd.parse(data, cursor)) {
            return false;
        }
        cursor += RiskUserCrdField.BYTE_LENGTH;
        if (!riskUserType.parse(data, cursor)) {
            return false;
        }
        cursor += RiskUserTypeField.BYTE_LENGTH;
        if (!riskControlType.parse(data, cursor)) {
            return false;
        }
        cursor += RiskControlTypeField.BYTE_LENGTH;
        if (!riskControlActivation.parse(data, cursor)) {
            return false;
        }
        cursor += RiskControlActivationField.BYTE_LENGTH;
        if (!usdLimit.parse(data, cursor)) {
            return false;
        }
        cursor += UsdLimitField.BYTE_LENGTH;
        if (!timeLimit.parse(data, cursor)) {
            return false;
        }
        cursor += TimeLimitField.BYTE_LENGTH;
        if (!percentageLimit.parse(data, cursor)) {
            return false;
        }
        cursor += PercentageLimitField.BYTE_LENGTH;
        if (!countLimit.parse(data, cursor)) {
            return false;
        }
        cursor += CountLimitField.BYTE_LENGTH;
        if (!breachActionRequest.parse(data, cursor)) {
            return false;
        }
        cursor += BreachActionRequestField.BYTE_LENGTH;
        if (!iocAttribution.parse(data, cursor)) {
            return false;
        }
        cursor += IocAttributionField.BYTE_LENGTH;
        if (!riskRangeId.parse(data, cursor)) {
            return false;
        }
        cursor += RiskRangeIdField.BYTE_LENGTH;
        if (!riskMinimumValue.parse(data, cursor)) {
            return false;
        }
        cursor += RiskMinimumValueField.BYTE_LENGTH;
        if (!priceScale.parse(data, cursor)) {
            return false;
        }
        cursor += PriceScaleField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbolId.encode(data, cursor);
        cursor = mpid.encode(data, cursor);
        cursor = marketMakerNul.encode(data, cursor);
        cursor = mpsubid.encode(data, cursor);
        if (buffer != null && buffer.length >= 26) {
            System.arraycopy(buffer, 22, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = clearingNumber.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = riskUserCrd.encode(data, cursor);
        cursor = riskUserType.encode(data, cursor);
        cursor = riskControlType.encode(data, cursor);
        cursor = riskControlActivation.encode(data, cursor);
        cursor = usdLimit.encode(data, cursor);
        cursor = timeLimit.encode(data, cursor);
        cursor = percentageLimit.encode(data, cursor);
        cursor = countLimit.encode(data, cursor);
        cursor = breachActionRequest.encode(data, cursor);
        cursor = iocAttribution.encode(data, cursor);
        cursor = riskRangeId.encode(data, cursor);
        cursor = riskMinimumValue.encode(data, cursor);
        cursor = priceScale.encode(data, cursor);
        if (buffer != null && buffer.length >= 268) {
            System.arraycopy(buffer, 78, data, cursor, 190); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 190, (byte) 0); // padding
        }
        cursor += 190;
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
            case "SymbolId" -> Optional.of(symbolId);
            case "Mpid" -> Optional.of(mpid);
            case "MarketMakerNul" -> Optional.of(marketMakerNul);
            case "Mpsubid" -> Optional.of(mpsubid);
            case "ClearingNumber" -> Optional.of(clearingNumber);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "RiskUserCrd" -> Optional.of(riskUserCrd);
            case "RiskUserType" -> Optional.of(riskUserType);
            case "RiskControlType" -> Optional.of(riskControlType);
            case "RiskControlActivation" -> Optional.of(riskControlActivation);
            case "UsdLimit" -> Optional.of(usdLimit);
            case "TimeLimit" -> Optional.of(timeLimit);
            case "PercentageLimit" -> Optional.of(percentageLimit);
            case "CountLimit" -> Optional.of(countLimit);
            case "BreachActionRequest" -> Optional.of(breachActionRequest);
            case "IocAttribution" -> Optional.of(iocAttribution);
            case "RiskRangeId" -> Optional.of(riskRangeId);
            case "RiskMinimumValue" -> Optional.of(riskMinimumValue);
            case "PriceScale" -> Optional.of(priceScale);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RiskLimitUpdateRequestMessage message)) {
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
        if (!(other instanceof RiskLimitUpdateRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
