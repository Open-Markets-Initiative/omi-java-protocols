package omi.euronext.optiq.dropcopygateway.sbe.v5_38.enums;

import java.util.Optional;

/**
 * transparencyIndicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TransparencyIndicator {

    /**
     * LitRegular_Trade
     */
    LIT_REGULAR_TRADE((short) 0, "LitRegular_Trade"),

    /**
     * Dark_Trade_and_Immediate_Publication
     */
    DARK_TRADEAND_IMMEDIATE_PUBLICATION((short) 1, "Dark_Trade_and_Immediate_Publication"),

    /**
     * Dark_Trade_and_Deferred_Publication
     */
    DARK_TRADEAND_DEFERRED_PUBLICATION((short) 2, "Dark_Trade_and_Deferred_Publication"),

    /**
     * transparencyIndicator
     */
    NO_VALUE((short) 255, "transparencyIndicator");

    private final short wire;

    private final String description;

    TransparencyIndicator(short wire, String description) {
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
    public static Optional<TransparencyIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(LIT_REGULAR_TRADE);
            case 1 -> Optional.of(DARK_TRADEAND_IMMEDIATE_PUBLICATION);
            case 2 -> Optional.of(DARK_TRADEAND_DEFERRED_PUBLICATION);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
