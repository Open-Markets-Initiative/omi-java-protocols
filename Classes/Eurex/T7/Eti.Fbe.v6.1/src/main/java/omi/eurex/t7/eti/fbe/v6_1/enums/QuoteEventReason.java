package omi.eurex.t7.eti.fbe.v6_1.enums;

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
     * Quote deleted due to Book-or-Cancel quote type
     */
    BOOKOR_CANCEL((short) 17, "Quote deleted due to Book-or-Cancel quote type"),

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
            case 17 -> Optional.of(BOOKOR_CANCEL);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
