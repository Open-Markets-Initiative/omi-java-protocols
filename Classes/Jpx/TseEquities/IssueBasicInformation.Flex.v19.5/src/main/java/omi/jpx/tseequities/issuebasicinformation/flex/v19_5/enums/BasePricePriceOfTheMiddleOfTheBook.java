package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the Base Price/Price of the Middle of the Book.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BasePricePriceOfTheMiddleOfTheBook {

    /**
     * Base Price
     */
    BASE_PRICE('1', "Base Price"),

    /**
     * Price Of The Middle Of The Book
     */
    PRICE_OF_THE_MIDDLE_OF_THE_BOOK('2', "Price Of The Middle Of The Book");

    private final char wire;

    private final String description;

    BasePricePriceOfTheMiddleOfTheBook(char wire, String description) {
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
    public static Optional<BasePricePriceOfTheMiddleOfTheBook> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(BASE_PRICE);
            case '2' -> Optional.of(PRICE_OF_THE_MIDDLE_OF_THE_BOOK);
            default -> Optional.empty();
        };
    }
}
