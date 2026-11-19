package omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Transaction category short code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TransactionCategory {

    /**
     * Trade That Has Received Price Improvement
     */
    TRADE_THAT_HAS_RECEIVED_PRICE_IMPROVEMENT('R', "Trade That Has Received Price Improvement"),

    /**
     * Package Trade Excluding Exchange For Physicals
     */
    PACKAGE_TRADE_EXCLUDING_EXCHANGE_FOR_PHYSICALS('Z', "Package Trade Excluding Exchange For Physicals"),

    /**
     * Exchange For Physicals Trade
     */
    EXCHANGE_FOR_PHYSICALS_TRADE('Y', "Exchange For Physicals Trade"),

    /**
     * Rfmd Give Up Trade
     */
    RFMD_GIVE_UP_TRADE('G', "Rfmd Give Up Trade"),

    /**
     * Rfmd Give Up Trade And Exchange For Physicals Trade
     */
    RFMD_GIVE_UP_TRADE_AND_EXCHANGE_FOR_PHYSICALS_TRADE('H', "Rfmd Give Up Trade And Exchange For Physicals Trade"),

    /**
     * None Apply
     */
    NONE_APPLY('-', "None Apply");

    private final char wire;

    private final String description;

    TransactionCategory(char wire, String description) {
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
    public static Optional<TransactionCategory> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(TRADE_THAT_HAS_RECEIVED_PRICE_IMPROVEMENT);
            case 'Z' -> Optional.of(PACKAGE_TRADE_EXCLUDING_EXCHANGE_FOR_PHYSICALS);
            case 'Y' -> Optional.of(EXCHANGE_FOR_PHYSICALS_TRADE);
            case 'G' -> Optional.of(RFMD_GIVE_UP_TRADE);
            case 'H' -> Optional.of(RFMD_GIVE_UP_TRADE_AND_EXCHANGE_FOR_PHYSICALS_TRADE);
            case '-' -> Optional.of(NONE_APPLY);
            default -> Optional.empty();
        };
    }
}
