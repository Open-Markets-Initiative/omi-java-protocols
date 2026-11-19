package omi.cboe.neoequities.multicastmarketbyprice.pitch.v1_0_13.enums;

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
     * Disseminates information for each symbol. A separate Trading Status message indicates the status of each symbol. If no Trading Status message is received for a symbol, it is assumed to be Suspended.
     */
    INSTRUMENT_DIRECTORY_MESSAGE((short) 96, "Disseminates information for each symbol. A separate Trading Status message indicates the status of each symbol. If no Trading Status message is received for a symbol, it is assumed to be Suspended."),

    /**
     * Indicates the current trading status of a security on the Cboe Canada NEO system. Sequenced Trading Status messages are sent upon system startup for all active securities with Trading Status = S (suspended).
     */
    TRADING_STATUS_MESSAGE((short) 97, "Indicates the current trading status of a security on the Cboe Canada NEO system. Sequenced Trading Status messages are sent upon system startup for all active securities with Trading Status = S (suspended)."),

    /**
     * Provides information about executions of orders not displayed on any Cboe Canada trading book. Trade messages may also provide information about displayed orders that are traded at a price other than their displayed price. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book.
     */
    TRADE_MESSAGE((short) 103, "Provides information about executions of orders not displayed on any Cboe Canada trading book. Trade messages may also provide information about displayed orders that are traded at a price other than their displayed price. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book."),

    /**
     * Sent whenever an execution on Cboe Canada NEO is cancelled. Applications that simply build a Cboe Canada NEO book can ignore Trade Break messages.
     */
    TRADE_BREAK_MESSAGE((short) 104, "Sent whenever an execution on Cboe Canada NEO is cancelled. Applications that simply build a Cboe Canada NEO book can ignore Trade Break messages."),

    /**
     * Sent whenever an execution on Cboe Canada NEO is corrected. Applications that simply build a Cboe Canada NEO book can ignore Trade Correction messages.
     */
    TRADE_CORRECTION_MESSAGE((short) 105, "Sent whenever an execution on Cboe Canada NEO is corrected. Applications that simply build a Cboe Canada NEO book can ignore Trade Correction messages."),

    /**
     * Provides an updated displayed price and size for a single side of a Symbol. Used on NEO-N (market by price book).
     */
    SINGLE_SIDE_UPDATE_MESSAGE((short) 106, "Provides an updated displayed price and size for a single side of a Symbol. Used on NEO-N (market by price book)."),

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
            case 96 -> Optional.of(INSTRUMENT_DIRECTORY_MESSAGE);
            case 97 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 103 -> Optional.of(TRADE_MESSAGE);
            case 104 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 105 -> Optional.of(TRADE_CORRECTION_MESSAGE);
            case 106 -> Optional.of(SINGLE_SIDE_UPDATE_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
