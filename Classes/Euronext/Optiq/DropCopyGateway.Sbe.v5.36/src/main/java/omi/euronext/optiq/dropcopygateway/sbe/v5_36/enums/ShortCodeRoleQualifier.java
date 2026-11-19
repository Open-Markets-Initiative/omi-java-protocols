package omi.euronext.optiq.dropcopygateway.sbe.v5_36.enums;

import java.util.Optional;

/**
 * shortCodeRoleQualifier
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ShortCodeRoleQualifier {

    /**
     * Algorithm
     */
    ALGORITHM((short) 22, "Algorithm"),

    /**
     * Firm_or_Legal_Entity
     */
    FIRMOR_LEGAL_ENTITY((short) 23, "Firm_or_Legal_Entity"),

    /**
     * Natural_Person
     */
    NATURAL_PERSON((short) 24, "Natural_Person"),

    /**
     * shortCodeRoleQualifier
     */
    NO_VALUE((short) 255, "shortCodeRoleQualifier");

    private final short wire;

    private final String description;

    ShortCodeRoleQualifier(short wire, String description) {
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
    public static Optional<ShortCodeRoleQualifier> fromWire(short wire) {
        return switch (wire) {
            case 22 -> Optional.of(ALGORITHM);
            case 23 -> Optional.of(FIRMOR_LEGAL_ENTITY);
            case 24 -> Optional.of(NATURAL_PERSON);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
