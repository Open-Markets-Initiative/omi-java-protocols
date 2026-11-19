package omi.miax.onyxfutures.topofmarket.mach.v1_3_a.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Simple Instrument Definition
     */
    SIMPLE_INSTRUMENT_DEFINITION_MESSAGE((short) 1, "Simple Instrument Definition"),

    /**
     * Complex Instrument Definition
     */
    COMPLEX_INSTRUMENT_DEFINITION_MESSAGE((short) 17, "Complex Instrument Definition"),

    /**
     * Complex Instrument Definition (deprecated)
     */
    COMPLEX_INSTRUMENT_DEFINITION_DEPRECATED_MESSAGE((short) 2, "Complex Instrument Definition (deprecated)"),

    /**
     * System State
     */
    SYSTEM_STATE_MESSAGE((short) 3, "System State"),

    /**
     * Instrument Trading Status Notification
     */
    INSTRUMENT_TRADING_STATUS_NOTIFICATION_MESSAGE((short) 4, "Instrument Trading Status Notification"),

    /**
     * Top of Market (Best Bid and Offer) Message
     */
    BEST_BID_AND_OFFER_MESSAGE((short) 15, "Top of Market (Best Bid and Offer) Message"),

    /**
     * Last Sale (Trade) Message
     */
    LAST_SALE_MESSAGE((short) 16, "Last Sale (Trade) Message"),

    /**
     * Trade Cancel Message
     */
    TRADE_CANCEL_MESSAGE((short) 14, "Trade Cancel Message");

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
            case 1 -> Optional.of(SIMPLE_INSTRUMENT_DEFINITION_MESSAGE);
            case 17 -> Optional.of(COMPLEX_INSTRUMENT_DEFINITION_MESSAGE);
            case 2 -> Optional.of(COMPLEX_INSTRUMENT_DEFINITION_DEPRECATED_MESSAGE);
            case 3 -> Optional.of(SYSTEM_STATE_MESSAGE);
            case 4 -> Optional.of(INSTRUMENT_TRADING_STATUS_NOTIFICATION_MESSAGE);
            case 15 -> Optional.of(BEST_BID_AND_OFFER_MESSAGE);
            case 16 -> Optional.of(LAST_SALE_MESSAGE);
            case 14 -> Optional.of(TRADE_CANCEL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
