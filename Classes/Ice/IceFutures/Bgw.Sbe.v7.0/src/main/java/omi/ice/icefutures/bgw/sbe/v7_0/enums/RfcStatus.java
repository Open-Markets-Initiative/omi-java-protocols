package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * rfcStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RfcStatus {

    /**
     * None
     */
    NONE((short) 0, "None"),

    /**
     * Success
     */
    SUCCESS((short) 1, "Success"),

    /**
     * PartialSuccessBidFailure
     */
    PARTIAL_SUCCESS_BID_FAILURE((short) 2, "PartialSuccessBidFailure"),

    /**
     * PartialSuccessOfferFailure
     */
    PARTIAL_SUCCESS_OFFER_FAILURE((short) 3, "PartialSuccessOfferFailure"),

    /**
     * Failure
     */
    FAILURE((short) 4, "Failure");

    private final short wire;

    private final String description;

    RfcStatus(short wire, String description) {
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
    public static Optional<RfcStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(SUCCESS);
            case 2 -> Optional.of(PARTIAL_SUCCESS_BID_FAILURE);
            case 3 -> Optional.of(PARTIAL_SUCCESS_OFFER_FAILURE);
            case 4 -> Optional.of(FAILURE);
            default -> Optional.empty();
        };
    }
}
