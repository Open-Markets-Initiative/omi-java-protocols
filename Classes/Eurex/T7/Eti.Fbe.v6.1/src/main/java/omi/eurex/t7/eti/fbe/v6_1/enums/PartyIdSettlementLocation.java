package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the PartyIdSettlementLocation values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PartyIdSettlementLocation {

    /**
     * Clearstrem Banking Frankfurt
     */
    CLEARSTREM_BANKING_FRANKFURT((short) 1, "Clearstrem Banking Frankfurt"),

    /**
     * Clearstrem Banking Luxemburg
     */
    CLEARSTREM_BANKING_LUXEMBURG((short) 2, "Clearstrem Banking Luxemburg"),

    /**
     * CLS Group
     */
    CLS_GROUP((short) 3, "CLS Group"),

    /**
     * Euroclear
     */
    EUROCLEAR((short) 4, "Euroclear"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    PartyIdSettlementLocation(short wire, String description) {
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
    public static Optional<PartyIdSettlementLocation> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CLEARSTREM_BANKING_FRANKFURT);
            case 2 -> Optional.of(CLEARSTREM_BANKING_LUXEMBURG);
            case 3 -> Optional.of(CLS_GROUP);
            case 4 -> Optional.of(EUROCLEAR);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
