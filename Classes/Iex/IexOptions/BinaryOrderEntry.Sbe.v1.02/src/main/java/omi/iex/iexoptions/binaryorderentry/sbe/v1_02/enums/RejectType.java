package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * rejectType
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum RejectType {

    /**
     * NewOrderReject
     */
    NEW_ORDER_REJECT((byte) 0, "NewOrderReject"),

    /**
     * CancelReplaceRequestReject
     */
    CANCEL_REPLACE_REQUEST_REJECT((byte) 1, "CancelReplaceRequestReject"),

    /**
     * CancelRequestReject
     */
    CANCEL_REQUEST_REJECT((byte) 2, "CancelRequestReject"),

    /**
     * MassCancelRequestReject
     */
    MASS_CANCEL_REQUEST_REJECT((byte) 3, "MassCancelRequestReject"),

    /**
     * NewBulkQuoteReject
     */
    NEW_BULK_QUOTE_REJECT((byte) 4, "NewBulkQuoteReject"),

    /**
     * RiskLimitUpdateRequestReject
     */
    RISK_LIMIT_UPDATE_REQUEST_REJECT((byte) 5, "RiskLimitUpdateRequestReject"),

    /**
     * RiskActionRequestReject
     */
    RISK_ACTION_REQUEST_REJECT((byte) 6, "RiskActionRequestReject"),

    /**
     * PurgeRequestReject
     */
    PURGE_REQUEST_REJECT((byte) 7, "PurgeRequestReject"),

    /**
     * NewIocQuoteReject
     */
    NEW_IOC_QUOTE_REJECT((byte) 8, "NewIocQuoteReject");

    private final byte wire;

    private final String description;

    RejectType(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<RejectType> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(NEW_ORDER_REJECT);
            case 1 -> Optional.of(CANCEL_REPLACE_REQUEST_REJECT);
            case 2 -> Optional.of(CANCEL_REQUEST_REJECT);
            case 3 -> Optional.of(MASS_CANCEL_REQUEST_REJECT);
            case 4 -> Optional.of(NEW_BULK_QUOTE_REJECT);
            case 5 -> Optional.of(RISK_LIMIT_UPDATE_REQUEST_REJECT);
            case 6 -> Optional.of(RISK_ACTION_REQUEST_REJECT);
            case 7 -> Optional.of(PURGE_REQUEST_REJECT);
            case 8 -> Optional.of(NEW_IOC_QUOTE_REJECT);
            default -> Optional.empty();
        };
    }
}
