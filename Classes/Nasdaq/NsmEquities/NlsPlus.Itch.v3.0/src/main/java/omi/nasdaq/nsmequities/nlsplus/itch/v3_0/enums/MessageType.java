package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

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
     * Relays Nasdaq execution system and Trf trade transactions reported for the current business day. Nasdaq reports only one side of a trade execution on the Nls Plus feed.
     */
    TRADE_REPORT_MESSAGE('T', "Relays Nasdaq execution system and Trf trade transactions reported for the current business day. Nasdaq reports only one side of a trade execution on the Nls Plus feed."),

    /**
     * Trade Report carrying an eight byte trade price, used when the price breaches the maximum value the four byte form can carry.
     */
    LONG_FORM_TRADE_REPORT_MESSAGE('t', "Trade Report carrying an eight byte trade price, used when the price breaches the maximum value the four byte form can carry."),

    /**
     * Relays trade transactions for NextShares exchange traded managed funds, reported as a proxy price with the Nav offset to apply to it.
     */
    NEXT_SHARES_TRADE_REPORT_MESSAGE('M', "Relays trade transactions for NextShares exchange traded managed funds, reported as a proxy price with the Nav offset to apply to it."),

    /**
     * Indicates that a previously reported trade transaction has been cancelled or was reported in error.
     */
    TRADE_CANCEL_ERROR_MESSAGE('X', "Indicates that a previously reported trade transaction has been cancelled or was reported in error."),

    /**
     * Trade Cancel/Error carrying an eight byte original trade price.
     */
    LONG_FORM_TRADE_CANCEL_ERROR_MESSAGE('x', "Trade Cancel/Error carrying an eight byte original trade price."),

    /**
     * Indicates that a previously reported NextShares trade transaction has been cancelled or was reported in error.
     */
    NEXT_SHARES_TRADE_CANCEL_ERROR_MESSAGE('O', "Indicates that a previously reported NextShares trade transaction has been cancelled or was reported in error."),

    /**
     * Indicates that a previously reported trade transaction has been corrected, carrying both the original and the corrected transaction.
     */
    TRADE_CORRECTION_MESSAGE('C', "Indicates that a previously reported trade transaction has been corrected, carrying both the original and the corrected transaction."),

    /**
     * Trade Correction carrying eight byte original and corrected trade prices.
     */
    LONG_FORM_TRADE_CORRECTION_MESSAGE('c', "Trade Correction carrying eight byte original and corrected trade prices."),

    /**
     * Indicates that a previously reported NextShares trade transaction has been corrected.
     */
    NEXT_SHARES_TRADE_CORRECTION_MESSAGE('Z', "Indicates that a previously reported NextShares trade transaction has been corrected."),

    /**
     * Indicates the current trading status of a security to the trading community. Clients should initialize all securities as halted at the start of the session.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Indicates the current trading status of a security to the trading community. Clients should initialize all securities as halted at the start of the session."),

    /**
     * Identifies the securities eligible for the trading session, disseminated at the start of each day.
     */
    STOCK_DIRECTORY_MESSAGE('R', "Identifies the securities eligible for the trading session, disseminated at the start of each day."),

    /**
     * Indicates the Reg Sho short sale price test restriction status for an issue, under Rule 201 of Regulation Sho.
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "Indicates the Reg Sho short sale price test restriction status for an issue, under Rule 201 of Regulation Sho."),

    /**
     * Denotes the adjusted previous close price to be used for intraday net change calculations.
     */
    ADJUSTED_CLOSING_PRICE_MESSAGE('G', "Denotes the adjusted previous close price to be used for intraday net change calculations."),

    /**
     * Adjusted Closing Price carrying an eight byte price.
     */
    LONG_FORM_ADJUSTED_CLOSING_PRICE_MESSAGE('g', "Adjusted Closing Price carrying an eight byte price."),

    /**
     * Summarises the consolidated trading activity for an issue at the end of the trading day.
     */
    END_OF_DAY_TRADE_SUMMARY_MESSAGE('J', "Summarises the consolidated trading activity for an issue at the end of the trading day."),

    /**
     * End of Day Trade Summary carrying eight byte prices.
     */
    LONG_FORM_END_OF_DAY_TRADE_SUMMARY_MESSAGE('j', "End of Day Trade Summary carrying eight byte prices."),

    /**
     * Summarises the consolidated trading activity for a NextShares issue, each price paired with the Nav offset to apply to it.
     */
    NEXT_SHARES_END_OF_DAY_TRADE_SUMMARY_MESSAGE('N', "Summarises the consolidated trading activity for a NextShares issue, each price paired with the Nav offset to apply to it."),

    /**
     * Denotes the reference price to be used for intraday net change calculations for an issue.
     */
    IPO_INFORMATION_MESSAGE('I', "Denotes the reference price to be used for intraday net change calculations for an issue."),

    /**
     * Informs the market of the daily market wide circuit breaker decline levels, disseminated at the start of the trading day.
     */
    MWCB_DECLINE_LEVEL_MESSAGE('V', "Informs the market of the daily market wide circuit breaker decline levels, disseminated at the start of the trading day."),

    /**
     * Informs the market that a market wide circuit breaker decline level has been breached.
     */
    MWCB_STATUS_MESSAGE('W', "Informs the market that a market wide circuit breaker decline level has been breached."),

    /**
     * Indicates the anticipated Ipo quotation release time of a security.
     */
    IPO_QUOTING_PERIOD_UPDATE_MESSAGE('K', "Indicates the anticipated Ipo quotation release time of a security."),

    /**
     * Indicates the current operational status of a security to the trading community. An operational halt is specific to the market centre for which it is declared and does not interrupt trading of the instrument on any other market place.
     */
    OPERATIONAL_HALT_MESSAGE('h', "Indicates the current operational status of a security to the trading community. An operational halt is specific to the market centre for which it is declared and does not interrupt trading of the instrument on any other market place.");

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
            case 't' -> Optional.of(LONG_FORM_TRADE_REPORT_MESSAGE);
            case 'M' -> Optional.of(NEXT_SHARES_TRADE_REPORT_MESSAGE);
            case 'X' -> Optional.of(TRADE_CANCEL_ERROR_MESSAGE);
            case 'x' -> Optional.of(LONG_FORM_TRADE_CANCEL_ERROR_MESSAGE);
            case 'O' -> Optional.of(NEXT_SHARES_TRADE_CANCEL_ERROR_MESSAGE);
            case 'C' -> Optional.of(TRADE_CORRECTION_MESSAGE);
            case 'c' -> Optional.of(LONG_FORM_TRADE_CORRECTION_MESSAGE);
            case 'Z' -> Optional.of(NEXT_SHARES_TRADE_CORRECTION_MESSAGE);
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'Y' -> Optional.of(REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE);
            case 'G' -> Optional.of(ADJUSTED_CLOSING_PRICE_MESSAGE);
            case 'g' -> Optional.of(LONG_FORM_ADJUSTED_CLOSING_PRICE_MESSAGE);
            case 'J' -> Optional.of(END_OF_DAY_TRADE_SUMMARY_MESSAGE);
            case 'j' -> Optional.of(LONG_FORM_END_OF_DAY_TRADE_SUMMARY_MESSAGE);
            case 'N' -> Optional.of(NEXT_SHARES_END_OF_DAY_TRADE_SUMMARY_MESSAGE);
            case 'I' -> Optional.of(IPO_INFORMATION_MESSAGE);
            case 'V' -> Optional.of(MWCB_DECLINE_LEVEL_MESSAGE);
            case 'W' -> Optional.of(MWCB_STATUS_MESSAGE);
            case 'K' -> Optional.of(IPO_QUOTING_PERIOD_UPDATE_MESSAGE);
            case 'h' -> Optional.of(OPERATIONAL_HALT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
