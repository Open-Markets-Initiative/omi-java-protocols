package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies whether the security symbol is an IPO
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Ipo {

    /**
     * Not An Ipo Symbol
     */
    NOT_AN_IPO_SYMBOL('0', "Not An Ipo Symbol"),

    /**
     * Ipo Symbol
     */
    IPO_SYMBOL('1', "Ipo Symbol");

    private final char wire;

    private final String description;

    Ipo(char wire, String description) {
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
    public static Optional<Ipo> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NOT_AN_IPO_SYMBOL);
            case '1' -> Optional.of(IPO_SYMBOL);
            default -> Optional.empty();
        };
    }
}
