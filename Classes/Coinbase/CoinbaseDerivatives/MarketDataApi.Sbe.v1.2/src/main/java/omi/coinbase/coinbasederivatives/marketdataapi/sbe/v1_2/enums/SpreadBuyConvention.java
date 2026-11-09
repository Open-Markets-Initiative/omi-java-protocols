package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.enums;

import java.util.Optional;

/**
 * spreadBuyConvention
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum SpreadBuyConvention {

    /**
     * USE_FAR_BID
     */
    USE_FAR_BID((byte) 1, "USE_FAR_BID"),

    /**
     * USE_NEAR_BID
     */
    USE_NEAR_BID((byte) -1, "USE_NEAR_BID");

    private final byte wire;

    private final String description;

    SpreadBuyConvention(byte wire, String description) {
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
    public static Optional<SpreadBuyConvention> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(USE_FAR_BID);
            case -1 -> Optional.of(USE_NEAR_BID);
            default -> Optional.empty();
        };
    }
}
