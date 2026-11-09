package omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums;

import java.util.Optional;

/**
 * Identifies the type of transaction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceIndicatorMarker {

    /**
     * As Of Trade
     */
    AS_OF_TRADE('A', "As Of Trade"),

    /**
     * Block Trade
     */
    BLOCK_TRADE('B', "Block Trade"),

    /**
     * Actual Transaction Took Place
     */
    ACTUAL_TRANSACTION_TOOK_PLACE(' ', "Actual Transaction Took Place"),

    /**
     * Crossed
     */
    CROSSED('D', "Crossed"),

    /**
     * Efp Reporting
     */
    EFP_REPORTING('E', "Efp Reporting"),

    /**
     * Contingent Trade
     */
    CONTINGENT_TRADE('G', "Contingent Trade"),

    /**
     * Riskless Basis Cross
     */
    RISKLESS_BASIS_CROSS('H', "Riskless Basis Cross"),

    /**
     * Implied Trade
     */
    IMPLIED_TRADE('I', "Implied Trade"),

    /**
     * Delta Trade
     */
    DELTA_TRADE('J', "Delta Trade"),

    /**
     * Committed Block
     */
    COMMITTED_BLOCK('K', "Committed Block"),

    /**
     * Late Trade
     */
    LATE_TRADE('L', "Late Trade"),

    /**
     * For Future Use
     */
    FOR_FUTURE_USE_M('M', "For Future Use"),

    /**
     * For Future Use
     */
    FOR_FUTURE_USE_N('N', "For Future Use"),

    /**
     * Strategy Reporting
     */
    STRATEGY_REPORTING('P', "Strategy Reporting"),

    /**
     * For Future Use
     */
    FOR_FUTURE_USE_Q('Q', "For Future Use"),

    /**
     * Efr Reporting
     */
    EFR_REPORTING('R', "Efr Reporting"),

    /**
     * Reference Price (volume field zero filled)
     */
    REFERENCE_PRICE('S', "Reference Price (volume field zero filled)"),

    /**
     * Trade Correction
     */
    TRADE_CORRECTION('t', "Trade Correction"),

    /**
     * Committed
     */
    COMMITTED('T', "Committed"),

    /**
     * Basis On Close
     */
    BASIS_ON_CLOSE('U', "Basis On Close"),

    /**
     * Price Volume Adjustment
     */
    PRICE_VOLUME_ADJUSTMENT('V', "Price Volume Adjustment"),

    /**
     * For Future Use
     */
    FOR_FUTURE_USE_Y('Y', "For Future Use"),

    /**
     * For Future Use
     */
    FOR_FUTURE_USE_Z('Z', "For Future Use");

    private final char wire;

    private final String description;

    PriceIndicatorMarker(char wire, String description) {
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
    public static Optional<PriceIndicatorMarker> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AS_OF_TRADE);
            case 'B' -> Optional.of(BLOCK_TRADE);
            case ' ' -> Optional.of(ACTUAL_TRANSACTION_TOOK_PLACE);
            case 'D' -> Optional.of(CROSSED);
            case 'E' -> Optional.of(EFP_REPORTING);
            case 'G' -> Optional.of(CONTINGENT_TRADE);
            case 'H' -> Optional.of(RISKLESS_BASIS_CROSS);
            case 'I' -> Optional.of(IMPLIED_TRADE);
            case 'J' -> Optional.of(DELTA_TRADE);
            case 'K' -> Optional.of(COMMITTED_BLOCK);
            case 'L' -> Optional.of(LATE_TRADE);
            case 'M' -> Optional.of(FOR_FUTURE_USE_M);
            case 'N' -> Optional.of(FOR_FUTURE_USE_N);
            case 'P' -> Optional.of(STRATEGY_REPORTING);
            case 'Q' -> Optional.of(FOR_FUTURE_USE_Q);
            case 'R' -> Optional.of(EFR_REPORTING);
            case 'S' -> Optional.of(REFERENCE_PRICE);
            case 't' -> Optional.of(TRADE_CORRECTION);
            case 'T' -> Optional.of(COMMITTED);
            case 'U' -> Optional.of(BASIS_ON_CLOSE);
            case 'V' -> Optional.of(PRICE_VOLUME_ADJUSTMENT);
            case 'Y' -> Optional.of(FOR_FUTURE_USE_Y);
            case 'Z' -> Optional.of(FOR_FUTURE_USE_Z);
            default -> Optional.empty();
        };
    }
}
