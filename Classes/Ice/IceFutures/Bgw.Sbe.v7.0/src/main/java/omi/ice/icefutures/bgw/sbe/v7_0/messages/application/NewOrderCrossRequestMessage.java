package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.BenchMarkPriceTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.BenchmarkPriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.BypassMqrField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CrossIDIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CrossTypeCrossTypeEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExecInstField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.HedgeOnlyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrdTypeOrderTypeEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrderQtyDecimalField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OriginatorUserIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.PriceDecimalField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.PriceTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SymbolIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TimeInForceTimeInForceEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TradeTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TransactDetailsField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TransactTimeUtcTimestampField;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.NewOrderCrossRequestMessageNoLegsGroups;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.NewOrderCrossRequestMessageNoSidesGroups;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the NewOrderCrossRequestMessage message from the Bgw protocol.
 *
 * <p>NewOrderCrossRequestMessage</p>
 */
public final class NewOrderCrossRequestMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 183;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Cross Request Message";

    /**
     * price
     */
    private final PriceDecimalField priceDecimal = new PriceDecimalField();

    /**
     * orderQty
     */
    private final OrderQtyDecimalField orderQtyDecimal = new OrderQtyDecimalField();

    /**
     * symbol
     */
    private final SymbolIntField symbolInt = new SymbolIntField();

    /**
     * originatorUserID
     */
    private final OriginatorUserIdField originatorUserId = new OriginatorUserIdField();

    /**
     * ordType
     */
    private final OrdTypeOrderTypeEnumField ordTypeOrderTypeEnum = new OrdTypeOrderTypeEnumField();

    /**
     * crossID
     */
    private final CrossIDIntField crossIDInt = new CrossIDIntField();

    /**
     * crossType
     */
    private final CrossTypeCrossTypeEnumField crossTypeCrossTypeEnum = new CrossTypeCrossTypeEnumField();

    /**
     * tradeType
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * execInst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * priceType
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * bypassMQR
     */
    private final BypassMqrField bypassMqr = new BypassMqrField();

    /**
     * hedgeOnly
     */
    private final HedgeOnlyField hedgeOnly = new HedgeOnlyField();

    /**
     * benchmarkPrice
     */
    private final BenchmarkPriceField benchmarkPrice = new BenchmarkPriceField();

    /**
     * benchMarkPriceType
     */
    private final BenchMarkPriceTypeField benchMarkPriceType = new BenchMarkPriceTypeField();

    /**
     * timeInForce
     */
    private final TimeInForceTimeInForceEnumField timeInForceTimeInForceEnum = new TimeInForceTimeInForceEnumField();

    /**
     * transactDetails
     */
    private final TransactDetailsField transactDetails = new TransactDetailsField();

    /**
     * transactTime
     */
    private final TransactTimeUtcTimestampField transactTimeUtcTimestamp = new TransactTimeUtcTimestampField();

    /**
     * noSides Block
     */
    private final NewOrderCrossRequestMessageNoSidesGroups newOrderCrossRequestMessageNoSidesGroups = new NewOrderCrossRequestMessageNoSidesGroups();

    /**
     * noLegs Block
     */
    private final NewOrderCrossRequestMessageNoLegsGroups newOrderCrossRequestMessageNoLegsGroups = new NewOrderCrossRequestMessageNoLegsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(priceDecimal, orderQtyDecimal, symbolInt, originatorUserId, ordTypeOrderTypeEnum, crossIDInt, crossTypeCrossTypeEnum, tradeType, execInst, priceType, bypassMqr, hedgeOnly, benchmarkPrice, benchMarkPriceType, timeInForceTimeInForceEnum, transactDetails, transactTimeUtcTimestamp);

    private byte[] buffer;

    private boolean decoded;

    /**
     * price
     *
     * @return the PriceDecimal field
     */
    public PriceDecimalField priceDecimal() {
        return priceDecimal;
    }

    /**
     * orderQty
     *
     * @return the OrderQtyDecimal field
     */
    public OrderQtyDecimalField orderQtyDecimal() {
        return orderQtyDecimal;
    }

    /**
     * symbol
     *
     * @return the SymbolInt field
     */
    public SymbolIntField symbolInt() {
        return symbolInt;
    }

    /**
     * originatorUserID
     *
     * @return the OriginatorUserId field
     */
    public OriginatorUserIdField originatorUserId() {
        return originatorUserId;
    }

    /**
     * ordType
     *
     * @return the OrdTypeOrderTypeEnum field
     */
    public OrdTypeOrderTypeEnumField ordTypeOrderTypeEnum() {
        return ordTypeOrderTypeEnum;
    }

    /**
     * crossID
     *
     * @return the CrossIDInt field
     */
    public CrossIDIntField crossIDInt() {
        return crossIDInt;
    }

    /**
     * crossType
     *
     * @return the CrossTypeCrossTypeEnum field
     */
    public CrossTypeCrossTypeEnumField crossTypeCrossTypeEnum() {
        return crossTypeCrossTypeEnum;
    }

    /**
     * tradeType
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * execInst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * priceType
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
    }

    /**
     * bypassMQR
     *
     * @return the BypassMqr field
     */
    public BypassMqrField bypassMqr() {
        return bypassMqr;
    }

    /**
     * hedgeOnly
     *
     * @return the HedgeOnly field
     */
    public HedgeOnlyField hedgeOnly() {
        return hedgeOnly;
    }

    /**
     * benchmarkPrice
     *
     * @return the BenchmarkPrice field
     */
    public BenchmarkPriceField benchmarkPrice() {
        return benchmarkPrice;
    }

    /**
     * benchMarkPriceType
     *
     * @return the BenchMarkPriceType field
     */
    public BenchMarkPriceTypeField benchMarkPriceType() {
        return benchMarkPriceType;
    }

    /**
     * timeInForce
     *
     * @return the TimeInForceTimeInForceEnum field
     */
    public TimeInForceTimeInForceEnumField timeInForceTimeInForceEnum() {
        return timeInForceTimeInForceEnum;
    }

    /**
     * transactDetails
     *
     * @return the TransactDetails field
     */
    public TransactDetailsField transactDetails() {
        return transactDetails;
    }

    /**
     * transactTime
     *
     * @return the TransactTimeUtcTimestamp field
     */
    public TransactTimeUtcTimestampField transactTimeUtcTimestamp() {
        return transactTimeUtcTimestamp;
    }

    /**
     * noSides Block
     *
     * @return the NewOrderCrossRequestMessageNoSidesGroups record
     */
    public NewOrderCrossRequestMessageNoSidesGroups newOrderCrossRequestMessageNoSidesGroups() {
        return newOrderCrossRequestMessageNoSidesGroups;
    }

    /**
     * noLegs Block
     *
     * @return the NewOrderCrossRequestMessageNoLegsGroups record
     */
    public NewOrderCrossRequestMessageNoLegsGroups newOrderCrossRequestMessageNoLegsGroups() {
        return newOrderCrossRequestMessageNoLegsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + newOrderCrossRequestMessageNoSidesGroups.byteLength() - NewOrderCrossRequestMessageNoSidesGroups.MINIMUM_BYTE_LENGTH + newOrderCrossRequestMessageNoLegsGroups.byteLength() - NewOrderCrossRequestMessageNoLegsGroups.MINIMUM_BYTE_LENGTH;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!priceDecimal.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDecimalField.BYTE_LENGTH;
        if (!orderQtyDecimal.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyDecimalField.BYTE_LENGTH;
        if (!symbolInt.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIntField.BYTE_LENGTH;
        if (!originatorUserId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatorUserIdField.BYTE_LENGTH;
        if (!ordTypeOrderTypeEnum.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeOrderTypeEnumField.BYTE_LENGTH;
        if (!crossIDInt.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIDIntField.BYTE_LENGTH;
        if (!crossTypeCrossTypeEnum.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeCrossTypeEnumField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!priceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeField.BYTE_LENGTH;
        if (!bypassMqr.parse(data, cursor)) {
            return false;
        }
        cursor += BypassMqrField.BYTE_LENGTH;
        if (!hedgeOnly.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeOnlyField.BYTE_LENGTH;
        if (!benchmarkPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BenchmarkPriceField.BYTE_LENGTH;
        if (!benchMarkPriceType.parse(data, cursor)) {
            return false;
        }
        cursor += BenchMarkPriceTypeField.BYTE_LENGTH;
        if (!timeInForceTimeInForceEnum.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceTimeInForceEnumField.BYTE_LENGTH;
        if (!transactDetails.parse(data, cursor)) {
            return false;
        }
        cursor += TransactDetailsField.BYTE_LENGTH;
        if (!transactTimeUtcTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeUtcTimestampField.BYTE_LENGTH;
        if (!newOrderCrossRequestMessageNoSidesGroups.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += newOrderCrossRequestMessageNoSidesGroups.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!newOrderCrossRequestMessageNoLegsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += newOrderCrossRequestMessageNoLegsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = priceDecimal.encode(data, cursor);
        cursor = orderQtyDecimal.encode(data, cursor);
        cursor = symbolInt.encode(data, cursor);
        cursor = originatorUserId.encode(data, cursor);
        cursor = ordTypeOrderTypeEnum.encode(data, cursor);
        cursor = crossIDInt.encode(data, cursor);
        cursor = crossTypeCrossTypeEnum.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        cursor = bypassMqr.encode(data, cursor);
        cursor = hedgeOnly.encode(data, cursor);
        cursor = benchmarkPrice.encode(data, cursor);
        cursor = benchMarkPriceType.encode(data, cursor);
        cursor = timeInForceTimeInForceEnum.encode(data, cursor);
        cursor = transactDetails.encode(data, cursor);
        cursor = transactTimeUtcTimestamp.encode(data, cursor);
        cursor = newOrderCrossRequestMessageNoSidesGroups.encode(data, cursor);
        cursor = newOrderCrossRequestMessageNoLegsGroups.encode(data, cursor);
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
        newOrderCrossRequestMessageNoSidesGroups.clear();
        newOrderCrossRequestMessageNoLegsGroups.clear();
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
        if (!newOrderCrossRequestMessageNoSidesGroups.isRecognized()) {
            return false;
        }
        return newOrderCrossRequestMessageNoLegsGroups.isRecognized();
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
        if (!newOrderCrossRequestMessageNoSidesGroups.isValid()) {
            return false;
        }
        if (!newOrderCrossRequestMessageNoLegsGroups.isValid()) {
            return false;
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
        if (!priceDecimal.isDecoded()) {
            return Optional.of(priceDecimal);
        }
        if (!orderQtyDecimal.isDecoded()) {
            return Optional.of(orderQtyDecimal);
        }
        if (!symbolInt.isDecoded()) {
            return Optional.of(symbolInt);
        }
        if (!originatorUserId.isDecoded()) {
            return Optional.of(originatorUserId);
        }
        if (!ordTypeOrderTypeEnum.isDecoded()) {
            return Optional.of(ordTypeOrderTypeEnum);
        }
        if (!crossIDInt.isDecoded()) {
            return Optional.of(crossIDInt);
        }
        if (!crossTypeCrossTypeEnum.isDecoded()) {
            return Optional.of(crossTypeCrossTypeEnum);
        }
        if (!tradeType.isDecoded()) {
            return Optional.of(tradeType);
        }
        if (!execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (!priceType.isDecoded()) {
            return Optional.of(priceType);
        }
        if (!bypassMqr.isDecoded()) {
            return Optional.of(bypassMqr);
        }
        if (!hedgeOnly.isDecoded()) {
            return Optional.of(hedgeOnly);
        }
        if (!benchmarkPrice.isDecoded()) {
            return Optional.of(benchmarkPrice);
        }
        if (!benchMarkPriceType.isDecoded()) {
            return Optional.of(benchMarkPriceType);
        }
        if (!timeInForceTimeInForceEnum.isDecoded()) {
            return Optional.of(timeInForceTimeInForceEnum);
        }
        if (!transactDetails.isDecoded()) {
            return Optional.of(transactDetails);
        }
        if (!transactTimeUtcTimestamp.isDecoded()) {
            return Optional.of(transactTimeUtcTimestamp);
        }
        if (!newOrderCrossRequestMessageNoSidesGroups.isDecoded()) {
            return newOrderCrossRequestMessageNoSidesGroups.failedAt();
        }
        if (!newOrderCrossRequestMessageNoLegsGroups.isDecoded()) {
            return newOrderCrossRequestMessageNoLegsGroups.failedAt();
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
            case "PriceDecimal" -> Optional.of(priceDecimal);
            case "OrderQtyDecimal" -> Optional.of(orderQtyDecimal);
            case "SymbolInt" -> Optional.of(symbolInt);
            case "OriginatorUserId" -> Optional.of(originatorUserId);
            case "OrdTypeOrderTypeEnum" -> Optional.of(ordTypeOrderTypeEnum);
            case "CrossIDInt" -> Optional.of(crossIDInt);
            case "CrossTypeCrossTypeEnum" -> Optional.of(crossTypeCrossTypeEnum);
            case "TradeType" -> Optional.of(tradeType);
            case "ExecInst" -> Optional.of(execInst);
            case "PriceType" -> Optional.of(priceType);
            case "BypassMqr" -> Optional.of(bypassMqr);
            case "HedgeOnly" -> Optional.of(hedgeOnly);
            case "BenchmarkPrice" -> Optional.of(benchmarkPrice);
            case "BenchMarkPriceType" -> Optional.of(benchMarkPriceType);
            case "TimeInForceTimeInForceEnum" -> Optional.of(timeInForceTimeInForceEnum);
            case "TransactDetails" -> Optional.of(transactDetails);
            case "TransactTimeUtcTimestamp" -> Optional.of(transactTimeUtcTimestamp);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderCrossRequestMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(newOrderCrossRequestMessageNoSidesGroups.diffFields(message.newOrderCrossRequestMessageNoSidesGroups));
        changed.addAll(newOrderCrossRequestMessageNoLegsGroups.diffFields(message.newOrderCrossRequestMessageNoLegsGroups));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            newOrderCrossRequestMessageNoSidesGroups.toFormattedString(builder, options);
            builder.append(", ");
            newOrderCrossRequestMessageNoLegsGroups.toFormattedString(builder, options);
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
        newOrderCrossRequestMessageNoSidesGroups.toFormattedString(builder, nested);
        newOrderCrossRequestMessageNoLegsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof NewOrderCrossRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && newOrderCrossRequestMessageNoSidesGroups.equals(message.newOrderCrossRequestMessageNoSidesGroups) && newOrderCrossRequestMessageNoLegsGroups.equals(message.newOrderCrossRequestMessageNoLegsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, newOrderCrossRequestMessageNoSidesGroups, newOrderCrossRequestMessageNoLegsGroups);
    }
}
