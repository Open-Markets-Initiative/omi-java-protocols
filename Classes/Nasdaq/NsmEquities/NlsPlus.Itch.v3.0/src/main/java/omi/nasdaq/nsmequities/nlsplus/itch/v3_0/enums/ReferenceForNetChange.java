package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

import java.util.Optional;

/**
 * Indicates the basis of the reference price for net change calculations
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReferenceForNetChange {

    /**
     * First Trade Price
     */
    FIRST_TRADE_PRICE('F', "First Trade Price"),

    /**
     * Underwriter Price
     */
    UNDERWRITER_PRICE('W', "Underwriter Price");

    private final char wire;

    private final String description;

    ReferenceForNetChange(char wire, String description) {
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
    public static Optional<ReferenceForNetChange> fromWire(char wire) {
        return switch (wire) {
            case 'F' -> Optional.of(FIRST_TRADE_PRICE);
            case 'W' -> Optional.of(UNDERWRITER_PRICE);
            default -> Optional.empty();
        };
    }
}
