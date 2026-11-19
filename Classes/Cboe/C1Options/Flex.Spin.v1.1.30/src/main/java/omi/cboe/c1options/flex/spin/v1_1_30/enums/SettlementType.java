package omi.cboe.c1options.flex.spin.v1_1_30.enums;

import java.util.Optional;

/**
 * Settlement type indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlementType {

    /**
     * Am
     */
    AM('A', "Am"),

    /**
     * Pm
     */
    PM('P', "Pm"),

    /**
     * Asian
     */
    ASIAN('S', "Asian"),

    /**
     * Cliquet
     */
    CLIQUET('Q', "Cliquet");

    private final char wire;

    private final String description;

    SettlementType(char wire, String description) {
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
    public static Optional<SettlementType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AM);
            case 'P' -> Optional.of(PM);
            case 'S' -> Optional.of(ASIAN);
            case 'Q' -> Optional.of(CLIQUET);
            default -> Optional.empty();
        };
    }
}
