package omi.lme.lmeselect.level1.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Trading State.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingState {

    /**
     * Pre Open
     */
    PRE_OPEN((short) 1, "Pre Open"),

    /**
     * Open
     */
    OPEN((short) 2, "Open"),

    /**
     * Post Trade
     */
    POST_TRADE((short) 3, "Post Trade"),

    /**
     * Close
     */
    CLOSE((short) 4, "Close"),

    /**
     * Technical Halt
     */
    TECHNICAL_HALT((short) 6, "Technical Halt");

    private final short wire;

    private final String description;

    TradingState(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<TradingState> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PRE_OPEN);
            case 2 -> Optional.of(OPEN);
            case 3 -> Optional.of(POST_TRADE);
            case 4 -> Optional.of(CLOSE);
            case 6 -> Optional.of(TECHNICAL_HALT);
            default -> Optional.empty();
        };
    }
}
