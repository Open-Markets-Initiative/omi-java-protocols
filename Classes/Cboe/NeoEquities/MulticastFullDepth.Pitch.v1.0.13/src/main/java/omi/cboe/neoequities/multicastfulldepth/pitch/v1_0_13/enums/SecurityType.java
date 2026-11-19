package omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.enums;

import java.util.Optional;

/**
 * The security type of the instrument.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityType {

    /**
     * Equity
     */
    EQUITY((short) 1, "Equity"),

    /**
     * Debt
     */
    DEBT((short) 2, "Debt"),

    /**
     * Closed End Fund
     */
    CLOSED_END_FUND((short) 3, "Closed End Fund"),

    /**
     * Depositary Receipt
     */
    DEPOSITARY_RECEIPT((short) 4, "Depositary Receipt"),

    /**
     * Exchange Traded Fund
     */
    EXCHANGE_TRADED_FUND((short) 5, "Exchange Traded Fund"),

    /**
     * Foreign Listed Security
     */
    FOREIGN_LISTED_SECURITY((short) 6, "Foreign Listed Security"),

    /**
     * Structured Product
     */
    STRUCTURED_PRODUCT((short) 7, "Structured Product"),

    /**
     * Unit
     */
    UNIT((short) 8, "Unit"),

    /**
     * Warrant
     */
    WARRANT((short) 9, "Warrant"),

    /**
     * Unlisted Security
     */
    UNLISTED_SECURITY((short) 52, "Unlisted Security");

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
            case 1 -> Optional.of(EQUITY);
            case 2 -> Optional.of(DEBT);
            case 3 -> Optional.of(CLOSED_END_FUND);
            case 4 -> Optional.of(DEPOSITARY_RECEIPT);
            case 5 -> Optional.of(EXCHANGE_TRADED_FUND);
            case 6 -> Optional.of(FOREIGN_LISTED_SECURITY);
            case 7 -> Optional.of(STRUCTURED_PRODUCT);
            case 8 -> Optional.of(UNIT);
            case 9 -> Optional.of(WARRANT);
            case 52 -> Optional.of(UNLISTED_SECURITY);
            default -> Optional.empty();
        };
    }
}
