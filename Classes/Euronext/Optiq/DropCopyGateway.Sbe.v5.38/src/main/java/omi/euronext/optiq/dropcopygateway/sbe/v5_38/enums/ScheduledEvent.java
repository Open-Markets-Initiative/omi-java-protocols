package omi.euronext.optiq.dropcopygateway.sbe.v5_38.enums;

import java.util.Optional;

/**
 * scheduledEvent
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ScheduledEvent {

    /**
     * Cancel_Previously_Scheduled_Event
     */
    CANCEL_PREVIOUSLY_SCHEDULED_EVENT((short) 0, "Cancel_Previously_Scheduled_Event"),

    /**
     * Reopening
     */
    REOPENING((short) 1, "Reopening"),

    /**
     * Resumption_of_trading
     */
    RESUMPTIONOFTRADING((short) 3, "Resumption_of_trading"),

    /**
     * Closed
     */
    CLOSED((short) 4, "Closed"),

    /**
     * Expiry
     */
    EXPIRY((short) 5, "Expiry"),

    /**
     * Wholesale_Large_in_Scale_LiS_trades_open_extension
     */
    WHOLESALE_LARGEIN_SCALE_LI_STRADESOPENEXTENSION((short) 6, "Wholesale_Large_in_Scale_LiS_trades_open_extension"),

    /**
     * Wholesale_Basis_trades_open_extension
     */
    WHOLESALE_BASISTRADESOPENEXTENSION((short) 7, "Wholesale_Basis_trades_open_extension"),

    /**
     * Wholesale_Against_Actuals_trades_open_extension
     */
    WHOLESALE_AGAINST_ACTUALSTRADESOPENEXTENSION((short) 8, "Wholesale_Against_Actuals_trades_open_extension"),

    /**
     * Wholesale_Large_in_Scale_LiS_Package_trades_open_extension
     */
    WHOLESALE_LARGEIN_SCALE_LI_S_PACKAGETRADESOPENEXTENSION((short) 9, "Wholesale_Large_in_Scale_LiS_Package_trades_open_extension"),

    /**
     * Wholesale_Exchange_For_Swaps_trades_open_extension
     */
    WHOLESALE_EXCHANGE_FOR_SWAPSTRADESOPENEXTENSION((short) 10, "Wholesale_Exchange_For_Swaps_trades_open_extension"),

    /**
     * Wholesale_Trades_Open_Extension
     */
    WHOLESALE_TRADES_OPEN_EXTENSION((short) 11, "Wholesale_Trades_Open_Extension"),

    /**
     * Suspension
     */
    SUSPENSION((short) 12, "Suspension"),

    /**
     * Collars_Normal
     */
    COLLARS_NORMAL((short) 13, "Collars_Normal"),

    /**
     * Collars_Wide
     */
    COLLARS_WIDE((short) 14, "Collars_Wide"),

    /**
     * Pre_Expiry
     */
    PRE_EXPIRY((short) 15, "Pre_Expiry"),

    /**
     * Closing_Price
     */
    CLOSING_PRICE((short) 16, "Closing_Price"),

    /**
     * scheduledEvent
     */
    NO_VALUE((short) 255, "scheduledEvent");

    private final short wire;

    private final String description;

    ScheduledEvent(short wire, String description) {
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
    public static Optional<ScheduledEvent> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(CANCEL_PREVIOUSLY_SCHEDULED_EVENT);
            case 1 -> Optional.of(REOPENING);
            case 3 -> Optional.of(RESUMPTIONOFTRADING);
            case 4 -> Optional.of(CLOSED);
            case 5 -> Optional.of(EXPIRY);
            case 6 -> Optional.of(WHOLESALE_LARGEIN_SCALE_LI_STRADESOPENEXTENSION);
            case 7 -> Optional.of(WHOLESALE_BASISTRADESOPENEXTENSION);
            case 8 -> Optional.of(WHOLESALE_AGAINST_ACTUALSTRADESOPENEXTENSION);
            case 9 -> Optional.of(WHOLESALE_LARGEIN_SCALE_LI_S_PACKAGETRADESOPENEXTENSION);
            case 10 -> Optional.of(WHOLESALE_EXCHANGE_FOR_SWAPSTRADESOPENEXTENSION);
            case 11 -> Optional.of(WHOLESALE_TRADES_OPEN_EXTENSION);
            case 12 -> Optional.of(SUSPENSION);
            case 13 -> Optional.of(COLLARS_NORMAL);
            case 14 -> Optional.of(COLLARS_WIDE);
            case 15 -> Optional.of(PRE_EXPIRY);
            case 16 -> Optional.of(CLOSING_PRICE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
