package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * cxlRejResponseTo
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CxlRejResponseTo {

    /**
     * NEW
     */
    NEW((short) 0, "NEW"),

    /**
     * CANCEL
     */
    CANCEL((short) 1, "CANCEL"),

    /**
     * REPLACE
     */
    REPLACE((short) 2, "REPLACE");

    private final short wire;

    private final String description;

    CxlRejResponseTo(short wire, String description) {
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
    public static Optional<CxlRejResponseTo> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NEW);
            case 1 -> Optional.of(CANCEL);
            case 2 -> Optional.of(REPLACE);
            default -> Optional.empty();
        };
    }
}
