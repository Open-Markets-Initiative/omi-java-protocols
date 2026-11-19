package omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the TimeInForce values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * Day - (Default) Expires at end of market day.
     */
    DAY('0', "Day - (Default) Expires at end of market day."),

    /**
     * GTC* - Remains in system until executed, cancelled or option expires.
     */
    GTC_REMAINS_IN_SYSTEM_UNTIL_EXECUTED_CANCELLED_OR('1', "GTC* - Remains in system until executed, cancelled or option expires."),

    /**
     * At the Open - Will remain queued and only interact in the Cboe Opening Process (C2 and EDGX only) or the Cboe Opening Auction (C1 only).
     */
    AT_THE_OPEN_WILL_REMAIN_QUEUED_AND_ONLY_INTERACT_IN_THE('2', "At the Open - Will remain queued and only interact in the Cboe Opening Process (C2 and EDGX only) or the Cboe Opening Auction (C1 only)."),

    /**
     * IOC - Portion not filled immediately is cancelled. Market orders are implicitly IOC for non-complex orders.
     */
    IOC_PORTION_NOT_FILLED_IMMEDIATELY_IS_CANCELLED('3', "IOC - Portion not filled immediately is cancelled. Market orders are implicitly IOC for non-complex orders."),

    /**
     * FOK - An IOC where the entire size must be filled, else the order will be cancelled back. Not compatible with Step-Up Mechanism (SUM).
     */
    FOK_AN_IOC_WHERE_THE_ENTIRE_SIZE_MUST_BE_FILLED_ELSE_THE('4', "FOK - An IOC where the entire size must be filled, else the order will be cancelled back. Not compatible with Step-Up Mechanism (SUM)."),

    /**
     * GTD* - Expires at specified ExpireTime for a specified day.
     */
    GTD_EXPIRES_AT_SPECIFIED_EXPIRE_TIME_FOR_A_SPECIFIED_DAY('6', "GTD* - Expires at specified ExpireTime for a specified day."),

    /**
     * At the Close - Orders held for execution until 180 seconds before series is scheduled to close. *Bulk Quoting Ports only support TimeInForce = Day or GTD with a same day expiration on C1, C2, and EDGX.
     */
    AT_THE_CLOSE_ORDERS_HELD_FOR_EXECUTION_UNTIL_180_SECONDS('7', "At the Close - Orders held for execution until 180 seconds before series is scheduled to close. *Bulk Quoting Ports only support TimeInForce = Day or GTD with a same day expiration on C1, C2, and EDGX.");

    private final char wire;

    private final String description;

    TimeInForce(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<TimeInForce> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(DAY);
            case '1' -> Optional.of(GTC_REMAINS_IN_SYSTEM_UNTIL_EXECUTED_CANCELLED_OR);
            case '2' -> Optional.of(AT_THE_OPEN_WILL_REMAIN_QUEUED_AND_ONLY_INTERACT_IN_THE);
            case '3' -> Optional.of(IOC_PORTION_NOT_FILLED_IMMEDIATELY_IS_CANCELLED);
            case '4' -> Optional.of(FOK_AN_IOC_WHERE_THE_ENTIRE_SIZE_MUST_BE_FILLED_ELSE_THE);
            case '6' -> Optional.of(GTD_EXPIRES_AT_SPECIFIED_EXPIRE_TIME_FOR_A_SPECIFIED_DAY);
            case '7' -> Optional.of(AT_THE_CLOSE_ORDERS_HELD_FOR_EXECUTION_UNTIL_180_SECONDS);
            default -> Optional.empty();
        };
    }
}
