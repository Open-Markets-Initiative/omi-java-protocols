package omi.lseg.lse.level1.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Order book the status applies to.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderBookType {

    /**
     * Firm Quote Book
     */
    FIRM_QUOTE_BOOK((short) 1, "Firm Quote Book"),

    /**
     * Off Book
     */
    OFF_BOOK((short) 2, "Off Book"),

    /**
     * Electronic Order Book
     */
    ELECTRONIC_ORDER_BOOK((short) 3, "Electronic Order Book"),

    /**
     * Private Rfq
     */
    PRIVATE_RFQ((short) 4, "Private Rfq");

    private final short wire;

    private final String description;

    OrderBookType(short wire, String description) {
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
    public static Optional<OrderBookType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(FIRM_QUOTE_BOOK);
            case 2 -> Optional.of(OFF_BOOK);
            case 3 -> Optional.of(ELECTRONIC_ORDER_BOOK);
            case 4 -> Optional.of(PRIVATE_RFQ);
            default -> Optional.empty();
        };
    }
}
