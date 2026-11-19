package omi.lme.lmeselect.referenceprices.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Indicates whether the reference volatility was created in Delta or Strike space.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SurfaceDomain {

    /**
     * Strike
     */
    STRIKE('S', "Strike"),

    /**
     * Delta
     */
    DELTA('D', "Delta");

    private final char wire;

    private final String description;

    SurfaceDomain(char wire, String description) {
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
    public static Optional<SurfaceDomain> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(STRIKE);
            case 'D' -> Optional.of(DELTA);
            default -> Optional.empty();
        };
    }
}
