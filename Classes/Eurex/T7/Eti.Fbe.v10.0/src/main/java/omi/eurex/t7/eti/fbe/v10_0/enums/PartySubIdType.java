package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the PartySubIdType values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum PartySubIdType {

    /**
     * Buyer
     */
    BUYER(14001, "Buyer"),

    /**
     * Seller
     */
    SELLER(14002, "Seller"),

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value");

    private final int wire;

    private final String description;

    PartySubIdType(int wire, String description) {
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
    public static Optional<PartySubIdType> fromWire(int wire) {
        return switch (wire) {
            case 14001 -> Optional.of(BUYER);
            case 14002 -> Optional.of(SELLER);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
