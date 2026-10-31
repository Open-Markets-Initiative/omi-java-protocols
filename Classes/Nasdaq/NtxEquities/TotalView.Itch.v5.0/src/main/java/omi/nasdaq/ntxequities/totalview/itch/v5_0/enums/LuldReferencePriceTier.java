package omi.nasdaq.ntxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * Indicates which Limit Up / Limit Down price band calculation parameter is to be used for the instrument.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LuldReferencePriceTier {

    /**
     * Tier 1 NMS Stocks and select ETPs
     */
    TIER_1_NMS_STOCKS_AND_SELECT_ET_PS('1', "Tier 1 NMS Stocks and select ETPs"),

    /**
     * Tier 2 NMS Stocks
     */
    TIER_2_NMS_STOCKS('2', "Tier 2 NMS Stocks"),

    /**
     * Not available
     */
    NOT_AVAILABLE(' ', "Not available");

    private final char wire;

    private final String description;

    LuldReferencePriceTier(char wire, String description) {
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
    public static Optional<LuldReferencePriceTier> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(TIER_1_NMS_STOCKS_AND_SELECT_ET_PS);
            case '2' -> Optional.of(TIER_2_NMS_STOCKS);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
