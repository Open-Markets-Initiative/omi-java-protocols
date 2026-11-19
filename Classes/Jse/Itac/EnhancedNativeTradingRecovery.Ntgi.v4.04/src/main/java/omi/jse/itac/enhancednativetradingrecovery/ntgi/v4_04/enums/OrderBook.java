package omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Order book the order belongs to
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderBook {

    /**
     * Regular
     */
    REGULAR((short) 1, "Regular"),

    /**
     * Bulletin Board
     */
    BULLETIN_BOARD((short) 9, "Bulletin Board"),

    /**
     * Negotiated Trades
     */
    NEGOTIATED_TRADES((short) 11, "Negotiated Trades"),

    /**
     * Fx Auction
     */
    FX_AUCTION((short) 51, "Fx Auction");

    private final short wire;

    private final String description;

    OrderBook(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<OrderBook> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(REGULAR);
            case 9 -> Optional.of(BULLETIN_BOARD);
            case 11 -> Optional.of(NEGOTIATED_TRADES);
            case 51 -> Optional.of(FX_AUCTION);
            default -> Optional.empty();
        };
    }
}
