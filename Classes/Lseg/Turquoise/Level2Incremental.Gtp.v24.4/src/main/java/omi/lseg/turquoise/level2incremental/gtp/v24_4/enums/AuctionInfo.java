package omi.lseg.turquoise.level2incremental.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Populated if the Statistic Type is 1:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionInfo {

    /**
     * Call Market
     */
    CALL_MARKET('M', "Call Market");

    private final char wire;

    private final String description;

    AuctionInfo(char wire, String description) {
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
    public static Optional<AuctionInfo> fromWire(char wire) {
        return wire == 'M' ? Optional.of(CALL_MARKET) : Optional.empty();
    }
}
