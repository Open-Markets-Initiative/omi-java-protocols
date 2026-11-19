package omi.cme.ebs.spectrum.sbe.v12_0.enums;

import java.util.Optional;

/**
 * The associated region market hours considered for the calculation of the element. The element is calculated from market events occurring during the region's open-close hours
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionId {

    /**
     * The associated region market hours considered for the calculation of the element. The element is calculated from market events occurring during the region's open-close hours
     */
    NO_VALUE((short) 255, "The associated region market hours considered for the calculation of the element. The element is calculated from market events occurring during the region's open-close hours"),

    /**
     * Global
     */
    GL((short) 0, "Global"),

    /**
     * Sydney
     */
    SY((short) 1, "Sydney"),

    /**
     * Tokyo
     */
    TK((short) 2, "Tokyo"),

    /**
     * Hong Kong/ Singapore
     */
    HK((short) 3, "Hong Kong/ Singapore"),

    /**
     * London
     */
    LN((short) 4, "London"),

    /**
     * New York
     */
    NY((short) 5, "New York");

    private final short wire;

    private final String description;

    TradingSessionId(short wire, String description) {
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
    public static Optional<TradingSessionId> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(GL);
            case 1 -> Optional.of(SY);
            case 2 -> Optional.of(TK);
            case 3 -> Optional.of(HK);
            case 4 -> Optional.of(LN);
            case 5 -> Optional.of(NY);
            default -> Optional.empty();
        };
    }
}
