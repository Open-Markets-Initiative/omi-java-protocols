package omi.biva.bivaequities.lastsale.itch.v1_12.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Itch timestamp, number of seconds since midnight of the system start
     */
    TIME_STAMP_SECONDS_MESSAGE('T', "Itch timestamp, number of seconds since midnight of the system start"),

    /**
     * System event message
     */
    SYSTEM_EVENT_MESSAGE('S', "System event message"),

    /**
     * Orderbook price tick table
     */
    PRICE_TICK_SIZE_MESSAGE('L', "Orderbook price tick table"),

    /**
     * Orderbook quantity tick table
     */
    QUANTITY_TICK_SIZE_MESSAGE('M', "Orderbook quantity tick table"),

    /**
     * Orderbook directory
     */
    ORDERBOOK_DIRECTORY_MESSAGE('R', "Orderbook directory"),

    /**
     * Participant directory
     */
    PARTICIPANT_DIRECTORY_MESSAGE('F', "Participant directory"),

    /**
     * Trading action message
     */
    ORDERBOOK_TRADING_ACTION_MESSAGE('H', "Trading action message"),

    /**
     * Trade message
     */
    TRADE_MESSAGE('P', "Trade message"),

    /**
     * Orderbook reference price message
     */
    ORDERBOOK_REFERENCE_PRICE_MESSAGE('X', "Orderbook reference price message");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(TIME_STAMP_SECONDS_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'L' -> Optional.of(PRICE_TICK_SIZE_MESSAGE);
            case 'M' -> Optional.of(QUANTITY_TICK_SIZE_MESSAGE);
            case 'R' -> Optional.of(ORDERBOOK_DIRECTORY_MESSAGE);
            case 'F' -> Optional.of(PARTICIPANT_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(ORDERBOOK_TRADING_ACTION_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'X' -> Optional.of(ORDERBOOK_REFERENCE_PRICE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
