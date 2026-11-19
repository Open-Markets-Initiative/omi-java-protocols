package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * UMIRRegulationID for Buy side
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BuyUmirRegulationId {

    /**
     * Significant Shareholder
     */
    SIGNIFICANT_SHAREHOLDER('S', "Significant Shareholder"),

    /**
     * Insider
     */
    INSIDER('I', "Insider");

    private final char wire;

    private final String description;

    BuyUmirRegulationId(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<BuyUmirRegulationId> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SIGNIFICANT_SHAREHOLDER);
            case 'I' -> Optional.of(INSIDER);
            default -> Optional.empty();
        };
    }
}
