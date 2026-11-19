package omi.lseg.lse.level2mbprecovery.gtp.v26_2.enums;

import java.util.Optional;

/**
 * The type of messages to be replayed.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RecoveryType {

    /**
     * Instrument Directory
     */
    INSTRUMENT_DIRECTORY((short) 0, "Instrument Directory"),

    /**
     * Order Book
     */
    ORDER_BOOK((short) 1, "Order Book"),

    /**
     * All Trades
     */
    ALL_TRADES((short) 2, "All Trades"),

    /**
     * Statistics
     */
    STATISTICS((short) 3, "Statistics"),

    /**
     * Instrument Status
     */
    INSTRUMENT_STATUS((short) 4, "Instrument Status"),

    /**
     * Reserved
     */
    RESERVED((short) 5, "Reserved"),

    /**
     * System Event
     */
    SYSTEM_EVENT((short) 6, "System Event");

    private final short wire;

    private final String description;

    RecoveryType(short wire, String description) {
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
    public static Optional<RecoveryType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(INSTRUMENT_DIRECTORY);
            case 1 -> Optional.of(ORDER_BOOK);
            case 2 -> Optional.of(ALL_TRADES);
            case 3 -> Optional.of(STATISTICS);
            case 4 -> Optional.of(INSTRUMENT_STATUS);
            case 5 -> Optional.of(RESERVED);
            case 6 -> Optional.of(SYSTEM_EVENT);
            default -> Optional.empty();
        };
    }
}
