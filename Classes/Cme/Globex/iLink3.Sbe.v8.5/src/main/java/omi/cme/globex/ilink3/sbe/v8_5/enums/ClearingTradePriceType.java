package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Indicates to recipient whether trade is clearing at execution prices LastPx (tag 31) or alternate clearing price (prior day settlement price)
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ClearingTradePriceType {

    /**
     * Indicates to recipient whether trade is clearing at execution prices LastPx (tag 31) or alternate clearing price (prior day settlement price)
     */
    NO_VALUE((short) 255, "Indicates to recipient whether trade is clearing at execution prices LastPx (tag 31) or alternate clearing price (prior day settlement price)"),

    /**
     * Trade Clearing at Execution Price
     */
    TRADE_CLEARINGAT_EXECUTION_PRICE((short) 0, "Trade Clearing at Execution Price"),

    /**
     * Trade Clearing at Alternate Clearing Price
     */
    TRADE_CLEARINGAT_ALTERNATE_CLEARING_PRICE((short) 1, "Trade Clearing at Alternate Clearing Price");

    private final short wire;

    private final String description;

    ClearingTradePriceType(short wire, String description) {
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
    public static Optional<ClearingTradePriceType> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(TRADE_CLEARINGAT_EXECUTION_PRICE);
            case 1 -> Optional.of(TRADE_CLEARINGAT_ALTERNATE_CLEARING_PRICE);
            default -> Optional.empty();
        };
    }
}
