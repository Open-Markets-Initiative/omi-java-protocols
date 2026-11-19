package omi.eurex.t7.xti.fbe.v11_0.enums;

import java.util.Optional;

/**
 * Defines the TrdType values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TrdType {

    /**
     * OTC
     */
    OTC(54, "OTC"),

    /**
     * Large in scale
     */
    LIS(1005, "Large in scale"),

    /**
     * Eurex/Xetra Enlight triggered trade
     */
    ENLIGHT(1006, "Eurex/Xetra Enlight triggered trade"),

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value");

    private final int wire;

    private final String description;

    TrdType(int wire, String description) {
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
    public static Optional<TrdType> fromWire(int wire) {
        return switch (wire) {
            case 54 -> Optional.of(OTC);
            case 1005 -> Optional.of(LIS);
            case 1006 -> Optional.of(ENLIGHT);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
