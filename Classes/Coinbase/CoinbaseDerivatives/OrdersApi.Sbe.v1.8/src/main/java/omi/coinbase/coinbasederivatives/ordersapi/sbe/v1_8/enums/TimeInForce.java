package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.enums;

import java.util.Optional;

/**
 * timeInForce
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum TimeInForce {

    /**
     * Good for trading day
     */
    DAY((byte) 0, "Good for trading day"),

    /**
     * Good until the specified date
     */
    GOOD_TILL_DATE((byte) 1, "Good until the specified date"),

    /**
     * timeInForce
     */
    NO_VALUE((byte) -128, "timeInForce");

    private final byte wire;

    private final String description;

    TimeInForce(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<TimeInForce> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(DAY);
            case 1 -> Optional.of(GOOD_TILL_DATE);
            case -128 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
