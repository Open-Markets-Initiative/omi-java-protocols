package omi.eurex.t7.xti.fbe.v7_1.enums;

import java.util.Optional;

/**
 * Defines the DeliveryType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum DeliveryType {

    /**
     * Auslandskassenverein
     */
    AKV((short) 1, "Auslandskassenverein"),

    /**
     * Girosammelverwahrung
     */
    GS((short) 2, "Girosammelverwahrung"),

    /**
     * Streifbandverwahrung
     */
    STR((short) 3, "Streifbandverwahrung"),

    /**
     * Wertpapierrechnung
     */
    WPR((short) 4, "Wertpapierrechnung"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    DeliveryType(short wire, String description) {
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
    public static Optional<DeliveryType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(AKV);
            case 2 -> Optional.of(GS);
            case 3 -> Optional.of(STR);
            case 4 -> Optional.of(WPR);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
