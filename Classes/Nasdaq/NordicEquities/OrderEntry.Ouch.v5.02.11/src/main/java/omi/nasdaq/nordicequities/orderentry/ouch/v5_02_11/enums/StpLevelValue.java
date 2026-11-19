package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.enums;

import java.util.Optional;

/**
 * Scope of self trade prevention for the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StpLevelValue {

    /**
     * Mpid And Trader
     */
    MPID_AND_TRADER('1', "Mpid And Trader"),

    /**
     * Mpid
     */
    MPID('2', "Mpid"),

    /**
     * Specified Trader Group
     */
    SPECIFIED_TRADER_GROUP('3', "Specified Trader Group");

    private final char wire;

    private final String description;

    StpLevelValue(char wire, String description) {
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
    public static Optional<StpLevelValue> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(MPID_AND_TRADER);
            case '2' -> Optional.of(MPID);
            case '3' -> Optional.of(SPECIFIED_TRADER_GROUP);
            default -> Optional.empty();
        };
    }
}
