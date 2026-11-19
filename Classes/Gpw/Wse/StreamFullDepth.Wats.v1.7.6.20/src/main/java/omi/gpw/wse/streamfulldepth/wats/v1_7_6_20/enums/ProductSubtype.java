package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Subtype of the product
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ProductSubtype {

    /**
     * Share
     */
    SHARE((short) 1, "Share"),

    /**
     * Allotment Right
     */
    ALLOTMENT_RIGHT((short) 2, "Allotment Right"),

    /**
     * Subscription Right
     */
    SUBSCRIPTION_RIGHT((short) 3, "Subscription Right"),

    /**
     * Tender Offer
     */
    TENDER_OFFER((short) 4, "Tender Offer"),

    /**
     * Issue Right
     */
    ISSUE_RIGHT((short) 5, "Issue Right"),

    /**
     * Subscription Warrant
     */
    SUBSCRIPTION_WARRANT((short) 6, "Subscription Warrant"),

    /**
     * Bank Securities
     */
    BANK_SECURITIES((short) 7, "Bank Securities"),

    /**
     * Bond
     */
    BOND((short) 8, "Bond"),

    /**
     * Treasury Bond
     */
    TREASURY_BOND((short) 9, "Treasury Bond"),

    /**
     * Bond issued by a government institution
     */
    AGENCY_BOND((short) 10, "Bond issued by a government institution"),

    /**
     * Municipal Bond
     */
    MUNICIPAL_BOND((short) 11, "Municipal Bond"),

    /**
     * Corporate Bond - bank
     */
    CORPORATE_BANK_BOND((short) 12, "Corporate Bond - bank"),

    /**
     * Corporate Bond - firm
     */
    CORPORATE_FIRM_BOND((short) 13, "Corporate Bond - firm"),

    /**
     * Convertible Bond
     */
    CONVERTIBLE_BOND((short) 14, "Convertible Bond"),

    /**
     * Mortgage Bond
     */
    MORTGAGE_BOND((short) 15, "Mortgage Bond"),

    /**
     * Mortgage Backed Bond
     */
    MORTGAGE_BACKED_BOND((short) 16, "Mortgage Backed Bond"),

    /**
     * Public Mortgage Bond
     */
    PUBLIC_MORTGAGE_BOND((short) 17, "Public Mortgage Bond"),

    /**
     * Bill
     */
    BILL((short) 18, "Bill"),

    /**
     * Treasury Bill
     */
    TREASURY_BILL((short) 19, "Treasury Bill"),

    /**
     * Commercial Bill
     */
    COMMERCIAL_BILL((short) 20, "Commercial Bill"),

    /**
     * ETF - Exchange Traded Fund
     */
    EXCHANGE_TRADED_FUND((short) 21, "ETF - Exchange Traded Fund"),

    /**
     * ETN - Exchange Traded Note
     */
    EXCHANGE_TRADED_NOTE((short) 22, "ETN - Exchange Traded Note"),

    /**
     * ETC - Exchange Traded Commodity
     */
    EXCHANGE_TRADED_COMMODITY((short) 23, "ETC - Exchange Traded Commodity"),

    /**
     * Investment Certificate
     */
    INVESTMENT_CERTIFICATE((short) 24, "Investment Certificate"),

    /**
     * Index Futures
     */
    INDEX_FUTURES((short) 25, "Index Futures"),

    /**
     * Stock Futures
     */
    STOCK_FUTURES((short) 26, "Stock Futures"),

    /**
     * Currency Futures
     */
    CURRENCY_FUTURES((short) 27, "Currency Futures"),

    /**
     * Bond Futures
     */
    BOND_FUTURES((short) 28, "Bond Futures"),

    /**
     * Interest Rate Futures
     */
    INTEREST_RATE_FUTURES((short) 29, "Interest Rate Futures"),

    /**
     * Index Options
     */
    INDEX_OPTIONS((short) 30, "Index Options"),

    /**
     * Stock Options
     */
    STOCK_OPTIONS((short) 31, "Stock Options"),

    /**
     * Option warrants
     */
    OPTION_WARRANTS((short) 32, "Option warrants"),

    /**
     * Factor certificates
     */
    FACTOR_CERTIFICATES((short) 33, "Factor certificates"),

    /**
     * Turbo certificates
     */
    TURBO_CERTIFICATES((short) 34, "Turbo certificates"),

    /**
     * Capital protection certificates
     */
    CAPITAL_PROTECTION_CERTIFICATES((short) 35, "Capital protection certificates"),

    /**
     * Bonus certificates
     */
    BONUS_CERTIFICATES((short) 36, "Bonus certificates"),

    /**
     * Reverse convertible certificates
     */
    REVERSE_CONVERTIBLE_CERTIFICATES((short) 37, "Reverse convertible certificates"),

    /**
     * Express certificates
     */
    EXPRESS_CERTIFICATES((short) 38, "Express certificates"),

    /**
     * Discount certificates
     */
    DISCOUNT_CERTIFICATES((short) 39, "Discount certificates"),

    /**
     * Index/tracker certificates
     */
    INDEX_TRACKER_CERTIFICATES((short) 40, "Index/tracker certificates"),

    /**
     * Other investment certificates (non leveraged)
     */
    OTHER_INVESTMENT_CERTIFICATES((short) 41, "Other investment certificates (non leveraged)"),

    /**
     * Structured notes
     */
    STRUCTURED_NOTES((short) 42, "Structured notes"),

    /**
     * Reference rate
     */
    REFERENCE_RATE((short) 43, "Reference rate"),

    /**
     * Interest rate
     */
    INTEREST_RATE((short) 44, "Interest rate"),

    /**
     * Exchange rate
     */
    EXCHANGE_RATE((short) 45, "Exchange rate"),

    /**
     * Price index
     */
    PRICE_INDEX((short) 46, "Price index"),

    /**
     * Total return index
     */
    TOTAL_RETURN_INDEX((short) 47, "Total return index"),

    /**
     * Sector price index
     */
    SECTOR_PRICE_INDEX((short) 48, "Sector price index"),

    /**
     * Sector total return index
     */
    SECTOR_TOTAL_RETURN_INDEX((short) 49, "Sector total return index"),

    /**
     * Dividend index
     */
    DIVIDEND_INDEX((short) 50, "Dividend index"),

    /**
     * Strategy price index
     */
    STRATEGY_PRICE_INDEX((short) 51, "Strategy price index"),

    /**
     * Strategy total return index
     */
    STRATEGY_TOTAL_RETURN_INDEX((short) 52, "Strategy total return index"),

    /**
     * Commodity index
     */
    COMMODITY_INDEX((short) 53, "Commodity index"),

    /**
     * Bond total return index
     */
    BOND_TOTAL_RETURN_INDEX((short) 54, "Bond total return index"),

    /**
     * Supranational Bond
     */
    SUPRANATIONAL_BOND((short) 55, "Supranational Bond"),

    /**
     * Warrant with Knock Out
     */
    WARRANT_WITH_KNOCK_OUT((short) 56, "Warrant with Knock Out");

    private final short wire;

    private final String description;

    ProductSubtype(short wire, String description) {
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
    public static Optional<ProductSubtype> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(SHARE);
            case 2 -> Optional.of(ALLOTMENT_RIGHT);
            case 3 -> Optional.of(SUBSCRIPTION_RIGHT);
            case 4 -> Optional.of(TENDER_OFFER);
            case 5 -> Optional.of(ISSUE_RIGHT);
            case 6 -> Optional.of(SUBSCRIPTION_WARRANT);
            case 7 -> Optional.of(BANK_SECURITIES);
            case 8 -> Optional.of(BOND);
            case 9 -> Optional.of(TREASURY_BOND);
            case 10 -> Optional.of(AGENCY_BOND);
            case 11 -> Optional.of(MUNICIPAL_BOND);
            case 12 -> Optional.of(CORPORATE_BANK_BOND);
            case 13 -> Optional.of(CORPORATE_FIRM_BOND);
            case 14 -> Optional.of(CONVERTIBLE_BOND);
            case 15 -> Optional.of(MORTGAGE_BOND);
            case 16 -> Optional.of(MORTGAGE_BACKED_BOND);
            case 17 -> Optional.of(PUBLIC_MORTGAGE_BOND);
            case 18 -> Optional.of(BILL);
            case 19 -> Optional.of(TREASURY_BILL);
            case 20 -> Optional.of(COMMERCIAL_BILL);
            case 21 -> Optional.of(EXCHANGE_TRADED_FUND);
            case 22 -> Optional.of(EXCHANGE_TRADED_NOTE);
            case 23 -> Optional.of(EXCHANGE_TRADED_COMMODITY);
            case 24 -> Optional.of(INVESTMENT_CERTIFICATE);
            case 25 -> Optional.of(INDEX_FUTURES);
            case 26 -> Optional.of(STOCK_FUTURES);
            case 27 -> Optional.of(CURRENCY_FUTURES);
            case 28 -> Optional.of(BOND_FUTURES);
            case 29 -> Optional.of(INTEREST_RATE_FUTURES);
            case 30 -> Optional.of(INDEX_OPTIONS);
            case 31 -> Optional.of(STOCK_OPTIONS);
            case 32 -> Optional.of(OPTION_WARRANTS);
            case 33 -> Optional.of(FACTOR_CERTIFICATES);
            case 34 -> Optional.of(TURBO_CERTIFICATES);
            case 35 -> Optional.of(CAPITAL_PROTECTION_CERTIFICATES);
            case 36 -> Optional.of(BONUS_CERTIFICATES);
            case 37 -> Optional.of(REVERSE_CONVERTIBLE_CERTIFICATES);
            case 38 -> Optional.of(EXPRESS_CERTIFICATES);
            case 39 -> Optional.of(DISCOUNT_CERTIFICATES);
            case 40 -> Optional.of(INDEX_TRACKER_CERTIFICATES);
            case 41 -> Optional.of(OTHER_INVESTMENT_CERTIFICATES);
            case 42 -> Optional.of(STRUCTURED_NOTES);
            case 43 -> Optional.of(REFERENCE_RATE);
            case 44 -> Optional.of(INTEREST_RATE);
            case 45 -> Optional.of(EXCHANGE_RATE);
            case 46 -> Optional.of(PRICE_INDEX);
            case 47 -> Optional.of(TOTAL_RETURN_INDEX);
            case 48 -> Optional.of(SECTOR_PRICE_INDEX);
            case 49 -> Optional.of(SECTOR_TOTAL_RETURN_INDEX);
            case 50 -> Optional.of(DIVIDEND_INDEX);
            case 51 -> Optional.of(STRATEGY_PRICE_INDEX);
            case 52 -> Optional.of(STRATEGY_TOTAL_RETURN_INDEX);
            case 53 -> Optional.of(COMMODITY_INDEX);
            case 54 -> Optional.of(BOND_TOTAL_RETURN_INDEX);
            case 55 -> Optional.of(SUPRANATIONAL_BOND);
            case 56 -> Optional.of(WARRANT_WITH_KNOCK_OUT);
            default -> Optional.empty();
        };
    }
}
