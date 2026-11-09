package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ClOrdIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.CumQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.DealIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.DisplayedLiquidityIndicatorField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.LastPxField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.LastQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.LeavesQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.LiquidityIndicatorField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.LocateReqdUField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MpidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.OrderIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ParticipantTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ReasonCodeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SymbolIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.TransactTimeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.UserDataField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.structs.OptionalSettlementTypeAddOn;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.PrintOptions;

/**
 * Represents the ExecutionReportMessage message from the BinaryGateway protocol.
 *
 * <p>Returned on executions for Orders and indicates whether an order has been partially or entirely filled.</p>
 */
public final class ExecutionReportMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 80;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Message";

    /**
     * Exchange application time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Identification number assigned to the security
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Firm Identifier – MPID.
     */
    private final MpidField mpid = new MpidField();

    /**
     * Unique order identifier assigned by the Exchange.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Unique ID of the new Order, Cancel/Replace, Cancel, Modify, or Bulk Cancel request as assigned by the firm.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Unique identifier of a transaction assigned by the Exchange.
     */
    private final DealIdField dealId = new DealIdField();

    /**
     * Price of current partial fill or fill message.
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Remaining quantity open on the order.
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Cumulative quantity executed for the order.
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * Quantity of the current partial fill or fill.
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Liquidity indicator for partial fills and fills.
     */
    private final LiquidityIndicatorField liquidityIndicator = new LiquidityIndicatorField();

    /**
     * Displayed liquidity indicator.
     */
    private final DisplayedLiquidityIndicatorField displayedLiquidityIndicator = new DisplayedLiquidityIndicatorField();

    /**
     * 0 = No LocateReqd or not applicable. Orders with Side of Sell Short, Sell Short Exempt, Cross Short, or Cross Short Exempt must be entered with LocateReqd = 0 or will be rejected.
     */
    private final LocateReqdUField locateReqdU = new LocateReqdUField();

    /**
     * Identifies the participant type.
     */
    private final ParticipantTypeField participantType = new ParticipantTypeField();

    /**
     * Matching engine reason code qualifying the event that produced the message.
     */
    private final ReasonCodeField reasonCode = new ReasonCodeField();

    /**
     * Customer defined up to 8 characters; only printable ASCII characters allowed, excluding comma, semicolon, pipe delimiter, “at” symbol, greater than/less than, ampersand (&amp;) and single/double quotation mark..
     */
    private final UserDataField userData = new UserDataField();

    /**
     * OptionalSettlementTypeAddOn
     */
    private final OptionalSettlementTypeAddOn optionalSettlementTypeAddOn = new OptionalSettlementTypeAddOn();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, symbolId, mpid, orderId, clOrdId, dealId, lastPx, leavesQty, cumQty, lastQty, liquidityIndicator, displayedLiquidityIndicator, locateReqdU, participantType, reasonCode, userData);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange application time.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Identification number assigned to the security
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Firm Identifier – MPID.
     *
     * @return the Mpid field
     */
    public MpidField mpid() {
        return mpid;
    }

    /**
     * Unique order identifier assigned by the Exchange.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
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
     * Unique identifier of a transaction assigned by the Exchange.
     *
     * @return the DealId field
     */
    public DealIdField dealId() {
        return dealId;
    }

    /**
     * Price of current partial fill or fill message.
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Remaining quantity open on the order.
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Cumulative quantity executed for the order.
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
    }

    /**
     * Quantity of the current partial fill or fill.
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Liquidity indicator for partial fills and fills.
     *
     * @return the LiquidityIndicator field
     */
    public LiquidityIndicatorField liquidityIndicator() {
        return liquidityIndicator;
    }

    /**
     * Displayed liquidity indicator.
     *
     * @return the DisplayedLiquidityIndicator field
     */
    public DisplayedLiquidityIndicatorField displayedLiquidityIndicator() {
        return displayedLiquidityIndicator;
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
     * Identifies the participant type.
     *
     * @return the ParticipantType field
     */
    public ParticipantTypeField participantType() {
        return participantType;
    }

    /**
     * Matching engine reason code qualifying the event that produced the message.
     *
     * @return the ReasonCode field
     */
    public ReasonCodeField reasonCode() {
        return reasonCode;
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
     * OptionalSettlementTypeAddOn
     *
     * @return the OptionalSettlementTypeAddOn record
     */
    public OptionalSettlementTypeAddOn optionalSettlementTypeAddOn() {
        return optionalSettlementTypeAddOn;
    }

    /**
     * Returns whether the fields before the OptionalSettlementTypeAddOn put it on the wire.
     *
     * <p>Decode reads the OptionalSettlementTypeAddOn where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OptionalSettlementTypeAddOn is on the wire
     */
    public boolean optionalSettlementTypeAddOnPresent() {
        return seqMsgLengthInputKnown && seqMsgLengthInput == 89L;
    }

    private long seqMsgLengthInput;

    private boolean seqMsgLengthInputGiven;

    private boolean seqMsgLengthInputKnown;

    /**
     * Gives this message the SeqMsgLength that the bytes around it state, which its rules read.
     *
     * <p>Where none is given, a decode takes it from the bytes it is handed, which this message must then fill. A given value is kept until another is given.</p>
     *
     * @param value the SeqMsgLength
     */
    public void seqMsgLengthInput(long value) {
        this.seqMsgLengthInput = value;
        this.seqMsgLengthInputGiven = true;
        this.seqMsgLengthInputKnown = true;
    }

    /**
     * Returns the SeqMsgLength this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the SeqMsgLength, or empty when none is given or known
     */
    public OptionalLong seqMsgLengthInput() {
        return seqMsgLengthInputKnown ? OptionalLong.of(seqMsgLengthInput) : OptionalLong.empty();
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (optionalSettlementTypeAddOnPresent() ? optionalSettlementTypeAddOn.byteLength() : 0);
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
        cursor += 4;
        cursor += 4;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 2;
        cursor += 8;
        if (optionalSettlementTypeAddOnPresent()) {
            for (int[] run = OptionalSettlementTypeAddOn.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
                runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
            }
            cursor += OptionalSettlementTypeAddOn.BYTE_LENGTH;
        }
        return cursor;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        if (!seqMsgLengthInputGiven) {
            seqMsgLengthInput = (long) (end - offset) + 4L;
            seqMsgLengthInputKnown = true;
        }
        int cursor = offset;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!mpid.parse(data, cursor)) {
            return false;
        }
        cursor += MpidField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!dealId.parse(data, cursor)) {
            return false;
        }
        cursor += DealIdField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!liquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityIndicatorField.BYTE_LENGTH;
        if (!displayedLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayedLiquidityIndicatorField.BYTE_LENGTH;
        if (!locateReqdU.parse(data, cursor)) {
            return false;
        }
        cursor += LocateReqdUField.BYTE_LENGTH;
        if (!participantType.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantTypeField.BYTE_LENGTH;
        if (!reasonCode.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeField.BYTE_LENGTH;
        if (!userData.parse(data, cursor)) {
            return false;
        }
        cursor += UserDataField.BYTE_LENGTH;
        if (optionalSettlementTypeAddOnPresent()) {
            if (!optionalSettlementTypeAddOn.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += optionalSettlementTypeAddOn.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }

        return seqMsgLengthInputGiven || cursor == end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = mpid.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = dealId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = liquidityIndicator.encode(data, cursor);
        cursor = displayedLiquidityIndicator.encode(data, cursor);
        cursor = locateReqdU.encode(data, cursor);
        cursor = participantType.encode(data, cursor);
        cursor = reasonCode.encode(data, cursor);
        cursor = userData.encode(data, cursor);
        if (optionalSettlementTypeAddOnPresent()) {
            cursor = optionalSettlementTypeAddOn.encode(data, cursor);
        }
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
        optionalSettlementTypeAddOn.clear();
        this.seqMsgLengthInputKnown = seqMsgLengthInputGiven;
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
        if (optionalSettlementTypeAddOnPresent() && !optionalSettlementTypeAddOn.isRecognized()) {
            return false;
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
        if (optionalSettlementTypeAddOnPresent() && !optionalSettlementTypeAddOn.isValid()) {
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
            case "SymbolId" -> Optional.of(symbolId);
            case "Mpid" -> Optional.of(mpid);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "DealId" -> Optional.of(dealId);
            case "LastPx" -> Optional.of(lastPx);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "CumQty" -> Optional.of(cumQty);
            case "LastQty" -> Optional.of(lastQty);
            case "LiquidityIndicator" -> Optional.of(liquidityIndicator);
            case "DisplayedLiquidityIndicator" -> Optional.of(displayedLiquidityIndicator);
            case "LocateReqdU" -> Optional.of(locateReqdU);
            case "ParticipantType" -> Optional.of(participantType);
            case "ReasonCode" -> Optional.of(reasonCode);
            case "UserData" -> Optional.of(userData);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(optionalSettlementTypeAddOn.diffFields(message.optionalSettlementTypeAddOn));
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
            if (optionalSettlementTypeAddOnPresent()) {
                builder.append(", ");
                optionalSettlementTypeAddOn.toFormattedString(builder, options);
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
        if (optionalSettlementTypeAddOnPresent()) {
            optionalSettlementTypeAddOn.toFormattedString(builder, nested);
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
        if (!(other instanceof ExecutionReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && optionalSettlementTypeAddOn.equals(message.optionalSettlementTypeAddOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, optionalSettlementTypeAddOn);
    }
}
