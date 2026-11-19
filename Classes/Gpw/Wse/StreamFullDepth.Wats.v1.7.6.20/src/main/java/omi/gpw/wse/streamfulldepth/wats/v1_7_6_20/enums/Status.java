package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Instrument status
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Status {

    /**
     * Financial instrument is active
     */
    ACTIVE((short) 1, "Financial instrument is active"),

    /**
     * Financial instrument is inactive and is not trading
     */
    INACTIVE((short) 2, "Financial instrument is inactive and is not trading"),

    /**
     * Manual suspension by Market Operations
     */
    MARKET_OPERATIONS_SUSPENSION((short) 3, "Manual suspension by Market Operations"),

    /**
     * Outside static trade price collars
     */
    OUTSIDE_COLLARS_STATIC((short) 4, "Outside static trade price collars"),

    /**
     * Outside dynamic trade price collars
     */
    OUTSIDE_COLLARS_DYNAMIC((short) 5, "Outside dynamic trade price collars"),

    /**
     * Regulatory suspension
     */
    REGULATORY_SUSPENSION((short) 6, "Regulatory suspension"),

    /**
     * Hybrid no valid quotes
     */
    HYBRID_NO_QUOTES((short) 8, "Hybrid no valid quotes"),

    /**
     * Hybrid knockout
     */
    HYBRID_KNOCKOUT((short) 9, "Hybrid knockout"),

    /**
     * Hybrid knockout by issuer
     */
    HYBRID_KNOCKOUT_BY_ISSUER((short) 10, "Hybrid knockout by issuer");

    private final short wire;

    private final String description;

    Status(short wire, String description) {
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
    public static Optional<Status> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ACTIVE);
            case 2 -> Optional.of(INACTIVE);
            case 3 -> Optional.of(MARKET_OPERATIONS_SUSPENSION);
            case 4 -> Optional.of(OUTSIDE_COLLARS_STATIC);
            case 5 -> Optional.of(OUTSIDE_COLLARS_DYNAMIC);
            case 6 -> Optional.of(REGULATORY_SUSPENSION);
            case 8 -> Optional.of(HYBRID_NO_QUOTES);
            case 9 -> Optional.of(HYBRID_KNOCKOUT);
            case 10 -> Optional.of(HYBRID_KNOCKOUT_BY_ISSUER);
            default -> Optional.empty();
        };
    }
}
