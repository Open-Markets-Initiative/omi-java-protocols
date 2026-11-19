package omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Clear Quote message instructs feed recipients to clear all quotes and ADAP information for the specified symbol
     */
    CLEAR_QUOTE_MESSAGE((short) 162, "The Clear Quote message instructs feed recipients to clear all quotes and ADAP information for the specified symbol"),

    /**
     * The Cboe Market Status message is disseminated to reflect a change in the status of the market
     */
    CBOE_MARKET_STATUS_MESSAGE((short) 166, "The Cboe Market Status message is disseminated to reflect a change in the status of the market"),

    /**
     * Each ADAP message delivers one or more updates for a Symbol's ADAP book.
     */
    ADAP_MESSAGE((short) 167, "Each ADAP message delivers one or more updates for a Symbol's ADAP book."),

    /**
     * RPI Message
     */
    RPI_MESSAGE((short) 168, "RPI Message"),

    /**
     * Trade Message
     */
    TRADE_MESSAGE((short) 169, "Trade Message"),

    /**
     * Trade Break Message
     */
    TRADE_BREAK_MESSAGE((short) 170, "Trade Break Message"),

    /**
     * Trading Status Message
     */
    TRADING_STATUS_MESSAGE((short) 171, "Trading Status Message");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 162 -> Optional.of(CLEAR_QUOTE_MESSAGE);
            case 166 -> Optional.of(CBOE_MARKET_STATUS_MESSAGE);
            case 167 -> Optional.of(ADAP_MESSAGE);
            case 168 -> Optional.of(RPI_MESSAGE);
            case 169 -> Optional.of(TRADE_MESSAGE);
            case 170 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 171 -> Optional.of(TRADING_STATUS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
