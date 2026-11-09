package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.AccountField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ClearingTradePriceField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ClearingTradeQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.CustOrderHandlingInstField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FreeText1Field;
import omi.eurex.t7.eti.fbe.v6_1.fields.FreeText2Field;
import omi.eurex.t7.eti.fbe.v6_1.fields.FreeText3Field;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MultiLegReportingTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MultilegPriceModelField;
import omi.eurex.t7.eti.fbe.v6_1.fields.OrigTradeIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PackageIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PositionEffectField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ProductComplexField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RelatedProductComplexField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RelatedSecurityIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RelatedSymbolField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyClearingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyClearingOrganizationField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdBeneficiaryField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdClearingUnitField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdExecutingUnitField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdOrderOriginationFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdPositionAccountField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdSessionIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdTakeUpTradingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideTradeIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.StrategyLinkIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TotNumTradeReportsField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeDateField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeReportTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradingCapacityField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TransactTimeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TransferReasonField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TrdTypeField;
import omi.eurex.t7.eti.fbe.v6_1.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the TesTradeBroadcast message from the Eti protocol.
 */
public final class TesTradeBroadcast implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 258;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tes Trade Broadcast";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 27, 7, 257, 1 };

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Clearing Trade Price
     */
    private final ClearingTradePriceField clearingTradePrice = new ClearingTradePriceField();

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Related Security Id
     */
    private final RelatedSecurityIdField relatedSecurityId = new RelatedSecurityIdField();

    /**
     * Package Id
     */
    private final PackageIdField packageId = new PackageIdField();

    /**
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Trade Date
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Side Trade Id
     */
    private final SideTradeIdField sideTradeId = new SideTradeIdField();

    /**
     * Root Party Id Session Id
     */
    private final RootPartyIdSessionIdField rootPartyIdSessionId = new RootPartyIdSessionIdField();

    /**
     * Orig Trade Id
     */
    private final OrigTradeIdField origTradeId = new OrigTradeIdField();

    /**
     * Clearing Trade Qty
     */
    private final ClearingTradeQtyField clearingTradeQty = new ClearingTradeQtyField();

    /**
     * Root Party Id Executing Unit
     */
    private final RootPartyIdExecutingUnitField rootPartyIdExecutingUnit = new RootPartyIdExecutingUnitField();

    /**
     * Root Party Id Executing Trader
     */
    private final RootPartyIdExecutingTraderField rootPartyIdExecutingTrader = new RootPartyIdExecutingTraderField();

    /**
     * Root Party Id Clearing Unit
     */
    private final RootPartyIdClearingUnitField rootPartyIdClearingUnit = new RootPartyIdClearingUnitField();

    /**
     * Strategy Link Id
     */
    private final StrategyLinkIdField strategyLinkId = new StrategyLinkIdField();

    /**
     * Related Symbol
     */
    private final RelatedSymbolField relatedSymbol = new RelatedSymbolField();

    /**
     * Tot Num Trade Reports
     */
    private final TotNumTradeReportsField totNumTradeReports = new TotNumTradeReportsField();

    /**
     * Trd Type
     */
    private final TrdTypeField trdType = new TrdTypeField();

    /**
     * Product Complex
     */
    private final ProductComplexField productComplex = new ProductComplexField();

    /**
     * Related Product Complex
     */
    private final RelatedProductComplexField relatedProductComplex = new RelatedProductComplexField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Transfer Reason
     */
    private final TransferReasonField transferReason = new TransferReasonField();

    /**
     * Multi Leg Reporting Type
     */
    private final MultiLegReportingTypeField multiLegReportingType = new MultiLegReportingTypeField();

    /**
     * Position Effect
     */
    private final PositionEffectField positionEffect = new PositionEffectField();

    /**
     * Multileg Price Model
     */
    private final MultilegPriceModelField multilegPriceModel = new MultilegPriceModelField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Root Party Id Position Account
     */
    private final RootPartyIdPositionAccountField rootPartyIdPositionAccount = new RootPartyIdPositionAccountField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Free Text 1
     */
    private final FreeText1Field freeText1 = new FreeText1Field();

    /**
     * Free Text 2
     */
    private final FreeText2Field freeText2 = new FreeText2Field();

    /**
     * Free Text 3
     */
    private final FreeText3Field freeText3 = new FreeText3Field();

    /**
     * Root Party Executing Firm
     */
    private final RootPartyExecutingFirmField rootPartyExecutingFirm = new RootPartyExecutingFirmField();

    /**
     * Root Party Executing Trader
     */
    private final RootPartyExecutingTraderField rootPartyExecutingTrader = new RootPartyExecutingTraderField();

    /**
     * Root Party Clearing Firm
     */
    private final RootPartyClearingFirmField rootPartyClearingFirm = new RootPartyClearingFirmField();

    /**
     * Root Party Clearing Organization
     */
    private final RootPartyClearingOrganizationField rootPartyClearingOrganization = new RootPartyClearingOrganizationField();

    /**
     * Root Party Id Beneficiary
     */
    private final RootPartyIdBeneficiaryField rootPartyIdBeneficiary = new RootPartyIdBeneficiaryField();

    /**
     * Root Party Id Take Up Trading Firm
     */
    private final RootPartyIdTakeUpTradingFirmField rootPartyIdTakeUpTradingFirm = new RootPartyIdTakeUpTradingFirmField();

    /**
     * Root Party Id Order Origination Firm
     */
    private final RootPartyIdOrderOriginationFirmField rootPartyIdOrderOriginationFirm = new RootPartyIdOrderOriginationFirmField();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(lastPx), List.<Field>of(clearingTradePrice), List.<Field>of(transactTime), List.<Field>of(relatedSecurityId), List.<Field>of(packageId), List.<Field>of(lastQty), List.<Field>of(marketSegmentId), List.<Field>of(tradeId), List.<Field>of(tradeDate), List.<Field>of(sideTradeId), List.<Field>of(rootPartyIdSessionId), List.<Field>of(origTradeId), List.<Field>of(clearingTradeQty), List.<Field>of(rootPartyIdExecutingUnit), List.<Field>of(rootPartyIdExecutingTrader), List.<Field>of(rootPartyIdClearingUnit), List.<Field>of(strategyLinkId), List.<Field>of(relatedSymbol), List.<Field>of(totNumTradeReports), List.<Field>of(trdType), List.<Field>of(productComplex), List.<Field>of(relatedProductComplex), List.<Field>of(side), List.<Field>of(tradingCapacity), List.<Field>of(tradeReportType), List.<Field>of(transferReason), List.<Field>of(multiLegReportingType), List.<Field>of(positionEffect), List.<Field>of(multilegPriceModel), List.<Field>of(account), List.<Field>of(rootPartyIdPositionAccount), List.<Field>of(custOrderHandlingInst), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText3), List.<Field>of(rootPartyExecutingFirm), List.<Field>of(rootPartyExecutingTrader), List.<Field>of(rootPartyClearingFirm), List.<Field>of(rootPartyClearingOrganization), List.<Field>of(rootPartyIdBeneficiary), List.<Field>of(rootPartyIdTakeUpTradingFirm), List.<Field>of(rootPartyIdOrderOriginationFirm)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Clearing Trade Price
     *
     * @return the ClearingTradePrice field
     */
    public ClearingTradePriceField clearingTradePrice() {
        return clearingTradePrice;
    }

    /**
     * Transact Time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Related Security Id
     *
     * @return the RelatedSecurityId field
     */
    public RelatedSecurityIdField relatedSecurityId() {
        return relatedSecurityId;
    }

    /**
     * Package Id
     *
     * @return the PackageId field
     */
    public PackageIdField packageId() {
        return packageId;
    }

    /**
     * Last Qty
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Trade Id
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Trade Date
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Side Trade Id
     *
     * @return the SideTradeId field
     */
    public SideTradeIdField sideTradeId() {
        return sideTradeId;
    }

    /**
     * Root Party Id Session Id
     *
     * @return the RootPartyIdSessionId field
     */
    public RootPartyIdSessionIdField rootPartyIdSessionId() {
        return rootPartyIdSessionId;
    }

    /**
     * Orig Trade Id
     *
     * @return the OrigTradeId field
     */
    public OrigTradeIdField origTradeId() {
        return origTradeId;
    }

    /**
     * Clearing Trade Qty
     *
     * @return the ClearingTradeQty field
     */
    public ClearingTradeQtyField clearingTradeQty() {
        return clearingTradeQty;
    }

    /**
     * Root Party Id Executing Unit
     *
     * @return the RootPartyIdExecutingUnit field
     */
    public RootPartyIdExecutingUnitField rootPartyIdExecutingUnit() {
        return rootPartyIdExecutingUnit;
    }

    /**
     * Root Party Id Executing Trader
     *
     * @return the RootPartyIdExecutingTrader field
     */
    public RootPartyIdExecutingTraderField rootPartyIdExecutingTrader() {
        return rootPartyIdExecutingTrader;
    }

    /**
     * Root Party Id Clearing Unit
     *
     * @return the RootPartyIdClearingUnit field
     */
    public RootPartyIdClearingUnitField rootPartyIdClearingUnit() {
        return rootPartyIdClearingUnit;
    }

    /**
     * Strategy Link Id
     *
     * @return the StrategyLinkId field
     */
    public StrategyLinkIdField strategyLinkId() {
        return strategyLinkId;
    }

    /**
     * Related Symbol
     *
     * @return the RelatedSymbol field
     */
    public RelatedSymbolField relatedSymbol() {
        return relatedSymbol;
    }

    /**
     * Tot Num Trade Reports
     *
     * @return the TotNumTradeReports field
     */
    public TotNumTradeReportsField totNumTradeReports() {
        return totNumTradeReports;
    }

    /**
     * Trd Type
     *
     * @return the TrdType field
     */
    public TrdTypeField trdType() {
        return trdType;
    }

    /**
     * Product Complex
     *
     * @return the ProductComplex field
     */
    public ProductComplexField productComplex() {
        return productComplex;
    }

    /**
     * Related Product Complex
     *
     * @return the RelatedProductComplex field
     */
    public RelatedProductComplexField relatedProductComplex() {
        return relatedProductComplex;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Trading Capacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
    }

    /**
     * Trade Report Type
     *
     * @return the TradeReportType field
     */
    public TradeReportTypeField tradeReportType() {
        return tradeReportType;
    }

    /**
     * Transfer Reason
     *
     * @return the TransferReason field
     */
    public TransferReasonField transferReason() {
        return transferReason;
    }

    /**
     * Multi Leg Reporting Type
     *
     * @return the MultiLegReportingType field
     */
    public MultiLegReportingTypeField multiLegReportingType() {
        return multiLegReportingType;
    }

    /**
     * Position Effect
     *
     * @return the PositionEffect field
     */
    public PositionEffectField positionEffect() {
        return positionEffect;
    }

    /**
     * Multileg Price Model
     *
     * @return the MultilegPriceModel field
     */
    public MultilegPriceModelField multilegPriceModel() {
        return multilegPriceModel;
    }

    /**
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Root Party Id Position Account
     *
     * @return the RootPartyIdPositionAccount field
     */
    public RootPartyIdPositionAccountField rootPartyIdPositionAccount() {
        return rootPartyIdPositionAccount;
    }

    /**
     * Cust Order Handling Inst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
    }

    /**
     * Free Text 1
     *
     * @return the FreeText1 field
     */
    public FreeText1Field freeText1() {
        return freeText1;
    }

    /**
     * Free Text 2
     *
     * @return the FreeText2 field
     */
    public FreeText2Field freeText2() {
        return freeText2;
    }

    /**
     * Free Text 3
     *
     * @return the FreeText3 field
     */
    public FreeText3Field freeText3() {
        return freeText3;
    }

    /**
     * Root Party Executing Firm
     *
     * @return the RootPartyExecutingFirm field
     */
    public RootPartyExecutingFirmField rootPartyExecutingFirm() {
        return rootPartyExecutingFirm;
    }

    /**
     * Root Party Executing Trader
     *
     * @return the RootPartyExecutingTrader field
     */
    public RootPartyExecutingTraderField rootPartyExecutingTrader() {
        return rootPartyExecutingTrader;
    }

    /**
     * Root Party Clearing Firm
     *
     * @return the RootPartyClearingFirm field
     */
    public RootPartyClearingFirmField rootPartyClearingFirm() {
        return rootPartyClearingFirm;
    }

    /**
     * Root Party Clearing Organization
     *
     * @return the RootPartyClearingOrganization field
     */
    public RootPartyClearingOrganizationField rootPartyClearingOrganization() {
        return rootPartyClearingOrganization;
    }

    /**
     * Root Party Id Beneficiary
     *
     * @return the RootPartyIdBeneficiary field
     */
    public RootPartyIdBeneficiaryField rootPartyIdBeneficiary() {
        return rootPartyIdBeneficiary;
    }

    /**
     * Root Party Id Take Up Trading Firm
     *
     * @return the RootPartyIdTakeUpTradingFirm field
     */
    public RootPartyIdTakeUpTradingFirmField rootPartyIdTakeUpTradingFirm() {
        return rootPartyIdTakeUpTradingFirm;
    }

    /**
     * Root Party Id Order Origination Firm
     *
     * @return the RootPartyIdOrderOriginationFirm field
     */
    public RootPartyIdOrderOriginationFirmField rootPartyIdOrderOriginationFirm() {
        return rootPartyIdOrderOriginationFirm;
    }

    /**
     * Rbc Header Comp
     *
     * @return the RbcHeaderComp record
     */
    public RbcHeaderComp rbcHeaderComp() {
        return rbcHeaderComp;
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
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(rbcHeaderComp.sendingTime().value());
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
        cursor += 2; // padding
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 224)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!clearingTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingTradePriceField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!relatedSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedSecurityIdField.BYTE_LENGTH;
        if (!packageId.parse(data, cursor)) {
            return false;
        }
        cursor += PackageIdField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!sideTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += SideTradeIdField.BYTE_LENGTH;
        if (!rootPartyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdSessionIdField.BYTE_LENGTH;
        if (!origTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigTradeIdField.BYTE_LENGTH;
        if (!clearingTradeQty.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingTradeQtyField.BYTE_LENGTH;
        if (!rootPartyIdExecutingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdExecutingUnitField.BYTE_LENGTH;
        if (!rootPartyIdExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdExecutingTraderField.BYTE_LENGTH;
        if (!rootPartyIdClearingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdClearingUnitField.BYTE_LENGTH;
        if (!strategyLinkId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyLinkIdField.BYTE_LENGTH;
        if (!relatedSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedSymbolField.BYTE_LENGTH;
        if (!totNumTradeReports.parse(data, cursor)) {
            return false;
        }
        cursor += TotNumTradeReportsField.BYTE_LENGTH;
        if (!trdType.parse(data, cursor)) {
            return false;
        }
        cursor += TrdTypeField.BYTE_LENGTH;
        if (!productComplex.parse(data, cursor)) {
            return false;
        }
        cursor += ProductComplexField.BYTE_LENGTH;
        if (!relatedProductComplex.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedProductComplexField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!transferReason.parse(data, cursor)) {
            return false;
        }
        cursor += TransferReasonField.BYTE_LENGTH;
        if (!multiLegReportingType.parse(data, cursor)) {
            return false;
        }
        cursor += MultiLegReportingTypeField.BYTE_LENGTH;
        if (!positionEffect.parse(data, cursor)) {
            return false;
        }
        cursor += PositionEffectField.BYTE_LENGTH;
        if (!multilegPriceModel.parse(data, cursor)) {
            return false;
        }
        cursor += MultilegPriceModelField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!rootPartyIdPositionAccount.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdPositionAccountField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        if (!freeText1.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText1Field.BYTE_LENGTH;
        if (!freeText2.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText2Field.BYTE_LENGTH;
        if (!freeText3.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText3Field.BYTE_LENGTH;
        if (!rootPartyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingFirmField.BYTE_LENGTH;
        if (!rootPartyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingTraderField.BYTE_LENGTH;
        if (!rootPartyClearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyClearingFirmField.BYTE_LENGTH;
        if (!rootPartyClearingOrganization.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyClearingOrganizationField.BYTE_LENGTH;
        if (!rootPartyIdBeneficiary.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdBeneficiaryField.BYTE_LENGTH;
        if (!rootPartyIdTakeUpTradingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdTakeUpTradingFirmField.BYTE_LENGTH;
        if (!rootPartyIdOrderOriginationFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdOrderOriginationFirmField.BYTE_LENGTH;
        cursor += 1; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = clearingTradePrice.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = relatedSecurityId.encode(data, cursor);
        cursor = packageId.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = sideTradeId.encode(data, cursor);
        cursor = rootPartyIdSessionId.encode(data, cursor);
        cursor = origTradeId.encode(data, cursor);
        cursor = clearingTradeQty.encode(data, cursor);
        cursor = rootPartyIdExecutingUnit.encode(data, cursor);
        cursor = rootPartyIdExecutingTrader.encode(data, cursor);
        cursor = rootPartyIdClearingUnit.encode(data, cursor);
        cursor = strategyLinkId.encode(data, cursor);
        cursor = relatedSymbol.encode(data, cursor);
        cursor = totNumTradeReports.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = relatedProductComplex.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = transferReason.encode(data, cursor);
        cursor = multiLegReportingType.encode(data, cursor);
        cursor = positionEffect.encode(data, cursor);
        cursor = multilegPriceModel.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = rootPartyIdPositionAccount.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText3.encode(data, cursor);
        cursor = rootPartyExecutingFirm.encode(data, cursor);
        cursor = rootPartyExecutingTrader.encode(data, cursor);
        cursor = rootPartyClearingFirm.encode(data, cursor);
        cursor = rootPartyClearingOrganization.encode(data, cursor);
        cursor = rootPartyIdBeneficiary.encode(data, cursor);
        cursor = rootPartyIdTakeUpTradingFirm.encode(data, cursor);
        cursor = rootPartyIdOrderOriginationFirm.encode(data, cursor);
        if (buffer != null && buffer.length >= 257 + 1) {
            System.arraycopy(buffer, 257, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
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
        rbcHeaderComp.clear();
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
            case "SecurityId" -> Optional.of(securityId);
            case "LastPx" -> Optional.of(lastPx);
            case "ClearingTradePrice" -> Optional.of(clearingTradePrice);
            case "TransactTime" -> Optional.of(transactTime);
            case "RelatedSecurityId" -> Optional.of(relatedSecurityId);
            case "PackageId" -> Optional.of(packageId);
            case "LastQty" -> Optional.of(lastQty);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "TradeId" -> Optional.of(tradeId);
            case "TradeDate" -> Optional.of(tradeDate);
            case "SideTradeId" -> Optional.of(sideTradeId);
            case "RootPartyIdSessionId" -> Optional.of(rootPartyIdSessionId);
            case "OrigTradeId" -> Optional.of(origTradeId);
            case "ClearingTradeQty" -> Optional.of(clearingTradeQty);
            case "RootPartyIdExecutingUnit" -> Optional.of(rootPartyIdExecutingUnit);
            case "RootPartyIdExecutingTrader" -> Optional.of(rootPartyIdExecutingTrader);
            case "RootPartyIdClearingUnit" -> Optional.of(rootPartyIdClearingUnit);
            case "StrategyLinkId" -> Optional.of(strategyLinkId);
            case "RelatedSymbol" -> Optional.of(relatedSymbol);
            case "TotNumTradeReports" -> Optional.of(totNumTradeReports);
            case "TrdType" -> Optional.of(trdType);
            case "ProductComplex" -> Optional.of(productComplex);
            case "RelatedProductComplex" -> Optional.of(relatedProductComplex);
            case "Side" -> Optional.of(side);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TransferReason" -> Optional.of(transferReason);
            case "MultiLegReportingType" -> Optional.of(multiLegReportingType);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "MultilegPriceModel" -> Optional.of(multilegPriceModel);
            case "Account" -> Optional.of(account);
            case "RootPartyIdPositionAccount" -> Optional.of(rootPartyIdPositionAccount);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText3" -> Optional.of(freeText3);
            case "RootPartyExecutingFirm" -> Optional.of(rootPartyExecutingFirm);
            case "RootPartyExecutingTrader" -> Optional.of(rootPartyExecutingTrader);
            case "RootPartyClearingFirm" -> Optional.of(rootPartyClearingFirm);
            case "RootPartyClearingOrganization" -> Optional.of(rootPartyClearingOrganization);
            case "RootPartyIdBeneficiary" -> Optional.of(rootPartyIdBeneficiary);
            case "RootPartyIdTakeUpTradingFirm" -> Optional.of(rootPartyIdTakeUpTradingFirm);
            case "RootPartyIdOrderOriginationFirm" -> Optional.of(rootPartyIdOrderOriginationFirm);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TesTradeBroadcast message)) {
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
        if (!(other instanceof TesTradeBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
