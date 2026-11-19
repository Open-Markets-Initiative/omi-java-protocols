package omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.enums;

import java.util.Optional;

/**
 * Code identifying the primary listing market
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ListingMarket {

    /**
     * Tsx
     */
    TSX('T', "Tsx"),

    /**
     * Venture
     */
    VENTURE('V', "Venture"),

    /**
     * Cse
     */
    CSE('C', "Cse"),

    /**
     * Neo
     */
    NEO('N', "Neo");

    private final char wire;

    private final String description;

    ListingMarket(char wire, String description) {
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
    public static Optional<ListingMarket> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(TSX);
            case 'V' -> Optional.of(VENTURE);
            case 'C' -> Optional.of(CSE);
            case 'N' -> Optional.of(NEO);
            default -> Optional.empty();
        };
    }
}
