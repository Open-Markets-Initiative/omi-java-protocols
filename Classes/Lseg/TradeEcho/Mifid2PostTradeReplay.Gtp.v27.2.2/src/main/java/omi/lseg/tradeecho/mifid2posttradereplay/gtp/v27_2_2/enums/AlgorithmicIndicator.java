package omi.lseg.tradeecho.mifid2posttradereplay.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Algorithmic indicator short code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AlgorithmicIndicator {

    /**
     * Algorithmic Trade
     */
    ALGORITHMIC_TRADE('H', "Algorithmic Trade"),

    /**
     * Not An Algorithmic Trade
     */
    NOT_AN_ALGORITHMIC_TRADE('-', "Not An Algorithmic Trade");

    private final char wire;

    private final String description;

    AlgorithmicIndicator(char wire, String description) {
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
    public static Optional<AlgorithmicIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(ALGORITHMIC_TRADE);
            case '-' -> Optional.of(NOT_AN_ALGORITHMIC_TRADE);
            default -> Optional.empty();
        };
    }
}
