package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.enums;

import java.util.Optional;

/**
 * Trading session status of the instrument
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InstrumentTradingStatus {

    /**
     * CLOSED
     */
    CLOSED('C', "CLOSED"),

    /**
     * PRE_OPEN
     */
    PRE_OPEN('P', "PRE_OPEN"),

    /**
     * Pre-open no cancel
     */
    PRE_OPEN_NC('N', "Pre-open no cancel"),

    /**
     * OPEN
     */
    OPEN('O', "OPEN"),

    /**
     * PAUSED
     */
    PAUSED('U', "PAUSED"),

    /**
     * HALTED
     */
    HALTED('H', "HALTED");

    private final char wire;

    private final String description;

    InstrumentTradingStatus(char wire, String description) {
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
    public static Optional<InstrumentTradingStatus> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLOSED);
            case 'P' -> Optional.of(PRE_OPEN);
            case 'N' -> Optional.of(PRE_OPEN_NC);
            case 'O' -> Optional.of(OPEN);
            case 'U' -> Optional.of(PAUSED);
            case 'H' -> Optional.of(HALTED);
            default -> Optional.empty();
        };
    }
}
