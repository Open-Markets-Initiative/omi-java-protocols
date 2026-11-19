package omi.moex.spectra.orderslogsnapshot.simba.v9_9_0.enums;

import java.util.Optional;

/**
 * MDEntryType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MdEntryType {

    /**
     * Bid
     */
    BID('0', "Bid"),

    /**
     * Offer
     */
    OFFER('1', "Offer"),

    /**
     * Empty Book
     */
    EMPTY_BOOK('J', "Empty Book");

    private final char wire;

    private final String description;

    MdEntryType(char wire, String description) {
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
    public static Optional<MdEntryType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(BID);
            case '1' -> Optional.of(OFFER);
            case 'J' -> Optional.of(EMPTY_BOOK);
            default -> Optional.empty();
        };
    }
}
