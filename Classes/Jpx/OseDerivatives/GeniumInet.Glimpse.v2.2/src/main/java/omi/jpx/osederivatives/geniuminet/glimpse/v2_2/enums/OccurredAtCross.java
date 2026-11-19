package omi.jpx.osederivatives.geniuminet.glimpse.v2_2.enums;

import java.util.Optional;

/**
 * Identification flag for auction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OccurredAtCross {

    /**
     * Execution Through Auction
     */
    EXECUTION_THROUGH_AUCTION('Y', "Execution Through Auction"),

    /**
     * Execution Through Zaraba
     */
    EXECUTION_THROUGH_ZARABA('N', "Execution Through Zaraba");

    private final char wire;

    private final String description;

    OccurredAtCross(char wire, String description) {
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
    public static Optional<OccurredAtCross> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(EXECUTION_THROUGH_AUCTION);
            case 'N' -> Optional.of(EXECUTION_THROUGH_ZARABA);
            default -> Optional.empty();
        };
    }
}
