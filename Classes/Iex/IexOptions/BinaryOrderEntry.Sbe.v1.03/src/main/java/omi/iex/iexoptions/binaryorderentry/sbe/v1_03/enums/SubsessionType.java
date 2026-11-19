package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * subsessionType
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum SubsessionType {

    /**
     * ClientToGateway
     */
    CLIENT_TO_GATEWAY((byte) 0, "ClientToGateway"),

    /**
     * GatewayToClient
     */
    GATEWAY_TO_CLIENT((byte) 1, "GatewayToClient"),

    /**
     * ReferenceData
     */
    REFERENCE_DATA((byte) 2, "ReferenceData");

    private final byte wire;

    private final String description;

    SubsessionType(byte wire, String description) {
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
    public static Optional<SubsessionType> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(CLIENT_TO_GATEWAY);
            case 1 -> Optional.of(GATEWAY_TO_CLIENT);
            case 2 -> Optional.of(REFERENCE_DATA);
            default -> Optional.empty();
        };
    }
}
