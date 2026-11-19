package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.enums;

import java.util.Optional;

/**
 * Additional detail for a quote cancellation. See Subreason Codes (§ 7.3, p. 198) for a list of possible subreasons.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelSubreason {

    /**
     * Purge/Mass Cancel Trading Firm Level by user
     */
    PURGE_MASS_CANCEL_TRADING_FIRM_LEVEL_BY_USER('A', "Purge/Mass Cancel Trading Firm Level by user"),

    /**
     * Purge/Mass Cancel Symbol Level by user
     */
    PURGE_MASS_CANCEL_SYMBOL_LEVEL_BY_USER('B', "Purge/Mass Cancel Symbol Level by user"),

    /**
     * Purge/Mass Cancel Custom Group ID Level by user
     */
    PURGE_MASS_CANCEL_CUSTOM_GROUP_ID_LEVEL_BY_USER('C', "Purge/Mass Cancel Custom Group ID Level by user"),

    /**
     * Trading Firm Level lockout by Cboe Trade Desk Admin
     */
    TRADING_FIRM_LEVEL_LOCKOUT_BY_CBOE_TRADE_DESK_ADMIN('E', "Trading Firm Level lockout by Cboe Trade Desk Admin"),

    /**
     * Firm disconnect
     */
    FIRM_DISCONNECT('J', "Firm disconnect"),

    /**
     * Matching engine disconnect
     */
    MATCHING_ENGINE_DISCONNECT('K', "Matching engine disconnect"),

    /**
     * Cboe Trade Desk admin
     */
    CBOE_TRADE_DESK_ADMIN('T', "Cboe Trade Desk admin"),

    /**
     * Risk Management Trading Firm Level by rule
     */
    RISK_MANAGEMENT_TRADING_FIRM_LEVEL_BY_RULE('f', "Risk Management Trading Firm Level by rule"),

    /**
     * Risk Management Symbol Level by rule
     */
    RISK_MANAGEMENT_SYMBOL_LEVEL_BY_RULE('s', "Risk Management Symbol Level by rule"),

    /**
     * Risk Management Trading Firm Group Level by rule
     */
    RISK_MANAGEMENT_TRADING_FIRM_GROUP_LEVEL_BY_RULE('+', "Risk Management Trading Firm Group Level by rule"),

    /**
     * Limit order collar breach
     */
    LIMIT_ORDER_COLLAR_BREACH('l', "Limit order collar breach"),

    /**
     * Spike protection collar breach
     */
    SPIKE_PROTECTION_COLLAR_BREACH('p', "Spike protection collar breach");

    private final char wire;

    private final String description;

    CancelSubreason(char wire, String description) {
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
    public static Optional<CancelSubreason> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(PURGE_MASS_CANCEL_TRADING_FIRM_LEVEL_BY_USER);
            case 'B' -> Optional.of(PURGE_MASS_CANCEL_SYMBOL_LEVEL_BY_USER);
            case 'C' -> Optional.of(PURGE_MASS_CANCEL_CUSTOM_GROUP_ID_LEVEL_BY_USER);
            case 'E' -> Optional.of(TRADING_FIRM_LEVEL_LOCKOUT_BY_CBOE_TRADE_DESK_ADMIN);
            case 'J' -> Optional.of(FIRM_DISCONNECT);
            case 'K' -> Optional.of(MATCHING_ENGINE_DISCONNECT);
            case 'T' -> Optional.of(CBOE_TRADE_DESK_ADMIN);
            case 'f' -> Optional.of(RISK_MANAGEMENT_TRADING_FIRM_LEVEL_BY_RULE);
            case 's' -> Optional.of(RISK_MANAGEMENT_SYMBOL_LEVEL_BY_RULE);
            case '+' -> Optional.of(RISK_MANAGEMENT_TRADING_FIRM_GROUP_LEVEL_BY_RULE);
            case 'l' -> Optional.of(LIMIT_ORDER_COLLAR_BREACH);
            case 'p' -> Optional.of(SPIKE_PROTECTION_COLLAR_BREACH);
            default -> Optional.empty();
        };
    }
}
