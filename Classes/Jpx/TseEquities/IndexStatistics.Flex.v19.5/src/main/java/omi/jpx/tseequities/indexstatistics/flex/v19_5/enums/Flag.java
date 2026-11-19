package omi.jpx.tseequities.indexstatistics.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the flag of the opening price.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Flag {

    /**
     * The final index for this session.
     */
    FINAL_INDEX_FLAG('1', "The final index for this session."),

    /**
     * Indicates that this is a correction to the final index.
     */
    FINAL_INDEX_CORRECTION_FLAG('3', "Indicates that this is a correction to the final index."),

    /**
     * Other Than The Above
     */
    OTHER_THAN_THE_ABOVE(' ', "Other Than The Above");

    private final char wire;

    private final String description;

    Flag(char wire, String description) {
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
    public static Optional<Flag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(FINAL_INDEX_FLAG);
            case '3' -> Optional.of(FINAL_INDEX_CORRECTION_FLAG);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
