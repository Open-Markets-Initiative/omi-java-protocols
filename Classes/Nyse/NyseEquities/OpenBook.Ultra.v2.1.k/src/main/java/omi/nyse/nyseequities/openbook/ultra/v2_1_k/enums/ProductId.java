package omi.nyse.nyseequities.openbook.ultra.v2_1_k.enums;

import java.util.Optional;

/**
 * Product identifier
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ProductId {

    /**
     * NYSE OpenBook Ultra
     */
    NYSE_OPENBOOK_ULTRA((short) 12, "NYSE OpenBook Ultra"),

    /**
     * NYSE American OpenBook Ultra
     */
    NYSE_AMERICAN_OPENBOOK_ULTRA((short) 62, "NYSE American OpenBook Ultra");

    private final short wire;

    private final String description;

    ProductId(short wire, String description) {
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
    public static Optional<ProductId> fromWire(short wire) {
        return switch (wire) {
            case 12 -> Optional.of(NYSE_OPENBOOK_ULTRA);
            case 62 -> Optional.of(NYSE_AMERICAN_OPENBOOK_ULTRA);
            default -> Optional.empty();
        };
    }
}
