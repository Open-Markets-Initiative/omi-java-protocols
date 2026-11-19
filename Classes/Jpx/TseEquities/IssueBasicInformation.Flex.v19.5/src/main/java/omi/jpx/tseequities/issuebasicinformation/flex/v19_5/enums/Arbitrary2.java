package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates whether this is a constituent issue of TOPIX Large70.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Arbitrary2 {

    /**
     * Constituent Issue Of Topix Large 70
     */
    CONSTITUENT_ISSUE_OF_TOPIX_LARGE_70('1', "Constituent Issue Of Topix Large 70"),

    /**
     * Other Than The Above
     */
    OTHER_THAN_THE_ABOVE(' ', "Other Than The Above");

    private final char wire;

    private final String description;

    Arbitrary2(char wire, String description) {
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
    public static Optional<Arbitrary2> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CONSTITUENT_ISSUE_OF_TOPIX_LARGE_70);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
