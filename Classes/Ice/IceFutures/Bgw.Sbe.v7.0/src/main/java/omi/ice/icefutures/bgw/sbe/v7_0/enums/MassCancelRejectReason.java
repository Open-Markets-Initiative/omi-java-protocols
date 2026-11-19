package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * massCancelRejectReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassCancelRejectReason {

    /**
     * Unsupported
     */
    UNSUPPORTED((short) 0, "Unsupported"),

    /**
     * InvalidTradingSession
     */
    INVALID_TRADING_SESSION((short) 6, "InvalidTradingSession"),

    /**
     * InvalidMarket
     */
    INVALID_MARKET((short) 7, "InvalidMarket"),

    /**
     * Other
     */
    OTHER((short) 99, "Other");

    private final short wire;

    private final String description;

    MassCancelRejectReason(short wire, String description) {
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
    public static Optional<MassCancelRejectReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNSUPPORTED);
            case 6 -> Optional.of(INVALID_TRADING_SESSION);
            case 7 -> Optional.of(INVALID_MARKET);
            case 99 -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
