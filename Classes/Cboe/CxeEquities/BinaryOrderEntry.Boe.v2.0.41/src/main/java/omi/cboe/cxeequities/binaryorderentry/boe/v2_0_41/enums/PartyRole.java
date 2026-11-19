package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.enums;

import java.util.Optional;

/**
 * Corresponds to PartyRole (452) in Cboe FIX. Contains the PartyRole specified on this leg on the trade capture, if any. Reflected back on trade capture report confirmations. 1 = ExecutingFirm (default) (if used, must be set on both sides. Is not permitted for bilateral trades) 2 = EnteringFirm (the party reporting the trade. Should not be used for the second leg) 3 = ContraFirm (the party the trade is alleged against)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PartyRole {

    /**
     * ExecutingFirm (default) (if used, must be set on both sides. Is not permitted for bilateral trades)
     */
    EXECUTING_FIRM('1', "ExecutingFirm (default) (if used, must be set on both sides. Is not permitted for bilateral trades)"),

    /**
     * EnteringFirm (the party reporting the trade. Should not be used for the second leg)
     */
    ENTERING_FIRM('2', "EnteringFirm (the party reporting the trade. Should not be used for the second leg)"),

    /**
     * ContraFirm (the party the trade is alleged against)
     */
    CONTRA_FIRM('3', "ContraFirm (the party the trade is alleged against)");

    private final char wire;

    private final String description;

    PartyRole(char wire, String description) {
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
    public static Optional<PartyRole> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(EXECUTING_FIRM);
            case '2' -> Optional.of(ENTERING_FIRM);
            case '3' -> Optional.of(CONTRA_FIRM);
            default -> Optional.empty();
        };
    }
}
