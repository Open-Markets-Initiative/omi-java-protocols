package omi.lme.lmeselect.dailysummaries.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Type of open interest. The specification names this field Type; it is qualified here because the Reference FX Rate and Warrant Band messages give a Type of their own carrying different sets of values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpenInterestType {

    /**
     * Exchange
     */
    EXCHANGE('E', "Exchange"),

    /**
     * Market
     */
    MARKET('M', "Market");

    private final char wire;

    private final String description;

    OpenInterestType(char wire, String description) {
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
    public static Optional<OpenInterestType> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(EXCHANGE);
            case 'M' -> Optional.of(MARKET);
            default -> Optional.empty();
        };
    }
}
