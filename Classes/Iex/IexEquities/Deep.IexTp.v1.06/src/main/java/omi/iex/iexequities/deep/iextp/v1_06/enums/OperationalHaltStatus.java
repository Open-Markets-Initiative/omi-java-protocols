package omi.iex.iexequities.deep.iextp.v1_06.enums;

import java.util.Optional;

/**
 * Operational halt status identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OperationalHaltStatus {

    /**
     * Iex Specific Operational Trading Halt
     */
    IEX_SPECIFIC_OPERATIONAL_TRADING_HALT('O', "Iex Specific Operational Trading Halt"),

    /**
     * Not Operationally Halted On Iex
     */
    NOT_OPERATIONALLY_HALTED_ON_IEX('N', "Not Operationally Halted On Iex");

    private final char wire;

    private final String description;

    OperationalHaltStatus(char wire, String description) {
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
    public static Optional<OperationalHaltStatus> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(IEX_SPECIFIC_OPERATIONAL_TRADING_HALT);
            case 'N' -> Optional.of(NOT_OPERATIONALLY_HALTED_ON_IEX);
            default -> Optional.empty();
        };
    }
}
