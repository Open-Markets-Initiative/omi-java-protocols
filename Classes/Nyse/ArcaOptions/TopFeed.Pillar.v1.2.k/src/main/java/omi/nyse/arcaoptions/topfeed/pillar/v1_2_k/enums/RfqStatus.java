package omi.nyse.arcaoptions.topfeed.pillar.v1_2_k.enums;

import java.util.Optional;

/**
 * This status field is used for CUBE/COA (Type = C).
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RfqStatus {

    /**
     * Start Of Rfq Auction
     */
    START_OF_RFQ_AUCTION('O', "Start Of Rfq Auction"),

    /**
     * End Of Rfq Auction
     */
    END_OF_RFQ_AUCTION('Q', "End Of Rfq Auction");

    private final char wire;

    private final String description;

    RfqStatus(char wire, String description) {
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
    public static Optional<RfqStatus> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(START_OF_RFQ_AUCTION);
            case 'Q' -> Optional.of(END_OF_RFQ_AUCTION);
            default -> Optional.empty();
        };
    }
}
