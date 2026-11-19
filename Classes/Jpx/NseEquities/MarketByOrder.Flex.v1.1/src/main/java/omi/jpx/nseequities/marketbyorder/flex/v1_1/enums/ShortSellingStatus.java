package omi.jpx.nseequities.marketbyorder.flex.v1_1.enums;

import java.util.Optional;

/**
 * Indicates application of the Short Selling Regulation
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ShortSellingStatus {

    /**
     * Short Selling Regulation Is Not Applied
     */
    SHORT_SELLING_REGULATION_IS_NOT_APPLIED((short) 0, "Short Selling Regulation Is Not Applied"),

    /**
     * Short Selling Regulation Is Applied
     */
    SHORT_SELLING_REGULATION_IS_APPLIED((short) 1, "Short Selling Regulation Is Applied");

    private final short wire;

    private final String description;

    ShortSellingStatus(short wire, String description) {
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
    public static Optional<ShortSellingStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SHORT_SELLING_REGULATION_IS_NOT_APPLIED);
            case 1 -> Optional.of(SHORT_SELLING_REGULATION_IS_APPLIED);
            default -> Optional.empty();
        };
    }
}
