package omi.euronext.optiq.dropcopygateway.sbe.v5_36.enums;

import java.util.Optional;

/**
 * bookState
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BookState {

    /**
     * Inaccessible
     */
    INACCESSIBLE((short) 1, "Inaccessible"),

    /**
     * Closed
     */
    CLOSED((short) 2, "Closed"),

    /**
     * Call
     */
    CALL((short) 3, "Call"),

    /**
     * Uncrossing
     */
    UNCROSSING((short) 4, "Uncrossing"),

    /**
     * Continuous
     */
    CONTINUOUS((short) 5, "Continuous"),

    /**
     * Halted
     */
    HALTED((short) 6, "Halted"),

    /**
     * Continuous_Uncrossing
     */
    CONTINUOUS_UNCROSSING((short) 7, "Continuous_Uncrossing"),

    /**
     * Suspended
     */
    SUSPENDED((short) 8, "Suspended"),

    /**
     * Reserved
     */
    RESERVED((short) 9, "Reserved"),

    /**
     * Random_Uncrossing_Period
     */
    RANDOM_UNCROSSING_PERIOD((short) 10, "Random_Uncrossing_Period");

    private final short wire;

    private final String description;

    BookState(short wire, String description) {
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
    public static Optional<BookState> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(INACCESSIBLE);
            case 2 -> Optional.of(CLOSED);
            case 3 -> Optional.of(CALL);
            case 4 -> Optional.of(UNCROSSING);
            case 5 -> Optional.of(CONTINUOUS);
            case 6 -> Optional.of(HALTED);
            case 7 -> Optional.of(CONTINUOUS_UNCROSSING);
            case 8 -> Optional.of(SUSPENDED);
            case 9 -> Optional.of(RESERVED);
            case 10 -> Optional.of(RANDOM_UNCROSSING_PERIOD);
            default -> Optional.empty();
        };
    }
}
