package omi.bme.bmefixedincome.retail.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Trade type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeType {

    /**
     * Market
     */
    MARKET('M', "Market"),

    /**
     * Block Trade
     */
    BLOCK_TRADE('K', "Block Trade"),

    /**
     * Cancellation
     */
    CANCELLATION('X', "Cancellation"),

    /**
     * Trade Amendment
     */
    TRADE_AMENDMENT('T', "Trade Amendment"),

    /**
     * Application
     */
    APPLICATION('Q', "Application"),

    /**
     * Block Trade With Settlement Date Equal To Session Date
     */
    BLOCK_TRADE_WITH_SETTLEMENT_DATE_EQUAL_TO_SESSION_DATE('A', "Block Trade With Settlement Date Equal To Session Date"),

    /**
     * Application With Settlement Date Equal To Session Date
     */
    APPLICATION_WITH_SETTLEMENT_DATE_EQUAL_TO_SESSION_DATE('B', "Application With Settlement Date Equal To Session Date"),

    /**
     * Repo Block Trade
     */
    REPO_BLOCK_TRADE('C', "Repo Block Trade"),

    /**
     * Repo Application
     */
    REPO_APPLICATION('D', "Repo Application"),

    /**
     * Repo Block Trade With Start Date Equal To Session Date
     */
    REPO_BLOCK_TRADE_WITH_START_DATE_EQUAL_TO_SESSION_DATE('E', "Repo Block Trade With Start Date Equal To Session Date"),

    /**
     * Repo Application With Start Date Equal To Session Date
     */
    REPO_APPLICATION_WITH_START_DATE_EQUAL_TO_SESSION_DATE('F', "Repo Application With Start Date Equal To Session Date"),

    /**
     * Rfq
     */
    RFQ('3', "Rfq");

    private final char wire;

    private final String description;

    TradeType(char wire, String description) {
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
    public static Optional<TradeType> fromWire(char wire) {
        return switch (wire) {
            case 'M' -> Optional.of(MARKET);
            case 'K' -> Optional.of(BLOCK_TRADE);
            case 'X' -> Optional.of(CANCELLATION);
            case 'T' -> Optional.of(TRADE_AMENDMENT);
            case 'Q' -> Optional.of(APPLICATION);
            case 'A' -> Optional.of(BLOCK_TRADE_WITH_SETTLEMENT_DATE_EQUAL_TO_SESSION_DATE);
            case 'B' -> Optional.of(APPLICATION_WITH_SETTLEMENT_DATE_EQUAL_TO_SESSION_DATE);
            case 'C' -> Optional.of(REPO_BLOCK_TRADE);
            case 'D' -> Optional.of(REPO_APPLICATION);
            case 'E' -> Optional.of(REPO_BLOCK_TRADE_WITH_START_DATE_EQUAL_TO_SESSION_DATE);
            case 'F' -> Optional.of(REPO_APPLICATION_WITH_START_DATE_EQUAL_TO_SESSION_DATE);
            case '3' -> Optional.of(RFQ);
            default -> Optional.empty();
        };
    }
}
