package omi.bruceats.bruceequities.lastsale.itch.v3_3.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The System Event message is used to communicate key market or data feed control events.
     */
    SYSTEM_EVENT_MESSAGE('S', "The System Event message is used to communicate key market or data feed control events."),

    /**
     * At the start of each trading session, Bruce ATS disseminates stock directory messages for all active symbols in its trading system.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading session, Bruce ATS disseminates stock directory messages for all active symbols in its trading system."),

    /**
     * Bruce ATS uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Bruce ATS uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * For all exchange-listed issues, Bruce ATS relays the Reg SHO Short Sale Price Test Restricted Indicator message when it receives an update from the primary listing exchange.
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "For all exchange-listed issues, Bruce ATS relays the Reg SHO Short Sale Price Test Restricted Indicator message when it receives an update from the primary listing exchange."),

    /**
     * BLS will broadcast a real-time update every time that the system produces a trade during the trading day.
     */
    TRADE_REPORT_MESSAGE('T', "BLS will broadcast a real-time update every time that the system produces a trade during the trading day."),

    /**
     * BLS will broadcast a real-time update every time that the system cancels a trade during the trading day.
     */
    TRADE_CANCEL_MESSAGE('X', "BLS will broadcast a real-time update every time that the system cancels a trade during the trading day.");

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
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'Y' -> Optional.of(REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE);
            case 'T' -> Optional.of(TRADE_REPORT_MESSAGE);
            case 'X' -> Optional.of(TRADE_CANCEL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
