package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * When market maker protection is triggered CME will not accept any new quotes from the market maker for that product group until it receives a mass quote message with the MMProtectionReset flag set to true
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmProtectionReset {

    /**
     * False, No
     */
    FALSE((short) 0, "False, No"),

    /**
     * True, Yes
     */
    TRUE((short) 1, "True, Yes");

    private final short wire;

    private final String description;

    MmProtectionReset(short wire, String description) {
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
    public static Optional<MmProtectionReset> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(FALSE);
            case 1 -> Optional.of(TRUE);
            default -> Optional.empty();
        };
    }
}
