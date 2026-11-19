package omi.bme.bmeequities.retail5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Reference Trading Venue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReferenceTradingVenue {

    /**
     * Valencia
     */
    VALENCIA('1', "Valencia"),

    /**
     * Bilbao
     */
    BILBAO('2', "Bilbao"),

    /**
     * Barcelona
     */
    BARCELONA('4', "Barcelona"),

    /**
     * Madrid
     */
    MADRID('8', "Madrid");

    private final char wire;

    private final String description;

    ReferenceTradingVenue(char wire, String description) {
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
    public static Optional<ReferenceTradingVenue> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(VALENCIA);
            case '2' -> Optional.of(BILBAO);
            case '4' -> Optional.of(BARCELONA);
            case '8' -> Optional.of(MADRID);
            default -> Optional.empty();
        };
    }
}
