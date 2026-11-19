package omi.lseg.turquoise.replay.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Price Formation Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceFormationIndicator {

    /**
     * Plain Vanilla Trade
     */
    PLAIN_VANILLA_TRADE('P', "Plain Vanilla Trade");

    private final char wire;

    private final String description;

    PriceFormationIndicator(char wire, String description) {
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
    public static Optional<PriceFormationIndicator> fromWire(char wire) {
        return wire == 'P' ? Optional.of(PLAIN_VANILLA_TRADE) : Optional.empty();
    }
}
