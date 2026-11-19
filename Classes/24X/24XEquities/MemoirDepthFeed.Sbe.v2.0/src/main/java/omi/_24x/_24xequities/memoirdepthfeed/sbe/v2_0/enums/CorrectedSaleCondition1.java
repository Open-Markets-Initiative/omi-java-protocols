package omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.enums;

import java.util.Optional;

/**
 * CorrectedSaleCondition1
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CorrectedSaleCondition1 {

    /**
     * RegularTrade
     */
    REGULAR_TRADE('@', "RegularTrade");

    private final char wire;

    private final String description;

    CorrectedSaleCondition1(char wire, String description) {
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
    public static Optional<CorrectedSaleCondition1> fromWire(char wire) {
        return wire == '@' ? Optional.of(REGULAR_TRADE) : Optional.empty();
    }
}
