package omi.lseg.tradeecho.level2incremental.gtp.v26_1_2.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Broadcast at the start and end of day on TRADEcho. Customers should consider the SI Quote book to be empty following receipt of this message; no explicit Order Book Clear or delete order messages will be sent
     */
    SYSTEM_EVENT_MESSAGE((short) 83, "Broadcast at the start and end of day on TRADEcho. Customers should consider the SI Quote book to be empty following receipt of this message; no explicit Order Book Clear or delete order messages will be sent"),

    /**
     * Used to disseminate a limited set of data for all configured instrument types on the real-time channels
     */
    INSTRUMENT_DIRECTORY_MESSAGE((short) 112, "Used to disseminate a limited set of data for all configured instrument types on the real-time channels"),

    /**
     * Used to communicate status of an instrument. Instrument status messages are disseminated prior to system event start of day message
     */
    INSTRUMENT_STATUS_MESSAGE((short) 72, "Used to communicate status of an instrument. Instrument status messages are disseminated prior to system event start of day message"),

    /**
     * Sent to instruct recipients to delete a quote
     */
    DELETE_ORDER_MESSAGE((short) 68, "Sent to instruct recipients to delete a quote"),

    /**
     * Sent to instruct recipients to remove all quotes from the book for the specified instrument
     */
    ORDER_BOOK_CLEAR_MESSAGE((short) 121, "Sent to instruct recipients to remove all quotes from the book for the specified instrument"),

    /**
     * Publishing Systematic Internaliser (SI) Quotes
     */
    SI_QUOTE_MESSAGE((short) 71, "Publishing Systematic Internaliser (SI) Quotes");

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
            case 83 -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 112 -> Optional.of(INSTRUMENT_DIRECTORY_MESSAGE);
            case 72 -> Optional.of(INSTRUMENT_STATUS_MESSAGE);
            case 68 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 121 -> Optional.of(ORDER_BOOK_CLEAR_MESSAGE);
            case 71 -> Optional.of(SI_QUOTE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
