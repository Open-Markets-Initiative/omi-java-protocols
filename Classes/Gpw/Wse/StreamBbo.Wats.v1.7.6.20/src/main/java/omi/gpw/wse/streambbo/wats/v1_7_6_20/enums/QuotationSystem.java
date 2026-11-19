package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * The field informing about the system of listing the instrument
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuotationSystem {

    /**
     * Not Applicable
     */
    NA((short) 1, "Not Applicable"),

    /**
     * Single price quotation system with a single fixing
     */
    SINGLE_PRICE_SINGLE_FIXING((short) 2, "Single price quotation system with a single fixing"),

    /**
     * Continuous trading
     */
    CONTINUOUS_TRADING((short) 3, "Continuous trading"),

    /**
     * Single price quotation system with two fixings
     */
    SINGLE_PRICE_TWO_FIXINGS((short) 4, "Single price quotation system with two fixings");

    private final short wire;

    private final String description;

    QuotationSystem(short wire, String description) {
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
    public static Optional<QuotationSystem> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NA);
            case 2 -> Optional.of(SINGLE_PRICE_SINGLE_FIXING);
            case 3 -> Optional.of(CONTINUOUS_TRADING);
            case 4 -> Optional.of(SINGLE_PRICE_TWO_FIXINGS);
            default -> Optional.empty();
        };
    }
}
