package omi.jpx.sseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates whether short selling regulation applies or not.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortSellingRegulationFlag {

    /**
     * Short Selling Regulation Does Not Apply
     */
    SHORT_SELLING_REGULATION_DOES_NOT_APPLY('0', "Short Selling Regulation Does Not Apply"),

    /**
     * Short Selling Regulation Is Applied
     */
    SHORT_SELLING_REGULATION_IS_APPLIED('1', "Short Selling Regulation Is Applied");

    private final char wire;

    private final String description;

    ShortSellingRegulationFlag(char wire, String description) {
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
    public static Optional<ShortSellingRegulationFlag> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(SHORT_SELLING_REGULATION_DOES_NOT_APPLY);
            case '1' -> Optional.of(SHORT_SELLING_REGULATION_IS_APPLIED);
            default -> Optional.empty();
        };
    }
}
