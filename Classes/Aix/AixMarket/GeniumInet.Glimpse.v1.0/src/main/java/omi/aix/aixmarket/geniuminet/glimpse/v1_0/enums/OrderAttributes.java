package omi.aix.aixmarket.geniuminet.glimpse.v1_0.enums;

import java.util.Optional;

/**
 * Order attributes.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum OrderAttributes {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(0, "Not Applicable");

    private final int wire;

    private final String description;

    OrderAttributes(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<OrderAttributes> fromWire(int wire) {
        return wire == 0 ? Optional.of(NOT_APPLICABLE) : Optional.empty();
    }
}
