package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Reject type indicating which request was rejected.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RejectType {

    /**
     * Order/Cancel Replace reject
     */
    ORDER_CANCEL_REPLACE((short) 1, "Order/Cancel Replace reject"),

    /**
     * Modify Request reject
     */
    MODIFY_REQUEST((short) 2, "Modify Request reject"),

    /**
     * Cancel Request reject
     */
    CANCEL_REQUEST((short) 3, "Cancel Request reject"),

    /**
     * Bulk Cancel Request reject
     */
    BULK_CANCEL_REQUEST((short) 4, "Bulk Cancel Request reject"),

    /**
     * Reserved for future use
     */
    RESERVED((short) 5, "Reserved for future use"),

    /**
     * Manual Action Response reject
     */
    MANUAL_ACTION_RESPONSE((short) 6, "Manual Action Response reject"),

    /**
     * Risk Limit Update Request reject
     */
    RISK_LIMIT_UPDATE_REQUEST((short) 7, "Risk Limit Update Request reject"),

    /**
     * Not applicable for equities markets
     */
    NOT_APPLICABLE_EQUITIES((short) 8, "Not applicable for equities markets"),

    /**
     * Reserved for future use
     */
    RESERVED_FUTURE((short) 9, "Reserved for future use"),

    /**
     * Not applicable for equities markets
     */
    NOT_APPLICABLE_EQUITIES_ALT((short) 10, "Not applicable for equities markets"),

    /**
     * Risk Action Request reject
     */
    RISK_ACTION_REQUEST((short) 11, "Risk Action Request reject");

    private final short wire;

    private final String description;

    RejectType(short wire, String description) {
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
    public static Optional<RejectType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ORDER_CANCEL_REPLACE);
            case 2 -> Optional.of(MODIFY_REQUEST);
            case 3 -> Optional.of(CANCEL_REQUEST);
            case 4 -> Optional.of(BULK_CANCEL_REQUEST);
            case 5 -> Optional.of(RESERVED);
            case 6 -> Optional.of(MANUAL_ACTION_RESPONSE);
            case 7 -> Optional.of(RISK_LIMIT_UPDATE_REQUEST);
            case 8 -> Optional.of(NOT_APPLICABLE_EQUITIES);
            case 9 -> Optional.of(RESERVED_FUTURE);
            case 10 -> Optional.of(NOT_APPLICABLE_EQUITIES_ALT);
            case 11 -> Optional.of(RISK_ACTION_REQUEST);
            default -> Optional.empty();
        };
    }
}
