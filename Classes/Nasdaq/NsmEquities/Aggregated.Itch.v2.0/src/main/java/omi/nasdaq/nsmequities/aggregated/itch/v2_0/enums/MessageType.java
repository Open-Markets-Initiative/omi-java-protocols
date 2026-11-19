package omi.nasdaq.nsmequities.aggregated.itch.v2_0.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Signal a market or data feed handler event
     */
    SYSTEM_EVENT_MESSAGE('S', "Signal a market or data feed handler event"),

    /**
     * Disseminates stock directory information for all active symbols in the Nasdaq execution system
     */
    STOCK_DIRECTORY_MESSAGE('R', "Disseminates stock directory information for all active symbols in the Nasdaq execution system"),

    /**
     * Indicates the current trading status of a security to the trading community
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Indicates the current trading status of a security to the trading community"),

    /**
     * Indicates the Reg SHO Short Sale Price Test Restriction status for a security
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "Indicates the Reg SHO Short Sale Price Test Restriction status for a security"),

    /**
     * Provides the Primary Market Maker status, Market Maker mode and Market Participant state for each Nasdaq market participant firm registered in an issue
     */
    MARKET_PARTICIPANT_POSITION_MESSAGE('P', "Provides the Primary Market Maker status, Market Maker mode and Market Participant state for each Nasdaq market participant firm registered in an issue"),

    /**
     * Informs data recipients what the daily MWCB breach points are set to for the current trading day
     */
    MWCB_DECLINE_LEVEL_MESSAGE('V', "Informs data recipients what the daily MWCB breach points are set to for the current trading day"),

    /**
     * Informs data recipients when a MWCB has breached one of the established levels
     */
    MWCB_STATUS_MESSAGE('W', "Informs data recipients when a MWCB has breached one of the established levels"),

    /**
     * Indicates the anticipated IPO quotation release time of a security
     */
    IPO_QUOTING_PERIOD_UPDATE_MESSAGE('K', "Indicates the anticipated IPO quotation release time of a security"),

    /**
     * Indicates the auction collar thresholds within which a paused security can reopen following a LULD Trading Pause
     */
    LULD_AUCTION_COLLAR_MESSAGE('J', "Indicates the auction collar thresholds within which a paused security can reopen following a LULD Trading Pause"),

    /**
     * Indicates the current Operational Status of a security specific to the designated Market Center
     */
    OPERATIONAL_HALT_MESSAGE('h', "Indicates the current Operational Status of a security specific to the designated Market Center"),

    /**
     * Disseminated whenever the aggregated position at a price level changes
     */
    PRICE_LEVEL_UPDATE_MESSAGE('U', "Disseminated whenever the aggregated position at a price level changes"),

    /**
     * Net Order Imbalance Indicator disseminated for Opening, Closing, Halt/IPO/Pause, and Extended Trading Close crosses
     */
    NET_ORDER_IMBALANCE_INDICATOR_MESSAGE('I', "Net Order Imbalance Indicator disseminated for Opening, Closing, Halt/IPO/Pause, and Extended Trading Close crosses"),

    /**
     * Identifies a retail interest indication of the Bid, Ask or both for Nasdaq-listed securities
     */
    RETAIL_PRICE_IMPROVEMENT_INDICATOR_MESSAGE('N', "Identifies a retail interest indication of the Bid, Ask or both for Nasdaq-listed securities"),

    /**
     * Disseminated only for Direct Listing with Capital Raise securities once per second after the DLCR volatility test has successfully passed
     */
    DIRECT_LISTING_WITH_CAPITAL_RAISE_PRICE_DISCOVERY_MESSAGE('O', "Disseminated only for Direct Listing with Capital Raise securities once per second after the DLCR volatility test has successfully passed");

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
            case 'P' -> Optional.of(MARKET_PARTICIPANT_POSITION_MESSAGE);
            case 'V' -> Optional.of(MWCB_DECLINE_LEVEL_MESSAGE);
            case 'W' -> Optional.of(MWCB_STATUS_MESSAGE);
            case 'K' -> Optional.of(IPO_QUOTING_PERIOD_UPDATE_MESSAGE);
            case 'J' -> Optional.of(LULD_AUCTION_COLLAR_MESSAGE);
            case 'h' -> Optional.of(OPERATIONAL_HALT_MESSAGE);
            case 'U' -> Optional.of(PRICE_LEVEL_UPDATE_MESSAGE);
            case 'I' -> Optional.of(NET_ORDER_IMBALANCE_INDICATOR_MESSAGE);
            case 'N' -> Optional.of(RETAIL_PRICE_IMPROVEMENT_INDICATOR_MESSAGE);
            case 'O' -> Optional.of(DIRECT_LISTING_WITH_CAPITAL_RAISE_PRICE_DISCOVERY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
