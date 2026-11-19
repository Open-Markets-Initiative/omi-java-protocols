package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Automatic Order Filter Flag 2
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AutomaticOrderFilterFlag2 {

    /**
     * For Orders Entered By An Authorized Trader
     */
    FOR_ORDERS_ENTERED_BY_AN_AUTHORIZED_TRADER('2', "For Orders Entered By An Authorized Trader"),

    /**
     * For Authorized Arbitration Orders
     */
    FOR_AUTHORIZED_ARBITRATION_ORDERS('g', "For Authorized Arbitration Orders"),

    /**
     * For Orders Not Entered By An Authorized Trader
     */
    FOR_ORDERS_NOT_ENTERED_BY_AN_AUTHORIZED_TRADER('C', "For Orders Not Entered By An Authorized Trader"),

    /**
     * N/A
     */
    NOT_APPLICABLE(' ', "N/A");

    private final char wire;

    private final String description;

    AutomaticOrderFilterFlag2(char wire, String description) {
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
    public static Optional<AutomaticOrderFilterFlag2> fromWire(char wire) {
        return switch (wire) {
            case '2' -> Optional.of(FOR_ORDERS_ENTERED_BY_AN_AUTHORIZED_TRADER);
            case 'g' -> Optional.of(FOR_AUTHORIZED_ARBITRATION_ORDERS);
            case 'C' -> Optional.of(FOR_ORDERS_NOT_ENTERED_BY_AN_AUTHORIZED_TRADER);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
