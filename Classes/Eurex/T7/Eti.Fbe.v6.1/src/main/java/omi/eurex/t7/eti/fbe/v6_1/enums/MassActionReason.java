package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the MassActionReason values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassActionReason {

    /**
     * No special reason
     */
    NO_SPECIAL_REASON((short) 0, "No special reason"),

    /**
     * Trading was stopped
     */
    STOP_TRADING((short) 1, "Trading was stopped"),

    /**
     * Emergency
     */
    EMERGENCY((short) 2, "Emergency"),

    /**
     * Market Maker Protection
     */
    MARKET_MAKER_PROTECTION((short) 3, "Market Maker Protection"),

    /**
     * Session loss or logout
     */
    SESSION_LOSS((short) 6, "Session loss or logout"),

    /**
     * Duplicate Session Login
     */
    DUPLICATE_SESSION_LOGIN((short) 7, "Duplicate Session Login"),

    /**
     * Clearing Risk Control
     */
    CLEARING_RISK_CONTROL((short) 8, "Clearing Risk Control"),

    /**
     * Product State Halt
     */
    PRODUCT_STATE_HALT((short) 105, "Product State Halt"),

    /**
     * Product State Holiday
     */
    PRODUCT_STATE_HOLIDAY((short) 106, "Product State Holiday"),

    /**
     * Instrument Suspended
     */
    INSTRUMENT_SUSPENDED((short) 107, "Instrument Suspended"),

    /**
     * Complex Instrument Deletion
     */
    COMPLEX_INSTRUMENT_DELETION((short) 109, "Complex Instrument Deletion"),

    /**
     * Volatility Interruption
     */
    VOLATILITY_INTERRUPTION((short) 110, "Volatility Interruption"),

    /**
     * Product temporarily not tradeable
     */
    PRODUCTTEMPORARILYNOTTRADEABLE((short) 111, "Product temporarily not tradeable"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    MassActionReason(short wire, String description) {
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
    public static Optional<MassActionReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_SPECIAL_REASON);
            case 1 -> Optional.of(STOP_TRADING);
            case 2 -> Optional.of(EMERGENCY);
            case 3 -> Optional.of(MARKET_MAKER_PROTECTION);
            case 6 -> Optional.of(SESSION_LOSS);
            case 7 -> Optional.of(DUPLICATE_SESSION_LOGIN);
            case 8 -> Optional.of(CLEARING_RISK_CONTROL);
            case 105 -> Optional.of(PRODUCT_STATE_HALT);
            case 106 -> Optional.of(PRODUCT_STATE_HOLIDAY);
            case 107 -> Optional.of(INSTRUMENT_SUSPENDED);
            case 109 -> Optional.of(COMPLEX_INSTRUMENT_DELETION);
            case 110 -> Optional.of(VOLATILITY_INTERRUPTION);
            case 111 -> Optional.of(PRODUCTTEMPORARILYNOTTRADEABLE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
