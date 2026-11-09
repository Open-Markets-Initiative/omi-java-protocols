package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * The new status that this series is transitioning to
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SeriesStatus {

    /**
     * Trading Halt
     */
    TRADING_HALT('4', "Trading Halt"),

    /**
     * Resume
     */
    RESUME('5', "Resume"),

    /**
     * Suspend
     */
    SUSPEND('6', "Suspend"),

    /**
     * Pre Opening
     */
    PRE_OPENING('P', "Pre Opening"),

    /**
     * Begin Accepting Orders
     */
    BEGIN_ACCEPTING_ORDERS('B', "Begin Accepting Orders"),

    /**
     * Core Session
     */
    CORE_SESSION('O', "Core Session"),

    /**
     * Closed
     */
    CLOSED('X', "Closed");

    private final char wire;

    private final String description;

    SeriesStatus(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<SeriesStatus> fromWire(char wire) {
        return switch (wire) {
            case '4' -> Optional.of(TRADING_HALT);
            case '5' -> Optional.of(RESUME);
            case '6' -> Optional.of(SUSPEND);
            case 'P' -> Optional.of(PRE_OPENING);
            case 'B' -> Optional.of(BEGIN_ACCEPTING_ORDERS);
            case 'O' -> Optional.of(CORE_SESSION);
            case 'X' -> Optional.of(CLOSED);
            default -> Optional.empty();
        };
    }
}
