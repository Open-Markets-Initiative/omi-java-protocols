package omi.nairobi.nairobiequities.realtime.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Denotes the type of the auction trade being disseminated. For regular trades this field will be unset.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionTradeType {

    /**
     * Bulk Trade
     */
    BULK_TRADE('B', "Bulk Trade"),

    /**
     * Supplementary Trade
     */
    SUPPLEMENTARY_TRADE('S', "Supplementary Trade");

    private final char wire;

    private final String description;

    AuctionTradeType(char wire, String description) {
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
    public static Optional<AuctionTradeType> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BULK_TRADE);
            case 'S' -> Optional.of(SUPPLEMENTARY_TRADE);
            default -> Optional.empty();
        };
    }
}
