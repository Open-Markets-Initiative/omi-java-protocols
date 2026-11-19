package omi.databento.marketdata.normalized.dbn.v3.enums;

import java.util.Optional;

/**
 * The error code
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ErrorCode {

    /**
     * Auth Failed
     */
    AUTH_FAILED((short) 1, "Auth Failed"),

    /**
     * Api Key Deactivated
     */
    API_KEY_DEACTIVATED((short) 2, "Api Key Deactivated"),

    /**
     * Connection Limit Exceeded
     */
    CONNECTION_LIMIT_EXCEEDED((short) 3, "Connection Limit Exceeded"),

    /**
     * Symbol Resolution Failed
     */
    SYMBOL_RESOLUTION_FAILED((short) 4, "Symbol Resolution Failed"),

    /**
     * Invalid Subscription
     */
    INVALID_SUBSCRIPTION((short) 5, "Invalid Subscription"),

    /**
     * Internal Error
     */
    INTERNAL_ERROR((short) 6, "Internal Error"),

    /**
     * Skipped Records After Slow Reading
     */
    SKIPPED_RECORDS_AFTER_SLOW_READING((short) 7, "Skipped Records After Slow Reading"),

    /**
     * Replay Data Aged Out
     */
    REPLAY_DATA_AGED_OUT((short) 8, "Replay Data Aged Out"),

    /**
     * Unset
     */
    UNSET((short) 255, "Unset");

    private final short wire;

    private final String description;

    ErrorCode(short wire, String description) {
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
    public static Optional<ErrorCode> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(AUTH_FAILED);
            case 2 -> Optional.of(API_KEY_DEACTIVATED);
            case 3 -> Optional.of(CONNECTION_LIMIT_EXCEEDED);
            case 4 -> Optional.of(SYMBOL_RESOLUTION_FAILED);
            case 5 -> Optional.of(INVALID_SUBSCRIPTION);
            case 6 -> Optional.of(INTERNAL_ERROR);
            case 7 -> Optional.of(SKIPPED_RECORDS_AFTER_SLOW_READING);
            case 8 -> Optional.of(REPLAY_DATA_AGED_OUT);
            case 255 -> Optional.of(UNSET);
            default -> Optional.empty();
        };
    }
}
