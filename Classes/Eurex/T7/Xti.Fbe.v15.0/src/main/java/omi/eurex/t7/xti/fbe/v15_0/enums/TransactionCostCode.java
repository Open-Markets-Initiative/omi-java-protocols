package omi.eurex.t7.xti.fbe.v15_0.enums;

import java.util.Optional;

/**
 * Defines the TransactionCostCode values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TransactionCostCode {

    /**
     * No additional cost
     */
    NOADDITIONALCOST((short) 0, "No additional cost"),

    /**
     * FC (Franco Courtage)
     */
    FRANCO_COURTAGE((short) 1, "FC (Franco Courtage)"),

    /**
     * FR (Franco Rechnung)
     */
    FRANCO_RECHNUNG((short) 2, "FR (Franco Rechnung)"),

    /**
     * AC (Abweichendes Courtage)
     */
    ABWEICHENDES_COURTAGE((short) 3, "AC (Abweichendes Courtage)"),

    /**
     * SP (Spesen)
     */
    SPESEN((short) 4, "SP (Spesen)"),

    /**
     * PR (Provision)
     */
    PROVISION((short) 5, "PR (Provision)"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TransactionCostCode(short wire, String description) {
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
    public static Optional<TransactionCostCode> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOADDITIONALCOST);
            case 1 -> Optional.of(FRANCO_COURTAGE);
            case 2 -> Optional.of(FRANCO_RECHNUNG);
            case 3 -> Optional.of(ABWEICHENDES_COURTAGE);
            case 4 -> Optional.of(SPESEN);
            case 5 -> Optional.of(PROVISION);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
