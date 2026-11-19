package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.CfiCodeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.CurrencyField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.DeliveryField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.DescriptionField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.ExerciseStyleField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.ExpirationDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.ExpirationStyleField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.FirstTradingSessionDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.IncrementalMessageInstructionsField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentIdField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentMessageNoField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentTradingStatusField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentTypeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentUpdateActionField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.LastTradingSessionDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.MaturityDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.PriceIncrementField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.PriceMultiplierField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.ProductField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.PutOrCallField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.SharesPerContractField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.StrikePriceField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.SymbolField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.TradingSessionDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.TransactTimeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.UnderlyingInstrumentIdField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.UnderlyingSymbolField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.Field;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.Message;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.PrintOptions;

/**
 * Represents the SingleInstrumentDefinitionIncrementalV2Message message from the OrderBookFeed protocol.
 *
 * <p>Sent on added/updated/deleted futures or option instrument on the market</p>
 */
public final class SingleInstrumentDefinitionIncrementalV2Message implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 262;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Single Instrument Definition Incremental V 2 Message";

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
     * Incremental message handling instructions flags
     */
    private final IncrementalMessageInstructionsField incrementalMessageInstructions = new IncrementalMessageInstructionsField();

    /**
     * Type of instrument update action
     */
    private final InstrumentUpdateActionField instrumentUpdateAction = new InstrumentUpdateActionField();

    /**
     * Instrument symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Instrument product
     */
    private final ProductField product = new ProductField();

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
     * Option underlying symbol
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Option underlying ID. The ID is used to reference instrument definition message of the underlying transmitted in the snapshot line for getting underlying details from it
     */
    private final UnderlyingInstrumentIdField underlyingInstrumentId = new UnderlyingInstrumentIdField();

    /**
     * Option put/call flag
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Option strike price
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Option number of shares per contract
     */
    private final SharesPerContractField sharesPerContract = new SharesPerContractField();

    /**
     * Expiration style
     */
    private final ExpirationStyleField expirationStyle = new ExpirationStyleField();

    /**
     * Option exercise style
     */
    private final ExerciseStyleField exerciseStyle = new ExerciseStyleField();

    /**
     * Delivery style
     */
    private final DeliveryField delivery = new DeliveryField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, instrumentMessageNo, transactTime, tradingSessionDate, instrumentTradingStatus, incrementalMessageInstructions, instrumentUpdateAction, symbol, product, description, instrumentType, maturityDate, firstTradingSessionDate, lastTradingSessionDate, expirationDate, cfiCode, currency, priceIncrement, priceMultiplier, underlyingSymbol, underlyingInstrumentId, putOrCall, strikePrice, sharesPerContract, expirationStyle, exerciseStyle, delivery);

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
     * Incremental message handling instructions flags
     *
     * @return the IncrementalMessageInstructions field
     */
    public IncrementalMessageInstructionsField incrementalMessageInstructions() {
        return incrementalMessageInstructions;
    }

    /**
     * Type of instrument update action
     *
     * @return the InstrumentUpdateAction field
     */
    public InstrumentUpdateActionField instrumentUpdateAction() {
        return instrumentUpdateAction;
    }

    /**
     * Instrument symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Instrument product
     *
     * @return the Product field
     */
    public ProductField product() {
        return product;
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
     * Option underlying symbol
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Option underlying ID. The ID is used to reference instrument definition message of the underlying transmitted in the snapshot line for getting underlying details from it
     *
     * @return the UnderlyingInstrumentId field
     */
    public UnderlyingInstrumentIdField underlyingInstrumentId() {
        return underlyingInstrumentId;
    }

    /**
     * Option put/call flag
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Option strike price
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Option number of shares per contract
     *
     * @return the SharesPerContract field
     */
    public SharesPerContractField sharesPerContract() {
        return sharesPerContract;
    }

    /**
     * Expiration style
     *
     * @return the ExpirationStyle field
     */
    public ExpirationStyleField expirationStyle() {
        return expirationStyle;
    }

    /**
     * Option exercise style
     *
     * @return the ExerciseStyle field
     */
    public ExerciseStyleField exerciseStyle() {
        return exerciseStyle;
    }

    /**
     * Delivery style
     *
     * @return the Delivery field
     */
    public DeliveryField delivery() {
        return delivery;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
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
        if (!incrementalMessageInstructions.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementalMessageInstructionsField.BYTE_LENGTH;
        if (!instrumentUpdateAction.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentUpdateActionField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!product.parse(data, cursor)) {
            return false;
        }
        cursor += ProductField.BYTE_LENGTH;
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
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!underlyingInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingInstrumentIdField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!sharesPerContract.parse(data, cursor)) {
            return false;
        }
        cursor += SharesPerContractField.BYTE_LENGTH;
        if (!expirationStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationStyleField.BYTE_LENGTH;
        if (!exerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseStyleField.BYTE_LENGTH;
        return delivery.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = instrumentMessageNo.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = tradingSessionDate.encode(data, cursor);
        cursor = instrumentTradingStatus.encode(data, cursor);
        cursor = incrementalMessageInstructions.encode(data, cursor);
        cursor = instrumentUpdateAction.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = product.encode(data, cursor);
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
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = underlyingInstrumentId.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = sharesPerContract.encode(data, cursor);
        cursor = expirationStyle.encode(data, cursor);
        cursor = exerciseStyle.encode(data, cursor);
        cursor = delivery.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "InstrumentMessageNo" -> Optional.of(instrumentMessageNo);
            case "TransactTime" -> Optional.of(transactTime);
            case "TradingSessionDate" -> Optional.of(tradingSessionDate);
            case "InstrumentTradingStatus" -> Optional.of(instrumentTradingStatus);
            case "IncrementalMessageInstructions" -> Optional.of(incrementalMessageInstructions);
            case "InstrumentUpdateAction" -> Optional.of(instrumentUpdateAction);
            case "Symbol" -> Optional.of(symbol);
            case "Product" -> Optional.of(product);
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
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "UnderlyingInstrumentId" -> Optional.of(underlyingInstrumentId);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "SharesPerContract" -> Optional.of(sharesPerContract);
            case "ExpirationStyle" -> Optional.of(expirationStyle);
            case "ExerciseStyle" -> Optional.of(exerciseStyle);
            case "Delivery" -> Optional.of(delivery);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SingleInstrumentDefinitionIncrementalV2Message message)) {
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
        if (!(other instanceof SingleInstrumentDefinitionIncrementalV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
