package omi.coinbase.deribit.ordersapi.sbe.v1_5.enums;

import java.util.Optional;

/**
 * reason
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ReasonMassQuoteRejectReason {

    /**
     * SYSTEM_ERROR
     */
    SYSTEM_ERROR((byte) 0, "SYSTEM_ERROR"),

    /**
     * INVALID_MMP_GROUP
     */
    INVALID_MMP_GROUP((byte) 1, "INVALID_MMP_GROUP"),

    /**
     * MMP_GROUP_DISABLED
     */
    MMP_GROUP_DISABLED((byte) 2, "MMP_GROUP_DISABLED"),

    /**
     * MMP_GROUP_FROZEN
     */
    MMP_GROUP_FROZEN((byte) 3, "MMP_GROUP_FROZEN"),

    /**
     * TOO_MANY_QUOTES
     */
    TOO_MANY_QUOTES((byte) 4, "TOO_MANY_QUOTES"),

    /**
     * INVALID_INSTRUMENT
     */
    INVALID_INSTRUMENT((byte) 5, "INVALID_INSTRUMENT"),

    /**
     * gateway rate limit exceeded
     */
    RATE_LIMIT((byte) 6, "gateway rate limit exceeded"),

    /**
     * Portfolio is locked
     */
    PORTFOLIO_LOCKED((byte) 7, "Portfolio is locked"),

    /**
     * the same instrument appears in more than one entry of a single mass quote
     */
    DUPLICATE_INSTRUMENT((byte) 8, "the same instrument appears in more than one entry of a single mass quote"),

    /**
     * MMP minimum freeze duration not yet elapsed
     */
    MMP_MIN_FREEZE_TIME_NOT_ELAPSED((byte) 9, "MMP minimum freeze duration not yet elapsed");

    private final byte wire;

    private final String description;

    ReasonMassQuoteRejectReason(byte wire, String description) {
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
    public static Optional<ReasonMassQuoteRejectReason> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(SYSTEM_ERROR);
            case 1 -> Optional.of(INVALID_MMP_GROUP);
            case 2 -> Optional.of(MMP_GROUP_DISABLED);
            case 3 -> Optional.of(MMP_GROUP_FROZEN);
            case 4 -> Optional.of(TOO_MANY_QUOTES);
            case 5 -> Optional.of(INVALID_INSTRUMENT);
            case 6 -> Optional.of(RATE_LIMIT);
            case 7 -> Optional.of(PORTFOLIO_LOCKED);
            case 8 -> Optional.of(DUPLICATE_INSTRUMENT);
            case 9 -> Optional.of(MMP_MIN_FREEZE_TIME_NOT_ELAPSED);
            default -> Optional.empty();
        };
    }
}
