package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

import java.util.Optional;

/**
 * Defines the ScopeIdentifier values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ScopeIdentifier {

    /**
     * MEMBER SUSPENSION
     */
    MEMBERSUSPENSION((short) 1, "MEMBER SUSPENSION"),

    /**
     * POSITION LIMIT SUSPENSION
     */
    POSITIONLIMITSUSPENSION((short) 2, "POSITION LIMIT SUSPENSION"),

    /**
     * COLLATERAL_SUSPENSION
     */
    COLLATERALSUSPENSION((short) 3, "COLLATERAL_SUSPENSION"),

    /**
     * COOLINGOFF_SUSPENSION
     */
    COOLINGOFFSUSPENSION((short) 4, "COOLINGOFF_SUSPENSION"),

    /**
     * POSITION LIMIT RRM
     */
    POSITIONLIMITRRM((short) 5, "POSITION LIMIT RRM"),

    /**
     * MARKET
     */
    MARKET((short) 6, "MARKET"),

    /**
     * COOLINGOFF RRM
     */
    COOLINGOFFRRM((short) 7, "COOLINGOFF RRM"),

    /**
     * COLLATERAL RRM
     */
    COLLATERALRRM((short) 8, "COLLATERAL RRM"),

    /**
     * POSITION LIMIT RRM(NEAR MONTH CONTRACT)
     */
    POSITIONLIMITRRMNEAR((short) 9, "POSITION LIMIT RRM(NEAR MONTH CONTRACT)"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    ScopeIdentifier(short wire, String description) {
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
    public static Optional<ScopeIdentifier> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(MEMBERSUSPENSION);
            case 2 -> Optional.of(POSITIONLIMITSUSPENSION);
            case 3 -> Optional.of(COLLATERALSUSPENSION);
            case 4 -> Optional.of(COOLINGOFFSUSPENSION);
            case 5 -> Optional.of(POSITIONLIMITRRM);
            case 6 -> Optional.of(MARKET);
            case 7 -> Optional.of(COOLINGOFFRRM);
            case 8 -> Optional.of(COLLATERALRRM);
            case 9 -> Optional.of(POSITIONLIMITRRMNEAR);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
