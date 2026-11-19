package omi.lseg.lse.level2incrementalrecovery.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Type of security.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityType {

    /**
     * International Equity
     */
    INTERNATIONAL_EQUITY((short) 1, "International Equity"),

    /**
     * Convertible Bond
     */
    CONVERTIBLE_BOND((short) 4, "Convertible Bond"),

    /**
     * Right
     */
    RIGHT((short) 5, "Right"),

    /**
     * Bonds
     */
    BONDS((short) 39, "Bonds"),

    /**
     * Covered Warrants
     */
    COVERED_WARRANTS((short) 43, "Covered Warrants"),

    /**
     * Debenture
     */
    DEBENTURE((short) 44, "Debenture"),

    /**
     * Uk Equity
     */
    UK_EQUITY((short) 45, "Uk Equity"),

    /**
     * Deposit Receipts
     */
    DEPOSIT_RECEIPTS((short) 46, "Deposit Receipts"),

    /**
     * Equity Warrants
     */
    EQUITY_WARRANTS((short) 47, "Equity Warrants"),

    /**
     * Foreign Government Bonds
     */
    FOREIGN_GOVERNMENT_BONDS((short) 48, "Foreign Government Bonds"),

    /**
     * Gilts
     */
    GILTS((short) 53, "Gilts"),

    /**
     * Loan Stock
     */
    LOAN_STOCK((short) 56, "Loan Stock"),

    /**
     * Medium Term Loans
     */
    MEDIUM_TERM_LOANS((short) 57, "Medium Term Loans"),

    /**
     * Preference Shares
     */
    PREFERENCE_SHARES((short) 64, "Preference Shares"),

    /**
     * Package Units
     */
    PACKAGE_UNITS((short) 66, "Package Units"),

    /**
     * Structured Products
     */
    STRUCTURED_PRODUCTS((short) 69, "Structured Products");

    private final short wire;

    private final String description;

    SecurityType(short wire, String description) {
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
    public static Optional<SecurityType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(INTERNATIONAL_EQUITY);
            case 4 -> Optional.of(CONVERTIBLE_BOND);
            case 5 -> Optional.of(RIGHT);
            case 39 -> Optional.of(BONDS);
            case 43 -> Optional.of(COVERED_WARRANTS);
            case 44 -> Optional.of(DEBENTURE);
            case 45 -> Optional.of(UK_EQUITY);
            case 46 -> Optional.of(DEPOSIT_RECEIPTS);
            case 47 -> Optional.of(EQUITY_WARRANTS);
            case 48 -> Optional.of(FOREIGN_GOVERNMENT_BONDS);
            case 53 -> Optional.of(GILTS);
            case 56 -> Optional.of(LOAN_STOCK);
            case 57 -> Optional.of(MEDIUM_TERM_LOANS);
            case 64 -> Optional.of(PREFERENCE_SHARES);
            case 66 -> Optional.of(PACKAGE_UNITS);
            case 69 -> Optional.of(STRUCTURED_PRODUCTS);
            default -> Optional.empty();
        };
    }
}
