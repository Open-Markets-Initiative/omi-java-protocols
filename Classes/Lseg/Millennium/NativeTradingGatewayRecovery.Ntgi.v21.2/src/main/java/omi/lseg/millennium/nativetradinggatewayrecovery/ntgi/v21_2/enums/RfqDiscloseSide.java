package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Instructs the system whether to disclose the side of the request as stated in the Side field to the market makers or not.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RfqDiscloseSide {

    /**
     * Do Not Disclose
     */
    DO_NOT_DISCLOSE((short) 0, "Do Not Disclose"),

    /**
     * Disclose
     */
    DISCLOSE((short) 1, "Disclose");

    private final short wire;

    private final String description;

    RfqDiscloseSide(short wire, String description) {
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
    public static Optional<RfqDiscloseSide> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DO_NOT_DISCLOSE);
            case 1 -> Optional.of(DISCLOSE);
            default -> Optional.empty();
        };
    }
}
