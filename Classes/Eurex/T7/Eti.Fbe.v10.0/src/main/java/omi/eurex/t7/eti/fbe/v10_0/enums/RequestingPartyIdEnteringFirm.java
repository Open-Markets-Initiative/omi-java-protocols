package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the RequestingPartyIdEnteringFirm values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RequestingPartyIdEnteringFirm {

    /**
     * Participant
     */
    PARTICIPANT((short) 1, "Participant"),

    /**
     * Market Supervision
     */
    MARKET_SUPERVISION((short) 2, "Market Supervision"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    RequestingPartyIdEnteringFirm(short wire, String description) {
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
    public static Optional<RequestingPartyIdEnteringFirm> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PARTICIPANT);
            case 2 -> Optional.of(MARKET_SUPERVISION);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
