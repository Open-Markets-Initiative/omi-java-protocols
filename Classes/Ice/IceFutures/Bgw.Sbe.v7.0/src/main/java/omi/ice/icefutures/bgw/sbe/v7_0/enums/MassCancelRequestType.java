package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * massCancelRequestType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassCancelRequestType {

    /**
     * CancelForTradingSession
     */
    CANCEL_FOR_TRADING_SESSION((short) 6, "CancelForTradingSession"),

    /**
     * CancelAllForTrader
     */
    CANCEL_ALL_FOR_TRADER((short) 10, "CancelAllForTrader");

    private final short wire;

    private final String description;

    MassCancelRequestType(short wire, String description) {
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
    public static Optional<MassCancelRequestType> fromWire(short wire) {
        return switch (wire) {
            case 6 -> Optional.of(CANCEL_FOR_TRADING_SESSION);
            case 10 -> Optional.of(CANCEL_ALL_FOR_TRADER);
            default -> Optional.empty();
        };
    }
}
