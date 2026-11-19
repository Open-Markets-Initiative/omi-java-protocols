package omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.BookOutTimeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientOrderIdOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.EmmField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ExecutionIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ExecutionPhaseField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.LastSharesField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.LastTradedPxField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.LeavesQtyField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MsgSeqNumField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegInFromMeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegOutToMemberOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SideField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SymbolIndexField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.TradeQualifierField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.TradeTimeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.TradeTypeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.FillOptionalFieldGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.FillStrategyFieldGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the FillMessage message from the OrderEntryGateway protocol.
 *
 * <p>FillMessage</p>
 */
public final class FillMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 101;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Fill Message";

    /**
     * msgSeqNum
     */
    private final MsgSeqNumField msgSeqNum = new MsgSeqNumField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * tradeTime
     */
    private final TradeTimeField tradeTime = new TradeTimeField();

    /**
     * bookOUTTime
     */
    private final BookOutTimeOptionalField bookOutTimeOptional = new BookOutTimeOptionalField();

    /**
     * oEGINFromME
     */
    private final OegInFromMeOptionalField oegInFromMeOptional = new OegInFromMeOptionalField();

    /**
     * oEGOUTToMember
     */
    private final OegOutToMemberOptionalField oegOutToMemberOptional = new OegOutToMemberOptionalField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdOptionalField clientOrderIdOptional = new ClientOrderIdOptionalField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * tradeType
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * TradeQualifier_set bit set
     */
    private final TradeQualifierField tradeQualifier = new TradeQualifierField();

    /**
     * orderID
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * lastTradedPx
     */
    private final LastTradedPxField lastTradedPx = new LastTradedPxField();

    /**
     * lastShares
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * leavesQty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * executionID
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * executionPhase
     */
    private final ExecutionPhaseField executionPhase = new ExecutionPhaseField();

    /**
     * OptionalFieldsFill Block
     */
    private final FillOptionalFieldGroups fillOptionalFieldGroups = new FillOptionalFieldGroups();

    /**
     * StrategyFields Block
     */
    private final FillStrategyFieldGroups fillStrategyFieldGroups = new FillStrategyFieldGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, firmId, tradeTime, bookOutTimeOptional, oegInFromMeOptional, oegOutToMemberOptional, clientOrderIdOptional, symbolIndex, emm, side, tradeType, tradeQualifier, orderId, lastTradedPx, lastShares, leavesQty, executionId, executionPhase);

    private byte[] buffer;

    private boolean decoded;

    /**
     * msgSeqNum
     *
     * @return the MsgSeqNum field
     */
    public MsgSeqNumField msgSeqNum() {
        return msgSeqNum;
    }

    /**
     * firmID
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * tradeTime
     *
     * @return the TradeTime field
     */
    public TradeTimeField tradeTime() {
        return tradeTime;
    }

    /**
     * bookOUTTime
     *
     * @return the BookOutTimeOptional field
     */
    public BookOutTimeOptionalField bookOutTimeOptional() {
        return bookOutTimeOptional;
    }

    /**
     * oEGINFromME
     *
     * @return the OegInFromMeOptional field
     */
    public OegInFromMeOptionalField oegInFromMeOptional() {
        return oegInFromMeOptional;
    }

    /**
     * oEGOUTToMember
     *
     * @return the OegOutToMemberOptional field
     */
    public OegOutToMemberOptionalField oegOutToMemberOptional() {
        return oegOutToMemberOptional;
    }

    /**
     * clientOrderID
     *
     * @return the ClientOrderIdOptional field
     */
    public ClientOrderIdOptionalField clientOrderIdOptional() {
        return clientOrderIdOptional;
    }

    /**
     * symbolIndex
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * eMM
     *
     * @return the Emm field
     */
    public EmmField emm() {
        return emm;
    }

    /**
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * TradeQualifier_set bit set
     *
     * @return the TradeQualifier field
     */
    public TradeQualifierField tradeQualifier() {
        return tradeQualifier;
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
     * lastTradedPx
     *
     * @return the LastTradedPx field
     */
    public LastTradedPxField lastTradedPx() {
        return lastTradedPx;
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
     * leavesQty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * executionID
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * executionPhase
     *
     * @return the ExecutionPhase field
     */
    public ExecutionPhaseField executionPhase() {
        return executionPhase;
    }

    /**
     * OptionalFieldsFill Block
     *
     * @return the FillOptionalFieldGroups record
     */
    public FillOptionalFieldGroups fillOptionalFieldGroups() {
        return fillOptionalFieldGroups;
    }

    /**
     * StrategyFields Block
     *
     * @return the FillStrategyFieldGroups record
     */
    public FillStrategyFieldGroups fillStrategyFieldGroups() {
        return fillStrategyFieldGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + fillOptionalFieldGroups.byteLength() - FillOptionalFieldGroups.MINIMUM_BYTE_LENGTH + fillStrategyFieldGroups.byteLength() - FillStrategyFieldGroups.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!msgSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += MsgSeqNumField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!tradeTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTimeField.BYTE_LENGTH;
        if (!bookOutTimeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += BookOutTimeOptionalField.BYTE_LENGTH;
        if (!oegInFromMeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OegInFromMeOptionalField.BYTE_LENGTH;
        if (!oegOutToMemberOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OegOutToMemberOptionalField.BYTE_LENGTH;
        if (!clientOrderIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdOptionalField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!tradeQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += TradeQualifierField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!lastTradedPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradedPxField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        if (!executionPhase.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionPhaseField.BYTE_LENGTH;
        if (!fillOptionalFieldGroups.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += fillOptionalFieldGroups.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!fillStrategyFieldGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += fillStrategyFieldGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = tradeTime.encode(data, cursor);
        cursor = bookOutTimeOptional.encode(data, cursor);
        cursor = oegInFromMeOptional.encode(data, cursor);
        cursor = oegOutToMemberOptional.encode(data, cursor);
        cursor = clientOrderIdOptional.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = tradeQualifier.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = lastTradedPx.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = executionPhase.encode(data, cursor);
        cursor = fillOptionalFieldGroups.encode(data, cursor);
        cursor = fillStrategyFieldGroups.encode(data, cursor);
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
        fillOptionalFieldGroups.clear();
        fillStrategyFieldGroups.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        if (!fillOptionalFieldGroups.isRecognized()) {
            return false;
        }
        return fillStrategyFieldGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!fillOptionalFieldGroups.isValid()) {
            return false;
        }
        if (!fillStrategyFieldGroups.isValid()) {
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
        if (!msgSeqNum.isDecoded()) {
            return Optional.of(msgSeqNum);
        }
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!tradeTime.isDecoded()) {
            return Optional.of(tradeTime);
        }
        if (!bookOutTimeOptional.isDecoded()) {
            return Optional.of(bookOutTimeOptional);
        }
        if (!oegInFromMeOptional.isDecoded()) {
            return Optional.of(oegInFromMeOptional);
        }
        if (!oegOutToMemberOptional.isDecoded()) {
            return Optional.of(oegOutToMemberOptional);
        }
        if (!clientOrderIdOptional.isDecoded()) {
            return Optional.of(clientOrderIdOptional);
        }
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!emm.isDecoded()) {
            return Optional.of(emm);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!tradeType.isDecoded()) {
            return Optional.of(tradeType);
        }
        if (!tradeQualifier.isDecoded()) {
            return Optional.of(tradeQualifier);
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!lastTradedPx.isDecoded()) {
            return Optional.of(lastTradedPx);
        }
        if (!lastShares.isDecoded()) {
            return Optional.of(lastShares);
        }
        if (!leavesQty.isDecoded()) {
            return Optional.of(leavesQty);
        }
        if (!executionId.isDecoded()) {
            return Optional.of(executionId);
        }
        if (!executionPhase.isDecoded()) {
            return Optional.of(executionPhase);
        }
        if (!fillOptionalFieldGroups.isDecoded()) {
            return fillOptionalFieldGroups.failedAt();
        }
        if (!fillStrategyFieldGroups.isDecoded()) {
            return fillStrategyFieldGroups.failedAt();
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
            case "MsgSeqNum" -> Optional.of(msgSeqNum);
            case "FirmId" -> Optional.of(firmId);
            case "TradeTime" -> Optional.of(tradeTime);
            case "BookOutTimeOptional" -> Optional.of(bookOutTimeOptional);
            case "OegInFromMeOptional" -> Optional.of(oegInFromMeOptional);
            case "OegOutToMemberOptional" -> Optional.of(oegOutToMemberOptional);
            case "ClientOrderIdOptional" -> Optional.of(clientOrderIdOptional);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "Emm" -> Optional.of(emm);
            case "Side" -> Optional.of(side);
            case "TradeType" -> Optional.of(tradeType);
            case "TradeQualifier" -> Optional.of(tradeQualifier);
            case "OrderId" -> Optional.of(orderId);
            case "LastTradedPx" -> Optional.of(lastTradedPx);
            case "LastShares" -> Optional.of(lastShares);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "ExecutionId" -> Optional.of(executionId);
            case "ExecutionPhase" -> Optional.of(executionPhase);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FillMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(fillOptionalFieldGroups.diffFields(message.fillOptionalFieldGroups));
        changed.addAll(fillStrategyFieldGroups.diffFields(message.fillStrategyFieldGroups));
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
            fillOptionalFieldGroups.toFormattedString(builder, options);
            builder.append(", ");
            fillStrategyFieldGroups.toFormattedString(builder, options);
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
        fillOptionalFieldGroups.toFormattedString(builder, nested);
        fillStrategyFieldGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof FillMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && fillOptionalFieldGroups.equals(message.fillOptionalFieldGroups) && fillStrategyFieldGroups.equals(message.fillStrategyFieldGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fillOptionalFieldGroups, fillStrategyFieldGroups);
    }
}
