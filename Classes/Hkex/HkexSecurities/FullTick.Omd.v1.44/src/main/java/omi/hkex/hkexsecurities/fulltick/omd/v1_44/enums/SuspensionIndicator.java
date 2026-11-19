package omi.hkex.hkexsecurities.fulltick.omd.v1_44.enums;

import java.util.Optional;

/**
 * Indicate whether the security is currently halted/suspended for trading. 'Resume' means the security is now available for trading.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SuspensionIndicator {

    /**
     * Trading Halt Or Suspend
     */
    TRADING_HALT_OR_SUSPEND((short) 2, "Trading Halt Or Suspend"),

    /**
     * Resume
     */
    RESUME((short) 3, "Resume");

    private final short wire;

    private final String description;

    SuspensionIndicator(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<SuspensionIndicator> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(TRADING_HALT_OR_SUSPEND);
            case 3 -> Optional.of(RESUME);
            default -> Optional.empty();
        };
    }
}
