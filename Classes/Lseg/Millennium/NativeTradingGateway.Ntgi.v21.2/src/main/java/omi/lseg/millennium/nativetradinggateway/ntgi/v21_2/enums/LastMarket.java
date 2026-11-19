package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Market (Segment MIC) where execution took place.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LastMarket {

    /**
     * Xlon On Exchange Lse Rm
     */
    XLON_ON_EXCHANGE_LSE_RM((short) 21, "Xlon On Exchange Lse Rm"),

    /**
     * Xlom On Exchange Non Aim Mtf
     */
    XLOM_ON_EXCHANGE_NON_AIM_MTF((short) 22, "Xlom On Exchange Non Aim Mtf"),

    /**
     * Aimx On Exchange Aim Mtf
     */
    AIMX_ON_EXCHANGE_AIM_MTF((short) 23, "Aimx On Exchange Aim Mtf");

    private final short wire;

    private final String description;

    LastMarket(short wire, String description) {
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
    public static Optional<LastMarket> fromWire(short wire) {
        return switch (wire) {
            case 21 -> Optional.of(XLON_ON_EXCHANGE_LSE_RM);
            case 22 -> Optional.of(XLOM_ON_EXCHANGE_NON_AIM_MTF);
            case 23 -> Optional.of(AIMX_ON_EXCHANGE_AIM_MTF);
            default -> Optional.empty();
        };
    }
}
