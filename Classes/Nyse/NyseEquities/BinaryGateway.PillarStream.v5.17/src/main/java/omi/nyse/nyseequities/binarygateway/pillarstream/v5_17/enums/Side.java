package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Side
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Side {

    /**
     * no change in Side
     */
    NO_CHANGE_IN_SIDE((short) 0, "no change in Side"),

    /**
     * buy
     */
    BUY((short) 1, "buy"),

    /**
     * sell
     */
    SELL((short) 2, "sell"),

    /**
     * sell short
     */
    SELL_SHORT((short) 3, "sell short"),

    /**
     * sell short exempt
     */
    SELL_SHORT_EXEMPT((short) 4, "sell short exempt"),

    /**
     * cross
     */
    CROSS((short) 5, "cross"),

    /**
     * cross short
     */
    CROSS_SHORT((short) 6, "cross short"),

    /**
     * cross short exempt
     */
    CROSS_SHORT_EXEMPT((short) 7, "cross short exempt");

    private final short wire;

    private final String description;

    Side(short wire, String description) {
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
    public static Optional<Side> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_CHANGE_IN_SIDE);
            case 1 -> Optional.of(BUY);
            case 2 -> Optional.of(SELL);
            case 3 -> Optional.of(SELL_SHORT);
            case 4 -> Optional.of(SELL_SHORT_EXEMPT);
            case 5 -> Optional.of(CROSS);
            case 6 -> Optional.of(CROSS_SHORT);
            case 7 -> Optional.of(CROSS_SHORT_EXEMPT);
            default -> Optional.empty();
        };
    }
}
