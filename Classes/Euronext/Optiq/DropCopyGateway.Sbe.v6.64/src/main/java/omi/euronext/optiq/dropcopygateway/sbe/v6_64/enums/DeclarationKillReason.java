package omi.euronext.optiq.dropcopygateway.sbe.v6_64.enums;

import java.util.Optional;

/**
 * declarationKillReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum DeclarationKillReason {

    /**
     * Canceled_by_Entering_Firm
     */
    CANCELEDBY_ENTERING_FIRM((short) 1, "Canceled_by_Entering_Firm"),

    /**
     * Refused_by_Counterpart
     */
    REFUSEDBY_COUNTERPART((short) 2, "Refused_by_Counterpart"),

    /**
     * Canceled_by_MO
     */
    CANCELEDBY_MO((short) 3, "Canceled_by_MO"),

    /**
     * Expired
     */
    EXPIRED((short) 4, "Expired"),

    /**
     * Eliminated_by_the_System
     */
    ELIMINATEDBYTHE_SYSTEM((short) 5, "Eliminated_by_the_System"),

    /**
     * Cancelled_Upon_CSD_request
     */
    CANCELLED_UPON_CS_DREQUEST((short) 6, "Cancelled_Upon_CSD_request");

    private final short wire;

    private final String description;

    DeclarationKillReason(short wire, String description) {
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
    public static Optional<DeclarationKillReason> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CANCELEDBY_ENTERING_FIRM);
            case 2 -> Optional.of(REFUSEDBY_COUNTERPART);
            case 3 -> Optional.of(CANCELEDBY_MO);
            case 4 -> Optional.of(EXPIRED);
            case 5 -> Optional.of(ELIMINATEDBYTHE_SYSTEM);
            case 6 -> Optional.of(CANCELLED_UPON_CS_DREQUEST);
            default -> Optional.empty();
        };
    }
}
