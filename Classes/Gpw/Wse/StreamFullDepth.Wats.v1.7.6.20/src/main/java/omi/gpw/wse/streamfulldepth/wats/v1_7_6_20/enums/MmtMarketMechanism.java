package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * MMT Market Mechanism
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmtMarketMechanism {

    /**
     * 1 = Central Limit Order Book
     */
    CENTRAL_LIMIT_ORDER_BOOK((short) 1, "1 = Central Limit Order Book"),

    /**
     * 2 = Quote Driven Market
     */
    QUOTE_DRIVEN_MARKET((short) 2, "2 = Quote Driven Market"),

    /**
     * 3 = Dark Order Book
     */
    DARK_ORDER_BOOK((short) 3, "3 = Dark Order Book"),

    /**
     * 4 = Off Book
     */
    OFF_BOOK((short) 4, "4 = Off Book"),

    /**
     * 5 = Periodic Auction
     */
    PERIODIC_AUCTION((short) 5, "5 = Periodic Auction"),

    /**
     * 6 = Request For Quotes
     */
    REQUEST_FOR_QUOTES((short) 6, "6 = Request For Quotes"),

    /**
     * 7 = Any other including Hybrid
     */
    OTHER((short) 7, "7 = Any other including Hybrid");

    private final short wire;

    private final String description;

    MmtMarketMechanism(short wire, String description) {
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
    public static Optional<MmtMarketMechanism> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CENTRAL_LIMIT_ORDER_BOOK);
            case 2 -> Optional.of(QUOTE_DRIVEN_MARKET);
            case 3 -> Optional.of(DARK_ORDER_BOOK);
            case 4 -> Optional.of(OFF_BOOK);
            case 5 -> Optional.of(PERIODIC_AUCTION);
            case 6 -> Optional.of(REQUEST_FOR_QUOTES);
            case 7 -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
