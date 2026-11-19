package omi.euronext.optiq.dropcopygateway.sbe.v5_36.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.CrossOrderIndicatorField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.EventIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.ExecutionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.GuaranteeFlagOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.PublicationTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.SessionOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.SettlementFlagOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.SettlementPeriodOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.TradeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.TradeTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.structs.DCShortTradeDeclarationMessageShortTradeDeclarationsGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.types.PrintOptions;

/**
 * Represents the DcShortTradeDeclarationMessage message from the DropCopyGateway protocol.
 *
 * <p>DCShortTradeDeclarationMessage</p>
 */
public final class DcShortTradeDeclarationMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 61;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dc Short Trade Declaration Message";

    /**
     * msgSeqNum
     */
    private final MsgSeqNumField msgSeqNum = new MsgSeqNumField();

    /**
     * produceTime
     */
    private final ProduceTimeField produceTime = new ProduceTimeField();

    /**
     * consumeTime
     */
    private final ConsumeTimeField consumeTime = new ConsumeTimeField();

    /**
     * eventId
     */
    private final EventIdField eventId = new EventIdField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * executionID
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * crossOrderIndicator
     */
    private final CrossOrderIndicatorField crossOrderIndicator = new CrossOrderIndicatorField();

    /**
     * tradeTime
     */
    private final TradeTimeField tradeTime = new TradeTimeField();

    /**
     * publicationTime
     */
    private final PublicationTimeField publicationTime = new PublicationTimeField();

    /**
     * session
     */
    private final SessionOptionalField sessionOptional = new SessionOptionalField();

    /**
     * tradeType
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * settlementPeriod
     */
    private final SettlementPeriodOptionalField settlementPeriodOptional = new SettlementPeriodOptionalField();

    /**
     * settlementFlag
     */
    private final SettlementFlagOptionalField settlementFlagOptional = new SettlementFlagOptionalField();

    /**
     * guaranteeFlag
     */
    private final GuaranteeFlagOptionalField guaranteeFlagOptional = new GuaranteeFlagOptionalField();

    /**
     * ShortTradeDeclarations Block
     */
    private final DCShortTradeDeclarationMessageShortTradeDeclarationsGroups dCShortTradeDeclarationMessageShortTradeDeclarationsGroups = new DCShortTradeDeclarationMessageShortTradeDeclarationsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, eventId, emm, symbolIndex, executionId, crossOrderIndicator, tradeTime, publicationTime, sessionOptional, tradeType, settlementPeriodOptional, settlementFlagOptional, guaranteeFlagOptional);

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
     * produceTime
     *
     * @return the ProduceTime field
     */
    public ProduceTimeField produceTime() {
        return produceTime;
    }

    /**
     * consumeTime
     *
     * @return the ConsumeTime field
     */
    public ConsumeTimeField consumeTime() {
        return consumeTime;
    }

    /**
     * eventId
     *
     * @return the EventId field
     */
    public EventIdField eventId() {
        return eventId;
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
     * symbolIndex
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
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
     * crossOrderIndicator
     *
     * @return the CrossOrderIndicator field
     */
    public CrossOrderIndicatorField crossOrderIndicator() {
        return crossOrderIndicator;
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
     * publicationTime
     *
     * @return the PublicationTime field
     */
    public PublicationTimeField publicationTime() {
        return publicationTime;
    }

    /**
     * session
     *
     * @return the SessionOptional field
     */
    public SessionOptionalField sessionOptional() {
        return sessionOptional;
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
     * settlementPeriod
     *
     * @return the SettlementPeriodOptional field
     */
    public SettlementPeriodOptionalField settlementPeriodOptional() {
        return settlementPeriodOptional;
    }

    /**
     * settlementFlag
     *
     * @return the SettlementFlagOptional field
     */
    public SettlementFlagOptionalField settlementFlagOptional() {
        return settlementFlagOptional;
    }

    /**
     * guaranteeFlag
     *
     * @return the GuaranteeFlagOptional field
     */
    public GuaranteeFlagOptionalField guaranteeFlagOptional() {
        return guaranteeFlagOptional;
    }

    /**
     * ShortTradeDeclarations Block
     *
     * @return the DCShortTradeDeclarationMessageShortTradeDeclarationsGroups record
     */
    public DCShortTradeDeclarationMessageShortTradeDeclarationsGroups dCShortTradeDeclarationMessageShortTradeDeclarationsGroups() {
        return dCShortTradeDeclarationMessageShortTradeDeclarationsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.byteLength() - DCShortTradeDeclarationMessageShortTradeDeclarationsGroups.MINIMUM_BYTE_LENGTH;
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
        if (!produceTime.parse(data, cursor)) {
            return false;
        }
        cursor += ProduceTimeField.BYTE_LENGTH;
        if (!consumeTime.parse(data, cursor)) {
            return false;
        }
        cursor += ConsumeTimeField.BYTE_LENGTH;
        if (!eventId.parse(data, cursor)) {
            return false;
        }
        cursor += EventIdField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        if (!crossOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CrossOrderIndicatorField.BYTE_LENGTH;
        if (!tradeTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTimeField.BYTE_LENGTH;
        if (!publicationTime.parse(data, cursor)) {
            return false;
        }
        cursor += PublicationTimeField.BYTE_LENGTH;
        if (!sessionOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SessionOptionalField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!settlementPeriodOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPeriodOptionalField.BYTE_LENGTH;
        if (!settlementFlagOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementFlagOptionalField.BYTE_LENGTH;
        if (!guaranteeFlagOptional.parse(data, cursor)) {
            return false;
        }
        cursor += GuaranteeFlagOptionalField.BYTE_LENGTH;
        if (!dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = produceTime.encode(data, cursor);
        cursor = consumeTime.encode(data, cursor);
        cursor = eventId.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = crossOrderIndicator.encode(data, cursor);
        cursor = tradeTime.encode(data, cursor);
        cursor = publicationTime.encode(data, cursor);
        cursor = sessionOptional.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = settlementPeriodOptional.encode(data, cursor);
        cursor = settlementFlagOptional.encode(data, cursor);
        cursor = guaranteeFlagOptional.encode(data, cursor);
        cursor = dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.encode(data, cursor);
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
        dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.clear();
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
        return dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.isRecognized();
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
        if (!dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.isValid()) {
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
        if (!produceTime.isDecoded()) {
            return Optional.of(produceTime);
        }
        if (!consumeTime.isDecoded()) {
            return Optional.of(consumeTime);
        }
        if (!eventId.isDecoded()) {
            return Optional.of(eventId);
        }
        if (!emm.isDecoded()) {
            return Optional.of(emm);
        }
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!executionId.isDecoded()) {
            return Optional.of(executionId);
        }
        if (!crossOrderIndicator.isDecoded()) {
            return Optional.of(crossOrderIndicator);
        }
        if (!tradeTime.isDecoded()) {
            return Optional.of(tradeTime);
        }
        if (!publicationTime.isDecoded()) {
            return Optional.of(publicationTime);
        }
        if (!sessionOptional.isDecoded()) {
            return Optional.of(sessionOptional);
        }
        if (!tradeType.isDecoded()) {
            return Optional.of(tradeType);
        }
        if (!settlementPeriodOptional.isDecoded()) {
            return Optional.of(settlementPeriodOptional);
        }
        if (!settlementFlagOptional.isDecoded()) {
            return Optional.of(settlementFlagOptional);
        }
        if (!guaranteeFlagOptional.isDecoded()) {
            return Optional.of(guaranteeFlagOptional);
        }
        if (!dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.isDecoded()) {
            return dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.failedAt();
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
            case "ProduceTime" -> Optional.of(produceTime);
            case "ConsumeTime" -> Optional.of(consumeTime);
            case "EventId" -> Optional.of(eventId);
            case "Emm" -> Optional.of(emm);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "ExecutionId" -> Optional.of(executionId);
            case "CrossOrderIndicator" -> Optional.of(crossOrderIndicator);
            case "TradeTime" -> Optional.of(tradeTime);
            case "PublicationTime" -> Optional.of(publicationTime);
            case "SessionOptional" -> Optional.of(sessionOptional);
            case "TradeType" -> Optional.of(tradeType);
            case "SettlementPeriodOptional" -> Optional.of(settlementPeriodOptional);
            case "SettlementFlagOptional" -> Optional.of(settlementFlagOptional);
            case "GuaranteeFlagOptional" -> Optional.of(guaranteeFlagOptional);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DcShortTradeDeclarationMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.diffFields(message.dCShortTradeDeclarationMessageShortTradeDeclarationsGroups));
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
            dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.toFormattedString(builder, options);
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
        dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof DcShortTradeDeclarationMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && dCShortTradeDeclarationMessageShortTradeDeclarationsGroups.equals(message.dCShortTradeDeclarationMessageShortTradeDeclarationsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, dCShortTradeDeclarationMessageShortTradeDeclarationsGroups);
    }
}
