package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.enums;

import java.util.Optional;

/**
 * The reason for this Quote Restated message. Q = Liquidity W = Wash CFE reserves the right to add new values as necessary without prior notice.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RestatementReason {

    /**
     * Liquidity
     */
    LIQUIDITY('Q', "Liquidity"),

    /**
     * Wash CFE reserves the right to add new values as necessary without prior notice.
     */
    WASH('W', "Wash CFE reserves the right to add new values as necessary without prior notice.");

    private final char wire;

    private final String description;

    RestatementReason(char wire, String description) {
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
    public static Optional<RestatementReason> fromWire(char wire) {
        return switch (wire) {
            case 'Q' -> Optional.of(LIQUIDITY);
            case 'W' -> Optional.of(WASH);
            default -> Optional.empty();
        };
    }
}
