package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * This is the message format that will be used to disseminate the “seconds” part of the timestamp that is applicable to all messages that are sent in the current second.
     */
    SYSTEM_TIME_MESSAGE('1', "This is the message format that will be used to disseminate the \u201Cseconds\u201D part of the timestamp that is applicable to all messages that are sent in the current second."),

    /**
     * This is the message format that will be used to disseminate all Option series traded on MIAX for the current session. The product ID sent in this message is what will be disseminated in Top of Market BBO and Last Sale messages.
     */
    SERIES_UPDATE('P', "This is the message format that will be used to disseminate all Option series traded on MIAX for the current session. The product ID sent in this message is what will be disseminated in Top of Market BBO and Last Sale messages."),

    /**
     * This is the message format that will be used to disseminate stock option strategies traded on MIAX for the current session.
     */
    COMPLEX_STRATEGY_DEFINITION_MESSAGE('C', "This is the message format that will be used to disseminate stock option strategies traded on MIAX for the current session."),

    /**
     * This message format is used to notify the firms of the state changes of the system. This is a notification that applies to each Underlying group. Firms can use notifications as triggers in their system to ensure electronic synchronization of systems.
     */
    SYSTEM_STATE_MESSAGE('S', "This message format is used to notify the firms of the state changes of the system. This is a notification that applies to each Underlying group. Firms can use notifications as triggers in their system to ensure electronic synchronization of systems."),

    /**
     * This is the message format that will be used to disseminate each side of the MIAX Complex Top of Market for options with low Net Price and small aggregate MIAX Best Bid or Offer (MBBO) size
     */
    COMPACT_COMPLEX_TOP_OF_MARKET_BID_MESSAGE('b', "This is the message format that will be used to disseminate each side of the MIAX Complex Top of Market for options with low Net Price and small aggregate MIAX Best Bid or Offer (MBBO) size"),

    /**
     * This is the message format that will be used to disseminate each side of the MIAX Top of Market for options with low premiums and small aggregate MIAX Best Bid or Offer (MBBO) size
     */
    COMPACT_COMPLEX_TOP_OF_MARKET_OFFER_MESSAGE('o', "This is the message format that will be used to disseminate each side of the MIAX Top of Market for options with low premiums and small aggregate MIAX Best Bid or Offer (MBBO) size"),

    /**
     * This is the message format that will be used to disseminate MIAX Complex Top of Market for strategies with high net price or large aggregate MIAX Best Bid or Offer (MBBO) size.
     */
    WIDE_COMPLEX_TOP_OF_MARKET_BID_MESSAGE('e', "This is the message format that will be used to disseminate MIAX Complex Top of Market for strategies with high net price or large aggregate MIAX Best Bid or Offer (MBBO) size."),

    /**
     * This is the message format that will be used to disseminate MIAX Complex Top of Market for strategies with high net price or large aggregate MIAX Best Offer (MBBO) size.
     */
    WIDE_COMPLEX_TOP_OF_MARKET_OFFER_MESSAGE('f', "This is the message format that will be used to disseminate MIAX Complex Top of Market for strategies with high net price or large aggregate MIAX Best Offer (MBBO) size."),

    /**
     * This is the message format that will be used to disseminate both sides of the MIAX top of market for strategies (cMBBO) with low net price and small aggregate size.
     */
    COMPACT_COMPLEX_DOUBLE_SIDED_TOP_OF_MARKET_MESSAGE('m', "This is the message format that will be used to disseminate both sides of the MIAX top of market for strategies (cMBBO) with low net price and small aggregate size."),

    /**
     * This is the message format that will be used to disseminate both sides of the MIAX top of market for strategies (cMBBO) with net prices or aggregate sizes which cannot be specified in the compact format.
     */
    WIDE_COMPLEX_DOUBLE_SIDED_TOP_OF_MARKET_MESSAGE('w', "This is the message format that will be used to disseminate both sides of the MIAX top of market for strategies (cMBBO) with net prices or aggregate sizes which cannot be specified in the compact format."),

    /**
     * This is the message format that will be used to disseminate Trades that are resulting from executions on MIAX during the current trading session
     */
    STRATEGY_TRADE_MESSAGE('t', "This is the message format that will be used to disseminate Trades that are resulting from executions on MIAX during the current trading session"),

    /**
     * This message format will be used to notify firms of changes to the trading status of all the options of an underlying
     */
    UNDERLYING_TRADING_STATUS_MESSAGE('H', "This message format will be used to notify firms of changes to the trading status of all the options of an underlying");

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
            case '1' -> Optional.of(SYSTEM_TIME_MESSAGE);
            case 'P' -> Optional.of(SERIES_UPDATE);
            case 'C' -> Optional.of(COMPLEX_STRATEGY_DEFINITION_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_STATE_MESSAGE);
            case 'b' -> Optional.of(COMPACT_COMPLEX_TOP_OF_MARKET_BID_MESSAGE);
            case 'o' -> Optional.of(COMPACT_COMPLEX_TOP_OF_MARKET_OFFER_MESSAGE);
            case 'e' -> Optional.of(WIDE_COMPLEX_TOP_OF_MARKET_BID_MESSAGE);
            case 'f' -> Optional.of(WIDE_COMPLEX_TOP_OF_MARKET_OFFER_MESSAGE);
            case 'm' -> Optional.of(COMPACT_COMPLEX_DOUBLE_SIDED_TOP_OF_MARKET_MESSAGE);
            case 'w' -> Optional.of(WIDE_COMPLEX_DOUBLE_SIDED_TOP_OF_MARKET_MESSAGE);
            case 't' -> Optional.of(STRATEGY_TRADE_MESSAGE);
            case 'H' -> Optional.of(UNDERLYING_TRADING_STATUS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
