package omi.eurex.t7.xti.fbe.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v5_0.fields.ApplSeqIndicatorField;
import omi.eurex.t7.xti.fbe.v5_0.fields.ClOrdIdField;
import omi.eurex.t7.xti.fbe.v5_0.fields.ComplianceIdField;
import omi.eurex.t7.xti.fbe.v5_0.fields.DisplayHighQtyField;
import omi.eurex.t7.xti.fbe.v5_0.fields.DisplayLowQtyField;
import omi.eurex.t7.xti.fbe.v5_0.fields.DisplayQtyField;
import omi.eurex.t7.xti.fbe.v5_0.fields.ExecInstField;
import omi.eurex.t7.xti.fbe.v5_0.fields.ExpireDateField;
import omi.eurex.t7.xti.fbe.v5_0.fields.FreeText1Field;
import omi.eurex.t7.xti.fbe.v5_0.fields.FreeText4Field;
import omi.eurex.t7.xti.fbe.v5_0.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v5_0.fields.MatchInstCrossIdField;
import omi.eurex.t7.xti.fbe.v5_0.fields.NetworkMsgIdField;
import omi.eurex.t7.xti.fbe.v5_0.fields.OrdTypeField;
import omi.eurex.t7.xti.fbe.v5_0.fields.OrderQtyField;
import omi.eurex.t7.xti.fbe.v5_0.fields.PegOffsetValueAbsField;
import omi.eurex.t7.xti.fbe.v5_0.fields.PegOffsetValuePctField;
import omi.eurex.t7.xti.fbe.v5_0.fields.PriceField;
import omi.eurex.t7.xti.fbe.v5_0.fields.PriceValidityCheckTypeField;
import omi.eurex.t7.xti.fbe.v5_0.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v5_0.fields.SideField;
import omi.eurex.t7.xti.fbe.v5_0.fields.StopPxField;
import omi.eurex.t7.xti.fbe.v5_0.fields.TimeInForceField;
import omi.eurex.t7.xti.fbe.v5_0.fields.TradingCapacityField;
import omi.eurex.t7.xti.fbe.v5_0.fields.TradingSessionSubIdField;
import omi.eurex.t7.xti.fbe.v5_0.structs.RequestHeaderComp;
import omi.eurex.t7.xti.fbe.v5_0.types.Field;
import omi.eurex.t7.xti.fbe.v5_0.types.Message;
import omi.eurex.t7.xti.fbe.v5_0.types.PrintOptions;

/**
 * Represents the NewOrderSingleRequest message from the Xti protocol.
 */
