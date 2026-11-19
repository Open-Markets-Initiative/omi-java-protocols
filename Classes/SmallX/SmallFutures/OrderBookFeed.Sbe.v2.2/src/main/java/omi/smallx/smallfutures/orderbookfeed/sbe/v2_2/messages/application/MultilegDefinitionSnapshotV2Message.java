package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.CfiCodeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.CurrencyField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.DescriptionField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.ExpirationDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.FirstTradingSessionDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentIdField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentMessageNoField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentTradingStatusField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentTypeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.LastIncrementalMessageSeqField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.LastTradingSessionDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.MaturityDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.PriceIncrementField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.PriceMultiplierField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.SnapshotInstrumentsCountField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.SnapshotMessageInstructionsField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.SpreadSymbolField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.StrategyTypeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.TradingSessionDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.TransactTimeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.structs.LegsGroups;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.Field;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.Message;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.PrintOptions;

/**
 * Represents the MultilegDefinitionSnapshotV2Message message from the OrderBookFeed protocol.
 *
 * <p>Multi-leg instrument definition for futures or option strategies</p>
 */
public final class MultilegDefinitionSnapshotV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 315;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Multileg Definition Snapshot V 2 Message";

    /**
     * Unique numeric identifier of the instrument, or of the index in the Index Snapshot Message
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Number of incremental message for the instrument. Starts with 1 on instrument creation and monotonically increases with each message sent for the instrument. In snapshot messages, the number of the instrument incremental message the snapshot reflects the instrument data for
     */
    private final InstrumentMessageNoField instrumentMessageNo = new InstrumentMessageNoField();

    /**
     * Message event timestamp; in snapshot messages, the last instrument incremental message event timestamp; in the Index Snapshot Message, the index value calculation time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Trading session business date
     */
    private final TradingSessionDateField tradingSessionDate = new TradingSessionDateField();

    /**
     * Trading session status of the instrument
     */
    private final InstrumentTradingStatusField instrumentTradingStatus = new InstrumentTradingStatusField();

    /**
     * Bit set of snapshot line message flags
     */
    private final SnapshotMessageInstructionsField snapshotMessageInstructions = new SnapshotMessageInstructionsField();

    /**
     * Total number of instruments in the Snapshot line publishing cycle. The number may increase within a single publishing cycle in case any instruments are created
     */
    private final SnapshotInstrumentsCountField snapshotInstrumentsCount = new SnapshotInstrumentsCountField();

    /**
     * Last incremental message sequence in this incarnation related to this instrument
     */
    private final LastIncrementalMessageSeqField lastIncrementalMessageSeq = new LastIncrementalMessageSeqField();

    /**
     * Multi-leg instrument symbol
     */
    private final SpreadSymbolField spreadSymbol = new SpreadSymbolField();

    /**
     * Instrument text description
     */
    private final DescriptionField description = new DescriptionField();

    /**
     * Instrument type
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * Instrument maturity date. For multi-leg instruments is usually defined as the nearest maturity date from all legs
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Instrument first trading business day
     */
    private final FirstTradingSessionDateField firstTradingSessionDate = new FirstTradingSessionDateField();

    /**
     * Instrument last trading business day
     */
    private final LastTradingSessionDateField lastTradingSessionDate = new LastTradingSessionDateField();

    /**
     * Day of instrument final expiration settlement price calculation. For multi-leg instruments is usually defined as the nearest expiration date from all legs
     */
    private final ExpirationDateField expirationDate = new ExpirationDateField();

    /**
     * ISO 10962 instrument 6-character classification code
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * ISO 4217 instrument currency code. For instance "USD"
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Instrument price increment. Positive number; price increment of 0.01 is represented as 100000 field value. All prices for the instrument order and trade messages are a multiple of the price increment
     */
    private final PriceIncrementField priceIncrement = new PriceIncrementField();

    /**
     * Ratio between contract price and its value expressed in instrument's currency amount
     */
    private final PriceMultiplierField priceMultiplier = new PriceMultiplierField();

    /**
     * Type of multi-leg strategy
     */
    private final StrategyTypeField strategyType = new StrategyTypeField();

    /**
     * Legs repeating group
     */
    private final LegsGroups legsGroups = new LegsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, instrumentMessageNo, transactTime, tradingSessionDate, instrumentTradingStatus, snapshotMessageInstructions, snapshotInstrumentsCount, lastIncrementalMessageSeq, spreadSymbol, description, instrumentType, maturityDate, firstTradingSessionDate, lastTradingSessionDate, expirationDate, cfiCode, currency, priceIncrement, priceMultiplier, strategyType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique numeric identifier of the instrument, or of the index in the Index Snapshot Message
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Number of incremental message for the instrument. Starts with 1 on instrument creation and monotonically increases with each message sent for the instrument. In snapshot messages, the number of the instrument incremental message the snapshot reflects the instrument data for
     *
     * @return the InstrumentMessageNo field
     */
    public InstrumentMessageNoField instrumentMessageNo() {
        return instrumentMessageNo;
    }

    /**
     * Message event timestamp; in snapshot messages, the last instrument incremental message event timestamp; in the Index Snapshot Message, the index value calculation time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Trading session business date
     *
     * @return the TradingSessionDate field
     */
    public TradingSessionDateField tradingSessionDate() {
        return tradingSessionDate;
    }

    /**
     * Trading session status of the instrument
     *
     * @return the InstrumentTradingStatus field
     */
    public InstrumentTradingStatusField instrumentTradingStatus() {
        return instrumentTradingStatus;
    }

    /**
     * Bit set of snapshot line message flags
     *
     * @return the SnapshotMessageInstructions field
     */
    public SnapshotMessageInstructionsField snapshotMessageInstructions() {
        return snapshotMessageInstructions;
    }

    /**
     * Total number of instruments in the Snapshot line publishing cycle. The number may increase within a single publishing cycle in case any instruments are created
     *
     * @return the SnapshotInstrumentsCount field
     */
    public SnapshotInstrumentsCountField snapshotInstrumentsCount() {
        return snapshotInstrumentsCount;
    }

    /**
     * Last incremental message sequence in this incarnation related to this instrument
     *
     * @return the LastIncrementalMessageSeq field
     */
    public LastIncrementalMessageSeqField lastIncrementalMessageSeq() {
        return lastIncrementalMessageSeq;
    }

    /**
     * Multi-leg instrument symbol
     *
     * @return the SpreadSymbol field
     */
    public SpreadSymbolField spreadSymbol() {
        return spreadSymbol;
    }

    /**
     * Instrument text description
     *
     * @return the Description field
     */
    public DescriptionField description() {
        return description;
    }

    /**
     * Instrument type
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * Instrument maturity date. For multi-leg instruments is usually defined as the nearest maturity date from all legs
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Instrument first trading business day
     *
     * @return the FirstTradingSessionDate field
     */
    public FirstTradingSessionDateField firstTradingSessionDate() {
        return firstTradingSessionDate;
    }

    /**
     * Instrument last trading business day
     *
     * @return the LastTradingSessionDate field
     */
    public LastTradingSessionDateField lastTradingSessionDate() {
        return lastTradingSessionDate;
    }

    /**
     * Day of instrument final expiration settlement price calculation. For multi-leg instruments is usually defined as the nearest expiration date from all legs
     *
     * @return the ExpirationDate field
     */
    public ExpirationDateField expirationDate() {
        return expirationDate;
    }

    /**
     * ISO 10962 instrument 6-character classification code
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
    }

    /**
     * ISO 4217 instrument currency code. For instance "USD"
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Instrument price increment. Positive number; price increment of 0.01 is represented as 100000 field value. All prices for the instrument order and trade messages are a multiple of the price increment
     *
     * @return the PriceIncrement field
     */
    public PriceIncrementField priceIncrement() {
        return priceIncrement;
    }

    /**
     * Ratio between contract price and its value expressed in instrument's currency amount
     *
     * @return the PriceMultiplier field
     */
    public PriceMultiplierField priceMultiplier() {
        return priceMultiplier;
    }

    /**
     * Type of multi-leg strategy
     *
     * @return the StrategyType field
     */
    public StrategyTypeField strategyType() {
        return strategyType;
    }

    /**
     * Legs repeating group
     *
     * @return the LegsGroups record
     */
    public LegsGroups legsGroups() {
        return legsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + legsGroups.byteLength() - LegsGroups.MINIMUM_BYTE_LENGTH;
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

        int cursor = offset;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!instrumentMessageNo.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentMessageNoField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!tradingSessionDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionDateField.BYTE_LENGTH;
        if (!instrumentTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTradingStatusField.BYTE_LENGTH;
        if (!snapshotMessageInstructions.parse(data, cursor)) {
            return false;
        }
        cursor += SnapshotMessageInstructionsField.BYTE_LENGTH;
        if (!snapshotInstrumentsCount.parse(data, cursor)) {
            return false;
        }
        cursor += SnapshotInstrumentsCountField.BYTE_LENGTH;
        if (!lastIncrementalMessageSeq.parse(data, cursor)) {
            return false;
        }
        cursor += LastIncrementalMessageSeqField.BYTE_LENGTH;
        if (!spreadSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SpreadSymbolField.BYTE_LENGTH;
        if (!description.parse(data, cursor)) {
            return false;
        }
        cursor += DescriptionField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!firstTradingSessionDate.parse(data, cursor)) {
            return false;
        }
        cursor += FirstTradingSessionDateField.BYTE_LENGTH;
        if (!lastTradingSessionDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradingSessionDateField.BYTE_LENGTH;
        if (!expirationDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationDateField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!priceIncrement.parse(data, cursor)) {
            return false;
        }
        cursor += PriceIncrementField.BYTE_LENGTH;
        if (!priceMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += PriceMultiplierField.BYTE_LENGTH;
        if (!strategyType.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyTypeField.BYTE_LENGTH;
        if (!legsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += legsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = instrumentMessageNo.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = tradingSessionDate.encode(data, cursor);
        cursor = instrumentTradingStatus.encode(data, cursor);
        cursor = snapshotMessageInstructions.encode(data, cursor);
        cursor = snapshotInstrumentsCount.encode(data, cursor);
        cursor = lastIncrementalMessageSeq.encode(data, cursor);
        cursor = spreadSymbol.encode(data, cursor);
        cursor = description.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = firstTradingSessionDate.encode(data, cursor);
        cursor = lastTradingSessionDate.encode(data, cursor);
        cursor = expirationDate.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = priceIncrement.encode(data, cursor);
        cursor = priceMultiplier.encode(data, cursor);
        cursor = strategyType.encode(data, cursor);
        cursor = legsGroups.encode(data, cursor);
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
        legsGroups.clear();
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
        return legsGroups.isRecognized();
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
        if (!legsGroups.isValid()) {
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
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!instrumentMessageNo.isDecoded()) {
            return Optional.of(instrumentMessageNo);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!tradingSessionDate.isDecoded()) {
            return Optional.of(tradingSessionDate);
        }
        if (!instrumentTradingStatus.isDecoded()) {
            return Optional.of(instrumentTradingStatus);
        }
        if (!snapshotMessageInstructions.isDecoded()) {
            return Optional.of(snapshotMessageInstructions);
        }
        if (!snapshotInstrumentsCount.isDecoded()) {
            return Optional.of(snapshotInstrumentsCount);
        }
        if (!lastIncrementalMessageSeq.isDecoded()) {
            return Optional.of(lastIncrementalMessageSeq);
        }
        if (!spreadSymbol.isDecoded()) {
            return Optional.of(spreadSymbol);
        }
        if (!description.isDecoded()) {
            return Optional.of(description);
        }
        if (!instrumentType.isDecoded()) {
            return Optional.of(instrumentType);
        }
        if (!maturityDate.isDecoded()) {
            return Optional.of(maturityDate);
        }
        if (!firstTradingSessionDate.isDecoded()) {
            return Optional.of(firstTradingSessionDate);
        }
        if (!lastTradingSessionDate.isDecoded()) {
            return Optional.of(lastTradingSessionDate);
        }
        if (!expirationDate.isDecoded()) {
            return Optional.of(expirationDate);
        }
        if (!cfiCode.isDecoded()) {
            return Optional.of(cfiCode);
        }
        if (!currency.isDecoded()) {
            return Optional.of(currency);
        }
        if (!priceIncrement.isDecoded()) {
            return Optional.of(priceIncrement);
        }
        if (!priceMultiplier.isDecoded()) {
            return Optional.of(priceMultiplier);
        }
        if (!strategyType.isDecoded()) {
            return Optional.of(strategyType);
        }
        if (!legsGroups.isDecoded()) {
            return legsGroups.failedAt();
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "InstrumentMessageNo" -> Optional.of(instrumentMessageNo);
            case "TransactTime" -> Optional.of(transactTime);
            case "TradingSessionDate" -> Optional.of(tradingSessionDate);
            case "InstrumentTradingStatus" -> Optional.of(instrumentTradingStatus);
            case "SnapshotMessageInstructions" -> Optional.of(snapshotMessageInstructions);
            case "SnapshotInstrumentsCount" -> Optional.of(snapshotInstrumentsCount);
            case "LastIncrementalMessageSeq" -> Optional.of(lastIncrementalMessageSeq);
            case "SpreadSymbol" -> Optional.of(spreadSymbol);
            case "Description" -> Optional.of(description);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "FirstTradingSessionDate" -> Optional.of(firstTradingSessionDate);
            case "LastTradingSessionDate" -> Optional.of(lastTradingSessionDate);
            case "ExpirationDate" -> Optional.of(expirationDate);
            case "CfiCode" -> Optional.of(cfiCode);
            case "Currency" -> Optional.of(currency);
            case "PriceIncrement" -> Optional.of(priceIncrement);
            case "PriceMultiplier" -> Optional.of(priceMultiplier);
            case "StrategyType" -> Optional.of(strategyType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MultilegDefinitionSnapshotV2Message message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legsGroups.diffFields(message.legsGroups));
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
            legsGroups.toFormattedString(builder, options);
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
        legsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof MultilegDefinitionSnapshotV2Message message)) {
            return false;
        }
        return fields.equals(message.fields) && legsGroups.equals(message.legsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legsGroups);
    }
}
