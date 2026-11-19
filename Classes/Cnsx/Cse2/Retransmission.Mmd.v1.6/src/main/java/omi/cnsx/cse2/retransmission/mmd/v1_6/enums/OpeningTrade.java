package omi.cnsx.cse2.retransmission.mmd.v1_6.enums;

import java.util.Optional;

/**
 * "Y" = Opening Trade, "N" = Not Opening Trade.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpeningTrade {

    /**
     * Opening Trade
     */
    OPENING_TRADE('Y', "Opening Trade"),

    /**
     * Not Opening Trade
     */
    NOT_OPENING_TRADE('N', "Not Opening Trade");

    private final char wire;

    private final String description;

    OpeningTrade(char wire, String description) {
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
    public static Optional<OpeningTrade> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(OPENING_TRADE);
            case 'N' -> Optional.of(NOT_OPENING_TRADE);
            default -> Optional.empty();
        };
    }
}
