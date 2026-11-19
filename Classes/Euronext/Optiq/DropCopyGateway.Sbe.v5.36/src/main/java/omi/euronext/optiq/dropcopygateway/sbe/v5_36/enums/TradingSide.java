package omi.euronext.optiq.dropcopygateway.sbe.v5_36.enums;

import java.util.Optional;

/**
 * tradingSide
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSide {

    /**
     * Bid_Only
     */
    BID_ONLY((short) 1, "Bid_Only"),

    /**
     * Offer_Only
     */
    OFFER_ONLY((short) 2, "Offer_Only"),

    /**
     * PAKO
     */
    PAKO((short) 3, "PAKO"),

    /**
     * Both_Sides
     */
    BOTH_SIDES((short) 4, "Both_Sides"),

    /**
     * tradingSide
     */
    NO_VALUE((short) 255, "tradingSide");

    private final short wire;

    private final String description;

    TradingSide(short wire, String description) {
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
    public static Optional<TradingSide> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(BID_ONLY);
            case 2 -> Optional.of(OFFER_ONLY);
            case 3 -> Optional.of(PAKO);
            case 4 -> Optional.of(BOTH_SIDES);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
