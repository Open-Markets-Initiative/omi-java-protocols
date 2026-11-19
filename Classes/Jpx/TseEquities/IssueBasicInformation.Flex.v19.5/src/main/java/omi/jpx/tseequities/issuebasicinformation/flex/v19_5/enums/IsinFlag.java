package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the ISIN flag.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IsinFlag {

    /**
     * Identifiable By The International Standard Code
     */
    IDENTIFIABLE_BY_THE_INTERNATIONAL_STANDARD_CODE('1', "Identifiable By The International Standard Code"),

    /**
     * Other Than The Above
     */
    OTHER_THAN_THE_ABOVE(' ', "Other Than The Above");

    private final char wire;

    private final String description;

    IsinFlag(char wire, String description) {
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
    public static Optional<IsinFlag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(IDENTIFIABLE_BY_THE_INTERNATIONAL_STANDARD_CODE);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
