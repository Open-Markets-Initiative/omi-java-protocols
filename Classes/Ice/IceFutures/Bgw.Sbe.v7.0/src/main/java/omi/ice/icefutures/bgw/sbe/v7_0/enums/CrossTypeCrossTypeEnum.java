package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * crossType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossTypeCrossTypeEnum {

    /**
     * AON
     */
    AON('1', "AON"),

    /**
     * IOC
     */
    IOC('2', "IOC");

    private final char wire;

    private final String description;

    CrossTypeCrossTypeEnum(char wire, String description) {
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
    public static Optional<CrossTypeCrossTypeEnum> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(AON);
            case '2' -> Optional.of(IOC);
            default -> Optional.empty();
        };
    }
}
