package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * securityIDSource
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityIdSource {

    /**
     * ISIN
     */
    ISIN('4', "ISIN"),

    /**
     * EXCHANGE_SYMBOL
     */
    EXCHANGE_SYMBOL('8', "EXCHANGE_SYMBOL");

    private final char wire;

    private final String description;

    SecurityIdSource(char wire, String description) {
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
    public static Optional<SecurityIdSource> fromWire(char wire) {
        return switch (wire) {
            case '4' -> Optional.of(ISIN);
            case '8' -> Optional.of(EXCHANGE_SYMBOL);
            default -> Optional.empty();
        };
    }
}
