package omi.bme.bmeequities.fulldepth.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.AuctionEndTimeField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.AuctionOriginField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.AuctionTriggerPriceField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.BlockOscilationPercentageField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.BlockStaticRangeField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.BonusWarrantsWithActiveBonusField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.DynamicPriceOscilationPercentageField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.DynamicRangeMultiplierField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.ExemptionSituationField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.HighLimitPriceField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.LiquidativeValueDateField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.LiquidativeValueField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.LowLimitPriceField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.NonAvailabilityReasonField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.OrderStaticRangeField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.ReferencePriceField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.SecurityTradingStatusField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.StaticPriceField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.StaticRangeTypeField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.fields.TransactionDateAndTimeField;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.types.Field;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.types.Message;
import omi.bme.bmeequities.fulldepth.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the SecurityStatusMessage message from the FullDepth protocol.
 *
 * <p>Message sent by the server to inform on the status of one security</p>
 */
public final class SecurityStatusMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 115;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Status Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     */
    private final TransactionDateAndTimeField transactionDateAndTime = new TransactionDateAndTimeField();

    /**
     * Reference price
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * Static Price
     */
    private final StaticPriceField staticPrice = new StaticPriceField();

    /**
     * Percentage of dynamic range
     */
    private final DynamicPriceOscilationPercentageField dynamicPriceOscilationPercentage = new DynamicPriceOscilationPercentageField();

    /**
     * Dynamic Range Multiplier
     */
    private final DynamicRangeMultiplierField dynamicRangeMultiplier = new DynamicRangeMultiplierField();

    /**
     * Auction Trigger Price
     */
    private final AuctionTriggerPriceField auctionTriggerPrice = new AuctionTriggerPriceField();

    /**
     * Actual UTC time for the end of the auction
     */
    private final AuctionEndTimeField auctionEndTime = new AuctionEndTimeField();

    /**
     * Date of the Net Asset Value
     */
    private final LiquidativeValueDateField liquidativeValueDate = new LiquidativeValueDateField();

    /**
     * Indicates whether the bonus is active or not (bonus)
     */
    private final BonusWarrantsWithActiveBonusField bonusWarrantsWithActiveBonus = new BonusWarrantsWithActiveBonusField();

    /**
     * Security Trading Status
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * Auction type
     */
    private final AuctionOriginField auctionOrigin = new AuctionOriginField();

    /**
     * Reason security halted
     */
    private final NonAvailabilityReasonField nonAvailabilityReason = new NonAvailabilityReasonField();

    /**
     * Type of exemption
     */
    private final ExemptionSituationField exemptionSituation = new ExemptionSituationField();

    /**
     * Price fluctuation on bid/ask spread midpoint for agreed blocks
     */
    private final BlockOscilationPercentageField blockOscilationPercentage = new BlockOscilationPercentageField();

    /**
     * High limit price
     */
    private final HighLimitPriceField highLimitPrice = new HighLimitPriceField();

    /**
     * Low limit price
     */
    private final LowLimitPriceField lowLimitPrice = new LowLimitPriceField();

    /**
     * Net Asset Value
     */
    private final LiquidativeValueField liquidativeValue = new LiquidativeValueField();

    /**
     * Static range type
     */
    private final StaticRangeTypeField staticRangeType = new StaticRangeTypeField();

    /**
     * Percentage of static range
     */
    private final OrderStaticRangeField orderStaticRange = new OrderStaticRangeField();

    /**
     * Static range for parametrised blocks
     */
    private final BlockStaticRangeField blockStaticRange = new BlockStaticRangeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, securityCode, transactionDateAndTime, referencePrice, staticPrice, dynamicPriceOscilationPercentage, dynamicRangeMultiplier, auctionTriggerPrice, auctionEndTime, liquidativeValueDate, bonusWarrantsWithActiveBonus, securityTradingStatus, auctionOrigin, nonAvailabilityReason, exemptionSituation, blockOscilationPercentage, highLimitPrice, lowLimitPrice, liquidativeValue, staticRangeType, orderStaticRange, blockStaticRange);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     *
     * @return the TransactionDateAndTime field
     */
    public TransactionDateAndTimeField transactionDateAndTime() {
        return transactionDateAndTime;
    }

    /**
     * Reference price
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * Static Price
     *
     * @return the StaticPrice field
     */
    public StaticPriceField staticPrice() {
        return staticPrice;
    }

    /**
     * Percentage of dynamic range
     *
     * @return the DynamicPriceOscilationPercentage field
     */
    public DynamicPriceOscilationPercentageField dynamicPriceOscilationPercentage() {
        return dynamicPriceOscilationPercentage;
    }

    /**
     * Dynamic Range Multiplier
     *
     * @return the DynamicRangeMultiplier field
     */
    public DynamicRangeMultiplierField dynamicRangeMultiplier() {
        return dynamicRangeMultiplier;
    }

    /**
     * Auction Trigger Price
     *
     * @return the AuctionTriggerPrice field
     */
    public AuctionTriggerPriceField auctionTriggerPrice() {
        return auctionTriggerPrice;
    }

    /**
     * Actual UTC time for the end of the auction
     *
     * @return the AuctionEndTime field
     */
    public AuctionEndTimeField auctionEndTime() {
        return auctionEndTime;
    }

    /**
     * Date of the Net Asset Value
     *
     * @return the LiquidativeValueDate field
     */
    public LiquidativeValueDateField liquidativeValueDate() {
        return liquidativeValueDate;
    }

    /**
     * Indicates whether the bonus is active or not (bonus)
     *
     * @return the BonusWarrantsWithActiveBonus field
     */
    public BonusWarrantsWithActiveBonusField bonusWarrantsWithActiveBonus() {
        return bonusWarrantsWithActiveBonus;
    }

    /**
     * Security Trading Status
     *
     * @return the SecurityTradingStatus field
     */
    public SecurityTradingStatusField securityTradingStatus() {
        return securityTradingStatus;
    }

    /**
     * Auction type
     *
     * @return the AuctionOrigin field
     */
    public AuctionOriginField auctionOrigin() {
        return auctionOrigin;
    }

    /**
     * Reason security halted
     *
     * @return the NonAvailabilityReason field
     */
    public NonAvailabilityReasonField nonAvailabilityReason() {
        return nonAvailabilityReason;
    }

    /**
     * Type of exemption
     *
     * @return the ExemptionSituation field
     */
    public ExemptionSituationField exemptionSituation() {
        return exemptionSituation;
    }

    /**
     * Price fluctuation on bid/ask spread midpoint for agreed blocks
     *
     * @return the BlockOscilationPercentage field
     */
    public BlockOscilationPercentageField blockOscilationPercentage() {
        return blockOscilationPercentage;
    }

    /**
     * High limit price
     *
     * @return the HighLimitPrice field
     */
    public HighLimitPriceField highLimitPrice() {
        return highLimitPrice;
    }

    /**
     * Low limit price
     *
     * @return the LowLimitPrice field
     */
    public LowLimitPriceField lowLimitPrice() {
        return lowLimitPrice;
    }

    /**
     * Net Asset Value
     *
     * @return the LiquidativeValue field
     */
    public LiquidativeValueField liquidativeValue() {
        return liquidativeValue;
    }

    /**
     * Static range type
     *
     * @return the StaticRangeType field
     */
    public StaticRangeTypeField staticRangeType() {
        return staticRangeType;
    }

    /**
     * Percentage of static range
     *
     * @return the OrderStaticRange field
     */
    public OrderStaticRangeField orderStaticRange() {
        return orderStaticRange;
    }

    /**
     * Static range for parametrised blocks
     *
     * @return the BlockStaticRange field
     */
    public BlockStaticRangeField blockStaticRange() {
        return blockStaticRange;
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
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactionDateAndTime.value());
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!transactionDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionDateAndTimeField.BYTE_LENGTH;
        if (!referencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceField.BYTE_LENGTH;
        if (!staticPrice.parse(data, cursor)) {
            return false;
        }
        cursor += StaticPriceField.BYTE_LENGTH;
        if (!dynamicPriceOscilationPercentage.parse(data, cursor)) {
            return false;
        }
        cursor += DynamicPriceOscilationPercentageField.BYTE_LENGTH;
        if (!dynamicRangeMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += DynamicRangeMultiplierField.BYTE_LENGTH;
        if (!auctionTriggerPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTriggerPriceField.BYTE_LENGTH;
        if (!auctionEndTime.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionEndTimeField.BYTE_LENGTH;
        if (!liquidativeValueDate.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidativeValueDateField.BYTE_LENGTH;
        if (!bonusWarrantsWithActiveBonus.parse(data, cursor)) {
            return false;
        }
        cursor += BonusWarrantsWithActiveBonusField.BYTE_LENGTH;
        if (!securityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingStatusField.BYTE_LENGTH;
        if (!auctionOrigin.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionOriginField.BYTE_LENGTH;
        if (!nonAvailabilityReason.parse(data, cursor)) {
            return false;
        }
        cursor += NonAvailabilityReasonField.BYTE_LENGTH;
        if (!exemptionSituation.parse(data, cursor)) {
            return false;
        }
        cursor += ExemptionSituationField.BYTE_LENGTH;
        if (!blockOscilationPercentage.parse(data, cursor)) {
            return false;
        }
        cursor += BlockOscilationPercentageField.BYTE_LENGTH;
        if (!highLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPriceField.BYTE_LENGTH;
        if (!lowLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowLimitPriceField.BYTE_LENGTH;
        if (!liquidativeValue.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidativeValueField.BYTE_LENGTH;
        if (!staticRangeType.parse(data, cursor)) {
            return false;
        }
        cursor += StaticRangeTypeField.BYTE_LENGTH;
        if (!orderStaticRange.parse(data, cursor)) {
            return false;
        }
        cursor += OrderStaticRangeField.BYTE_LENGTH;
        return blockStaticRange.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = transactionDateAndTime.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = staticPrice.encode(data, cursor);
        cursor = dynamicPriceOscilationPercentage.encode(data, cursor);
        cursor = dynamicRangeMultiplier.encode(data, cursor);
        cursor = auctionTriggerPrice.encode(data, cursor);
        cursor = auctionEndTime.encode(data, cursor);
        cursor = liquidativeValueDate.encode(data, cursor);
        cursor = bonusWarrantsWithActiveBonus.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = auctionOrigin.encode(data, cursor);
        cursor = nonAvailabilityReason.encode(data, cursor);
        cursor = exemptionSituation.encode(data, cursor);
        cursor = blockOscilationPercentage.encode(data, cursor);
        cursor = highLimitPrice.encode(data, cursor);
        cursor = lowLimitPrice.encode(data, cursor);
        cursor = liquidativeValue.encode(data, cursor);
        cursor = staticRangeType.encode(data, cursor);
        cursor = orderStaticRange.encode(data, cursor);
        cursor = blockStaticRange.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "SecurityCode" -> Optional.of(securityCode);
            case "TransactionDateAndTime" -> Optional.of(transactionDateAndTime);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "StaticPrice" -> Optional.of(staticPrice);
            case "DynamicPriceOscilationPercentage" -> Optional.of(dynamicPriceOscilationPercentage);
            case "DynamicRangeMultiplier" -> Optional.of(dynamicRangeMultiplier);
            case "AuctionTriggerPrice" -> Optional.of(auctionTriggerPrice);
            case "AuctionEndTime" -> Optional.of(auctionEndTime);
            case "LiquidativeValueDate" -> Optional.of(liquidativeValueDate);
            case "BonusWarrantsWithActiveBonus" -> Optional.of(bonusWarrantsWithActiveBonus);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            case "AuctionOrigin" -> Optional.of(auctionOrigin);
            case "NonAvailabilityReason" -> Optional.of(nonAvailabilityReason);
            case "ExemptionSituation" -> Optional.of(exemptionSituation);
            case "BlockOscilationPercentage" -> Optional.of(blockOscilationPercentage);
            case "HighLimitPrice" -> Optional.of(highLimitPrice);
            case "LowLimitPrice" -> Optional.of(lowLimitPrice);
            case "LiquidativeValue" -> Optional.of(liquidativeValue);
            case "StaticRangeType" -> Optional.of(staticRangeType);
            case "OrderStaticRange" -> Optional.of(orderStaticRange);
            case "BlockStaticRange" -> Optional.of(blockStaticRange);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityStatusMessage message)) {
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
        if (!(other instanceof SecurityStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
