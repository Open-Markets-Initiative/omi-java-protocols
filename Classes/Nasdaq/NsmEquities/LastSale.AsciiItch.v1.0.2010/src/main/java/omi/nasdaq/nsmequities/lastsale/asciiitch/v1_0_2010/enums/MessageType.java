package omi.nasdaq.nsmequities.lastsale.asciiitch.v1_0_2010.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * System Event Messages is used to signal key market or data feed control events.
     */
    SYSTEM_EVENT_MESSAGE('S', "System Event Messages is used to signal key market or data feed control events."),

    /**
     * The following message is used to relay NASDAQ execution system and TRF trade transactions that are reported for the current business day. Please note that NASDAQ only reports one-side of a trade execution on the NASDAQ Last Sale (NLS) feed and other data feed products.
     */
    TRADE_REPORT_MESSAGE('T', "The following message is used to relay NASDAQ execution system and TRF trade transactions that are reported for the current business day. Please note that NASDAQ only reports one-side of a trade execution on the NASDAQ Last Sale (NLS) feed and other data feed products."),

    /**
     * The following message is used in the event that a NASDAQ or TRF trade transaction is cancelled on the same business day that it is reported.
     */
    TRADE_CANCEL_ERROR_MESSAGE('X', "The following message is used in the event that a NASDAQ or TRF trade transaction is cancelled on the same business day that it is reported."),

    /**
     * The following message is used in the event that a TRF trade transaction is corrected on the same business day that it is reported.
     */
    TRADE_CORRECTION_MESSAGE('C', "The following message is used in the event that a TRF trade transaction is corrected on the same business day that it is reported."),

    /**
     * NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * At the start of each trading day, NASDAQ disseminates stock directory messages for all active symbols in the NASDAQ system.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, NASDAQ disseminates stock directory messages for all active symbols in the NASDAQ system.");

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
            case 'T' -> Optional.of(TRADE_REPORT_MESSAGE);
            case 'X' -> Optional.of(TRADE_CANCEL_ERROR_MESSAGE);
            case 'C' -> Optional.of(TRADE_CORRECTION_MESSAGE);
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
