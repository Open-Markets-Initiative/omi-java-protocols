package omi.nasdaq.phlxoptions.cti.itch.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.AccountField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.AuctionIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.AuctionTypeField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.BrokerField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.CapacityField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ClearingFlagsField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ContraBrokerField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ContraCapacityField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ContraExchangeClearingNumberField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ContraExchangeHouseField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ContraGiveUpOccClearingNumberField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ContraMpidField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ContraNsccField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ContraOccClearingNumberField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ContraSecondBrokerField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.CorrectionNumberField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.CrossIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.CustomerStrategyLegField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ExchangeClearingNumberField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ExchangeHouseField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ExchangeSuffixField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ExecutingBrokerField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ExecutionMarketField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ExecutionTypeField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ExpirationField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.FirmField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.GiveUpOccClearingNumberField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.LiquidityField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.MatchIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.MpidField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.MultiAccountField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.NanosecondsField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.NsccField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OccClearingNumberField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OpenCloseIndicatorField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OptionIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OptionKindField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OrderDateField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OrderIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OrderIndicatorsField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OrderPriceField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OrderSizeField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OriginMarketField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OriginTypeField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.PrincipalAgentField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.QuoteIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.RefCorrectionNumberField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.RefMatchIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.RefTradeIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.SecondBrokerField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.SecondsField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.SecuritySymbolField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.SendTypeField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ShortSellField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.SideChangedField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.SqfSweepIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.StrategyIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.StrategyLegField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.StrikePriceField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.SupplementaryIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.TifField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.TradeContractsField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.TradeFlagsField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.TradeIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.TradePriceField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.TradeSideField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.TransactionTypeField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.UnderlyingSymbolField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.VersionField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.types.Field;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.types.Message;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.types.PrintOptions;

/**
 * Represents the TradeMessage message from the Cti protocol.
 *
 * <p>Clearing trades and trade corrections, with contra side clearing information (trade cancels too when a firm and connection block is configured for extended cancels, Transaction Type Z). 337 bytes. Contra side clearing fields carry a Contra prefix.</p>
 */
