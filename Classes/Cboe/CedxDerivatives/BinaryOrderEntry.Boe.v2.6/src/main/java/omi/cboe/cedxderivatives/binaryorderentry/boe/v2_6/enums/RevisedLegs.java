package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.enums;

import java.util.Optional;

/**
 * Indicates if the legs on the created complex strat- egy have been reordered from the original re- quest. If the legs were reordered, the order of the Open- Close fields on a NewComplexOrder must be the order returned by the exchange, not the order from the original request. 1 = Legs were not reordered 2 = Legs were reordered
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RevisedLegs {

    /**
     * Legs were not reordered
     */
    LEGS_WERE_NOT_REORDERED('1', "Legs were not reordered"),

    /**
     * Legs were reordered
     */
    LEGS_WERE_REORDERED('2', "Legs were reordered");

    private final char wire;

    private final String description;

    RevisedLegs(char wire, String description) {
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
    public static Optional<RevisedLegs> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(LEGS_WERE_NOT_REORDERED);
            case '2' -> Optional.of(LEGS_WERE_REORDERED);
            default -> Optional.empty();
        };
    }
}
