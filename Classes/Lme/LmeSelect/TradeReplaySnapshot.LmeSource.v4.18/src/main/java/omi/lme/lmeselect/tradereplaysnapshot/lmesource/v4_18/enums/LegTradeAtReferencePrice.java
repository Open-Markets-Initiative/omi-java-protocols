package omi.lme.lmeselect.tradereplaysnapshot.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Indicates whether the leg price is differential or substituted.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegTradeAtReferencePrice {

    /**
     * Differential
     */
    DIFFERENTIAL('D', "Differential"),

    /**
     * Substituted
     */
    SUBSTITUTED('S', "Substituted"),

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable");

    private final char wire;

    private final String description;

    LegTradeAtReferencePrice(char wire, String description) {
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
    public static Optional<LegTradeAtReferencePrice> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(DIFFERENTIAL);
            case 'S' -> Optional.of(SUBSTITUTED);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
