package omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.BookStateField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.ChangeTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.ContractSymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.EventIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.EventTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.InstrumentOrderEntryQualifierField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.InstrumentStateField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.OrderEntryQualifierField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.PhaseIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.PhaseQualifierField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.PhaseTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.PriceLimitStyleField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.PriceLimitsField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.QuoteSpreadMultiplierField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.ScheduledEventField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.ScheduledEventTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.SessionField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.StatusReasonField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.TradingGroupOrderEntryQualifierField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.TradingGroupStateField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.TradingPeriodField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.TradingSideField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.types.PrintOptions;

/**
 * Represents the DcMarketStatusChangeMessage message from the DropCopyGateway protocol.
 *
 * <p>DCMarketStatusChangeMessage</p>
 */
public final class DcMarketStatusChangeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 79;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dc Market Status Change Message";

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
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * eventId
     */
    private final EventIdField eventId = new EventIdField();

    /**
     * phaseId
     */
    private final PhaseIdField phaseId = new PhaseIdField();

    /**
     * tradingGroupState
     */
    private final TradingGroupStateField tradingGroupState = new TradingGroupStateField();

    /**
     * instrumentState
     */
    private final InstrumentStateField instrumentState = new InstrumentStateField();

    /**
     * changeType
     */
    private final ChangeTypeField changeType = new ChangeTypeField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * eventTime
     */
    private final EventTimeField eventTime = new EventTimeField();

    /**
     * bookState
     */
    private final BookStateField bookState = new BookStateField();

    /**
     * statusReason
     */
    private final StatusReasonField statusReason = new StatusReasonField();

    /**
     * PhaseQualifier_set bit set
     */
    private final PhaseQualifierField phaseQualifier = new PhaseQualifierField();

    /**
     * tradingPeriod
     */
    private final TradingPeriodField tradingPeriod = new TradingPeriodField();

    /**
     * tradingSide
     */
    private final TradingSideField tradingSide = new TradingSideField();

    /**
     * priceLimits
     */
    private final PriceLimitsField priceLimits = new PriceLimitsField();

    /**
     * quoteSpreadMultiplier
     */
    private final QuoteSpreadMultiplierField quoteSpreadMultiplier = new QuoteSpreadMultiplierField();

    /**
     * orderEntryQualifier
     */
    private final OrderEntryQualifierField orderEntryQualifier = new OrderEntryQualifierField();

    /**
     * session
     */
    private final SessionField session = new SessionField();

    /**
     * scheduledEvent
     */
    private final ScheduledEventField scheduledEvent = new ScheduledEventField();

    /**
     * scheduledEventTime
     */
    private final ScheduledEventTimeField scheduledEventTime = new ScheduledEventTimeField();

    /**
     * tradingGroupOrderEntryQualifier
     */
    private final TradingGroupOrderEntryQualifierField tradingGroupOrderEntryQualifier = new TradingGroupOrderEntryQualifierField();

    /**
     * instrumentOrderEntryQualifier
     */
    private final InstrumentOrderEntryQualifierField instrumentOrderEntryQualifier = new InstrumentOrderEntryQualifierField();

    /**
     * phaseTime
     */
    private final PhaseTimeField phaseTime = new PhaseTimeField();

    /**
     * contractSymbolIndex
     */
    private final ContractSymbolIndexField contractSymbolIndex = new ContractSymbolIndexField();

    /**
     * priceLimitStyle
     */
    private final PriceLimitStyleField priceLimitStyle = new PriceLimitStyleField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, emm, eventId, phaseId, tradingGroupState, instrumentState, changeType, symbolIndex, eventTime, bookState, statusReason, phaseQualifier, tradingPeriod, tradingSide, priceLimits, quoteSpreadMultiplier, orderEntryQualifier, session, scheduledEvent, scheduledEventTime, tradingGroupOrderEntryQualifier, instrumentOrderEntryQualifier, phaseTime, contractSymbolIndex, priceLimitStyle);

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
     * eMM
     *
     * @return the Emm field
     */
    public EmmField emm() {
        return emm;
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
     * phaseId
     *
     * @return the PhaseId field
     */
    public PhaseIdField phaseId() {
        return phaseId;
    }

    /**
     * tradingGroupState
     *
     * @return the TradingGroupState field
     */
    public TradingGroupStateField tradingGroupState() {
        return tradingGroupState;
    }

    /**
     * instrumentState
     *
     * @return the InstrumentState field
     */
    public InstrumentStateField instrumentState() {
        return instrumentState;
    }

    /**
     * changeType
     *
     * @return the ChangeType field
     */
    public ChangeTypeField changeType() {
        return changeType;
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
     * eventTime
     *
     * @return the EventTime field
     */
    public EventTimeField eventTime() {
        return eventTime;
    }

    /**
     * bookState
     *
     * @return the BookState field
     */
    public BookStateField bookState() {
        return bookState;
    }

    /**
     * statusReason
     *
     * @return the StatusReason field
     */
    public StatusReasonField statusReason() {
        return statusReason;
    }

    /**
     * PhaseQualifier_set bit set
     *
     * @return the PhaseQualifier field
     */
    public PhaseQualifierField phaseQualifier() {
        return phaseQualifier;
    }

    /**
     * tradingPeriod
     *
     * @return the TradingPeriod field
     */
    public TradingPeriodField tradingPeriod() {
        return tradingPeriod;
    }

    /**
     * tradingSide
     *
     * @return the TradingSide field
     */
    public TradingSideField tradingSide() {
        return tradingSide;
    }

    /**
     * priceLimits
     *
     * @return the PriceLimits field
     */
    public PriceLimitsField priceLimits() {
        return priceLimits;
    }

    /**
     * quoteSpreadMultiplier
     *
     * @return the QuoteSpreadMultiplier field
     */
    public QuoteSpreadMultiplierField quoteSpreadMultiplier() {
        return quoteSpreadMultiplier;
    }

    /**
     * orderEntryQualifier
     *
     * @return the OrderEntryQualifier field
     */
    public OrderEntryQualifierField orderEntryQualifier() {
        return orderEntryQualifier;
    }

    /**
     * session
     *
     * @return the Session field
     */
    public SessionField session() {
        return session;
    }

    /**
     * scheduledEvent
     *
     * @return the ScheduledEvent field
     */
    public ScheduledEventField scheduledEvent() {
        return scheduledEvent;
    }

    /**
     * scheduledEventTime
     *
     * @return the ScheduledEventTime field
     */
    public ScheduledEventTimeField scheduledEventTime() {
        return scheduledEventTime;
    }

    /**
     * tradingGroupOrderEntryQualifier
     *
     * @return the TradingGroupOrderEntryQualifier field
     */
    public TradingGroupOrderEntryQualifierField tradingGroupOrderEntryQualifier() {
        return tradingGroupOrderEntryQualifier;
    }

    /**
     * instrumentOrderEntryQualifier
     *
     * @return the InstrumentOrderEntryQualifier field
     */
    public InstrumentOrderEntryQualifierField instrumentOrderEntryQualifier() {
        return instrumentOrderEntryQualifier;
    }

    /**
     * phaseTime
     *
     * @return the PhaseTime field
     */
    public PhaseTimeField phaseTime() {
        return phaseTime;
    }

    /**
     * contractSymbolIndex
     *
     * @return the ContractSymbolIndex field
     */
    public ContractSymbolIndexField contractSymbolIndex() {
        return contractSymbolIndex;
    }

    /**
     * priceLimitStyle
     *
     * @return the PriceLimitStyle field
     */
    public PriceLimitStyleField priceLimitStyle() {
        return priceLimitStyle;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
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
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!eventId.parse(data, cursor)) {
            return false;
        }
        cursor += EventIdField.BYTE_LENGTH;
        if (!phaseId.parse(data, cursor)) {
            return false;
        }
        cursor += PhaseIdField.BYTE_LENGTH;
        if (!tradingGroupState.parse(data, cursor)) {
            return false;
        }
        cursor += TradingGroupStateField.BYTE_LENGTH;
        if (!instrumentState.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentStateField.BYTE_LENGTH;
        if (!changeType.parse(data, cursor)) {
            return false;
        }
        cursor += ChangeTypeField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!eventTime.parse(data, cursor)) {
            return false;
        }
        cursor += EventTimeField.BYTE_LENGTH;
        if (!bookState.parse(data, cursor)) {
            return false;
        }
        cursor += BookStateField.BYTE_LENGTH;
        if (!statusReason.parse(data, cursor)) {
            return false;
        }
        cursor += StatusReasonField.BYTE_LENGTH;
        if (!phaseQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += PhaseQualifierField.BYTE_LENGTH;
        if (!tradingPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += TradingPeriodField.BYTE_LENGTH;
        if (!tradingSide.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSideField.BYTE_LENGTH;
        if (!priceLimits.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLimitsField.BYTE_LENGTH;
        if (!quoteSpreadMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteSpreadMultiplierField.BYTE_LENGTH;
        if (!orderEntryQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += OrderEntryQualifierField.BYTE_LENGTH;
        if (!session.parse(data, cursor)) {
            return false;
        }
        cursor += SessionField.BYTE_LENGTH;
        if (!scheduledEvent.parse(data, cursor)) {
            return false;
        }
        cursor += ScheduledEventField.BYTE_LENGTH;
        if (!scheduledEventTime.parse(data, cursor)) {
            return false;
        }
        cursor += ScheduledEventTimeField.BYTE_LENGTH;
        if (!tradingGroupOrderEntryQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += TradingGroupOrderEntryQualifierField.BYTE_LENGTH;
        if (!instrumentOrderEntryQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentOrderEntryQualifierField.BYTE_LENGTH;
        if (!phaseTime.parse(data, cursor)) {
            return false;
        }
        cursor += PhaseTimeField.BYTE_LENGTH;
        if (!contractSymbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSymbolIndexField.BYTE_LENGTH;
        return priceLimitStyle.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = produceTime.encode(data, cursor);
        cursor = consumeTime.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = eventId.encode(data, cursor);
        cursor = phaseId.encode(data, cursor);
        cursor = tradingGroupState.encode(data, cursor);
        cursor = instrumentState.encode(data, cursor);
        cursor = changeType.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = eventTime.encode(data, cursor);
        cursor = bookState.encode(data, cursor);
        cursor = statusReason.encode(data, cursor);
        cursor = phaseQualifier.encode(data, cursor);
        cursor = tradingPeriod.encode(data, cursor);
        cursor = tradingSide.encode(data, cursor);
        cursor = priceLimits.encode(data, cursor);
        cursor = quoteSpreadMultiplier.encode(data, cursor);
        cursor = orderEntryQualifier.encode(data, cursor);
        cursor = session.encode(data, cursor);
        cursor = scheduledEvent.encode(data, cursor);
        cursor = scheduledEventTime.encode(data, cursor);
        cursor = tradingGroupOrderEntryQualifier.encode(data, cursor);
        cursor = instrumentOrderEntryQualifier.encode(data, cursor);
        cursor = phaseTime.encode(data, cursor);
        cursor = contractSymbolIndex.encode(data, cursor);
        cursor = priceLimitStyle.encode(data, cursor);
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
            case "MsgSeqNum" -> Optional.of(msgSeqNum);
            case "ProduceTime" -> Optional.of(produceTime);
            case "ConsumeTime" -> Optional.of(consumeTime);
            case "Emm" -> Optional.of(emm);
            case "EventId" -> Optional.of(eventId);
            case "PhaseId" -> Optional.of(phaseId);
            case "TradingGroupState" -> Optional.of(tradingGroupState);
            case "InstrumentState" -> Optional.of(instrumentState);
            case "ChangeType" -> Optional.of(changeType);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "EventTime" -> Optional.of(eventTime);
            case "BookState" -> Optional.of(bookState);
            case "StatusReason" -> Optional.of(statusReason);
            case "PhaseQualifier" -> Optional.of(phaseQualifier);
            case "TradingPeriod" -> Optional.of(tradingPeriod);
            case "TradingSide" -> Optional.of(tradingSide);
            case "PriceLimits" -> Optional.of(priceLimits);
            case "QuoteSpreadMultiplier" -> Optional.of(quoteSpreadMultiplier);
            case "OrderEntryQualifier" -> Optional.of(orderEntryQualifier);
            case "Session" -> Optional.of(session);
            case "ScheduledEvent" -> Optional.of(scheduledEvent);
            case "ScheduledEventTime" -> Optional.of(scheduledEventTime);
            case "TradingGroupOrderEntryQualifier" -> Optional.of(tradingGroupOrderEntryQualifier);
            case "InstrumentOrderEntryQualifier" -> Optional.of(instrumentOrderEntryQualifier);
            case "PhaseTime" -> Optional.of(phaseTime);
            case "ContractSymbolIndex" -> Optional.of(contractSymbolIndex);
            case "PriceLimitStyle" -> Optional.of(priceLimitStyle);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DcMarketStatusChangeMessage message)) {
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
        if (!(other instanceof DcMarketStatusChangeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
