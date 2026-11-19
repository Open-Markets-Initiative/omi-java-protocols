package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.enums;

import java.util.Optional;

/**
 * MMT Level 3.8
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceFormationDiscoveryProcess {

    /**
     * Standard Trade For The Specified Market Mechanism Or Trading Mode
     */
    STANDARD_TRADE_FOR_THE_SPECIFIED_MARKET_MECHANISM_OR_TRADING_MODE('P', "Standard Trade For The Specified Market Mechanism Or Trading Mode"),

    /**
     * Non Price Forming Trade Formerly Known As Technical Trade
     */
    NON_PRICE_FORMING_TRADE_FORMERLY_KNOWN_AS_TECHNICAL_TRADE('T', "Non Price Forming Trade Formerly Known As Technical Trade"),

    /**
     * Trade Not Contributing To Price Discovery Process Formerly Technical Trade
     */
    TRADE_NOT_CONTRIBUTING_TO_PRICE_DISCOVERY_PROCESS_FORMERLY_TECHNICAL_TRADE('J', "Trade Not Contributing To Price Discovery Process Formerly Technical Trade"),

    /**
     * Price Is Currently Not Available But Pending
     */
    PRICE_IS_CURRENTLY_NOT_AVAILABLE_BUT_PENDING('N', "Price Is Currently Not Available But Pending");

    private final char wire;

    private final String description;

    PriceFormationDiscoveryProcess(char wire, String description) {
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
    public static Optional<PriceFormationDiscoveryProcess> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(STANDARD_TRADE_FOR_THE_SPECIFIED_MARKET_MECHANISM_OR_TRADING_MODE);
            case 'T' -> Optional.of(NON_PRICE_FORMING_TRADE_FORMERLY_KNOWN_AS_TECHNICAL_TRADE);
            case 'J' -> Optional.of(TRADE_NOT_CONTRIBUTING_TO_PRICE_DISCOVERY_PROCESS_FORMERLY_TECHNICAL_TRADE);
            case 'N' -> Optional.of(PRICE_IS_CURRENTLY_NOT_AVAILABLE_BUT_PENDING);
            default -> Optional.empty();
        };
    }
}
