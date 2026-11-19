package omi.euronext.optiq.dropcopygateway.sbe.v5_38.enums;

import java.util.Optional;

/**
 * instrumentState
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum InstrumentState {

    /**
     * Scheduled
     */
    SCHEDULED((short) 1, "Scheduled"),

    /**
     * Suspended_due_to_Underlying
     */
    SUSPENDEDDUETO_UNDERLYING((short) 2, "Suspended_due_to_Underlying"),

    /**
     * Suspended_KOBI
     */
    SUSPENDED_KOBI((short) 3, "Suspended_KOBI"),

    /**
     * Suspended_KOBE
     */
    SUSPENDED_KOBE((short) 4, "Suspended_KOBE"),

    /**
     * Suspended_New_Listing
     */
    SUSPENDED_NEW_LISTING((short) 5, "Suspended_New_Listing"),

    /**
     * Suspended_by_MO
     */
    SUSPENDEDBY_MO((short) 6, "Suspended_by_MO"),

    /**
     * Suspended_Technical
     */
    SUSPENDED_TECHNICAL((short) 7, "Suspended_Technical"),

    /**
     * Reserved_Dynamic_Collars
     */
    RESERVED_DYNAMIC_COLLARS((short) 8, "Reserved_Dynamic_Collars"),

    /**
     * Reserved_Static_Collars
     */
    RESERVED_STATIC_COLLARS((short) 9, "Reserved_Static_Collars"),

    /**
     * Reserved_Waiting_For_LP
     */
    RESERVED_WAITING_FOR_LP((short) 10, "Reserved_Waiting_For_LP"),

    /**
     * Reserved_LP_Limit
     */
    RESERVED_LP_LIMIT((short) 11, "Reserved_LP_Limit"),

    /**
     * Instrument_Deletion
     */
    INSTRUMENT_DELETION((short) 12, "Instrument_Deletion"),

    /**
     * Suspended_Waiting_for_BBO
     */
    SUSPENDED_WAITINGFOR_BBO((short) 13, "Suspended_Waiting_for_BBO"),

    /**
     * Suspended_Waiting_for_Tradable_State
     */
    SUSPENDED_WAITINGFOR_TRADABLE_STATE((short) 14, "Suspended_Waiting_for_Tradable_State"),

    /**
     * Random_Uncrossing_Period
     */
    RANDOM_UNCROSSING_PERIOD((short) 15, "Random_Uncrossing_Period"),

    /**
     * Expired
     */
    EXPIRED((short) 16, "Expired"),

    /**
     * Uncrossing
     */
    UNCROSSING((short) 17, "Uncrossing"),

    /**
     * Reserved_due_to_Leg
     */
    RESERVEDDUETO_LEG((short) 18, "Reserved_due_to_Leg"),

    /**
     * Suspended_due_to_Leg
     */
    SUSPENDEDDUETO_LEG((short) 19, "Suspended_due_to_Leg"),

    /**
     * Reserved_Waiting_for_Valid_Assigned_Broker_Price
     */
    RESERVED_WAITINGFOR_VALID_ASSIGNED_BROKER_PRICE((short) 20, "Reserved_Waiting_for_Valid_Assigned_Broker_Price"),

    /**
     * Reserved_Future_Limit_Interruption_Protection
     */
    RESERVED_FUTURE_LIMIT_INTERRUPTION_PROTECTION((short) 21, "Reserved_Future_Limit_Interruption_Protection"),

    /**
     * Suspended_Waiting_For_Market_Operations
     */
    SUSPENDED_WAITING_FOR_MARKET_OPERATIONS((short) 22, "Suspended_Waiting_For_Market_Operations");

    private final short wire;

    private final String description;

    InstrumentState(short wire, String description) {
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
    public static Optional<InstrumentState> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(SCHEDULED);
            case 2 -> Optional.of(SUSPENDEDDUETO_UNDERLYING);
            case 3 -> Optional.of(SUSPENDED_KOBI);
            case 4 -> Optional.of(SUSPENDED_KOBE);
            case 5 -> Optional.of(SUSPENDED_NEW_LISTING);
            case 6 -> Optional.of(SUSPENDEDBY_MO);
            case 7 -> Optional.of(SUSPENDED_TECHNICAL);
            case 8 -> Optional.of(RESERVED_DYNAMIC_COLLARS);
            case 9 -> Optional.of(RESERVED_STATIC_COLLARS);
            case 10 -> Optional.of(RESERVED_WAITING_FOR_LP);
            case 11 -> Optional.of(RESERVED_LP_LIMIT);
            case 12 -> Optional.of(INSTRUMENT_DELETION);
            case 13 -> Optional.of(SUSPENDED_WAITINGFOR_BBO);
            case 14 -> Optional.of(SUSPENDED_WAITINGFOR_TRADABLE_STATE);
            case 15 -> Optional.of(RANDOM_UNCROSSING_PERIOD);
            case 16 -> Optional.of(EXPIRED);
            case 17 -> Optional.of(UNCROSSING);
            case 18 -> Optional.of(RESERVEDDUETO_LEG);
            case 19 -> Optional.of(SUSPENDEDDUETO_LEG);
            case 20 -> Optional.of(RESERVED_WAITINGFOR_VALID_ASSIGNED_BROKER_PRICE);
            case 21 -> Optional.of(RESERVED_FUTURE_LIMIT_INTERRUPTION_PROTECTION);
            case 22 -> Optional.of(SUSPENDED_WAITING_FOR_MARKET_OPERATIONS);
            default -> Optional.empty();
        };
    }
}
