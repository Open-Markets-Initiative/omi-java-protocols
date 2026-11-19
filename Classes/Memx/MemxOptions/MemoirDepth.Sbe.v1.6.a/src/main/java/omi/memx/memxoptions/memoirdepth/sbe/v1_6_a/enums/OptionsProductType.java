package omi.memx.memxoptions.memoirdepth.sbe.v1_6_a.enums;

import java.util.Optional;

/**
 * OptionsProductType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OptionsProductType {

    /**
     * EquityUnderlying
     */
    EQUITY_UNDERLYING((short) 0, "EquityUnderlying"),

    /**
     * IndexUnderlying
     */
    INDEX_UNDERLYING((short) 1, "IndexUnderlying");

    private final short wire;

    private final String description;

    OptionsProductType(short wire, String description) {
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
    public static Optional<OptionsProductType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(EQUITY_UNDERLYING);
            case 1 -> Optional.of(INDEX_UNDERLYING);
            default -> Optional.empty();
        };
    }
}
