package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Session-level permission controlling eligible symbol types.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SymbolEligibility {

    /**
     * All Symbols (Production and Test Symbols)
     */
    ALL_SYMBOLS((short) 1, "All Symbols (Production and Test Symbols)"),

    /**
     * Test Symbols only
     */
    TEST_SYMBOLS_ONLY((short) 2, "Test Symbols only");

    private final short wire;

    private final String description;

    SymbolEligibility(short wire, String description) {
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
    public static Optional<SymbolEligibility> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ALL_SYMBOLS);
            case 2 -> Optional.of(TEST_SYMBOLS_ONLY);
            default -> Optional.empty();
        };
    }
}
