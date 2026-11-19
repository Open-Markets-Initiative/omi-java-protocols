package omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.enums;

import java.util.Optional;

/**
 * Reason code for a halt condition.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum HaltReason {

    /**
     * None
     */
    NONE(' ', "None"),

    /**
     * Business
     */
    BUSINESS('B', "Business"),

    /**
     * Cease Trading Order
     */
    CEASE_TRADING_ORDER('C', "Cease Trading Order"),

    /**
     * Ipo
     */
    IPO('I', "Ipo"),

    /**
     * Regulatory
     */
    REGULATORY('R', "Regulatory"),

    /**
     * Suspension
     */
    SUSPENSION('S', "Suspension");

    private final char wire;

    private final String description;

    HaltReason(char wire, String description) {
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
    public static Optional<HaltReason> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NONE);
            case 'B' -> Optional.of(BUSINESS);
            case 'C' -> Optional.of(CEASE_TRADING_ORDER);
            case 'I' -> Optional.of(IPO);
            case 'R' -> Optional.of(REGULATORY);
            case 'S' -> Optional.of(SUSPENSION);
            default -> Optional.empty();
        };
    }
}
