package omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.enums;

import java.util.Optional;

/**
 * Optional, only processed for Sell Short and Sell Short Exempt orders
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LocateReqd {

    /**
     * Client Affirms Ability To Borrow Default
     */
    CLIENT_AFFIRMS_ABILITY_TO_BORROW_DEFAULT('N', "Client Affirms Ability To Borrow Default"),

    /**
     * Client Does Not Affirm Ability To Borrow Results In Reject
     */
    CLIENT_DOES_NOT_AFFIRM_ABILITY_TO_BORROW_RESULTS_IN_REJECT('Y', "Client Does Not Affirm Ability To Borrow Results In Reject");

    private final char wire;

    private final String description;

    LocateReqd(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<LocateReqd> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(CLIENT_AFFIRMS_ABILITY_TO_BORROW_DEFAULT);
            case 'Y' -> Optional.of(CLIENT_DOES_NOT_AFFIRM_ABILITY_TO_BORROW_RESULTS_IN_REJECT);
            default -> Optional.empty();
        };
    }
}
