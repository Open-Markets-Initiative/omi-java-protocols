package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.enums;

import java.util.Optional;

/**
 * optionExpiryType
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum OptionExpiryType {

    /**
     * WEEKLY
     */
    WEEKLY((byte) 0, "WEEKLY"),

    /**
     * MONTHLY
     */
    MONTHLY((byte) 1, "MONTHLY");

    private final byte wire;

    private final String description;

    OptionExpiryType(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<OptionExpiryType> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(WEEKLY);
            case 1 -> Optional.of(MONTHLY);
            default -> Optional.empty();
        };
    }
}
