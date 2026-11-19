package omi.nasdaq.phlxoptions.orders.itch.v1_9.enums;

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
     * At the start of each trading day, PHLX disseminates directory messages for all symbols trading on the PHLX option system.
     */
    OPTIONS_DIRECTORY_MESSAGE('D', "At the start of each trading day, PHLX disseminates directory messages for all symbols trading on the PHLX option system."),

    /**
     * Whenever a complex order is added in the system for an underlying, the order is normalized and results in either the creation of a new complex strategy or is added to an existing strategy. A Complex Order Strategy Message containing the strategy definition will be sent.
     */
    COMPLEX_ORDER_STRATEGY_MESSAGE('R', "Whenever a complex order is added in the system for an underlying, the order is normalized and results in either the creation of a new complex strategy or is added to an existing strategy. A Complex Order Strategy Message containing the strategy definition will be sent."),

    /**
     * PHLX uses this administrative message to indicate the current trading status of an index or equity option within the PHLX Options Market.
     */
    SECURITY_TRADING_ACTION_MESSAGE('H', "PHLX uses this administrative message to indicate the current trading status of an index or equity option within the PHLX Options Market."),

    /**
     * PHLX uses this administrative message to indicate the current trading status of a strategy within the PHLX Options Market.
     */
    COMPLEX_TRADING_ACTION_MESSAGE('I', "PHLX uses this administrative message to indicate the current trading status of a strategy within the PHLX Options Market."),

    /**
     * PHLX uses this administrative message to indicate when an option has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution.
     */
    SECURITY_OPEN_CLOSED_MESSAGE('P', "PHLX uses this administrative message to indicate when an option has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution."),

    /**
     * PHLX uses this administrative message to indicate when a strategy has completed the opening process or when the strategy has closed and is no longer available for auto execution.
     */
    STRATEGY_OPEN_CLOSED_MESSAGE('Q', "PHLX uses this administrative message to indicate when a strategy has completed the opening process or when the strategy has closed and is no longer available for auto execution."),

    /**
     * When a Single Order is received or any change is made to an order, an Order message containing the current order status will be sent.
     */
    SIMPLE_ORDER_MESSAGE('O', "When a Single Order is received or any change is made to an order, an Order message containing the current order status will be sent."),

    /**
     * When a Complex Order is received or any change is made to a complex order for an underlying, a Complex Order Message containing the order information will be sent.
     */
    COMPLEX_ORDER_MESSAGE('X', "When a Complex Order is received or any change is made to a complex order for an underlying, a Complex Order Message containing the order information will be sent."),

    /**
     * When a symbol goes into an auction, an Auction Notification Message is sent. Also if any auction parameters change during the auction, size for example, a new Auction Notification message will be sent for that symbol.
     */
    AUCTION_NOTIFICATION_MESSAGE('A', "When a symbol goes into an auction, an Auction Notification Message is sent. Also if any auction parameters change during the auction, size for example, a new Auction Notification message will be sent for that symbol."),

    /**
     * When a Complex Order Live Auction (COLA) or PIXL/Solicitation auction starts for a strategy of an underlying, a COLA/PIXL/Solicitation notification message containing the auction information will be sent.
     */
    COMPLEX_AUCTION_NOTIFICATION_MESSAGE('C', "When a Complex Order Live Auction (COLA) or PIXL/Solicitation auction starts for a strategy of an underlying, a COLA/PIXL/Solicitation notification message containing the auction information will be sent.");

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
            case 'D' -> Optional.of(OPTIONS_DIRECTORY_MESSAGE);
            case 'R' -> Optional.of(COMPLEX_ORDER_STRATEGY_MESSAGE);
            case 'H' -> Optional.of(SECURITY_TRADING_ACTION_MESSAGE);
            case 'I' -> Optional.of(COMPLEX_TRADING_ACTION_MESSAGE);
            case 'P' -> Optional.of(SECURITY_OPEN_CLOSED_MESSAGE);
            case 'Q' -> Optional.of(STRATEGY_OPEN_CLOSED_MESSAGE);
            case 'O' -> Optional.of(SIMPLE_ORDER_MESSAGE);
            case 'X' -> Optional.of(COMPLEX_ORDER_MESSAGE);
            case 'A' -> Optional.of(AUCTION_NOTIFICATION_MESSAGE);
            case 'C' -> Optional.of(COMPLEX_AUCTION_NOTIFICATION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
