package omi.coinbase.deribit.marketdataapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * type
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum Type {

    /**
     * PERP_FUTURE
     */
    PERP_FUTURE((byte) 0, "PERP_FUTURE"),

    /**
     * OPTION
     */
    OPTION((byte) 1, "OPTION"),

    /**
     * SPOT
     */
    SPOT((byte) 2, "SPOT"),

    /**
     * FUTURE_COMBO
     */
    FUTURE_COMBO((byte) 3, "FUTURE_COMBO"),

    /**
     * OPTION_COMBO
     */
    OPTION_COMBO((byte) 4, "OPTION_COMBO"),

    /**
     * DATED_FUTURE
     */
    DATED_FUTURE((byte) 5, "DATED_FUTURE");

    private final byte wire;

    private final String description;

    Type(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<Type> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(PERP_FUTURE);
            case 1 -> Optional.of(OPTION);
            case 2 -> Optional.of(SPOT);
            case 3 -> Optional.of(FUTURE_COMBO);
            case 4 -> Optional.of(OPTION_COMBO);
            case 5 -> Optional.of(DATED_FUTURE);
            default -> Optional.empty();
        };
    }
}
