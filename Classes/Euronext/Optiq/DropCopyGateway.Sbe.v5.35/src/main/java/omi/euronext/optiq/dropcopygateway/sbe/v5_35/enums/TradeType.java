package omi.euronext.optiq.dropcopygateway.sbe.v5_35.enums;

import java.util.Optional;

/**
 * tradeType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeType {

    /**
     * Conventional_Trade
     */
    CONVENTIONAL_TRADE((short) 1, "Conventional_Trade"),

    /**
     * Large_in_Scale_LiS_Trade
     */
    LARGEIN_SCALE_LI_S_TRADE((short) 2, "Large_in_Scale_LiS_Trade"),

    /**
     * Basis_Trade
     */
    BASIS_TRADE((short) 3, "Basis_Trade"),

    /**
     * Large_in_Scale_LiS_Package_Trade
     */
    LARGEIN_SCALE_LI_S_PACKAGE_TRADE((short) 4, "Large_in_Scale_LiS_Package_Trade"),

    /**
     * Guaranteed_Cross_Trade
     */
    GUARANTEED_CROSS_TRADE((short) 5, "Guaranteed_Cross_Trade"),

    /**
     * Against_Actual_Trade
     */
    AGAINST_ACTUAL_TRADE((short) 6, "Against_Actual_Trade"),

    /**
     * Asset_Allocation_Trade
     */
    ASSET_ALLOCATION_TRADE((short) 7, "Asset_Allocation_Trade"),

    /**
     * Exchange_for_Swap_Trade
     */
    EXCHANGEFOR_SWAP_TRADE((short) 9, "Exchange_for_Swap_Trade"),

    /**
     * Exchange_for_Physical_Trade_Cash_Leg
     */
    EXCHANGEFOR_PHYSICAL_TRADE_CASH_LEG((short) 10, "Exchange_for_Physical_Trade_Cash_Leg"),

    /**
     * Strategy_Leg_Conventional_Trade
     */
    STRATEGY_LEG_CONVENTIONAL_TRADE((short) 11, "Strategy_Leg_Conventional_Trade"),

    /**
     * Strategy_Leg_Large_in_Scale_LiS_Trade
     */
    STRATEGY_LEG_LARGEIN_SCALE_LI_S_TRADE((short) 12, "Strategy_Leg_Large_in_Scale_LiS_Trade"),

    /**
     * Strategy_Leg_Basis_Trade
     */
    STRATEGY_LEG_BASIS_TRADE((short) 13, "Strategy_Leg_Basis_Trade"),

    /**
     * Strategy_Leg_Guaranteed_Cross_Trade
     */
    STRATEGY_LEG_GUARANTEED_CROSS_TRADE((short) 14, "Strategy_Leg_Guaranteed_Cross_Trade"),

    /**
     * Strategy_Leg_Against_Actual_Trade
     */
    STRATEGY_LEG_AGAINST_ACTUAL_TRADE((short) 15, "Strategy_Leg_Against_Actual_Trade"),

    /**
     * Strategy_Leg_Asset_Allocation_Trade
     */
    STRATEGY_LEG_ASSET_ALLOCATION_TRADE((short) 16, "Strategy_Leg_Asset_Allocation_Trade"),

    /**
     * Strategy_Leg_Exchange_For_Swap_Trade
     */
    STRATEGY_LEG_EXCHANGE_FOR_SWAP_TRADE((short) 18, "Strategy_Leg_Exchange_For_Swap_Trade"),

    /**
     * Strategy_Leg_Exchange_For_Physical_Trade
     */
    STRATEGY_LEG_EXCHANGE_FOR_PHYSICAL_TRADE((short) 19, "Strategy_Leg_Exchange_For_Physical_Trade"),

    /**
     * BoB_Trade
     */
    BO_B_TRADE((short) 20, "BoB_Trade"),

    /**
     * AtomX_Trade
     */
    ATOM_X_TRADE((short) 22, "AtomX_Trade"),

    /**
     * Trade_Cancellation
     */
    TRADE_CANCELLATION((short) 24, "Trade_Cancellation"),

    /**
     * Out_of_Market_Trade
     */
    OUTOF_MARKET_TRADE((short) 25, "Out_of_Market_Trade"),

    /**
     * Delta_Neutral_Trade_Underlying_Cash_Leg
     */
    DELTA_NEUTRAL_TRADE_UNDERLYING_CASH_LEG((short) 26, "Delta_Neutral_Trade_Underlying_Cash_Leg"),

    /**
     * Market_VWAP_Operation_Trade
     */
    MARKET_VWAP_OPERATION_TRADE((short) 27, "Market_VWAP_Operation_Trade"),

    /**
     * Euronext_Fund_Service_Trade
     */
    EURONEXT_FUND_SERVICE_TRADE((short) 28, "Euronext_Fund_Service_Trade"),

    /**
     * Secondary_Listing_Trade
     */
    SECONDARY_LISTING_TRADE((short) 29, "Secondary_Listing_Trade"),

    /**
     * Request_for_Cross_Trade
     */
    REQUESTFOR_CROSS_TRADE((short) 30, "Request_for_Cross_Trade"),

    /**
     * Request_for_cross_strategy_Leg_Trade
     */
    REQUESTFORCROSSSTRATEGY_LEG_TRADE((short) 31, "Request_for_cross_strategy_Leg_Trade"),

    /**
     * Trade_Publication
     */
    TRADE_PUBLICATION((short) 32, "Trade_Publication"),

    /**
     * Dark_Trade
     */
    DARK_TRADE((short) 33, "Dark_Trade"),

    /**
     * Delta_Neutral_Trade_Underlying_Future_Leg
     */
    DELTA_NEUTRAL_TRADE_UNDERLYING_FUTURE_LEG((short) 34, "Delta_Neutral_Trade_Underlying_Future_Leg"),

    /**
     * Total_Traded_Volume
     */
    TOTAL_TRADED_VOLUME((short) 36, "Total_Traded_Volume"),

    /**
     * ETF_MTF_NAV_Trade_price_in_bp
     */
    ETFMTFNAV_TRADEPRICEINBP((short) 37, "ETF_MTF_NAV_Trade_price_in_bp"),

    /**
     * ETF_MTF_NAV_Dark_Trade_price_in_bp
     */
    ETFMTFNAV_DARK_TRADEPRICEINBP((short) 38, "ETF_MTF_NAV_Dark_Trade_price_in_bp"),

    /**
     * Guaranteed_Cross_Negotiated_deal_NLIQ
     */
    GUARANTEED_CROSS_NEGOTIATEDDEAL_NLIQ((short) 39, "Guaranteed_Cross_Negotiated_deal_NLIQ"),

    /**
     * Guaranteed_Cross_Negotiated_deal_OILQ
     */
    GUARANTEED_CROSS_NEGOTIATEDDEAL_OILQ((short) 40, "Guaranteed_Cross_Negotiated_deal_OILQ"),

    /**
     * Large_in_Scale_Trade
     */
    LARGEIN_SCALE_TRADE((short) 41, "Large_in_Scale_Trade"),

    /**
     * Large_in_Scale_Trade_in_basis_points
     */
    LARGEIN_SCALE_TRADEINBASISPOINTS((short) 42, "Large_in_Scale_Trade_in_basis_points"),

    /**
     * Large_in_Scale_Package_Trade_in_basis_points
     */
    LARGEIN_SCALE_PACKAGE_TRADEINBASISPOINTS((short) 43, "Large_in_Scale_Package_Trade_in_basis_points"),

    /**
     * Strategy_Leg_Large_in_Scale_Trade_in_basis_points
     */
    STRATEGY_LEG_LARGEIN_SCALE_TRADEINBASISPOINTS((short) 44, "Strategy_Leg_Large_in_Scale_Trade_in_basis_points"),

    /**
     * Trade_Reversal
     */
    TRADE_REVERSAL((short) 45, "Trade_Reversal"),

    /**
     * Non_Standard_Settlement
     */
    NON_STANDARD_SETTLEMENT((short) 46, "Non_Standard_Settlement"),

    /**
     * Repurchase_Agreement___Repo
     */
    REPURCHASE_AGREEMENT_REPO((short) 47, "Repurchase_Agreement___Repo"),

    /**
     * Exchange_Granted_Trade
     */
    EXCHANGE_GRANTED_TRADE((short) 48, "Exchange_Granted_Trade"),

    /**
     * Other
     */
    OTHER((short) 49, "Other"),

    /**
     * Odd_Lot
     */
    ODD_LOT((short) 50, "Odd_Lot"),

    /**
     * Conventional_Trade___Provisional_price
     */
    CONVENTIONAL_TRADE_PROVISIONALPRICE((short) 100, "Conventional_Trade___Provisional_price"),

    /**
     * Large_in_Scale__LiS__Trade___Provisional_price
     */
    LARGEIN_SCALE_LI_S_TRADE_PROVISIONALPRICE((short) 101, "Large_in_Scale__LiS__Trade___Provisional_price"),

    /**
     * Large_in_Scale__LiS__Package_Trade___Provisional_price
     */
    LARGEIN_SCALE_LI_S_PACKAGE_TRADE_PROVISIONALPRICE((short) 102, "Large_in_Scale__LiS__Package_Trade___Provisional_price"),

    /**
     * Issuing_Or_Tender_Offer_Trade
     */
    ISSUING_OR_TENDER_OFFER_TRADE((short) 103, "Issuing_Or_Tender_Offer_Trade"),

    /**
     * RFQ_Trade
     */
    RFQ_TRADE((short) 104, "RFQ_Trade"),

    /**
     * tradeType
     */
    NO_VALUE((short) 255, "tradeType");

    private final short wire;

    private final String description;

    TradeType(short wire, String description) {
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
    public static Optional<TradeType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CONVENTIONAL_TRADE);
            case 2 -> Optional.of(LARGEIN_SCALE_LI_S_TRADE);
            case 3 -> Optional.of(BASIS_TRADE);
            case 4 -> Optional.of(LARGEIN_SCALE_LI_S_PACKAGE_TRADE);
            case 5 -> Optional.of(GUARANTEED_CROSS_TRADE);
            case 6 -> Optional.of(AGAINST_ACTUAL_TRADE);
            case 7 -> Optional.of(ASSET_ALLOCATION_TRADE);
            case 9 -> Optional.of(EXCHANGEFOR_SWAP_TRADE);
            case 10 -> Optional.of(EXCHANGEFOR_PHYSICAL_TRADE_CASH_LEG);
            case 11 -> Optional.of(STRATEGY_LEG_CONVENTIONAL_TRADE);
            case 12 -> Optional.of(STRATEGY_LEG_LARGEIN_SCALE_LI_S_TRADE);
            case 13 -> Optional.of(STRATEGY_LEG_BASIS_TRADE);
            case 14 -> Optional.of(STRATEGY_LEG_GUARANTEED_CROSS_TRADE);
            case 15 -> Optional.of(STRATEGY_LEG_AGAINST_ACTUAL_TRADE);
            case 16 -> Optional.of(STRATEGY_LEG_ASSET_ALLOCATION_TRADE);
            case 18 -> Optional.of(STRATEGY_LEG_EXCHANGE_FOR_SWAP_TRADE);
            case 19 -> Optional.of(STRATEGY_LEG_EXCHANGE_FOR_PHYSICAL_TRADE);
            case 20 -> Optional.of(BO_B_TRADE);
            case 22 -> Optional.of(ATOM_X_TRADE);
            case 24 -> Optional.of(TRADE_CANCELLATION);
            case 25 -> Optional.of(OUTOF_MARKET_TRADE);
            case 26 -> Optional.of(DELTA_NEUTRAL_TRADE_UNDERLYING_CASH_LEG);
            case 27 -> Optional.of(MARKET_VWAP_OPERATION_TRADE);
            case 28 -> Optional.of(EURONEXT_FUND_SERVICE_TRADE);
            case 29 -> Optional.of(SECONDARY_LISTING_TRADE);
            case 30 -> Optional.of(REQUESTFOR_CROSS_TRADE);
            case 31 -> Optional.of(REQUESTFORCROSSSTRATEGY_LEG_TRADE);
            case 32 -> Optional.of(TRADE_PUBLICATION);
            case 33 -> Optional.of(DARK_TRADE);
            case 34 -> Optional.of(DELTA_NEUTRAL_TRADE_UNDERLYING_FUTURE_LEG);
            case 36 -> Optional.of(TOTAL_TRADED_VOLUME);
            case 37 -> Optional.of(ETFMTFNAV_TRADEPRICEINBP);
            case 38 -> Optional.of(ETFMTFNAV_DARK_TRADEPRICEINBP);
            case 39 -> Optional.of(GUARANTEED_CROSS_NEGOTIATEDDEAL_NLIQ);
            case 40 -> Optional.of(GUARANTEED_CROSS_NEGOTIATEDDEAL_OILQ);
            case 41 -> Optional.of(LARGEIN_SCALE_TRADE);
            case 42 -> Optional.of(LARGEIN_SCALE_TRADEINBASISPOINTS);
            case 43 -> Optional.of(LARGEIN_SCALE_PACKAGE_TRADEINBASISPOINTS);
            case 44 -> Optional.of(STRATEGY_LEG_LARGEIN_SCALE_TRADEINBASISPOINTS);
            case 45 -> Optional.of(TRADE_REVERSAL);
            case 46 -> Optional.of(NON_STANDARD_SETTLEMENT);
            case 47 -> Optional.of(REPURCHASE_AGREEMENT_REPO);
            case 48 -> Optional.of(EXCHANGE_GRANTED_TRADE);
            case 49 -> Optional.of(OTHER);
            case 50 -> Optional.of(ODD_LOT);
            case 100 -> Optional.of(CONVENTIONAL_TRADE_PROVISIONALPRICE);
            case 101 -> Optional.of(LARGEIN_SCALE_LI_S_TRADE_PROVISIONALPRICE);
            case 102 -> Optional.of(LARGEIN_SCALE_LI_S_PACKAGE_TRADE_PROVISIONALPRICE);
            case 103 -> Optional.of(ISSUING_OR_TENDER_OFFER_TRADE);
            case 104 -> Optional.of(RFQ_TRADE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
