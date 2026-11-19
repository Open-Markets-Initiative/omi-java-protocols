package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * This field indicates the direction of net change field
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NetChangeDirection {

    /**
     * Positive or zero net change
     */
    POSITIVE_OR_ZERO_NET_CHANGE('+', "Positive or zero net change"),

    /**
     * Negative net change
     */
    NEGATIVE_NET_CHANGE('-', "Negative net change"),

    /**
     * No Trade or Unaffected
     */
    NO_TRADE_OR_UNAFFECTED(' ', "No Trade or Unaffected");

    private final char wire;

    private final String description;

    NetChangeDirection(char wire, String description) {
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
    public static Optional<NetChangeDirection> fromWire(char wire) {
        return switch (wire) {
            case '+' -> Optional.of(POSITIVE_OR_ZERO_NET_CHANGE);
            case '-' -> Optional.of(NEGATIVE_NET_CHANGE);
            case ' ' -> Optional.of(NO_TRADE_OR_UNAFFECTED);
            default -> Optional.empty();
        };
    }
}
