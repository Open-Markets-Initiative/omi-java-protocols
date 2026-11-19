package omi.cboe.c1options.auctionfeed.pitch.v1_1_1.enums;

import java.util.Optional;

/**
 * Auction Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpeningType {

    /**
     * GTH Opening
     */
    GTH_OPENING('G', "GTH Opening"),

    /**
     * RTH Opening
     */
    RTH_OPENING('O', "RTH Opening"),

    /**
     * Halt Reopening
     */
    HALT_REOPENING('H', "Halt Reopening"),

    /**
     * Volatility Opening
     */
    VOLATILITY_OPENING('V', "Volatility Opening");

    private final char wire;

    private final String description;

    OpeningType(char wire, String description) {
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
    public static Optional<OpeningType> fromWire(char wire) {
        return switch (wire) {
            case 'G' -> Optional.of(GTH_OPENING);
            case 'O' -> Optional.of(RTH_OPENING);
            case 'H' -> Optional.of(HALT_REOPENING);
            case 'V' -> Optional.of(VOLATILITY_OPENING);
            default -> Optional.empty();
        };
    }
}
