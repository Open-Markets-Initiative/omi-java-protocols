package omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_46.enums;

import java.util.Optional;

/**
 * Product type of the security.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ProductType {

    /**
     * Equity Ordinary Shares
     */
    EQUITY_ORDINARY_SHARES((short) 1, "Equity Ordinary Shares"),

    /**
     * Equity Preference Shares
     */
    EQUITY_PREFERENCE_SHARES((short) 2, "Equity Preference Shares"),

    /**
     * Equity Rights
     */
    EQUITY_RIGHTS((short) 6, "Equity Rights"),

    /**
     * Equity Depository Receipt Hdr Ordinary Shares
     */
    EQUITY_DEPOSITORY_RECEIPT_HDR_ORDINARY_SHARES((short) 7, "Equity Depository Receipt Hdr Ordinary Shares"),

    /**
     * Equity Depository Receipt Hdr Preference Shares
     */
    EQUITY_DEPOSITORY_RECEIPT_HDR_PREFERENCE_SHARES((short) 12, "Equity Depository Receipt Hdr Preference Shares"),

    /**
     * Equity Spac Shares
     */
    EQUITY_SPAC_SHARES((short) 24, "Equity Spac Shares"),

    /**
     * Warrant Derivative Warrant Dw
     */
    WARRANT_DERIVATIVE_WARRANT_DW((short) 3, "Warrant Derivative Warrant Dw"),

    /**
     * Warrant Callable Bull Bear Contract Cbbc
     */
    WARRANT_CALLABLE_BULL_BEAR_CONTRACT_CBBC((short) 11, "Warrant Callable Bull Bear Contract Cbbc"),

    /**
     * Warrant Equity Warrant
     */
    WARRANT_EQUITY_WARRANT((short) 13, "Warrant Equity Warrant"),

    /**
     * Warrant Inline Warrant
     */
    WARRANT_INLINE_WARRANT((short) 15, "Warrant Inline Warrant"),

    /**
     * Warrant Spac Warrants
     */
    WARRANT_SPAC_WARRANTS((short) 21, "Warrant Spac Warrants"),

    /**
     * Bond Debt Security
     */
    BOND_DEBT_SECURITY((short) 4, "Bond Debt Security"),

    /**
     * Trust Real Estate Investment Trust Reit
     */
    TRUST_REAL_ESTATE_INVESTMENT_TRUST_REIT((short) 8, "Trust Real Estate Investment Trust Reit"),

    /**
     * Trust Other Unit Trusts
     */
    TRUST_OTHER_UNIT_TRUSTS((short) 9, "Trust Other Unit Trusts"),

    /**
     * Trust Leveraged And Inverse Product Lip
     */
    TRUST_LEVERAGED_AND_INVERSE_PRODUCT_LIP((short) 10, "Trust Leveraged And Inverse Product Lip"),

    /**
     * Trust Equity Etf
     */
    TRUST_EQUITY_ETF((short) 16, "Trust Equity Etf"),

    /**
     * Trust Fixed Income And Money Market Etf
     */
    TRUST_FIXED_INCOME_AND_MONEY_MARKET_ETF((short) 17, "Trust Fixed Income And Money Market Etf"),

    /**
     * Trust Commodities Etf
     */
    TRUST_COMMODITIES_ETF((short) 18, "Trust Commodities Etf"),

    /**
     * Others None Of The Above
     */
    OTHERS_NONE_OF_THE_ABOVE((short) 99, "Others None Of The Above");

    private final short wire;

    private final String description;

    ProductType(short wire, String description) {
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
    public static Optional<ProductType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(EQUITY_ORDINARY_SHARES);
            case 2 -> Optional.of(EQUITY_PREFERENCE_SHARES);
            case 6 -> Optional.of(EQUITY_RIGHTS);
            case 7 -> Optional.of(EQUITY_DEPOSITORY_RECEIPT_HDR_ORDINARY_SHARES);
            case 12 -> Optional.of(EQUITY_DEPOSITORY_RECEIPT_HDR_PREFERENCE_SHARES);
            case 24 -> Optional.of(EQUITY_SPAC_SHARES);
            case 3 -> Optional.of(WARRANT_DERIVATIVE_WARRANT_DW);
            case 11 -> Optional.of(WARRANT_CALLABLE_BULL_BEAR_CONTRACT_CBBC);
            case 13 -> Optional.of(WARRANT_EQUITY_WARRANT);
            case 15 -> Optional.of(WARRANT_INLINE_WARRANT);
            case 21 -> Optional.of(WARRANT_SPAC_WARRANTS);
            case 4 -> Optional.of(BOND_DEBT_SECURITY);
            case 8 -> Optional.of(TRUST_REAL_ESTATE_INVESTMENT_TRUST_REIT);
            case 9 -> Optional.of(TRUST_OTHER_UNIT_TRUSTS);
            case 10 -> Optional.of(TRUST_LEVERAGED_AND_INVERSE_PRODUCT_LIP);
            case 16 -> Optional.of(TRUST_EQUITY_ETF);
            case 17 -> Optional.of(TRUST_FIXED_INCOME_AND_MONEY_MARKET_ETF);
            case 18 -> Optional.of(TRUST_COMMODITIES_ETF);
            case 99 -> Optional.of(OTHERS_NONE_OF_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
