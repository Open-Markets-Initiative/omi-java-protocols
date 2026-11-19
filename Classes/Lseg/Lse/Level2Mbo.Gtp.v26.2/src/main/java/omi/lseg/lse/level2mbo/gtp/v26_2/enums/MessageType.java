package omi.lseg.lse.level2mbo.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Sent to indicate the start and end of the day.
     */
    SYSTEM_EVENT_MESSAGE((short) 83, "Sent to indicate the start and end of the day."),

    /**
     * Used to disseminate a common and limited set of data for all configured instrument types, except strategy instruments, on the real-time channels.
     */
    INSTRUMENT_DIRECTORY_MESSAGE((short) 112, "Used to disseminate a common and limited set of data for all configured instrument types, except strategy instruments, on the real-time channels."),

    /**
     * Used to communicate scheduled and unscheduled session changes. When sent in the recovery channel, used to indicate the current trading status of an instrument.
     */
    INSTRUMENT_STATUS_MESSAGE((short) 72, "Used to communicate scheduled and unscheduled session changes. When sent in the recovery channel, used to indicate the current trading status of an instrument."),

    /**
     * Indicates the first order of a given side of an MBO snapshot.
     */
    ADD_ORDER_MBO_MESSAGE((short) 65, "Indicates the first order of a given side of an MBO snapshot."),

    /**
     * Used to indicate individual orders of an MBO snapshot.
     */
    ADD_ORDER_SHORT_MBO_MESSAGE((short) 101, "Used to indicate individual orders of an MBO snapshot."),

    /**
     * Sent to instruct recipients to remove all orders from the order book for the specified instrument.
     */
    ORDER_BOOK_CLEAR_MESSAGE((short) 121, "Sent to instruct recipients to remove all orders from the order book for the specified instrument."),

    /**
     * Sent to indicate trades executed on supported markets.
     */
    TRADE_MESSAGE((short) 80, "Sent to indicate trades executed on supported markets."),

    /**
     * Contains a set of statistics that are updated frequently, usually as a result of executions.
     */
    STATISTICS_MESSAGE((short) 119, "Contains a set of statistics that are updated frequently, usually as a result of executions."),

    /**
     * Contains a set of statistics that are not updated frequently.
     */
    STATISTICS_UPDATE_MESSAGE((short) 106, "Contains a set of statistics that are not updated frequently.");

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
            case 65 -> Optional.of(ADD_ORDER_MBO_MESSAGE);
            case 101 -> Optional.of(ADD_ORDER_SHORT_MBO_MESSAGE);
            case 121 -> Optional.of(ORDER_BOOK_CLEAR_MESSAGE);
            case 80 -> Optional.of(TRADE_MESSAGE);
            case 119 -> Optional.of(STATISTICS_MESSAGE);
            case 106 -> Optional.of(STATISTICS_UPDATE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