public final class NewOrderSingleRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 138;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Single Request";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 2 };

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Peg Offset Value Abs
     */
    private final PegOffsetValueAbsField pegOffsetValueAbs = new PegOffsetValueAbsField();

    /**
     * Peg Offset Value Pct
     */
    private final PegOffsetValuePctField pegOffsetValuePct = new PegOffsetValuePctField();

    /**
     * Cl Ord Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Compliance Id
     */
    private final ComplianceIdField complianceId = new ComplianceIdField();

    /**
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Display Qty
     */
    private final DisplayQtyField displayQty = new DisplayQtyField();

    /**
     * Display Low Qty
     */
    private final DisplayLowQtyField displayLowQty = new DisplayLowQtyField();

    /**
     * Display High Qty
     */
    private final DisplayHighQtyField displayHighQty = new DisplayHighQtyField();

    /**
     * Expire Date
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Match Inst Cross Id
     */
    private final MatchInstCrossIdField matchInstCrossId = new MatchInstCrossIdField();

    /**
     * Appl Seq Indicator
     */
    private final ApplSeqIndicatorField applSeqIndicator = new ApplSeqIndicatorField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Price Validity Check Type
     */
    private final PriceValidityCheckTypeField priceValidityCheckType = new PriceValidityCheckTypeField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Trading Session Sub Id
     */
    private final TradingSessionSubIdField tradingSessionSubId = new TradingSessionSubIdField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Free Text 1
     */
    private final FreeText1Field freeText1 = new FreeText1Field();

    /**
     * Free Text 4
     */
    private final FreeText4Field freeText4 = new FreeText4Field();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(price), List.<Field>of(stopPx), List.<Field>of(pegOffsetValueAbs), List.<Field>of(pegOffsetValuePct), List.<Field>of(clOrdId), List.<Field>of(securityId), List.<Field>of(complianceId), List.<Field>of(orderQty), List.<Field>of(displayQty), List.<Field>of(displayLowQty), List.<Field>of(displayHighQty), List.<Field>of(expireDate), List.<Field>of(marketSegmentId), List.<Field>of(matchInstCrossId), List.<Field>of(applSeqIndicator), List.<Field>of(side), List.<Field>of(ordType), List.<Field>of(priceValidityCheckType), List.<Field>of(timeInForce), List.<Field>of(execInst), List.<Field>of(tradingSessionSubId), List.<Field>of(tradingCapacity), List.<Field>of(freeText1), List.<Field>of(freeText4)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Network Msg Id
     *
     * @return the NetworkMsgId field
     */
    public NetworkMsgIdField networkMsgId() {
        return networkMsgId;
    }

    /**
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Peg Offset Value Abs
     *
     * @return the PegOffsetValueAbs field
     */
    public PegOffsetValueAbsField pegOffsetValueAbs() {
        return pegOffsetValueAbs;
    }

    /**
     * Peg Offset Value Pct
     *
     * @return the PegOffsetValuePct field
     */
    public PegOffsetValuePctField pegOffsetValuePct() {
        return pegOffsetValuePct;
    }

    /**
     * Cl Ord Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Compliance Id
     *
     * @return the ComplianceId field
     */
    public ComplianceIdField complianceId() {
        return complianceId;
    }

    /**
     * Order Qty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Display Qty
     *
     * @return the DisplayQty field
     */
    public DisplayQtyField displayQty() {
        return displayQty;
    }

    /**
     * Display Low Qty
     *
     * @return the DisplayLowQty field
     */
    public DisplayLowQtyField displayLowQty() {
        return displayLowQty;
    }

    /**
     * Display High Qty
     *
     * @return the DisplayHighQty field
     */
    public DisplayHighQtyField displayHighQty() {
        return displayHighQty;
    }

    /**
     * Expire Date
     *
     * @return the ExpireDate field
     */
    public ExpireDateField expireDate() {
        return expireDate;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Match Inst Cross Id
     *
     * @return the MatchInstCrossId field
     */
    public MatchInstCrossIdField matchInstCrossId() {
        return matchInstCrossId;
    }

    /**
     * Appl Seq Indicator
     *
     * @return the ApplSeqIndicator field
     */
    public ApplSeqIndicatorField applSeqIndicator() {
        return applSeqIndicator;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Ord Type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Price Validity Check Type
     *
     * @return the PriceValidityCheckType field
     */
    public PriceValidityCheckTypeField priceValidityCheckType() {
        return priceValidityCheckType;
    }

    /**
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Exec Inst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Trading Session Sub Id
     *
     * @return the TradingSessionSubId field
     */
    public TradingSessionSubIdField tradingSessionSubId() {
        return tradingSessionSubId;
    }

    /**
     * Trading Capacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
    }

    /**
     * Free Text 1
     *
     * @return the FreeText1 field
     */
    public FreeText1Field freeText1() {
        return freeText1;
    }

    /**
     * Free Text 4
     *
     * @return the FreeText4 field
     */
    public FreeText4Field freeText4() {
        return freeText4;
    }

    /**
     * Request Header Comp
     *
     * @return the RequestHeaderComp record
     */
    public RequestHeaderComp requestHeaderComp() {
        return requestHeaderComp;
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 120)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!pegOffsetValueAbs.parse(data, cursor)) {
            return false;
        }
        cursor += PegOffsetValueAbsField.BYTE_LENGTH;
        if (!pegOffsetValuePct.parse(data, cursor)) {
            return false;
        }
        cursor += PegOffsetValuePctField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!complianceId.parse(data, cursor)) {
            return false;
        }
        cursor += ComplianceIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!displayQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQtyField.BYTE_LENGTH;
        if (!displayLowQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayLowQtyField.BYTE_LENGTH;
        if (!displayHighQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayHighQtyField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!matchInstCrossId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchInstCrossIdField.BYTE_LENGTH;
        if (!applSeqIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ApplSeqIndicatorField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!priceValidityCheckType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceValidityCheckTypeField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!tradingSessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionSubIdField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!freeText1.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText1Field.BYTE_LENGTH;
        return freeText4.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = pegOffsetValueAbs.encode(data, cursor);
        cursor = pegOffsetValuePct.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = complianceId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = displayLowQty.encode(data, cursor);
        cursor = displayHighQty.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = matchInstCrossId.encode(data, cursor);
        cursor = applSeqIndicator.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = priceValidityCheckType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText4.encode(data, cursor);
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
        requestHeaderComp.clear();
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
            case "NetworkMsgId" -> Optional.of(networkMsgId);
            case "Price" -> Optional.of(price);
            case "StopPx" -> Optional.of(stopPx);
            case "PegOffsetValueAbs" -> Optional.of(pegOffsetValueAbs);
            case "PegOffsetValuePct" -> Optional.of(pegOffsetValuePct);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "SecurityId" -> Optional.of(securityId);
            case "ComplianceId" -> Optional.of(complianceId);
            case "OrderQty" -> Optional.of(orderQty);
            case "DisplayQty" -> Optional.of(displayQty);
            case "DisplayLowQty" -> Optional.of(displayLowQty);
            case "DisplayHighQty" -> Optional.of(displayHighQty);
            case "ExpireDate" -> Optional.of(expireDate);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "MatchInstCrossId" -> Optional.of(matchInstCrossId);
            case "ApplSeqIndicator" -> Optional.of(applSeqIndicator);
            case "Side" -> Optional.of(side);
            case "OrdType" -> Optional.of(ordType);
            case "PriceValidityCheckType" -> Optional.of(priceValidityCheckType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ExecInst" -> Optional.of(execInst);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText4" -> Optional.of(freeText4);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderSingleRequest message)) {
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
        if (!(other instanceof NewOrderSingleRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
