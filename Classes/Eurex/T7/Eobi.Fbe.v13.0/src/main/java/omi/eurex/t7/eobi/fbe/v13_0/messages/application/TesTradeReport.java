package omi.eurex.t7.eobi.fbe.v13_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v13_0.fields.LastPxField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.LastQtyField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.MultiLegPriceModelField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.MultiLegReportingTypeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.NonDisclosedTradeVolumeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.NumberOfBuySidesField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.NumberOfSellSidesField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityIdField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TradeConditionField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TransBkdTimeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TransactTimeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TrdMatchIdField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TrdTypeField;
import omi.eurex.t7.eobi.fbe.v13_0.types.Field;
import omi.eurex.t7.eobi.fbe.v13_0.types.Message;
import omi.eurex.t7.eobi.fbe.v13_0.types.PrintOptions;

/**
 * Represents the TesTradeReport message from the Eobi protocol.
 */
public final class TesTradeReport implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 72;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tes Trade Report";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 42, 6, 68, 4 };

    /**
     * Unique instrument identifier
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Total executed matched quantity of this match event
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Trd Match Id
     */
    private final TrdMatchIdField trdMatchId = new TrdMatchIdField();

    /**
     * Trd Type
     */
    private final TrdTypeField trdType = new TrdTypeField();

    /**
     * Trade Condition
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * Multi Leg Reporting Type
     */
    private final MultiLegReportingTypeField multiLegReportingType = new MultiLegReportingTypeField();

    /**
     * Multi Leg Price Model
     */
    private final MultiLegPriceModelField multiLegPriceModel = new MultiLegPriceModelField();

    /**
     * Non Disclosed Trade Volume
     */
    private final NonDisclosedTradeVolumeField nonDisclosedTradeVolume = new NonDisclosedTradeVolumeField();

    /**
     * Trans Bkd Time
     */
    private final TransBkdTimeField transBkdTime = new TransBkdTimeField();

    /**
     * Number Of Buy Sides
     */
    private final NumberOfBuySidesField numberOfBuySides = new NumberOfBuySidesField();

    /**
     * Number Of Sell Sides
     */
    private final NumberOfSellSidesField numberOfSellSides = new NumberOfSellSidesField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, transactTime, lastQty, lastPx, trdMatchId, trdType, tradeCondition, multiLegReportingType, multiLegPriceModel, nonDisclosedTradeVolume, transBkdTime, numberOfBuySides, numberOfSellSides);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique instrument identifier
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Total executed matched quantity of this match event
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Trd Match Id
     *
     * @return the TrdMatchId field
     */
    public TrdMatchIdField trdMatchId() {
        return trdMatchId;
    }

    /**
     * Trd Type
     *
     * @return the TrdType field
     */
    public TrdTypeField trdType() {
        return trdType;
    }

    /**
     * Trade Condition
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
    }

    /**
     * Multi Leg Reporting Type
     *
     * @return the MultiLegReportingType field
     */
    public MultiLegReportingTypeField multiLegReportingType() {
        return multiLegReportingType;
    }

    /**
     * Multi Leg Price Model
     *
     * @return the MultiLegPriceModel field
     */
    public MultiLegPriceModelField multiLegPriceModel() {
        return multiLegPriceModel;
    }

    /**
     * Non Disclosed Trade Volume
     *
     * @return the NonDisclosedTradeVolume field
     */
    public NonDisclosedTradeVolumeField nonDisclosedTradeVolume() {
        return nonDisclosedTradeVolume;
    }

    /**
     * Trans Bkd Time
     *
     * @return the TransBkdTime field
     */
    public TransBkdTimeField transBkdTime() {
        return transBkdTime;
    }

    /**
     * Number Of Buy Sides
     *
     * @return the NumberOfBuySides field
     */
    public NumberOfBuySidesField numberOfBuySides() {
        return numberOfBuySides;
    }

    /**
     * Number Of Sell Sides
     *
     * @return the NumberOfSellSides field
     */
    public NumberOfSellSidesField numberOfSellSides() {
        return numberOfSellSides;
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
        return Optional.ofNullable(transactTime.value());
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!trdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += TrdMatchIdField.BYTE_LENGTH;
        if (!trdType.parse(data, cursor)) {
            return false;
        }
        cursor += TrdTypeField.BYTE_LENGTH;
        if (!tradeCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradeConditionField.BYTE_LENGTH;
        if (!multiLegReportingType.parse(data, cursor)) {
            return false;
        }
        cursor += MultiLegReportingTypeField.BYTE_LENGTH;
        if (!multiLegPriceModel.parse(data, cursor)) {
            return false;
        }
        cursor += MultiLegPriceModelField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!nonDisclosedTradeVolume.parse(data, cursor)) {
            return false;
        }
        cursor += NonDisclosedTradeVolumeField.BYTE_LENGTH;
        if (!transBkdTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransBkdTimeField.BYTE_LENGTH;
        if (!numberOfBuySides.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfBuySidesField.BYTE_LENGTH;
        if (!numberOfSellSides.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfSellSidesField.BYTE_LENGTH;
        cursor += 4; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = trdMatchId.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = tradeCondition.encode(data, cursor);
        cursor = multiLegReportingType.encode(data, cursor);
        cursor = multiLegPriceModel.encode(data, cursor);
        if (buffer != null && buffer.length >= 42 + 6) {
            System.arraycopy(buffer, 42, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = nonDisclosedTradeVolume.encode(data, cursor);
        cursor = transBkdTime.encode(data, cursor);
        cursor = numberOfBuySides.encode(data, cursor);
        cursor = numberOfSellSides.encode(data, cursor);
        if (buffer != null && buffer.length >= 68 + 4) {
            System.arraycopy(buffer, 68, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
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
            case "SecurityId" -> Optional.of(securityId);
            case "TransactTime" -> Optional.of(transactTime);
            case "LastQty" -> Optional.of(lastQty);
            case "LastPx" -> Optional.of(lastPx);
            case "TrdMatchId" -> Optional.of(trdMatchId);
            case "TrdType" -> Optional.of(trdType);
            case "TradeCondition" -> Optional.of(tradeCondition);
            case "MultiLegReportingType" -> Optional.of(multiLegReportingType);
            case "MultiLegPriceModel" -> Optional.of(multiLegPriceModel);
            case "NonDisclosedTradeVolume" -> Optional.of(nonDisclosedTradeVolume);
            case "TransBkdTime" -> Optional.of(transBkdTime);
            case "NumberOfBuySides" -> Optional.of(numberOfBuySides);
            case "NumberOfSellSides" -> Optional.of(numberOfSellSides);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TesTradeReport message)) {
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
        if (!(other instanceof TesTradeReport message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
