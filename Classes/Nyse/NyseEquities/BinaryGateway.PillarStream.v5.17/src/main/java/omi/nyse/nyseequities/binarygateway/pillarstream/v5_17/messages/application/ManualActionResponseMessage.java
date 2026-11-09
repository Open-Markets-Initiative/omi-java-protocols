package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ClOrdIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.DmmRejectReasonField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.IntradaySellShortQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.LocateReqdUField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ManualResponseTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MpsubidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SelfTradeTypeBitsField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SellIndicatorField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SymbolIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.UserDataField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.structs.ManualActionId;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.PrintOptions;

/**
 * Represents the ManualActionResponseMessage message from the BinaryGateway protocol.
 *
 * <p>Response message used by a DMM to approve or reject a Manual Action Request. Depending on the ManualResponseType, this message may result in order creation or rejection with an optional reject reason.</p>
 */
public final class ManualActionResponseMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 65;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Manual Action Response Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Identification number assigned to the security
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Unique ID of the new Order, Cancel/Replace, Cancel, Modify, or Bulk Cancel request as assigned by the firm.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Sets the side for DMM requested quantity: 0=Not applicable, 2=Sell, 3=Sell Short, 4=Sell Short Exempt. Applicability depends on ManualActionType and request side.
     */
    private final SellIndicatorField sellIndicator = new SellIndicatorField();

    /**
     * Number of shares to mark as Sell Short for applicable ManualActionTypes. Populate 0 when not applicable.
     */
    private final IntradaySellShortQtyField intradaySellShortQty = new IntradaySellShortQtyField();

    /**
     * Customer defined – identifies specific entity/trading desk of customer firm.
     */
    private final MpsubidField mpsubid = new MpsubidField();

    /**
     * 0 = No LocateReqd or not applicable. Orders with Side of Sell Short, Sell Short Exempt, Cross Short, or Cross Short Exempt must be entered with LocateReqd = 0 or will be rejected.
     */
    private final LocateReqdUField locateReqdU = new LocateReqdUField();

    /**
     * Self-trade prevention setting: 0=Use default/Cancel Newest, 1=No STP, 2=Cancel Newest, 3=Cancel Oldest, 4=Cancel Both, 5=Cancel Decrement.
     */
    private final SelfTradeTypeBitsField selfTradeTypeBits = new SelfTradeTypeBitsField();

    /**
     * Customer defined up to 8 characters; only printable ASCII characters allowed, excluding comma, semicolon, pipe delimiter, “at” symbol, greater than/less than, ampersand (&amp;) and single/double quotation mark..
     */
    private final UserDataField userData = new UserDataField();

    /**
     * Response type: 1=Approve Manual Action Request, 2=Reject Manual Action Request.
     */
    private final ManualResponseTypeField manualResponseType = new ManualResponseTypeField();

    /**
     * Optional reject reason displayed on DBK GUI when ManualResponseType=2. Printable ASCII only.
     */
    private final DmmRejectReasonField dmmRejectReason = new DmmRejectReasonField();

    /**
     * ManualActionID
     */
    private final ManualActionId manualActionId = new ManualActionId();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(symbolId), List.<Field>of(clOrdId), manualActionId.fields(), List.<Field>of(sellIndicator), List.<Field>of(intradaySellShortQty), List.<Field>of(mpsubid), List.<Field>of(locateReqdU), List.<Field>of(selfTradeTypeBits), List.<Field>of(userData), List.<Field>of(manualResponseType), List.<Field>of(dmmRejectReason)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identification number assigned to the security
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Unique ID of the new Order, Cancel/Replace, Cancel, Modify, or Bulk Cancel request as assigned by the firm.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Sets the side for DMM requested quantity: 0=Not applicable, 2=Sell, 3=Sell Short, 4=Sell Short Exempt. Applicability depends on ManualActionType and request side.
     *
     * @return the SellIndicator field
     */
    public SellIndicatorField sellIndicator() {
        return sellIndicator;
    }

    /**
     * Number of shares to mark as Sell Short for applicable ManualActionTypes. Populate 0 when not applicable.
     *
     * @return the IntradaySellShortQty field
     */
    public IntradaySellShortQtyField intradaySellShortQty() {
        return intradaySellShortQty;
    }

    /**
     * Customer defined – identifies specific entity/trading desk of customer firm.
     *
     * @return the Mpsubid field
     */
    public MpsubidField mpsubid() {
        return mpsubid;
    }

    /**
     * 0 = No LocateReqd or not applicable. Orders with Side of Sell Short, Sell Short Exempt, Cross Short, or Cross Short Exempt must be entered with LocateReqd = 0 or will be rejected.
     *
     * @return the LocateReqdU field
     */
    public LocateReqdUField locateReqdU() {
        return locateReqdU;
    }

    /**
     * Self-trade prevention setting: 0=Use default/Cancel Newest, 1=No STP, 2=Cancel Newest, 3=Cancel Oldest, 4=Cancel Both, 5=Cancel Decrement.
     *
     * @return the SelfTradeTypeBits field
     */
    public SelfTradeTypeBitsField selfTradeTypeBits() {
        return selfTradeTypeBits;
    }

    /**
     * Customer defined up to 8 characters; only printable ASCII characters allowed, excluding comma, semicolon, pipe delimiter, “at” symbol, greater than/less than, ampersand (&amp;) and single/double quotation mark..
     *
     * @return the UserData field
     */
    public UserDataField userData() {
        return userData;
    }

    /**
     * Response type: 1=Approve Manual Action Request, 2=Reject Manual Action Request.
     *
     * @return the ManualResponseType field
     */
    public ManualResponseTypeField manualResponseType() {
        return manualResponseType;
    }

    /**
     * Optional reject reason displayed on DBK GUI when ManualResponseType=2. Printable ASCII only.
     *
     * @return the DmmRejectReason field
     */
    public DmmRejectReasonField dmmRejectReason() {
        return dmmRejectReason;
    }

    /**
     * ManualActionID
     *
     * @return the ManualActionId record
     */
    public ManualActionId manualActionId() {
        return manualActionId;
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
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!manualActionId.parseFrom(data, cursor, end - 37)) {
            return false;
        }
        cursor += manualActionId.byteLength();
        if (!sellIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SellIndicatorField.BYTE_LENGTH;
        if (!intradaySellShortQty.parse(data, cursor)) {
            return false;
        }
        cursor += IntradaySellShortQtyField.BYTE_LENGTH;
        if (!mpsubid.parse(data, cursor)) {
            return false;
        }
        cursor += MpsubidField.BYTE_LENGTH;
        if (!locateReqdU.parse(data, cursor)) {
            return false;
        }
        cursor += LocateReqdUField.BYTE_LENGTH;
        if (!selfTradeTypeBits.parse(data, cursor)) {
            return false;
        }
        cursor += SelfTradeTypeBitsField.BYTE_LENGTH;
        if (!userData.parse(data, cursor)) {
            return false;
        }
        cursor += UserDataField.BYTE_LENGTH;
        if (!manualResponseType.parse(data, cursor)) {
            return false;
        }
        cursor += ManualResponseTypeField.BYTE_LENGTH;
        if (!dmmRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += DmmRejectReasonField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbolId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = manualActionId.encode(data, cursor);
        cursor = sellIndicator.encode(data, cursor);
        cursor = intradaySellShortQty.encode(data, cursor);
        cursor = mpsubid.encode(data, cursor);
        cursor = locateReqdU.encode(data, cursor);
        cursor = selfTradeTypeBits.encode(data, cursor);
        cursor = userData.encode(data, cursor);
        cursor = manualResponseType.encode(data, cursor);
        cursor = dmmRejectReason.encode(data, cursor);
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
        manualActionId.clear();
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
            case "SymbolId" -> Optional.of(symbolId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "SellIndicator" -> Optional.of(sellIndicator);
            case "IntradaySellShortQty" -> Optional.of(intradaySellShortQty);
            case "Mpsubid" -> Optional.of(mpsubid);
            case "LocateReqdU" -> Optional.of(locateReqdU);
            case "SelfTradeTypeBits" -> Optional.of(selfTradeTypeBits);
            case "UserData" -> Optional.of(userData);
            case "ManualResponseType" -> Optional.of(manualResponseType);
            case "DmmRejectReason" -> Optional.of(dmmRejectReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ManualActionResponseMessage message)) {
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
        if (!(other instanceof ManualActionResponseMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
