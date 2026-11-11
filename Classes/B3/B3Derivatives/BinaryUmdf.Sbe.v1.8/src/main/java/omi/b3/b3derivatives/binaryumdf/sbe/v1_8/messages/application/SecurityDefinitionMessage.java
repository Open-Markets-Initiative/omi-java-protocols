package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.AssetField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.CfiCodeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.ClearingHouseIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.ContractMultiplierField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.CorporateActionEventIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.CountryOfIssueField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.CurrencyField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.DatedDateField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.EndDateField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.ExerciseStyleField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.GovernanceIndicatorField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.IsinNumberField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.IssueDateField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.LastFragmentField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.LotTypeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MarketSegmentIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MaturityDateField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MaxOrderQtyField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MinCrossQtyField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MinLotSizeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MinOrderQtyField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MinPriceIncrementOptionalField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MinTradeVolField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MultiLegModelField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MultiLegPriceMethodField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.NoSharesIssuedField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.PriceDivisorField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.PriceTypeOptionalField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.ProductField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.PutOrCallField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityExchangeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityGroupField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityIdSourceField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityMatchTypeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityStrategyTypeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecuritySubTypeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityTypeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityUpdateActionField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityValidityTimestampField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SettlCurrencyField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SettlDateField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SettlTypeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.StartDateField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.StrikeCurrencyField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.StrikePriceField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SymbolField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TickSizeDenominatorField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TotNoRelatedSymField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.structs.ContractSettlMonth;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.structs.InstrAttribsGroups;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.structs.LegsGroups;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.structs.MaturityMonthYear;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.structs.SecurityDesc;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.structs.UnderlyingsGroups;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Field;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.PrintOptions;

/**
 * Represents the SecurityDefinitionMessage message from the BinaryUmdf protocol.
 *
 * <p>SecurityDefinition_12Message</p>
 */
