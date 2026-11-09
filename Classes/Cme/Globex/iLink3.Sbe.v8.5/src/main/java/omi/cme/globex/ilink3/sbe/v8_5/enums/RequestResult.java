package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Status of party details list request
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RequestResult {

    /**
     * Valid Request
     */
    VALID_REQUEST((short) 0, "Valid Request"),

    /**
     * No Data Found That Matched Selection Criteria
     */
    NO_DATA_FOUND_THAT_MATCHED_SELECTION_CRITERIA((short) 2, "No Data Found That Matched Selection Criteria"),

    /**
     * Not Authorized to Retrieve Data
     */
    NOT_AUTHORIZEDTO_RETRIEVE_DATA((short) 3, "Not Authorized to Retrieve Data"),

    /**
     * Data Temporarily Unavailable
     */
    DATA_TEMPORARILY_UNAVAILABLE((short) 4, "Data Temporarily Unavailable");

    private final short wire;

    private final String description;

    RequestResult(short wire, String description) {
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
    public static Optional<RequestResult> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(VALID_REQUEST);
            case 2 -> Optional.of(NO_DATA_FOUND_THAT_MATCHED_SELECTION_CRITERIA);
            case 3 -> Optional.of(NOT_AUTHORIZEDTO_RETRIEVE_DATA);
            case 4 -> Optional.of(DATA_TEMPORARILY_UNAVAILABLE);
            default -> Optional.empty();
        };
    }
}
