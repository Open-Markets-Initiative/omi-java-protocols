package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.ListUpdateActionField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MarketIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyDetailIdExecutingUnitField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyDetailStatusField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RequestingPartyClearingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RequestingPartyEnteringFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RequestingPartyIdExecutingSystemField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeDateField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TransactTimeField;
import omi.eurex.t7.eti.fbe.v6_1.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the PartyEntitlementsUpdateReport message from the Eti protocol.
 */
public final class PartyEntitlementsUpdateReport implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 82;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Party Entitlements Update Report";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 27, 7, 76, 6 };

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Trade Date
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Party Detail Id Executing Unit
     */
    private final PartyDetailIdExecutingUnitField partyDetailIdExecutingUnit = new PartyDetailIdExecutingUnitField();

    /**
     * Requesting Party Id Executing System
     */
    private final RequestingPartyIdExecutingSystemField requestingPartyIdExecutingSystem = new RequestingPartyIdExecutingSystemField();

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * List Update Action
     */
    private final ListUpdateActionField listUpdateAction = new ListUpdateActionField();

    /**
     * Requesting Party Entering Firm
     */
    private final RequestingPartyEnteringFirmField requestingPartyEnteringFirm = new RequestingPartyEnteringFirmField();

    /**
     * Requesting Party Clearing Firm
     */
    private final RequestingPartyClearingFirmField requestingPartyClearingFirm = new RequestingPartyClearingFirmField();

    /**
     * Party Detail Status
     */
    private final PartyDetailStatusField partyDetailStatus = new PartyDetailStatusField();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(transactTime), List.<Field>of(tradeDate), List.<Field>of(partyDetailIdExecutingUnit), List.<Field>of(requestingPartyIdExecutingSystem), List.<Field>of(marketId), List.<Field>of(listUpdateAction), List.<Field>of(requestingPartyEnteringFirm), List.<Field>of(requestingPartyClearingFirm), List.<Field>of(partyDetailStatus)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Transact Time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Trade Date
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Party Detail Id Executing Unit
     *
     * @return the PartyDetailIdExecutingUnit field
     */
    public PartyDetailIdExecutingUnitField partyDetailIdExecutingUnit() {
        return partyDetailIdExecutingUnit;
    }

    /**
     * Requesting Party Id Executing System
     *
     * @return the RequestingPartyIdExecutingSystem field
     */
    public RequestingPartyIdExecutingSystemField requestingPartyIdExecutingSystem() {
        return requestingPartyIdExecutingSystem;
    }

    /**
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * List Update Action
     *
     * @return the ListUpdateAction field
     */
    public ListUpdateActionField listUpdateAction() {
        return listUpdateAction;
    }

    /**
     * Requesting Party Entering Firm
     *
     * @return the RequestingPartyEnteringFirm field
     */
    public RequestingPartyEnteringFirmField requestingPartyEnteringFirm() {
        return requestingPartyEnteringFirm;
    }

    /**
     * Requesting Party Clearing Firm
     *
     * @return the RequestingPartyClearingFirm field
     */
    public RequestingPartyClearingFirmField requestingPartyClearingFirm() {
        return requestingPartyClearingFirm;
    }

    /**
     * Party Detail Status
     *
     * @return the PartyDetailStatus field
     */
    public PartyDetailStatusField partyDetailStatus() {
        return partyDetailStatus;
    }

    /**
     * Rbc Header Comp
     *
     * @return the RbcHeaderComp record
     */
    public RbcHeaderComp rbcHeaderComp() {
        return rbcHeaderComp;
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
        return Optional.ofNullable(rbcHeaderComp.sendingTime().value());
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
        cursor += 2; // padding
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 48)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!partyDetailIdExecutingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailIdExecutingUnitField.BYTE_LENGTH;
        if (!requestingPartyIdExecutingSystem.parse(data, cursor)) {
            return false;
        }
        cursor += RequestingPartyIdExecutingSystemField.BYTE_LENGTH;
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!listUpdateAction.parse(data, cursor)) {
            return false;
        }
        cursor += ListUpdateActionField.BYTE_LENGTH;
        if (!requestingPartyEnteringFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RequestingPartyEnteringFirmField.BYTE_LENGTH;
        if (!requestingPartyClearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RequestingPartyClearingFirmField.BYTE_LENGTH;
        if (!partyDetailStatus.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailStatusField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = partyDetailIdExecutingUnit.encode(data, cursor);
        cursor = requestingPartyIdExecutingSystem.encode(data, cursor);
        cursor = marketId.encode(data, cursor);
        cursor = listUpdateAction.encode(data, cursor);
        cursor = requestingPartyEnteringFirm.encode(data, cursor);
        cursor = requestingPartyClearingFirm.encode(data, cursor);
        cursor = partyDetailStatus.encode(data, cursor);
        if (buffer != null && buffer.length >= 82) {
            System.arraycopy(buffer, 76, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
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
        rbcHeaderComp.clear();
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
            case "TransactTime" -> Optional.of(transactTime);
            case "TradeDate" -> Optional.of(tradeDate);
            case "PartyDetailIdExecutingUnit" -> Optional.of(partyDetailIdExecutingUnit);
            case "RequestingPartyIdExecutingSystem" -> Optional.of(requestingPartyIdExecutingSystem);
            case "MarketId" -> Optional.of(marketId);
            case "ListUpdateAction" -> Optional.of(listUpdateAction);
            case "RequestingPartyEnteringFirm" -> Optional.of(requestingPartyEnteringFirm);
            case "RequestingPartyClearingFirm" -> Optional.of(requestingPartyClearingFirm);
            case "PartyDetailStatus" -> Optional.of(partyDetailStatus);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PartyEntitlementsUpdateReport message)) {
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
        if (!(other instanceof PartyEntitlementsUpdateReport message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
