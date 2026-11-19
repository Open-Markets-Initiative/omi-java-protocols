package omi.eurex.t7.xti.fbe.v9_1.enums;

import java.util.Optional;

/**
 * Defines the EventType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EventType {

    /**
     * Redemption
     */
    REDEMPTION((short) 26, "Redemption"),

    /**
     * Delisting
     */
    DELISTING((short) 100, "Delisting"),

    /**
     * Instrument assignment added
     */
    INSTRUMENT_ASSIGNMENT_ADDED((short) 104, "Instrument assignment added"),

    /**
     * Instrument assignment removed
     */
    INSTRUMENT_ASSIGNMENT_REMOVED((short) 105, "Instrument assignment removed"),

    /**
     * Instrument state Closed
     */
    CLOSED((short) 106, "Instrument state Closed"),

    /**
     * Instrument state Restricted
     */
    RESTRICTED((short) 107, "Instrument state Restricted"),

    /**
     * Instrument state Book
     */
    BOOK((short) 108, "Instrument state Book"),

    /**
     * Instrument state Continuous
     */
    CONTINUOUS((short) 109, "Instrument state Continuous"),

    /**
     * Instrument state Auction
     */
    AUCTION((short) 110, "Instrument state Auction"),

    /**
     * Instrument state Freeze
     */
    FREEZE((short) 111, "Instrument state Freeze"),

    /**
     * Cancel instrument state Freeze
     */
    CANCEL_FREEZE((short) 112, "Cancel instrument state Freeze"),

    /**
     * Instrument state Pre Call
     */
    PRE_CALL((short) 113, "Instrument state Pre Call"),

    /**
     * End of Restatement
     */
    ENDOF_RESTATEMENT((short) 114, "End of Restatement"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    EventType(short wire, String description) {
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
    public static Optional<EventType> fromWire(short wire) {
        return switch (wire) {
            case 26 -> Optional.of(REDEMPTION);
            case 100 -> Optional.of(DELISTING);
            case 104 -> Optional.of(INSTRUMENT_ASSIGNMENT_ADDED);
            case 105 -> Optional.of(INSTRUMENT_ASSIGNMENT_REMOVED);
            case 106 -> Optional.of(CLOSED);
            case 107 -> Optional.of(RESTRICTED);
            case 108 -> Optional.of(BOOK);
            case 109 -> Optional.of(CONTINUOUS);
            case 110 -> Optional.of(AUCTION);
            case 111 -> Optional.of(FREEZE);
            case 112 -> Optional.of(CANCEL_FREEZE);
            case 113 -> Optional.of(PRE_CALL);
            case 114 -> Optional.of(ENDOF_RESTATEMENT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
