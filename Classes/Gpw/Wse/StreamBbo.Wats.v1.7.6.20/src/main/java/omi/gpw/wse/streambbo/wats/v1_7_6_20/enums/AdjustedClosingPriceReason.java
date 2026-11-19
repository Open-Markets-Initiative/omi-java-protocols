package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Reason for adjusting the Closing Price
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AdjustedClosingPriceReason {

    /**
     * Not applicable
     */
    NOT_APPLICABLE((short) 1, "Not applicable"),

    /**
     * Dividend
     */
    DIVIDEND((short) 2, "Dividend"),

    /**
     * Issue Right
     */
    ISSUE_RIGHT((short) 3, "Issue Right"),

    /**
     * Split
     */
    SPLIT((short) 4, "Split"),

    /**
     * Reverse Split
     */
    REVERSE_SPLIT((short) 5, "Reverse Split"),

    /**
     * Bonus
     */
    BONUS((short) 6, "Bonus"),

    /**
     * Spin-Off
     */
    SPIN_OFF((short) 7, "Spin-Off"),

    /**
     * Tick Size Change
     */
    TICK_SIZE_CHANGE((short) 8, "Tick Size Change"),

    /**
     * Order Purge
     */
    ORDER_PURGE((short) 9, "Order Purge"),

    /**
     * Other reason
     */
    OTHER_REASON((short) 10, "Other reason");

    private final short wire;

    private final String description;

    AdjustedClosingPriceReason(short wire, String description) {
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
    public static Optional<AdjustedClosingPriceReason> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NOT_APPLICABLE);
            case 2 -> Optional.of(DIVIDEND);
            case 3 -> Optional.of(ISSUE_RIGHT);
            case 4 -> Optional.of(SPLIT);
            case 5 -> Optional.of(REVERSE_SPLIT);
            case 6 -> Optional.of(BONUS);
            case 7 -> Optional.of(SPIN_OFF);
            case 8 -> Optional.of(TICK_SIZE_CHANGE);
            case 9 -> Optional.of(ORDER_PURGE);
            case 10 -> Optional.of(OTHER_REASON);
            default -> Optional.empty();
        };
    }
}
