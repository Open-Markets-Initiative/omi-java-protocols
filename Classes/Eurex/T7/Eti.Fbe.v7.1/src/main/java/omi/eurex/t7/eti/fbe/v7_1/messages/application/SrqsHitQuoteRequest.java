package omi.eurex.t7.eti.fbe.v7_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v7_1.fields.FirmTradeIdField;
import omi.eurex.t7.eti.fbe.v7_1.fields.FreeText1Field;
import omi.eurex.t7.eti.fbe.v7_1.fields.FreeText5Field;
import omi.eurex.t7.eti.fbe.v7_1.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v7_1.fields.NegotiationIdField;
import omi.eurex.t7.eti.fbe.v7_1.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v7_1.fields.OrderQtyField;
import omi.eurex.t7.eti.fbe.v7_1.fields.PartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v7_1.fields.PartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v7_1.fields.QuoteIdField;
import omi.eurex.t7.eti.fbe.v7_1.fields.SideField;
import omi.eurex.t7.eti.fbe.v7_1.fields.UnderlyingPriceStipValueField;
import omi.eurex.t7.eti.fbe.v7_1.fields.UnderlyingQtyField;
import omi.eurex.t7.eti.fbe.v7_1.fields.ValidUntilTimeField;
import omi.eurex.t7.eti.fbe.v7_1.fields.ValueCheckTypeQuantityField;
import omi.eurex.t7.eti.fbe.v7_1.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v7_1.types.Field;
import omi.eurex.t7.eti.fbe.v7_1.types.Message;
import omi.eurex.t7.eti.fbe.v7_1.types.PrintOptions;

/**
 * Represents the SrqsHitQuoteRequest message from the Eti protocol.
 */
public final class SrqsHitQuoteRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 250;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Srqs Hit Quote Request";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 2, 243, 7 };

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Quote Id
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Valid Until Time
     */
    private final ValidUntilTimeField validUntilTime = new ValidUntilTimeField();

    /**
     * Underlying Qty
     */
    private final UnderlyingQtyField underlyingQty = new UnderlyingQtyField();

    /**
     * Underlying Price Stip Value
     */
    private final UnderlyingPriceStipValueField underlyingPriceStipValue = new UnderlyingPriceStipValueField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Value Check Type Quantity
     */
    private final ValueCheckTypeQuantityField valueCheckTypeQuantity = new ValueCheckTypeQuantityField();

    /**
     * Party Executing Firm
     */
    private final PartyExecutingFirmField partyExecutingFirm = new PartyExecutingFirmField();

    /**
     * Party Executing Trader
     */
    private final PartyExecutingTraderField partyExecutingTrader = new PartyExecutingTraderField();

    /**
     * Firm Trade Id
     */
    private final FirmTradeIdField firmTradeId = new FirmTradeIdField();

    /**
     * Free Text 1
     */
    private final FreeText1Field freeText1 = new FreeText1Field();

    /**
     * Free Text 5
     */
    private final FreeText5Field freeText5 = new FreeText5Field();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(quoteId), List.<Field>of(orderQty), List.<Field>of(validUntilTime), List.<Field>of(underlyingQty), List.<Field>of(underlyingPriceStipValue), List.<Field>of(marketSegmentId), List.<Field>of(negotiationId), List.<Field>of(side), List.<Field>of(valueCheckTypeQuantity), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(firmTradeId), List.<Field>of(freeText1), List.<Field>of(freeText5)).flatMap(List::stream).toList();

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
     * Quote Id
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
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
     * Valid Until Time
     *
     * @return the ValidUntilTime field
     */
    public ValidUntilTimeField validUntilTime() {
        return validUntilTime;
    }

    /**
     * Underlying Qty
     *
     * @return the UnderlyingQty field
     */
    public UnderlyingQtyField underlyingQty() {
        return underlyingQty;
    }

    /**
     * Underlying Price Stip Value
     *
     * @return the UnderlyingPriceStipValue field
     */
    public UnderlyingPriceStipValueField underlyingPriceStipValue() {
        return underlyingPriceStipValue;
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
     * Negotiation Id
     *
     * @return the NegotiationId field
     */
    public NegotiationIdField negotiationId() {
        return negotiationId;
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
     * Value Check Type Quantity
     *
     * @return the ValueCheckTypeQuantity field
     */
    public ValueCheckTypeQuantityField valueCheckTypeQuantity() {
        return valueCheckTypeQuantity;
    }

    /**
     * Party Executing Firm
     *
     * @return the PartyExecutingFirm field
     */
    public PartyExecutingFirmField partyExecutingFirm() {
        return partyExecutingFirm;
    }

    /**
     * Party Executing Trader
     *
     * @return the PartyExecutingTrader field
     */
    public PartyExecutingTraderField partyExecutingTrader() {
        return partyExecutingTrader;
    }

    /**
     * Firm Trade Id
     *
     * @return the FirmTradeId field
     */
    public FirmTradeIdField firmTradeId() {
        return firmTradeId;
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
     * Free Text 5
     *
     * @return the FreeText5 field
     */
    public FreeText5Field freeText5() {
        return freeText5;
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
        return Optional.ofNullable(validUntilTime.value());
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 232)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!validUntilTime.parse(data, cursor)) {
            return false;
        }
        cursor += ValidUntilTimeField.BYTE_LENGTH;
        if (!underlyingQty.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingQtyField.BYTE_LENGTH;
        if (!underlyingPriceStipValue.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingPriceStipValueField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!valueCheckTypeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ValueCheckTypeQuantityField.BYTE_LENGTH;
        if (!partyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingFirmField.BYTE_LENGTH;
        if (!partyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingTraderField.BYTE_LENGTH;
        if (!firmTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmTradeIdField.BYTE_LENGTH;
        if (!freeText1.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText1Field.BYTE_LENGTH;
        if (!freeText5.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText5Field.BYTE_LENGTH;

        return true;
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
        cursor = quoteId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = validUntilTime.encode(data, cursor);
        cursor = underlyingQty.encode(data, cursor);
        cursor = underlyingPriceStipValue.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = valueCheckTypeQuantity.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = firmTradeId.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText5.encode(data, cursor);
        if (buffer != null && buffer.length >= 250) {
            System.arraycopy(buffer, 243, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
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
            case "QuoteId" -> Optional.of(quoteId);
            case "OrderQty" -> Optional.of(orderQty);
            case "ValidUntilTime" -> Optional.of(validUntilTime);
            case "UnderlyingQty" -> Optional.of(underlyingQty);
            case "UnderlyingPriceStipValue" -> Optional.of(underlyingPriceStipValue);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "Side" -> Optional.of(side);
            case "ValueCheckTypeQuantity" -> Optional.of(valueCheckTypeQuantity);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "FirmTradeId" -> Optional.of(firmTradeId);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText5" -> Optional.of(freeText5);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SrqsHitQuoteRequest message)) {
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
        if (!(other instanceof SrqsHitQuoteRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
