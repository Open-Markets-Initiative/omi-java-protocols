package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * RFQ side
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RfqSide {

    /**
     * RFQ side
     */
    NO_VALUE((short) 255, "RFQ side"),

    /**
     * Buy
     */
    BUY((short) 1, "Buy"),

    /**
     * Sell
     */
    SELL((short) 2, "Sell"),

    /**
     * Cross
     */
    CROSS((short) 8, "Cross");

    private final short wire;

    private final String description;

    RfqSide(short wire, String description) {
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
    public static Optional<RfqSide> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 1 -> Optional.of(BUY);
            case 2 -> Optional.of(SELL);
            case 8 -> Optional.of(CROSS);
            default -> Optional.empty();
        };
    }
}
