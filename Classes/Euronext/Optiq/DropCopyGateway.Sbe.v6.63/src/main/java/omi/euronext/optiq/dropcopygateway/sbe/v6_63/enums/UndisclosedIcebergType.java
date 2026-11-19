package omi.euronext.optiq.dropcopygateway.sbe.v6_63.enums;

import java.util.Optional;

/**
 * undisclosedIcebergType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum UndisclosedIcebergType {

    /**
     * Limit
     */
    LIMIT((short) 1, "Limit"),

    /**
     * Peg_Mid_Point
     */
    PEG_MID_POINT((short) 2, "Peg_Mid_Point"),

    /**
     * Peg_Primary
     */
    PEG_PRIMARY((short) 3, "Peg_Primary"),

    /**
     * Peg_Market
     */
    PEG_MARKET((short) 4, "Peg_Market"),

    /**
     * undisclosedIcebergType
     */
    NO_VALUE((short) 255, "undisclosedIcebergType");

    private final short wire;

    private final String description;

    UndisclosedIcebergType(short wire, String description) {
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
    public static Optional<UndisclosedIcebergType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(LIMIT);
            case 2 -> Optional.of(PEG_MID_POINT);
            case 3 -> Optional.of(PEG_PRIMARY);
            case 4 -> Optional.of(PEG_MARKET);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
