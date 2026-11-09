package omi.nyse.texasequities.integratedfeedrefresh.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * The current Market State, which this msg updates if the Security Status field contains a Market State Code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketState {

    /**
     * Pre Opening
     */
    PRE_OPENING('P', "Pre Opening"),

    /**
     * Early Session
     */
    EARLY_SESSION('E', "Early Session"),

    /**
     * Core Session
     */
    CORE_SESSION('O', "Core Session"),

    /**
     * Late Session Non Nyse Only
     */
    LATE_SESSION_NON_NYSE_ONLY('L', "Late Session Non Nyse Only"),

    /**
     * Closed
     */
    CLOSED('X', "Closed");

    private final char wire;

    private final String description;

    MarketState(char wire, String description) {
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
    public static Optional<MarketState> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PRE_OPENING);
            case 'E' -> Optional.of(EARLY_SESSION);
            case 'O' -> Optional.of(CORE_SESSION);
            case 'L' -> Optional.of(LATE_SESSION_NON_NYSE_ONLY);
            case 'X' -> Optional.of(CLOSED);
            default -> Optional.empty();
        };
    }
}
