package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * allowISODay
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AllowIsoDay {

    /**
     * False
     */
    FALSE((short) 0, "False"),

    /**
     * True
     */
    TRUE((short) 1, "True"),

    /**
     * allowISODay
     */
    NO_VALUE((short) 255, "allowISODay");

    private final short wire;

    private final String description;

    AllowIsoDay(short wire, String description) {
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
    public static Optional<AllowIsoDay> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(FALSE);
            case 1 -> Optional.of(TRUE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