public final class TradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'T';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 336;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 44, 4, 101, 8, 188, 6, 228, 8, 328, 8 };

    /**
     * Seconds portion of timestamp: whole seconds after midnight US Eastern Time (0 to 86400)
     */
    private final SecondsField seconds = new SecondsField();

    /**
     * Nanoseconds portion of timestamp (0 to 999999999)
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * CTI version, decoded as Mn (major, minor): currently set to 30
     */
    private final VersionField version = new VersionField();

    /**
     * S = Send (original transmission), P = Possible duplicate (unsolicited retransmission)
     */
    private final SendTypeField sendType = new SendTypeField();

    /**
     * Option id assigned by exchange daily
     */
    private final OptionIdField optionId = new OptionIdField();

    /**
     * Underlying stock symbol (left justified, space filled). The document types this field Integer.
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Option root symbol
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Expiration date of the option packed into 2 bytes: Bits 0-6 = Year (0-99), Bits 7-10 = Month (1-12), Bits 11-15 = Day (1-31); bit 15 is the least significant bit
     */
    private final ExpirationField expiration = new ExpirationField();

    /**
     * Strike price of the option: fixed point with 4 decimal digits
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * C = Call, P = Put
     */
    private final OptionKindField optionKind = new OptionKindField();

    /**
     * Trade message symbol flags (2 bytes); bit 15 is the least significant bit. When available, only one of Bits 3, 4 and 5 will be set to 1 for an option.
     */
    private final TradeFlagsField tradeFlags = new TradeFlagsField();

    /**
     * X = new trade, Y = trade correction, Z = trade cancel (if trade cancel messages are to be sent using this message)
     */
    private final TransactionTypeField transactionType = new TransactionTypeField();

    /**
     * See Liquidity Codes
     */
    private final LiquidityField liquidity = new LiquidityField();

    /**
     * Clearing trade Id. Coupled with correction number and trade side uniquely identifies a clearing trade for a given day.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Trade correction number. 0 for new trades. Used to identify version of the trade being corrected.
     */
    private final CorrectionNumberField correctionNumber = new CorrectionNumberField();

    /**
     * Trade Group Id. Ties together all clearing trades of a given atomic transaction in the matching engine. 0 if cross id is not available.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Execution Id of the trade
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * Auction id for trades resulting from an auction (e.g. Complex Order Live Auction (Exposure/COLA), PIXL/PRISM/PIM Auction) or 0 if none
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Auction Type for trades resulting from an auction. Blank for Manual Trades.
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * For corrected trades, trade id of prior trade. 0 if never corrected.
     */
    private final RefTradeIdField refTradeId = new RefTradeIdField();

    /**
     * For corrected trades, correction number of prior trade. 0 if never corrected.
     */
    private final RefCorrectionNumberField refCorrectionNumber = new RefCorrectionNumberField();

    /**
     * For corrected trades, Execution Id of the prior trade
     */
    private final RefMatchIdField refMatchId = new RefMatchIdField();

    /**
     * A = automatic, M = manual. A trade is automatic when it is assigned by the electronic matching engine; order bookings and QCCs originating from the Phlx floor are marked automatic.
     */
    private final ExecutionTypeField executionType = new ExecutionTypeField();

    /**
     * Away execution market id for options, space for stock legs on PHLX/ISE/MRX and for trades that are not away. The document types this field Integer; its values are characters.
     */
    private final ExecutionMarketField executionMarket = new ExecutionMarketField();

    /**
     * B = Buy, S = Sell
     */
    private final TradeSideField tradeSide = new TradeSideField();

    /**
     * Trade price: long, fixed point with 6 decimal digits
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Trade contracts
     */
    private final TradeContractsField tradeContracts = new TradeContractsField();

    /**
     * Y = new trades and corrections that affected this side of the trade, N = corrections that affected only contra side
     */
    private final SideChangedField sideChanged = new SideChangedField();

    /**
     * Strategy id assigned daily
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Leg reference (leg index starting from 0 in the Complex Order Strategy message) if either side of the trade involves a complex order or sweep
     */
    private final StrategyLegField strategyLeg = new StrategyLegField();

    /**
     * Same side: OCC clearing number or CMTA provided by firm
     */
    private final OccClearingNumberField occClearingNumber = new OccClearingNumberField();

    /**
     * Same side: OCC clearing number of the giving-up firm if OCC clearing number above is CMTA, otherwise 0
     */
    private final GiveUpOccClearingNumberField giveUpOccClearingNumber = new GiveUpOccClearingNumberField();

    /**
     * Same side: Exchange assigned clearing number
     */
    private final ExchangeClearingNumberField exchangeClearingNumber = new ExchangeClearingNumberField();

    /**
     * Same side: Exchange assigned house number
     */
    private final ExchangeHouseField exchangeHouse = new ExchangeHouseField();

    /**
     * Same side: Exchange assigned house suffix for market makers (badge suffix)
     */
    private final ExchangeSuffixField exchangeSuffix = new ExchangeSuffixField();

    /**
     * Same side capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Same side: Sub or multi account. Stores the Market Maker badge (house + suffix) for On-Floor Market Maker orders with CMTA.
     */
    private final MultiAccountField multiAccount = new MultiAccountField();

    /**
     * Same side: Floor broker number/Executing Broker
     */
    private final BrokerField broker = new BrokerField();

    /**
     * Same side: 2nd floor broker number
     */
    private final SecondBrokerField secondBroker = new SecondBrokerField();

    /**
     * Originating market of the order for market makers (FIX tag 207 Security Exchange); space when the capacity of this side of the trade is not O
     */
    private final OriginMarketField originMarket = new OriginMarketField();

    /**
     * Account as specified in the order (FIX tag 1 Account)
     */
    private final AccountField account = new AccountField();

    /**
     * Same side: NSCC clearing number for a stock leg
     */
    private final NsccField nscc = new NsccField();

    /**
     * Same side: MPID for the Stock Leg
     */
    private final MpidField mpid = new MpidField();

    /**
     * Same side clearing flags (2 bytes). Only Bit 0 is defined; numbered, as in the other 2 byte flag fields of this message, with bit 15 the least significant bit.
     */
    private final ClearingFlagsField clearingFlags = new ClearingFlagsField();

    /**
     * Executing Broker
     */
    private final ExecutingBrokerField executingBroker = new ExecutingBrokerField();

    /**
     * Contra side: OCC clearing number or CMTA provided by firm
     */
    private final ContraOccClearingNumberField contraOccClearingNumber = new ContraOccClearingNumberField();

    /**
     * Contra side: OCC clearing number of the giving-up firm if OCC clearing number above is CMTA, otherwise 0
     */
    private final ContraGiveUpOccClearingNumberField contraGiveUpOccClearingNumber = new ContraGiveUpOccClearingNumberField();

    /**
     * Contra side: Exchange assigned clearing number
     */
    private final ContraExchangeClearingNumberField contraExchangeClearingNumber = new ContraExchangeClearingNumberField();

    /**
     * Contra side: Exchange assigned house number
     */
    private final ContraExchangeHouseField contraExchangeHouse = new ContraExchangeHouseField();

    /**
     * Contra side capacity
     */
    private final ContraCapacityField contraCapacity = new ContraCapacityField();

    /**
     * Contra side: Floor broker number
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * Contra side: 2nd floor broker number
     */
    private final ContraSecondBrokerField contraSecondBroker = new ContraSecondBrokerField();

    /**
     * Contra side: NSCC clearing number for a stock leg
     */
    private final ContraNsccField contraNscc = new ContraNsccField();

    /**
     * Contra side: NASDAQ assigned MPID for a stock leg
     */
    private final ContraMpidField contraMpid = new ContraMpidField();

    /**
     * Firm Identifier for the order or Quote
     */
    private final FirmField firm = new FirmField();

    /**
     * Date when a FIX order is entered, packed into 2 bytes: Bits 0-6 = Year (0-99), Bits 7-10 = Month (1-12), Bits 11-15 = Day (1-31); bit 15 is the least significant bit. 0 if the order is not a GTC or GTD order.
     */
    private final OrderDateField orderDate = new OrderDateField();

    /**
     * Right padded FIX/OTTO order id or spaces. Populated with CLOrderID. Not populated when the origin source is FBMS FIX.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Quote id for quotes with ids (from SQF feed v6 and higher). Right padded 1 for quotes without ids, spaces if this side of the trade is not a quote. Binary.
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Sweep id for order sweeps with ids (from SQF feed v6 and higher). Right padded 1 for sweeps without ids, spaces if this side of the trade is not a sweep. Binary.
     */
    private final SqfSweepIdField sqfSweepId = new SqfSweepIdField();

    /**
     * Open/Close indicator from FIX/OTTO orders. Space for stock leg.
     */
    private final OpenCloseIndicatorField openCloseIndicator = new OpenCloseIndicatorField();

    /**
     * Leg reference id of a complex order as sent by the customer or spaces
     */
    private final CustomerStrategyLegField customerStrategyLeg = new CustomerStrategyLegField();

    /**
     * Short sell for a stock leg: Y = Short Sale, N = Not a Short Sale, E = Short Sale Exempt, space = Not Applicable (Not a Stock Leg)
     */
    private final ShortSellField shortSell = new ShortSellField();

    /**
     * Capacity for a stock leg: A = Agency Order, P = Principle, R = Riskless Principle, space = Not a stock leg
     */
    private final PrincipalAgentField principalAgent = new PrincipalAgentField();

    /**
     * Supplementary Id from FIX orders (FIX tag 58 Text)
     */
    private final SupplementaryIdField supplementaryId = new SupplementaryIdField();

    /**
     * Same side order indicators (2 bytes); bit 15 is the least significant bit. Directed/Preferenced, Post Only, ISE Directed and MKT Order indicators are not available for Manual Trades, Trade Correction and Cancels.
     */
    private final OrderIndicatorsField orderIndicators = new OrderIndicatorsField();

    /**
     * Origin of this side of the trade
     */
    private final OriginTypeField originType = new OriginTypeField();

    /**
     * Size of the order/quote/sweep or 0 for manual trades
     */
    private final OrderSizeField orderSize = new OrderSizeField();

    /**
     * Price of the order/quote/sweep: fixed point with 4 decimal digits. 0 for MKT Orders (indicated by the MKT bit in Order Indicators) and for manual trades.
     */
    private final OrderPriceField orderPrice = new OrderPriceField();

    /**
     * Time In Force for the order/quote/sweep. FOK orders are returned with TIF = IOC.
     */
    private final TifField tif = new TifField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seconds, nanoseconds, version, sendType, optionId, underlyingSymbol, securitySymbol, expiration, strikePrice, optionKind, tradeFlags, transactionType, liquidity, tradeId, correctionNumber, crossId, matchId, auctionId, auctionType, refTradeId, refCorrectionNumber, refMatchId, executionType, executionMarket, tradeSide, tradePrice, tradeContracts, sideChanged, strategyId, strategyLeg, occClearingNumber, giveUpOccClearingNumber, exchangeClearingNumber, exchangeHouse, exchangeSuffix, capacity, multiAccount, broker, secondBroker, originMarket, account, nscc, mpid, clearingFlags, executingBroker, contraOccClearingNumber, contraGiveUpOccClearingNumber, contraExchangeClearingNumber, contraExchangeHouse, contraCapacity, contraBroker, contraSecondBroker, contraNscc, contraMpid, firm, orderDate, orderId, quoteId, sqfSweepId, openCloseIndicator, customerStrategyLeg, shortSell, principalAgent, supplementaryId, orderIndicators, originType, orderSize, orderPrice, tif);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Seconds portion of timestamp: whole seconds after midnight US Eastern Time (0 to 86400)
     *
     * @return the Seconds field
     */
    public SecondsField seconds() {
        return seconds;
    }

    /**
     * Nanoseconds portion of timestamp (0 to 999999999)
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * CTI version, decoded as Mn (major, minor): currently set to 30
     *
     * @return the Version field
     */
    public VersionField version() {
        return version;
    }

    /**
     * S = Send (original transmission), P = Possible duplicate (unsolicited retransmission)
     *
     * @return the SendType field
     */
    public SendTypeField sendType() {
        return sendType;
    }

    /**
     * Option id assigned by exchange daily
     *
     * @return the OptionId field
     */
    public OptionIdField optionId() {
        return optionId;
    }

    /**
     * Underlying stock symbol (left justified, space filled). The document types this field Integer.
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Option root symbol
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * Expiration date of the option packed into 2 bytes: Bits 0-6 = Year (0-99), Bits 7-10 = Month (1-12), Bits 11-15 = Day (1-31); bit 15 is the least significant bit
     *
     * @return the Expiration field
     */
    public ExpirationField expiration() {
        return expiration;
    }

    /**
     * Strike price of the option: fixed point with 4 decimal digits
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * C = Call, P = Put
     *
     * @return the OptionKind field
     */
    public OptionKindField optionKind() {
        return optionKind;
    }

    /**
     * Trade message symbol flags (2 bytes); bit 15 is the least significant bit. When available, only one of Bits 3, 4 and 5 will be set to 1 for an option.
     *
     * @return the TradeFlags field
     */
    public TradeFlagsField tradeFlags() {
        return tradeFlags;
    }

    /**
     * X = new trade, Y = trade correction, Z = trade cancel (if trade cancel messages are to be sent using this message)
     *
     * @return the TransactionType field
     */
    public TransactionTypeField transactionType() {
        return transactionType;
    }

    /**
     * See Liquidity Codes
     *
     * @return the Liquidity field
     */
    public LiquidityField liquidity() {
        return liquidity;
    }

    /**
     * Clearing trade Id. Coupled with correction number and trade side uniquely identifies a clearing trade for a given day.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Trade correction number. 0 for new trades. Used to identify version of the trade being corrected.
     *
     * @return the CorrectionNumber field
     */
    public CorrectionNumberField correctionNumber() {
        return correctionNumber;
    }

    /**
     * Trade Group Id. Ties together all clearing trades of a given atomic transaction in the matching engine. 0 if cross id is not available.
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * Execution Id of the trade
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * Auction id for trades resulting from an auction (e.g. Complex Order Live Auction (Exposure/COLA), PIXL/PRISM/PIM Auction) or 0 if none
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Auction Type for trades resulting from an auction. Blank for Manual Trades.
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * For corrected trades, trade id of prior trade. 0 if never corrected.
     *
     * @return the RefTradeId field
     */
    public RefTradeIdField refTradeId() {
        return refTradeId;
    }

    /**
     * For corrected trades, correction number of prior trade. 0 if never corrected.
     *
     * @return the RefCorrectionNumber field
     */
    public RefCorrectionNumberField refCorrectionNumber() {
        return refCorrectionNumber;
    }

    /**
     * For corrected trades, Execution Id of the prior trade
     *
     * @return the RefMatchId field
     */
    public RefMatchIdField refMatchId() {
        return refMatchId;
    }

    /**
     * A = automatic, M = manual. A trade is automatic when it is assigned by the electronic matching engine; order bookings and QCCs originating from the Phlx floor are marked automatic.
     *
     * @return the ExecutionType field
     */
    public ExecutionTypeField executionType() {
        return executionType;
    }

    /**
     * Away execution market id for options, space for stock legs on PHLX/ISE/MRX and for trades that are not away. The document types this field Integer; its values are characters.
     *
     * @return the ExecutionMarket field
     */
    public ExecutionMarketField executionMarket() {
        return executionMarket;
    }

    /**
     * B = Buy, S = Sell
     *
     * @return the TradeSide field
     */
    public TradeSideField tradeSide() {
        return tradeSide;
    }

    /**
     * Trade price: long, fixed point with 6 decimal digits
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Trade contracts
     *
     * @return the TradeContracts field
     */
    public TradeContractsField tradeContracts() {
        return tradeContracts;
    }

    /**
     * Y = new trades and corrections that affected this side of the trade, N = corrections that affected only contra side
     *
     * @return the SideChanged field
     */
    public SideChangedField sideChanged() {
        return sideChanged;
    }

    /**
     * Strategy id assigned daily
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * Leg reference (leg index starting from 0 in the Complex Order Strategy message) if either side of the trade involves a complex order or sweep
     *
     * @return the StrategyLeg field
     */
    public StrategyLegField strategyLeg() {
        return strategyLeg;
    }

    /**
     * Same side: OCC clearing number or CMTA provided by firm
     *
     * @return the OccClearingNumber field
     */
    public OccClearingNumberField occClearingNumber() {
        return occClearingNumber;
    }

    /**
     * Same side: OCC clearing number of the giving-up firm if OCC clearing number above is CMTA, otherwise 0
     *
     * @return the GiveUpOccClearingNumber field
     */
    public GiveUpOccClearingNumberField giveUpOccClearingNumber() {
        return giveUpOccClearingNumber;
    }

    /**
     * Same side: Exchange assigned clearing number
     *
     * @return the ExchangeClearingNumber field
     */
    public ExchangeClearingNumberField exchangeClearingNumber() {
        return exchangeClearingNumber;
    }

    /**
     * Same side: Exchange assigned house number
     *
     * @return the ExchangeHouse field
     */
    public ExchangeHouseField exchangeHouse() {
        return exchangeHouse;
    }

    /**
     * Same side: Exchange assigned house suffix for market makers (badge suffix)
     *
     * @return the ExchangeSuffix field
     */
    public ExchangeSuffixField exchangeSuffix() {
        return exchangeSuffix;
    }

    /**
     * Same side capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Same side: Sub or multi account. Stores the Market Maker badge (house + suffix) for On-Floor Market Maker orders with CMTA.
     *
     * @return the MultiAccount field
     */
    public MultiAccountField multiAccount() {
        return multiAccount;
    }

    /**
     * Same side: Floor broker number/Executing Broker
     *
     * @return the Broker field
     */
    public BrokerField broker() {
        return broker;
    }

    /**
     * Same side: 2nd floor broker number
     *
     * @return the SecondBroker field
     */
    public SecondBrokerField secondBroker() {
        return secondBroker;
    }

    /**
     * Originating market of the order for market makers (FIX tag 207 Security Exchange); space when the capacity of this side of the trade is not O
     *
     * @return the OriginMarket field
     */
    public OriginMarketField originMarket() {
        return originMarket;
    }

    /**
     * Account as specified in the order (FIX tag 1 Account)
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Same side: NSCC clearing number for a stock leg
     *
     * @return the Nscc field
     */
    public NsccField nscc() {
        return nscc;
    }

    /**
     * Same side: MPID for the Stock Leg
     *
     * @return the Mpid field
     */
    public MpidField mpid() {
        return mpid;
    }

    /**
     * Same side clearing flags (2 bytes). Only Bit 0 is defined; numbered, as in the other 2 byte flag fields of this message, with bit 15 the least significant bit.
     *
     * @return the ClearingFlags field
     */
    public ClearingFlagsField clearingFlags() {
        return clearingFlags;
    }

    /**
     * Executing Broker
     *
     * @return the ExecutingBroker field
     */
    public ExecutingBrokerField executingBroker() {
        return executingBroker;
    }

    /**
     * Contra side: OCC clearing number or CMTA provided by firm
     *
     * @return the ContraOccClearingNumber field
     */
    public ContraOccClearingNumberField contraOccClearingNumber() {
        return contraOccClearingNumber;
    }

    /**
     * Contra side: OCC clearing number of the giving-up firm if OCC clearing number above is CMTA, otherwise 0
     *
     * @return the ContraGiveUpOccClearingNumber field
     */
    public ContraGiveUpOccClearingNumberField contraGiveUpOccClearingNumber() {
        return contraGiveUpOccClearingNumber;
    }

    /**
     * Contra side: Exchange assigned clearing number
     *
     * @return the ContraExchangeClearingNumber field
     */
    public ContraExchangeClearingNumberField contraExchangeClearingNumber() {
        return contraExchangeClearingNumber;
    }

    /**
     * Contra side: Exchange assigned house number
     *
     * @return the ContraExchangeHouse field
     */
    public ContraExchangeHouseField contraExchangeHouse() {
        return contraExchangeHouse;
    }

    /**
     * Contra side capacity
     *
     * @return the ContraCapacity field
     */
    public ContraCapacityField contraCapacity() {
        return contraCapacity;
    }

    /**
     * Contra side: Floor broker number
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
    }

    /**
     * Contra side: 2nd floor broker number
     *
     * @return the ContraSecondBroker field
     */
    public ContraSecondBrokerField contraSecondBroker() {
        return contraSecondBroker;
    }

    /**
     * Contra side: NSCC clearing number for a stock leg
     *
     * @return the ContraNscc field
     */
    public ContraNsccField contraNscc() {
        return contraNscc;
    }

    /**
     * Contra side: NASDAQ assigned MPID for a stock leg
     *
     * @return the ContraMpid field
     */
    public ContraMpidField contraMpid() {
        return contraMpid;
    }

    /**
     * Firm Identifier for the order or Quote
     *
     * @return the Firm field
     */
    public FirmField firm() {
        return firm;
    }

    /**
     * Date when a FIX order is entered, packed into 2 bytes: Bits 0-6 = Year (0-99), Bits 7-10 = Month (1-12), Bits 11-15 = Day (1-31); bit 15 is the least significant bit. 0 if the order is not a GTC or GTD order.
     *
     * @return the OrderDate field
     */
    public OrderDateField orderDate() {
        return orderDate;
    }

    /**
     * Right padded FIX/OTTO order id or spaces. Populated with CLOrderID. Not populated when the origin source is FBMS FIX.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Quote id for quotes with ids (from SQF feed v6 and higher). Right padded 1 for quotes without ids, spaces if this side of the trade is not a quote. Binary.
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * Sweep id for order sweeps with ids (from SQF feed v6 and higher). Right padded 1 for sweeps without ids, spaces if this side of the trade is not a sweep. Binary.
     *
     * @return the SqfSweepId field
     */
    public SqfSweepIdField sqfSweepId() {
        return sqfSweepId;
    }

    /**
     * Open/Close indicator from FIX/OTTO orders. Space for stock leg.
     *
     * @return the OpenCloseIndicator field
     */
    public OpenCloseIndicatorField openCloseIndicator() {
        return openCloseIndicator;
    }

    /**
     * Leg reference id of a complex order as sent by the customer or spaces
     *
     * @return the CustomerStrategyLeg field
     */
    public CustomerStrategyLegField customerStrategyLeg() {
        return customerStrategyLeg;
    }

    /**
     * Short sell for a stock leg: Y = Short Sale, N = Not a Short Sale, E = Short Sale Exempt, space = Not Applicable (Not a Stock Leg)
     *
     * @return the ShortSell field
     */
    public ShortSellField shortSell() {
        return shortSell;
    }

    /**
     * Capacity for a stock leg: A = Agency Order, P = Principle, R = Riskless Principle, space = Not a stock leg
     *
     * @return the PrincipalAgent field
     */
    public PrincipalAgentField principalAgent() {
        return principalAgent;
    }

    /**
     * Supplementary Id from FIX orders (FIX tag 58 Text)
     *
     * @return the SupplementaryId field
     */
    public SupplementaryIdField supplementaryId() {
        return supplementaryId;
    }

    /**
     * Same side order indicators (2 bytes); bit 15 is the least significant bit. Directed/Preferenced, Post Only, ISE Directed and MKT Order indicators are not available for Manual Trades, Trade Correction and Cancels.
     *
     * @return the OrderIndicators field
     */
    public OrderIndicatorsField orderIndicators() {
        return orderIndicators;
    }

    /**
     * Origin of this side of the trade
     *
     * @return the OriginType field
     */
    public OriginTypeField originType() {
        return originType;
    }

    /**
     * Size of the order/quote/sweep or 0 for manual trades
     *
     * @return the OrderSize field
     */
    public OrderSizeField orderSize() {
        return orderSize;
    }

    /**
     * Price of the order/quote/sweep: fixed point with 4 decimal digits. 0 for MKT Orders (indicated by the MKT bit in Order Indicators) and for manual trades.
     *
     * @return the OrderPrice field
     */
    public OrderPriceField orderPrice() {
        return orderPrice;
    }

    /**
     * Time In Force for the order/quote/sweep. FOK orders are returned with TIF = IOC.
     *
     * @return the Tif field
     */
    public TifField tif() {
        return tif;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!seconds.parse(data, cursor)) {
            return false;
        }
        cursor += SecondsField.BYTE_LENGTH;
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!version.parse(data, cursor)) {
            return false;
        }
        cursor += VersionField.BYTE_LENGTH;
        if (!sendType.parse(data, cursor)) {
            return false;
        }
        cursor += SendTypeField.BYTE_LENGTH;
        if (!optionId.parse(data, cursor)) {
            return false;
        }
        cursor += OptionIdField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!expiration.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!optionKind.parse(data, cursor)) {
            return false;
        }
        cursor += OptionKindField.BYTE_LENGTH;
        if (!tradeFlags.parse(data, cursor)) {
            return false;
        }
        cursor += TradeFlagsField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!transactionType.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTypeField.BYTE_LENGTH;
        if (!liquidity.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!correctionNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectionNumberField.BYTE_LENGTH;
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!refTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += RefTradeIdField.BYTE_LENGTH;
        if (!refCorrectionNumber.parse(data, cursor)) {
            return false;
        }
        cursor += RefCorrectionNumberField.BYTE_LENGTH;
        if (!refMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += RefMatchIdField.BYTE_LENGTH;
        if (!executionType.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionTypeField.BYTE_LENGTH;
        if (!executionMarket.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionMarketField.BYTE_LENGTH;
        if (!tradeSide.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSideField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!tradeContracts.parse(data, cursor)) {
            return false;
        }
        cursor += TradeContractsField.BYTE_LENGTH;
        if (!sideChanged.parse(data, cursor)) {
            return false;
        }
        cursor += SideChangedField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!strategyLeg.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyLegField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!occClearingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OccClearingNumberField.BYTE_LENGTH;
        if (!giveUpOccClearingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += GiveUpOccClearingNumberField.BYTE_LENGTH;
        if (!exchangeClearingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeClearingNumberField.BYTE_LENGTH;
        if (!exchangeHouse.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeHouseField.BYTE_LENGTH;
        if (!exchangeSuffix.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeSuffixField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!multiAccount.parse(data, cursor)) {
            return false;
        }
        cursor += MultiAccountField.BYTE_LENGTH;
        if (!broker.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerField.BYTE_LENGTH;
        if (!secondBroker.parse(data, cursor)) {
            return false;
        }
        cursor += SecondBrokerField.BYTE_LENGTH;
        if (!originMarket.parse(data, cursor)) {
            return false;
        }
        cursor += OriginMarketField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!nscc.parse(data, cursor)) {
            return false;
        }
        cursor += NsccField.BYTE_LENGTH;
        if (!mpid.parse(data, cursor)) {
            return false;
        }
        cursor += MpidField.BYTE_LENGTH;
        if (!clearingFlags.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFlagsField.BYTE_LENGTH;
        if (!executingBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingBrokerField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!contraOccClearingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ContraOccClearingNumberField.BYTE_LENGTH;
        if (!contraGiveUpOccClearingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ContraGiveUpOccClearingNumberField.BYTE_LENGTH;
        if (!contraExchangeClearingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ContraExchangeClearingNumberField.BYTE_LENGTH;
        if (!contraExchangeHouse.parse(data, cursor)) {
            return false;
        }
        cursor += ContraExchangeHouseField.BYTE_LENGTH;
        if (!contraCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += ContraCapacityField.BYTE_LENGTH;
        if (!contraBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ContraBrokerField.BYTE_LENGTH;
        if (!contraSecondBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ContraSecondBrokerField.BYTE_LENGTH;
        if (!contraNscc.parse(data, cursor)) {
            return false;
        }
        cursor += ContraNsccField.BYTE_LENGTH;
        if (!contraMpid.parse(data, cursor)) {
            return false;
        }
        cursor += ContraMpidField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!firm.parse(data, cursor)) {
            return false;
        }
        cursor += FirmField.BYTE_LENGTH;
        if (!orderDate.parse(data, cursor)) {
            return false;
        }
        cursor += OrderDateField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!sqfSweepId.parse(data, cursor)) {
            return false;
        }
        cursor += SqfSweepIdField.BYTE_LENGTH;
        if (!openCloseIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseIndicatorField.BYTE_LENGTH;
        if (!customerStrategyLeg.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerStrategyLegField.BYTE_LENGTH;
        if (!shortSell.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSellField.BYTE_LENGTH;
        if (!principalAgent.parse(data, cursor)) {
            return false;
        }
        cursor += PrincipalAgentField.BYTE_LENGTH;
        if (!supplementaryId.parse(data, cursor)) {
            return false;
        }
        cursor += SupplementaryIdField.BYTE_LENGTH;
        if (!orderIndicators.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIndicatorsField.BYTE_LENGTH;
        if (!originType.parse(data, cursor)) {
            return false;
        }
        cursor += OriginTypeField.BYTE_LENGTH;
        if (!orderSize.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSizeField.BYTE_LENGTH;
        if (!orderPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OrderPriceField.BYTE_LENGTH;
        if (!tif.parse(data, cursor)) {
            return false;
        }
        cursor += TifField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = seconds.encode(data, cursor);
        cursor = nanoseconds.encode(data, cursor);
        cursor = version.encode(data, cursor);
        cursor = sendType.encode(data, cursor);
        cursor = optionId.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = expiration.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = optionKind.encode(data, cursor);
        cursor = tradeFlags.encode(data, cursor);
        if (buffer != null && buffer.length >= 48) {
            System.arraycopy(buffer, 44, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = transactionType.encode(data, cursor);
        cursor = liquidity.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = correctionNumber.encode(data, cursor);
        cursor = crossId.encode(data, cursor);
        cursor = matchId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = refTradeId.encode(data, cursor);
        cursor = refCorrectionNumber.encode(data, cursor);
        cursor = refMatchId.encode(data, cursor);
        cursor = executionType.encode(data, cursor);
        cursor = executionMarket.encode(data, cursor);
        cursor = tradeSide.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradeContracts.encode(data, cursor);
        cursor = sideChanged.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = strategyLeg.encode(data, cursor);
        if (buffer != null && buffer.length >= 109) {
            System.arraycopy(buffer, 101, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = occClearingNumber.encode(data, cursor);
        cursor = giveUpOccClearingNumber.encode(data, cursor);
        cursor = exchangeClearingNumber.encode(data, cursor);
        cursor = exchangeHouse.encode(data, cursor);
        cursor = exchangeSuffix.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = multiAccount.encode(data, cursor);
        cursor = broker.encode(data, cursor);
        cursor = secondBroker.encode(data, cursor);
        cursor = originMarket.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = nscc.encode(data, cursor);
        cursor = mpid.encode(data, cursor);
        cursor = clearingFlags.encode(data, cursor);
        cursor = executingBroker.encode(data, cursor);
        if (buffer != null && buffer.length >= 194) {
            System.arraycopy(buffer, 188, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = contraOccClearingNumber.encode(data, cursor);
        cursor = contraGiveUpOccClearingNumber.encode(data, cursor);
        cursor = contraExchangeClearingNumber.encode(data, cursor);
        cursor = contraExchangeHouse.encode(data, cursor);
        cursor = contraCapacity.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        cursor = contraSecondBroker.encode(data, cursor);
        cursor = contraNscc.encode(data, cursor);
        cursor = contraMpid.encode(data, cursor);
        if (buffer != null && buffer.length >= 236) {
            System.arraycopy(buffer, 228, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = firm.encode(data, cursor);
        cursor = orderDate.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = sqfSweepId.encode(data, cursor);
        cursor = openCloseIndicator.encode(data, cursor);
        cursor = customerStrategyLeg.encode(data, cursor);
        cursor = shortSell.encode(data, cursor);
        cursor = principalAgent.encode(data, cursor);
        cursor = supplementaryId.encode(data, cursor);
        cursor = orderIndicators.encode(data, cursor);
        cursor = originType.encode(data, cursor);
        cursor = orderSize.encode(data, cursor);
        cursor = orderPrice.encode(data, cursor);
        cursor = tif.encode(data, cursor);
        if (buffer != null && buffer.length >= 336) {
            System.arraycopy(buffer, 328, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
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
            case "Seconds" -> Optional.of(seconds);
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "Version" -> Optional.of(version);
            case "SendType" -> Optional.of(sendType);
            case "OptionId" -> Optional.of(optionId);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "Expiration" -> Optional.of(expiration);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "OptionKind" -> Optional.of(optionKind);
            case "TradeFlags" -> Optional.of(tradeFlags);
            case "TransactionType" -> Optional.of(transactionType);
            case "Liquidity" -> Optional.of(liquidity);
            case "TradeId" -> Optional.of(tradeId);
            case "CorrectionNumber" -> Optional.of(correctionNumber);
            case "CrossId" -> Optional.of(crossId);
            case "MatchId" -> Optional.of(matchId);
            case "AuctionId" -> Optional.of(auctionId);
            case "AuctionType" -> Optional.of(auctionType);
            case "RefTradeId" -> Optional.of(refTradeId);
            case "RefCorrectionNumber" -> Optional.of(refCorrectionNumber);
            case "RefMatchId" -> Optional.of(refMatchId);
            case "ExecutionType" -> Optional.of(executionType);
            case "ExecutionMarket" -> Optional.of(executionMarket);
            case "TradeSide" -> Optional.of(tradeSide);
            case "TradePrice" -> Optional.of(tradePrice);
            case "TradeContracts" -> Optional.of(tradeContracts);
            case "SideChanged" -> Optional.of(sideChanged);
            case "StrategyId" -> Optional.of(strategyId);
            case "StrategyLeg" -> Optional.of(strategyLeg);
            case "OccClearingNumber" -> Optional.of(occClearingNumber);
            case "GiveUpOccClearingNumber" -> Optional.of(giveUpOccClearingNumber);
            case "ExchangeClearingNumber" -> Optional.of(exchangeClearingNumber);
            case "ExchangeHouse" -> Optional.of(exchangeHouse);
            case "ExchangeSuffix" -> Optional.of(exchangeSuffix);
            case "Capacity" -> Optional.of(capacity);
            case "MultiAccount" -> Optional.of(multiAccount);
            case "Broker" -> Optional.of(broker);
            case "SecondBroker" -> Optional.of(secondBroker);
            case "OriginMarket" -> Optional.of(originMarket);
            case "Account" -> Optional.of(account);
            case "Nscc" -> Optional.of(nscc);
            case "Mpid" -> Optional.of(mpid);
            case "ClearingFlags" -> Optional.of(clearingFlags);
            case "ExecutingBroker" -> Optional.of(executingBroker);
            case "ContraOccClearingNumber" -> Optional.of(contraOccClearingNumber);
            case "ContraGiveUpOccClearingNumber" -> Optional.of(contraGiveUpOccClearingNumber);
            case "ContraExchangeClearingNumber" -> Optional.of(contraExchangeClearingNumber);
            case "ContraExchangeHouse" -> Optional.of(contraExchangeHouse);
            case "ContraCapacity" -> Optional.of(contraCapacity);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "ContraSecondBroker" -> Optional.of(contraSecondBroker);
            case "ContraNscc" -> Optional.of(contraNscc);
            case "ContraMpid" -> Optional.of(contraMpid);
            case "Firm" -> Optional.of(firm);
            case "OrderDate" -> Optional.of(orderDate);
            case "OrderId" -> Optional.of(orderId);
            case "QuoteId" -> Optional.of(quoteId);
            case "SqfSweepId" -> Optional.of(sqfSweepId);
            case "OpenCloseIndicator" -> Optional.of(openCloseIndicator);
            case "CustomerStrategyLeg" -> Optional.of(customerStrategyLeg);
            case "ShortSell" -> Optional.of(shortSell);
            case "PrincipalAgent" -> Optional.of(principalAgent);
            case "SupplementaryId" -> Optional.of(supplementaryId);
            case "OrderIndicators" -> Optional.of(orderIndicators);
            case "OriginType" -> Optional.of(originType);
            case "OrderSize" -> Optional.of(orderSize);
            case "OrderPrice" -> Optional.of(orderPrice);
            case "Tif" -> Optional.of(tif);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
