package omi.lseg.turquoise.mifid2posttrade.gtp.v26_3.enums;

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
     * Used to disseminate a common and limited set of data for all configured instrument types, except strategy instruments, on the real-time channels
     */
    INSTRUMENT_DIRECTORY_MESSAGE((short) 112, "Used to disseminate a common and limited set of data for all configured instrument types, except strategy instruments, on the real-time channels"),

    /**
     * Used to communicate scheduled and unscheduled session changes
     */
    INSTRUMENT_STATUS_MESSAGE((short) 72, "Used to communicate scheduled and unscheduled session changes"),

    /**
     * Sent to represent different types of MiFID compliant trades published by markets
     */
    MIFID_II_TRADE_MESSAGE((short) 81, "Sent to represent different types of MiFID compliant trades published by markets"),

    /**
     * Sent to indicate a MiFID compliant cross trade
     */
    MIFID_II_TRADE_CROSS_MESSAGE((short) 86, "Sent to indicate a MiFID compliant cross trade");

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
            case 81 -> Optional.of(MIFID_II_TRADE_MESSAGE);
            case 86 -> Optional.of(MIFID_II_TRADE_CROSS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
