package omi.hkex.hkexsecurities.fulltick.omd.v1_46.enums;

import java.util.Optional;

/**
 * Status of the current trading session.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSesStatus {

    /**
     * Unknown For No
     */
    UNKNOWN_FOR_NO((short) 0, "Unknown For No"),

    /**
     * Halted For Ei
     */
    HALTED_FOR_EI((short) 10, "Halted For Ei"),

    /**
     * Pre Open For Pos Oi Nw Rm Ma Bl
     */
    PRE_OPEN_FOR_POS_OI_NW_RM_MA_BL((short) 20, "Pre Open For Pos Oi Nw Rm Ma Bl"),

    /**
     * Open For Ct And Oc
     */
    OPEN_FOR_CT_AND_OC((short) 30, "Open For Ct And Oc"),

    /**
     * Pre Close For Cas Rp Oi Nw Rc Ma
     */
    PRE_CLOSE_FOR_CAS_RP_OI_NW_RC_MA((short) 40, "Pre Close For Cas Rp Oi Nw Rc Ma"),

    /**
     * Closed For Cl
     */
    CLOSED_FOR_CL((short) 50, "Closed For Cl"),

    /**
     * Day Closed For Dc
     */
    DAY_CLOSED_FOR_DC((short) 100, "Day Closed For Dc");

    private final short wire;

    private final String description;

    TradingSesStatus(short wire, String description) {
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
    public static Optional<TradingSesStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNKNOWN_FOR_NO);
            case 10 -> Optional.of(HALTED_FOR_EI);
            case 20 -> Optional.of(PRE_OPEN_FOR_POS_OI_NW_RM_MA_BL);
            case 30 -> Optional.of(OPEN_FOR_CT_AND_OC);
            case 40 -> Optional.of(PRE_CLOSE_FOR_CAS_RP_OI_NW_RC_MA);
            case 50 -> Optional.of(CLOSED_FOR_CL);
            case 100 -> Optional.of(DAY_CLOSED_FOR_DC);
            default -> Optional.empty();
        };
    }
}
