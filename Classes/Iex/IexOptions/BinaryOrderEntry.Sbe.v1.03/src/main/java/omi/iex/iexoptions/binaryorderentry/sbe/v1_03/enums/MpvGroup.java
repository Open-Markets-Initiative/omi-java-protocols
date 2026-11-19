package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * mpvGroup
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum MpvGroup {

    /**
     * AllPenny
     */
    ALL_PENNY((byte) 0, "AllPenny"),

    /**
     * PennyNickel
     */
    PENNY_NICKEL((byte) 1, "PennyNickel"),

    /**
     * NickelDime
     */
    NICKEL_DIME((byte) 2, "NickelDime");

    private final byte wire;

    private final String description;

    MpvGroup(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<MpvGroup> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(ALL_PENNY);
            case 1 -> Optional.of(PENNY_NICKEL);
            case 2 -> Optional.of(NICKEL_DIME);
            default -> Optional.empty();
        };
    }
}
