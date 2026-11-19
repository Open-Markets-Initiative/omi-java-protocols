package omi.eurex.t7.xti.fbe.v7_0.enums;

import java.util.Optional;

/**
 * Defines the QuoteType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteType {

    /**
     * Indicative
     */
    INDICATIVE((short) 0, "Indicative"),

    /**
     * Tradeable
     */
    TRADEABLE((short) 1, "Tradeable"),

    /**
     * Tradeable(Matching) - for Issuer trading model only
     */
    TRADEABLE_MATCHING((short) 101, "Tradeable(Matching) - for Issuer trading model only"),

    /**
     * Tradeable(Price without turnover) - for Issuer trading model only
     */
    TRADEABLE_PWT((short) 102, "Tradeable(Price without turnover) - for Issuer trading model only"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    QuoteType(short wire, String description) {
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
    public static Optional<QuoteType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(INDICATIVE);
            case 1 -> Optional.of(TRADEABLE);
            case 101 -> Optional.of(TRADEABLE_MATCHING);
            case 102 -> Optional.of(TRADEABLE_PWT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
