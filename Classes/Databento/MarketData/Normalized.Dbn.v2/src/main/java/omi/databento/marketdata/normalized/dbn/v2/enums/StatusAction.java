package omi.databento.marketdata.normalized.dbn.v2.enums;

import java.util.Optional;

/**
 * The type of status change
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum StatusAction {

    /**
     * None
     */
    NONE(0, "None"),

    /**
     * Pre Open
     */
    PRE_OPEN(1, "Pre Open"),

    /**
     * Pre Cross
     */
    PRE_CROSS(2, "Pre Cross"),

    /**
     * Quoting
     */
    QUOTING(3, "Quoting"),

    /**
     * Cross
     */
    CROSS(4, "Cross"),

    /**
     * Rotation
     */
    ROTATION(5, "Rotation"),

    /**
     * New Price Indication
     */
    NEW_PRICE_INDICATION(6, "New Price Indication"),

    /**
     * Trading
     */
    TRADING(7, "Trading"),

    /**
     * Halt
     */
    HALT(8, "Halt"),

    /**
     * Pause
     */
    PAUSE(9, "Pause"),

    /**
     * Suspend
     */
    SUSPEND(10, "Suspend"),

    /**
     * Pre Close
     */
    PRE_CLOSE(11, "Pre Close"),

    /**
     * Close
     */
    CLOSE(12, "Close"),

    /**
     * Post Close
     */
    POST_CLOSE(13, "Post Close"),

    /**
     * Ssr Change
     */
    SSR_CHANGE(14, "Ssr Change"),

    /**
     * Not Available For Trading
     */
    NOT_AVAILABLE_FOR_TRADING(15, "Not Available For Trading");

    private final int wire;

    private final String description;

    StatusAction(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<StatusAction> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(PRE_OPEN);
            case 2 -> Optional.of(PRE_CROSS);
            case 3 -> Optional.of(QUOTING);
            case 4 -> Optional.of(CROSS);
            case 5 -> Optional.of(ROTATION);
            case 6 -> Optional.of(NEW_PRICE_INDICATION);
            case 7 -> Optional.of(TRADING);
            case 8 -> Optional.of(HALT);
            case 9 -> Optional.of(PAUSE);
            case 10 -> Optional.of(SUSPEND);
            case 11 -> Optional.of(PRE_CLOSE);
            case 12 -> Optional.of(CLOSE);
            case 13 -> Optional.of(POST_CLOSE);
            case 14 -> Optional.of(SSR_CHANGE);
            case 15 -> Optional.of(NOT_AVAILABLE_FOR_TRADING);
            default -> Optional.empty();
        };
    }
}
