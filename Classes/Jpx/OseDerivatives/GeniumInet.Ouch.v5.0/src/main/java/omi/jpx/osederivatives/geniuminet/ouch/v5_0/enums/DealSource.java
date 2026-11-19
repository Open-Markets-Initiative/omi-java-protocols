package omi.jpx.osederivatives.geniuminet.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Deal source code equivalent to the OMNet deal_source indicating how the execution occurred.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum DealSource {

    /**
     * Matched by the system automatically.
     */
    SYSTEM_MATCHED((short) 1, "Matched by the system automatically."),

    /**
     * Combination order matched against another combination order when matched electronically by the Exchange.
     */
    COMBINATION_MATCHED((short) 7, "Combination order matched against another combination order when matched electronically by the Exchange."),

    /**
     * Deal made at the end of an auction.
     */
    AUCTION_END_DEAL((short) 20, "Deal made at the end of an auction.");

    private final short wire;

    private final String description;

    DealSource(short wire, String description) {
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
    public static Optional<DealSource> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(SYSTEM_MATCHED);
            case 7 -> Optional.of(COMBINATION_MATCHED);
            case 20 -> Optional.of(AUCTION_END_DEAL);
            default -> Optional.empty();
        };
    }
}
