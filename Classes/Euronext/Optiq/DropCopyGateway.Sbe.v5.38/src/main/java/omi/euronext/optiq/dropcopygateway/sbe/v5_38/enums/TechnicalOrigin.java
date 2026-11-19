package omi.euronext.optiq.dropcopygateway.sbe.v5_38.enums;

import java.util.Optional;

/**
 * technicalOrigin
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TechnicalOrigin {

    /**
     * Index_trading_arbitrage
     */
    INDEXTRADINGARBITRAGE((short) 1, "Index_trading_arbitrage"),

    /**
     * Portfolio_strategy
     */
    PORTFOLIOSTRATEGY((short) 2, "Portfolio_strategy"),

    /**
     * Unwind_order
     */
    UNWINDORDER((short) 3, "Unwind_order"),

    /**
     * Other_orders__default
     */
    OTHERORDERSDEFAULT((short) 4, "Other_orders__default"),

    /**
     * Cross_margining
     */
    CROSSMARGINING((short) 5, "Cross_margining"),

    /**
     * technicalOrigin
     */
    NO_VALUE((short) 255, "technicalOrigin");

    private final short wire;

    private final String description;

    TechnicalOrigin(short wire, String description) {
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
    public static Optional<TechnicalOrigin> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(INDEXTRADINGARBITRAGE);
            case 2 -> Optional.of(PORTFOLIOSTRATEGY);
            case 3 -> Optional.of(UNWINDORDER);
            case 4 -> Optional.of(OTHERORDERSDEFAULT);
            case 5 -> Optional.of(CROSSMARGINING);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
