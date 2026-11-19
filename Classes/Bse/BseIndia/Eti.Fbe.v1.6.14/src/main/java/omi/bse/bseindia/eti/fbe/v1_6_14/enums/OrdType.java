package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

import java.util.Optional;

/**
 * Defines the OrdType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrdType {

    /**
     * Limit
     */
    LIMIT((short) 2, "Limit"),

    /**
     * Stop Market
     */
    STOP((short) 3, "Stop Market"),

    /**
     * Stop Limit
     */
    STOP_LIMIT((short) 4, "Stop Limit"),

    /**
     * Market
     */
    MARKETTO_LIMIT((short) 5, "Market"),

    /**
     * Block Deal
     */
    BLOCK_DEAL((short) 6, "Block Deal"),

    /**
     * Quote
     */
    QUOTE((short) 7, "Quote"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    OrdType(short wire, String description) {
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
    public static Optional<OrdType> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(LIMIT);
            case 3 -> Optional.of(STOP);
            case 4 -> Optional.of(STOP_LIMIT);
            case 5 -> Optional.of(MARKETTO_LIMIT);
            case 6 -> Optional.of(BLOCK_DEAL);
            case 7 -> Optional.of(QUOTE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
