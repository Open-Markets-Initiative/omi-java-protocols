package omi.euronext.optiq.dropcopygateway.sbe.v6_64.enums;

import java.util.Optional;

/**
 * updateType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum UpdateType {

    /**
     * Best_Bid
     */
    BEST_BID((short) 1, "Best_Bid"),

    /**
     * Best_Offer
     */
    BEST_OFFER((short) 2, "Best_Offer"),

    /**
     * New_Bid
     */
    NEW_BID((short) 3, "New_Bid"),

    /**
     * New_Offer
     */
    NEW_OFFER((short) 4, "New_Offer"),

    /**
     * Updated_Bid
     */
    UPDATED_BID((short) 5, "Updated_Bid"),

    /**
     * Updated_Offer
     */
    UPDATED_OFFER((short) 6, "Updated_Offer"),

    /**
     * Total_Traded_Volume
     */
    TOTAL_TRADED_VOLUME((short) 7, "Total_Traded_Volume"),

    /**
     * Implied_Bid
     */
    IMPLIED_BID((short) 8, "Implied_Bid"),

    /**
     * Implied_Offer
     */
    IMPLIED_OFFER((short) 9, "Implied_Offer"),

    /**
     * Request_for_Quote
     */
    REQUESTFOR_QUOTE((short) 10, "Request_for_Quote"),

    /**
     * Request_for_Quote_Bid
     */
    REQUESTFOR_QUOTE_BID((short) 11, "Request_for_Quote_Bid"),

    /**
     * Request_for_Size
     */
    REQUESTFOR_SIZE((short) 12, "Request_for_Size"),

    /**
     * Request_for_Quote_Offer
     */
    REQUESTFOR_QUOTE_OFFER((short) 13, "Request_for_Quote_Offer"),

    /**
     * High_Dynamic_Collar
     */
    HIGH_DYNAMIC_COLLAR((short) 14, "High_Dynamic_Collar"),

    /**
     * Low_Dynamic_Collar
     */
    LOW_DYNAMIC_COLLAR((short) 15, "Low_Dynamic_Collar"),

    /**
     * New_Bid_RLP
     */
    NEW_BID_RLP((short) 16, "New_Bid_RLP"),

    /**
     * New_Offer_RLP
     */
    NEW_OFFER_RLP((short) 17, "New_Offer_RLP"),

    /**
     * Updated_Bid_RLP
     */
    UPDATED_BID_RLP((short) 18, "Updated_Bid_RLP"),

    /**
     * Updated_Offer_RLP
     */
    UPDATED_OFFER_RLP((short) 19, "Updated_Offer_RLP"),

    /**
     * AVD_Trade
     */
    AVD_TRADE((short) 20, "AVD_Trade"),

    /**
     * Conventional_Trade
     */
    CONVENTIONAL_TRADE((short) 24, "Conventional_Trade"),

    /**
     * Request_for_Cross_RFC_Queued
     */
    REQUESTFOR_CROSS_RFC_QUEUED((short) 25, "Request_for_Cross_RFC_Queued"),

    /**
     * Request_for_Cross_RFC
     */
    REQUESTFOR_CROSS_RFC((short) 26, "Request_for_Cross_RFC"),

    /**
     * Large_in_Scale_LiS_Trade
     */
    LARGEIN_SCALE_LI_S_TRADE((short) 27, "Large_in_Scale_LiS_Trade"),

    /**
     * Basis_Trade
     */
    BASIS_TRADE((short) 28, "Basis_Trade"),

    /**
     * Large_in_Scale_LiS_Package_Trade
     */
    LARGEIN_SCALE_LI_S_PACKAGE_TRADE((short) 29, "Large_in_Scale_LiS_Package_Trade"),

    /**
     * Guaranteed_Cross_Trade
     */
    GUARANTEED_CROSS_TRADE((short) 30, "Guaranteed_Cross_Trade"),

    /**
     * Against_Actual_Trade
     */
    AGAINST_ACTUAL_TRADE((short) 31, "Against_Actual_Trade"),

    /**
     * Asset_Allocation_Trade
     */
    ASSET_ALLOCATION_TRADE((short) 32, "Asset_Allocation_Trade"),

    /**
     * Exchange_for_Swap_Trade
     */
    EXCHANGEFOR_SWAP_TRADE((short) 34, "Exchange_for_Swap_Trade"),

    /**
     * Dark_Trade
     */
    DARK_TRADE((short) 35, "Dark_Trade"),

    /**
     * Exchange_for_Physical_Trade_Cash_Leg
     */
    EXCHANGEFOR_PHYSICAL_TRADE_CASH_LEG((short) 36, "Exchange_for_Physical_Trade_Cash_Leg"),

    /**
     * Strategy_Leg_Conventional_Trade
     */
    STRATEGY_LEG_CONVENTIONAL_TRADE((short) 37, "Strategy_Leg_Conventional_Trade"),

    /**
     * Strategy_Leg_Large_in_Scale_LiS_Trade
     */
    STRATEGY_LEG_LARGEIN_SCALE_LI_S_TRADE((short) 38, "Strategy_Leg_Large_in_Scale_LiS_Trade"),

    /**
     * Strategy_Leg_Basis_Trade
     */
    STRATEGY_LEG_BASIS_TRADE((short) 39, "Strategy_Leg_Basis_Trade"),

    /**
     * Strategy_Leg_Guaranteed_Cross_Trade
     */
    STRATEGY_LEG_GUARANTEED_CROSS_TRADE((short) 40, "Strategy_Leg_Guaranteed_Cross_Trade"),

    /**
     * Strategy_Leg_Against_Actual_Trade
     */
    STRATEGY_LEG_AGAINST_ACTUAL_TRADE((short) 41, "Strategy_Leg_Against_Actual_Trade"),

    /**
     * Strategy_Leg_Asset_Allocation_Trade
     */
    STRATEGY_LEG_ASSET_ALLOCATION_TRADE((short) 42, "Strategy_Leg_Asset_Allocation_Trade"),

    /**
     * Strategy_Leg_Exchange_For_Swap_Trade
     */
    STRATEGY_LEG_EXCHANGE_FOR_SWAP_TRADE((short) 44, "Strategy_Leg_Exchange_For_Swap_Trade"),

    /**
     * Strategy_Leg_Exchange_For_Physical_Trade
     */
    STRATEGY_LEG_EXCHANGE_FOR_PHYSICAL_TRADE((short) 45, "Strategy_Leg_Exchange_For_Physical_Trade"),

    /**
     * BoB_Trade
     */
    BO_B_TRADE((short) 46, "BoB_Trade"),

    /**
     * AtomX_Trade
     */
    ATOM_X_TRADE((short) 48, "AtomX_Trade"),

    /**
     * Trade_Cancellation
     */
    TRADE_CANCELLATION((short) 50, "Trade_Cancellation"),

    /**
     * Out_of_Market_Trade
     */
    OUTOF_MARKET_TRADE((short) 51, "Out_of_Market_Trade"),

    /**
     * Delta_Neutral_Trade_Underlying_Cash_Leg
     */
    DELTA_NEUTRAL_TRADE_UNDERLYING_CASH_LEG((short) 52, "Delta_Neutral_Trade_Underlying_Cash_Leg"),

    /**
     * Delta_Neutral_Trade_Underlying_Future_Leg
     */
    DELTA_NEUTRAL_TRADE_UNDERLYING_FUTURE_LEG((short) 53, "Delta_Neutral_Trade_Underlying_Future_Leg"),

    /**
     * Euronext_Fund_Service_Trade
     */
    EURONEXT_FUND_SERVICE_TRADE((short) 54, "Euronext_Fund_Service_Trade"),

    /**
     * Secondary_Listing_Trade
     */
    SECONDARY_LISTING_TRADE((short) 55, "Secondary_Listing_Trade"),

    /**
     * Request_for_Cross_Trade
     */
    REQUESTFOR_CROSS_TRADE((short) 56, "Request_for_Cross_Trade"),

    /**
     * Request_for_Cross_Strategy_Leg_Trade
     */
    REQUESTFOR_CROSS_STRATEGY_LEG_TRADE((short) 57, "Request_for_Cross_Strategy_Leg_Trade"),

    /**
     * New_Bid_With_Liquidity_Provider
     */
    NEW_BID_WITH_LIQUIDITY_PROVIDER((short) 58, "New_Bid_With_Liquidity_Provider"),

    /**
     * New_Offer_With_Liquidity_Provider
     */
    NEW_OFFER_WITH_LIQUIDITY_PROVIDER((short) 59, "New_Offer_With_Liquidity_Provider"),

    /**
     * Updated_Bid_With_Liquidity_Provider
     */
    UPDATED_BID_WITH_LIQUIDITY_PROVIDER((short) 60, "Updated_Bid_With_Liquidity_Provider"),

    /**
     * Updated_Offer_With_Liquidity_Provider
     */
    UPDATED_OFFER_WITH_LIQUIDITY_PROVIDER((short) 61, "Updated_Offer_With_Liquidity_Provider"),

    /**
     * Low_Static_Collar
     */
    LOW_STATIC_COLLAR((short) 63, "Low_Static_Collar"),

    /**
     * High_Static_Collar
     */
    HIGH_STATIC_COLLAR((short) 64, "High_Static_Collar"),

    /**
     * Market_VWAP_Operation_Trade
     */
    MARKET_VWAP_OPERATION_TRADE((short) 65, "Market_VWAP_Operation_Trade"),

    /**
     * Request_for_Size_Bid
     */
    REQUESTFOR_SIZE_BID((short) 66, "Request_for_Size_Bid"),

    /**
     * Request_for_Size_Offer
     */
    REQUESTFOR_SIZE_OFFER((short) 67, "Request_for_Size_Offer"),

    /**
     * Low_LP_Collar
     */
    LOW_LP_COLLAR((short) 70, "Low_LP_Collar"),

    /**
     * High_LP_Collar
     */
    HIGH_LP_COLLAR((short) 71, "High_LP_Collar"),

    /**
     * ETF_MTF_NAV_Trade_price_in_bp
     */
    ETFMTFNAV_TRADEPRICEINBP((short) 72, "ETF_MTF_NAV_Trade_price_in_bp"),

    /**
     * ETF_MTF_NAV_Dark_Trade_price_in_bp
     */
    ETFMTFNAV_DARK_TRADEPRICEINBP((short) 73, "ETF_MTF_NAV_Dark_Trade_price_in_bp"),

    /**
     * New_Bid_on_Wholesale_RFC
     */
    NEW_BIDON_WHOLESALE_RFC((short) 74, "New_Bid_on_Wholesale_RFC"),

    /**
     * New_Offer_on_Wholesale_RFC
     */
    NEW_OFFERON_WHOLESALE_RFC((short) 75, "New_Offer_on_Wholesale_RFC"),

    /**
     * Updated_Bid_on_Wholesale_RFC
     */
    UPDATED_BIDON_WHOLESALE_RFC((short) 76, "Updated_Bid_on_Wholesale_RFC"),

    /**
     * Updated_Offer_on_Wholesale_RFC
     */
    UPDATED_OFFERON_WHOLESALE_RFC((short) 77, "Updated_Offer_on_Wholesale_RFC"),

    /**
     * Clear_Wholesale_RFC
     */
    CLEAR_WHOLESALE_RFC((short) 78, "Clear_Wholesale_RFC"),

    /**
     * Guaranteed_Cross_Negotiated_deal_NLIQ
     */
    GUARANTEED_CROSS_NEGOTIATEDDEAL_NLIQ((short) 79, "Guaranteed_Cross_Negotiated_deal_NLIQ"),

    /**
     * Guaranteed_Cross_Negotiated_deal_OILQ
     */
    GUARANTEED_CROSS_NEGOTIATEDDEAL_OILQ((short) 80, "Guaranteed_Cross_Negotiated_deal_OILQ"),

    /**
     * Large_in_Scale_Trade
     */
    LARGEIN_SCALE_TRADE((short) 81, "Large_in_Scale_Trade"),

    /**
     * Large_in_Scale_Trade_in_basis_points
     */
    LARGEIN_SCALE_TRADEINBASISPOINTS((short) 82, "Large_in_Scale_Trade_in_basis_points"),

    /**
     * Large_in_Scale_Package_Trade_in_basis_points
     */
    LARGEIN_SCALE_PACKAGE_TRADEINBASISPOINTS((short) 83, "Large_in_Scale_Package_Trade_in_basis_points"),

    /**
     * Strategy_Leg_Large_in_Scale_Trade_in_basis_points
     */
    STRATEGY_LEG_LARGEIN_SCALE_TRADEINBASISPOINTS((short) 84, "Strategy_Leg_Large_in_Scale_Trade_in_basis_points"),

    /**
     * New_Bid_RFQ_Answer
     */
    NEW_BID_RFQ_ANSWER((short) 86, "New_Bid_RFQ_Answer"),

    /**
     * New_Offer_RFQ_Answer
     */
    NEW_OFFER_RFQ_ANSWER((short) 87, "New_Offer_RFQ_Answer"),

    /**
     * Updated_Bid_RFQ_Answer
     */
    UPDATED_BID_RFQ_ANSWER((short) 88, "Updated_Bid_RFQ_Answer"),

    /**
     * Updated_Offer_RFQ_Answer
     */
    UPDATED_OFFER_RFQ_ANSWER((short) 89, "Updated_Offer_RFQ_Answer"),

    /**
     * Bid_Execution_Summary
     */
    BID_EXECUTION_SUMMARY((short) 90, "Bid_Execution_Summary"),

    /**
     * AQS_Expansion_Factor
     */
    AQS_EXPANSION_FACTOR((short) 91, "AQS_Expansion_Factor"),

    /**
     * Collars_Expansion_Factor
     */
    COLLARS_EXPANSION_FACTOR((short) 92, "Collars_Expansion_Factor"),

    /**
     * Collars_Enabled
     */
    COLLARS_ENABLED((short) 93, "Collars_Enabled"),

    /**
     * Collars_Disabled
     */
    COLLARS_DISABLED((short) 94, "Collars_Disabled"),

    /**
     * DCRP_Inter_Month_Spread
     */
    DCRP_INTER_MONTH_SPREAD((short) 95, "DCRP_Inter_Month_Spread"),

    /**
     * FSP_Reference_Price_
     */
    FSP_REFERENCE_PRICE((short) 96, "FSP_Reference_Price_"),

    /**
     * Offer_Execution_Summary
     */
    OFFER_EXECUTION_SUMMARY((short) 97, "Offer_Execution_Summary"),

    /**
     * FSP_Triggered
     */
    FSP_TRIGGERED((short) 98, "FSP_Triggered"),

    /**
     * MidPoint_BBO
     */
    MID_POINT_BBO((short) 99, "MidPoint_BBO"),

    /**
     * Conventional_Trade___Provisional_price
     */
    CONVENTIONAL_TRADE_PROVISIONALPRICE((short) 100, "Conventional_Trade___Provisional_price"),

    /**
     * High_Order_Price_Control_Collar
     */
    HIGH_ORDER_PRICE_CONTROL_COLLAR((short) 101, "High_Order_Price_Control_Collar"),

    /**
     * Low_Order_Price_Control_Collar
     */
    LOW_ORDER_PRICE_CONTROL_COLLAR((short) 102, "Low_Order_Price_Control_Collar"),

    /**
     * Order_Price_Control_Collar_Reference_Price
     */
    ORDER_PRICE_CONTROL_COLLAR_REFERENCE_PRICE((short) 103, "Order_Price_Control_Collar_Reference_Price"),

    /**
     * Issuing_Or_Tender_Offer_Trade
     */
    ISSUING_OR_TENDER_OFFER_TRADE((short) 104, "Issuing_Or_Tender_Offer_Trade"),

    /**
     * RFQ_Trade
     */
    RFQ_TRADE((short) 105, "RFQ_Trade"),

    /**
     * FLIP_Spread
     */
    FLIP_SPREAD((short) 106, "FLIP_Spread"),

    /**
     * FLIP_Reference_Price
     */
    FLIP_REFERENCE_PRICE((short) 107, "FLIP_Reference_Price"),

    /**
     * Strategy_Leg_Conventional_Trade___Provisional_price
     */
    STRATEGY_LEG_CONVENTIONAL_TRADE_PROVISIONALPRICE((short) 108, "Strategy_Leg_Conventional_Trade___Provisional_price"),

    /**
     * Block_Standard_Trade
     */
    BLOCK_STANDARD_TRADE((short) 109, "Block_Standard_Trade"),

    /**
     * Block_NFC_Auction_Trade
     */
    BLOCK_NFC_AUCTION_TRADE((short) 110, "Block_NFC_Auction_Trade"),

    /**
     * Block_Historical_Trade
     */
    BLOCK_HISTORICAL_TRADE((short) 111, "Block_Historical_Trade"),

    /**
     * Static_Collar_Reference_Price
     */
    STATIC_COLLAR_REFERENCE_PRICE((short) 252, "Static_Collar_Reference_Price"),

    /**
     * Dynamic_Collar_Reference_Price
     */
    DYNAMIC_COLLAR_REFERENCE_PRICE((short) 253, "Dynamic_Collar_Reference_Price"),

    /**
     * Clear_Book
     */
    CLEAR_BOOK((short) 254, "Clear_Book");

    private final short wire;

    private final String description;

    UpdateType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<UpdateType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(BEST_BID);
            case 2 -> Optional.of(BEST_OFFER);
            case 3 -> Optional.of(NEW_BID);
            case 4 -> Optional.of(NEW_OFFER);
            case 5 -> Optional.of(UPDATED_BID);
            case 6 -> Optional.of(UPDATED_OFFER);
            case 7 -> Optional.of(TOTAL_TRADED_VOLUME);
            case 8 -> Optional.of(IMPLIED_BID);
            case 9 -> Optional.of(IMPLIED_OFFER);
            case 10 -> Optional.of(REQUESTFOR_QUOTE);
            case 11 -> Optional.of(REQUESTFOR_QUOTE_BID);
            case 12 -> Optional.of(REQUESTFOR_SIZE);
            case 13 -> Optional.of(REQUESTFOR_QUOTE_OFFER);
            case 14 -> Optional.of(HIGH_DYNAMIC_COLLAR);
            case 15 -> Optional.of(LOW_DYNAMIC_COLLAR);
            case 16 -> Optional.of(NEW_BID_RLP);
            case 17 -> Optional.of(NEW_OFFER_RLP);
            case 18 -> Optional.of(UPDATED_BID_RLP);
            case 19 -> Optional.of(UPDATED_OFFER_RLP);
            case 20 -> Optional.of(AVD_TRADE);
            case 24 -> Optional.of(CONVENTIONAL_TRADE);
            case 25 -> Optional.of(REQUESTFOR_CROSS_RFC_QUEUED);
            case 26 -> Optional.of(REQUESTFOR_CROSS_RFC);
            case 27 -> Optional.of(LARGEIN_SCALE_LI_S_TRADE);
            case 28 -> Optional.of(BASIS_TRADE);
            case 29 -> Optional.of(LARGEIN_SCALE_LI_S_PACKAGE_TRADE);
            case 30 -> Optional.of(GUARANTEED_CROSS_TRADE);
            case 31 -> Optional.of(AGAINST_ACTUAL_TRADE);
            case 32 -> Optional.of(ASSET_ALLOCATION_TRADE);
            case 34 -> Optional.of(EXCHANGEFOR_SWAP_TRADE);
            case 35 -> Optional.of(DARK_TRADE);
            case 36 -> Optional.of(EXCHANGEFOR_PHYSICAL_TRADE_CASH_LEG);
            case 37 -> Optional.of(STRATEGY_LEG_CONVENTIONAL_TRADE);
            case 38 -> Optional.of(STRATEGY_LEG_LARGEIN_SCALE_LI_S_TRADE);
            case 39 -> Optional.of(STRATEGY_LEG_BASIS_TRADE);
            case 40 -> Optional.of(STRATEGY_LEG_GUARANTEED_CROSS_TRADE);
            case 41 -> Optional.of(STRATEGY_LEG_AGAINST_ACTUAL_TRADE);
            case 42 -> Optional.of(STRATEGY_LEG_ASSET_ALLOCATION_TRADE);
            case 44 -> Optional.of(STRATEGY_LEG_EXCHANGE_FOR_SWAP_TRADE);
            case 45 -> Optional.of(STRATEGY_LEG_EXCHANGE_FOR_PHYSICAL_TRADE);
            case 46 -> Optional.of(BO_B_TRADE);
            case 48 -> Optional.of(ATOM_X_TRADE);
            case 50 -> Optional.of(TRADE_CANCELLATION);
            case 51 -> Optional.of(OUTOF_MARKET_TRADE);
            case 52 -> Optional.of(DELTA_NEUTRAL_TRADE_UNDERLYING_CASH_LEG);
            case 53 -> Optional.of(DELTA_NEUTRAL_TRADE_UNDERLYING_FUTURE_LEG);
            case 54 -> Optional.of(EURONEXT_FUND_SERVICE_TRADE);
            case 55 -> Optional.of(SECONDARY_LISTING_TRADE);
            case 56 -> Optional.of(REQUESTFOR_CROSS_TRADE);
            case 57 -> Optional.of(REQUESTFOR_CROSS_STRATEGY_LEG_TRADE);
            case 58 -> Optional.of(NEW_BID_WITH_LIQUIDITY_PROVIDER);
            case 59 -> Optional.of(NEW_OFFER_WITH_LIQUIDITY_PROVIDER);
            case 60 -> Optional.of(UPDATED_BID_WITH_LIQUIDITY_PROVIDER);
            case 61 -> Optional.of(UPDATED_OFFER_WITH_LIQUIDITY_PROVIDER);
            case 63 -> Optional.of(LOW_STATIC_COLLAR);
            case 64 -> Optional.of(HIGH_STATIC_COLLAR);
            case 65 -> Optional.of(MARKET_VWAP_OPERATION_TRADE);
            case 66 -> Optional.of(REQUESTFOR_SIZE_BID);
            case 67 -> Optional.of(REQUESTFOR_SIZE_OFFER);
            case 70 -> Optional.of(LOW_LP_COLLAR);
            case 71 -> Optional.of(HIGH_LP_COLLAR);
            case 72 -> Optional.of(ETFMTFNAV_TRADEPRICEINBP);
            case 73 -> Optional.of(ETFMTFNAV_DARK_TRADEPRICEINBP);
            case 74 -> Optional.of(NEW_BIDON_WHOLESALE_RFC);
            case 75 -> Optional.of(NEW_OFFERON_WHOLESALE_RFC);
            case 76 -> Optional.of(UPDATED_BIDON_WHOLESALE_RFC);
            case 77 -> Optional.of(UPDATED_OFFERON_WHOLESALE_RFC);
            case 78 -> Optional.of(CLEAR_WHOLESALE_RFC);
            case 79 -> Optional.of(GUARANTEED_CROSS_NEGOTIATEDDEAL_NLIQ);
            case 80 -> Optional.of(GUARANTEED_CROSS_NEGOTIATEDDEAL_OILQ);
            case 81 -> Optional.of(LARGEIN_SCALE_TRADE);
            case 82 -> Optional.of(LARGEIN_SCALE_TRADEINBASISPOINTS);
            case 83 -> Optional.of(LARGEIN_SCALE_PACKAGE_TRADEINBASISPOINTS);
            case 84 -> Optional.of(STRATEGY_LEG_LARGEIN_SCALE_TRADEINBASISPOINTS);
            case 86 -> Optional.of(NEW_BID_RFQ_ANSWER);
            case 87 -> Optional.of(NEW_OFFER_RFQ_ANSWER);
            case 88 -> Optional.of(UPDATED_BID_RFQ_ANSWER);
            case 89 -> Optional.of(UPDATED_OFFER_RFQ_ANSWER);
            case 90 -> Optional.of(BID_EXECUTION_SUMMARY);
            case 91 -> Optional.of(AQS_EXPANSION_FACTOR);
            case 92 -> Optional.of(COLLARS_EXPANSION_FACTOR);
            case 93 -> Optional.of(COLLARS_ENABLED);
            case 94 -> Optional.of(COLLARS_DISABLED);
            case 95 -> Optional.of(DCRP_INTER_MONTH_SPREAD);
            case 96 -> Optional.of(FSP_REFERENCE_PRICE);
            case 97 -> Optional.of(OFFER_EXECUTION_SUMMARY);
            case 98 -> Optional.of(FSP_TRIGGERED);
            case 99 -> Optional.of(MID_POINT_BBO);
            case 100 -> Optional.of(CONVENTIONAL_TRADE_PROVISIONALPRICE);
            case 101 -> Optional.of(HIGH_ORDER_PRICE_CONTROL_COLLAR);
            case 102 -> Optional.of(LOW_ORDER_PRICE_CONTROL_COLLAR);
            case 103 -> Optional.of(ORDER_PRICE_CONTROL_COLLAR_REFERENCE_PRICE);
            case 104 -> Optional.of(ISSUING_OR_TENDER_OFFER_TRADE);
            case 105 -> Optional.of(RFQ_TRADE);
            case 106 -> Optional.of(FLIP_SPREAD);
            case 107 -> Optional.of(FLIP_REFERENCE_PRICE);
            case 108 -> Optional.of(STRATEGY_LEG_CONVENTIONAL_TRADE_PROVISIONALPRICE);
            case 109 -> Optional.of(BLOCK_STANDARD_TRADE);
            case 110 -> Optional.of(BLOCK_NFC_AUCTION_TRADE);
            case 111 -> Optional.of(BLOCK_HISTORICAL_TRADE);
            case 252 -> Optional.of(STATIC_COLLAR_REFERENCE_PRICE);
            case 253 -> Optional.of(DYNAMIC_COLLAR_REFERENCE_PRICE);
            case 254 -> Optional.of(CLEAR_BOOK);
            default -> Optional.empty();
        };
    }
}
