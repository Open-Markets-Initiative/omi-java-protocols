package omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums;

import java.util.Optional;

/**
 * Indicates the delivery type of the instrument
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DeliveryType {

    /**
     * Cash
     */
    CASH('C', "Cash"),

    /**
     * Physical
     */
    PHYSICAL('P', "Physical");

    private final char wire;

    private final String description;

    DeliveryType(char wire, String description) {
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
    public static Optional<DeliveryType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CASH);
            case 'P' -> Optional.of(PHYSICAL);
            default -> Optional.empty();
        };
    }
}
