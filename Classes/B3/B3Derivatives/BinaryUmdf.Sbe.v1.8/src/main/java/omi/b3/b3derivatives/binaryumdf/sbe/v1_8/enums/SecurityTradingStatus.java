package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * securityTradingStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityTradingStatus {

    /**
     * Trading Halt (Pause).
     */
    PAUSE((short) 2, "Trading Halt (Pause)."),

    /**
     * No-Open (Close).
     */
    CLOSE((short) 4, "No-Open (Close)."),

    /**
     * Ready To Trade (Open).
     */
    OPEN((short) 17, "Ready To Trade (Open)."),

    /**
     * Not Available For Trading (Forbidden).
     */
    FORBIDDEN((short) 18, "Not Available For Trading (Forbidden)."),

    /**
     * Unknown Or Invalid.
     */
    UNKNOWN_OR_INVALID((short) 20, "Unknown Or Invalid."),

    /**
     * Pre Open (Reserved).
     */
    RESERVED((short) 21, "Pre Open (Reserved)."),

    /**
     * Final Closing Call.
     */
    FINAL_CLOSING_CALL((short) 101, "Final Closing Call.");

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
            case 2 -> Optional.of(PAUSE);
            case 4 -> Optional.of(CLOSE);
            case 17 -> Optional.of(OPEN);
            case 18 -> Optional.of(FORBIDDEN);
            case 20 -> Optional.of(UNKNOWN_OR_INVALID);
            case 21 -> Optional.of(RESERVED);
            case 101 -> Optional.of(FINAL_CLOSING_CALL);
            default -> Optional.empty();
        };
    }
}
