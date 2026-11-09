package omi.ice.icefutures.mdf.impact.v1_1_33.enums;

import java.util.Optional;

/**
 * Indicate if the contract is for hedge only. ‘Y’ or ‘N’.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum HedgeOnly {

    /**
     * Hedge Only Contract
     */
    YES('Y', "Hedge Only Contract"),

    /**
     * Not Hedge Only Contract
     */
    NO('N', "Not Hedge Only Contract");

    private final char wire;

    private final String description;

    HedgeOnly(char wire, String description) {
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
    public static Optional<HedgeOnly> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(YES);
            case 'N' -> Optional.of(NO);
            default -> Optional.empty();
        };
    }
}
