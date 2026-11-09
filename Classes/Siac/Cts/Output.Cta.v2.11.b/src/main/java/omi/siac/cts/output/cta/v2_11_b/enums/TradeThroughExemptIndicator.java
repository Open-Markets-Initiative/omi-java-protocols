package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Denotes whether or not a trade is exempt (Rule 611)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeThroughExemptIndicator {

    /**
     * Not A Trade Through Exemption
     */
    NOT_A_TRADE_THROUGH_EXEMPTION('0', "Not A Trade Through Exemption"),

    /**
     * Trade Through Exemption
     */
    TRADE_THROUGH_EXEMPTION('1', "Trade Through Exemption");

    private final char wire;

    private final String description;

    TradeThroughExemptIndicator(char wire, String description) {
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
    public static Optional<TradeThroughExemptIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NOT_A_TRADE_THROUGH_EXEMPTION);
            case '1' -> Optional.of(TRADE_THROUGH_EXEMPTION);
            default -> Optional.empty();
        };
    }
}
