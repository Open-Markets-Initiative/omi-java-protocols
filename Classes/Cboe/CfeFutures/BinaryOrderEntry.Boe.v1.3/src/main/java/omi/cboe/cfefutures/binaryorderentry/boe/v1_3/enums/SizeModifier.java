package omi.cboe.cfefutures.binaryorderentry.boe.v1_3.enums;

import java.util.Optional;

/**
 * Controls the behavior of the OrderQty field. Using “R” allows for a TPH to ensure that in-flight fills or cancels do not result in unwanted additional size exposure.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SizeModifier {

    /**
     * Reduce
     */
    REDUCE('R', "Reduce");

    private final char wire;

    private final String description;

    SizeModifier(char wire, String description) {
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
    public static Optional<SizeModifier> fromWire(char wire) {
        return wire == 'R' ? Optional.of(REDUCE) : Optional.empty();
    }
}
