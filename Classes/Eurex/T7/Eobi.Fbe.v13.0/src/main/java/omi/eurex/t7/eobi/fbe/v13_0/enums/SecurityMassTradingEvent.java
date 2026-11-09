package omi.eurex.t7.eobi.fbe.v13_0.enums;

import java.util.Optional;

/**
 * Defines the SecurityMassTradingEvent values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityMassTradingEvent {

    /**
     * Price volatility, auction is extended
     */
    PRICE_VOLATILITY_AUCTION_IS_EXTENDED((short) 10, "Price volatility, auction is extended"),

    /**
     * Price volatility, auction is extended again
     */
    PRICE_VOLATILITY_AUCTION_IS_EXTENDED_AGAIN((short) 11, "Price volatility, auction is extended again"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    SecurityMassTradingEvent(short wire, String description) {
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
    public static Optional<SecurityMassTradingEvent> fromWire(short wire) {
        return switch (wire) {
            case 10 -> Optional.of(PRICE_VOLATILITY_AUCTION_IS_EXTENDED);
            case 11 -> Optional.of(PRICE_VOLATILITY_AUCTION_IS_EXTENDED_AGAIN);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
