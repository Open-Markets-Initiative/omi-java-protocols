package omi.miax.pearlequities.topofmarket.mach.v1_1_c.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * This is the message format that will be used to disseminate the "seconds" part of the timestamp that is applicable to all messages that are sent in the current second.
     */
    SYSTEM_TIME_MESSAGE((short) 49, "This is the message format that will be used to disseminate the \"seconds\" part of the timestamp that is applicable to all messages that are sent in the current second."),

    /**
     * This is the message format that will be used to disseminate all security symbols traded on MIAX Pearl Equities for the current trading session. The Symbol ID sent in this message will be disseminated in Top of Market and Last Sale messages.
     */
    SYMBOL_UPDATE_MESSAGE((short) 1, "This is the message format that will be used to disseminate all security symbols traded on MIAX Pearl Equities for the current trading session. The Symbol ID sent in this message will be disseminated in Top of Market and Last Sale messages."),

    /**
     * This is the message format that will be used to notify firms of the state changes of the system. This is a notification that applies to all symbols on the feed.
     */
    SYSTEM_STATE_MESSAGE((short) 83, "This is the message format that will be used to notify firms of the state changes of the system. This is a notification that applies to all symbols on the feed."),

    /**
     * This is the message format that will be used to notify firms of changes to the trading status of a particular security.
     */
    SECURITY_TRADING_STATUS_NOTIFICATION_MESSAGE((short) 4, "This is the message format that will be used to notify firms of changes to the trading status of a particular security."),

    /**
     * This is the message format that will be used to publish MIAX Pearl Best Bid and Offer (MPBBO) of a security with MPBBO values that can fit in this compact format. In the compact format both bid and offer prices have 2 decimal places and are limited to a maximum value of $655.35. Bid and Offer sizes are limited to 65,535 shares.
     */
    COMPACT_TOP_OF_MARKET_BEST_BID_AND_OFFER_MESSAGE((short) 2, "This is the message format that will be used to publish MIAX Pearl Best Bid and Offer (MPBBO) of a security with MPBBO values that can fit in this compact format. In the compact format both bid and offer prices have 2 decimal places and are limited to a maximum value of $655.35. Bid and Offer sizes are limited to 65,535 shares."),

    /**
     * This is the message format that will be used to publish MIAX Pearl Best Bid and Offer (MPBBO) of a security with MPBBO values that will not fit in the compact format.
     */
    WIDE_TOP_OF_MARKET_BEST_BID_AND_OFFER_MESSAGE((short) 3, "This is the message format that will be used to publish MIAX Pearl Best Bid and Offer (MPBBO) of a security with MPBBO values that will not fit in the compact format."),

    /**
     * This is the message format that will be used to disseminate Trades that are resulting from executions on MIAX Pearl Equities during the current trading session. It includes a Trade ID that is unique to the trade across the exchange for the trading day. Trade corrections will also be disseminated using the same message format.
     */
    LAST_SALE_MESSAGE((short) 10, "This is the message format that will be used to disseminate Trades that are resulting from executions on MIAX Pearl Equities during the current trading session. It includes a Trade ID that is unique to the trade across the exchange for the trading day. Trade corrections will also be disseminated using the same message format."),

    /**
     * This is the message format that will be used to disseminate cancelled trades that are resulting from Trade Cancellations on MIAX Pearl Equities during the current trading session.
     */
    TRADE_CANCEL_MESSAGE((short) 11, "This is the message format that will be used to disseminate cancelled trades that are resulting from Trade Cancellations on MIAX Pearl Equities during the current trading session.");

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
            case 49 -> Optional.of(SYSTEM_TIME_MESSAGE);
            case 1 -> Optional.of(SYMBOL_UPDATE_MESSAGE);
            case 83 -> Optional.of(SYSTEM_STATE_MESSAGE);
            case 4 -> Optional.of(SECURITY_TRADING_STATUS_NOTIFICATION_MESSAGE);
            case 2 -> Optional.of(COMPACT_TOP_OF_MARKET_BEST_BID_AND_OFFER_MESSAGE);
            case 3 -> Optional.of(WIDE_TOP_OF_MARKET_BEST_BID_AND_OFFER_MESSAGE);
            case 10 -> Optional.of(LAST_SALE_MESSAGE);
            case 11 -> Optional.of(TRADE_CANCEL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
