package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Response type: 1=Approve Manual Action Request, 2=Reject Manual Action Request.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ManualResponseType {

    /**
     * Approve Manual Action Request
     */
    APPROVE_MANUAL_ACTION_REQUEST((short) 1, "Approve Manual Action Request"),

    /**
     * Reject Manual Action Request
     */
    REJECT_MANUAL_ACTION_REQUEST((short) 2, "Reject Manual Action Request");

    private final short wire;

    private final String description;

    ManualResponseType(short wire, String description) {
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
    public static Optional<ManualResponseType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(APPROVE_MANUAL_ACTION_REQUEST);
            case 2 -> Optional.of(REJECT_MANUAL_ACTION_REQUEST);
            default -> Optional.empty();
        };
    }
}
