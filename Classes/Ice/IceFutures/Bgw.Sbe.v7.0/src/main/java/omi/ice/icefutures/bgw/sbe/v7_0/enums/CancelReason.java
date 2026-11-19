package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * cancelReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CancelReason {

    /**
     * CanceledByUser
     */
    CANCELED_BY_USER((short) 0, "CanceledByUser"),

    /**
     * CanceledBySystem
     */
    CANCELED_BY_SYSTEM((short) 7, "CanceledBySystem"),

    /**
     * CanceledForReasonabilityLimits
     */
    CANCELED_FOR_REASONABILITY_LIMITS((short) 10, "CanceledForReasonabilityLimits"),

    /**
     * CanceledAtMarketClose
     */
    CANCELED_AT_MARKET_CLOSE((short) 11, "CanceledAtMarketClose"),

    /**
     * CanceledForIPL
     */
    CANCELED_FOR_IPL((short) 13, "CanceledForIPL"),

    /**
     * CanceledForIOC
     */
    CANCELED_FOR_IOC((short) 27, "CanceledForIOC"),

    /**
     * CanceledForFOK
     */
    CANCELED_FOR_FOK((short) 28, "CanceledForFOK"),

    /**
     * CanceledForMarket
     */
    CANCELED_FOR_MARKET((short) 31, "CanceledForMarket");

    private final short wire;

    private final String description;

    CancelReason(short wire, String description) {
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
    public static Optional<CancelReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(CANCELED_BY_USER);
            case 7 -> Optional.of(CANCELED_BY_SYSTEM);
            case 10 -> Optional.of(CANCELED_FOR_REASONABILITY_LIMITS);
            case 11 -> Optional.of(CANCELED_AT_MARKET_CLOSE);
            case 13 -> Optional.of(CANCELED_FOR_IPL);
            case 27 -> Optional.of(CANCELED_FOR_IOC);
            case 28 -> Optional.of(CANCELED_FOR_FOK);
            case 31 -> Optional.of(CANCELED_FOR_MARKET);
            default -> Optional.empty();
        };
    }
}
