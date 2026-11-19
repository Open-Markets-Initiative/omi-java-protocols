package omi.jpx.tseequities.marketbyorder.flex.v1_1.enums;

import java.util.Optional;

/**
 * Indicates market status
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MarketStatus {

    /**
     * Morning Session Order Acceptance Time
     */
    MORNING_SESSION_ORDER_ACCEPTANCE_TIME((short) 11, "Morning Session Order Acceptance Time"),

    /**
     * Morning Session Trading Hours
     */
    MORNING_SESSION_TRADING_HOURS((short) 12, "Morning Session Trading Hours"),

    /**
     * End Of Morning Session
     */
    END_OF_MORNING_SESSION((short) 19, "End Of Morning Session"),

    /**
     * Afternoon Session Order Acceptance Time
     */
    AFTERNOON_SESSION_ORDER_ACCEPTANCE_TIME((short) 21, "Afternoon Session Order Acceptance Time"),

    /**
     * Afternoon Session Trading Hours
     */
    AFTERNOON_SESSION_TRADING_HOURS((short) 22, "Afternoon Session Trading Hours"),

    /**
     * Afternoon Session Pre Closing
     */
    AFTERNOON_SESSION_PRE_CLOSING((short) 23, "Afternoon Session Pre Closing"),

    /**
     * End Of Afternoon Session
     */
    END_OF_AFTERNOON_SESSION((short) 29, "End Of Afternoon Session");

    private final short wire;

    private final String description;

    MarketStatus(short wire, String description) {
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
    public static Optional<MarketStatus> fromWire(short wire) {
        return switch (wire) {
            case 11 -> Optional.of(MORNING_SESSION_ORDER_ACCEPTANCE_TIME);
            case 12 -> Optional.of(MORNING_SESSION_TRADING_HOURS);
            case 19 -> Optional.of(END_OF_MORNING_SESSION);
            case 21 -> Optional.of(AFTERNOON_SESSION_ORDER_ACCEPTANCE_TIME);
            case 22 -> Optional.of(AFTERNOON_SESSION_TRADING_HOURS);
            case 23 -> Optional.of(AFTERNOON_SESSION_PRE_CLOSING);
            case 29 -> Optional.of(END_OF_AFTERNOON_SESSION);
            default -> Optional.empty();
        };
    }
}
