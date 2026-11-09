package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * Specifies placement of the decimal point in price fields for this security.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceScaleCode {

    /**
     * Low Priced Securities
     */
    LOW_PRICED_SECURITIES((short) 6, "Low Priced Securities"),

    /**
     * Medium Priced Securities
     */
    MEDIUM_PRICED_SECURITIES((short) 4, "Medium Priced Securities"),

    /**
     * High Priced Securities
     */
    HIGH_PRICED_SECURITIES((short) 3, "High Priced Securities");

    private final short wire;

    private final String description;

    PriceScaleCode(short wire, String description) {
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
    public static Optional<PriceScaleCode> fromWire(short wire) {
        return switch (wire) {
            case 6 -> Optional.of(LOW_PRICED_SECURITIES);
            case 4 -> Optional.of(MEDIUM_PRICED_SECURITIES);
            case 3 -> Optional.of(HIGH_PRICED_SECURITIES);
            default -> Optional.empty();
        };
    }
}
