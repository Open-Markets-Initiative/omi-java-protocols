package omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.enums;

import java.util.Optional;

/**
 * (Space) =Normal trade O=Opening trade1 S = Spread trade1 B = Block trade 1Sent for simple (non-spread) symbols only.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCondition {

    /**
     * Normal Trade
     */
    NORMAL_TRADE(' ', "Normal Trade"),

    /**
     * Sent for simple (non-spread) symbols only.
     */
    OPENING_TRADE('O', "Sent for simple (non-spread) symbols only."),

    /**
     * Sent for simple (non-spread) symbols only.
     */
    SPREAD_TRADE('S', "Sent for simple (non-spread) symbols only."),

    /**
     * Block Trade
     */
    BLOCK_TRADE('B', "Block Trade");

    private final char wire;

    private final String description;

    TradeCondition(char wire, String description) {
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
    public static Optional<TradeCondition> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NORMAL_TRADE);
            case 'O' -> Optional.of(OPENING_TRADE);
            case 'S' -> Optional.of(SPREAD_TRADE);
            case 'B' -> Optional.of(BLOCK_TRADE);
            default -> Optional.empty();
        };
    }
}
