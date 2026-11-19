package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the Subreason values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Subreason {

    /**
     * Purge/mass cancel EFID level by user
     */
    PURGEMASS_CANCEL_EFID_LEVEL_BY_USER('A', "Purge/mass cancel EFID level by user"),

    /**
     * Purge/mass cancel Symbol level by user
     */
    PURGEMASS_CANCEL_SYMBOL_LEVEL_BY_USER('B', "Purge/mass cancel Symbol level by user"),

    /**
     * Purge/mass cancel Custom Group ID level by user
     */
    PURGEMASS_CANCEL_CUSTOM_GROUP_ID_LEVEL_BY_USER('C', "Purge/mass cancel Custom Group ID level by user"),

    /**
     * EFID level lockout by Cboe Trade Desk admin
     */
    EFID_LEVEL_LOCKOUT_BY_CBOE_TRADE_DESK_ADMIN('E', "EFID level lockout by Cboe Trade Desk admin"),

    /**
     * Firm disconnect
     */
    FIRM_DISCONNECT('J', "Firm disconnect"),

    /**
     * ME disconnect
     */
    ME_DISCONNECT('K', "ME disconnect"),

    /**
     * Unregistered MM Account
     */
    UNREGISTERED_MM_ACCOUNT('L', "Unregistered MM Account"),

    /**
     * Minimum size requirement not met
     */
    MINIMUM_SIZE_REQUIREMENT_NOT_MET('S', "Minimum size requirement not met"),

    /**
     * Cboe Trade Desk admin
     */
    CBOE_TRADE_DESK_ADMIN('T', "Cboe Trade Desk admin"),

    /**
     * Risk management EFID level by rule
     */
    RISK_MANAGEMENT_EFID_LEVEL_BY_RULE('f', "Risk management EFID level by rule"),

    /**
     * Risk management Symbol level by rule
     */
    RISK_MANAGEMENT_SYMBOL_LEVEL_BY_RULE('s', "Risk management Symbol level by rule"),

    /**
     * Risk management EFID Group level by rule
     */
    RISK_MANAGEMENT_EFID_GROUP_LEVEL_BY_RULE('+', "Risk management EFID Group level by rule");

    private final char wire;

    private final String description;

    Subreason(char wire, String description) {
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
    public static Optional<Subreason> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(PURGEMASS_CANCEL_EFID_LEVEL_BY_USER);
            case 'B' -> Optional.of(PURGEMASS_CANCEL_SYMBOL_LEVEL_BY_USER);
            case 'C' -> Optional.of(PURGEMASS_CANCEL_CUSTOM_GROUP_ID_LEVEL_BY_USER);
            case 'E' -> Optional.of(EFID_LEVEL_LOCKOUT_BY_CBOE_TRADE_DESK_ADMIN);
            case 'J' -> Optional.of(FIRM_DISCONNECT);
            case 'K' -> Optional.of(ME_DISCONNECT);
            case 'L' -> Optional.of(UNREGISTERED_MM_ACCOUNT);
            case 'S' -> Optional.of(MINIMUM_SIZE_REQUIREMENT_NOT_MET);
            case 'T' -> Optional.of(CBOE_TRADE_DESK_ADMIN);
            case 'f' -> Optional.of(RISK_MANAGEMENT_EFID_LEVEL_BY_RULE);
            case 's' -> Optional.of(RISK_MANAGEMENT_SYMBOL_LEVEL_BY_RULE);
            case '+' -> Optional.of(RISK_MANAGEMENT_EFID_GROUP_LEVEL_BY_RULE);
            default -> Optional.empty();
        };
    }
}
