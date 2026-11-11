package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.AckTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.BitfieldFlowIndicatorField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.BitfieldOrderInstructionsField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.ClOrdIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.LeavesQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.MinQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.MmidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.MpidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.MpsubidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.OrderIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.OrderQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.OrigClOrdIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.PreLiquidityIndicatorField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.PriceField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.ReasonCodeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.SymbolIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.TransactTimeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.UserDataField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.WorkingAwayFromDisplayField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.WorkingPriceField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.structs.OptionalOrderAddOn;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.structs.OptionalRoutingStrategyAddOn;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.structs.OptionalSettlementTypeAddOn;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.PrintOptions;

/**
 * Represents the OrderAndCancelReplaceAcknowledgementMessage message from the BinaryGateway protocol.
 *
 * <p>Exchange acknowledgement in response to an Order or Cancel/Replace request.</p>
 */
public final class OrderAndCancelReplaceAcknowledgementMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 98;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order And Cancel Replace Acknowledgement Message";

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
     * This value represents the integer representation of a Market Maker, LMM, SLP, SLMM or DMM, agreed upon between the firm and the Exchange
     */
    private final MmidField mmid = new MmidField();

    /**
     * Customer defined – identifies specific entity/trading desk of customer firm.
     */
    private final MpsubidField mpsubid = new MpsubidField();

    /**
     * Unique ID of the new Order, Cancel/Replace, Cancel, Modify, or Bulk Cancel request as assigned by the firm.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Refers to the ClOrdID of a previously entered order.
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * BitfieldOrderInstructions is a data structure defining a number of order instructions, attributes, and modifiers.
     */
    private final BitfieldOrderInstructionsField bitfieldOrderInstructions = new BitfieldOrderInstructionsField();

    /**
     * 0.000001-999999.999999
     */
    private final PriceField price = new PriceField();

    /**
     * 1 - 999,999,999
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * 0 = no MinQty Otherwise, Must be ≥ Round Lot and ≤ OrderQty
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Unique order identifier assigned by the Exchange.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Remaining quantity open on the order.
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Working price in the range 0.000001 to 999999.999999.
     */
    private final WorkingPriceField workingPrice = new WorkingPriceField();

    /**
     * Indicates whether the working price differs from the display price.
     */
    private final WorkingAwayFromDisplayField workingAwayFromDisplay = new WorkingAwayFromDisplayField();

    /**
     * Indicator describing the order’s potential to establish or join a displayed market.
     */
    private final PreLiquidityIndicatorField preLiquidityIndicator = new PreLiquidityIndicatorField();

    /**
     * Matching engine reason code qualifying the event that produced the message.
     */
    private final ReasonCodeField reasonCode = new ReasonCodeField();

    /**
     * Acknowledgement type indicating the result or status of the order action.
     */
    private final AckTypeField ackType = new AckTypeField();

    /**
     * BitfieldFlowIndicator is a data structure defining whether the inbound message was throttled.
     */
    private final BitfieldFlowIndicatorField bitfieldFlowIndicator = new BitfieldFlowIndicatorField();

    /**
     * Customer defined up to 8 characters; only printable ASCII characters allowed, excluding comma, semicolon, pipe delimiter, “at” symbol, greater than/less than, ampersand (&amp;) and single/double quotation mark..
     */
    private final UserDataField userData = new UserDataField();

    /**
     * OptionalOrderAddOn
     */
    private final OptionalOrderAddOn optionalOrderAddOn = new OptionalOrderAddOn();

    /**
     * OptionalRoutingStrategyAddOn
     */
    private final OptionalRoutingStrategyAddOn optionalRoutingStrategyAddOn = new OptionalRoutingStrategyAddOn();

    /**
     * OptionalSettlementTypeAddOn
     */
    private final OptionalSettlementTypeAddOn optionalSettlementTypeAddOn = new OptionalSettlementTypeAddOn();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, symbolId, mpid, mmid, mpsubid, clOrdId, origClOrdId, bitfieldOrderInstructions, price, orderQty, minQty, orderId, leavesQty, workingPrice, workingAwayFromDisplay, preLiquidityIndicator, reasonCode, ackType, bitfieldFlowIndicator, userData);

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
     * This value represents the integer representation of a Market Maker, LMM, SLP, SLMM or DMM, agreed upon between the firm and the Exchange
     *
     * @return the Mmid field
     */
    public MmidField mmid() {
        return mmid;
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
     * Unique ID of the new Order, Cancel/Replace, Cancel, Modify, or Bulk Cancel request as assigned by the firm.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Refers to the ClOrdID of a previously entered order.
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * BitfieldOrderInstructions is a data structure defining a number of order instructions, attributes, and modifiers.
     *
     * @return the BitfieldOrderInstructions field
     */
    public BitfieldOrderInstructionsField bitfieldOrderInstructions() {
        return bitfieldOrderInstructions;
    }

    /**
     * 0.000001-999999.999999
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * 1 - 999,999,999
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * 0 = no MinQty Otherwise, Must be ≥ Round Lot and ≤ OrderQty
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
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
     * Remaining quantity open on the order.
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Working price in the range 0.000001 to 999999.999999.
     *
     * @return the WorkingPrice field
     */
    public WorkingPriceField workingPrice() {
        return workingPrice;
    }

    /**
     * Indicates whether the working price differs from the display price.
     *
     * @return the WorkingAwayFromDisplay field
     */
    public WorkingAwayFromDisplayField workingAwayFromDisplay() {
        return workingAwayFromDisplay;
    }

    /**
     * Indicator describing the order’s potential to establish or join a displayed market.
     *
     * @return the PreLiquidityIndicator field
     */
    public PreLiquidityIndicatorField preLiquidityIndicator() {
        return preLiquidityIndicator;
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
     * Acknowledgement type indicating the result or status of the order action.
     *
     * @return the AckType field
     */
    public AckTypeField ackType() {
        return ackType;
    }

    /**
     * BitfieldFlowIndicator is a data structure defining whether the inbound message was throttled.
     *
     * @return the BitfieldFlowIndicator field
     */
    public BitfieldFlowIndicatorField bitfieldFlowIndicator() {
        return bitfieldFlowIndicator;
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
     * OptionalOrderAddOn
     *
     * @return the OptionalOrderAddOn record
     */
    public OptionalOrderAddOn optionalOrderAddOn() {
        return optionalOrderAddOn;
    }

    /**
     * OptionalRoutingStrategyAddOn
     *
     * @return the OptionalRoutingStrategyAddOn record
     */
    public OptionalRoutingStrategyAddOn optionalRoutingStrategyAddOn() {
        return optionalRoutingStrategyAddOn;
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
     * Returns whether the fields before the OptionalOrderAddOn put it on the wire.
     *
     * <p>Decode reads the OptionalOrderAddOn where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OptionalOrderAddOn is on the wire
     */
    public boolean optionalOrderAddOnPresent() {
        return seqMsgLengthInputKnown && seqMsgLengthInput == 143L;
    }

    /**
     * Returns whether the fields before the OptionalRoutingStrategyAddOn put it on the wire.
     *
     * <p>Decode reads the OptionalRoutingStrategyAddOn where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OptionalRoutingStrategyAddOn is on the wire
     */
    public boolean optionalRoutingStrategyAddOnPresent() {
        return seqMsgLengthInputKnown && seqMsgLengthInput == 134L;
    }

    /**
     * Returns whether the fields before the OptionalSettlementTypeAddOn put it on the wire.
     *
     * <p>Decode reads the OptionalSettlementTypeAddOn where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OptionalSettlementTypeAddOn is on the wire
     */
    public boolean optionalSettlementTypeAddOnPresent() {
        return seqMsgLengthInputKnown && seqMsgLengthInput == 107L;
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
        return MINIMUM_BYTE_LENGTH + (optionalOrderAddOnPresent() ? optionalOrderAddOn.byteLength() : 0) + (optionalRoutingStrategyAddOnPresent() ? optionalRoutingStrategyAddOn.byteLength() : 0) + (optionalSettlementTypeAddOnPresent() ? optionalSettlementTypeAddOn.byteLength() : 0);
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
        cursor += 4;
        cursor += 1;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 8;
        cursor += 4;
        cursor += 8;
        cursor += 1;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        if (optionalOrderAddOnPresent()) {
            for (int[] run = OptionalOrderAddOn.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
                runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
            }
            cursor += OptionalOrderAddOn.BYTE_LENGTH;
        }
        if (optionalRoutingStrategyAddOnPresent()) {
            for (int[] run = OptionalRoutingStrategyAddOn.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
                runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
            }
            cursor += OptionalRoutingStrategyAddOn.BYTE_LENGTH;
        }
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
        if (!mmid.parse(data, cursor)) {
            return false;
        }
        cursor += MmidField.BYTE_LENGTH;
        if (!mpsubid.parse(data, cursor)) {
            return false;
        }
        cursor += MpsubidField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!bitfieldOrderInstructions.parse(data, cursor)) {
            return false;
        }
        cursor += BitfieldOrderInstructionsField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!workingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += WorkingPriceField.BYTE_LENGTH;
        if (!workingAwayFromDisplay.parse(data, cursor)) {
            return false;
        }
        cursor += WorkingAwayFromDisplayField.BYTE_LENGTH;
        if (!preLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += PreLiquidityIndicatorField.BYTE_LENGTH;
        if (!reasonCode.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeField.BYTE_LENGTH;
        if (!ackType.parse(data, cursor)) {
            return false;
        }
        cursor += AckTypeField.BYTE_LENGTH;
        if (!bitfieldFlowIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BitfieldFlowIndicatorField.BYTE_LENGTH;
        if (!userData.parse(data, cursor)) {
            return false;
        }
        cursor += UserDataField.BYTE_LENGTH;
        if (optionalOrderAddOnPresent()) {
            if (!optionalOrderAddOn.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += optionalOrderAddOn.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }
        if (optionalRoutingStrategyAddOnPresent()) {
            if (!optionalRoutingStrategyAddOn.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += optionalRoutingStrategyAddOn.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }
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
        cursor = mmid.encode(data, cursor);
        cursor = mpsubid.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = bitfieldOrderInstructions.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = workingPrice.encode(data, cursor);
        cursor = workingAwayFromDisplay.encode(data, cursor);
        cursor = preLiquidityIndicator.encode(data, cursor);
        cursor = reasonCode.encode(data, cursor);
        cursor = ackType.encode(data, cursor);
        cursor = bitfieldFlowIndicator.encode(data, cursor);
        cursor = userData.encode(data, cursor);
        if (optionalOrderAddOnPresent()) {
            cursor = optionalOrderAddOn.encode(data, cursor);
        }
        if (optionalRoutingStrategyAddOnPresent()) {
            cursor = optionalRoutingStrategyAddOn.encode(data, cursor);
        }
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
        optionalOrderAddOn.clear();
        optionalRoutingStrategyAddOn.clear();
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
        if (optionalOrderAddOnPresent() && !optionalOrderAddOn.isRecognized()) {
            return false;
        }
        if (optionalRoutingStrategyAddOnPresent() && !optionalRoutingStrategyAddOn.isRecognized()) {
            return false;
        }
        return !optionalSettlementTypeAddOnPresent() || optionalSettlementTypeAddOn.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (optionalOrderAddOnPresent() && !optionalOrderAddOn.isValid()) {
            return false;
        }
        if (optionalRoutingStrategyAddOnPresent() && !optionalRoutingStrategyAddOn.isValid()) {
            return false;
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
            case "Mmid" -> Optional.of(mmid);
            case "Mpsubid" -> Optional.of(mpsubid);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "BitfieldOrderInstructions" -> Optional.of(bitfieldOrderInstructions);
            case "Price" -> Optional.of(price);
            case "OrderQty" -> Optional.of(orderQty);
            case "MinQty" -> Optional.of(minQty);
            case "OrderId" -> Optional.of(orderId);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "WorkingPrice" -> Optional.of(workingPrice);
            case "WorkingAwayFromDisplay" -> Optional.of(workingAwayFromDisplay);
            case "PreLiquidityIndicator" -> Optional.of(preLiquidityIndicator);
            case "ReasonCode" -> Optional.of(reasonCode);
            case "AckType" -> Optional.of(ackType);
            case "BitfieldFlowIndicator" -> Optional.of(bitfieldFlowIndicator);
            case "UserData" -> Optional.of(userData);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAndCancelReplaceAcknowledgementMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(optionalOrderAddOn.diffFields(message.optionalOrderAddOn));
        changed.addAll(optionalRoutingStrategyAddOn.diffFields(message.optionalRoutingStrategyAddOn));
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
            if (optionalOrderAddOnPresent()) {
                builder.append(", ");
                optionalOrderAddOn.toFormattedString(builder, options);
            }
            if (optionalRoutingStrategyAddOnPresent()) {
                builder.append(", ");
                optionalRoutingStrategyAddOn.toFormattedString(builder, options);
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
        if (optionalOrderAddOnPresent()) {
            optionalOrderAddOn.toFormattedString(builder, nested);
        }
        if (optionalRoutingStrategyAddOnPresent()) {
            optionalRoutingStrategyAddOn.toFormattedString(builder, nested);
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
        if (!(other instanceof OrderAndCancelReplaceAcknowledgementMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && optionalOrderAddOn.equals(message.optionalOrderAddOn) && optionalRoutingStrategyAddOn.equals(message.optionalRoutingStrategyAddOn) && optionalSettlementTypeAddOn.equals(message.optionalSettlementTypeAddOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, optionalOrderAddOn, optionalRoutingStrategyAddOn, optionalSettlementTypeAddOn);
    }
}
