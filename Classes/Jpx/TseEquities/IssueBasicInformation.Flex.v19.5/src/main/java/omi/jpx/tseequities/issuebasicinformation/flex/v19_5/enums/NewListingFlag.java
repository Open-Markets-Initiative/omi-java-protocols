package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the New listing flag.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NewListingFlag {

    /**
     * Newly Listed Issue
     */
    NEWLY_LISTED_ISSUE('1', "Newly Listed Issue"),

    /**
     * Other Than The Above
     */
    OTHER_THAN_THE_ABOVE(' ', "Other Than The Above");

    private final char wire;

    private final String description;

    NewListingFlag(char wire, String description) {
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
    public static Optional<NewListingFlag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(NEWLY_LISTED_ISSUE);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
