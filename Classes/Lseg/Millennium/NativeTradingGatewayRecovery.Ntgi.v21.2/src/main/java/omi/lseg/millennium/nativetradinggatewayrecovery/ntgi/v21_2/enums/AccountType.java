package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Clearing Account Type.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AccountType {

    /**
     * Client
     */
    CLIENT((short) 1, "Client");

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
        return wire == 1 ? Optional.of(CLIENT) : Optional.empty();
    }
}