public final class SecurityDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 240;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Message";

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * securityExchange
     */
    private final SecurityExchangeField securityExchange = new SecurityExchangeField();

    /**
     * securityIDSource
     */
    private final SecurityIdSourceField securityIdSource = new SecurityIdSourceField();

    /**
     * securityGroup
     */
    private final SecurityGroupField securityGroup = new SecurityGroupField();

    /**
     * symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * securityUpdateAction
     */
    private final SecurityUpdateActionField securityUpdateAction = new SecurityUpdateActionField();

    /**
     * securityType
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * securitySubType
     */
    private final SecuritySubTypeField securitySubType = new SecuritySubTypeField();

    /**
     * totNoRelatedSym
     */
    private final TotNoRelatedSymField totNoRelatedSym = new TotNoRelatedSymField();

    /**
     * minPriceIncrement
     */
    private final MinPriceIncrementOptionalField minPriceIncrementOptional = new MinPriceIncrementOptionalField();

    /**
     * strikePrice
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * contractMultiplier
     */
    private final ContractMultiplierField contractMultiplier = new ContractMultiplierField();

    /**
     * priceDivisor
     */
    private final PriceDivisorField priceDivisor = new PriceDivisorField();

    /**
     * securityValidityTimestamp
     */
    private final SecurityValidityTimestampField securityValidityTimestamp = new SecurityValidityTimestampField();

    /**
     * noSharesIssued
     */
    private final NoSharesIssuedField noSharesIssued = new NoSharesIssuedField();

    /**
     * clearingHouseID
     */
    private final ClearingHouseIdField clearingHouseId = new ClearingHouseIdField();

    /**
     * minOrderQty
     */
    private final MinOrderQtyField minOrderQty = new MinOrderQtyField();

    /**
     * maxOrderQty
     */
    private final MaxOrderQtyField maxOrderQty = new MaxOrderQtyField();

    /**
     * minLotSize
     */
    private final MinLotSizeField minLotSize = new MinLotSizeField();

    /**
     * minTradeVol
     */
    private final MinTradeVolField minTradeVol = new MinTradeVolField();

    /**
     * corporateActionEventId
     */
    private final CorporateActionEventIdField corporateActionEventId = new CorporateActionEventIdField();

    /**
     * issueDate
     */
    private final IssueDateField issueDate = new IssueDateField();

    /**
     * maturityDate
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * countryOfIssue
     */
    private final CountryOfIssueField countryOfIssue = new CountryOfIssueField();

    /**
     * startDate
     */
    private final StartDateField startDate = new StartDateField();

    /**
     * endDate
     */
    private final EndDateField endDate = new EndDateField();

    /**
     * settlType
     */
    private final SettlTypeField settlType = new SettlTypeField();

    /**
     * settlDate
     */
    private final SettlDateField settlDate = new SettlDateField();

    /**
     * datedDate
     */
    private final DatedDateField datedDate = new DatedDateField();

    /**
     * isinNumber
     */
    private final IsinNumberField isinNumber = new IsinNumberField();

    /**
     * asset
     */
    private final AssetField asset = new AssetField();

    /**
     * cfiCode
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * strikeCurrency
     */
    private final StrikeCurrencyField strikeCurrency = new StrikeCurrencyField();

    /**
     * settlCurrency
     */
    private final SettlCurrencyField settlCurrency = new SettlCurrencyField();

    /**
     * securityStrategyType
     */
    private final SecurityStrategyTypeField securityStrategyType = new SecurityStrategyTypeField();

    /**
     * lotType
     */
    private final LotTypeField lotType = new LotTypeField();

    /**
     * tickSizeDenominator
     */
    private final TickSizeDenominatorField tickSizeDenominator = new TickSizeDenominatorField();

    /**
     * product
     */
    private final ProductField product = new ProductField();

    /**
     * exerciseStyle
     */
    private final ExerciseStyleField exerciseStyle = new ExerciseStyleField();

    /**
     * putOrCall
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * priceType
     */
    private final PriceTypeOptionalField priceTypeOptional = new PriceTypeOptionalField();

    /**
     * marketSegmentID
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * governanceIndicator
     */
    private final GovernanceIndicatorField governanceIndicator = new GovernanceIndicatorField();

    /**
     * securityMatchType
     */
    private final SecurityMatchTypeField securityMatchType = new SecurityMatchTypeField();

    /**
     * lastFragment
     */
    private final LastFragmentField lastFragment = new LastFragmentField();

    /**
     * multiLegModel
     */
    private final MultiLegModelField multiLegModel = new MultiLegModelField();

    /**
     * multiLegPriceMethod
     */
    private final MultiLegPriceMethodField multiLegPriceMethod = new MultiLegPriceMethodField();

    /**
     * minCrossQty
     */
    private final MinCrossQtyField minCrossQty = new MinCrossQtyField();

    /**
     * SecurityDefinition_4Message
     */
    private final MaturityMonthYear maturityMonthYear = new MaturityMonthYear();

    /**
     * SecurityDefinition_4Message
     */
    private final ContractSettlMonth contractSettlMonth = new ContractSettlMonth();

    /**
     * noUnderlyings Block
     */
    private final UnderlyingsGroups underlyingsGroups = new UnderlyingsGroups();

    /**
     * noLegs Block
     */
    private final LegsGroups legsGroups = new LegsGroups();

    /**
     * noInstrAttribs Block
     */
    private final InstrAttribsGroups instrAttribsGroups = new InstrAttribsGroups();

    /**
     * securityDesc data struct
     */
    private final SecurityDesc securityDesc = new SecurityDesc();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(securityId), List.<Field>of(securityExchange), List.<Field>of(securityIdSource), List.<Field>of(securityGroup), List.<Field>of(symbol), List.<Field>of(securityUpdateAction), List.<Field>of(securityType), List.<Field>of(securitySubType), List.<Field>of(totNoRelatedSym), List.<Field>of(minPriceIncrementOptional), List.<Field>of(strikePrice), List.<Field>of(contractMultiplier), List.<Field>of(priceDivisor), List.<Field>of(securityValidityTimestamp), List.<Field>of(noSharesIssued), List.<Field>of(clearingHouseId), List.<Field>of(minOrderQty), List.<Field>of(maxOrderQty), List.<Field>of(minLotSize), List.<Field>of(minTradeVol), List.<Field>of(corporateActionEventId), List.<Field>of(issueDate), List.<Field>of(maturityDate), List.<Field>of(countryOfIssue), List.<Field>of(startDate), List.<Field>of(endDate), List.<Field>of(settlType), List.<Field>of(settlDate), List.<Field>of(datedDate), List.<Field>of(isinNumber), List.<Field>of(asset), List.<Field>of(cfiCode), maturityMonthYear.fields(), contractSettlMonth.fields(), List.<Field>of(currency), List.<Field>of(strikeCurrency), List.<Field>of(settlCurrency), List.<Field>of(securityStrategyType), List.<Field>of(lotType), List.<Field>of(tickSizeDenominator), List.<Field>of(product), List.<Field>of(exerciseStyle), List.<Field>of(putOrCall), List.<Field>of(priceTypeOptional), List.<Field>of(marketSegmentId), List.<Field>of(governanceIndicator), List.<Field>of(securityMatchType), List.<Field>of(lastFragment), List.<Field>of(multiLegModel), List.<Field>of(multiLegPriceMethod), List.<Field>of(minCrossQty), securityDesc.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * securityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * securityExchange
     *
     * @return the SecurityExchange field
     */
    public SecurityExchangeField securityExchange() {
        return securityExchange;
    }

    /**
     * securityIDSource
     *
     * @return the SecurityIdSource field
     */
    public SecurityIdSourceField securityIdSource() {
        return securityIdSource;
    }

    /**
     * securityGroup
     *
     * @return the SecurityGroup field
     */
    public SecurityGroupField securityGroup() {
        return securityGroup;
    }

    /**
     * symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * securityUpdateAction
     *
     * @return the SecurityUpdateAction field
     */
    public SecurityUpdateActionField securityUpdateAction() {
        return securityUpdateAction;
    }

    /**
     * securityType
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * securitySubType
     *
     * @return the SecuritySubType field
     */
    public SecuritySubTypeField securitySubType() {
        return securitySubType;
    }

    /**
     * totNoRelatedSym
     *
     * @return the TotNoRelatedSym field
     */
    public TotNoRelatedSymField totNoRelatedSym() {
        return totNoRelatedSym;
    }

    /**
     * minPriceIncrement
     *
     * @return the MinPriceIncrementOptional field
     */
    public MinPriceIncrementOptionalField minPriceIncrementOptional() {
        return minPriceIncrementOptional;
    }

    /**
     * strikePrice
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * contractMultiplier
     *
     * @return the ContractMultiplier field
     */
    public ContractMultiplierField contractMultiplier() {
        return contractMultiplier;
    }

    /**
     * priceDivisor
     *
     * @return the PriceDivisor field
     */
    public PriceDivisorField priceDivisor() {
        return priceDivisor;
    }

    /**
     * securityValidityTimestamp
     *
     * @return the SecurityValidityTimestamp field
     */
    public SecurityValidityTimestampField securityValidityTimestamp() {
        return securityValidityTimestamp;
    }

    /**
     * noSharesIssued
     *
     * @return the NoSharesIssued field
     */
    public NoSharesIssuedField noSharesIssued() {
        return noSharesIssued;
    }

    /**
     * clearingHouseID
     *
     * @return the ClearingHouseId field
     */
    public ClearingHouseIdField clearingHouseId() {
        return clearingHouseId;
    }

    /**
     * minOrderQty
     *
     * @return the MinOrderQty field
     */
    public MinOrderQtyField minOrderQty() {
        return minOrderQty;
    }

    /**
     * maxOrderQty
     *
     * @return the MaxOrderQty field
     */
    public MaxOrderQtyField maxOrderQty() {
        return maxOrderQty;
    }

    /**
     * minLotSize
     *
     * @return the MinLotSize field
     */
    public MinLotSizeField minLotSize() {
        return minLotSize;
    }

    /**
     * minTradeVol
     *
     * @return the MinTradeVol field
     */
    public MinTradeVolField minTradeVol() {
        return minTradeVol;
    }

    /**
     * corporateActionEventId
     *
     * @return the CorporateActionEventId field
     */
    public CorporateActionEventIdField corporateActionEventId() {
        return corporateActionEventId;
    }

    /**
     * issueDate
     *
     * @return the IssueDate field
     */
    public IssueDateField issueDate() {
        return issueDate;
    }

    /**
     * maturityDate
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * countryOfIssue
     *
     * @return the CountryOfIssue field
     */
    public CountryOfIssueField countryOfIssue() {
        return countryOfIssue;
    }

    /**
     * startDate
     *
     * @return the StartDate field
     */
    public StartDateField startDate() {
        return startDate;
    }

    /**
     * endDate
     *
     * @return the EndDate field
     */
    public EndDateField endDate() {
        return endDate;
    }

    /**
     * settlType
     *
     * @return the SettlType field
     */
    public SettlTypeField settlType() {
        return settlType;
    }

    /**
     * settlDate
     *
     * @return the SettlDate field
     */
    public SettlDateField settlDate() {
        return settlDate;
    }

    /**
     * datedDate
     *
     * @return the DatedDate field
     */
    public DatedDateField datedDate() {
        return datedDate;
    }

    /**
     * isinNumber
     *
     * @return the IsinNumber field
     */
    public IsinNumberField isinNumber() {
        return isinNumber;
    }

    /**
     * asset
     *
     * @return the Asset field
     */
    public AssetField asset() {
        return asset;
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
     * currency
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * strikeCurrency
     *
     * @return the StrikeCurrency field
     */
    public StrikeCurrencyField strikeCurrency() {
        return strikeCurrency;
    }

    /**
     * settlCurrency
     *
     * @return the SettlCurrency field
     */
    public SettlCurrencyField settlCurrency() {
        return settlCurrency;
    }

    /**
     * securityStrategyType
     *
     * @return the SecurityStrategyType field
     */
    public SecurityStrategyTypeField securityStrategyType() {
        return securityStrategyType;
    }

    /**
     * lotType
     *
     * @return the LotType field
     */
    public LotTypeField lotType() {
        return lotType;
    }

    /**
     * tickSizeDenominator
     *
     * @return the TickSizeDenominator field
     */
    public TickSizeDenominatorField tickSizeDenominator() {
        return tickSizeDenominator;
    }

    /**
     * product
     *
     * @return the Product field
     */
    public ProductField product() {
        return product;
    }

    /**
     * exerciseStyle
     *
     * @return the ExerciseStyle field
     */
    public ExerciseStyleField exerciseStyle() {
        return exerciseStyle;
    }

    /**
     * putOrCall
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * priceType
     *
     * @return the PriceTypeOptional field
     */
    public PriceTypeOptionalField priceTypeOptional() {
        return priceTypeOptional;
    }

    /**
     * marketSegmentID
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * governanceIndicator
     *
     * @return the GovernanceIndicator field
     */
    public GovernanceIndicatorField governanceIndicator() {
        return governanceIndicator;
    }

    /**
     * securityMatchType
     *
     * @return the SecurityMatchType field
     */
    public SecurityMatchTypeField securityMatchType() {
        return securityMatchType;
    }

    /**
     * lastFragment
     *
     * @return the LastFragment field
     */
    public LastFragmentField lastFragment() {
        return lastFragment;
    }

    /**
     * multiLegModel
     *
     * @return the MultiLegModel field
     */
    public MultiLegModelField multiLegModel() {
        return multiLegModel;
    }

    /**
     * multiLegPriceMethod
     *
     * @return the MultiLegPriceMethod field
     */
    public MultiLegPriceMethodField multiLegPriceMethod() {
        return multiLegPriceMethod;
    }

    /**
     * minCrossQty
     *
     * @return the MinCrossQty field
     */
    public MinCrossQtyField minCrossQty() {
        return minCrossQty;
    }

    /**
     * SecurityDefinition_4Message
     *
     * @return the MaturityMonthYear record
     */
    public MaturityMonthYear maturityMonthYear() {
        return maturityMonthYear;
    }

    /**
     * SecurityDefinition_4Message
     *
     * @return the ContractSettlMonth record
     */
    public ContractSettlMonth contractSettlMonth() {
        return contractSettlMonth;
    }

    /**
     * noUnderlyings Block
     *
     * @return the UnderlyingsGroups record
     */
    public UnderlyingsGroups underlyingsGroups() {
        return underlyingsGroups;
    }

    /**
     * noLegs Block
     *
     * @return the LegsGroups record
     */
    public LegsGroups legsGroups() {
        return legsGroups;
    }

    /**
     * noInstrAttribs Block
     *
     * @return the InstrAttribsGroups record
     */
    public InstrAttribsGroups instrAttribsGroups() {
        return instrAttribsGroups;
    }

    /**
     * securityDesc data struct
     *
     * @return the SecurityDesc record
     */
    public SecurityDesc securityDesc() {
        return securityDesc;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + underlyingsGroups.byteLength() - UnderlyingsGroups.MINIMUM_BYTE_LENGTH + legsGroups.byteLength() - LegsGroups.MINIMUM_BYTE_LENGTH + instrAttribsGroups.byteLength() - InstrAttribsGroups.MINIMUM_BYTE_LENGTH + securityDesc.byteLength() - SecurityDesc.MINIMUM_BYTE_LENGTH;
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!securityExchange.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityExchangeField.BYTE_LENGTH;
        if (!securityIdSource.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdSourceField.BYTE_LENGTH;
        if (!securityGroup.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityGroupField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!securityUpdateAction.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityUpdateActionField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!securitySubType.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeField.BYTE_LENGTH;
        if (!totNoRelatedSym.parse(data, cursor)) {
            return false;
        }
        cursor += TotNoRelatedSymField.BYTE_LENGTH;
        if (!minPriceIncrementOptional.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementOptionalField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!contractMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMultiplierField.BYTE_LENGTH;
        if (!priceDivisor.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDivisorField.BYTE_LENGTH;
        if (!securityValidityTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityValidityTimestampField.BYTE_LENGTH;
        if (!noSharesIssued.parse(data, cursor)) {
            return false;
        }
        cursor += NoSharesIssuedField.BYTE_LENGTH;
        if (!clearingHouseId.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingHouseIdField.BYTE_LENGTH;
        if (!minOrderQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinOrderQtyField.BYTE_LENGTH;
        if (!maxOrderQty.parse(data, cursor)) {
            return false;
        }
        cursor += MaxOrderQtyField.BYTE_LENGTH;
        if (!minLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += MinLotSizeField.BYTE_LENGTH;
        if (!minTradeVol.parse(data, cursor)) {
            return false;
        }
        cursor += MinTradeVolField.BYTE_LENGTH;
        if (!corporateActionEventId.parse(data, cursor)) {
            return false;
        }
        cursor += CorporateActionEventIdField.BYTE_LENGTH;
        if (!issueDate.parse(data, cursor)) {
            return false;
        }
        cursor += IssueDateField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!countryOfIssue.parse(data, cursor)) {
            return false;
        }
        cursor += CountryOfIssueField.BYTE_LENGTH;
        if (!startDate.parse(data, cursor)) {
            return false;
        }
        cursor += StartDateField.BYTE_LENGTH;
        if (!endDate.parse(data, cursor)) {
            return false;
        }
        cursor += EndDateField.BYTE_LENGTH;
        if (!settlType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlTypeField.BYTE_LENGTH;
        if (!settlDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlDateField.BYTE_LENGTH;
        if (!datedDate.parse(data, cursor)) {
            return false;
        }
        cursor += DatedDateField.BYTE_LENGTH;
        if (!isinNumber.parse(data, cursor)) {
            return false;
        }
        cursor += IsinNumberField.BYTE_LENGTH;
        if (!asset.parse(data, cursor)) {
            return false;
        }
        cursor += AssetField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!maturityMonthYear.parseFrom(data, cursor, end - 47)) {
            return false;
        }
        cursor += maturityMonthYear.byteLength();
        if (!contractSettlMonth.parseFrom(data, cursor, end - 42)) {
            return false;
        }
        cursor += contractSettlMonth.byteLength();
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!strikeCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += StrikeCurrencyField.BYTE_LENGTH;
        if (!settlCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrencyField.BYTE_LENGTH;
        if (!securityStrategyType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityStrategyTypeField.BYTE_LENGTH;
        if (!lotType.parse(data, cursor)) {
            return false;
        }
        cursor += LotTypeField.BYTE_LENGTH;
        if (!tickSizeDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += TickSizeDenominatorField.BYTE_LENGTH;
        if (!product.parse(data, cursor)) {
            return false;
        }
        cursor += ProductField.BYTE_LENGTH;
        if (!exerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseStyleField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!priceTypeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeOptionalField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!governanceIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += GovernanceIndicatorField.BYTE_LENGTH;
        if (!securityMatchType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityMatchTypeField.BYTE_LENGTH;
        if (!lastFragment.parse(data, cursor)) {
            return false;
        }
        cursor += LastFragmentField.BYTE_LENGTH;
        if (!multiLegModel.parse(data, cursor)) {
            return false;
        }
        cursor += MultiLegModelField.BYTE_LENGTH;
        if (!multiLegPriceMethod.parse(data, cursor)) {
            return false;
        }
        cursor += MultiLegPriceMethodField.BYTE_LENGTH;
        if (!minCrossQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinCrossQtyField.BYTE_LENGTH;
        if (!underlyingsGroups.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += underlyingsGroups.byteLength();
        if (end - cursor < 7) {
            return false;
        }
        if (!legsGroups.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += legsGroups.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!instrAttribsGroups.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += instrAttribsGroups.byteLength();
        if (end - cursor < 1) {
            return false;
        }
        if (!securityDesc.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += securityDesc.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = securityExchange.encode(data, cursor);
        cursor = securityIdSource.encode(data, cursor);
        cursor = securityGroup.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = securityUpdateAction.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = securitySubType.encode(data, cursor);
        cursor = totNoRelatedSym.encode(data, cursor);
        cursor = minPriceIncrementOptional.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = contractMultiplier.encode(data, cursor);
        cursor = priceDivisor.encode(data, cursor);
        cursor = securityValidityTimestamp.encode(data, cursor);
        cursor = noSharesIssued.encode(data, cursor);
        cursor = clearingHouseId.encode(data, cursor);
        cursor = minOrderQty.encode(data, cursor);
        cursor = maxOrderQty.encode(data, cursor);
        cursor = minLotSize.encode(data, cursor);
        cursor = minTradeVol.encode(data, cursor);
        cursor = corporateActionEventId.encode(data, cursor);
        cursor = issueDate.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = countryOfIssue.encode(data, cursor);
        cursor = startDate.encode(data, cursor);
        cursor = endDate.encode(data, cursor);
        cursor = settlType.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = datedDate.encode(data, cursor);
        cursor = isinNumber.encode(data, cursor);
        cursor = asset.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = maturityMonthYear.encode(data, cursor);
        cursor = contractSettlMonth.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = strikeCurrency.encode(data, cursor);
        cursor = settlCurrency.encode(data, cursor);
        cursor = securityStrategyType.encode(data, cursor);
        cursor = lotType.encode(data, cursor);
        cursor = tickSizeDenominator.encode(data, cursor);
        cursor = product.encode(data, cursor);
        cursor = exerciseStyle.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = priceTypeOptional.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = governanceIndicator.encode(data, cursor);
        cursor = securityMatchType.encode(data, cursor);
        cursor = lastFragment.encode(data, cursor);
        cursor = multiLegModel.encode(data, cursor);
        cursor = multiLegPriceMethod.encode(data, cursor);
        cursor = minCrossQty.encode(data, cursor);
        cursor = underlyingsGroups.encode(data, cursor);
        cursor = legsGroups.encode(data, cursor);
        cursor = instrAttribsGroups.encode(data, cursor);
        cursor = securityDesc.encode(data, cursor);
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
        maturityMonthYear.clear();
        contractSettlMonth.clear();
        underlyingsGroups.clear();
        legsGroups.clear();
        instrAttribsGroups.clear();
        securityDesc.clear();
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
            if (field != securityDesc.securityDescLength() && !field.isRecognized()) {
                return false;
            }
        }
        if (!underlyingsGroups.isRecognized()) {
            return false;
        }
        if (!legsGroups.isRecognized()) {
            return false;
        }
        return instrAttribsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != securityDesc.securityDescLength() && !field.isValid()) {
                return false;
            }
        }
        if (!underlyingsGroups.isValid()) {
            return false;
        }
        if (!legsGroups.isValid()) {
            return false;
        }
        if (!instrAttribsGroups.isValid()) {
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
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!securityExchange.isDecoded()) {
            return Optional.of(securityExchange);
        }
        if (!securityIdSource.isDecoded()) {
            return Optional.of(securityIdSource);
        }
        if (!securityGroup.isDecoded()) {
            return Optional.of(securityGroup);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!securityUpdateAction.isDecoded()) {
            return Optional.of(securityUpdateAction);
        }
        if (!securityType.isDecoded()) {
            return Optional.of(securityType);
        }
        if (!securitySubType.isDecoded()) {
            return Optional.of(securitySubType);
        }
        if (!totNoRelatedSym.isDecoded()) {
            return Optional.of(totNoRelatedSym);
        }
        if (!minPriceIncrementOptional.isDecoded()) {
            return Optional.of(minPriceIncrementOptional);
        }
        if (!strikePrice.isDecoded()) {
            return Optional.of(strikePrice);
        }
        if (!contractMultiplier.isDecoded()) {
            return Optional.of(contractMultiplier);
        }
        if (!priceDivisor.isDecoded()) {
            return Optional.of(priceDivisor);
        }
        if (!securityValidityTimestamp.isDecoded()) {
            return Optional.of(securityValidityTimestamp);
        }
        if (!noSharesIssued.isDecoded()) {
            return Optional.of(noSharesIssued);
        }
        if (!clearingHouseId.isDecoded()) {
            return Optional.of(clearingHouseId);
        }
        if (!minOrderQty.isDecoded()) {
            return Optional.of(minOrderQty);
        }
        if (!maxOrderQty.isDecoded()) {
            return Optional.of(maxOrderQty);
        }
        if (!minLotSize.isDecoded()) {
            return Optional.of(minLotSize);
        }
        if (!minTradeVol.isDecoded()) {
            return Optional.of(minTradeVol);
        }
        if (!corporateActionEventId.isDecoded()) {
            return Optional.of(corporateActionEventId);
        }
        if (!issueDate.isDecoded()) {
            return Optional.of(issueDate);
        }
        if (!maturityDate.isDecoded()) {
            return Optional.of(maturityDate);
        }
        if (!countryOfIssue.isDecoded()) {
            return Optional.of(countryOfIssue);
        }
        if (!startDate.isDecoded()) {
            return Optional.of(startDate);
        }
        if (!endDate.isDecoded()) {
            return Optional.of(endDate);
        }
        if (!settlType.isDecoded()) {
            return Optional.of(settlType);
        }
        if (!settlDate.isDecoded()) {
            return Optional.of(settlDate);
        }
        if (!datedDate.isDecoded()) {
            return Optional.of(datedDate);
        }
        if (!isinNumber.isDecoded()) {
            return Optional.of(isinNumber);
        }
        if (!asset.isDecoded()) {
            return Optional.of(asset);
        }
        if (!cfiCode.isDecoded()) {
            return Optional.of(cfiCode);
        }
        if (!maturityMonthYear.isDecoded()) {
            return maturityMonthYear.failedAt();
        }
        if (!contractSettlMonth.isDecoded()) {
            return contractSettlMonth.failedAt();
        }
        if (!currency.isDecoded()) {
            return Optional.of(currency);
        }
        if (!strikeCurrency.isDecoded()) {
            return Optional.of(strikeCurrency);
        }
        if (!settlCurrency.isDecoded()) {
            return Optional.of(settlCurrency);
        }
        if (!securityStrategyType.isDecoded()) {
            return Optional.of(securityStrategyType);
        }
        if (!lotType.isDecoded()) {
            return Optional.of(lotType);
        }
        if (!tickSizeDenominator.isDecoded()) {
            return Optional.of(tickSizeDenominator);
        }
        if (!product.isDecoded()) {
            return Optional.of(product);
        }
        if (!exerciseStyle.isDecoded()) {
            return Optional.of(exerciseStyle);
        }
        if (!putOrCall.isDecoded()) {
            return Optional.of(putOrCall);
        }
        if (!priceTypeOptional.isDecoded()) {
            return Optional.of(priceTypeOptional);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!governanceIndicator.isDecoded()) {
            return Optional.of(governanceIndicator);
        }
        if (!securityMatchType.isDecoded()) {
            return Optional.of(securityMatchType);
        }
        if (!lastFragment.isDecoded()) {
            return Optional.of(lastFragment);
        }
        if (!multiLegModel.isDecoded()) {
            return Optional.of(multiLegModel);
        }
        if (!multiLegPriceMethod.isDecoded()) {
            return Optional.of(multiLegPriceMethod);
        }
        if (!minCrossQty.isDecoded()) {
            return Optional.of(minCrossQty);
        }
        if (!underlyingsGroups.isDecoded()) {
            return underlyingsGroups.failedAt();
        }
        if (!legsGroups.isDecoded()) {
            return legsGroups.failedAt();
        }
        if (!instrAttribsGroups.isDecoded()) {
            return instrAttribsGroups.failedAt();
        }
        if (!securityDesc.isDecoded()) {
            return securityDesc.failedAt();
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
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "SecurityIdSource" -> Optional.of(securityIdSource);
            case "SecurityGroup" -> Optional.of(securityGroup);
            case "Symbol" -> Optional.of(symbol);
            case "SecurityUpdateAction" -> Optional.of(securityUpdateAction);
            case "SecurityType" -> Optional.of(securityType);
            case "SecuritySubType" -> Optional.of(securitySubType);
            case "TotNoRelatedSym" -> Optional.of(totNoRelatedSym);
            case "MinPriceIncrementOptional" -> Optional.of(minPriceIncrementOptional);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "ContractMultiplier" -> Optional.of(contractMultiplier);
            case "PriceDivisor" -> Optional.of(priceDivisor);
            case "SecurityValidityTimestamp" -> Optional.of(securityValidityTimestamp);
            case "NoSharesIssued" -> Optional.of(noSharesIssued);
            case "ClearingHouseId" -> Optional.of(clearingHouseId);
            case "MinOrderQty" -> Optional.of(minOrderQty);
            case "MaxOrderQty" -> Optional.of(maxOrderQty);
            case "MinLotSize" -> Optional.of(minLotSize);
            case "MinTradeVol" -> Optional.of(minTradeVol);
            case "CorporateActionEventId" -> Optional.of(corporateActionEventId);
            case "IssueDate" -> Optional.of(issueDate);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "CountryOfIssue" -> Optional.of(countryOfIssue);
            case "StartDate" -> Optional.of(startDate);
            case "EndDate" -> Optional.of(endDate);
            case "SettlType" -> Optional.of(settlType);
            case "SettlDate" -> Optional.of(settlDate);
            case "DatedDate" -> Optional.of(datedDate);
            case "IsinNumber" -> Optional.of(isinNumber);
            case "Asset" -> Optional.of(asset);
            case "CfiCode" -> Optional.of(cfiCode);
            case "Currency" -> Optional.of(currency);
            case "StrikeCurrency" -> Optional.of(strikeCurrency);
            case "SettlCurrency" -> Optional.of(settlCurrency);
            case "SecurityStrategyType" -> Optional.of(securityStrategyType);
            case "LotType" -> Optional.of(lotType);
            case "TickSizeDenominator" -> Optional.of(tickSizeDenominator);
            case "Product" -> Optional.of(product);
            case "ExerciseStyle" -> Optional.of(exerciseStyle);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "PriceTypeOptional" -> Optional.of(priceTypeOptional);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "GovernanceIndicator" -> Optional.of(governanceIndicator);
            case "SecurityMatchType" -> Optional.of(securityMatchType);
            case "LastFragment" -> Optional.of(lastFragment);
            case "MultiLegModel" -> Optional.of(multiLegModel);
            case "MultiLegPriceMethod" -> Optional.of(multiLegPriceMethod);
            case "MinCrossQty" -> Optional.of(minCrossQty);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(underlyingsGroups.diffFields(message.underlyingsGroups));
        changed.addAll(legsGroups.diffFields(message.legsGroups));
        changed.addAll(instrAttribsGroups.diffFields(message.instrAttribsGroups));
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
            underlyingsGroups.toFormattedString(builder, options);
            builder.append(", ");
            legsGroups.toFormattedString(builder, options);
            builder.append(", ");
            instrAttribsGroups.toFormattedString(builder, options);
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
        underlyingsGroups.toFormattedString(builder, nested);
        legsGroups.toFormattedString(builder, nested);
        instrAttribsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof SecurityDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && underlyingsGroups.equals(message.underlyingsGroups) && legsGroups.equals(message.legsGroups) && instrAttribsGroups.equals(message.instrAttribsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, underlyingsGroups, legsGroups, instrAttribsGroups);
    }
}
