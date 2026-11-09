package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

import java.util.Optional;

/**
 * Denotes the market centre for which the operational halt is declared
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCode {

    /**
     * Nasdaq
     */
    NASDAQ('Q', "Nasdaq"),

    /**
     * BX
     */
    BX('B', "BX"),

    /**
     * PSX
     */
    PSX('X', "PSX");

    private final char wire;

    private final String description;

    MarketCode(char wire, String description) {
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
    public static Optional<MarketCode> fromWire(char wire) {
        return switch (wire) {
            case 'Q' -> Optional.of(NASDAQ);
            case 'B' -> Optional.of(BX);
            case 'X' -> Optional.of(PSX);
            default -> Optional.empty();
        };
    }
}
