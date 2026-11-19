package omi.nasdaq.ntxoptions.topofmarket.itch.v2_2.enums;

import java.util.Optional;

/**
 * Denotes whether or not this option is tradable at the exchange.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Tradable {

    /**
     * Instrument is tradable
     */
    INSTRUMENT_IS_TRADABLE('Y', "Instrument is tradable"),

    /**
     * Instrument is not tradable
     */
    INSTRUMENT_IS_NOT_TRADABLE('N', "Instrument is not tradable");

    private final char wire;

    private final String description;

    Tradable(char wire, String description) {
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
    public static Optional<Tradable> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(INSTRUMENT_IS_TRADABLE);
            case 'N' -> Optional.of(INSTRUMENT_IS_NOT_TRADABLE);
            default -> Optional.empty();
        };
    }
}
