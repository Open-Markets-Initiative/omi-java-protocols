package omi.ice.icefutures.mdf.impact.v1_1_33.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.AggressorSideField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.ExtraFlagsField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IsAdjustedTradeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IsImpliedSpreadAtMarketOpenField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IsSystemPricedLegField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OffMarketTradeIndicatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OffMarketTradeTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.PriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.QuantityField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.SequenceWithinMillisField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.SystemPricedLegTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.TradeIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.TransactDateTimeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.PrintOptions;

/**
 * Represents the TradeMessage message from the Mdf protocol.
 *
 * <p>A trade with IsSystemPricedLeg equal to ‘Y’ should not be used for the last price, High, Low and Open. Also please refer to Appendix B on how to handle market stats for given OffTradeMarketType. This message will not be sent for trades in Endex Spot markets.</p>
 */
public final class TradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'G';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 46;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Unique identifier of the trade message, unique per market.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Indicate if it is a system priced leg, ‘Y’ or ‘N’
     */
    private final IsSystemPricedLegField isSystemPricedLeg = new IsSystemPricedLegField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final PriceField price = new PriceField();

    /**
     * Quantity
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Legacy field that supports all single character trade types on ICE. The new 3-character “OffMarketTradeType” field replaces this field. In the future (no earlier than 2015), ICE anticipates the introduction of 3 character trade types that will only be available in the new field. Trade types that are longer than a single character will be represented with “#” in this field.
     */
    private final OffMarketTradeIndicatorField offMarketTradeIndicator = new OffMarketTradeIndicatorField();

    /**
     * Deal date time
     */
    private final TransactDateTimeField transactDateTime = new TransactDateTimeField();

    /**
     * System Priced Leg Type
     */
    private final SystemPricedLegTypeField systemPricedLegType = new SystemPricedLegTypeField();

    /**
     * Indicate if the trade happens at market open due to spread implied. When set to ‘Y’, such deal should not be included in market stats.
     */
    private final IsImpliedSpreadAtMarketOpenField isImpliedSpreadAtMarketOpen = new IsImpliedSpreadAtMarketOpenField();

    /**
     * Indicate if the trade is an adjusted trade, ‘Y’ or ‘N’
     */
    private final IsAdjustedTradeField isAdjustedTrade = new IsAdjustedTradeField();

    /**
     * Aggressor Side
     */
    private final AggressorSideField aggressorSide = new AggressorSideField();

    /**
     * Flags
     */
    private final ExtraFlagsField extraFlags = new ExtraFlagsField();

    /**
     * Only for off market trade. The first character is ‘ ‘ when it is a regular trade. One or two null characters (‘\0’) will be appended to the end of this field when applicable.
     */
    private final OffMarketTradeTypeField offMarketTradeType = new OffMarketTradeTypeField();

    /**
     * Can be used in conjunction with TransactDateTime field for sequence of deals within same milliseconds time.
     */
    private final SequenceWithinMillisField sequenceWithinMillis = new SequenceWithinMillisField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, tradeId, isSystemPricedLeg, price, quantity, offMarketTradeIndicator, transactDateTime, systemPricedLegType, isImpliedSpreadAtMarketOpen, isAdjustedTrade, aggressorSide, extraFlags, offMarketTradeType, sequenceWithinMillis);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Unique identifier of the trade message, unique per market.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Indicate if it is a system priced leg, ‘Y’ or ‘N’
     *
     * @return the IsSystemPricedLeg field
     */
    public IsSystemPricedLegField isSystemPricedLeg() {
        return isSystemPricedLeg;
    }

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Quantity
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Legacy field that supports all single character trade types on ICE. The new 3-character “OffMarketTradeType” field replaces this field. In the future (no earlier than 2015), ICE anticipates the introduction of 3 character trade types that will only be available in the new field. Trade types that are longer than a single character will be represented with “#” in this field.
     *
     * @return the OffMarketTradeIndicator field
     */
    public OffMarketTradeIndicatorField offMarketTradeIndicator() {
        return offMarketTradeIndicator;
    }

    /**
     * Deal date time
     *
     * @return the TransactDateTime field
     */
    public TransactDateTimeField transactDateTime() {
        return transactDateTime;
    }

    /**
     * System Priced Leg Type
     *
     * @return the SystemPricedLegType field
     */
    public SystemPricedLegTypeField systemPricedLegType() {
        return systemPricedLegType;
    }

    /**
     * Indicate if the trade happens at market open due to spread implied. When set to ‘Y’, such deal should not be included in market stats.
     *
     * @return the IsImpliedSpreadAtMarketOpen field
     */
    public IsImpliedSpreadAtMarketOpenField isImpliedSpreadAtMarketOpen() {
        return isImpliedSpreadAtMarketOpen;
    }

    /**
     * Indicate if the trade is an adjusted trade, ‘Y’ or ‘N’
     *
     * @return the IsAdjustedTrade field
     */
    public IsAdjustedTradeField isAdjustedTrade() {
        return isAdjustedTrade;
    }

    /**
     * Aggressor Side
     *
     * @return the AggressorSide field
     */
    public AggressorSideField aggressorSide() {
        return aggressorSide;
    }

    /**
     * Flags
     *
     * @return the ExtraFlags field
     */
    public ExtraFlagsField extraFlags() {
        return extraFlags;
    }

    /**
     * Only for off market trade. The first character is ‘ ‘ when it is a regular trade. One or two null characters (‘\0’) will be appended to the end of this field when applicable.
     *
     * @return the OffMarketTradeType field
     */
    public OffMarketTradeTypeField offMarketTradeType() {
        return offMarketTradeType;
    }

    /**
     * Can be used in conjunction with TransactDateTime field for sequence of deals within same milliseconds time.
     *
     * @return the SequenceWithinMillis field
     */
    public SequenceWithinMillisField sequenceWithinMillis() {
        return sequenceWithinMillis;
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
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!isSystemPricedLeg.parse(data, cursor)) {
            return false;
        }
        cursor += IsSystemPricedLegField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!offMarketTradeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OffMarketTradeIndicatorField.BYTE_LENGTH;
        if (!transactDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactDateTimeField.BYTE_LENGTH;
        if (!systemPricedLegType.parse(data, cursor)) {
            return false;
        }
        cursor += SystemPricedLegTypeField.BYTE_LENGTH;
        if (!isImpliedSpreadAtMarketOpen.parse(data, cursor)) {
            return false;
        }
        cursor += IsImpliedSpreadAtMarketOpenField.BYTE_LENGTH;
        if (!isAdjustedTrade.parse(data, cursor)) {
            return false;
        }
        cursor += IsAdjustedTradeField.BYTE_LENGTH;
        if (!aggressorSide.parse(data, cursor)) {
            return false;
        }
        cursor += AggressorSideField.BYTE_LENGTH;
        if (!extraFlags.parse(data, cursor)) {
            return false;
        }
        cursor += ExtraFlagsField.BYTE_LENGTH;
        if (!offMarketTradeType.parse(data, cursor)) {
            return false;
        }
        cursor += OffMarketTradeTypeField.BYTE_LENGTH;
        return sequenceWithinMillis.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = isSystemPricedLeg.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = offMarketTradeIndicator.encode(data, cursor);
        cursor = transactDateTime.encode(data, cursor);
        cursor = systemPricedLegType.encode(data, cursor);
        cursor = isImpliedSpreadAtMarketOpen.encode(data, cursor);
        cursor = isAdjustedTrade.encode(data, cursor);
        cursor = aggressorSide.encode(data, cursor);
        cursor = extraFlags.encode(data, cursor);
        cursor = offMarketTradeType.encode(data, cursor);
        cursor = sequenceWithinMillis.encode(data, cursor);
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
            case "MarketId" -> Optional.of(marketId);
            case "TradeId" -> Optional.of(tradeId);
            case "IsSystemPricedLeg" -> Optional.of(isSystemPricedLeg);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "OffMarketTradeIndicator" -> Optional.of(offMarketTradeIndicator);
            case "TransactDateTime" -> Optional.of(transactDateTime);
            case "SystemPricedLegType" -> Optional.of(systemPricedLegType);
            case "IsImpliedSpreadAtMarketOpen" -> Optional.of(isImpliedSpreadAtMarketOpen);
            case "IsAdjustedTrade" -> Optional.of(isAdjustedTrade);
            case "AggressorSide" -> Optional.of(aggressorSide);
            case "ExtraFlags" -> Optional.of(extraFlags);
            case "OffMarketTradeType" -> Optional.of(offMarketTradeType);
            case "SequenceWithinMillis" -> Optional.of(sequenceWithinMillis);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
