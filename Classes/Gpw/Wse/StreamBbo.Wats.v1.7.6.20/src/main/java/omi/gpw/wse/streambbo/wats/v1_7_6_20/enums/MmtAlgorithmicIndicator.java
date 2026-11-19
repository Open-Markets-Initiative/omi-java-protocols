package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * MMT Algorithmic Indicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmtAlgorithmicIndicator {

    /**
     * H = Algorithmic Trade
     */
    ALGORITHMIC_TRADE((short) 1, "H = Algorithmic Trade"),

    /**
     * - = No Algorithmic Trade
     */
    NO_ALGORITHMIC_TRADE((short) 2, "- = No Algorithmic Trade");

    private final short wire;

    private final String description;

    MmtAlgorithmicIndicator(short wire, String description) {
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
    public static Optional<MmtAlgorithmicIndicator> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ALGORITHMIC_TRADE);
            case 2 -> Optional.of(NO_ALGORITHMIC_TRADE);
            default -> Optional.empty();
        };
    }
}
