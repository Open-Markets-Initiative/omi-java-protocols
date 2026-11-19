package omi.bme.bmeequities.orderentry.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * GTD orders are not supported
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * 0 = Day
     */
    DAY('0', "0 = Day"),

    /**
     * 3 = Immediate or Cancel (IOC)
     */
    IMMEDIATE_OR_CANCEL_IOC('3', "3 = Immediate or Cancel (IOC)"),

    /**
     * 4 = Fill or Kill (FOK)
     */
    FILL_OR_KILL_FOK('4', "4 = Fill or Kill (FOK)"),

    /**
     * 7 = At-the-close (ATC)
     */
    AT_THE_CLOSE_ATC('7', "7 = At-the-close (ATC)");

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
            case '0' -> Optional.of(DAY);
            case '3' -> Optional.of(IMMEDIATE_OR_CANCEL_IOC);
            case '4' -> Optional.of(FILL_OR_KILL_FOK);
            case '7' -> Optional.of(AT_THE_CLOSE_ATC);
            default -> Optional.empty();
        };
    }
}
