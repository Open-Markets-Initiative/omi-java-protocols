package omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.enums;

import java.util.Optional;

/**
 * Indicates the quoting participant's registration status in relation to SEC Rules 101 and 104 of Regulation M
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketMakerMode {

    /**
     * Normal
     */
    NORMAL('N', "Normal"),

    /**
     * Passive
     */
    PASSIVE('P', "Passive"),

    /**
     * Syndicate
     */
    SYNDICATE('S', "Syndicate"),

    /**
     * Pre-Syndicate
     */
    PRE_SYNDICATE('R', "Pre-Syndicate"),

    /**
     * Penalty
     */
    PENALTY('L', "Penalty");

    private final char wire;

    private final String description;

    MarketMakerMode(char wire, String description) {
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
    public static Optional<MarketMakerMode> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL);
            case 'P' -> Optional.of(PASSIVE);
            case 'S' -> Optional.of(SYNDICATE);
            case 'R' -> Optional.of(PRE_SYNDICATE);
            case 'L' -> Optional.of(PENALTY);
            default -> Optional.empty();
        };
    }
}
