package omi.euronext.optiq.orderentrygateway.sbe.v1_3.enums;

import java.util.Optional;

/**
 * inputPriceType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum InputPriceType {

    /**
     * Valuation_Price
     */
    VALUATION_PRICE((short) 1, "Valuation_Price"),

    /**
     * Alternative_Indicative_Price_AIP
     */
    ALTERNATIVE_INDICATIVE_PRICE_AIP((short) 2, "Alternative_Indicative_Price_AIP");

    private final short wire;

    private final String description;

    InputPriceType(short wire, String description) {
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
    public static Optional<InputPriceType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(VALUATION_PRICE);
            case 2 -> Optional.of(ALTERNATIVE_INDICATIVE_PRICE_AIP);
            default -> Optional.empty();
        };
    }
}
