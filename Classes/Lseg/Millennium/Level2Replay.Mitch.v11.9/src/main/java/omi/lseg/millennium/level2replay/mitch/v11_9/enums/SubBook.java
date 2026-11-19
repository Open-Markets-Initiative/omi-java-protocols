package omi.lseg.millennium.level2replay.mitch.v11_9.enums;

import java.util.Optional;

/**
 * Sub Book
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SubBook {

    /**
     * Regular Trades
     */
    REGULAR_TRADES((short) 0, "Regular Trades"),

    /**
     * Rfq Trades
     */
    RFQ_TRADES((short) 11, "Rfq Trades");

    private final short wire;

    private final String description;

    SubBook(short wire, String description) {
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
    public static Optional<SubBook> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(REGULAR_TRADES);
            case 11 -> Optional.of(RFQ_TRADES);
            default -> Optional.empty();
        };
    }
}
