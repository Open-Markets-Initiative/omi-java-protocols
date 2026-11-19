package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * used to relate the status of the individual security or marketplace
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Action {

    /**
     * Trading Halt
     */
    TRADING_HALT('H', "Trading Halt"),

    /**
     * Quotation Resumption
     */
    QUOTATION_RESUMPTION('Q', "Quotation Resumption"),

    /**
     * Trading Resumption
     */
    TRADING_RESUMPTION('T', "Trading Resumption"),

    /**
     * Quotation and Trading Resumption
     */
    QUOTATION_AND_TRADING_RESUMPTION('X', "Quotation and Trading Resumption");

    private final char wire;

    private final String description;

    Action(char wire, String description) {
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
    public static Optional<Action> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(TRADING_HALT);
            case 'Q' -> Optional.of(QUOTATION_RESUMPTION);
            case 'T' -> Optional.of(TRADING_RESUMPTION);
            case 'X' -> Optional.of(QUOTATION_AND_TRADING_RESUMPTION);
            default -> Optional.empty();
        };
    }
}
