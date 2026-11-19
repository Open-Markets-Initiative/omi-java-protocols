package omi.nasdaq.mrxoptions.spreadtradefeed.itch.v2_1.enums;

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
     * A Complex Order Strategy Message containing the strategy definition will be sent whenever a complex order is added in the system for an underlying.
     */
    COMPLEX_STRATEGY_DIRECTORY_MESSAGE('s', "A Complex Order Strategy Message containing the strategy definition will be sent whenever a complex order is added in the system for an underlying."),

    /**
     * The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market.
     */
    STRATEGY_TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market."),

    /**
     * The Complex Strategy Trade Report message is used to publish real-time trade information for complex strategies.
     */
    COMPLEX_STRATEGY_TRADE_REPORT('R', "The Complex Strategy Trade Report message is used to publish real-time trade information for complex strategies."),

    /**
     * The End of replay Sequence message reflects the sequence number at the time replay of existing messages is complete.
     */
    END_OF_REPLAY_SEQUENCE_MESSAGE('M', "The End of replay Sequence message reflects the sequence number at the time replay of existing messages is complete.");

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
            case 'R' -> Optional.of(COMPLEX_STRATEGY_TRADE_REPORT);
            case 'M' -> Optional.of(END_OF_REPLAY_SEQUENCE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
