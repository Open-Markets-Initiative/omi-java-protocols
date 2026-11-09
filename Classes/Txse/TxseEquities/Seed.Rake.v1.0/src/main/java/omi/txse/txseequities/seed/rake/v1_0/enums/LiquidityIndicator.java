package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum LiquidityIndicator. Added in 0.14.draft; absent in pre-0.14 senders, so it is a length-tolerant trailing field - present only when the frame extends past the preceding fields.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum LiquidityIndicator {

    /**
     * Removed hidden liquidity.
     */
    REMOVED_HIDDEN_LIQUIDITY((byte) 0, "Removed hidden liquidity."),

    /**
     * Removed displayed liquidity.
     */
    REMOVED_DISPLAYED_LIQUIDITY((byte) 1, "Removed displayed liquidity."),

    /**
     * Added hidden liquidity.
     */
    ADDED_HIDDEN_LIQUIDITY((byte) 2, "Added hidden liquidity."),

    /**
     * Added displayed liquidity.
     */
    ADDED_DISPLAYED_LIQUIDITY((byte) 3, "Added displayed liquidity."),

    /**
     * Execution from an auction cross.
     */
    AUCTION((byte) 4, "Execution from an auction cross.");

    private final byte wire;

    private final String description;

    LiquidityIndicator(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<LiquidityIndicator> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(REMOVED_HIDDEN_LIQUIDITY);
            case 1 -> Optional.of(REMOVED_DISPLAYED_LIQUIDITY);
            case 2 -> Optional.of(ADDED_HIDDEN_LIQUIDITY);
            case 3 -> Optional.of(ADDED_DISPLAYED_LIQUIDITY);
            case 4 -> Optional.of(AUCTION);
            default -> Optional.empty();
        };
    }
}
