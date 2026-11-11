package omi.ice.icefutures.mdf.impact.v1_1_33.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.ContractSymbolExtraField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.ContractSymbolField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.DealPriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.GtAllowedField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IncrementPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IncrementQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IsBlockOnlyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegDealSuppressedField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MifidRegulatedMarketField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MinQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.NumberOfHedgeDefinitionsField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.NumberOfStrategyLegDefinitionsField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OrderPriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.SecuritySubTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.SettlePriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.StrategySymbolField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.TestMarketIndicatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.TradingStatusField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.UnderlyingMarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.UnitQtyDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.groups.HedgeDefinitionEntry;
import omi.ice.icefutures.mdf.impact.v1_1_33.groups.HedgeDefinitionList;
import omi.ice.icefutures.mdf.impact.v1_1_33.groups.StrategyLegDefinitionEntry;
import omi.ice.icefutures.mdf.impact.v1_1_33.groups.StrategyLegDefinitionList;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.PrintOptions;

/**
 * Represents the NewOptionsStrategyDefinitionMessage message from the Mdf protocol.
 *
 * <p>New Options Strategy Definition messages will be sent out when new UDS markets for options are created.</p>
 */
public final class NewOptionsStrategyDefinitionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 122;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Options Strategy Definition Message";

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Unique identifier of the underlying market
     */
    private final UnderlyingMarketIdField underlyingMarketId = new UnderlyingMarketIdField();

    /**
     * Contract Symbol
     */
    private final ContractSymbolField contractSymbol = new ContractSymbolField();

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
     * Number of strategy leg definitions. The leg info are in repeating group followed
     */
    private final NumberOfStrategyLegDefinitionsField numberOfStrategyLegDefinitions = new NumberOfStrategyLegDefinitionsField();

    /**
     * Number of hedge definitions
     */
    private final NumberOfHedgeDefinitionsField numberOfHedgeDefinitions = new NumberOfHedgeDefinitionsField();

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
     * Indicates MIFID-II market. ‘Y’ or ‘N’
     */
    private final MifidRegulatedMarketField mifidRegulatedMarket = new MifidRegulatedMarketField();

    /**
     * Denominator for the deal price fields in the market. For most markets, this is the same as OrderPriceDenominator. However, it could be different for some crack or spread markets.
     */
    private final DealPriceDenominatorField dealPriceDenominator = new DealPriceDenominatorField();

    /**
     * Denominator for the settlement price fields in the market. For most markets, this is the same as DealPriceDenominator.
     */
    private final SettlePriceDenominatorField settlePriceDenominator = new SettlePriceDenominatorField();

    /**
     * Denominator for UnitQuantity. This field will be ‘0’ for most of the markets.
     */
    private final UnitQtyDenominatorField unitQtyDenominator = new UnitQtyDenominatorField();

    /**
     * Indicates Test Market. ‘Y’ or ‘N’
     */
    private final TestMarketIndicatorField testMarketIndicator = new TestMarketIndicatorField();

    /**
     * Extra contract symbol. Some contract symbols might contain more than 35 characters. Clients should append this field to ContractSymbol (Offset 11) to get the complete contract symbol.
     */
    private final ContractSymbolExtraField contractSymbolExtra = new ContractSymbolExtraField();

    /**
     * Indicates whether leg deals are suppressed. ‘Y’ or ‘N’
     */
    private final LegDealSuppressedField legDealSuppressed = new LegDealSuppressedField();

    /**
     * Strategy Leg Definition
     */
    private final StrategyLegDefinitionList strategyLegDefinition = new StrategyLegDefinitionList();

    /**
     * Hedge Definition
     */
    private final HedgeDefinitionList hedgeDefinition = new HedgeDefinitionList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, underlyingMarketId, contractSymbol, tradingStatus, orderPriceDenominator, incrementPrice, incrementQty, minQty, numberOfStrategyLegDefinitions, numberOfHedgeDefinitions, securitySubType, isBlockOnly, strategySymbol, gtAllowed, mifidRegulatedMarket, dealPriceDenominator, settlePriceDenominator, unitQtyDenominator, testMarketIndicator, contractSymbolExtra, legDealSuppressed);

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
     * Unique identifier of the underlying market
     *
     * @return the UnderlyingMarketId field
     */
    public UnderlyingMarketIdField underlyingMarketId() {
        return underlyingMarketId;
    }

    /**
     * Contract Symbol
     *
     * @return the ContractSymbol field
     */
    public ContractSymbolField contractSymbol() {
        return contractSymbol;
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
     * Number of strategy leg definitions. The leg info are in repeating group followed
     *
     * @return the NumberOfStrategyLegDefinitions field
     */
    public NumberOfStrategyLegDefinitionsField numberOfStrategyLegDefinitions() {
        return numberOfStrategyLegDefinitions;
    }

    /**
     * Number of hedge definitions
     *
     * @return the NumberOfHedgeDefinitions field
     */
    public NumberOfHedgeDefinitionsField numberOfHedgeDefinitions() {
        return numberOfHedgeDefinitions;
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
     * Indicates MIFID-II market. ‘Y’ or ‘N’
     *
     * @return the MifidRegulatedMarket field
     */
    public MifidRegulatedMarketField mifidRegulatedMarket() {
        return mifidRegulatedMarket;
    }

    /**
     * Denominator for the deal price fields in the market. For most markets, this is the same as OrderPriceDenominator. However, it could be different for some crack or spread markets.
     *
     * @return the DealPriceDenominator field
     */
    public DealPriceDenominatorField dealPriceDenominator() {
        return dealPriceDenominator;
    }

    /**
     * Denominator for the settlement price fields in the market. For most markets, this is the same as DealPriceDenominator.
     *
     * @return the SettlePriceDenominator field
     */
    public SettlePriceDenominatorField settlePriceDenominator() {
        return settlePriceDenominator;
    }

    /**
     * Denominator for UnitQuantity. This field will be ‘0’ for most of the markets.
     *
     * @return the UnitQtyDenominator field
     */
    public UnitQtyDenominatorField unitQtyDenominator() {
        return unitQtyDenominator;
    }

    /**
     * Indicates Test Market. ‘Y’ or ‘N’
     *
     * @return the TestMarketIndicator field
     */
    public TestMarketIndicatorField testMarketIndicator() {
        return testMarketIndicator;
    }

    /**
     * Extra contract symbol. Some contract symbols might contain more than 35 characters. Clients should append this field to ContractSymbol (Offset 11) to get the complete contract symbol.
     *
     * @return the ContractSymbolExtra field
     */
    public ContractSymbolExtraField contractSymbolExtra() {
        return contractSymbolExtra;
    }

    /**
     * Indicates whether leg deals are suppressed. ‘Y’ or ‘N’
     *
     * @return the LegDealSuppressed field
     */
    public LegDealSuppressedField legDealSuppressed() {
        return legDealSuppressed;
    }

    /**
     * Strategy Leg Definition
     *
     * <p>Encode writes this list's size to the NumberOfStrategyLegDefinitions field.</p>
     *
     * @return the StrategyLegDefinition entries
     */
    public StrategyLegDefinitionList strategyLegDefinition() {
        return strategyLegDefinition;
    }

    /**
     * Hedge Definition
     *
     * <p>Encode writes this list's size to the NumberOfHedgeDefinitions field.</p>
     *
     * @return the HedgeDefinition entries
     */
    public HedgeDefinitionList hedgeDefinition() {
        return hedgeDefinition;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + strategyLegDefinition.byteLength() + hedgeDefinition.byteLength();
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
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!underlyingMarketId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingMarketIdField.BYTE_LENGTH;
        if (!contractSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSymbolField.BYTE_LENGTH;
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
        if (!numberOfStrategyLegDefinitions.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfStrategyLegDefinitionsField.BYTE_LENGTH;
        if (!strategyLegDefinition.parse(data, cursor, end - 64, numberOfStrategyLegDefinitions.value())) {
            return false;
        }
        cursor += strategyLegDefinition.byteLength();
        if (end - cursor < 64) {
            return false;
        }
        if (!numberOfHedgeDefinitions.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfHedgeDefinitionsField.BYTE_LENGTH;
        if (!hedgeDefinition.parse(data, cursor, end - 63, numberOfHedgeDefinitions.value())) {
            return false;
        }
        cursor += hedgeDefinition.byteLength();
        if (end - cursor < 63) {
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
        if (!mifidRegulatedMarket.parse(data, cursor)) {
            return false;
        }
        cursor += MifidRegulatedMarketField.BYTE_LENGTH;
        if (!dealPriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += DealPriceDenominatorField.BYTE_LENGTH;
        if (!settlePriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += SettlePriceDenominatorField.BYTE_LENGTH;
        if (!unitQtyDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += UnitQtyDenominatorField.BYTE_LENGTH;
        if (!testMarketIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TestMarketIndicatorField.BYTE_LENGTH;
        if (!contractSymbolExtra.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSymbolExtraField.BYTE_LENGTH;
        return legDealSuppressed.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (strategyLegDefinition.size() > 127) {
            throw new IllegalStateException("strategyLegDefinition holds " + strategyLegDefinition.size() + " entries, more than its count field can state");
        }
        if (hedgeDefinition.size() > 127) {
            throw new IllegalStateException("hedgeDefinition holds " + hedgeDefinition.size() + " entries, more than its count field can state");
        }
        numberOfStrategyLegDefinitions.value((byte) strategyLegDefinition.size());
        numberOfHedgeDefinitions.value((byte) hedgeDefinition.size());
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = underlyingMarketId.encode(data, cursor);
        cursor = contractSymbol.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = orderPriceDenominator.encode(data, cursor);
        cursor = incrementPrice.encode(data, cursor);
        cursor = incrementQty.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = numberOfStrategyLegDefinitions.encode(data, cursor);
        cursor = strategyLegDefinition.encode(data, cursor);
        cursor = numberOfHedgeDefinitions.encode(data, cursor);
        cursor = hedgeDefinition.encode(data, cursor);
        cursor = securitySubType.encode(data, cursor);
        cursor = isBlockOnly.encode(data, cursor);
        cursor = strategySymbol.encode(data, cursor);
        cursor = gtAllowed.encode(data, cursor);
        cursor = mifidRegulatedMarket.encode(data, cursor);
        cursor = dealPriceDenominator.encode(data, cursor);
        cursor = settlePriceDenominator.encode(data, cursor);
        cursor = unitQtyDenominator.encode(data, cursor);
        cursor = testMarketIndicator.encode(data, cursor);
        cursor = contractSymbolExtra.encode(data, cursor);
        cursor = legDealSuppressed.encode(data, cursor);
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
        strategyLegDefinition.clear();
        hedgeDefinition.clear();
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
            if (field != numberOfStrategyLegDefinitions && field != numberOfHedgeDefinitions && !field.isRecognized()) {
                return false;
            }
        }
        if (!strategyLegDefinition.isRecognized()) {
            return false;
        }
        return hedgeDefinition.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfStrategyLegDefinitions && field != numberOfHedgeDefinitions && !field.isValid()) {
                return false;
            }
        }
        if (!strategyLegDefinition.isValid()) {
            return false;
        }
        if (!hedgeDefinition.isValid()) {
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
        if (!underlyingMarketId.isDecoded()) {
            return Optional.of(underlyingMarketId);
        }
        if (!contractSymbol.isDecoded()) {
            return Optional.of(contractSymbol);
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
        if (!numberOfStrategyLegDefinitions.isDecoded()) {
            return Optional.of(numberOfStrategyLegDefinitions);
        }
        if (!strategyLegDefinition.isDecoded()) {
            return Optional.of(strategyLegDefinition.failedEntry().flatMap(StrategyLegDefinitionEntry::failedAt).orElse(numberOfStrategyLegDefinitions));
        }
        if (!numberOfHedgeDefinitions.isDecoded()) {
            return Optional.of(numberOfHedgeDefinitions);
        }
        if (!hedgeDefinition.isDecoded()) {
            return Optional.of(hedgeDefinition.failedEntry().flatMap(HedgeDefinitionEntry::failedAt).orElse(numberOfHedgeDefinitions));
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
        if (!mifidRegulatedMarket.isDecoded()) {
            return Optional.of(mifidRegulatedMarket);
        }
        if (!dealPriceDenominator.isDecoded()) {
            return Optional.of(dealPriceDenominator);
        }
        if (!settlePriceDenominator.isDecoded()) {
            return Optional.of(settlePriceDenominator);
        }
        if (!unitQtyDenominator.isDecoded()) {
            return Optional.of(unitQtyDenominator);
        }
        if (!testMarketIndicator.isDecoded()) {
            return Optional.of(testMarketIndicator);
        }
        if (!contractSymbolExtra.isDecoded()) {
            return Optional.of(contractSymbolExtra);
        }
        if (!legDealSuppressed.isDecoded()) {
            return Optional.of(legDealSuppressed);
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
            case "UnderlyingMarketId" -> Optional.of(underlyingMarketId);
            case "ContractSymbol" -> Optional.of(contractSymbol);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "OrderPriceDenominator" -> Optional.of(orderPriceDenominator);
            case "IncrementPrice" -> Optional.of(incrementPrice);
            case "IncrementQty" -> Optional.of(incrementQty);
            case "MinQty" -> Optional.of(minQty);
            case "NumberOfStrategyLegDefinitions" -> Optional.of(numberOfStrategyLegDefinitions);
            case "NumberOfHedgeDefinitions" -> Optional.of(numberOfHedgeDefinitions);
            case "SecuritySubType" -> Optional.of(securitySubType);
            case "IsBlockOnly" -> Optional.of(isBlockOnly);
            case "StrategySymbol" -> Optional.of(strategySymbol);
            case "GtAllowed" -> Optional.of(gtAllowed);
            case "MifidRegulatedMarket" -> Optional.of(mifidRegulatedMarket);
            case "DealPriceDenominator" -> Optional.of(dealPriceDenominator);
            case "SettlePriceDenominator" -> Optional.of(settlePriceDenominator);
            case "UnitQtyDenominator" -> Optional.of(unitQtyDenominator);
            case "TestMarketIndicator" -> Optional.of(testMarketIndicator);
            case "ContractSymbolExtra" -> Optional.of(contractSymbolExtra);
            case "LegDealSuppressed" -> Optional.of(legDealSuppressed);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOptionsStrategyDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(strategyLegDefinition.diffFields(message.strategyLegDefinition));
        changed.addAll(hedgeDefinition.diffFields(message.hedgeDefinition));
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
            strategyLegDefinition.toFormattedString(builder, options);
            builder.append(", ");
            hedgeDefinition.toFormattedString(builder, options);
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
        strategyLegDefinition.toFormattedString(builder, nested);
        hedgeDefinition.toFormattedString(builder, nested);
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
        if (!(other instanceof NewOptionsStrategyDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && strategyLegDefinition.equals(message.strategyLegDefinition) && hedgeDefinition.equals(message.hedgeDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, strategyLegDefinition, hedgeDefinition);
    }
}
