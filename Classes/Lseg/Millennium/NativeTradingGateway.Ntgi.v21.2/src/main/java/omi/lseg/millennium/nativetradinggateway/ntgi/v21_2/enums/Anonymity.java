package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Whether the order is a named or anonymous order
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Anonymity {

    /**
     * Anonymous
     */
    ANONYMOUS((short) 0, "Anonymous"),

    /**
     * Named
     */
    NAMED((short) 1, "Named");

    private final short wire;

    private final String description;

    Anonymity(short wire, String description) {
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
    public static Optional<Anonymity> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ANONYMOUS);
            case 1 -> Optional.of(NAMED);
            default -> Optional.empty();
        };
    }
}
