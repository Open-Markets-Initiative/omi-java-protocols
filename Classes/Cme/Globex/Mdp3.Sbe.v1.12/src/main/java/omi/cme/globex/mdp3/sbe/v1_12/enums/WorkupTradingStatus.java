package omi.cme.globex.mdp3.sbe.v1_12.enums;

import java.util.Optional;

/**
 * Identifies the trading status applicable to the instrument
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum WorkupTradingStatus {

    /**
     * Ready To Trade
     */
    READY_TO_TRADE((short) 17, "Ready To Trade"),

    /**
     * Not Available For Trading
     */
    NOT_AVAILABLE_FOR_TRADING((short) 18, "Not Available For Trading"),

    /**
     * Private Workup
     */
    PRIVATE_WORKUP((short) 201, "Private Workup"),

    /**
     * Public Workup
     */
    PUBLIC_WORKUP((short) 202, "Public Workup");

    private final short wire;

    private final String description;

    WorkupTradingStatus(short wire, String description) {
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
    public static Optional<WorkupTradingStatus> fromWire(short wire) {
        return switch (wire) {
            case 17 -> Optional.of(READY_TO_TRADE);
            case 18 -> Optional.of(NOT_AVAILABLE_FOR_TRADING);
            case 201 -> Optional.of(PRIVATE_WORKUP);
            case 202 -> Optional.of(PUBLIC_WORKUP);
            default -> Optional.empty();
        };
    }
}
