package omi.nasdaq.iseoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * Type of the execution being reported: A=Execution of an order for a simple instrument (option), B=Execution of an order for a complex instrument, C=Execution of an option leg of a complex order, D=Execution of a stock leg of a complex order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrdExecType {

    /**
     * Execution of an order for a simple instrument (option)
     */
    SIMPLE_INSTRUMENT('A', "Execution of an order for a simple instrument (option)"),

    /**
     * Execution of an order for a complex instrument
     */
    COMPLEX_INSTRUMENT('B', "Execution of an order for a complex instrument"),

    /**
     * Execution of an option leg of a complex order
     */
    COMPLEX_OPTION_LEG('C', "Execution of an option leg of a complex order"),

    /**
     * Execution of a stock leg of a complex order
     */
    COMPLEX_STOCK_LEG('D', "Execution of a stock leg of a complex order");

    private final char wire;

    private final String description;

    OrdExecType(char wire, String description) {
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
    public static Optional<OrdExecType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(SIMPLE_INSTRUMENT);
            case 'B' -> Optional.of(COMPLEX_INSTRUMENT);
            case 'C' -> Optional.of(COMPLEX_OPTION_LEG);
            case 'D' -> Optional.of(COMPLEX_STOCK_LEG);
            default -> Optional.empty();
        };
    }
}
