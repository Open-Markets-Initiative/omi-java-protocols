package omi.nasdaq.phlxoptions.orders.itch.v1_9.enums;

import java.util.Optional;

/**
 * Indicates duration of the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * Day Order
     */
    DAY_ORDER('D', "Day Order"),

    /**
     * Good till cancelled
     */
    GTC('G', "Good till cancelled"),

    /**
     * Immediate or Cancel
     */
    IOC('I', "Immediate or Cancel");

    private final char wire;

    private final String description;

    TimeInForce(char wire, String description) {
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
    public static Optional<TimeInForce> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(DAY_ORDER);
            case 'G' -> Optional.of(GTC);
            case 'I' -> Optional.of(IOC);
            default -> Optional.empty();
        };
    }
}
