package omi.nasdaq.gemxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * A=New Trade, B=Trade Busted, C=Modified Trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TransType {

    /**
     * New Trade
     */
    NEW_TRADE('A', "New Trade"),

    /**
     * Trade Busted
     */
    TRADE_BUSTED('B', "Trade Busted"),

    /**
     * Modified Trade
     */
    MODIFIED_TRADE('C', "Modified Trade");

    private final char wire;

    private final String description;

    TransType(char wire, String description) {
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
    public static Optional<TransType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NEW_TRADE);
            case 'B' -> Optional.of(TRADE_BUSTED);
            case 'C' -> Optional.of(MODIFIED_TRADE);
            default -> Optional.empty();
        };
    }
}
