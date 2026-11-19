package omi.eurex.t7.xti.fbe.v14_1.enums;

import java.util.Optional;

/**
 * Defines the QuoteRequestRejectReason values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteRequestRejectReason {

    /**
     * Exchange (Security) Closed
     */
    EXCHANGECLOSED((short) 2, "Exchange (Security) Closed"),

    /**
     * Other
     */
    OTHER((short) 99, "Other"),

    /**
     * Requested size too small
     */
    REQUESTEDSIZETOOSMALL((short) 100, "Requested size too small"),

    /**
     * Requested size too big
     */
    REQUESTEDSIZETOOBIG((short) 101, "Requested size too big"),

    /**
     * No valid quote from issuer
     */
    NOVALIDQUOTEFROMISSUER((short) 102, "No valid quote from issuer"),

    /**
     * Sold out
     */
    SOLDOUT((short) 103, "Sold out"),

    /**
     * Trading restriction
     */
    TRADINGRESTRICTION((short) 104, "Trading restriction"),

    /**
     * RequestForQuote request timed out
     */
    PENDINGREQUESTTIMEDOUT((short) 105, "RequestForQuote request timed out"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    QuoteRequestRejectReason(short wire, String description) {
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
    public static Optional<QuoteRequestRejectReason> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(EXCHANGECLOSED);
            case 99 -> Optional.of(OTHER);
            case 100 -> Optional.of(REQUESTEDSIZETOOSMALL);
            case 101 -> Optional.of(REQUESTEDSIZETOOBIG);
            case 102 -> Optional.of(NOVALIDQUOTEFROMISSUER);
            case 103 -> Optional.of(SOLDOUT);
            case 104 -> Optional.of(TRADINGRESTRICTION);
            case 105 -> Optional.of(PENDINGREQUESTTIMEDOUT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
