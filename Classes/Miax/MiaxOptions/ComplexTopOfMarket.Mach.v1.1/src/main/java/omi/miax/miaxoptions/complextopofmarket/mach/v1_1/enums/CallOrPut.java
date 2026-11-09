package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.enums;

import java.util.Optional;

/**
 * Option Type: “C” = Call, “P” = Put
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CallOrPut {

    /**
     * Call Option Type
     */
    CALL('C', "Call Option Type"),

    /**
     * Put Option Type
     */
    PUT('P', "Put Option Type");

    private final char wire;

    private final String description;

    CallOrPut(char wire, String description) {
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
    public static Optional<CallOrPut> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CALL);
            case 'P' -> Optional.of(PUT);
            default -> Optional.empty();
        };
    }
}
