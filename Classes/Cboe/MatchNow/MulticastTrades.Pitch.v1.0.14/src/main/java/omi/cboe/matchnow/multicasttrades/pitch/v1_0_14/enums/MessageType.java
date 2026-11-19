package omi.cboe.matchnow.multicasttrades.pitch.v1_0_14.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Instructs feed recipients to clear all orders for the Cboe Canada order book in the unit specified in the Sequenced Unit Header. Distributed in rare recovery events such as a data center fail-over.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "Instructs feed recipients to clear all orders for the Cboe Canada order book in the unit specified in the Sequenced Unit Header. Distributed in rare recovery events such as a data center fail-over."),

    /**
     * Indicates the current trading status of a security in the MATCHNow system (9:30 a.m. - 4:00 p.m. ET). Sequenced Trading Status messages are sent upon system startup for all active securities with Trading Status = S (suspended).
     */
    TRADING_STATUS_MESSAGE((short) 67, "Indicates the current trading status of a security in the MATCHNow system (9:30 a.m. - 4:00 p.m. ET). Sequenced Trading Status messages are sent upon system startup for all active securities with Trading Status = S (suspended)."),

    /**
     * Sends the trade price, trade quantity, execution id, and trade condition of a trade as well as the cumulative volume for the trading session. A Trade message will be sent for each execution, but not every Trade message indicates a trade. Trade Condition = X (Trade Break) is sent whenever an execution is broken.
     */
    TRADE_MESSAGE((short) 66, "Sends the trade price, trade quantity, execution id, and trade condition of a trade as well as the cumulative volume for the trading session. A Trade message will be sent for each execution, but not every Trade message indicates a trade. Trade Condition = X (Trade Break) is sent whenever an execution is broken."),

    /**
     * Sent for each unit when the unit shuts down. No additional sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.
     */
    END_OF_SESSION_MESSAGE((short) 45, "Sent for each unit when the unit shuts down. No additional sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.");

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
            case 151 -> Optional.of(UNIT_CLEAR_MESSAGE);
            case 67 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 66 -> Optional.of(TRADE_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
