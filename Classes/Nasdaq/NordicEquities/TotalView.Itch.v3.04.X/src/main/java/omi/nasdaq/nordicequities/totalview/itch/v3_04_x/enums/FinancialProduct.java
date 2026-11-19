package omi.nasdaq.nordicequities.totalview.itch.v3_04_x.enums;

import java.util.Optional;

/**
 * Type of financial product
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum FinancialProduct {

    /**
     * Stock
     */
    STOCK((short) 1, "Stock"),

    /**
     * Equity Warrant
     */
    EQUITY_WARRANT((short) 2, "Equity Warrant"),

    /**
     * Equity Right
     */
    EQUITY_RIGHT((short) 3, "Equity Right"),

    /**
     * Bond
     */
    BOND((short) 4, "Bond"),

    /**
     * Lottery Bond Series
     */
    LOTTERY_BOND_SERIES((short) 6, "Lottery Bond Series"),

    /**
     * Convertible
     */
    CONVERTIBLE((short) 7, "Convertible"),

    /**
     * Warrant
     */
    WARRANT((short) 8, "Warrant"),

    /**
     * Unit Trust Certificate
     */
    UNIT_TRUST_CERTIFICATE((short) 11, "Unit Trust Certificate"),

    /**
     * Index Fund Unit
     */
    INDEX_FUND_UNIT((short) 12, "Index Fund Unit");

    private final short wire;

    private final String description;

    FinancialProduct(short wire, String description) {
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
    public static Optional<FinancialProduct> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(STOCK);
            case 2 -> Optional.of(EQUITY_WARRANT);
            case 3 -> Optional.of(EQUITY_RIGHT);
            case 4 -> Optional.of(BOND);
            case 6 -> Optional.of(LOTTERY_BOND_SERIES);
            case 7 -> Optional.of(CONVERTIBLE);
            case 8 -> Optional.of(WARRANT);
            case 11 -> Optional.of(UNIT_TRUST_CERTIFICATE);
            case 12 -> Optional.of(INDEX_FUND_UNIT);
            default -> Optional.empty();
        };
    }
}
