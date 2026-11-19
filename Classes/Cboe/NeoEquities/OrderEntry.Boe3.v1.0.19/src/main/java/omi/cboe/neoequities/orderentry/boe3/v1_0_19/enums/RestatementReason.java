package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Reason for the restatement
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RestatementReason {

    /**
     * Reload Iceberg Display Size Refreshed
     */
    RELOAD_ICEBERG_DISPLAY_SIZE_REFRESHED('L', "Reload Iceberg Display Size Refreshed"),

    /**
     * Reprice Ex Opr Mtl
     */
    REPRICE_EX_OPR_MTL('P', "Reprice Ex Opr Mtl"),

    /**
     * Partial Reduce Due Self Trade Prevention Result Based On No Trade Feat
     */
    PARTIAL_REDUCE_DUE_SELF_TRADE_PREVENTION_RESULT_BASED_ON_NO_TRADE_FEAT('W', "Partial Reduce Due Self Trade Prevention Result Based On No Trade Feat"),

    /**
     * Triggered Stop Order
     */
    TRIGGERED_STOP_ORDER('T', "Triggered Stop Order");

    private final char wire;

    private final String description;

    RestatementReason(char wire, String description) {
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
    public static Optional<RestatementReason> fromWire(char wire) {
        return switch (wire) {
            case 'L' -> Optional.of(RELOAD_ICEBERG_DISPLAY_SIZE_REFRESHED);
            case 'P' -> Optional.of(REPRICE_EX_OPR_MTL);
            case 'W' -> Optional.of(PARTIAL_REDUCE_DUE_SELF_TRADE_PREVENTION_RESULT_BASED_ON_NO_TRADE_FEAT);
            case 'T' -> Optional.of(TRIGGERED_STOP_ORDER);
            default -> Optional.empty();
        };
    }
}
