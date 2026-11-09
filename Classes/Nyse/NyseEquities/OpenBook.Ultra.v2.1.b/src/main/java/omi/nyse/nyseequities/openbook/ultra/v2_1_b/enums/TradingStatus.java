package omi.nyse.nyseequities.openbook.ultra.v2_1_b.enums;

import java.util.Optional;

/**
 * The current trading status of the equity.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Pre Opening
     */
    PRE_OPENING('P', "Pre Opening"),

    /**
     * Core Session
     */
    CORE_SESSION('O', "Core Session"),

    /**
     * Closed
     */
    CLOSED('X', "Closed"),

    /**
     * Halted
     */
    HALTED('H', "Halted");

    private final char wire;

    private final String description;

    TradingStatus(char wire, String description) {
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
    public static Optional<TradingStatus> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PRE_OPENING);
            case 'O' -> Optional.of(CORE_SESSION);
            case 'X' -> Optional.of(CLOSED);
            case 'H' -> Optional.of(HALTED);
            default -> Optional.empty();
        };
    }
}
