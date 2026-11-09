package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the SideTrdSubTyp values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum SideTrdSubTyp {

    /**
     * Block Trade
     */
    BLOCK_TRADE(2001, "Block Trade"),

    /**
     * Trade at Market
     */
    TRADEAT_MARKET(2004, "Trade at Market"),

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value");

    private final int wire;

    private final String description;

    SideTrdSubTyp(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<SideTrdSubTyp> fromWire(int wire) {
        return switch (wire) {
            case 2001 -> Optional.of(BLOCK_TRADE);
            case 2004 -> Optional.of(TRADEAT_MARKET);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
