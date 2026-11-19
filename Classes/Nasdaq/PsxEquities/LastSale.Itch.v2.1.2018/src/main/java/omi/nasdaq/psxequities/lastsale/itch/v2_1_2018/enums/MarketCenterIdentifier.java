package omi.nasdaq.psxequities.lastsale.itch.v2_1_2018.enums;

import java.util.Optional;

/**
 * Denotes the PSX market system that generated the trade report message.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCenterIdentifier {

    /**
     * PSX execution system
     */
    PSX_EXECUTION_SYSTEM_B('B', "PSX execution system"),

    /**
     * PSX execution system
     */
    PSX_EXECUTION_SYSTEM_X('X', "PSX execution system");

    private final char wire;

    private final String description;

    MarketCenterIdentifier(char wire, String description) {
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
    public static Optional<MarketCenterIdentifier> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(PSX_EXECUTION_SYSTEM_B);
            case 'X' -> Optional.of(PSX_EXECUTION_SYSTEM_X);
            default -> Optional.empty();
        };
    }
}
