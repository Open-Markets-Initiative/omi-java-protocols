package omi.nyse.amexoptions.deepfeed.pillar.v1_2_l.enums;

import java.util.Optional;

/**
 * Price type indicator.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceType {

    /**
     * Strike Price Is Amount
     */
    STRIKE_PRICE_IS_AMOUNT_0((short) 0, "Strike Price Is Amount"),

    /**
     * Strike Price Is Amount
     */
    STRIKE_PRICE_IS_AMOUNT_1((short) 1, "Strike Price Is Amount");

    private final short wire;

    private final String description;

    PriceType(short wire, String description) {
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
    public static Optional<PriceType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(STRIKE_PRICE_IS_AMOUNT_0);
            case 1 -> Optional.of(STRIKE_PRICE_IS_AMOUNT_1);
            default -> Optional.empty();
        };
    }
}
