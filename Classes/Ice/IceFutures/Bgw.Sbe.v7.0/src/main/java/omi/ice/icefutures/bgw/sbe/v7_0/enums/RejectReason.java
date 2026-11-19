package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * rejectReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RejectReason {

    /**
     * TooLateToCancel
     */
    TOO_LATE_TO_CANCEL((short) 0, "TooLateToCancel"),

    /**
     * UnknownSymbol
     */
    UNKNOWN_SYMBOL((short) 1, "UnknownSymbol"),

    /**
     * ExchangeClosed
     */
    EXCHANGE_CLOSED((short) 2, "ExchangeClosed"),

    /**
     * OrderExceedsLimit
     */
    ORDER_EXCEEDS_LIMIT((short) 3, "OrderExceedsLimit"),

    /**
     * UnableToProcessRequest
     */
    UNABLE_TO_PROCESS_REQUEST((short) 4, "UnableToProcessRequest"),

    /**
     * UnknownOrder
     */
    UNKNOWN_ORDER((short) 5, "UnknownOrder"),

    /**
     * DuplicateOrder
     */
    DUPLICATE_ORDER((short) 6, "DuplicateOrder"),

    /**
     * MissingPermissions
     */
    MISSING_PERMISSIONS((short) 7, "MissingPermissions"),

    /**
     * UserDefined
     */
    USER_DEFINED((short) 9, "UserDefined"),

    /**
     * CancelOrReplacePending
     */
    CANCEL_OR_REPLACE_PENDING((short) 10, "CancelOrReplacePending"),

    /**
     * Unsupported
     */
    UNSUPPORTED((short) 11, "Unsupported"),

    /**
     * RiskProtectionActive
     */
    RISK_PROTECTION_ACTIVE((short) 12, "RiskProtectionActive");

    private final short wire;

    private final String description;

    RejectReason(short wire, String description) {
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
    public static Optional<RejectReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(TOO_LATE_TO_CANCEL);
            case 1 -> Optional.of(UNKNOWN_SYMBOL);
            case 2 -> Optional.of(EXCHANGE_CLOSED);
            case 3 -> Optional.of(ORDER_EXCEEDS_LIMIT);
            case 4 -> Optional.of(UNABLE_TO_PROCESS_REQUEST);
            case 5 -> Optional.of(UNKNOWN_ORDER);
            case 6 -> Optional.of(DUPLICATE_ORDER);
            case 7 -> Optional.of(MISSING_PERMISSIONS);
            case 9 -> Optional.of(USER_DEFINED);
            case 10 -> Optional.of(CANCEL_OR_REPLACE_PENDING);
            case 11 -> Optional.of(UNSUPPORTED);
            case 12 -> Optional.of(RISK_PROTECTION_ACTIVE);
            default -> Optional.empty();
        };
    }
}
