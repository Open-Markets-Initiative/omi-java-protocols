package omi.eurex.t7.xti.fbe.v11_1.enums;

import java.util.Optional;

/**
 * Defines the QuoteEventReason values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteEventReason {

    /**
     * Pendingcancellationexecuted
     */
    PENDINGCANCELLATIONEXECUTED((short) 14, "Pendingcancellationexecuted"),

    /**
     * Invalidprice
     */
    INVALIDPRICE((short) 15, "Invalidprice"),

    /**
     * Quote subject to crossing and match prevented
     */
    CROSSREJECTED((short) 16, "Quote subject to crossing and match prevented"),

    /**
     * Quote deleted due to passive liquidity protection
     */
    PLP((short) 18, "Quote deleted due to passive liquidity protection"),

    /**
     * Price was not top of quote book.
     */
    PRICENOT_TOPOF_BOOK((short) 19, "Price was not top of quote book."),

    /**
     * Requester choose selection by the random algorithm.
     */
    RANDOM_SELECTION((short) 20, "Requester choose selection by the random algorithm."),

    /**
     * Requester manually selected the quote
     */
    MANUAL_SELECTION((short) 21, "Requester manually selected the quote"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    QuoteEventReason(short wire, String description) {
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
    public static Optional<QuoteEventReason> fromWire(short wire) {
        return switch (wire) {
            case 14 -> Optional.of(PENDINGCANCELLATIONEXECUTED);
            case 15 -> Optional.of(INVALIDPRICE);
            case 16 -> Optional.of(CROSSREJECTED);
            case 18 -> Optional.of(PLP);
            case 19 -> Optional.of(PRICENOT_TOPOF_BOOK);
            case 20 -> Optional.of(RANDOM_SELECTION);
            case 21 -> Optional.of(MANUAL_SELECTION);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
