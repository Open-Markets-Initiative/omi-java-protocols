package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Capacity of customer placing the order. Used by futures exchanges to indicate the CTICode (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CustOrderCapacity {

    /**
     * Capacity of customer placing the order. Used by futures exchanges to indicate the CTICode (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)
     */
    NO_VALUE((short) 255, "Capacity of customer placing the order. Used by futures exchanges to indicate the CTICode (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)"),

    /**
     * Member trading for their own account
     */
    MEMBERTRADINGFORTHEIROWNACCOUNT((short) 1, "Member trading for their own account"),

    /**
     * Clearing firm trading for its proprietary account
     */
    CLEARINGFIRMTRADINGFORITSPROPRIETARYACCOUNT((short) 2, "Clearing firm trading for its proprietary account"),

    /**
     * Member trading for anothermember
     */
    MEMBERTRADINGFORANOTHERMEMBER((short) 3, "Member trading for anothermember"),

    /**
     * All other
     */
    ALLOTHER((short) 4, "All other");

    private final short wire;

    private final String description;

    CustOrderCapacity(short wire, String description) {
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
    public static Optional<CustOrderCapacity> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 1 -> Optional.of(MEMBERTRADINGFORTHEIROWNACCOUNT);
            case 2 -> Optional.of(CLEARINGFIRMTRADINGFORITSPROPRIETARYACCOUNT);
            case 3 -> Optional.of(MEMBERTRADINGFORANOTHERMEMBER);
            case 4 -> Optional.of(ALLOTHER);
            default -> Optional.empty();
        };
    }
}
