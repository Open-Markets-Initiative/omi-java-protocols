package omi.jse.itac.enhancednativetrading.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Outcome of the Security Definition Request
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityResponseType {

    /**
     * Rejected
     */
    REJECTED((short) 0, "Rejected"),

    /**
     * Accepted
     */
    ACCEPTED((short) 1, "Accepted");

    private final short wire;

    private final String description;

    SecurityResponseType(short wire, String description) {
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
    public static Optional<SecurityResponseType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(REJECTED);
            case 1 -> Optional.of(ACCEPTED);
            default -> Optional.empty();
        };
    }
}
