package omi.bme.bmefixedincome.retail.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Trading mode
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionId {

    /**
     * Continuous Trading
     */
    CONTINUOUS_TRADING((short) 100, "Continuous Trading"),

    /**
     * Block Trades
     */
    BLOCK_TRADES((short) 102, "Block Trades"),

    /**
     * Repo Cross Trades Within The Member And Repo Block Trading
     */
    REPO_CROSS_TRADES_WITHIN_THE_MEMBER_AND_REPO_BLOCK_TRADING((short) 111, "Repo Cross Trades Within The Member And Repo Block Trading"),

    /**
     * Rfq
     */
    RFQ((short) 114, "Rfq");

    private final short wire;

    private final String description;

    TradingSessionId(short wire, String description) {
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
    public static Optional<TradingSessionId> fromWire(short wire) {
        return switch (wire) {
            case 100 -> Optional.of(CONTINUOUS_TRADING);
            case 102 -> Optional.of(BLOCK_TRADES);
            case 111 -> Optional.of(REPO_CROSS_TRADES_WITHIN_THE_MEMBER_AND_REPO_BLOCK_TRADING);
            case 114 -> Optional.of(RFQ);
            default -> Optional.empty();
        };
    }
}
