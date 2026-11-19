package omi.nasdaq.nsmequities.aggregated.itch.v2_0_2026.enums;

import java.util.Optional;

/**
 * Indicates the current operational halt status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OperationalHaltAction {

    /**
     * Operationally Halted on the identified Market
     */
    OPERATIONALLY_HALTED('H', "Operationally Halted on the identified Market"),

    /**
     * Operational Halt has been lifted and Trading resumed
     */
    TRADING_RESUMED('T', "Operational Halt has been lifted and Trading resumed");

    private final char wire;

    private final String description;

    OperationalHaltAction(char wire, String description) {
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
    public static Optional<OperationalHaltAction> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(OPERATIONALLY_HALTED);
            case 'T' -> Optional.of(TRADING_RESUMED);
            default -> Optional.empty();
        };
    }
}
