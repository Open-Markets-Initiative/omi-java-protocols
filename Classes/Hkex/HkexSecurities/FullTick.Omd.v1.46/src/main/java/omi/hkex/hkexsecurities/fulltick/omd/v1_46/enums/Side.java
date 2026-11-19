package omi.hkex.hkexsecurities.fulltick.omd.v1_46.enums;

import java.util.Optional;

/**
 * Side of the order.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum Side {

    /**
     * Bid
     */
    BID(0, "Bid"),

    /**
     * Offer
     */
    OFFER(1, "Offer");

    private final int wire;

    private final String description;

    Side(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<Side> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(BID);
            case 1 -> Optional.of(OFFER);
            default -> Optional.empty();
        };
    }
}
