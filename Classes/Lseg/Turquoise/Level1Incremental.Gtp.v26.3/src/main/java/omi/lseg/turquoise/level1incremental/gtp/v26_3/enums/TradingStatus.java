package omi.lseg.turquoise.level1incremental.gtp.v26_3.enums;

import java.util.Optional;

/**
 * Current trading status of the instrument.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Halted Matching Partition Suspended
     */
    HALTED_MATCHING_PARTITION_SUSPENDED('J', "Halted Matching Partition Suspended"),

    /**
     * Halted System Suspended
     */
    HALTED_SYSTEM_SUSPENDED('K', "Halted System Suspended"),

    /**
     * Halted Regulatory Halt
     */
    HALTED_REGULATORY_HALT('P', "Halted Regulatory Halt"),

    /**
     * Regular Trading Start Of Trqb Session
     */
    REGULAR_TRADING_START_OF_TRQB_SESSION('T', "Regular Trading Start Of Trqb Session"),

    /**
     * End Of Regular Trading End Of Trqb Session
     */
    END_OF_REGULAR_TRADING_END_OF_TRQB_SESSION('t', "End Of Regular Trading End Of Trqb Session"),

    /**
     * Closed
     */
    CLOSED('c', "Closed"),

    /**
     * Suspended
     */
    SUSPENDED('2', "Suspended"),

    /**
     * No Active Session
     */
    NO_ACTIVE_SESSION('w', "No Active Session");

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
            case 'H' -> Optional.of(HALTED);
            case 'J' -> Optional.of(HALTED_MATCHING_PARTITION_SUSPENDED);
            case 'K' -> Optional.of(HALTED_SYSTEM_SUSPENDED);
            case 'P' -> Optional.of(HALTED_REGULATORY_HALT);
            case 'T' -> Optional.of(REGULAR_TRADING_START_OF_TRQB_SESSION);
            case 't' -> Optional.of(END_OF_REGULAR_TRADING_END_OF_TRQB_SESSION);
            case 'c' -> Optional.of(CLOSED);
            case '2' -> Optional.of(SUSPENDED);
            case 'w' -> Optional.of(NO_ACTIVE_SESSION);
            default -> Optional.empty();
        };
    }
}
