package omi.odx.odxsecuritytoken.pts.itch.v1_0.enums;

import java.util.Optional;

/**
 * Y = trade occurred at the cross.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OccurredAsCross {

    /**
     * Trade Occurred At The Cross
     */
    TRADE_OCCURRED_AT_THE_CROSS('Y', "Trade Occurred At The Cross");

    private final char wire;

    private final String description;

    OccurredAsCross(char wire, String description) {
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
    public static Optional<OccurredAsCross> fromWire(char wire) {
        return wire == 'Y' ? Optional.of(TRADE_OCCURRED_AT_THE_CROSS) : Optional.empty();
    }
}
