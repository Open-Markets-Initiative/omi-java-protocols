package omi.cboe.cfefutures.oofmulticastdepthofbook.pitch.v1_0_8.enums;

import java.util.Optional;

/**
 * I = Indicative Settlement S = Initial Settlement R = Re-issued Settlement
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Issue {

    /**
     * Indicative Settlement
     */
    INDICATIVE_SETTLEMENT('I', "Indicative Settlement"),

    /**
     * Initial Settlement
     */
    INITIAL_SETTLEMENT('S', "Initial Settlement"),

    /**
     * Reissued Settlement
     */
    REISSUED_SETTLEMENT('R', "Reissued Settlement");

    private final char wire;

    private final String description;

    Issue(char wire, String description) {
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
    public static Optional<Issue> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(INDICATIVE_SETTLEMENT);
            case 'S' -> Optional.of(INITIAL_SETTLEMENT);
            case 'R' -> Optional.of(REISSUED_SETTLEMENT);
            default -> Optional.empty();
        };
    }
}
