package omi.euronext.optiq.dropcopygateway.sbe.v6_64.enums;

import java.util.Optional;

/**
 * eMM
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Emm {

    /**
     * Cash_and_Derivative_Central_Order_Book
     */
    CASHAND_DERIVATIVE_CENTRAL_ORDER_BOOK((short) 1, "Cash_and_Derivative_Central_Order_Book"),

    /**
     * NAV_Trading_Facility
     */
    NAV_TRADING_FACILITY((short) 2, "NAV_Trading_Facility"),

    /**
     * Derivatives_Wholesales
     */
    DERIVATIVES_WHOLESALES((short) 4, "Derivatives_Wholesales"),

    /**
     * Cash_On_Exchange_Off_book
     */
    CASH_ON_EXCHANGE_OFFBOOK((short) 5, "Cash_On_Exchange_Off_book"),

    /**
     * Euronext_off_exchange_trade_reports
     */
    EURONEXTOFFEXCHANGETRADEREPORTS((short) 6, "Euronext_off_exchange_trade_reports"),

    /**
     * Derivatives_On_Exchange_Off_book
     */
    DERIVATIVES_ON_EXCHANGE_OFFBOOK((short) 7, "Derivatives_On_Exchange_Off_book"),

    /**
     * ETF_MTF_NAV_Central_Order_Book
     */
    ETFMTFNAV_CENTRAL_ORDER_BOOK((short) 8, "ETF_MTF_NAV_Central_Order_Book"),

    /**
     * Listed_not_traded
     */
    LISTEDNOTTRADED((short) 9, "Listed_not_traded"),

    /**
     * Quote_Advertisement
     */
    QUOTE_ADVERTISEMENT((short) 14, "Quote_Advertisement"),

    /**
     * Delta_Neutral_Contingency_Leg
     */
    DELTA_NEUTRAL_CONTINGENCY_LEG((short) 15, "Delta_Neutral_Contingency_Leg"),

    /**
     * ERS
     */
    ERS((short) 17, "ERS"),

    /**
     * Not_Applicable
     */
    NOT_APPLICABLE((short) 99, "Not_Applicable");

    private final short wire;

    private final String description;

    Emm(short wire, String description) {
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
    public static Optional<Emm> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CASHAND_DERIVATIVE_CENTRAL_ORDER_BOOK);
            case 2 -> Optional.of(NAV_TRADING_FACILITY);
            case 4 -> Optional.of(DERIVATIVES_WHOLESALES);
            case 5 -> Optional.of(CASH_ON_EXCHANGE_OFFBOOK);
            case 6 -> Optional.of(EURONEXTOFFEXCHANGETRADEREPORTS);
            case 7 -> Optional.of(DERIVATIVES_ON_EXCHANGE_OFFBOOK);
            case 8 -> Optional.of(ETFMTFNAV_CENTRAL_ORDER_BOOK);
            case 9 -> Optional.of(LISTEDNOTTRADED);
            case 14 -> Optional.of(QUOTE_ADVERTISEMENT);
            case 15 -> Optional.of(DELTA_NEUTRAL_CONTINGENCY_LEG);
            case 17 -> Optional.of(ERS);
            case 99 -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
