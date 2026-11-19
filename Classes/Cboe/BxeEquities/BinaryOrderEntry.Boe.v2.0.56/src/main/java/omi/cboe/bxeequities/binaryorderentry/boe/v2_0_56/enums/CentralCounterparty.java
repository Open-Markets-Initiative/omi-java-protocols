package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.enums;

import java.util.Optional;

/**
 * Defines the CentralCounterparty values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CentralCounterparty {

    /**
     * EuroCCP NV.
     */
    EURO_CCP_NV('E', "EuroCCP NV."),

    /**
     * LCH Ltd (London)
     */
    LCH_LTD('L', "LCH Ltd (London)"),

    /**
     * LCH SA (Paris)
     */
    LCH_SA('S', "LCH SA (Paris)"),

    /**
     * SIX x-clear
     */
    SIX_X_CLEAR('X', "SIX x-clear"),

    /**
     * None - Clearing Suppressed for self match.
     */
    NONE_CLEARING_SUPPRESSED_FOR_SELF_MATCH('N', "None - Clearing Suppressed for self match.");

    private final char wire;

    private final String description;

    CentralCounterparty(char wire, String description) {
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
    public static Optional<CentralCounterparty> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(EURO_CCP_NV);
            case 'L' -> Optional.of(LCH_LTD);
            case 'S' -> Optional.of(LCH_SA);
            case 'X' -> Optional.of(SIX_X_CLEAR);
            case 'N' -> Optional.of(NONE_CLEARING_SUPPRESSED_FOR_SELF_MATCH);
            default -> Optional.empty();
        };
    }
}
