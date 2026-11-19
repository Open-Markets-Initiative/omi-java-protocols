package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * 0 = Day; 3 = Immediate or Cancel; 6 = Good Till Date (GTD), must be used with ExpireTime; 8 = Stream Or Kill (SOK), CXD PureStream only; P = Post-Only Order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * Day
     */
    DAY('0', "Day"),

    /**
     * Immediate or Cancel. As much of the order as possible must be executed immediately. Any part of the order that is not executed immediately gets canceled.
     */
    IMMEDIATE_OR_CANCEL('3', "Immediate or Cancel. As much of the order as possible must be executed immediately. Any part of the order that is not executed immediately gets canceled."),

    /**
     * Good Till Date (GTD). Date must be today's trading date. This field must be used in conjunction with ExpireTime.
     */
    GOOD_TILL_DATE('6', "Good Till Date (GTD). Date must be today's trading date. This field must be used in conjunction with ExpireTime."),

    /**
     * Stream Or Kill (SOK). Order is paired in a stream immediately or is cancelled. (CXD PureStream only)
     */
    STREAM_OR_KILL('8', "Stream Or Kill (SOK). Order is paired in a stream immediately or is cancelled. (CXD PureStream only)"),

    /**
     * Post-Only Order
     */
    POST_ONLY_ORDER('P', "Post-Only Order");

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
            case '3' -> Optional.of(IMMEDIATE_OR_CANCEL);
            case '6' -> Optional.of(GOOD_TILL_DATE);
            case '8' -> Optional.of(STREAM_OR_KILL);
            case 'P' -> Optional.of(POST_ONLY_ORDER);
            default -> Optional.empty();
        };
    }
}
