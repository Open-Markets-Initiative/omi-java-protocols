package omi.lseg.turquoise.replay.gtp.v26_3.enums;

import java.util.Optional;

/**
 * Modification Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ModificationIndicator {

    /**
     * Trade Cancellation
     */
    TRADE_CANCELLATION('C', "Trade Cancellation"),

    /**
     * Trade Amendment
     */
    TRADE_AMENDMENT('A', "Trade Amendment"),

    /**
     * New Trade
     */
    NEW_TRADE('-', "New Trade");

    private final char wire;

    private final String description;

    ModificationIndicator(char wire, String description) {
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
    public static Optional<ModificationIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(TRADE_CANCELLATION);
            case 'A' -> Optional.of(TRADE_AMENDMENT);
            case '-' -> Optional.of(NEW_TRADE);
            default -> Optional.empty();
        };
    }
}
