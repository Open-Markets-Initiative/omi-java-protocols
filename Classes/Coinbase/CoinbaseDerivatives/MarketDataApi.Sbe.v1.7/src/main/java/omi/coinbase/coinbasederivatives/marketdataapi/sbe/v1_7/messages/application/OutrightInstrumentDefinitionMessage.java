package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.CfiCodeField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.ContractSizeField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.CurrencyField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.DefinitionFlagsField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.DescriptionField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.FirstTradingSessionDateField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.LastTradingSessionDateField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.LimitDownPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.LimitUpPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.OldContractSizeField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.PriorSettlementPriceOptionalField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.ProductCodeField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.ProductGroupField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.ProductIdField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.SettlementPriceField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.SymbolField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.TickSizeField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.fields.TradingStatusField;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.structs.InstrHeader;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.structs.LogicalExpiry;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.types.Field;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.types.Message;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_7.types.PrintOptions;

/**
 * Represents the OutrightInstrumentDefinitionMessage message from the MarketDataApi protocol.
 *
 * <p>OutrightInstrumentDefinitionMessage</p>
 */
public final class OutrightInstrumentDefinitionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 174;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Outright Instrument Definition Message";

    /**
     * Instrument name or symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * productCode
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Instrument name
     */
    private final DescriptionField description = new DescriptionField();

    /**
     * tickSize
     */
    private final TickSizeField tickSize = new TickSizeField();

    /**
     * cfiCode
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * Currency used for price
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * firstTradingSessionDate
     */
    private final FirstTradingSessionDateField firstTradingSessionDate = new FirstTradingSessionDateField();

    /**
     * lastTradingSessionDate
     */
    private final LastTradingSessionDateField lastTradingSessionDate = new LastTradingSessionDateField();

    /**
     * oldContractSize
     */
    private final OldContractSizeField oldContractSize = new OldContractSizeField();

    /**
     * priorSettlementPrice
     */
    private final PriorSettlementPriceOptionalField priorSettlementPriceOptional = new PriorSettlementPriceOptionalField();

    /**
     * settlementPrice
     */
    private final SettlementPriceField settlementPrice = new SettlementPriceField();

    /**
     * limitDownPrice
     */
    private final LimitDownPriceField limitDownPrice = new LimitDownPriceField();

    /**
     * limitUpPrice
     */
    private final LimitUpPriceField limitUpPrice = new LimitUpPriceField();

    /**
     * productId
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * productGroup
     */
    private final ProductGroupField productGroup = new ProductGroupField();

    /**
     * tradingStatus
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * InstrumentDefinitionFlags bit set
     */
    private final DefinitionFlagsField definitionFlags = new DefinitionFlagsField();

    /**
     * contractSize
     */
    private final ContractSizeField contractSize = new ContractSizeField();

    /**
     * Instrument Header
     */
    private final InstrHeader instrHeader = new InstrHeader();

    /**
     * OutrightInstrumentDefinitionMessage
     */
    private final LogicalExpiry logicalExpiry = new LogicalExpiry();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(instrHeader.fields(), List.<Field>of(symbol), List.<Field>of(productCode), List.<Field>of(description), List.<Field>of(tickSize), List.<Field>of(cfiCode), List.<Field>of(currency), List.<Field>of(firstTradingSessionDate), List.<Field>of(lastTradingSessionDate), List.<Field>of(oldContractSize), List.<Field>of(priorSettlementPriceOptional), List.<Field>of(settlementPrice), List.<Field>of(limitDownPrice), List.<Field>of(limitUpPrice), List.<Field>of(productId), List.<Field>of(productGroup), List.<Field>of(tradingStatus), List.<Field>of(definitionFlags), List.<Field>of(contractSize), logicalExpiry.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Instrument name or symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * productCode
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
    }

    /**
     * Instrument name
     *
     * @return the Description field
     */
    public DescriptionField description() {
        return description;
    }

    /**
     * tickSize
     *
     * @return the TickSize field
     */
    public TickSizeField tickSize() {
        return tickSize;
    }

    /**
     * cfiCode
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
    }

    /**
     * Currency used for price
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * firstTradingSessionDate
     *
     * @return the FirstTradingSessionDate field
     */
    public FirstTradingSessionDateField firstTradingSessionDate() {
        return firstTradingSessionDate;
    }

    /**
     * lastTradingSessionDate
     *
     * @return the LastTradingSessionDate field
     */
    public LastTradingSessionDateField lastTradingSessionDate() {
        return lastTradingSessionDate;
    }

    /**
     * oldContractSize
     *
     * @return the OldContractSize field
     */
    public OldContractSizeField oldContractSize() {
        return oldContractSize;
    }

    /**
     * priorSettlementPrice
     *
     * @return the PriorSettlementPriceOptional field
     */
    public PriorSettlementPriceOptionalField priorSettlementPriceOptional() {
        return priorSettlementPriceOptional;
    }

    /**
     * settlementPrice
     *
     * @return the SettlementPrice field
     */
    public SettlementPriceField settlementPrice() {
        return settlementPrice;
    }

    /**
     * limitDownPrice
     *
     * @return the LimitDownPrice field
     */
    public LimitDownPriceField limitDownPrice() {
        return limitDownPrice;
    }

    /**
     * limitUpPrice
     *
     * @return the LimitUpPrice field
     */
    public LimitUpPriceField limitUpPrice() {
        return limitUpPrice;
    }

    /**
     * productId
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
    }

    /**
     * productGroup
     *
     * @return the ProductGroup field
     */
    public ProductGroupField productGroup() {
        return productGroup;
    }

    /**
     * tradingStatus
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * InstrumentDefinitionFlags bit set
     *
     * @return the DefinitionFlags field
     */
    public DefinitionFlagsField definitionFlags() {
        return definitionFlags;
    }

    /**
     * contractSize
     *
     * @return the ContractSize field
     */
    public ContractSizeField contractSize() {
        return contractSize;
    }

    /**
     * Instrument Header
     *
     * @return the InstrHeader record
     */
    public InstrHeader instrHeader() {
        return instrHeader;
    }

    /**
     * OutrightInstrumentDefinitionMessage
     *
     * @return the LogicalExpiry record
     */
    public LogicalExpiry logicalExpiry() {
        return logicalExpiry;
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
        return Optional.ofNullable(instrHeader.transactTime().value());
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
        if (!instrHeader.parseFrom(data, cursor, end - 152)) {
            return false;
        }
        cursor += instrHeader.byteLength();
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!description.parse(data, cursor)) {
            return false;
        }
        cursor += DescriptionField.BYTE_LENGTH;
        if (!tickSize.parse(data, cursor)) {
            return false;
        }
        cursor += TickSizeField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!firstTradingSessionDate.parse(data, cursor)) {
            return false;
        }
        cursor += FirstTradingSessionDateField.BYTE_LENGTH;
        if (!lastTradingSessionDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradingSessionDateField.BYTE_LENGTH;
        if (!oldContractSize.parse(data, cursor)) {
            return false;
        }
        cursor += OldContractSizeField.BYTE_LENGTH;
        if (!priorSettlementPriceOptional.parse(data, cursor)) {
            return false;
        }
        cursor += PriorSettlementPriceOptionalField.BYTE_LENGTH;
        if (!settlementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPriceField.BYTE_LENGTH;
        if (!limitDownPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitDownPriceField.BYTE_LENGTH;
        if (!limitUpPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitUpPriceField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!productGroup.parse(data, cursor)) {
            return false;
        }
        cursor += ProductGroupField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        if (!definitionFlags.parse(data, cursor)) {
            return false;
        }
        cursor += DefinitionFlagsField.BYTE_LENGTH;
        if (!contractSize.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSizeField.BYTE_LENGTH;
        return logicalExpiry.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrHeader.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = description.encode(data, cursor);
        cursor = tickSize.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = firstTradingSessionDate.encode(data, cursor);
        cursor = lastTradingSessionDate.encode(data, cursor);
        cursor = oldContractSize.encode(data, cursor);
        cursor = priorSettlementPriceOptional.encode(data, cursor);
        cursor = settlementPrice.encode(data, cursor);
        cursor = limitDownPrice.encode(data, cursor);
        cursor = limitUpPrice.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = productGroup.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = definitionFlags.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        cursor = logicalExpiry.encode(data, cursor);
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
        instrHeader.clear();
        logicalExpiry.clear();
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
            case "Symbol" -> Optional.of(symbol);
            case "ProductCode" -> Optional.of(productCode);
            case "Description" -> Optional.of(description);
            case "TickSize" -> Optional.of(tickSize);
            case "CfiCode" -> Optional.of(cfiCode);
            case "Currency" -> Optional.of(currency);
            case "FirstTradingSessionDate" -> Optional.of(firstTradingSessionDate);
            case "LastTradingSessionDate" -> Optional.of(lastTradingSessionDate);
            case "OldContractSize" -> Optional.of(oldContractSize);
            case "PriorSettlementPriceOptional" -> Optional.of(priorSettlementPriceOptional);
            case "SettlementPrice" -> Optional.of(settlementPrice);
            case "LimitDownPrice" -> Optional.of(limitDownPrice);
            case "LimitUpPrice" -> Optional.of(limitUpPrice);
            case "ProductId" -> Optional.of(productId);
            case "ProductGroup" -> Optional.of(productGroup);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "DefinitionFlags" -> Optional.of(definitionFlags);
            case "ContractSize" -> Optional.of(contractSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OutrightInstrumentDefinitionMessage message)) {
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
        if (!(other instanceof OutrightInstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
