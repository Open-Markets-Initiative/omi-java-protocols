package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the RootPartySubIdType values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum RootPartySubIdType {

    /**
     * Buyer
     */
    BUYER(4001, "Buyer"),

    /**
     * Seller
     */
    SELLER(4002, "Seller"),

    /**
     * Broker
     */
    BROKER(4003, "Broker"),

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value");

    private final int wire;

    private final String description;

    RootPartySubIdType(int wire, String description) {
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
    public static Optional<RootPartySubIdType> fromWire(int wire) {
        return switch (wire) {
            case 4001 -> Optional.of(BUYER);
            case 4002 -> Optional.of(SELLER);
            case 4003 -> Optional.of(BROKER);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
