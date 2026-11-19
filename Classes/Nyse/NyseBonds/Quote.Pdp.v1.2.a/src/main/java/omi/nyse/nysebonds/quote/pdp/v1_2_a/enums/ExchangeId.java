package omi.nyse.nysebonds.quote.pdp.v1_2_a.enums;

import java.util.Optional;

/**
 * The originating exchange of the quote.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExchangeId {

    /**
     * Nyse
     */
    NYSE('N', "Nyse"),

    /**
     * Nyse Arca
     */
    NYSE_ARCA('P', "Nyse Arca");

    private final char wire;

    private final String description;

    ExchangeId(char wire, String description) {
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
    public static Optional<ExchangeId> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            default -> Optional.empty();
        };
    }
}
