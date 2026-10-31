package omi.nasdaq.ntxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * Indicates if the Nasdaq security is set up for IPO release.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IpoFlag {

    /**
     * Nasdaq system only accepts round lots orders for this security.
     */
    IPO_SECURITY('Y', "Nasdaq system only accepts round lots orders for this security."),

    /**
     * Nasdaq system does not have any order size restrictions for this security. Odd and mixed lot orders are allowed.
     */
    NOT_IPO_SECURITY('N', "Nasdaq system does not have any order size restrictions for this security. Odd and mixed lot orders are allowed."),

    /**
     * Not available
     */
    NOT_AVAILABLE(' ', "Not available");

    private final char wire;

    private final String description;

    IpoFlag(char wire, String description) {
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
    public static Optional<IpoFlag> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(IPO_SECURITY);
            case 'N' -> Optional.of(NOT_IPO_SECURITY);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
