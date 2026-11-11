package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NegotiationIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeReportTypeField;
import omi.eurex.t7.eti.fbe.v6_1.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the SrqsUpdateDealStatusRequest message from the Eti protocol.
 */
public final class SrqsUpdateDealStatusRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Srqs Update Deal Status Request";

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
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Party Executing Firm
     */
    private final PartyExecutingFirmField partyExecutingFirm = new PartyExecutingFirmField();

    /**
     * Party Executing Trader
     */
    private final PartyExecutingTraderField partyExecutingTrader = new PartyExecutingTraderField();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(marketSegmentId), List.<Field>of(negotiationId), List.<Field>of(tradeId), List.<Field>of(tradeReportType), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader)).flatMap(List::stream).toList();

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
     * Trade Id
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Trade Report Type
     *
     * @return the TradeReportType field
     */
    public TradeReportTypeField tradeReportType() {
        return tradeReportType;
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!partyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingFirmField.BYTE_LENGTH;
        return partyExecutingTrader.parse(data, cursor);
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
        cursor = marketSegmentId.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
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
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "TradeId" -> Optional.of(tradeId);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SrqsUpdateDealStatusRequest message)) {
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
        if (!(other instanceof SrqsUpdateDealStatusRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
