package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Identifier of the us indicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum UsIndicator {

    /**
     * No trading restrictions
     */
    NOT_APPLICABLE((short) 1, "No trading restrictions"),

    /**
     * Trading restricted due to US Regulation S
     */
    REGULATION_S((short) 2, "Trading restricted due to US Regulation S"),

    /**
     * Trading restricted due to US Regulation S with Rule 144A
     */
    REGULATION_S_PLUS_RULE_144A((short) 3, "Trading restricted due to US Regulation S with Rule 144A");

    private final short wire;

    private final String description;

    UsIndicator(short wire, String description) {
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
    public static Optional<UsIndicator> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NOT_APPLICABLE);
            case 2 -> Optional.of(REGULATION_S);
            case 3 -> Optional.of(REGULATION_S_PLUS_RULE_144A);
            default -> Optional.empty();
        };
    }
}
