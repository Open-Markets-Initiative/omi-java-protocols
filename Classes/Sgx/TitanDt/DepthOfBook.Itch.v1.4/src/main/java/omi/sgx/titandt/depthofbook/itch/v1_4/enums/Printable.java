package omi.sgx.titandt.depthofbook.itch.v1_4.enums;

import java.util.Optional;

/**
 * Whether the trade should be included in trade tickers
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Printable {

    /**
     * Printable
     */
    PRINTABLE('Y', "Printable"),

    /**
     * Non Printable
     */
    NON_PRINTABLE('N', "Non Printable");

    private final char wire;

    private final String description;

    Printable(char wire, String description) {
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
    public static Optional<Printable> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(PRINTABLE);
            case 'N' -> Optional.of(NON_PRINTABLE);
            default -> Optional.empty();
        };
    }
}
