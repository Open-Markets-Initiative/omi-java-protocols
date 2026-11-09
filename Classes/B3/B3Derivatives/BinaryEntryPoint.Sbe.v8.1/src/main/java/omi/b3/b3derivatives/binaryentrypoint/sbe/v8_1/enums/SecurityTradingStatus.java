package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * securityTradingStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityTradingStatus {

    /**
     * TRADING_HALT
     */
    TRADING_HALT((short) 2, "TRADING_HALT"),

    /**
     * NO_OPEN
     */
    NO_OPEN((short) 4, "NO_OPEN"),

    /**
     * READY_TO_TRADE
     */
    READY_TO_TRADE((short) 17, "READY_TO_TRADE"),

    /**
     * FORBIDDEN
     */
    FORBIDDEN((short) 18, "FORBIDDEN"),

    /**
     * UNKNOWN_OR_INVALID
     */
    UNKNOWN_OR_INVALID((short) 20, "UNKNOWN_OR_INVALID"),

    /**
     * PRE_OPEN
     */
    PRE_OPEN((short) 21, "PRE_OPEN"),

    /**
     * FINAL_CLOSING_CALL
     */
    FINAL_CLOSING_CALL((short) 101, "FINAL_CLOSING_CALL"),

    /**
     * RESERVED
     */
    RESERVED((short) 110, "RESERVED"),

    /**
     * securityTradingStatus
     */
    NO_VALUE((short) 0, "securityTradingStatus");

    private final short wire;

    private final String description;

    SecurityTradingStatus(short wire, String description) {
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
    public static Optional<SecurityTradingStatus> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(TRADING_HALT);
            case 4 -> Optional.of(NO_OPEN);
            case 17 -> Optional.of(READY_TO_TRADE);
            case 18 -> Optional.of(FORBIDDEN);
            case 20 -> Optional.of(UNKNOWN_OR_INVALID);
            case 21 -> Optional.of(PRE_OPEN);
            case 101 -> Optional.of(FINAL_CLOSING_CALL);
            case 110 -> Optional.of(RESERVED);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
