package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.enums;

import java.util.Optional;

/**
 * 1 buy, -1 sell, 0 opening fill, and -128 where side does not apply to the message
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum InstrumentSide {

    /**
     * Buy
     */
    BUY((byte) 1, "Buy"),

    /**
     * Sell
     */
    SELL((byte) -1, "Sell"),

    /**
     * Opening fill
     */
    OPENING_FILL((byte) 0, "Opening fill"),

    /**
     * Null value, used in messages in which side is not applicable
     */
    NO_VALUE((byte) -128, "Null value, used in messages in which side is not applicable");

    private final byte wire;

    private final String description;

    InstrumentSide(byte wire, String description) {
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
    public static Optional<InstrumentSide> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(BUY);
            case -1 -> Optional.of(SELL);
            case 0 -> Optional.of(OPENING_FILL);
            case -128 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
