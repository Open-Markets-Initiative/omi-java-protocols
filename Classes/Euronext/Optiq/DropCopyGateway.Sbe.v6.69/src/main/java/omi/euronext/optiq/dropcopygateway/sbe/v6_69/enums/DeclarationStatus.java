package omi.euronext.optiq.dropcopygateway.sbe.v6_69.enums;

import java.util.Optional;

/**
 * declarationStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum DeclarationStatus {

    /**
     * New_Waiting_for_Counterparty_Confirmation
     */
    NEW_WAITINGFOR_COUNTERPARTY_CONFIRMATION((short) 1, "New_Waiting_for_Counterparty_Confirmation"),

    /**
     * Confirmed_by_Counterparty
     */
    CONFIRMEDBY_COUNTERPARTY((short) 2, "Confirmed_by_Counterparty"),

    /**
     * Refused_by_Counterparty
     */
    REFUSEDBY_COUNTERPARTY((short) 3, "Refused_by_Counterparty"),

    /**
     * Pending_Cancellation
     */
    PENDING_CANCELLATION((short) 4, "Pending_Cancellation"),

    /**
     * Cancelled
     */
    CANCELLED((short) 5, "Cancelled"),

    /**
     * Time_Out
     */
    TIME_OUT((short) 6, "Time_Out"),

    /**
     * Filled
     */
    FILLED((short) 7, "Filled"),

    /**
     * Restated
     */
    RESTATED((short) 8, "Restated"),

    /**
     * Expiration_of_a_pending_declaration
     */
    EXPIRATIONOFAPENDINGDECLARATION((short) 9, "Expiration_of_a_pending_declaration"),

    /**
     * Elimination_of_a_pending_declaration
     */
    ELIMINATIONOFAPENDINGDECLARATION((short) 10, "Elimination_of_a_pending_declaration"),

    /**
     * Elimination_of_a_prematched_declaration_following_a_CE
     */
    ELIMINATIONOFAPREMATCHEDDECLARATIONFOLLOWINGA_CE((short) 11, "Elimination_of_a_prematched_declaration_following_a_CE"),

    /**
     * Elimination_of_a_prematched_declaration_by_MOC
     */
    ELIMINATIONOFAPREMATCHEDDECLARATIONBY_MOC((short) 12, "Elimination_of_a_prematched_declaration_by_MOC"),

    /**
     * Pre_Matched
     */
    PRE_MATCHED((short) 13, "Pre_Matched");

    private final short wire;

    private final String description;

    DeclarationStatus(short wire, String description) {
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
    public static Optional<DeclarationStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NEW_WAITINGFOR_COUNTERPARTY_CONFIRMATION);
            case 2 -> Optional.of(CONFIRMEDBY_COUNTERPARTY);
            case 3 -> Optional.of(REFUSEDBY_COUNTERPARTY);
            case 4 -> Optional.of(PENDING_CANCELLATION);
            case 5 -> Optional.of(CANCELLED);
            case 6 -> Optional.of(TIME_OUT);
            case 7 -> Optional.of(FILLED);
            case 8 -> Optional.of(RESTATED);
            case 9 -> Optional.of(EXPIRATIONOFAPENDINGDECLARATION);
            case 10 -> Optional.of(ELIMINATIONOFAPENDINGDECLARATION);
            case 11 -> Optional.of(ELIMINATIONOFAPREMATCHEDDECLARATIONFOLLOWINGA_CE);
            case 12 -> Optional.of(ELIMINATIONOFAPREMATCHEDDECLARATIONBY_MOC);
            case 13 -> Optional.of(PRE_MATCHED);
            default -> Optional.empty();
        };
    }
}
