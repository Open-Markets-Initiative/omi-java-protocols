package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * legSecurityType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LegSecurityType {

    /**
     * FUT
     */
    FUT((short) 1, "FUT"),

    /**
     * OPT
     */
    OPT((short) 2, "OPT"),

    /**
     * CommonStock
     */
    COMMON_STOCK((short) 3, "CommonStock"),

    /**
     * MLEG
     */
    MLEG((short) 4, "MLEG");

    private final short wire;

    private final String description;

    LegSecurityType(short wire, String description) {
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
    public static Optional<LegSecurityType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(FUT);
            case 2 -> Optional.of(OPT);
            case 3 -> Optional.of(COMMON_STOCK);
            case 4 -> Optional.of(MLEG);
            default -> Optional.empty();
        };
    }
}
