package omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Only considered if the Request Level is 0. If specified, only data related to the specified order book type is provided. If not specified, data for all available book types for the instrument are provided. For Recovery Type = 3 (Statistics) this has to be set to '0' = All.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RequestOrderBookType {

    /**
     * All Books
     */
    ALL_BOOKS((short) 0, "All Books"),

    /**
     * Si Quote Book
     */
    SI_QUOTE_BOOK((short) 1, "Si Quote Book"),

    /**
     * Off Book
     */
    OFF_BOOK((short) 2, "Off Book");

    private final short wire;

    private final String description;

    RequestOrderBookType(short wire, String description) {
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
    public static Optional<RequestOrderBookType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ALL_BOOKS);
            case 1 -> Optional.of(SI_QUOTE_BOOK);
            case 2 -> Optional.of(OFF_BOOK);
            default -> Optional.empty();
        };
    }
}
