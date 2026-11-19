package omi.jse.itac.enhancednativetrading.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Type of security
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityType {

    /**
     * Future
     */
    FUTURE((short) 1, "Future"),

    /**
     * Call Option
     */
    CALL_OPTION((short) 2, "Call Option"),

    /**
     * Put Option
     */
    PUT_OPTION((short) 3, "Put Option"),

    /**
     * Fwd Fwd
     */
    FWD_FWD((short) 99, "Fwd Fwd"),

    /**
     * Delta Option
     */
    DELTA_OPTION((short) 100, "Delta Option");

    private final short wire;

    private final String description;

    SecurityType(short wire, String description) {
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
    public static Optional<SecurityType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(FUTURE);
            case 2 -> Optional.of(CALL_OPTION);
            case 3 -> Optional.of(PUT_OPTION);
            case 99 -> Optional.of(FWD_FWD);
            case 100 -> Optional.of(DELTA_OPTION);
            default -> Optional.empty();
        };
    }
}
