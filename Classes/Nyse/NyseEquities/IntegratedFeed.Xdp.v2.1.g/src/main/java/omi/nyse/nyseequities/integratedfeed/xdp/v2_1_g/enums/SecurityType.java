package omi.nyse.nyseequities.integratedfeed.xdp.v2_1_g.enums;

import java.util.Optional;

/**
 * Type of Security used by Arca, National and American
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityType {

    /**
     * COMMON STOCK
     */
    COMMON_STOCK('A', "COMMON STOCK"),

    /**
     * PREFERRED STOCK
     */
    PREFERRED_STOCK('B', "PREFERRED STOCK"),

    /**
     * WARRANT
     */
    WARRANT('C', "WARRANT"),

    /**
     * RIGHT
     */
    RIGHT('D', "RIGHT"),

    /**
     * CORPORATE BOND
     */
    CORPORATE_BOND('E', "CORPORATE BOND"),

    /**
     * TREASURY BOND
     */
    TREASURY_BOND('F', "TREASURY BOND"),

    /**
     * STRUCTURED PRODUCT
     */
    STRUCTURED_PRODUCT('G', "STRUCTURED PRODUCT"),

    /**
     * ADR COMMON
     */
    ADR_COMMON('H', "ADR COMMON"),

    /**
     * ADR PREFERRED
     */
    ADR_PREFERRED('I', "ADR PREFERRED"),

    /**
     * ADR WARRANTS
     */
    ADR_WARRANTS('J', "ADR WARRANTS"),

    /**
     * ADR RIGHTS
     */
    ADR_RIGHTS('K', "ADR RIGHTS"),

    /**
     * ADR CORPORATE BOND
     */
    ADR_CORPORATE_BOND('L', "ADR CORPORATE BOND"),

    /**
     * NY REGISTERED SHARE
     */
    NY_REGISTERED_SHARE('M', "NY REGISTERED SHARE"),

    /**
     * GLOBAL REGISTERED SHARE
     */
    GLOBAL_REGISTERED_SHARE('N', "GLOBAL REGISTERED SHARE"),

    /**
     * INDEX
     */
    INDEX('O', "INDEX"),

    /**
     * FUND
     */
    FUND('P', "FUND"),

    /**
     * BASKET
     */
    BASKET('Q', "BASKET"),

    /**
     * UNIT
     */
    UNIT('R', "UNIT"),

    /**
     * LIQUIDATING TRUST
     */
    LIQUIDATING_TRUST('S', "LIQUIDATING TRUST"),

    /**
     * UNKNOWN
     */
    UNKNOWN('U', "UNKNOWN");

    private final char wire;

    private final String description;

    SecurityType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<SecurityType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(COMMON_STOCK);
            case 'B' -> Optional.of(PREFERRED_STOCK);
            case 'C' -> Optional.of(WARRANT);
            case 'D' -> Optional.of(RIGHT);
            case 'E' -> Optional.of(CORPORATE_BOND);
            case 'F' -> Optional.of(TREASURY_BOND);
            case 'G' -> Optional.of(STRUCTURED_PRODUCT);
            case 'H' -> Optional.of(ADR_COMMON);
            case 'I' -> Optional.of(ADR_PREFERRED);
            case 'J' -> Optional.of(ADR_WARRANTS);
            case 'K' -> Optional.of(ADR_RIGHTS);
            case 'L' -> Optional.of(ADR_CORPORATE_BOND);
            case 'M' -> Optional.of(NY_REGISTERED_SHARE);
            case 'N' -> Optional.of(GLOBAL_REGISTERED_SHARE);
            case 'O' -> Optional.of(INDEX);
            case 'P' -> Optional.of(FUND);
            case 'Q' -> Optional.of(BASKET);
            case 'R' -> Optional.of(UNIT);
            case 'S' -> Optional.of(LIQUIDATING_TRUST);
            case 'U' -> Optional.of(UNKNOWN);
            default -> Optional.empty();
        };
    }
}
