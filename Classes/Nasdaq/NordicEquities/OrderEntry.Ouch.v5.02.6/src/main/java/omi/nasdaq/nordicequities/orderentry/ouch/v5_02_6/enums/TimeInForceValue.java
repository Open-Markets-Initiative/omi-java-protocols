package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.enums;

import java.util.Optional;

/**
 * How long the order remains live
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForceValue {

    /**
     * Day
     */
    DAY('0', "Day"),

    /**
     * Gtc Good Till Cancelled
     */
    GTC_GOOD_TILL_CANCELLED('1', "Gtc Good Till Cancelled"),

    /**
     * Ioc Immediate Or Cancel
     */
    IOC_IMMEDIATE_OR_CANCEL('3', "Ioc Immediate Or Cancel"),

    /**
     * Gtt Good Till Time
     */
    GTT_GOOD_TILL_TIME('6', "Gtt Good Till Time"),

    /**
     * Gfa Good For Auction
     */
    GFA_GOOD_FOR_AUCTION('B', "Gfa Good For Auction");

    private final char wire;

    private final String description;

    TimeInForceValue(char wire, String description) {
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
    public static Optional<TimeInForceValue> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(DAY);
            case '1' -> Optional.of(GTC_GOOD_TILL_CANCELLED);
            case '3' -> Optional.of(IOC_IMMEDIATE_OR_CANCEL);
            case '6' -> Optional.of(GTT_GOOD_TILL_TIME);
            case 'B' -> Optional.of(GFA_GOOD_FOR_AUCTION);
            default -> Optional.empty();
        };
    }
}
