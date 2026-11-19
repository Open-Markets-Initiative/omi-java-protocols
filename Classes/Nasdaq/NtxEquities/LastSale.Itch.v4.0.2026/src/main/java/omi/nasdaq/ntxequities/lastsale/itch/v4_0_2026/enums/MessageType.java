package omi.nasdaq.ntxequities.lastsale.itch.v4_0_2026.enums;

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
     * The following message is used to relay trade transactions that are reported for the current business day. Please note that Nasdaq only reports one-side of a trade execution on the Last Sale feeds.
     */
    TRADE_REPORT_MESSAGE('e', "The following message is used to relay trade transactions that are reported for the current business day. Please note that Nasdaq only reports one-side of a trade execution on the Last Sale feeds."),

    /**
     * The following message is used in the event that a transaction is cancelled on the same business day that it is reported.
     */
    TRADE_CANCEL_ERROR_MESSAGE('o', "The following message is used in the event that a transaction is cancelled on the same business day that it is reported."),

    /**
     * The following message is used in the event that a trade transaction is corrected on the same business day that it is reported.
     */
    TRADE_CORRECTION_MESSAGE('b', "The following message is used in the event that a trade transaction is corrected on the same business day that it is reported."),

    /**
     * Nasdaq uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Nasdaq uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * Nasdaq processes orders based on the most Reg SHO Restriction status value.
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "Nasdaq processes orders based on the most Reg SHO Restriction status value."),

    /**
     * At the start of each trading day, Nasdaq disseminates stock directory messages for all active Nasdaq and non Nasdaq listed security symbols.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, Nasdaq disseminates stock directory messages for all active Nasdaq and non Nasdaq listed security symbols."),

    /**
     * Informs data recipients what the daily MWCB breach points are set to for the current trading day.
     */
    MWCB_DECLINE_LEVEL_MESSAGE('V', "Informs data recipients what the daily MWCB breach points are set to for the current trading day."),

    /**
     * Informs data recipients when a MWCB has breached one of the established levels.
     */
    MWCB_STATUS_MESSAGE('W', "Informs data recipients when a MWCB has breached one of the established levels."),

    /**
     * An Operational Halt means that there has been an interruption of service on the identified security impacting only the designated Market Center.
     */
    OPERATIONAL_HALT_MESSAGE('h', "An Operational Halt means that there has been an interruption of service on the identified security impacting only the designated Market Center.");

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
            case 'e' -> Optional.of(TRADE_REPORT_MESSAGE);
            case 'o' -> Optional.of(TRADE_CANCEL_ERROR_MESSAGE);
            case 'b' -> Optional.of(TRADE_CORRECTION_MESSAGE);
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'Y' -> Optional.of(REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'V' -> Optional.of(MWCB_DECLINE_LEVEL_MESSAGE);
            case 'W' -> Optional.of(MWCB_STATUS_MESSAGE);
            case 'h' -> Optional.of(OPERATIONAL_HALT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
