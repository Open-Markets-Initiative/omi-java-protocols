package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry. 1 = Automated Improvement Mechanism (AIM) 2 = Qualified Contingent Cross (QCC) 3 = Solicitation Cross (SAM) 4 = Position Compression Cross (PCC) (C1 Only)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Automated Improvement Mechamism (AIM)
     */
    AUTOMATED_IMPROVEMENT_MECHAMISM('1', "Automated Improvement Mechamism (AIM)"),

    /**
     * Qualified Contingent Cross (QCC)
     */
    QUALIFIED_CONTINGENT_CROSS('2', "Qualified Contingent Cross (QCC)"),

    /**
     * Solicitation Cross (SAM) (C1 and EDGX only)
     */
    SOLICITATION_CROSS('3', "Solicitation Cross (SAM) (C1 and EDGX only)"),

    /**
     * Position Compression Cross (PCC)* (C1 Only)
     */
    POSITION_COMPRESSION_CROSS('4', "Position Compression Cross (PCC)* (C1 Only)"),

    /**
     * Related Futures Cross (RFC) (C1 Only) *Entry of SPX versus SPXW as a complex spread is not supported for PCC.
     */
    RELATED_FUTURES_CROSS('5', "Related Futures Cross (RFC) (C1 Only) *Entry of SPX versus SPXW as a complex spread is not supported for PCC.");

    private final char wire;

    private final String description;

    CrossType(char wire, String description) {
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
    public static Optional<CrossType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(AUTOMATED_IMPROVEMENT_MECHAMISM);
            case '2' -> Optional.of(QUALIFIED_CONTINGENT_CROSS);
            case '3' -> Optional.of(SOLICITATION_CROSS);
            case '4' -> Optional.of(POSITION_COMPRESSION_CROSS);
            case '5' -> Optional.of(RELATED_FUTURES_CROSS);
            default -> Optional.empty();
        };
    }
}
