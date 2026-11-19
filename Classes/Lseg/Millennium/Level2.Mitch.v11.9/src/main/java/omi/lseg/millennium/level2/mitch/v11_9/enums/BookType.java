package omi.lseg.millennium.level2.mitch.v11_9.enums;

import java.util.Optional;

/**
 * Book Type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BookType {

    /**
     * On Book
     */
    ON_BOOK((short) 1, "On Book"),

    /**
     * Off Book
     */
    OFF_BOOK((short) 2, "Off Book"),

    /**
     * Private Rfq
     */
    PRIVATE_RFQ((short) 3, "Private Rfq");

    private final short wire;

    private final String description;

    BookType(short wire, String description) {
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
    public static Optional<BookType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ON_BOOK);
            case 2 -> Optional.of(OFF_BOOK);
            case 3 -> Optional.of(PRIVATE_RFQ);
            default -> Optional.empty();
        };
    }
}
