package omi.miax.pearloptions.topofmarket.mach.v1_0.enums;

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
     * This is the message format that will be used to disseminate all Option series traded on PEARL for the current session. The product ID sent in this message is what will be disseminated in Top of Market BBO and Last Sale messages.
     */
    SERIES_UPDATE_MESSAGE('P', "This is the message format that will be used to disseminate all Option series traded on PEARL for the current session. The product ID sent in this message is what will be disseminated in Top of Market BBO and Last Sale messages."),

    /**
     * This message format is used to notify the firms of the state changes of the system. This is a notification that applies to each Underlying group. Firms can use notifications as triggers in their system to ensure electronic synchronization of systems.
     */
    SYSTEM_STATE_MESSAGE('S', "This message format is used to notify the firms of the state changes of the system. This is a notification that applies to each Underlying group. Firms can use notifications as triggers in their system to ensure electronic synchronization of systems."),

    /**
     * This is the message format that will be used to disseminate each side of the PEARL Top of Market for options with low premiums and small aggregate PEARL Best Bid or Offer (PBBO) size.
     */
    COMPACT_TOP_OF_MARKET_BID_MESSAGE('B', "This is the message format that will be used to disseminate each side of the PEARL Top of Market for options with low premiums and small aggregate PEARL Best Bid or Offer (PBBO) size."),

    /**
     * This is the message format that will be used to disseminate each side of the PEARL Top of Market for options with low premiums and small aggregate PEARL Best Bid or Offer (PBBO) size.
     */
    COMPACT_TOP_OF_MARKET_BEST_OFFER_MESSAGE('O', "This is the message format that will be used to disseminate each side of the PEARL Top of Market for options with low premiums and small aggregate PEARL Best Bid or Offer (PBBO) size."),

    /**
     * This is the message format that will be used, in the refresh service and during trading hours, to disseminate both sides of the PEARL Top of Market for options with low premiums and small aggregate PEARL Best Bid or Offer (PBBO) size.
     */
    WIDE_TOP_OF_MARKET_BEST_BID_MESSAGE('W', "This is the message format that will be used, in the refresh service and during trading hours, to disseminate both sides of the PEARL Top of Market for options with low premiums and small aggregate PEARL Best Bid or Offer (PBBO) size."),

    /**
     * This is the message format that will be used, in the refresh service and during trading hours, to disseminate both sides of the PEARL Top of Market for options with low premiums and small aggregate PEARL Best Bid or Offer (PBBO) size.
     */
    WIDE_TOP_OF_MARKET_BEST_OFFER_MESSAGE('A', "This is the message format that will be used, in the refresh service and during trading hours, to disseminate both sides of the PEARL Top of Market for options with low premiums and small aggregate PEARL Best Bid or Offer (PBBO) size."),

    /**
     * This is the message format that will be used, in the refresh service and during trading hours, to disseminate both sides of the PEARL Top of Market for options with low premiums and small aggregate PEARL Best Bid or Offer (PBBO) size.
     */
    COMPACT_DOUBLE_SIDED_TOP_OF_MARKET_MESSAGE('d', "This is the message format that will be used, in the refresh service and during trading hours, to disseminate both sides of the PEARL Top of Market for options with low premiums and small aggregate PEARL Best Bid or Offer (PBBO) size."),

    /**
     * This is the message format that will be used, in the refresh service and during trading hours, to disseminate both sides of the PEARL Top of Market for options with high premiums or large aggregate PEARL Best Bid or Offer (PBBO) sizes.
     */
    WIDE_DOUBLE_SIDED_TOP_OF_MARKET_MESSAGE('D', "This is the message format that will be used, in the refresh service and during trading hours, to disseminate both sides of the PEARL Top of Market for options with high premiums or large aggregate PEARL Best Bid or Offer (PBBO) sizes."),

    /**
     * This is the message format that will be used to disseminate Trades that are resulting from executions on PEARL during the current trading session.
     */
    LAST_SALE_MESSAGE('T', "This is the message format that will be used to disseminate Trades that are resulting from executions on PEARL during the current trading session."),

    /**
     * This is the message format that will be used to disseminate canceled Trades that are resulting from Trade cancellations or corrections on PEARL during the current trading session.
     */
    TRADE_CANCEL_MESSAGE('X', "This is the message format that will be used to disseminate canceled Trades that are resulting from Trade cancellations or corrections on PEARL during the current trading session."),

    /**
     * This message format will be used to notify firms of changes to the trading status of all the options of an underlying.
     */
    UNDERLYING_TRADING_STATUS_NOTIFICATION('H', "This message format will be used to notify firms of changes to the trading status of all the options of an underlying.");

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
            case 'P' -> Optional.of(SERIES_UPDATE_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_STATE_MESSAGE);
            case 'B' -> Optional.of(COMPACT_TOP_OF_MARKET_BID_MESSAGE);
            case 'O' -> Optional.of(COMPACT_TOP_OF_MARKET_BEST_OFFER_MESSAGE);
            case 'W' -> Optional.of(WIDE_TOP_OF_MARKET_BEST_BID_MESSAGE);
            case 'A' -> Optional.of(WIDE_TOP_OF_MARKET_BEST_OFFER_MESSAGE);
            case 'd' -> Optional.of(COMPACT_DOUBLE_SIDED_TOP_OF_MARKET_MESSAGE);
            case 'D' -> Optional.of(WIDE_DOUBLE_SIDED_TOP_OF_MARKET_MESSAGE);
            case 'T' -> Optional.of(LAST_SALE_MESSAGE);
            case 'X' -> Optional.of(TRADE_CANCEL_MESSAGE);
            case 'H' -> Optional.of(UNDERLYING_TRADING_STATUS_NOTIFICATION);
            default -> Optional.empty();
        };
    }
}
