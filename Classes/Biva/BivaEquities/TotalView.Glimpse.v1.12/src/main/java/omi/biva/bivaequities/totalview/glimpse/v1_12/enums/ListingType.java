package omi.biva.bivaequities.totalview.glimpse.v1_12.enums;

import java.util.Optional;

/**
 * Regular or Sub-Rm securities
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ListingType {

    /**
     * Regular Securities
     */
    REGULAR_SECURITIES('R', "Regular Securities"),

    /**
     * Sub Rm Securities
     */
    SUB_RM_SECURITIES('S', "Sub Rm Securities");

    private final char wire;

    private final String description;

    ListingType(char wire, String description) {
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
    public static Optional<ListingType> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(REGULAR_SECURITIES);
            case 'S' -> Optional.of(SUB_RM_SECURITIES);
            default -> Optional.empty();
        };
    }
}
