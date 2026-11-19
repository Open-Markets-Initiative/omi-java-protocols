package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.enums;

import java.util.Optional;

/**
 * Defines the PriceFormation values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceFormation {

    /**
     * Trade Not Contributing to the Price Discovery Process (TNCP)
     */
    TRADE_NOT_CONTRIBUTING_TO_THE_PRICE_DISCOVERY_PROCESS('J', "Trade Not Contributing to the Price Discovery Process (TNCP)"),

    /**
     * Price is Pending (PNDG)
     */
    PRICE_IS_PENDING('N', "Price is Pending (PNDG)");

    private final char wire;

    private final String description;

    PriceFormation(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<PriceFormation> fromWire(char wire) {
        return switch (wire) {
            case 'J' -> Optional.of(TRADE_NOT_CONTRIBUTING_TO_THE_PRICE_DISCOVERY_PROCESS);
            case 'N' -> Optional.of(PRICE_IS_PENDING);
            default -> Optional.empty();
        };
    }
}
