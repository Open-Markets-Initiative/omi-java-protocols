package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the TradeAllocStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeAllocStatus {

    /**
     * Pending
     */
    PENDING((short) 1, "Pending"),

    /**
     * Approved
     */
    APPROVED((short) 2, "Approved"),

    /**
     * Auto Approved
     */
    AUTO_APPROVED((short) 3, "Auto Approved"),

    /**
     * Uploaded
     */
    UPLOADED((short) 4, "Uploaded"),

    /**
     * Canceled
     */
    CANCELED((short) 5, "Canceled"),

    /**
     * Pending Execution
     */
    PENDING_EXECUTION((short) 6, "Pending Execution"),

    /**
     * Pending Reversal
     */
    PENDING_REVERSAL((short) 7, "Pending Reversal"),

    /**
     * Side Approved Reversal
     */
    APPROVED_REVERSAL((short) 8, "Side Approved Reversal"),

    /**
     * Reversed
     */
    REVERSED((short) 9, "Reversed"),

    /**
     * Cancelled Reversal
     */
    CANCELLED_REVERSAL((short) 10, "Cancelled Reversal"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TradeAllocStatus(short wire, String description) {
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
    public static Optional<TradeAllocStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PENDING);
            case 2 -> Optional.of(APPROVED);
            case 3 -> Optional.of(AUTO_APPROVED);
            case 4 -> Optional.of(UPLOADED);
            case 5 -> Optional.of(CANCELED);
            case 6 -> Optional.of(PENDING_EXECUTION);
            case 7 -> Optional.of(PENDING_REVERSAL);
            case 8 -> Optional.of(APPROVED_REVERSAL);
            case 9 -> Optional.of(REVERSED);
            case 10 -> Optional.of(CANCELLED_REVERSAL);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
