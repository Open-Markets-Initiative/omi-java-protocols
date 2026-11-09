package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * Code to represent the type of instrument attributes.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum InstrAttribType {

    /**
     * Trade type eligibility details for security.
     */
    TRADE_TYPE_ELIGIBILITY((short) 24, "Trade type eligibility details for security."),

    /**
     * Eligibility for GTD/GTC.
     */
    GTD_GTC_ELIGIBILITY((short) 34, "Eligibility for GTD/GTC.");

    private final short wire;

    private final String description;

    InstrAttribType(short wire, String description) {
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
    public static Optional<InstrAttribType> fromWire(short wire) {
        return switch (wire) {
            case 24 -> Optional.of(TRADE_TYPE_ELIGIBILITY);
            case 34 -> Optional.of(GTD_GTC_ELIGIBILITY);
            default -> Optional.empty();
        };
    }
}
