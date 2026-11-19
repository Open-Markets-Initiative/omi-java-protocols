package omi.nasdaq.iseoptions.cti.itch.v3_0.enums;

import java.util.Optional;

/**
 * C = Call, P = Put, space = Stock leg
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegOptionKind {

    /**
     * Call
     */
    CALL('C', "Call"),

    /**
     * Put
     */
    PUT('P', "Put"),

    /**
     * Stock leg
     */
    STOCK_LEG(' ', "Stock leg");

    private final char wire;

    private final String description;

    LegOptionKind(char wire, String description) {
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
    public static Optional<LegOptionKind> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CALL);
            case 'P' -> Optional.of(PUT);
            case ' ' -> Optional.of(STOCK_LEG);
            default -> Optional.empty();
        };
    }
}
