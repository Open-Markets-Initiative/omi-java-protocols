package omi.lseg.turquoise.mifid2pretrade.gtp.v26_3.enums;

import java.util.Optional;

/**
 * Venue from which market data is received for the instrument
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum SourceVenue {

    /**
     * Turquoise Lit Order Book
     */
    TURQUOISE_LIT_ORDER_BOOK_5(5, "Turquoise Lit Order Book"),

    /**
     * Turquoise Plato Order Book
     */
    TURQUOISE_PLATO_ORDER_BOOK_6(6, "Turquoise Plato Order Book"),

    /**
     * Turquoise Plato Lit Auctions Order Book
     */
    TURQUOISE_PLATO_LIT_AUCTIONS_ORDER_BOOK_12(12, "Turquoise Plato Lit Auctions Order Book"),

    /**
     * Turquoise Lit Order Book
     */
    TURQUOISE_LIT_ORDER_BOOK_14(14, "Turquoise Lit Order Book"),

    /**
     * Turquoise Plato Order Book
     */
    TURQUOISE_PLATO_ORDER_BOOK_15(15, "Turquoise Plato Order Book"),

    /**
     * Turquoise Plato Lit Auctions Order Book
     */
    TURQUOISE_PLATO_LIT_AUCTIONS_ORDER_BOOK_16(16, "Turquoise Plato Lit Auctions Order Book");

    private final int wire;

    private final String description;

    SourceVenue(int wire, String description) {
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
    public static Optional<SourceVenue> fromWire(int wire) {
        return switch (wire) {
            case 5 -> Optional.of(TURQUOISE_LIT_ORDER_BOOK_5);
            case 6 -> Optional.of(TURQUOISE_PLATO_ORDER_BOOK_6);
            case 12 -> Optional.of(TURQUOISE_PLATO_LIT_AUCTIONS_ORDER_BOOK_12);
            case 14 -> Optional.of(TURQUOISE_LIT_ORDER_BOOK_14);
            case 15 -> Optional.of(TURQUOISE_PLATO_ORDER_BOOK_15);
            case 16 -> Optional.of(TURQUOISE_PLATO_LIT_AUCTIONS_ORDER_BOOK_16);
            default -> Optional.empty();
        };
    }
}
