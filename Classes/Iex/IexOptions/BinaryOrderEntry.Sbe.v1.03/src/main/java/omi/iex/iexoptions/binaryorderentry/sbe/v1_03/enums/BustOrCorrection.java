package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * bustOrCorrection
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum BustOrCorrection {

    /**
     * TradeBust
     */
    TRADE_BUST((byte) 0, "TradeBust"),

    /**
     * TradeCorrection
     */
    TRADE_CORRECTION((byte) 1, "TradeCorrection");

    private final byte wire;

    private final String description;

    BustOrCorrection(byte wire, String description) {
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
    public static Optional<BustOrCorrection> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(TRADE_BUST);
            case 1 -> Optional.of(TRADE_CORRECTION);
            default -> Optional.empty();
        };
    }
}
