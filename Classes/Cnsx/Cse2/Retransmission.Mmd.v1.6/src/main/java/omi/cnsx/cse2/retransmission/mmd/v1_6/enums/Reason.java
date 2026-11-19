package omi.cnsx.cse2.retransmission.mmd.v1_6.enums;

import java.util.Optional;

/**
 * Reason the trade was broken (see Broken Trade Reasons).
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Reason {

    /**
     * Supervisory The Trade Was Manually Broken By The Exchange
     */
    SUPERVISORY_THE_TRADE_WAS_MANUALLY_BROKEN_BY_THE_EXCHANGE('S', "Supervisory The Trade Was Manually Broken By The Exchange"),

    /**
     * Amended
     */
    AMENDED('A', "Amended");

    private final char wire;

    private final String description;

    Reason(char wire, String description) {
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
    public static Optional<Reason> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SUPERVISORY_THE_TRADE_WAS_MANUALLY_BROKEN_BY_THE_EXCHANGE);
            case 'A' -> Optional.of(AMENDED);
            default -> Optional.empty();
        };
    }
}
