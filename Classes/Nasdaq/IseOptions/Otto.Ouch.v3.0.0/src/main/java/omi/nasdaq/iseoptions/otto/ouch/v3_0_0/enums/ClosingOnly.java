package omi.nasdaq.iseoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * N=Unrestricted, Y=Option is Closing Position Only. Only MM origin orders can have open position in the series
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClosingOnly {

    /**
     * Unrestricted
     */
    UNRESTRICTED('N', "Unrestricted"),

    /**
     * Option is Closing Position Only. Only MM origin orders can have open position in the series
     */
    CLOSING_POSITION_ONLY('Y', "Option is Closing Position Only. Only MM origin orders can have open position in the series");

    private final char wire;

    private final String description;

    ClosingOnly(char wire, String description) {
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
    public static Optional<ClosingOnly> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(UNRESTRICTED);
            case 'Y' -> Optional.of(CLOSING_POSITION_ONLY);
            default -> Optional.empty();
        };
    }
}
