package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * accountType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AccountType {

    /**
     * REMOVE_ACCOUNT_INFORMATION
     */
    REMOVE_ACCOUNT_INFORMATION((short) 38, "REMOVE_ACCOUNT_INFORMATION"),

    /**
     * REGULAR_ACCOUNT
     */
    REGULAR_ACCOUNT((short) 39, "REGULAR_ACCOUNT"),

    /**
     * accountType
     */
    NO_VALUE((short) 0, "accountType");

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
            case 38 -> Optional.of(REMOVE_ACCOUNT_INFORMATION);
            case 39 -> Optional.of(REGULAR_ACCOUNT);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
