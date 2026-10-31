package omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * Whenever a complex order is added in the system for an underlying, the order is normalized and results in either the creation of a new complex strategy or is added to an existing strategy. A Complex Strategy Message containing the strategy definition will be sent.
     */
    COMPLEX_STRATEGY_DIRECTORY_MESSAGE('R', "Whenever a complex order is added in the system for an underlying, the order is normalized and results in either the creation of a new complex strategy or is added to an existing strategy. A Complex Strategy Message containing the strategy definition will be sent."),

    /**
     * The options system uses this administrative message to indicate when an strategy has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution.
     */
    STRATEGY_OPEN_CLOSED_MESSAGE('O', "The options system uses this administrative message to indicate when an strategy has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution."),

    /**
     * ISE uses this administrative message to indicate the current trading status of a strategy within the ISE Options Market.
     */
    STRATEGY_TRADING_ACTION_MESSAGE('H', "ISE uses this administrative message to indicate the current trading status of a strategy within the ISE Options Market."),

    /**
     * The options system uses this administrative message to indicate when an strategy has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution.
     */
    STRATEGY_BEST_BID_AND_ASK_UPDATE('C', "The options system uses this administrative message to indicate when an strategy has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution."),

    /**
     * The options system will continuously calculate its best bid position for active strategies on the options market during the trading day. Whenever the best bid position changes on one side but not the other side, the options system will send its best bid update via this feed for the affected security.
     */
    STRATEGY_BEST_BID_UPDATE('D', "The options system will continuously calculate its best bid position for active strategies on the options market during the trading day. Whenever the best bid position changes on one side but not the other side, the options system will send its best bid update via this feed for the affected security."),

    /**
     * The options system will continuously calculate its best offer position for active strategies on the options market during the trading day. Whenever the best ask position changes on one side but not the other side, the options system will send its best ask update via this feed for the affected security
     */
    STRATEGY_BEST_ASK_UPDATE('E', "The options system will continuously calculate its best offer position for active strategies on the options market during the trading day. Whenever the best ask position changes on one side but not the other side, the options system will send its best ask update via this feed for the affected security"),

    /**
     * The ticker message is used to send real time trade information
     */
    COMPLEX_STRATEGY_TICKER_MESSAGE('t', "The ticker message is used to send real time trade information");

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
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'R' -> Optional.of(COMPLEX_STRATEGY_DIRECTORY_MESSAGE);
            case 'O' -> Optional.of(STRATEGY_OPEN_CLOSED_MESSAGE);
            case 'H' -> Optional.of(STRATEGY_TRADING_ACTION_MESSAGE);
            case 'C' -> Optional.of(STRATEGY_BEST_BID_AND_ASK_UPDATE);
            case 'D' -> Optional.of(STRATEGY_BEST_BID_UPDATE);
            case 'E' -> Optional.of(STRATEGY_BEST_ASK_UPDATE);
            case 't' -> Optional.of(COMPLEX_STRATEGY_TICKER_MESSAGE);
            default -> Optional.empty();
        };
    }
}
