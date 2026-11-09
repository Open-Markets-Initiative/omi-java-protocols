package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies the applicable tick size for a symbol
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MinimumPriceIncrementIndicator {

    /**
     * Penny Mpi 0.01
     */
    PENNY_MPI_001('1', "Penny Mpi 0.01"),

    /**
     * Half Penny Mpi 0.005
     */
    HALF_PENNY_MPI_0005('2', "Half Penny Mpi 0.005");

    private final char wire;

    private final String description;

    MinimumPriceIncrementIndicator(char wire, String description) {
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
    public static Optional<MinimumPriceIncrementIndicator> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(PENNY_MPI_001);
            case '2' -> Optional.of(HALF_PENNY_MPI_0005);
            default -> Optional.empty();
        };
    }
}
