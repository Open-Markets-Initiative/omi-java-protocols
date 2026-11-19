package omi.euronext.optiq.dropcopygateway.sbe.v6_69.enums;

import java.util.Optional;

/**
 * buyRevisionFlag
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BuyRevisionFlag {

    /**
     * New
     */
    NEW((short) 0, "New"),

    /**
     * Replacement
     */
    REPLACEMENT((short) 1, "Replacement"),

    /**
     * Cancellation
     */
    CANCELLATION((short) 2, "Cancellation"),

    /**
     * buyRevisionFlag
     */
    NO_VALUE((short) 255, "buyRevisionFlag");

    private final short wire;

    private final String description;

    BuyRevisionFlag(short wire, String description) {
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
    public static Optional<BuyRevisionFlag> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NEW);
            case 1 -> Optional.of(REPLACEMENT);
            case 2 -> Optional.of(CANCELLATION);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
