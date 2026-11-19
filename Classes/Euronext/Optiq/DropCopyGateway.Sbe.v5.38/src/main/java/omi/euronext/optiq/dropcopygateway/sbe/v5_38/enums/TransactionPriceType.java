package omi.euronext.optiq.dropcopygateway.sbe.v5_38.enums;

import java.util.Optional;

/**
 * transactionPriceType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TransactionPriceType {

    /**
     * Plain_Vanilla_Trade
     */
    PLAIN_VANILLA_TRADE((short) 1, "Plain_Vanilla_Trade"),

    /**
     * Non_Price_Forming_Trade
     */
    NON_PRICE_FORMING_TRADE((short) 2, "Non_Price_Forming_Trade"),

    /**
     * Trade_Not_Contributing_to_Price_Discovery_Process
     */
    TRADE_NOT_CONTRIBUTINGTO_PRICE_DISCOVERY_PROCESS((short) 3, "Trade_Not_Contributing_to_Price_Discovery_Process"),

    /**
     * Dark_Trade
     */
    DARK_TRADE((short) 4, "Dark_Trade"),

    /**
     * transactionPriceType
     */
    NO_VALUE((short) 255, "transactionPriceType");

    private final short wire;

    private final String description;

    TransactionPriceType(short wire, String description) {
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
    public static Optional<TransactionPriceType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PLAIN_VANILLA_TRADE);
            case 2 -> Optional.of(NON_PRICE_FORMING_TRADE);
            case 3 -> Optional.of(TRADE_NOT_CONTRIBUTINGTO_PRICE_DISCOVERY_PROCESS);
            case 4 -> Optional.of(DARK_TRADE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
