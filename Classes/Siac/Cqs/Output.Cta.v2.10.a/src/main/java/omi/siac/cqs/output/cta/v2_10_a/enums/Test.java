package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Identifies whether the security symbol is a test symbol
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Test {

    /**
     * Not A Test Symbol
     */
    NOT_A_TEST_SYMBOL('0', "Not A Test Symbol"),

    /**
     * Test Symbol
     */
    TEST_SYMBOL('1', "Test Symbol");

    private final char wire;

    private final String description;

    Test(char wire, String description) {
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
    public static Optional<Test> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NOT_A_TEST_SYMBOL);
            case '1' -> Optional.of(TEST_SYMBOL);
            default -> Optional.empty();
        };
    }
}
