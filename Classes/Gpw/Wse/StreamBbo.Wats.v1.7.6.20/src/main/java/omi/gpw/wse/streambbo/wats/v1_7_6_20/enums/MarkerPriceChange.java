package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * The field contains the direction of the percentage change in the instrument closing price from the current session in relation to the reference price
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MarkerPriceChange {

    /**
     * Increase
     */
    INCREASE((short) 1, "Increase"),

    /**
     * Decrease
     */
    DECREASE((short) 2, "Decrease"),

    /**
     * No change
     */
    NO_CHANGE((short) 3, "No change"),

    /**
     * Not Applicable
     */
    NOT_APPLICABLE((short) 4, "Not Applicable");

    private final short wire;

    private final String description;

    MarkerPriceChange(short wire, String description) {
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
    public static Optional<MarkerPriceChange> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(INCREASE);
            case 2 -> Optional.of(DECREASE);
            case 3 -> Optional.of(NO_CHANGE);
            case 4 -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
