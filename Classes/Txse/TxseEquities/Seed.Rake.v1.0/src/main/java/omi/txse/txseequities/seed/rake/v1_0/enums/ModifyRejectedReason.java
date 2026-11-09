package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum ModifyRejectedReason.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ModifyRejectedReason {

    /**
     * Client Order Id is invalid.
     */
    INVALID_CLIENT_ORDER_ID((byte) 1, "Client Order Id is invalid."),

    /**
     * Client Order Id has already been used for the current session on this port.
     */
    DUPLICATE_CLIENT_ORDER_ID((byte) 2, "Client Order Id has already been used for the current session on this port."),

    /**
     * Attempt to modify or replace a client order that was not found for the current session on this port.
     */
    UNKNOWN_ORIGINAL_CLIENT_ORDER_ID((byte) 3, "Attempt to modify or replace a client order that was not found for the current session on this port."),

    /**
     * Attempt to modify, replace, or cancel an order that has already canceled or fully executed.
     */
    NO_LONGER_ON_BOOK((byte) 4, "Attempt to modify, replace, or cancel an order that has already canceled or fully executed."),

    /**
     * Symbol ID is not valid for the current session.
     */
    INVALID_SYMBOL((byte) 5, "Symbol ID is not valid for the current session."),

    /**
     * Invalid limit price.
     */
    INVALID_PRICE((byte) 6, "Invalid limit price."),

    /**
     * Invalid order quantity.
     */
    INVALID_ORDER_QUANTITY((byte) 7, "Invalid order quantity."),

    /**
     * Invalid reference price target related to the order attributes.
     */
    INVALID_REFERENCE_PRICE_TARGET((byte) 8, "Invalid reference price target related to the order attributes."),

    /**
     * Invalid 'Is Hidden' flag related to the order attributes.
     */
    INVALID_IS_HIDDEN_FLAG((byte) 9, "Invalid 'Is Hidden' flag related to the order attributes."),

    /**
     * Invalid order type related to the order attributes.
     */
    INVALID_ORDER_TYPE((byte) 10, "Invalid order type related to the order attributes."),

    /**
     * Invalid side.
     */
    INVALID_SIDE((byte) 11, "Invalid side."),

    /**
     * Invalid max floor quantity related to the order attributes.
     */
    INVALID_MAX_FLOOR_QUANTITY((byte) 12, "Invalid max floor quantity related to the order attributes."),

    /**
     * Invalid maximum replenish quantity range.
     */
    INVALID_MAX_REPLENISH_QUANTITY_RANGE((byte) 13, "Invalid maximum replenish quantity range."),

    /**
     * Invalid maximum replenish time range.
     */
    INVALID_MAX_REPLENISH_TIME_RANGE((byte) 14, "Invalid maximum replenish time range."),

    /**
     * Invalid minimum quantity.
     */
    INVALID_MINIMUM_QUANTITY((byte) 15, "Invalid minimum quantity."),

    /**
     * Invalid locate-required flag related to the order attributes.
     */
    INVALID_LOCATE_REQUIRED_FLAG((byte) 16, "Invalid locate-required flag related to the order attributes."),

    /**
     * Invalid time in force.
     */
    INVALID_TIME_IN_FORCE((byte) 17, "Invalid time in force."),

    /**
     * Order modification not permitted.
     */
    MODIFICATION_NOT_PERMITTED((byte) 18, "Order modification not permitted."),

    /**
     * Invalid market participant identifier.
     */
    INVALID_MPID((byte) 19, "Invalid market participant identifier."),

    /**
     * Invalid sender comp.
     */
    INVALID_SENDER_COMP((byte) 20, "Invalid sender comp."),

    /**
     * Invalid 'Is Post Only' flag related to the order attributes.
     */
    INVALID_IS_POST_ONLY_FLAG((byte) 21, "Invalid 'Is Post Only' flag related to the order attributes."),

    /**
     * Invalid expire time.
     */
    INVALID_EXPIRE_TIME((byte) 22, "Invalid expire time."),

    /**
     * Not permitted during the current trading session.
     */
    INVALID_FOR_TRADING_SESSION((byte) 23, "Not permitted during the current trading session."),

    /**
     * Not permitted during the current trading status.
     */
    INVALID_FOR_TRADING_STATUS((byte) 24, "Not permitted during the current trading status."),

    /**
     * Not permitted during the current symbol status.
     */
    INVALID_FOR_SYMBOL_STATUS((byte) 25, "Not permitted during the current symbol status."),

    /**
     * Invalid 'Is ISO' flag related to the order attributes (ISO = Intermarket Sweep Order).
     */
    INVALID_IS_ISO_FLAG((byte) 26, "Invalid 'Is ISO' flag related to the order attributes (ISO = Intermarket Sweep Order)."),

    /**
     * Trading is disabled for the MPID on this port based on port MPID settings configuration.
     */
    TRADING_DISABLED_FOR_MPID_ON_PORT((byte) 27, "Trading is disabled for the MPID on this port based on port MPID settings configuration."),

    /**
     * Trading is restricted to test symbols only based on port settings configuration.
     */
    TRADING_DISABLED_FOR_NON_TEST_SYMBOLS((byte) 28, "Trading is restricted to test symbols only based on port settings configuration."),

    /**
     * Trading is disabled for the specified order capacity based on port settings configuration.
     */
    TRADING_DISABLED_FOR_ORDER_CAPACITY((byte) 29, "Trading is disabled for the specified order capacity based on port settings configuration."),

    /**
     * ISO (Intermarket Sweep Order) trading is disabled based on port settings configuration.
     */
    TRADING_DISABLED_FOR_ISO((byte) 30, "ISO (Intermarket Sweep Order) trading is disabled based on port settings configuration."),

    /**
     * Order quantity exceeds the maximum shares limit configured in port settings.
     */
    MAXIMUM_ORDER_QUANTITY_BREACHED((byte) 31, "Order quantity exceeds the maximum shares limit configured in port settings."),

    /**
     * Limit price exceeds the maximum acceptable price for the Exchange.
     */
    MAXIMUM_PRICE_BREACHED((byte) 32, "Limit price exceeds the maximum acceptable price for the Exchange."),

    /**
     * Order notional value exceeds the maximum notional limit configured in port settings.
     */
    MAXIMUM_NOTIONAL_BREACHED((byte) 33, "Order notional value exceeds the maximum notional limit configured in port settings."),

    /**
     * Mass Cancel Request Id is invalid.
     */
    INVALID_MASS_CANCEL_REQUEST_ID((byte) 34, "Mass Cancel Request Id is invalid."),

    /**
     * Symbol is on the restricted list for this port/MPID based on port settings configuration.
     */
    SYMBOL_ON_RESTRICTED_LIST((byte) 35, "Symbol is on the restricted list for this port/MPID based on port settings configuration."),

    /**
     * Order limit price is outside LULD (Limit Up-Limit Down) bands and port settings require rejection.
     */
    LULD_BAND_BREACHED((byte) 36, "Order limit price is outside LULD (Limit Up-Limit Down) bands and port settings require rejection."),

    /**
     * Price does not conform to the minimum price variation (tick size).
     */
    INVALID_PRICE_INCREMENT((byte) 37, "Price does not conform to the minimum price variation (tick size)."),

    /**
     * Auction-Only orders for the Open and Close cannot be cancelled, modified, or replaced once the Band Window begins.
     */
    AUCTION_ORDER_NOT_CANCELABLE((byte) 38, "Auction-Only orders for the Open and Close cannot be cancelled, modified, or replaced once the Band Window begins."),

    /**
     * Order property is incompatible with an auction-classed order.
     */
    INVALID_FOR_AUCTION_ORDER((byte) 39, "Order property is incompatible with an auction-classed order.");

    private final byte wire;

    private final String description;

    ModifyRejectedReason(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<ModifyRejectedReason> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(INVALID_CLIENT_ORDER_ID);
            case 2 -> Optional.of(DUPLICATE_CLIENT_ORDER_ID);
            case 3 -> Optional.of(UNKNOWN_ORIGINAL_CLIENT_ORDER_ID);
            case 4 -> Optional.of(NO_LONGER_ON_BOOK);
            case 5 -> Optional.of(INVALID_SYMBOL);
            case 6 -> Optional.of(INVALID_PRICE);
            case 7 -> Optional.of(INVALID_ORDER_QUANTITY);
            case 8 -> Optional.of(INVALID_REFERENCE_PRICE_TARGET);
            case 9 -> Optional.of(INVALID_IS_HIDDEN_FLAG);
            case 10 -> Optional.of(INVALID_ORDER_TYPE);
            case 11 -> Optional.of(INVALID_SIDE);
            case 12 -> Optional.of(INVALID_MAX_FLOOR_QUANTITY);
            case 13 -> Optional.of(INVALID_MAX_REPLENISH_QUANTITY_RANGE);
            case 14 -> Optional.of(INVALID_MAX_REPLENISH_TIME_RANGE);
            case 15 -> Optional.of(INVALID_MINIMUM_QUANTITY);
            case 16 -> Optional.of(INVALID_LOCATE_REQUIRED_FLAG);
            case 17 -> Optional.of(INVALID_TIME_IN_FORCE);
            case 18 -> Optional.of(MODIFICATION_NOT_PERMITTED);
            case 19 -> Optional.of(INVALID_MPID);
            case 20 -> Optional.of(INVALID_SENDER_COMP);
            case 21 -> Optional.of(INVALID_IS_POST_ONLY_FLAG);
            case 22 -> Optional.of(INVALID_EXPIRE_TIME);
            case 23 -> Optional.of(INVALID_FOR_TRADING_SESSION);
            case 24 -> Optional.of(INVALID_FOR_TRADING_STATUS);
            case 25 -> Optional.of(INVALID_FOR_SYMBOL_STATUS);
            case 26 -> Optional.of(INVALID_IS_ISO_FLAG);
            case 27 -> Optional.of(TRADING_DISABLED_FOR_MPID_ON_PORT);
            case 28 -> Optional.of(TRADING_DISABLED_FOR_NON_TEST_SYMBOLS);
            case 29 -> Optional.of(TRADING_DISABLED_FOR_ORDER_CAPACITY);
            case 30 -> Optional.of(TRADING_DISABLED_FOR_ISO);
            case 31 -> Optional.of(MAXIMUM_ORDER_QUANTITY_BREACHED);
            case 32 -> Optional.of(MAXIMUM_PRICE_BREACHED);
            case 33 -> Optional.of(MAXIMUM_NOTIONAL_BREACHED);
            case 34 -> Optional.of(INVALID_MASS_CANCEL_REQUEST_ID);
            case 35 -> Optional.of(SYMBOL_ON_RESTRICTED_LIST);
            case 36 -> Optional.of(LULD_BAND_BREACHED);
            case 37 -> Optional.of(INVALID_PRICE_INCREMENT);
            case 38 -> Optional.of(AUCTION_ORDER_NOT_CANCELABLE);
            case 39 -> Optional.of(INVALID_FOR_AUCTION_ORDER);
            default -> Optional.empty();
        };
    }
}
