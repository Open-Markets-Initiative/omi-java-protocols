package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Last Capacity
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LastCapacity {

    /**
     * Dealing On Own Account
     */
    DEALING_ON_OWN_ACCOUNT('D', "Dealing On Own Account"),

    /**
     * Matched Principal
     */
    MATCHED_PRINCIPAL('M', "Matched Principal"),

    /**
     * Any Other Trading Capacity Blanco
     */
    ANY_OTHER_TRADING_CAPACITY_BLANCO('A', "Any Other Trading Capacity Blanco");

    private final char wire;

    private final String description;

    LastCapacity(char wire, String description) {
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
    public static Optional<LastCapacity> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(DEALING_ON_OWN_ACCOUNT);
            case 'M' -> Optional.of(MATCHED_PRINCIPAL);
            case 'A' -> Optional.of(ANY_OTHER_TRADING_CAPACITY_BLANCO);
            default -> Optional.empty();
        };
    }
}
