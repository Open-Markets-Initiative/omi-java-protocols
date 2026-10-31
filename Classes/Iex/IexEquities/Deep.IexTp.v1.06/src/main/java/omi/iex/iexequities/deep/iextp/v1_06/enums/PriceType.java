package omi.iex.iexequities.deep.iextp.v1_06.enums;

import java.util.Optional;

/**
 * Price type identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceType {

    /**
     * Iex Official Opening Price
     */
    IEX_OFFICIAL_OPENING_PRICE('Q', "Iex Official Opening Price"),

    /**
     * Iex Official Closing Price
     */
    IEX_OFFICIAL_CLOSING_PRICE('M', "Iex Official Closing Price");

    private final char wire;

    private final String description;

    PriceType(char wire, String description) {
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
    public static Optional<PriceType> fromWire(char wire) {
        return switch (wire) {
            case 'Q' -> Optional.of(IEX_OFFICIAL_OPENING_PRICE);
            case 'M' -> Optional.of(IEX_OFFICIAL_CLOSING_PRICE);
            default -> Optional.empty();
        };
    }
}
