package omi.euronext.optiq.dropcopygateway.sbe.v5_36.enums;

import java.util.Optional;

/**
 * statusReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum StatusReason {

    /**
     * Scheduled
     */
    SCHEDULED((short) 0, "Scheduled"),

    /**
     * Collars_Breach
     */
    COLLARS_BREACH((short) 4, "Collars_Breach"),

    /**
     * Automatic_Reopening
     */
    AUTOMATIC_REOPENING((short) 7, "Automatic_Reopening"),

    /**
     * No_Liquidity_Provider
     */
    NO_LIQUIDITY_PROVIDER((short) 8, "No_Liquidity_Provider"),

    /**
     * KnockIn_by_Issuer
     */
    KNOCK_INBY_ISSUER((short) 11, "KnockIn_by_Issuer"),

    /**
     * KnockOut_by_Exchange
     */
    KNOCK_OUTBY_EXCHANGE((short) 12, "KnockOut_by_Exchange"),

    /**
     * KnockOut_by_Issuer
     */
    KNOCK_OUTBY_ISSUER((short) 13, "KnockOut_by_Issuer"),

    /**
     * Action_by_Market_Operations
     */
    ACTIONBY_MARKET_OPERATIONS((short) 15, "Action_by_Market_Operations"),

    /**
     * Waiting_for_Tradable_State
     */
    WAITINGFOR_TRADABLE_STATE((short) 16, "Waiting_for_Tradable_State"),

    /**
     * New_Listing
     */
    NEW_LISTING((short) 20, "New_Listing"),

    /**
     * Due_to_Underlying
     */
    DUETO_UNDERLYING((short) 21, "Due_to_Underlying"),

    /**
     * Outside_of_LP_quotes
     */
    OUTSIDEOF_L_PQUOTES((short) 22, "Outside_of_LP_quotes"),

    /**
     * Technical
     */
    TECHNICAL((short) 23, "Technical"),

    /**
     * Due_to_Leg
     */
    DUETO_LEG((short) 24, "Due_to_Leg"),

    /**
     * Due_to_Main_Market
     */
    DUETO_MAIN_MARKET((short) 25, "Due_to_Main_Market");

    private final short wire;

    private final String description;

    StatusReason(short wire, String description) {
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
    public static Optional<StatusReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SCHEDULED);
            case 4 -> Optional.of(COLLARS_BREACH);
            case 7 -> Optional.of(AUTOMATIC_REOPENING);
            case 8 -> Optional.of(NO_LIQUIDITY_PROVIDER);
            case 11 -> Optional.of(KNOCK_INBY_ISSUER);
            case 12 -> Optional.of(KNOCK_OUTBY_EXCHANGE);
            case 13 -> Optional.of(KNOCK_OUTBY_ISSUER);
            case 15 -> Optional.of(ACTIONBY_MARKET_OPERATIONS);
            case 16 -> Optional.of(WAITINGFOR_TRADABLE_STATE);
            case 20 -> Optional.of(NEW_LISTING);
            case 21 -> Optional.of(DUETO_UNDERLYING);
            case 22 -> Optional.of(OUTSIDEOF_L_PQUOTES);
            case 23 -> Optional.of(TECHNICAL);
            case 24 -> Optional.of(DUETO_LEG);
            case 25 -> Optional.of(DUETO_MAIN_MARKET);
            default -> Optional.empty();
        };
    }
}
