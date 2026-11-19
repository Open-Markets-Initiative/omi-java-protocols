package omi.pse.pseequities.basicwithlastsale.itch.v2_3.enums;

import java.util.Optional;

/**
 * Indicates 'per unit' price type or price as percentage.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceType {

    /**
     * 'per unit' price type
     */
    PER_UNIT('U', "'per unit' price type"),

    /**
     * price as percentage
     */
    PERCENTAGE('P', "price as percentage");

    private final char wire;

    private final String description;

    PriceType(char wire, String description) {
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
    public static Optional<PriceType> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(PER_UNIT);
            case 'P' -> Optional.of(PERCENTAGE);
            default -> Optional.empty();
        };
    }
}
