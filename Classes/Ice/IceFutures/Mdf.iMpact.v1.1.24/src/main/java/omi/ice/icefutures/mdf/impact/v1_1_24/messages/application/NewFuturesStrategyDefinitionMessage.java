package omi.ice.icefutures.mdf.impact.v1_1_24.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.FuturesContractSymbolField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.GtAllowedField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.IncrementPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.IncrementQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.IsBlockOnlyField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MinQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.NumberOfLegDefinitionsField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OrderPriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.SecuritySubTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.StrategySymbolField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.TradingStatusField;
import omi.ice.icefutures.mdf.impact.v1_1_24.groups.LegDefinitionEntry;
import omi.ice.icefutures.mdf.impact.v1_1_24.groups.LegDefinitionList;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.PrintOptions;

/**
 * Represents the NewFuturesStrategyDefinitionMessage message from the Mdf protocol.
 *
 * <p>New Futures Strategy Definition messages will be sent out when new UDS markets for futures are created.</p>
 */
public final class NewFuturesStrategyDefinitionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '9';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 111;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Futures Strategy Definition Message";

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Futures Contract Symbol
     */
    private final FuturesContractSymbolField futuresContractSymbol = new FuturesContractSymbolField();

    /**
     * See Appendix A on the trading status codes
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * Denominator for the order price fields in this market.
     */
    private final OrderPriceDenominatorField orderPriceDenominator = new OrderPriceDenominatorField();

    /**
     * Minimum increment premium price for this market. OrderPriceDenominator should be applied to this field.
     */
    private final IncrementPriceField incrementPrice = new IncrementPriceField();

    /**
     * Minimum increment quantity for this market
     */
    private final IncrementQtyField incrementQty = new IncrementQtyField();

    /**
     * Minimum quantity for this market
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Number of strategy leg definitions. The leg info
     */
    private final NumberOfLegDefinitionsField numberOfLegDefinitions = new NumberOfLegDefinitionsField();

    /**
     * Contains the Strategy Code for defined market where applicable. See Appendix E for list of codes.
     */
    private final SecuritySubTypeField securitySubType = new SecuritySubTypeField();

    /**
     * Indicates if Market is only tradable via ICE Block Trade. This also means the screen trading is not allowed for the market. ‘Y’ or ‘N’
     */
    private final IsBlockOnlyField isBlockOnly = new IsBlockOnlyField();

    /**
     * Strategy Symbol
     */
    private final StrategySymbolField strategySymbol = new StrategySymbolField();

    /**
     * Indicates if GTC is allowed in the market. ‘Y’ or ‘N’
     */
    private final GtAllowedField gtAllowed = new GtAllowedField();

    /**
     * Leg Definition
     */
    private final LegDefinitionList legDefinition = new LegDefinitionList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, futuresContractSymbol, tradingStatus, orderPriceDenominator, incrementPrice, incrementQty, minQty, numberOfLegDefinitions, securitySubType, isBlockOnly, strategySymbol, gtAllowed);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Futures Contract Symbol
     *
     * @return the FuturesContractSymbol field
     */
    public FuturesContractSymbolField futuresContractSymbol() {
        return futuresContractSymbol;
    }

    /**
     * See Appendix A on the trading status codes
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * Denominator for the order price fields in this market.
     *
     * @return the OrderPriceDenominator field
     */
    public OrderPriceDenominatorField orderPriceDenominator() {
        return orderPriceDenominator;
    }

    /**
     * Minimum increment premium price for this market. OrderPriceDenominator should be applied to this field.
     *
     * @return the IncrementPrice field
     */
    public IncrementPriceField incrementPrice() {
        return incrementPrice;
    }

    /**
     * Minimum increment quantity for this market
     *
     * @return the IncrementQty field
     */
    public IncrementQtyField incrementQty() {
        return incrementQty;
    }

    /**
     * Minimum quantity for this market
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Number of strategy leg definitions. The leg info
     *
     * @return the NumberOfLegDefinitions field
     */
    public NumberOfLegDefinitionsField numberOfLegDefinitions() {
        return numberOfLegDefinitions;
    }

    /**
     * Contains the Strategy Code for defined market where applicable. See Appendix E for list of codes.
     *
     * @return the SecuritySubType field
     */
    public SecuritySubTypeField securitySubType() {
        return securitySubType;
    }

    /**
     * Indicates if Market is only tradable via ICE Block Trade. This also means the screen trading is not allowed for the market. ‘Y’ or ‘N’
     *
     * @return the IsBlockOnly field
     */
    public IsBlockOnlyField isBlockOnly() {
        return isBlockOnly;
    }

    /**
     * Strategy Symbol
     *
     * @return the StrategySymbol field
     */
    public StrategySymbolField strategySymbol() {
        return strategySymbol;
    }

    /**
     * Indicates if GTC is allowed in the market. ‘Y’ or ‘N’
     *
     * @return the GtAllowed field
     */
    public GtAllowedField gtAllowed() {
        return gtAllowed;
    }

    /**
     * Leg Definition
     *
     * <p>Encode writes this list's size to the NumberOfLegDefinitions field.</p>
     *
     * @return the LegDefinition entries
     */
    public LegDefinitionList legDefinition() {
        return legDefinition;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + legDefinition.byteLength();
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
        cursor += 4;
        cursor += 70;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor = legDefinition.padding(runs, cursor);
        cursor += 2;
        cursor += 1;
        cursor += 18;
        cursor += 1;
        return cursor;
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
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!futuresContractSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += FuturesContractSymbolField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        if (!orderPriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += OrderPriceDenominatorField.BYTE_LENGTH;
        if (!incrementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementPriceField.BYTE_LENGTH;
        if (!incrementQty.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementQtyField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!numberOfLegDefinitions.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegDefinitionsField.BYTE_LENGTH;
        if (!legDefinition.parse(data, cursor, end - 22, numberOfLegDefinitions.value())) {
            return false;
        }
        cursor += legDefinition.byteLength();
        if (end - cursor < 22) {
            return false;
        }
        if (!securitySubType.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeField.BYTE_LENGTH;
        if (!isBlockOnly.parse(data, cursor)) {
            return false;
        }
        cursor += IsBlockOnlyField.BYTE_LENGTH;
        if (!strategySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += StrategySymbolField.BYTE_LENGTH;
        if (!gtAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += GtAllowedField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (legDefinition.size() > 127) {
            throw new IllegalStateException("legDefinition holds " + legDefinition.size() + " entries, more than its count field can state");
        }
        numberOfLegDefinitions.value((byte) legDefinition.size());
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = futuresContractSymbol.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = orderPriceDenominator.encode(data, cursor);
        cursor = incrementPrice.encode(data, cursor);
        cursor = incrementQty.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = numberOfLegDefinitions.encode(data, cursor);
        cursor = legDefinition.encode(data, cursor);
        cursor = securitySubType.encode(data, cursor);
        cursor = isBlockOnly.encode(data, cursor);
        cursor = strategySymbol.encode(data, cursor);
        cursor = gtAllowed.encode(data, cursor);
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
        legDefinition.clear();
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
            if (field != numberOfLegDefinitions && !field.isRecognized()) {
                return false;
            }
        }
        if (!legDefinition.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLegDefinitions && !field.isValid()) {
                return false;
            }
        }
        if (!legDefinition.isValid()) {
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
        if (!marketId.isDecoded()) {
            return Optional.of(marketId);
        }
        if (!futuresContractSymbol.isDecoded()) {
            return Optional.of(futuresContractSymbol);
        }
        if (!tradingStatus.isDecoded()) {
            return Optional.of(tradingStatus);
        }
        if (!orderPriceDenominator.isDecoded()) {
            return Optional.of(orderPriceDenominator);
        }
        if (!incrementPrice.isDecoded()) {
            return Optional.of(incrementPrice);
        }
        if (!incrementQty.isDecoded()) {
            return Optional.of(incrementQty);
        }
        if (!minQty.isDecoded()) {
            return Optional.of(minQty);
        }
        if (!numberOfLegDefinitions.isDecoded()) {
            return Optional.of(numberOfLegDefinitions);
        }
        if (!legDefinition.isDecoded()) {
            return Optional.of(legDefinition.failedEntry().flatMap(LegDefinitionEntry::failedAt).orElse(numberOfLegDefinitions));
        }
        if (!securitySubType.isDecoded()) {
            return Optional.of(securitySubType);
        }
        if (!isBlockOnly.isDecoded()) {
            return Optional.of(isBlockOnly);
        }
        if (!strategySymbol.isDecoded()) {
            return Optional.of(strategySymbol);
        }
        if (!gtAllowed.isDecoded()) {
            return Optional.of(gtAllowed);
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
            case "MarketId" -> Optional.of(marketId);
            case "FuturesContractSymbol" -> Optional.of(futuresContractSymbol);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "OrderPriceDenominator" -> Optional.of(orderPriceDenominator);
            case "IncrementPrice" -> Optional.of(incrementPrice);
            case "IncrementQty" -> Optional.of(incrementQty);
            case "MinQty" -> Optional.of(minQty);
            case "NumberOfLegDefinitions" -> Optional.of(numberOfLegDefinitions);
            case "SecuritySubType" -> Optional.of(securitySubType);
            case "IsBlockOnly" -> Optional.of(isBlockOnly);
            case "StrategySymbol" -> Optional.of(strategySymbol);
            case "GtAllowed" -> Optional.of(gtAllowed);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewFuturesStrategyDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legDefinition.diffFields(message.legDefinition));
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
            legDefinition.toFormattedString(builder, options);
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
        legDefinition.toFormattedString(builder, nested);
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
        if (!(other instanceof NewFuturesStrategyDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && legDefinition.equals(message.legDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legDefinition);
    }
}
