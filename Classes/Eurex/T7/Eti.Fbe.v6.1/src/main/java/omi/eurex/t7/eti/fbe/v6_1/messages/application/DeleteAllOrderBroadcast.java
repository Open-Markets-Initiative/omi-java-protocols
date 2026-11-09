package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.ExecInstField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MassActionReasonField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MassActionReportIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NoNotAffectedOrdersField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyIdEnteringFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyIdEnteringTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PriceField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TargetPartyIdExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TargetPartyIdSessionIdField;
import omi.eurex.t7.eti.fbe.v6_1.groups.NotAffectedOrdersGrpCompEntry;
import omi.eurex.t7.eti.fbe.v6_1.groups.NotAffectedOrdersGrpCompList;
import omi.eurex.t7.eti.fbe.v6_1.structs.RbcHeaderMeComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the DeleteAllOrderBroadcast message from the Eti protocol.
 */
public final class DeleteAllOrderBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 106;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Delete All Order Broadcast";

    /**
     * Mass Action Report Id
     */
    private final MassActionReportIdField massActionReportId = new MassActionReportIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Target Party Id Session Id
     */
    private final TargetPartyIdSessionIdField targetPartyIdSessionId = new TargetPartyIdSessionIdField();

    /**
     * Target Party Id Executing Trader
     */
    private final TargetPartyIdExecutingTraderField targetPartyIdExecutingTrader = new TargetPartyIdExecutingTraderField();

    /**
     * Party Id Entering Trader
     */
    private final PartyIdEnteringTraderField partyIdEnteringTrader = new PartyIdEnteringTraderField();

    /**
     * No Not Affected Orders
     */
    private final NoNotAffectedOrdersField noNotAffectedOrders = new NoNotAffectedOrdersField();

    /**
     * Party Id Entering Firm
     */
    private final PartyIdEnteringFirmField partyIdEnteringFirm = new PartyIdEnteringFirmField();

    /**
     * Mass Action Reason
     */
    private final MassActionReasonField massActionReason = new MassActionReasonField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Not Affected Orders Grp Comp
     */
    private final NotAffectedOrdersGrpCompList notAffectedOrdersGrpComp = new NotAffectedOrdersGrpCompList();

    /**
     * Rbc Header Me Comp
     */
    private final RbcHeaderMeComp rbcHeaderMeComp = new RbcHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderMeComp.fields(), List.<Field>of(massActionReportId), List.<Field>of(securityId), List.<Field>of(price), List.<Field>of(marketSegmentId), List.<Field>of(targetPartyIdSessionId), List.<Field>of(targetPartyIdExecutingTrader), List.<Field>of(partyIdEnteringTrader), List.<Field>of(noNotAffectedOrders), List.<Field>of(partyIdEnteringFirm), List.<Field>of(massActionReason), List.<Field>of(execInst), List.<Field>of(side)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Mass Action Report Id
     *
     * @return the MassActionReportId field
     */
    public MassActionReportIdField massActionReportId() {
        return massActionReportId;
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
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Target Party Id Session Id
     *
     * @return the TargetPartyIdSessionId field
     */
    public TargetPartyIdSessionIdField targetPartyIdSessionId() {
        return targetPartyIdSessionId;
    }

    /**
     * Target Party Id Executing Trader
     *
     * @return the TargetPartyIdExecutingTrader field
     */
    public TargetPartyIdExecutingTraderField targetPartyIdExecutingTrader() {
        return targetPartyIdExecutingTrader;
    }

    /**
     * Party Id Entering Trader
     *
     * @return the PartyIdEnteringTrader field
     */
    public PartyIdEnteringTraderField partyIdEnteringTrader() {
        return partyIdEnteringTrader;
    }

    /**
     * No Not Affected Orders
     *
     * @return the NoNotAffectedOrders field
     */
    public NoNotAffectedOrdersField noNotAffectedOrders() {
        return noNotAffectedOrders;
    }

    /**
     * Party Id Entering Firm
     *
     * @return the PartyIdEnteringFirm field
     */
    public PartyIdEnteringFirmField partyIdEnteringFirm() {
        return partyIdEnteringFirm;
    }

    /**
     * Mass Action Reason
     *
     * @return the MassActionReason field
     */
    public MassActionReasonField massActionReason() {
        return massActionReason;
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
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Not Affected Orders Grp Comp
     *
     * <p>Encode writes this list's size to the NoNotAffectedOrders field.</p>
     *
     * @return the NotAffectedOrdersGrpComp entries
     */
    public NotAffectedOrdersGrpCompList notAffectedOrdersGrpComp() {
        return notAffectedOrdersGrpComp;
    }

    /**
     * Rbc Header Me Comp
     *
     * @return the RbcHeaderMeComp record
     */
    public RbcHeaderMeComp rbcHeaderMeComp() {
        return rbcHeaderMeComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + notAffectedOrdersGrpComp.byteLength();
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
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RbcHeaderMeComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RbcHeaderMeComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor = notAffectedOrdersGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(rbcHeaderMeComp.trdRegTsTimeOut().value());
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
        cursor += 2; // padding
        if (!rbcHeaderMeComp.parseFrom(data, cursor, end - 48)) {
            return false;
        }
        cursor += rbcHeaderMeComp.byteLength();
        if (!massActionReportId.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionReportIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!targetPartyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdSessionIdField.BYTE_LENGTH;
        if (!targetPartyIdExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdExecutingTraderField.BYTE_LENGTH;
        if (!partyIdEnteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdEnteringTraderField.BYTE_LENGTH;
        if (!noNotAffectedOrders.parse(data, cursor)) {
            return false;
        }
        cursor += NoNotAffectedOrdersField.BYTE_LENGTH;
        if (!partyIdEnteringFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdEnteringFirmField.BYTE_LENGTH;
        if (!massActionReason.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionReasonField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!notAffectedOrdersGrpComp.parse(data, cursor, end, noNotAffectedOrders.value())) {
            return false;
        }
        cursor += notAffectedOrdersGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (notAffectedOrdersGrpComp.size() > 65535) {
            throw new IllegalStateException("notAffectedOrdersGrpComp holds " + notAffectedOrdersGrpComp.size() + " entries, more than its count field can state");
        }
        noNotAffectedOrders.value(notAffectedOrdersGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderMeComp.encode(data, cursor);
        cursor = massActionReportId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = targetPartyIdSessionId.encode(data, cursor);
        cursor = targetPartyIdExecutingTrader.encode(data, cursor);
        cursor = partyIdEnteringTrader.encode(data, cursor);
        cursor = noNotAffectedOrders.encode(data, cursor);
        cursor = partyIdEnteringFirm.encode(data, cursor);
        cursor = massActionReason.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = side.encode(data, cursor);
        if (buffer != null && buffer.length >= 104 + 2) {
            System.arraycopy(buffer, 104, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = notAffectedOrdersGrpComp.encode(data, cursor);
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
        rbcHeaderMeComp.clear();
        notAffectedOrdersGrpComp.clear();
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
            if (field != noNotAffectedOrders && !field.isRecognized()) {
                return false;
            }
        }
        if (!notAffectedOrdersGrpComp.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noNotAffectedOrders && !field.isValid()) {
                return false;
            }
        }
        if (!notAffectedOrdersGrpComp.isValid()) {
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
        if (!rbcHeaderMeComp.isDecoded()) {
            return rbcHeaderMeComp.failedAt();
        }
        if (!massActionReportId.isDecoded()) {
            return Optional.of(massActionReportId);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!targetPartyIdSessionId.isDecoded()) {
            return Optional.of(targetPartyIdSessionId);
        }
        if (!targetPartyIdExecutingTrader.isDecoded()) {
            return Optional.of(targetPartyIdExecutingTrader);
        }
        if (!partyIdEnteringTrader.isDecoded()) {
            return Optional.of(partyIdEnteringTrader);
        }
        if (!noNotAffectedOrders.isDecoded()) {
            return Optional.of(noNotAffectedOrders);
        }
        if (!partyIdEnteringFirm.isDecoded()) {
            return Optional.of(partyIdEnteringFirm);
        }
        if (!massActionReason.isDecoded()) {
            return Optional.of(massActionReason);
        }
        if (!execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!notAffectedOrdersGrpComp.isDecoded()) {
            return Optional.of(notAffectedOrdersGrpComp.failedEntry().flatMap(NotAffectedOrdersGrpCompEntry::failedAt).orElse(noNotAffectedOrders));
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
            case "MassActionReportId" -> Optional.of(massActionReportId);
            case "SecurityId" -> Optional.of(securityId);
            case "Price" -> Optional.of(price);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "TargetPartyIdSessionId" -> Optional.of(targetPartyIdSessionId);
            case "TargetPartyIdExecutingTrader" -> Optional.of(targetPartyIdExecutingTrader);
            case "PartyIdEnteringTrader" -> Optional.of(partyIdEnteringTrader);
            case "NoNotAffectedOrders" -> Optional.of(noNotAffectedOrders);
            case "PartyIdEnteringFirm" -> Optional.of(partyIdEnteringFirm);
            case "MassActionReason" -> Optional.of(massActionReason);
            case "ExecInst" -> Optional.of(execInst);
            case "Side" -> Optional.of(side);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DeleteAllOrderBroadcast message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(notAffectedOrdersGrpComp.diffFields(message.notAffectedOrdersGrpComp));
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
            notAffectedOrdersGrpComp.toFormattedString(builder, options);
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
        notAffectedOrdersGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof DeleteAllOrderBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields) && notAffectedOrdersGrpComp.equals(message.notAffectedOrdersGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, notAffectedOrdersGrpComp);
    }
}
