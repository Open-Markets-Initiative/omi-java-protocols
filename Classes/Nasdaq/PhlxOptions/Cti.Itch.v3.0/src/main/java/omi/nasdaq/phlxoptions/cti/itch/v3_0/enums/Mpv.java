package omi.nasdaq.phlxoptions.cti.itch.v3_0.enums;

import java.util.Optional;

/**
 * Minimum Price Variation for this option: E = penny Everywhere, S = Scaled, P = penny Pilot
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Mpv {

    /**
     * Penny Everywhere: all prices are in penny increments
     */
    PENNY_EVERYWHERE('E', "Penny Everywhere: all prices are in penny increments"),

    /**
     * Scaled: prices below $3.00 are in increments of $0.05, prices above $3.00 are in increments of $0.10
     */
    SCALED('S', "Scaled: prices below $3.00 are in increments of $0.05, prices above $3.00 are in increments of $0.10"),

    /**
     * Penny Pilot: prices below $3.00 are in increments of $0.01, prices above $3.00 are in increments of $0.05
     */
    PENNY_PILOT('P', "Penny Pilot: prices below $3.00 are in increments of $0.01, prices above $3.00 are in increments of $0.05");

    private final char wire;

    private final String description;

    Mpv(char wire, String description) {
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
    public static Optional<Mpv> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(PENNY_EVERYWHERE);
            case 'S' -> Optional.of(SCALED);
            case 'P' -> Optional.of(PENNY_PILOT);
            default -> Optional.empty();
        };
    }
}
