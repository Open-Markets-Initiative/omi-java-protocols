package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClOrdIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClearingAccountString14NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClearingFirmInt32NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CrossIDInt64NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CrossTypeCrossTypeEnumNullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CumQtyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.DeliveryEndDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.DeliveryStartDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExecIDIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExecRefIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExecTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LastParPxField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LastPxField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LastSharesField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LeavesQtyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LinkExecIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MemoField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NoLegExecutionsField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NumOfLotsField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrdTypeOrderTypeEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrderIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OriginatorUserIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecondaryExecIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SideSideEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SymbolIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TradeFlagsField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TradeTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TransactTimeUtcTimestampField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.WaiverIndicatorField;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.OrigOrderId;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the ExecutionReportTradeMessage message from the Bgw protocol.
 *
 * <p>ExecutionReport_TradeMessage</p>
 */
public final class ExecutionReportTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 227;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Trade Message";

    /**
     * originatorUserID
     */
    private final OriginatorUserIdField originatorUserId = new OriginatorUserIdField();

    /**
     * execID
     */
    private final ExecIDIntField execIDInt = new ExecIDIntField();

    /**
     * clOrdID
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * symbol
     */
    private final SymbolIntField symbolInt = new SymbolIntField();

    /**
     * ordType
     */
    private final OrdTypeOrderTypeEnumField ordTypeOrderTypeEnum = new OrdTypeOrderTypeEnumField();

    /**
     * side
     */
    private final SideSideEnumField sideSideEnum = new SideSideEnumField();

    /**
     * orderID
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * leavesQty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * cumQty
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * lastPx
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * lastShares
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * transactTime
     */
    private final TransactTimeUtcTimestampField transactTimeUtcTimestamp = new TransactTimeUtcTimestampField();

    /**
     * numOfLots
     */
    private final NumOfLotsField numOfLots = new NumOfLotsField();

    /**
     * execType
     */
    private final ExecTypeField execType = new ExecTypeField();

    /**
     * TradeFlags bit set
     */
    private final TradeFlagsField tradeFlags = new TradeFlagsField();

    /**
     * clearingFirm
     */
    private final ClearingFirmInt32NullField clearingFirmInt32Null = new ClearingFirmInt32NullField();

    /**
     * clearingAccount
     */
    private final ClearingAccountString14NullField clearingAccountString14Null = new ClearingAccountString14NullField();

    /**
     * memo
     */
    private final MemoField memo = new MemoField();

    /**
     * execRefID
     */
    private final ExecRefIdField execRefId = new ExecRefIdField();

    /**
     * noLegExecutions
     */
    private final NoLegExecutionsField noLegExecutions = new NoLegExecutionsField();

    /**
     * secondaryExecID
     */
    private final SecondaryExecIdField secondaryExecId = new SecondaryExecIdField();

    /**
     * linkExecID
     */
    private final LinkExecIdField linkExecId = new LinkExecIdField();

    /**
     * lastParPx
     */
    private final LastParPxField lastParPx = new LastParPxField();

    /**
     * deliveryStartDate
     */
    private final DeliveryStartDateField deliveryStartDate = new DeliveryStartDateField();

    /**
     * deliveryEndDate
     */
    private final DeliveryEndDateField deliveryEndDate = new DeliveryEndDateField();

    /**
     * crossID
     */
    private final CrossIDInt64NullField crossIDInt64Null = new CrossIDInt64NullField();

    /**
     * crossType
     */
    private final CrossTypeCrossTypeEnumNullField crossTypeCrossTypeEnumNull = new CrossTypeCrossTypeEnumNullField();

    /**
     * waiverIndicator
     */
    private final WaiverIndicatorField waiverIndicator = new WaiverIndicatorField();

    /**
     * tradeType
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * ExecutionReport_NewMessage
     */
    private final OrigOrderId origOrderId = new OrigOrderId();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(originatorUserId), List.<Field>of(execIDInt), List.<Field>of(clOrdId), List.<Field>of(symbolInt), List.<Field>of(ordTypeOrderTypeEnum), List.<Field>of(sideSideEnum), List.<Field>of(orderId), origOrderId.fields(), List.<Field>of(leavesQty), List.<Field>of(cumQty), List.<Field>of(lastPx), List.<Field>of(lastShares), List.<Field>of(transactTimeUtcTimestamp), List.<Field>of(numOfLots), List.<Field>of(execType), List.<Field>of(tradeFlags), List.<Field>of(clearingFirmInt32Null), List.<Field>of(clearingAccountString14Null), List.<Field>of(memo), List.<Field>of(execRefId), List.<Field>of(noLegExecutions), List.<Field>of(secondaryExecId), List.<Field>of(linkExecId), List.<Field>of(lastParPx), List.<Field>of(deliveryStartDate), List.<Field>of(deliveryEndDate), List.<Field>of(crossIDInt64Null), List.<Field>of(crossTypeCrossTypeEnumNull), List.<Field>of(waiverIndicator), List.<Field>of(tradeType)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * originatorUserID
     *
     * @return the OriginatorUserId field
     */
    public OriginatorUserIdField originatorUserId() {
        return originatorUserId;
    }

    /**
     * execID
     *
     * @return the ExecIDInt field
     */
    public ExecIDIntField execIDInt() {
        return execIDInt;
    }

    /**
     * clOrdID
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * ordType
     *
     * @return the OrdTypeOrderTypeEnum field
     */
    public OrdTypeOrderTypeEnumField ordTypeOrderTypeEnum() {
        return ordTypeOrderTypeEnum;
    }

    /**
     * side
     *
     * @return the SideSideEnum field
     */
    public SideSideEnumField sideSideEnum() {
        return sideSideEnum;
    }

    /**
     * orderID
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * leavesQty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * cumQty
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
    }

    /**
     * lastPx
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * lastShares
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
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
     * numOfLots
     *
     * @return the NumOfLots field
     */
    public NumOfLotsField numOfLots() {
        return numOfLots;
    }

    /**
     * execType
     *
     * @return the ExecType field
     */
    public ExecTypeField execType() {
        return execType;
    }

    /**
     * TradeFlags bit set
     *
     * @return the TradeFlags field
     */
    public TradeFlagsField tradeFlags() {
        return tradeFlags;
    }

    /**
     * clearingFirm
     *
     * @return the ClearingFirmInt32Null field
     */
    public ClearingFirmInt32NullField clearingFirmInt32Null() {
        return clearingFirmInt32Null;
    }

    /**
     * clearingAccount
     *
     * @return the ClearingAccountString14Null field
     */
    public ClearingAccountString14NullField clearingAccountString14Null() {
        return clearingAccountString14Null;
    }

    /**
     * memo
     *
     * @return the Memo field
     */
    public MemoField memo() {
        return memo;
    }

    /**
     * execRefID
     *
     * @return the ExecRefId field
     */
    public ExecRefIdField execRefId() {
        return execRefId;
    }

    /**
     * noLegExecutions
     *
     * @return the NoLegExecutions field
     */
    public NoLegExecutionsField noLegExecutions() {
        return noLegExecutions;
    }

    /**
     * secondaryExecID
     *
     * @return the SecondaryExecId field
     */
    public SecondaryExecIdField secondaryExecId() {
        return secondaryExecId;
    }

    /**
     * linkExecID
     *
     * @return the LinkExecId field
     */
    public LinkExecIdField linkExecId() {
        return linkExecId;
    }

    /**
     * lastParPx
     *
     * @return the LastParPx field
     */
    public LastParPxField lastParPx() {
        return lastParPx;
    }

    /**
     * deliveryStartDate
     *
     * @return the DeliveryStartDate field
     */
    public DeliveryStartDateField deliveryStartDate() {
        return deliveryStartDate;
    }

    /**
     * deliveryEndDate
     *
     * @return the DeliveryEndDate field
     */
    public DeliveryEndDateField deliveryEndDate() {
        return deliveryEndDate;
    }

    /**
     * crossID
     *
     * @return the CrossIDInt64Null field
     */
    public CrossIDInt64NullField crossIDInt64Null() {
        return crossIDInt64Null;
    }

    /**
     * crossType
     *
     * @return the CrossTypeCrossTypeEnumNull field
     */
    public CrossTypeCrossTypeEnumNullField crossTypeCrossTypeEnumNull() {
        return crossTypeCrossTypeEnumNull;
    }

    /**
     * waiverIndicator
     *
     * @return the WaiverIndicator field
     */
    public WaiverIndicatorField waiverIndicator() {
        return waiverIndicator;
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
     * ExecutionReport_NewMessage
     *
     * @return the OrigOrderId record
     */
    public OrigOrderId origOrderId() {
        return origOrderId;
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
        if (!originatorUserId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatorUserIdField.BYTE_LENGTH;
        if (!execIDInt.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIDIntField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!symbolInt.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIntField.BYTE_LENGTH;
        if (!ordTypeOrderTypeEnum.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeOrderTypeEnumField.BYTE_LENGTH;
        if (!sideSideEnum.parse(data, cursor)) {
            return false;
        }
        cursor += SideSideEnumField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!origOrderId.parseFrom(data, cursor, end - 161)) {
            return false;
        }
        cursor += origOrderId.byteLength();
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!transactTimeUtcTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeUtcTimestampField.BYTE_LENGTH;
        if (!numOfLots.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfLotsField.BYTE_LENGTH;
        if (!execType.parse(data, cursor)) {
            return false;
        }
        cursor += ExecTypeField.BYTE_LENGTH;
        if (!tradeFlags.parse(data, cursor)) {
            return false;
        }
        cursor += TradeFlagsField.BYTE_LENGTH;
        if (!clearingFirmInt32Null.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmInt32NullField.BYTE_LENGTH;
        if (!clearingAccountString14Null.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountString14NullField.BYTE_LENGTH;
        if (!memo.parse(data, cursor)) {
            return false;
        }
        cursor += MemoField.BYTE_LENGTH;
        if (!execRefId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecRefIdField.BYTE_LENGTH;
        if (!noLegExecutions.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegExecutionsField.BYTE_LENGTH;
        if (!secondaryExecId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryExecIdField.BYTE_LENGTH;
        if (!linkExecId.parse(data, cursor)) {
            return false;
        }
        cursor += LinkExecIdField.BYTE_LENGTH;
        if (!lastParPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastParPxField.BYTE_LENGTH;
        if (!deliveryStartDate.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryStartDateField.BYTE_LENGTH;
        if (!deliveryEndDate.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryEndDateField.BYTE_LENGTH;
        if (!crossIDInt64Null.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIDInt64NullField.BYTE_LENGTH;
        if (!crossTypeCrossTypeEnumNull.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeCrossTypeEnumNullField.BYTE_LENGTH;
        if (!waiverIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += WaiverIndicatorField.BYTE_LENGTH;
        return tradeType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = originatorUserId.encode(data, cursor);
        cursor = execIDInt.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = symbolInt.encode(data, cursor);
        cursor = ordTypeOrderTypeEnum.encode(data, cursor);
        cursor = sideSideEnum.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = origOrderId.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = transactTimeUtcTimestamp.encode(data, cursor);
        cursor = numOfLots.encode(data, cursor);
        cursor = execType.encode(data, cursor);
        cursor = tradeFlags.encode(data, cursor);
        cursor = clearingFirmInt32Null.encode(data, cursor);
        cursor = clearingAccountString14Null.encode(data, cursor);
        cursor = memo.encode(data, cursor);
        cursor = execRefId.encode(data, cursor);
        cursor = noLegExecutions.encode(data, cursor);
        cursor = secondaryExecId.encode(data, cursor);
        cursor = linkExecId.encode(data, cursor);
        cursor = lastParPx.encode(data, cursor);
        cursor = deliveryStartDate.encode(data, cursor);
        cursor = deliveryEndDate.encode(data, cursor);
        cursor = crossIDInt64Null.encode(data, cursor);
        cursor = crossTypeCrossTypeEnumNull.encode(data, cursor);
        cursor = waiverIndicator.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
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
        origOrderId.clear();
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
            case "OriginatorUserId" -> Optional.of(originatorUserId);
            case "ExecIDInt" -> Optional.of(execIDInt);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "SymbolInt" -> Optional.of(symbolInt);
            case "OrdTypeOrderTypeEnum" -> Optional.of(ordTypeOrderTypeEnum);
            case "SideSideEnum" -> Optional.of(sideSideEnum);
            case "OrderId" -> Optional.of(orderId);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "CumQty" -> Optional.of(cumQty);
            case "LastPx" -> Optional.of(lastPx);
            case "LastShares" -> Optional.of(lastShares);
            case "TransactTimeUtcTimestamp" -> Optional.of(transactTimeUtcTimestamp);
            case "NumOfLots" -> Optional.of(numOfLots);
            case "ExecType" -> Optional.of(execType);
            case "TradeFlags" -> Optional.of(tradeFlags);
            case "ClearingFirmInt32Null" -> Optional.of(clearingFirmInt32Null);
            case "ClearingAccountString14Null" -> Optional.of(clearingAccountString14Null);
            case "Memo" -> Optional.of(memo);
            case "ExecRefId" -> Optional.of(execRefId);
            case "NoLegExecutions" -> Optional.of(noLegExecutions);
            case "SecondaryExecId" -> Optional.of(secondaryExecId);
            case "LinkExecId" -> Optional.of(linkExecId);
            case "LastParPx" -> Optional.of(lastParPx);
            case "DeliveryStartDate" -> Optional.of(deliveryStartDate);
            case "DeliveryEndDate" -> Optional.of(deliveryEndDate);
            case "CrossIDInt64Null" -> Optional.of(crossIDInt64Null);
            case "CrossTypeCrossTypeEnumNull" -> Optional.of(crossTypeCrossTypeEnumNull);
            case "WaiverIndicator" -> Optional.of(waiverIndicator);
            case "TradeType" -> Optional.of(tradeType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportTradeMessage message)) {
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
        if (!(other instanceof ExecutionReportTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
