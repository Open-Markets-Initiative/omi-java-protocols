package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * priceType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceTypeOptional {

    /**
     * Percentage.
     */
    PERCENTAGE((short) 1, "Percentage."),

    /**
     * Per unit (i.e., per share or contract).
     */
    PU((short) 2, "Per unit (i.e., per share or contract)."),

    /**
     * Fixed amount (absolute value).
     */
    FIXED_AMOUNT((short) 3, "Fixed amount (absolute value)."),

    /**
     * priceType
     */
    NO_VALUE((short) 0, "priceType");

    private final short wire;

    private final String description;

    PriceTypeOptional(short wire, String description) {
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
    public static Optional<PriceTypeOptional> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PERCENTAGE);
            case 2 -> Optional.of(PU);
            case 3 -> Optional.of(FIXED_AMOUNT);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
