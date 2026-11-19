package omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.enums;

import java.util.Optional;

/**
 * Asset type code. Blank if not applicable.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AssetType {

    /**
     * Debt
     */
    DEBT('D', "Debt"),

    /**
     * Equity
     */
    EQUITY('E', "Equity"),

    /**
     * Index
     */
    INDEX('I', "Index");

    private final char wire;

    private final String description;

    AssetType(char wire, String description) {
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
    public static Optional<AssetType> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(DEBT);
            case 'E' -> Optional.of(EQUITY);
            case 'I' -> Optional.of(INDEX);
            default -> Optional.empty();
        };
    }
}
