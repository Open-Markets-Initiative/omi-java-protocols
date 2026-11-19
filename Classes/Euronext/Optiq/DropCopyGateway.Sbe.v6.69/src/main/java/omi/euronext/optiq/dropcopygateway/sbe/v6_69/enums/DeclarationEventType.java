package omi.euronext.optiq.dropcopygateway.sbe.v6_69.enums;

import java.util.Optional;

/**
 * declarationEventType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum DeclarationEventType {

    /**
     * New
     */
    NEW((short) 1, "New"),

    /**
     * Confirmed
     */
    CONFIRMED((short) 2, "Confirmed"),

    /**
     * Canceled
     */
    CANCELED((short) 3, "Canceled"),

    /**
     * Matched
     */
    MATCHED((short) 4, "Matched"),

    /**
     * Rejected
     */
    REJECTED((short) 5, "Rejected"),

    /**
     * Refused
     */
    REFUSED((short) 6, "Refused"),

    /**
     * Expired
     */
    EXPIRED((short) 7, "Expired"),

    /**
     * Eliminated_by_the_System
     */
    ELIMINATEDBYTHE_SYSTEM((short) 8, "Eliminated_by_the_System"),

    /**
     * Declaration_Created_by_MO
     */
    DECLARATION_CREATEDBY_MO((short) 9, "Declaration_Created_by_MO"),

    /**
     * Cancelled_Upon_CSD_request
     */
    CANCELLED_UPON_CS_DREQUEST((short) 10, "Cancelled_Upon_CSD_request");

    private final short wire;

    private final String description;

    DeclarationEventType(short wire, String description) {
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
    public static Optional<DeclarationEventType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NEW);
            case 2 -> Optional.of(CONFIRMED);
            case 3 -> Optional.of(CANCELED);
            case 4 -> Optional.of(MATCHED);
            case 5 -> Optional.of(REJECTED);
            case 6 -> Optional.of(REFUSED);
            case 7 -> Optional.of(EXPIRED);
            case 8 -> Optional.of(ELIMINATEDBYTHE_SYSTEM);
            case 9 -> Optional.of(DECLARATION_CREATEDBY_MO);
            case 10 -> Optional.of(CANCELLED_UPON_CS_DREQUEST);
            default -> Optional.empty();
        };
    }
}
