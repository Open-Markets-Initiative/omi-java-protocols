package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Received Dept Id
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReceivedDeptId {

    /**
     * Orders Placed Through The Internet
     */
    ORDERS_PLACED_THROUGH_THE_INTERNET('I', "Orders Placed Through The Internet"),

    /**
     * Orders Placed Through The Bank Branch Network
     */
    ORDERS_PLACED_THROUGH_THE_BANK_BRANCH_NETWORK('B', "Orders Placed Through The Bank Branch Network"),

    /**
     * Orders Placed Through Automatic Trading Systems
     */
    ORDERS_PLACED_THROUGH_AUTOMATIC_TRADING_SYSTEMS('T', "Orders Placed Through Automatic Trading Systems"),

    /**
     * Orders Placed By Important Clients
     */
    ORDERS_PLACED_BY_IMPORTANT_CLIENTS('C', "Orders Placed By Important Clients"),

    /**
     * Others
     */
    OTHERS('O', "Others"),

    /**
     * Na Workstation
     */
    NA_WORKSTATION(' ', "Na Workstation");

    private final char wire;

    private final String description;

    ReceivedDeptId(char wire, String description) {
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
    public static Optional<ReceivedDeptId> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(ORDERS_PLACED_THROUGH_THE_INTERNET);
            case 'B' -> Optional.of(ORDERS_PLACED_THROUGH_THE_BANK_BRANCH_NETWORK);
            case 'T' -> Optional.of(ORDERS_PLACED_THROUGH_AUTOMATIC_TRADING_SYSTEMS);
            case 'C' -> Optional.of(ORDERS_PLACED_BY_IMPORTANT_CLIENTS);
            case 'O' -> Optional.of(OTHERS);
            case ' ' -> Optional.of(NA_WORKSTATION);
            default -> Optional.empty();
        };
    }
}
