package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

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
     * Selftradequotedeleted
     */
    SELFTRADEQUOTEDELETED((short) 16, "Selftradequotedeleted"),

    /**
     * Reversetradequotedeleted
     */
    REVERSETRADEQUOTEDELETED((short) 17, "Reversetradequotedeleted"),

    /**
     * Client Rrm Quotedeleted
     */
    CLIENT_RRM_QUOTEDELETED((short) 18, "Client Rrm Quotedeleted"),

    /**
     * Price Level Quantity Exceeded
     */
    PRICE_LEVEL_QUANTITY_EXCEEDED((short) 20, "Price Level Quantity Exceeded"),

    /**
     * Client Debarred
     */
    CLIENT_DEBARRED((short) 21, "Client Debarred"),

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
            case 16 -> Optional.of(SELFTRADEQUOTEDELETED);
            case 17 -> Optional.of(REVERSETRADEQUOTEDELETED);
            case 18 -> Optional.of(CLIENT_RRM_QUOTEDELETED);
            case 20 -> Optional.of(PRICE_LEVEL_QUANTITY_EXCEEDED);
            case 21 -> Optional.of(CLIENT_DEBARRED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
