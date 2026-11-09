package omi.miax.onyxfutures.topofmarket.mach.v1_0_b.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * used to disseminate all Simple Instruments traded on MIAX FuturesOnyx for the current trading session
     */
    SIMPLE_INSTRUMENT_DEFINITION_MESSAGE((short) 1, "used to disseminate all Simple Instruments traded on MIAX FuturesOnyx for the current trading session"),

    /**
     * Used to disseminate all Complex Instruments traded on MIAX Futures Onyx for the current trading session
     */
    COMPLEX_INSTRUMENT_DEFINITION_MESSAGE((short) 2, "Used to disseminate all Complex Instruments traded on MIAX Futures Onyx for the current trading session"),

    /**
     * System State Message
     */
    SYSTEM_STATE_MESSAGE((short) 3, "System State Message"),

    /**
     * Used to notify firms of changes to the trading status of a particular Simple or Complex instrument
     */
    INSTRUMENT_TRADING_STATUS_NOTIFICATION_MESSAGE((short) 4, "Used to notify firms of changes to the trading status of a particular Simple or Complex instrument"),

    /**
     * used to publish MIAX Futures Onyx Best Bid and Offer (MBBO) of a Simple Instrument or Complex Instrument
     */
    BEST_BID_AND_OFFER_MESSAGE((short) 15, "used to publish MIAX Futures Onyx Best Bid and Offer (MBBO) of a Simple Instrument or Complex Instrument"),

    /**
     * used to disseminate trades that are resulting from executions on MIAX Futures Onyx during the current trading session
     */
    LAST_SALE_MESSAGE((short) 16, "used to disseminate trades that are resulting from executions on MIAX Futures Onyx during the current trading session"),

    /**
     * used to publish cancellation of a Simple Instrument trade which was previously published via an Order Execution Message
     */
    TRADE_CANCEL_MESSAGE((short) 14, "used to publish cancellation of a Simple Instrument trade which was previously published via an Order Execution Message");

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
            case 2 -> Optional.of(COMPLEX_INSTRUMENT_DEFINITION_MESSAGE);
            case 3 -> Optional.of(SYSTEM_STATE_MESSAGE);
            case 4 -> Optional.of(INSTRUMENT_TRADING_STATUS_NOTIFICATION_MESSAGE);
            case 15 -> Optional.of(BEST_BID_AND_OFFER_MESSAGE);
            case 16 -> Optional.of(LAST_SALE_MESSAGE);
            case 14 -> Optional.of(TRADE_CANCEL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
