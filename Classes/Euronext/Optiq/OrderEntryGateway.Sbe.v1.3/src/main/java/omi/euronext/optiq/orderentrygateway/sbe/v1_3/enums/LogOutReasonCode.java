package omi.euronext.optiq.orderentrygateway.sbe.v1_3.enums;

import java.util.Optional;

/**
 * logOutReasonCode
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LogOutReasonCode {

    /**
     * Regular_Logout
     */
    REGULAR_LOGOUT((short) 0, "Regular_Logout"),

    /**
     * End_Of_Day
     */
    END_OF_DAY((short) 1, "End_Of_Day"),

    /**
     * Too_many_unknown_messages
     */
    TOOMANYUNKNOWNMESSAGES((short) 2, "Too_many_unknown_messages"),

    /**
     * Excessive_Number_of_Messages
     */
    EXCESSIVE_NUMBEROF_MESSAGES((short) 3, "Excessive_Number_of_Messages"),

    /**
     * Excessive_Amount_of_Data_in_Bytes
     */
    EXCESSIVE_AMOUNTOF_DATAIN_BYTES((short) 4, "Excessive_Amount_of_Data_in_Bytes"),

    /**
     * Excessive_Number_of_Messages_Amount_of_Data_in_Bytes
     */
    EXCESSIVE_NUMBEROF_MESSAGES_AMOUNTOF_DATAIN_BYTES((short) 5, "Excessive_Number_of_Messages_Amount_of_Data_in_Bytes");

    private final short wire;

    private final String description;

    LogOutReasonCode(short wire, String description) {
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
    public static Optional<LogOutReasonCode> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(REGULAR_LOGOUT);
            case 1 -> Optional.of(END_OF_DAY);
            case 2 -> Optional.of(TOOMANYUNKNOWNMESSAGES);
            case 3 -> Optional.of(EXCESSIVE_NUMBEROF_MESSAGES);
            case 4 -> Optional.of(EXCESSIVE_AMOUNTOF_DATAIN_BYTES);
            case 5 -> Optional.of(EXCESSIVE_NUMBEROF_MESSAGES_AMOUNTOF_DATAIN_BYTES);
            default -> Optional.empty();
        };
    }
}
