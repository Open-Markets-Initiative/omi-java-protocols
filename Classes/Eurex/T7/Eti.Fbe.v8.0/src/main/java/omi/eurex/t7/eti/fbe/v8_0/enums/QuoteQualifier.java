package omi.eurex.t7.eti.fbe.v8_0.enums;

import java.util.Optional;

/**
 * Defines the QuoteQualifier values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteQualifier {

    /**
     * Manual Trade
     */
    NONE((short) 0, "Manual Trade"),

    /**
     * Auto Trade / Eurex EnLight Straight-Through-Processing (STP)
     */
    STP((short) 4, "Auto Trade / Eurex EnLight Straight-Through-Processing (STP)"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    QuoteQualifier(short wire, String description) {
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
    public static Optional<QuoteQualifier> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 4 -> Optional.of(STP);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
