package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Corresponds to LegPositionEffect (564) in Cboe FIX. Indicates status of client position in option for this leg. O = Open C = Close N = None* *Only Orders with an OrderCapacity of ‘M’ or ‘N’ will be allowed to specify ‘N’ for LegPositionEffect. If the leg is limited to closing only transactions, onlyC apacity = M will be permitted to submit OpenClose = O if the order has TimeInForce = ‘3’ (IOC) and RoutingInst = B.
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
     * None* *Only Orders with an OrderCapacity of ‘M’ or ‘N’ will be allowed to specify ‘N’ for LegPositionEffect. If the leg is limited to closing only transactions, onlyC apacity = M will be permitted to submit OpenClose = O if the order has TimeInForce = ‘3’ (IOC) and RoutingInst = B.
     */
    NONE('N', "None* *Only Orders with an OrderCapacity of \u2018M\u2019 or \u2018N\u2019 will be allowed to specify \u2018N\u2019 for LegPositionEffect. If the leg is limited to closing only transactions, onlyC apacity = M will be permitted to submit OpenClose = O if the order has TimeInForce = \u20183\u2019 (IOC) and RoutingInst = B.");

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
