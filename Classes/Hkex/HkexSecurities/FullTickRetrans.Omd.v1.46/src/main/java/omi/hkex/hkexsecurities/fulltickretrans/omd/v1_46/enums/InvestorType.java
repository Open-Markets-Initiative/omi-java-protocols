package omi.hkex.hkexsecurities.fulltickretrans.omd.v1_46.enums;

import java.util.Optional;

/**
 * Investor type of a bond security.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InvestorType {

    /**
     * Retail Investor
     */
    RETAIL_INVESTOR('R', "Retail Investor"),

    /**
     * Professional Investor
     */
    PROFESSIONAL_INVESTOR('P', "Professional Investor");

    private final char wire;

    private final String description;

    InvestorType(char wire, String description) {
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
    public static Optional<InvestorType> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(RETAIL_INVESTOR);
            case 'P' -> Optional.of(PROFESSIONAL_INVESTOR);
            default -> Optional.empty();
        };
    }
}
