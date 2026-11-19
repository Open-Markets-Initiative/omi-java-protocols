package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

import java.util.Optional;

/**
 * Defines the AccountType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AccountType {

    /**
     * Own
     */
    OWN((short) 20, "Own"),

    /**
     * Client
     */
    CLIENT((short) 30, "Client"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    AccountType(short wire, String description) {
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
    public static Optional<AccountType> fromWire(short wire) {
        return switch (wire) {
            case 20 -> Optional.of(OWN);
            case 30 -> Optional.of(CLIENT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
