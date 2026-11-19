package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * The reason for this order being restated (printed as Reason)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RestateReason {

    /**
     * Stream On
     */
    STREAM_ON('O', "Stream On"),

    /**
     * Stream Off
     */
    STREAM_OFF('X', "Stream Off"),

    /**
     * Conditional order firm-up request
     */
    CONDITIONAL_ORDER_FIRM_UP_REQUEST('R', "Conditional order firm-up request");

    private final char wire;

    private final String description;

    RestateReason(char wire, String description) {
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
    public static Optional<RestateReason> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(STREAM_ON);
            case 'X' -> Optional.of(STREAM_OFF);
            case 'R' -> Optional.of(CONDITIONAL_ORDER_FIRM_UP_REQUEST);
            default -> Optional.empty();
        };
    }
}
