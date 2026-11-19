package omi.currenex.currenexforex.esp.cbp.v9.enums;

import java.util.Optional;

/**
 * Subscription Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubscriptionType {

    /**
     * Subscribe
     */
    SUBSCRIBE('0', "Subscribe"),

    /**
     * Unsubscribe
     */
    UNSUBSCRIBE('1', "Unsubscribe"),

    /**
     * Resubscribe
     */
    RESUBSCRIBE('2', "Resubscribe");

    private final char wire;

    private final String description;

    SubscriptionType(char wire, String description) {
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
    public static Optional<SubscriptionType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(SUBSCRIBE);
            case '1' -> Optional.of(UNSUBSCRIBE);
            case '2' -> Optional.of(RESUBSCRIBE);
            default -> Optional.empty();
        };
    }
}
