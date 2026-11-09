package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * Indicates whether the auction will run
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AuctionStatus {

    /**
     * Usual
     */
    USUAL((short) 0, "Usual"),

    /**
     * Legal Width Quote Does Not Exist
     */
    LEGAL_WIDTH_QUOTE_DOES_NOT_EXIST((short) 4, "Legal Width Quote Does Not Exist"),

    /**
     * Market Maker Quote Is Not Received
     */
    MARKET_MAKER_QUOTE_IS_NOT_RECEIVED((short) 5, "Market Maker Quote Is Not Received");

    private final short wire;

    private final String description;

    AuctionStatus(short wire, String description) {
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
    public static Optional<AuctionStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(USUAL);
            case 4 -> Optional.of(LEGAL_WIDTH_QUOTE_DOES_NOT_EXIST);
            case 5 -> Optional.of(MARKET_MAKER_QUOTE_IS_NOT_RECEIVED);
            default -> Optional.empty();
        };
    }
}
