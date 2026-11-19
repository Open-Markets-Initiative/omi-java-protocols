package omi.databento.marketdata.normalized.dbn.v1.enums;

import java.util.Optional;

/**
 * Reserved for future use
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnpairedSide {

    /**
     * A sell order or sell aggressor in a trade
     */
    ASK('A', "A sell order or sell aggressor in a trade"),

    /**
     * A buy order or a buy aggressor in a trade
     */
    BID('B', "A buy order or a buy aggressor in a trade"),

    /**
     * No side specified by the original source
     */
    NONE('N', "No side specified by the original source");

    private final char wire;

    private final String description;

    UnpairedSide(char wire, String description) {
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
    public static Optional<UnpairedSide> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ASK);
            case 'B' -> Optional.of(BID);
            case 'N' -> Optional.of(NONE);
            default -> Optional.empty();
        };
    }
}
