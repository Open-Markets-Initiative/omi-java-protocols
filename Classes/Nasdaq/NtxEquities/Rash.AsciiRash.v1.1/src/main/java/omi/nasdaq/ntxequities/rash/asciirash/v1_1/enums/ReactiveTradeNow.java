package omi.nasdaq.ntxequities.rash.asciirash.v1_1.enums;

import java.util.Optional;

/**
 * Indicates if the order is a reactive trade now order (optional field).
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReactiveTradeNow {

    /**
     * Reactive Trade Now
     */
    REACTIVE_TRADE_NOW('B', "Reactive Trade Now"),

    /**
     * Not a Reactive Trade Now order
     */
    NOT_A_REACTIVE_TRADE_NOW('N', "Not a Reactive Trade Now order");

    private final char wire;

    private final String description;

    ReactiveTradeNow(char wire, String description) {
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
    public static Optional<ReactiveTradeNow> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(REACTIVE_TRADE_NOW);
            case 'N' -> Optional.of(NOT_A_REACTIVE_TRADE_NOW);
            default -> Optional.empty();
        };
    }
}
