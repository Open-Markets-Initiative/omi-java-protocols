package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.enums;

import java.util.Optional;

/**
 * Corresponds to LegPositionEffect (564) in Cboe FIX. Indicates status of client position in option for this leg. O = Open C = Close N = None Orders must specify LegPositionEffect. How- ever, orders with AccountType value of 3 (House Trader) may specify a value of “N” for each leg. For House Trader, this repeating group is only needed if a non-zero value of NoLegs is used.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegPositionEffect {

    /**
     * Open
     */
    OPEN('O', "Open"),

    /**
     * Close
     */
    CLOSE('C', "Close"),

    /**
     * None Orders must specify LegPositionEffect. How- ever, orders with AccountType value of 3 (House Trader) may specify a value of “N” for each leg. For House Trader, this repeating group is only needed if a non-zero value of NoLegs is used.
     */
    NONE('N', "None Orders must specify LegPositionEffect. How- ever, orders with AccountType value of 3 (House Trader) may specify a value of \u201CN\u201D for each leg. For House Trader, this repeating group is only needed if a non-zero value of NoLegs is used.");

    private final char wire;

    private final String description;

    LegPositionEffect(char wire, String description) {
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
    public static Optional<LegPositionEffect> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPEN);
            case 'C' -> Optional.of(CLOSE);
            case 'N' -> Optional.of(NONE);
            default -> Optional.empty();
        };
    }
}
