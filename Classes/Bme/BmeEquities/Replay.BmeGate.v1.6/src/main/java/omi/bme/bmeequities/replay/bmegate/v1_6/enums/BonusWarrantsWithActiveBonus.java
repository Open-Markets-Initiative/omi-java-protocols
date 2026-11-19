package omi.bme.bmeequities.replay.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Indicates whether the bonus is active or not (bonus)
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BonusWarrantsWithActiveBonus {

    /**
     * False
     */
    FALSE((short) 0, "False"),

    /**
     * True
     */
    TRUE((short) 1, "True"),

    /**
     * 0xFF: Undefined (Only for optional, not mandatory, Flag/Boolean fields)
     */
    NO_VALUE((short) 255, "0xFF: Undefined (Only for optional, not mandatory, Flag/Boolean fields)");

    private final short wire;

    private final String description;

    BonusWarrantsWithActiveBonus(short wire, String description) {
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
    public static Optional<BonusWarrantsWithActiveBonus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(FALSE);
            case 1 -> Optional.of(TRUE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
