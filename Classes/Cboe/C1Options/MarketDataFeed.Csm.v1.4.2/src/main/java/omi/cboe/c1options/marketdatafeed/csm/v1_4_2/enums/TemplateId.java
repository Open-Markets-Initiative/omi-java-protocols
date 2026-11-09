package omi.cboe.c1options.marketdatafeed.csm.v1_4_2.enums;

import java.util.Optional;

/**
 * The Template ID is for decoding the message.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * Security definitions describe an exchange’s products by name and trading parameters and associates those products with a product security ID.
     */
    SECURITY_DEFINITION_MESSAGE((short) 13, "Security definitions describe an exchange\u2019s products by name and trading parameters and associates those products with a product security ID."),

    /**
     * The Current Market Refresh message contains a snapshot of the current market information for one security along with the quantities and volume types for that particular security.
     */
    CURRENT_MARKET_REFRESH_MESSAGE((short) 11, "The Current Market Refresh message contains a snapshot of the current market information for one security along with the quantities and volume types for that particular security."),

    /**
     * The Market Data Refresh message contains a snapshot / refresh of the Current Market and Recap information (Last Sale, Last Sale Size, Open, High, Low, Previous Close Price) for one product.
     */
    MARKET_DATA_REFRESH_MESSAGE((short) 20, "The Market Data Refresh message contains a snapshot / refresh of the Current Market and Recap information (Last Sale, Last Sale Size, Open, High, Low, Previous Close Price) for one product."),

    /**
     * The Current Market Update message contains real-time top of book market updates for a security.
     */
    CURRENT_MARKET_UPDATE_MESSAGE((short) 12, "The Current Market Update message contains real-time top of book market updates for a security."),

    /**
     * The Recap Update message contains the latest Last Sale price, Last Sale size, Total Volume, Open price, High price, Low price, and Previous close price. It is sent as a result of a trade or cancel.
     */
    RECAP_UPDATE_MESSAGE((short) 21, "The Recap Update message contains the latest Last Sale price, Last Sale size, Total Volume, Open price, High price, Low price, and Previous close price. It is sent as a result of a trade or cancel."),

    /**
     * A Ticker message indicates that a trade or cancel has occurred.
     */
    TICKER_MESSAGE((short) 14, "A Ticker message indicates that a trade or cancel has occurred."),

    /**
     * The EOP message contains expected opening price and size information for a security.
     */
    EXPECTED_OPENING_PRICE_AND_SIZE_MESSAGE((short) 15, "The EOP message contains expected opening price and size information for a security."),

    /**
     * Index value messages contain the values associated with a calculated index. They are transmitted when an index is calculated.
     */
    INDEX_VALUE_MESSAGE((short) 22, "Index value messages contain the values associated with a calculated index. They are transmitted when an index is calculated."),

    /**
     * Index value messages contain the values associated with a calculated index. They are transmitted when an index is calculated.
     */
    SETTLEMENT_VALUE_MESSAGE((short) 23, "Index value messages contain the values associated with a calculated index. They are transmitted when an index is calculated."),

    /**
     * Summary messages contain the end of session market data for each product.
     */
    SUMMARY_MESSAGE((short) 24, "Summary messages contain the end of session market data for each product."),

    /**
     * Market Data Control messages mark the start and end of the end of session Summary and the end of session Settlement data transmissions.
     */
    MARKET_DATA_CONTROL_MESSAGE((short) 25, "Market Data Control messages mark the start and end of the end of session Summary and the end of session Settlement data transmissions."),

    /**
     * This message contains only a standard header. The heartbeat will repeat at a regular interval
     */
    HEARTBEAT_MESSAGE((short) 16, "This message contains only a standard header. The heartbeat will repeat at a regular interval");

    private final short wire;

    private final String description;

    TemplateId(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<TemplateId> fromWire(short wire) {
        return switch (wire) {
            case 13 -> Optional.of(SECURITY_DEFINITION_MESSAGE);
            case 11 -> Optional.of(CURRENT_MARKET_REFRESH_MESSAGE);
            case 20 -> Optional.of(MARKET_DATA_REFRESH_MESSAGE);
            case 12 -> Optional.of(CURRENT_MARKET_UPDATE_MESSAGE);
            case 21 -> Optional.of(RECAP_UPDATE_MESSAGE);
            case 14 -> Optional.of(TICKER_MESSAGE);
            case 15 -> Optional.of(EXPECTED_OPENING_PRICE_AND_SIZE_MESSAGE);
            case 22 -> Optional.of(INDEX_VALUE_MESSAGE);
            case 23 -> Optional.of(SETTLEMENT_VALUE_MESSAGE);
            case 24 -> Optional.of(SUMMARY_MESSAGE);
            case 25 -> Optional.of(MARKET_DATA_CONTROL_MESSAGE);
            case 16 -> Optional.of(HEARTBEAT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
