package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Rejection motive
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CxlRejReason {

    /**
     * By Trader
     */
    BY_TRADER('1', "By Trader"),

    /**
     * By Supervisor
     */
    BY_SUPERVISOR('3', "By Supervisor"),

    /**
     * Volume Modification Incorrect New Volume Total Volume Filled
     */
    VOLUME_MODIFICATION_INCORRECT_NEW_VOLUME_TOTAL_VOLUME_FILLED('4', "Volume Modification Incorrect New Volume Total Volume Filled"),

    /**
     * Not Executed Immediately
     */
    NOT_EXECUTED_IMMEDIATELY('5', "Not Executed Immediately"),

    /**
     * Security Not Current Or Not Tradeable For This Member
     */
    SECURITY_NOT_CURRENT_OR_NOT_TRADEABLE_FOR_THIS_MEMBER('6', "Security Not Current Or Not Tradeable For This Member"),

    /**
     * By Limits
     */
    BY_LIMITS('7', "By Limits"),

    /**
     * Cancelled By Market Status
     */
    CANCELLED_BY_MARKET_STATUS('8', "Cancelled By Market Status"),

    /**
     * Invalid Data
     */
    INVALID_DATA('9', "Invalid Data"),

    /**
     * Disconnection Of The Client Application
     */
    DISCONNECTION_OF_THE_CLIENT_APPLICATION('E', "Disconnection Of The Client Application"),

    /**
     * Quote Parameters Missing
     */
    QUOTE_PARAMETERS_MISSING('F', "Quote Parameters Missing"),

    /**
     * By Permissions
     */
    BY_PERMISSIONS('G', "By Permissions"),

    /**
     * Quote Or Cl Ord Id Incorrect
     */
    QUOTE_OR_CL_ORD_ID_INCORRECT('H', "Quote Or Cl Ord Id Incorrect"),

    /**
     * Quote Cancelled By Substitution
     */
    QUOTE_CANCELLED_BY_SUBSTITUTION('Q', "Quote Cancelled By Substitution"),

    /**
     * Not Prices For Processing The Order
     */
    NOT_PRICES_FOR_PROCESSING_THE_ORDER('W', "Not Prices For Processing The Order"),

    /**
     * By End Of Validity Of The Order
     */
    BY_END_OF_VALIDITY_OF_THE_ORDER('X', "By End Of Validity Of The Order"),

    /**
     * Other
     */
    OTHER('Z', "Other"),

    /**
     * Not Authorized
     */
    NOT_AUTHORIZED('a', "Not Authorized"),

    /**
     * By Minimum Trading Volume
     */
    BY_MINIMUM_TRADING_VOLUME('b', "By Minimum Trading Volume"),

    /**
     * Price Not According To The Size Typology
     */
    PRICE_NOT_ACCORDING_TO_THE_SIZE_TYPOLOGY('c', "Price Not According To The Size Typology"),

    /**
     * The Order Volumemust Be A Multiple Of The Trading Lot Size
     */
    THE_ORDER_VOLUMEMUST_BE_A_MULTIPLE_OF_THE_TRADING_LOT_SIZE('d', "The Order Volumemust Be A Multiple Of The Trading Lot Size"),

    /**
     * Order Rejected For Triggering Auction
     */
    ORDER_REJECTED_FOR_TRIGGERING_AUCTION('e', "Order Rejected For Triggering Auction"),

    /**
     * By Quantity To Be Displayed
     */
    BY_QUANTITY_TO_BE_DISPLAYED('f', "By Quantity To Be Displayed"),

    /**
     * Incorrect Price
     */
    INCORRECT_PRICE('g', "Incorrect Price"),

    /**
     * Incorrect Volume
     */
    INCORRECT_VOLUME('h', "Incorrect Volume"),

    /**
     * Incorrect Date
     */
    INCORRECT_DATE('i', "Incorrect Date"),

    /**
     * Ioc Order Fails The Authorized Trader Filter
     */
    IOC_ORDER_FAILS_THE_AUTHORIZED_TRADER_FILTER('j', "Ioc Order Fails The Authorized Trader Filter"),

    /**
     * By Contract Status
     */
    BY_CONTRACT_STATUS('k', "By Contract Status"),

    /**
     * Kill Button
     */
    KILL_BUTTON('m', "Kill Button"),

    /**
     * Invalid Ork Fields
     */
    INVALID_ORK_FIELDS('x', "Invalid Ork Fields");

    private final char wire;

    private final String description;

    CxlRejReason(char wire, String description) {
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
    public static Optional<CxlRejReason> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(BY_TRADER);
            case '3' -> Optional.of(BY_SUPERVISOR);
            case '4' -> Optional.of(VOLUME_MODIFICATION_INCORRECT_NEW_VOLUME_TOTAL_VOLUME_FILLED);
            case '5' -> Optional.of(NOT_EXECUTED_IMMEDIATELY);
            case '6' -> Optional.of(SECURITY_NOT_CURRENT_OR_NOT_TRADEABLE_FOR_THIS_MEMBER);
            case '7' -> Optional.of(BY_LIMITS);
            case '8' -> Optional.of(CANCELLED_BY_MARKET_STATUS);
            case '9' -> Optional.of(INVALID_DATA);
            case 'E' -> Optional.of(DISCONNECTION_OF_THE_CLIENT_APPLICATION);
            case 'F' -> Optional.of(QUOTE_PARAMETERS_MISSING);
            case 'G' -> Optional.of(BY_PERMISSIONS);
            case 'H' -> Optional.of(QUOTE_OR_CL_ORD_ID_INCORRECT);
            case 'Q' -> Optional.of(QUOTE_CANCELLED_BY_SUBSTITUTION);
            case 'W' -> Optional.of(NOT_PRICES_FOR_PROCESSING_THE_ORDER);
            case 'X' -> Optional.of(BY_END_OF_VALIDITY_OF_THE_ORDER);
            case 'Z' -> Optional.of(OTHER);
            case 'a' -> Optional.of(NOT_AUTHORIZED);
            case 'b' -> Optional.of(BY_MINIMUM_TRADING_VOLUME);
            case 'c' -> Optional.of(PRICE_NOT_ACCORDING_TO_THE_SIZE_TYPOLOGY);
            case 'd' -> Optional.of(THE_ORDER_VOLUMEMUST_BE_A_MULTIPLE_OF_THE_TRADING_LOT_SIZE);
            case 'e' -> Optional.of(ORDER_REJECTED_FOR_TRIGGERING_AUCTION);
            case 'f' -> Optional.of(BY_QUANTITY_TO_BE_DISPLAYED);
            case 'g' -> Optional.of(INCORRECT_PRICE);
            case 'h' -> Optional.of(INCORRECT_VOLUME);
            case 'i' -> Optional.of(INCORRECT_DATE);
            case 'j' -> Optional.of(IOC_ORDER_FAILS_THE_AUTHORIZED_TRADER_FILTER);
            case 'k' -> Optional.of(BY_CONTRACT_STATUS);
            case 'm' -> Optional.of(KILL_BUTTON);
            case 'x' -> Optional.of(INVALID_ORK_FIELDS);
            default -> Optional.empty();
        };
    }
}
