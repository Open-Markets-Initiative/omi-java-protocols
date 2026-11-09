package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * multiLegModel
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MultiLegModel {

    /**
     * Predefined Multileg Security.
     */
    PREDEFINED((short) 0, "Predefined Multileg Security."),

    /**
     * User-Defined Multileg Security.
     */
    USER_DEFINED((short) 1, "User-Defined Multileg Security."),

    /**
     * multiLegModel
     */
    NO_VALUE((short) 255, "multiLegModel");

    private final short wire;

    private final String description;

    MultiLegModel(short wire, String description) {
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
    public static Optional<MultiLegModel> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(PREDEFINED);
            case 1 -> Optional.of(USER_DEFINED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
