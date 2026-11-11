package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.CrossIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.CrossRequestIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoCrossLegsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoSidesField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderQtyDisclosureInstructionField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PriceDisclosureInstructionField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PriceField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyContraFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyContraTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SideDisclosureInstructionField;
import omi.eurex.t7.eti.fbe.v10_0.groups.CrossRequestSideGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.CrossRequestSideGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.SideCrossLegGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.SideCrossLegGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the EnterClipRequest message from the Eti protocol.
 */
public final class EnterClipRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Enter Clip Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Cross Id
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Cross Request Id
     */
    private final CrossRequestIdField crossRequestId = new CrossRequestIdField();

    /**
     * No Sides
     */
    private final NoSidesField noSides = new NoSidesField();

    /**
     * No Cross Legs
     */
    private final NoCrossLegsField noCrossLegs = new NoCrossLegsField();

    /**
     * Side Disclosure Instruction
     */
    private final SideDisclosureInstructionField sideDisclosureInstruction = new SideDisclosureInstructionField();

    /**
     * Price Disclosure Instruction
     */
    private final PriceDisclosureInstructionField priceDisclosureInstruction = new PriceDisclosureInstructionField();

    /**
     * Order Qty Disclosure Instruction
     */
    private final OrderQtyDisclosureInstructionField orderQtyDisclosureInstruction = new OrderQtyDisclosureInstructionField();

    /**
     * Root Party Contra Firm
     */
    private final RootPartyContraFirmField rootPartyContraFirm = new RootPartyContraFirmField();

    /**
     * Root Party Contra Trader
     */
    private final RootPartyContraTraderField rootPartyContraTrader = new RootPartyContraTraderField();

    /**
     * Cross Request Side Grp Comp
     */
    private final CrossRequestSideGrpCompList crossRequestSideGrpComp = new CrossRequestSideGrpCompList();

    /**
     * Side Cross Leg Grp Comp
     */
    private final SideCrossLegGrpCompList sideCrossLegGrpComp = new SideCrossLegGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(price), List.<Field>of(orderQty), List.<Field>of(marketSegmentId), List.<Field>of(crossId), List.<Field>of(crossRequestId), List.<Field>of(noSides), List.<Field>of(noCrossLegs), List.<Field>of(sideDisclosureInstruction), List.<Field>of(priceDisclosureInstruction), List.<Field>of(orderQtyDisclosureInstruction), List.<Field>of(rootPartyContraFirm), List.<Field>of(rootPartyContraTrader)).flatMap(List::stream).toList();

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
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
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
     * Order Qty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
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
     * Cross Id
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * Cross Request Id
     *
     * @return the CrossRequestId field
     */
    public CrossRequestIdField crossRequestId() {
        return crossRequestId;
    }

    /**
     * No Sides
     *
     * @return the NoSides field
     */
    public NoSidesField noSides() {
        return noSides;
    }

    /**
     * No Cross Legs
     *
     * @return the NoCrossLegs field
     */
    public NoCrossLegsField noCrossLegs() {
        return noCrossLegs;
    }

    /**
     * Side Disclosure Instruction
     *
     * @return the SideDisclosureInstruction field
     */
    public SideDisclosureInstructionField sideDisclosureInstruction() {
        return sideDisclosureInstruction;
    }

    /**
     * Price Disclosure Instruction
     *
     * @return the PriceDisclosureInstruction field
     */
    public PriceDisclosureInstructionField priceDisclosureInstruction() {
        return priceDisclosureInstruction;
    }

    /**
     * Order Qty Disclosure Instruction
     *
     * @return the OrderQtyDisclosureInstruction field
     */
    public OrderQtyDisclosureInstructionField orderQtyDisclosureInstruction() {
        return orderQtyDisclosureInstruction;
    }

    /**
     * Root Party Contra Firm
     *
     * @return the RootPartyContraFirm field
     */
    public RootPartyContraFirmField rootPartyContraFirm() {
        return rootPartyContraFirm;
    }

    /**
     * Root Party Contra Trader
     *
     * @return the RootPartyContraTrader field
     */
    public RootPartyContraTraderField rootPartyContraTrader() {
        return rootPartyContraTrader;
    }

    /**
     * Cross Request Side Grp Comp
     *
     * <p>Encode writes this list's size to the NoSides field.</p>
     *
     * @return the CrossRequestSideGrpComp entries
     */
    public CrossRequestSideGrpCompList crossRequestSideGrpComp() {
        return crossRequestSideGrpComp;
    }

    /**
     * Side Cross Leg Grp Comp
     *
     * <p>Encode writes this list's size to the NoCrossLegs field.</p>
     *
     * @return the SideCrossLegGrpComp entries
     */
    public SideCrossLegGrpCompList sideCrossLegGrpComp() {
        return sideCrossLegGrpComp;
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
        return MINIMUM_BYTE_LENGTH + crossRequestSideGrpComp.byteLength() + sideCrossLegGrpComp.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 8;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RequestHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RequestHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 5;
        cursor += 6;
        runs.add(cursor).add(4);
        cursor += 4;
        cursor = crossRequestSideGrpComp.padding(runs, cursor);
        cursor = sideCrossLegGrpComp.padding(runs, cursor);
        return cursor;
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 56)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        if (!crossRequestId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossRequestIdField.BYTE_LENGTH;
        if (!noSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoSidesField.BYTE_LENGTH;
        if (!noCrossLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoCrossLegsField.BYTE_LENGTH;
        if (!sideDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += SideDisclosureInstructionField.BYTE_LENGTH;
        if (!priceDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDisclosureInstructionField.BYTE_LENGTH;
        if (!orderQtyDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyDisclosureInstructionField.BYTE_LENGTH;
        if (!rootPartyContraFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyContraFirmField.BYTE_LENGTH;
        if (!rootPartyContraTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyContraTraderField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!crossRequestSideGrpComp.parse(data, cursor, end, noSides.value())) {
            return false;
        }
        cursor += crossRequestSideGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!sideCrossLegGrpComp.parse(data, cursor, end, noCrossLegs.value())) {
            return false;
        }
        cursor += sideCrossLegGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (crossRequestSideGrpComp.size() > 255) {
            throw new IllegalStateException("crossRequestSideGrpComp holds " + crossRequestSideGrpComp.size() + " entries, more than its count field can state");
        }
        if (sideCrossLegGrpComp.size() > 255) {
            throw new IllegalStateException("sideCrossLegGrpComp holds " + sideCrossLegGrpComp.size() + " entries, more than its count field can state");
        }
        noSides.value((short) crossRequestSideGrpComp.size());
        noCrossLegs.value((short) sideCrossLegGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = crossId.encode(data, cursor);
        cursor = crossRequestId.encode(data, cursor);
        cursor = noSides.encode(data, cursor);
        cursor = noCrossLegs.encode(data, cursor);
        cursor = sideDisclosureInstruction.encode(data, cursor);
        cursor = priceDisclosureInstruction.encode(data, cursor);
        cursor = orderQtyDisclosureInstruction.encode(data, cursor);
        cursor = rootPartyContraFirm.encode(data, cursor);
        cursor = rootPartyContraTrader.encode(data, cursor);
        if (buffer != null && buffer.length >= 74) {
            System.arraycopy(buffer, 70, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = crossRequestSideGrpComp.encode(data, cursor);
        cursor = sideCrossLegGrpComp.encode(data, cursor);
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
        requestHeaderComp.clear();
        crossRequestSideGrpComp.clear();
        sideCrossLegGrpComp.clear();
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
            if (field != noSides && field != noCrossLegs && !field.isRecognized()) {
                return false;
            }
        }
        if (!crossRequestSideGrpComp.isRecognized()) {
            return false;
        }
        return sideCrossLegGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noSides && field != noCrossLegs && !field.isValid()) {
                return false;
            }
        }
        if (!crossRequestSideGrpComp.isValid()) {
            return false;
        }
        if (!sideCrossLegGrpComp.isValid()) {
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
        if (!networkMsgId.isDecoded()) {
            return Optional.of(networkMsgId);
        }
        if (!requestHeaderComp.isDecoded()) {
            return requestHeaderComp.failedAt();
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!crossId.isDecoded()) {
            return Optional.of(crossId);
        }
        if (!crossRequestId.isDecoded()) {
            return Optional.of(crossRequestId);
        }
        if (!noSides.isDecoded()) {
            return Optional.of(noSides);
        }
        if (!noCrossLegs.isDecoded()) {
            return Optional.of(noCrossLegs);
        }
        if (!sideDisclosureInstruction.isDecoded()) {
            return Optional.of(sideDisclosureInstruction);
        }
        if (!priceDisclosureInstruction.isDecoded()) {
            return Optional.of(priceDisclosureInstruction);
        }
        if (!orderQtyDisclosureInstruction.isDecoded()) {
            return Optional.of(orderQtyDisclosureInstruction);
        }
        if (!rootPartyContraFirm.isDecoded()) {
            return Optional.of(rootPartyContraFirm);
        }
        if (!rootPartyContraTrader.isDecoded()) {
            return Optional.of(rootPartyContraTrader);
        }
        if (!crossRequestSideGrpComp.isDecoded()) {
            return Optional.of(crossRequestSideGrpComp.failedEntry().flatMap(CrossRequestSideGrpCompEntry::failedAt).orElse(noSides));
        }
        if (!sideCrossLegGrpComp.isDecoded()) {
            return Optional.of(sideCrossLegGrpComp.failedEntry().flatMap(SideCrossLegGrpCompEntry::failedAt).orElse(noCrossLegs));
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
            case "SecurityId" -> Optional.of(securityId);
            case "Price" -> Optional.of(price);
            case "OrderQty" -> Optional.of(orderQty);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "CrossId" -> Optional.of(crossId);
            case "CrossRequestId" -> Optional.of(crossRequestId);
            case "NoSides" -> Optional.of(noSides);
            case "NoCrossLegs" -> Optional.of(noCrossLegs);
            case "SideDisclosureInstruction" -> Optional.of(sideDisclosureInstruction);
            case "PriceDisclosureInstruction" -> Optional.of(priceDisclosureInstruction);
            case "OrderQtyDisclosureInstruction" -> Optional.of(orderQtyDisclosureInstruction);
            case "RootPartyContraFirm" -> Optional.of(rootPartyContraFirm);
            case "RootPartyContraTrader" -> Optional.of(rootPartyContraTrader);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EnterClipRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(crossRequestSideGrpComp.diffFields(message.crossRequestSideGrpComp));
        changed.addAll(sideCrossLegGrpComp.diffFields(message.sideCrossLegGrpComp));
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
            crossRequestSideGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            sideCrossLegGrpComp.toFormattedString(builder, options);
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
        crossRequestSideGrpComp.toFormattedString(builder, nested);
        sideCrossLegGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof EnterClipRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && crossRequestSideGrpComp.equals(message.crossRequestSideGrpComp) && sideCrossLegGrpComp.equals(message.sideCrossLegGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, crossRequestSideGrpComp, sideCrossLegGrpComp);
    }
}
