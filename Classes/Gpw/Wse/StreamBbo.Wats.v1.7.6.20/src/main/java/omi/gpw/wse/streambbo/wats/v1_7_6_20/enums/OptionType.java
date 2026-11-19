package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Identifier of option type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OptionType {

    /**
     * Not applicable
     */
    NOT_APPLICABLE((short) 1, "Not applicable"),

    /**
     * Call option
     */
    CALL((short) 2, "Call option"),

    /**
     * Put option
     */
    PUT((short) 3, "Put option");

    private final short wire;

    private final String description;

    OptionType(short wire, String description) {
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
    public static Optional<OptionType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NOT_APPLICABLE);
            case 2 -> Optional.of(CALL);
            case 3 -> Optional.of(PUT);
            default -> Optional.empty();
        };
    }
}
