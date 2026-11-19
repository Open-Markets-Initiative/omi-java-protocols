package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * execRestatementReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExecRestatementReason {

    /**
     * REPRICED
     */
    REPRICED((short) 3, "REPRICED"),

    /**
     * OTHER
     */
    OTHER((short) 99, "OTHER");

    private final short wire;

    private final String description;

    ExecRestatementReason(short wire, String description) {
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
    public static Optional<ExecRestatementReason> fromWire(short wire) {
        return switch (wire) {
            case 3 -> Optional.of(REPRICED);
            case 99 -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
