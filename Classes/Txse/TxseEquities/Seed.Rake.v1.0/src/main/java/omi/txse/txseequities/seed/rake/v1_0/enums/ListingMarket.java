package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum ListingMarket. Added in 0.20.draft; absent in pre-0.20 senders, so it is a length-tolerant trailing field - present only when the frame extends past lotSize.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ListingMarket {

    /**
     * TXSE is not the listing market for this symbol.
     */
    NOT_AVAILABLE((byte) 0, "TXSE is not the listing market for this symbol."),

    /**
     * Texas Stock Exchange, LLC.
     */
    TXSE((byte) 70, "Texas Stock Exchange, LLC.");

    private final byte wire;

    private final String description;

    ListingMarket(byte wire, String description) {
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
    public static Optional<ListingMarket> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_AVAILABLE);
            case 70 -> Optional.of(TXSE);
            default -> Optional.empty();
        };
    }
}
