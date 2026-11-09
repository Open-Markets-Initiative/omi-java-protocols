package omi.eurex.t7.eobi.fbe.v6_0.enums;

import java.util.Optional;

/**
 * Defines the ImpliedMarketIndicator values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ImpliedMarketIndicator {

    /**
     * Not Implied
     */
    NOT_IMPLIED((short) 0, "Not Implied"),

    /**
     * Implied In Out
     */
    IMPLIED_IN_OUT((short) 3, "Implied In Out"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    ImpliedMarketIndicator(short wire, String description) {
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
    public static Optional<ImpliedMarketIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_IMPLIED);
            case 3 -> Optional.of(IMPLIED_IN_OUT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
