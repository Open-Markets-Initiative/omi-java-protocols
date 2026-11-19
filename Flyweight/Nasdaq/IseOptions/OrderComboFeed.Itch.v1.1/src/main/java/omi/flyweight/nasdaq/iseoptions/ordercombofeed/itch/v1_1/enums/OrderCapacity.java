package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * Order Capacity value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderCapacity {

    /**
     * Customer
     */
    CUSTOMER('C'),

    /**
     * Customer Professional
     */
    CUSTOMER_PROFESSIONAL('D'),

    /**
     * Firm
     */
    FIRM('F'),

    /**
     * Broker/Dealer - Customer
     */
    BROKER_DEALER_CUSTOMER('B'),

    /**
     * Broker/Dealer - Firm
     */
    BROKER_DEALER_FIRM('K'),

    /**
     * Proprietary
     */
    PROPRIETARY('E'),

    /**
     * Away Market Maker
     */
    AWAY_MARKET_MAKER('N'),

    /**
     * Market Maker
     */
    MARKET_MAKER('M');

    private static final OrderCapacity[] BY_WIRE = new OrderCapacity[256];

    static {
        for (OrderCapacity value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    OrderCapacity(char wire) {
        this.wire = wire;
    }

    /**
     * Gets the value as it is sent.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Looks a value up from its wire form, allocating nothing.
     *
     * @param wire the wire value
     * @return the value, or null when the protocol declares none for it
     */
    public static OrderCapacity get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
