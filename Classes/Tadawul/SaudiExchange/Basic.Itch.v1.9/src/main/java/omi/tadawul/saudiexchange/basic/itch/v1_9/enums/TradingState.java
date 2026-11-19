package omi.tadawul.saudiexchange.basic.itch.v1_9.enums;

import java.util.Optional;

/**
 * Current trading state for orderbook.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingState {

    /**
     * Suspended
     */
    SUSPENDED('V', "Suspended"),

    /**
     * Not Suspended Active
     */
    NOT_SUSPENDED_ACTIVE('T', "Not Suspended Active");

    private final char wire;

    private final String description;

    TradingState(char wire, String description) {
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
    public static Optional<TradingState> fromWire(char wire) {
        return switch (wire) {
            case 'V' -> Optional.of(SUSPENDED);
            case 'T' -> Optional.of(NOT_SUSPENDED_ACTIVE);
            default -> Optional.empty();
        };
    }
}
