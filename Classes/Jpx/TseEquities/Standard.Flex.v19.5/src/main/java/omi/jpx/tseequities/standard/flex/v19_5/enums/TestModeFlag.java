package omi.jpx.tseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the flag for identifying the distinction between Production and Test Operation.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TestModeFlag {

    /**
     * Production Operation
     */
    PRODUCTION_OPERATION('1', "Production Operation"),

    /**
     * Test Operation
     */
    TEST_OPERATION('2', "Test Operation");

    private final char wire;

    private final String description;

    TestModeFlag(char wire, String description) {
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
    public static Optional<TestModeFlag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(PRODUCTION_OPERATION);
            case '2' -> Optional.of(TEST_OPERATION);
            default -> Optional.empty();
        };
    }
}
