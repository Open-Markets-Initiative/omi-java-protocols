package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * Risk User – type of firm that owns the risk control represented by this message. E = Entering Firm, C = Clearing Firm, O = Options Market Maker Firm.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RiskUserType {

    /**
     * Entering Firm
     */
    ENTERING_FIRM('E', "Entering Firm"),

    /**
     * Clearing Firm
     */
    CLEARING_FIRM('C', "Clearing Firm");

    private final char wire;

    private final String description;

    RiskUserType(char wire, String description) {
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
    public static Optional<RiskUserType> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(ENTERING_FIRM);
            case 'C' -> Optional.of(CLEARING_FIRM);
            default -> Optional.empty();
        };
    }
}
