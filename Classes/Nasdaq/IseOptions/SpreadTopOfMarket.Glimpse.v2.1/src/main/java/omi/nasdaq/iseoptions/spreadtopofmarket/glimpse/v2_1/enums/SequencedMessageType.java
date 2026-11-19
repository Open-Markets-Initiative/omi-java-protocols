package omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_1.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * A Complex Strategy Directory Message containing the strategy definition will be sent whenever a complex order is added in the system.
     */
    COMPLEX_STRATEGY_DIRECTORY_MESSAGE('s', "A Complex Strategy Directory Message containing the strategy definition will be sent whenever a complex order is added in the system."),

    /**
     * The options system uses this administrative message to indicate the current trading status of a strategy within the options market.
     */
    STRATEGY_TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of a strategy within the options market."),

    /**
     * Whenever the best bid and ask position changes on both sides, the options system will send its best bid and ask update via the data feed for the affected strategy.
     */
    STRATEGY_BEST_BID_AND_ASK_UPDATE_MESSAGE('E', "Whenever the best bid and ask position changes on both sides, the options system will send its best bid and ask update via the data feed for the affected strategy."),

    /**
     * Whenever the best bid position changes but not the other side, the options system will send its best bid update via this feed for the affected strategy.
     */
    STRATEGY_BEST_BID_UPDATE_MESSAGE('c', "Whenever the best bid position changes but not the other side, the options system will send its best bid update via this feed for the affected strategy."),

    /**
     * Whenever the best ask position changes but not the other side, the options system will send its best ask update via this feed for the affected strategy.
     */
    STRATEGY_BEST_ASK_UPDATE_MESSAGE('d', "Whenever the best ask position changes but not the other side, the options system will send its best ask update via this feed for the affected strategy."),

    /**
     * The Snapshot message reflects the Top of Market Spread Feed sequence number at the time the GLIMPSE spin was requested.
     */
    SNAPSHOT_MESSAGE('M', "The Snapshot message reflects the Top of Market Spread Feed sequence number at the time the GLIMPSE spin was requested.");

    private final char wire;

    private final String description;

    SequencedMessageType(char wire, String description) {
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
    public static Optional<SequencedMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 's' -> Optional.of(COMPLEX_STRATEGY_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STRATEGY_TRADING_ACTION_MESSAGE);
            case 'E' -> Optional.of(STRATEGY_BEST_BID_AND_ASK_UPDATE_MESSAGE);
            case 'c' -> Optional.of(STRATEGY_BEST_BID_UPDATE_MESSAGE);
            case 'd' -> Optional.of(STRATEGY_BEST_ASK_UPDATE_MESSAGE);
            case 'M' -> Optional.of(SNAPSHOT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
