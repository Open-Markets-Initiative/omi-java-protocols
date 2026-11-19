package omi.miax.onyxfutures.depthofmarket.mach.v1_0_b.enums;

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
     * used to publish Anticipated Opening Price Messages for each Simple Instrument and Complex Instrument before the start of trading
     */
    ANTICIPATED_OPENING_PRICE_MESSAGE((short) 5, "used to publish Anticipated Opening Price Messages for each Simple Instrument and Complex Instrument before the start of trading"),

    /**
     * Used to publish a Settlement Price Update and will be disseminated for each Simple Instrument as the Settlement Price is calculated for the Futures Instrument
     */
    SETTLEMENT_PRICE_UPDATE_MESSAGE((short) 6, "Used to publish a Settlement Price Update and will be disseminated for each Simple Instrument as the Settlement Price is calculated for the Futures Instrument"),

    /**
     * Used to publish an Open Interest Update for each Simple Instrument once after the end of the last Trading Session
     */
    OPEN_INTEREST_UPDATE_MESSAGE((short) 7, "Used to publish an Open Interest Update for each Simple Instrument once after the end of the last Trading Session"),

    /**
     * used to publish a Total Volume Update for each Simple Instrument at the end of the last Trading Session
     */
    TOTAL_VOLUME_UPDATE_MESSAGE((short) 8, "used to publish a Total Volume Update for each Simple Instrument at the end of the last Trading Session"),

    /**
     * Used to indicate that the MIAX Futures Onyx book for a Simple or Complex instrument has been cleared of all orders
     */
    INSTRUMENT_CLEAR_MESSAGE((short) 9, "Used to indicate that the MIAX Futures Onyx book for a Simple or Complex instrument has been cleared of all orders"),

    /**
     * Used when an order is added to the MIAX Futures Onyx book
     */
    ADD_ORDER_MESSAGE((short) 10, "Used when an order is added to the MIAX Futures Onyx book"),

    /**
     * Modify Order Message
     */
    MODIFY_ORDER_MESSAGE((short) 11, "Modify Order Message"),

    /**
     * used to indicate that an order has been removed from the MIAX Futures Onyx book
     */
    DELETE_ORDER_MESSAGE((short) 12, "used to indicate that an order has been removed from the MIAX Futures Onyx book"),

    /**
     * Used when a Simple or Complex order on the book executes in whole or in part
     */
    ORDER_EXECUTION_MESSAGE((short) 13, "Used when a Simple or Complex order on the book executes in whole or in part"),

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
            case 5 -> Optional.of(ANTICIPATED_OPENING_PRICE_MESSAGE);
            case 6 -> Optional.of(SETTLEMENT_PRICE_UPDATE_MESSAGE);
            case 7 -> Optional.of(OPEN_INTEREST_UPDATE_MESSAGE);
            case 8 -> Optional.of(TOTAL_VOLUME_UPDATE_MESSAGE);
            case 9 -> Optional.of(INSTRUMENT_CLEAR_MESSAGE);
            case 10 -> Optional.of(ADD_ORDER_MESSAGE);
            case 11 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 12 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 13 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 14 -> Optional.of(TRADE_CANCEL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
