package omi.jpx.nseequities.marketbyorder.flex.v1_3.enums;

import java.util.Optional;

/**
 * Indicates the order condition
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderCondition {

    /**
     * Non Conditional
     */
    NON_CONDITIONAL((short) 0, "Non Conditional"),

    /**
     * On Open
     */
    ON_OPEN((short) 2, "On Open"),

    /**
     * On Close
     */
    ON_CLOSE((short) 4, "On Close"),

    /**
     * Funari
     */
    FUNARI((short) 6, "Funari");

    private final short wire;

    private final String description;

    OrderCondition(short wire, String description) {
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
    public static Optional<OrderCondition> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NON_CONDITIONAL);
            case 2 -> Optional.of(ON_OPEN);
            case 4 -> Optional.of(ON_CLOSE);
            case 6 -> Optional.of(FUNARI);
            default -> Optional.empty();
        };
    }
}
