package omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * A=Matching Engine, M=Manual Trade Entry, U=Trade Modification (user), C=Trade Modification (contra-side user), E=Trade Modification (exchange), B=Trade Bust (exchange)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventSource {

    /**
     * Matching Engine
     */
    MATCHING_ENGINE('A', "Matching Engine"),

    /**
     * Manual Trade Entry
     */
    MANUAL_TRADE_ENTRY('M', "Manual Trade Entry"),

    /**
     * Trade Modification (user)
     */
    TRADE_MODIFICATION_USER('U', "Trade Modification (user)"),

    /**
     * Trade Modification (contra-side user)
     */
    TRADE_MODIFICATION_CONTRA_SIDE_USER('C', "Trade Modification (contra-side user)"),

    /**
     * Trade Modification (exchange)
     */
    TRADE_MODIFICATION_EXCHANGE('E', "Trade Modification (exchange)"),

    /**
     * Trade Bust (exchange)
     */
    TRADE_BUST_EXCHANGE('B', "Trade Bust (exchange)");

    private final char wire;

    private final String description;

    EventSource(char wire, String description) {
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
    public static Optional<EventSource> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(MATCHING_ENGINE);
            case 'M' -> Optional.of(MANUAL_TRADE_ENTRY);
            case 'U' -> Optional.of(TRADE_MODIFICATION_USER);
            case 'C' -> Optional.of(TRADE_MODIFICATION_CONTRA_SIDE_USER);
            case 'E' -> Optional.of(TRADE_MODIFICATION_EXCHANGE);
            case 'B' -> Optional.of(TRADE_BUST_EXCHANGE);
            default -> Optional.empty();
        };
    }
}
