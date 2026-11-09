package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.BlockedByBreachIndicatorField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.BlockedByKillSwitchIndicatorField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.BreachActionResponseField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.ClearingNumberField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.CountCalculationField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.CountLimitField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.IocAttributionField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.MarketMakerNulField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.MpidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.MpsubidField2;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.PercentageLimitField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.ReinstatementRequiredByOtherField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.ReinstatementRequiredBySelfField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.RiskActionTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.RiskControlTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.RiskUserCrdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.RiskUserTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.SymbolIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.ThresholdBreachLevelField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.TimeLimitField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.UsdCalculation1Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.UsdCalculation2Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.UsdCalculation3Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.UsdCalculation4Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.UsdLimitField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.PrintOptions;

/**
 * Represents the RiskControlAlertMessage message from the BinaryGateway protocol.
 *
 * <p>Provides notification of threshold or breach events, reinstatement events, and kill switch actions for firms using Pillar Risk Controls.</p>
 */
public final class RiskControlAlertMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 301;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Risk Control Alert Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 22, 4, 101, 200 };

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
     * Action taken when a risk breach occurs.
     */
    private final BreachActionResponseField breachActionResponse = new BreachActionResponseField();

    /**
     * IOC Attribution enum
     */
    private final IocAttributionField iocAttribution = new IocAttributionField();

    /**
     * Gross Credit calculation for open orders.
     */
    private final UsdCalculation1Field usdCalculation1 = new UsdCalculation1Field();

    /**
     * Gross Credit calculation for auction orders.
     */
    private final UsdCalculation2Field usdCalculation2 = new UsdCalculation2Field();

    /**
     * Gross Credit calculation for executed orders.
     */
    private final UsdCalculation3Field usdCalculation3 = new UsdCalculation3Field();

    /**
     * Gross Credit calculation for executed auction orders.
     */
    private final UsdCalculation4Field usdCalculation4 = new UsdCalculation4Field();

    /**
     * Current calculated count for applicable risk controls.
     */
    private final CountCalculationField countCalculation = new CountCalculationField();

    /**
     * Risk action to perform, including query, kill switch actions, reinstatement, and symbol-level entity management.
     */
    private final RiskActionTypeField riskActionType = new RiskActionTypeField();

    /**
     * Percentage level at which the threshold breach occurred.
     */
    private final ThresholdBreachLevelField thresholdBreachLevel = new ThresholdBreachLevelField();

    /**
     * Indicates whether the entity is blocked due to a breach.
     */
    private final BlockedByBreachIndicatorField blockedByBreachIndicator = new BlockedByBreachIndicatorField();

    /**
     * Indicates whether the entity is blocked by a kill switch.
     */
    private final BlockedByKillSwitchIndicatorField blockedByKillSwitchIndicator = new BlockedByKillSwitchIndicatorField();

    /**
     * Indicates whether reinstatement approval is required from the receiving risk user.
     */
    private final ReinstatementRequiredBySelfField reinstatementRequiredBySelf = new ReinstatementRequiredBySelfField();

    /**
     * Indicates whether reinstatement approval is required from other risk users.
     */
    private final ReinstatementRequiredByOtherField reinstatementRequiredByOther = new ReinstatementRequiredByOtherField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolId, mpid, marketMakerNul, mpsubid, clearingNumber, riskUserCrd, riskUserType, riskControlType, usdLimit, timeLimit, percentageLimit, countLimit, breachActionResponse, iocAttribution, usdCalculation1, usdCalculation2, usdCalculation3, usdCalculation4, countCalculation, riskActionType, thresholdBreachLevel, blockedByBreachIndicator, blockedByKillSwitchIndicator, reinstatementRequiredBySelf, reinstatementRequiredByOther);

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
     * Action taken when a risk breach occurs.
     *
     * @return the BreachActionResponse field
     */
    public BreachActionResponseField breachActionResponse() {
        return breachActionResponse;
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
     * Gross Credit calculation for open orders.
     *
     * @return the UsdCalculation1 field
     */
    public UsdCalculation1Field usdCalculation1() {
        return usdCalculation1;
    }

    /**
     * Gross Credit calculation for auction orders.
     *
     * @return the UsdCalculation2 field
     */
    public UsdCalculation2Field usdCalculation2() {
        return usdCalculation2;
    }

    /**
     * Gross Credit calculation for executed orders.
     *
     * @return the UsdCalculation3 field
     */
    public UsdCalculation3Field usdCalculation3() {
        return usdCalculation3;
    }

    /**
     * Gross Credit calculation for executed auction orders.
     *
     * @return the UsdCalculation4 field
     */
    public UsdCalculation4Field usdCalculation4() {
        return usdCalculation4;
    }

    /**
     * Current calculated count for applicable risk controls.
     *
     * @return the CountCalculation field
     */
    public CountCalculationField countCalculation() {
        return countCalculation;
    }

    /**
     * Risk action to perform, including query, kill switch actions, reinstatement, and symbol-level entity management.
     *
     * @return the RiskActionType field
     */
    public RiskActionTypeField riskActionType() {
        return riskActionType;
    }

    /**
     * Percentage level at which the threshold breach occurred.
     *
     * @return the ThresholdBreachLevel field
     */
    public ThresholdBreachLevelField thresholdBreachLevel() {
        return thresholdBreachLevel;
    }

    /**
     * Indicates whether the entity is blocked due to a breach.
     *
     * @return the BlockedByBreachIndicator field
     */
    public BlockedByBreachIndicatorField blockedByBreachIndicator() {
        return blockedByBreachIndicator;
    }

    /**
     * Indicates whether the entity is blocked by a kill switch.
     *
     * @return the BlockedByKillSwitchIndicator field
     */
    public BlockedByKillSwitchIndicatorField blockedByKillSwitchIndicator() {
        return blockedByKillSwitchIndicator;
    }

    /**
     * Indicates whether reinstatement approval is required from the receiving risk user.
     *
     * @return the ReinstatementRequiredBySelf field
     */
    public ReinstatementRequiredBySelfField reinstatementRequiredBySelf() {
        return reinstatementRequiredBySelf;
    }

    /**
     * Indicates whether reinstatement approval is required from other risk users.
     *
     * @return the ReinstatementRequiredByOther field
     */
    public ReinstatementRequiredByOtherField reinstatementRequiredByOther() {
        return reinstatementRequiredByOther;
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
        if (!breachActionResponse.parse(data, cursor)) {
            return false;
        }
        cursor += BreachActionResponseField.BYTE_LENGTH;
        if (!iocAttribution.parse(data, cursor)) {
            return false;
        }
        cursor += IocAttributionField.BYTE_LENGTH;
        if (!usdCalculation1.parse(data, cursor)) {
            return false;
        }
        cursor += UsdCalculation1Field.BYTE_LENGTH;
        if (!usdCalculation2.parse(data, cursor)) {
            return false;
        }
        cursor += UsdCalculation2Field.BYTE_LENGTH;
        if (!usdCalculation3.parse(data, cursor)) {
            return false;
        }
        cursor += UsdCalculation3Field.BYTE_LENGTH;
        if (!usdCalculation4.parse(data, cursor)) {
            return false;
        }
        cursor += UsdCalculation4Field.BYTE_LENGTH;
        if (!countCalculation.parse(data, cursor)) {
            return false;
        }
        cursor += CountCalculationField.BYTE_LENGTH;
        if (!riskActionType.parse(data, cursor)) {
            return false;
        }
        cursor += RiskActionTypeField.BYTE_LENGTH;
        if (!thresholdBreachLevel.parse(data, cursor)) {
            return false;
        }
        cursor += ThresholdBreachLevelField.BYTE_LENGTH;
        if (!blockedByBreachIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BlockedByBreachIndicatorField.BYTE_LENGTH;
        if (!blockedByKillSwitchIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BlockedByKillSwitchIndicatorField.BYTE_LENGTH;
        if (!reinstatementRequiredBySelf.parse(data, cursor)) {
            return false;
        }
        cursor += ReinstatementRequiredBySelfField.BYTE_LENGTH;
        if (!reinstatementRequiredByOther.parse(data, cursor)) {
            return false;
        }
        cursor += ReinstatementRequiredByOtherField.BYTE_LENGTH;
        cursor += 200; // padding

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
        if (buffer != null && buffer.length >= 22 + 4) {
            System.arraycopy(buffer, 22, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = clearingNumber.encode(data, cursor);
        cursor = riskUserCrd.encode(data, cursor);
        cursor = riskUserType.encode(data, cursor);
        cursor = riskControlType.encode(data, cursor);
        cursor = usdLimit.encode(data, cursor);
        cursor = timeLimit.encode(data, cursor);
        cursor = percentageLimit.encode(data, cursor);
        cursor = countLimit.encode(data, cursor);
        cursor = breachActionResponse.encode(data, cursor);
        cursor = iocAttribution.encode(data, cursor);
        cursor = usdCalculation1.encode(data, cursor);
        cursor = usdCalculation2.encode(data, cursor);
        cursor = usdCalculation3.encode(data, cursor);
        cursor = usdCalculation4.encode(data, cursor);
        cursor = countCalculation.encode(data, cursor);
        cursor = riskActionType.encode(data, cursor);
        cursor = thresholdBreachLevel.encode(data, cursor);
        cursor = blockedByBreachIndicator.encode(data, cursor);
        cursor = blockedByKillSwitchIndicator.encode(data, cursor);
        cursor = reinstatementRequiredBySelf.encode(data, cursor);
        cursor = reinstatementRequiredByOther.encode(data, cursor);
        if (buffer != null && buffer.length >= 101 + 200) {
            System.arraycopy(buffer, 101, data, cursor, 200); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 200, (byte) 0); // padding
        }
        cursor += 200;
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
            case "RiskUserCrd" -> Optional.of(riskUserCrd);
            case "RiskUserType" -> Optional.of(riskUserType);
            case "RiskControlType" -> Optional.of(riskControlType);
            case "UsdLimit" -> Optional.of(usdLimit);
            case "TimeLimit" -> Optional.of(timeLimit);
            case "PercentageLimit" -> Optional.of(percentageLimit);
            case "CountLimit" -> Optional.of(countLimit);
            case "BreachActionResponse" -> Optional.of(breachActionResponse);
            case "IocAttribution" -> Optional.of(iocAttribution);
            case "UsdCalculation1" -> Optional.of(usdCalculation1);
            case "UsdCalculation2" -> Optional.of(usdCalculation2);
            case "UsdCalculation3" -> Optional.of(usdCalculation3);
            case "UsdCalculation4" -> Optional.of(usdCalculation4);
            case "CountCalculation" -> Optional.of(countCalculation);
            case "RiskActionType" -> Optional.of(riskActionType);
            case "ThresholdBreachLevel" -> Optional.of(thresholdBreachLevel);
            case "BlockedByBreachIndicator" -> Optional.of(blockedByBreachIndicator);
            case "BlockedByKillSwitchIndicator" -> Optional.of(blockedByKillSwitchIndicator);
            case "ReinstatementRequiredBySelf" -> Optional.of(reinstatementRequiredBySelf);
            case "ReinstatementRequiredByOther" -> Optional.of(reinstatementRequiredByOther);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RiskControlAlertMessage message)) {
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
        if (!(other instanceof RiskControlAlertMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
