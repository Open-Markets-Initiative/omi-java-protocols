package omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.enums;

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
     * The following message is used to relay PSX execution system transactions that are reported for the current business day. Please note that PSX only reports one-side of a trade execution on the PSX Last Sale (PLS) feed and other data feed products.
     */
    TRADE_REPORT_MESSAGE('T', "The following message is used to relay PSX execution system transactions that are reported for the current business day. Please note that PSX only reports one-side of a trade execution on the PSX Last Sale (PLS) feed and other data feed products."),

    /**
     * The following message is used to relay PSX execution system and TRF trade transactions for Exchange Traded Managed Funds (NextShares) that are reported for the current business day.
     */
    NEXT_SHARES_TRADE_REPORT_MESSAGE('M', "The following message is used to relay PSX execution system and TRF trade transactions for Exchange Traded Managed Funds (NextShares) that are reported for the current business day."),

    /**
     * The following message is used in the event that a PSX trade transaction is cancelled on the same business day that it is reported
     */
    TRADE_CANCEL_ERROR_MESSAGE('X', "The following message is used in the event that a PSX trade transaction is cancelled on the same business day that it is reported"),

    /**
     * The following message is used in the event that a Nasdaq or TRF trade transaction for an NextShares is cancelled on the same business day that it is reported.
     */
    TRADE_CANCEL_ERROR_FOR_NEXT_SHARES_MESSAGE('O', "The following message is used in the event that a Nasdaq or TRF trade transaction for an NextShares is cancelled on the same business day that it is reported."),

    /**
     * The following message is used in the event that a TRF trade transaction is corrected on the same business day that it is reported.
     */
    TRADE_CORRECTION_MESSAGE('C', "The following message is used in the event that a TRF trade transaction is corrected on the same business day that it is reported."),

    /**
     * The following message is used in the event that a TRF trade transaction for a NextShares is corrected on the same business day that it is reported.
     */
    TRADE_CORRECTION_FOR_NEXT_SHARES_MESSAGE('Z', "The following message is used in the event that a TRF trade transaction for a NextShares is corrected on the same business day that it is reported."),

    /**
     * PSX uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    TRADING_ACTION_MESSAGE('H', "PSX uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * For Nasdaq-listed issues, Nasdaq supports a full pre-opening spin of Reg SHO Short Sale Price Test Restricted Indicator messages indicating the Rule 201 status for all active issues. Nasdaq also sends the Reg SHO Short Sale Price Test Restricted Indicator message in the event of an intraday status change. For other exchange-listed issues, Nasdaq relays the Reg SHO Short Sale Price Test Restricted Indicator message when it receives an update from the primary listing exchange.
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "For Nasdaq-listed issues, Nasdaq supports a full pre-opening spin of Reg SHO Short Sale Price Test Restricted Indicator messages indicating the Rule 201 status for all active issues. Nasdaq also sends the Reg SHO Short Sale Price Test Restricted Indicator message in the event of an intraday status change. For other exchange-listed issues, Nasdaq relays the Reg SHO Short Sale Price Test Restricted Indicator message when it receives an update from the primary listing exchange."),

    /**
     * At the start of each trading day, PSX disseminates stock directory messages for all active symbols in the PSX system
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, PSX disseminates stock directory messages for all active symbols in the PSX system"),

    /**
     * Informs data recipients what the daily MWCB breach points are set to for the current trading day.
     */
    MWCB_DECLINE_LEVEL_MESSAGE('V', "Informs data recipients what the daily MWCB breach points are set to for the current trading day."),

    /**
     * Informs data recipients when a MWCB has breached one of the established levels
     */
    MWCB_BREACH_MESSAGE('W', "Informs data recipients when a MWCB has breached one of the established levels"),

    /**
     * Nasdaq uses this administrative message to indicate the current trading status of the three market centers operated by Nasdaq.
     */
    OPERATIONAL_HALT_MESSAGE('h', "Nasdaq uses this administrative message to indicate the current trading status of the three market centers operated by Nasdaq.");

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
            case 'M' -> Optional.of(NEXT_SHARES_TRADE_REPORT_MESSAGE);
            case 'X' -> Optional.of(TRADE_CANCEL_ERROR_MESSAGE);
            case 'O' -> Optional.of(TRADE_CANCEL_ERROR_FOR_NEXT_SHARES_MESSAGE);
            case 'C' -> Optional.of(TRADE_CORRECTION_MESSAGE);
            case 'Z' -> Optional.of(TRADE_CORRECTION_FOR_NEXT_SHARES_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'Y' -> Optional.of(REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'V' -> Optional.of(MWCB_DECLINE_LEVEL_MESSAGE);
            case 'W' -> Optional.of(MWCB_BREACH_MESSAGE);
            case 'h' -> Optional.of(OPERATIONAL_HALT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
