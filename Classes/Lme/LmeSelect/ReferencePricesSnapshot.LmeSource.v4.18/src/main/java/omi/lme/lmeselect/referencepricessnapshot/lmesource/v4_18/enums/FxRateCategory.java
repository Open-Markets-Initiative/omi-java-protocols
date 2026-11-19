package omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * FX rate category. The specification names this field Category; it is qualified here because the Reference Price message gives a Category of its own carrying a different set of values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FxRateCategory {

    /**
     * Exchange
     */
    EXCHANGE('E', "Exchange"),

    /**
     * Closing
     */
    CLOSING('C', "Closing");

    private final char wire;

    private final String description;

    FxRateCategory(char wire, String description) {
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
    public static Optional<FxRateCategory> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(EXCHANGE);
            case 'C' -> Optional.of(CLOSING);
            default -> Optional.empty();
        };
    }
}
