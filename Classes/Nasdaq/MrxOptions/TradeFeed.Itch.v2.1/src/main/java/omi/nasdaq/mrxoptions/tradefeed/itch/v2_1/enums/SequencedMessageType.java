package omi.nasdaq.mrxoptions.tradefeed.itch.v2_1.enums;

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
     * Derivative Directory Message for active options symbols.
     */
    DERIVATIVE_DIRECTORY_MESSAGE('m', "Derivative Directory Message for active options symbols."),

    /**
     * The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market.
     */
    TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market."),

    /**
     * The Trade Report message will be used to relay execution system transactions that are reported during the current business day.
     */
    TRADE_MESSAGE('R', "The Trade Report message will be used to relay execution system transactions that are reported during the current business day."),

    /**
     * The Broken Trade Report message is used in the event that an options trade transaction is broken on the same business day that it is reported.
     */
    BROKEN_TRADE_REPORT_MESSAGE('X', "The Broken Trade Report message is used in the event that an options trade transaction is broken on the same business day that it is reported."),

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
            case 'm' -> Optional.of(DERIVATIVE_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'R' -> Optional.of(TRADE_MESSAGE);
            case 'X' -> Optional.of(BROKEN_TRADE_REPORT_MESSAGE);
            case 'M' -> Optional.of(END_OF_REPLAY_SEQUENCE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
