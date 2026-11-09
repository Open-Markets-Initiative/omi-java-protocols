package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the RequestingPartySubIdType values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum RequestingPartySubIdType {

    /**
     * Requester
     */
    REQUESTER(5000, "Requester"),

    /**
     * Responder
     */
    RESPONDER(5001, "Responder"),

    /**
     * Both (Requester and Responder)
     */
    BOTH(5002, "Both (Requester and Responder)"),

    /**
     * System
     */
    SYSTEM(5003, "System"),

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value");

    private final int wire;

    private final String description;

    RequestingPartySubIdType(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<RequestingPartySubIdType> fromWire(int wire) {
        return switch (wire) {
            case 5000 -> Optional.of(REQUESTER);
            case 5001 -> Optional.of(RESPONDER);
            case 5002 -> Optional.of(BOTH);
            case 5003 -> Optional.of(SYSTEM);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
