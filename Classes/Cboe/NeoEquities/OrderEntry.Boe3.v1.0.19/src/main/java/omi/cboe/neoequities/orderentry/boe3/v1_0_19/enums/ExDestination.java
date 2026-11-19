package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Destination book of the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExDestination {

    /**
     * Crossing Facility
     */
    CROSSING_FACILITY('C', "Crossing Facility"),

    /**
     * Neo D
     */
    NEO_D('D', "Neo D"),

    /**
     * Neo L
     */
    NEO_L('L', "Neo L"),

    /**
     * Neo N
     */
    NEO_N('N', "Neo N"),

    /**
     * Sst
     */
    SST('S', "Sst");

    private final char wire;

    private final String description;

    ExDestination(char wire, String description) {
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
    public static Optional<ExDestination> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CROSSING_FACILITY);
            case 'D' -> Optional.of(NEO_D);
            case 'L' -> Optional.of(NEO_L);
            case 'N' -> Optional.of(NEO_N);
            case 'S' -> Optional.of(SST);
            default -> Optional.empty();
        };
    }
}
