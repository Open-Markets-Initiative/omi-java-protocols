package omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.enums;

import java.util.Optional;

/**
 * Unique code for feed
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FeedIdentifier {

    /**
     * Aspen
     */
    ASPEN('A', "Aspen"),

    /**
     * Aspen Vert
     */
    ASPEN_VERT('V', "Aspen Vert"),

    /**
     * Midpoint
     */
    MIDPOINT('M', "Midpoint"),

    /**
     * Aspen Uat
     */
    ASPEN_UAT('B', "Aspen Uat"),

    /**
     * Aspen Vert Uat
     */
    ASPEN_VERT_UAT('W', "Aspen Vert Uat"),

    /**
     * Midpoint Uat
     */
    MIDPOINT_UAT('N', "Midpoint Uat");

    private final char wire;

    private final String description;

    FeedIdentifier(char wire, String description) {
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
    public static Optional<FeedIdentifier> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ASPEN);
            case 'V' -> Optional.of(ASPEN_VERT);
            case 'M' -> Optional.of(MIDPOINT);
            case 'B' -> Optional.of(ASPEN_UAT);
            case 'W' -> Optional.of(ASPEN_VERT_UAT);
            case 'N' -> Optional.of(MIDPOINT_UAT);
            default -> Optional.empty();
        };
    }
}
