package omi.currenex.currenexforex.esp.cbp.v9.enums;

import java.util.Optional;

/**
 * The type of message being sent
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * A MP initiates a session by submitting a Logon message to Currenex
     */
    LOGON('A', "A MP initiates a session by submitting a Logon message to Currenex"),

    /**
     * Currenex or a MP can terminate a session by sending a Logout message
     */
    LOGOUT('B', "Currenex or a MP can terminate a session by sending a Logout message"),

    /**
     * To ensure session integrity, Currenex sends a heartbeat message every fifteen seconds
     */
    HEARTBEAT('C', "To ensure session integrity, Currenex sends a heartbeat message every fifteen seconds"),

    /**
     * Included in the InstrumentInfo message is the InstrumentType, a free form instrument definition, and the InstrumentIndex used to request quotes and manage price updates
     */
    INSTRUMENT_INFO('D', "Included in the InstrumentInfo message is the InstrumentType, a free form instrument definition, and the InstrumentIndex used to request quotes and manage price updates"),

    /**
     * A MP should respond to each received InstrumentInfo message with an InstrumentInfoAck message
     */
    INSTRUMENT_INFO_ACK('E', "A MP should respond to each received InstrumentInfo message with an InstrumentInfoAck message"),

    /**
     * Currenex will stream ESP messages to a MP once it receives a SubscriptionRequest message for the pair
     */
    SUBSCRIPTION_REQUEST('F', "Currenex will stream ESP messages to a MP once it receives a SubscriptionRequest message for the pair"),

    /**
     * Currenex responds to a SubscriptionRequest with a SubscriptionReply message
     */
    SUBSCRIPTION_REPLY('G', "Currenex responds to a SubscriptionRequest with a SubscriptionReply message"),

    /**
     * Price Message
     */
    PRICE_MESSAGE('H', "Price Message"),

    /**
     * Price Cancel
     */
    PRICE_CANCEL_MESSAGE('I', "Price Cancel"),

    /**
     * A MP can subscribe to TradeTicker messages by setting SubscribeToTicker=0 in the SubscriptionRequest message
     */
    TRADE_TICKER_MESSAGE('J', "A MP can subscribe to TradeTicker messages by setting SubscribeToTicker=0 in the SubscriptionRequest message"),

    /**
     * Included in the InstrumentInfo message is the InstrumentType, a free form instrument definition, and the InstrumentIndex used to request quotes and manage price updates
     */
    REJECT_MESSAGE('K', "Included in the InstrumentInfo message is the InstrumentType, a free form instrument definition, and the InstrumentIndex used to request quotes and manage price updates");

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
            case 'A' -> Optional.of(LOGON);
            case 'B' -> Optional.of(LOGOUT);
            case 'C' -> Optional.of(HEARTBEAT);
            case 'D' -> Optional.of(INSTRUMENT_INFO);
            case 'E' -> Optional.of(INSTRUMENT_INFO_ACK);
            case 'F' -> Optional.of(SUBSCRIPTION_REQUEST);
            case 'G' -> Optional.of(SUBSCRIPTION_REPLY);
            case 'H' -> Optional.of(PRICE_MESSAGE);
            case 'I' -> Optional.of(PRICE_CANCEL_MESSAGE);
            case 'J' -> Optional.of(TRADE_TICKER_MESSAGE);
            case 'K' -> Optional.of(REJECT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
