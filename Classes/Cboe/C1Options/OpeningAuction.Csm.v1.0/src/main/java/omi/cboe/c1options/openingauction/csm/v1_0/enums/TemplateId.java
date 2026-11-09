package omi.cboe.c1options.openingauction.csm.v1_0.enums;

import java.util.Optional;

/**
 * The Template ID is for decoding the message.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * Security definitions describe an exchange’s products by name and trading parameters and associates those products with a product security ID.
     */
    SECURITY_DEFINITION_MESSAGE((short) 13, "Security definitions describe an exchange\u2019s products by name and trading parameters and associates those products with a product security ID."),

    /**
     * The Market Data Refresh message contains a snapshot / refresh of the Current Market and Recap information (Last Sale, Last Sale Size, Open, High, Low, Previous Close Price) for one product.
     */
    MARKET_DATA_REFRESH_MESSAGE((short) 20, "The Market Data Refresh message contains a snapshot / refresh of the Current Market and Recap information (Last Sale, Last Sale Size, Open, High, Low, Previous Close Price) for one product."),

    /**
     * The Current Market Update message contains real-time top of book market updates for a security.
     */
    CURRENT_MARKET_UPDATE_MESSAGE((short) 12, "The Current Market Update message contains real-time top of book market updates for a security."),

    /**
     * The EOP message contains expected opening price and size information for a security.
     */
    EXPECTED_OPENING_PRICE_AND_SIZE_MESSAGE((short) 15, "The EOP message contains expected opening price and size information for a security."),

    /**
     * This message contains only a standard header. The heartbeat will repeat at a regular interval
     */
    HEARTBEAT_MESSAGE((short) 16, "This message contains only a standard header. The heartbeat will repeat at a regular interval");

    private final short wire;

    private final String description;

    TemplateId(short wire, String description) {
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
    public static Optional<TemplateId> fromWire(short wire) {
        return switch (wire) {
            case 13 -> Optional.of(SECURITY_DEFINITION_MESSAGE);
            case 20 -> Optional.of(MARKET_DATA_REFRESH_MESSAGE);
            case 12 -> Optional.of(CURRENT_MARKET_UPDATE_MESSAGE);
            case 15 -> Optional.of(EXPECTED_OPENING_PRICE_AND_SIZE_MESSAGE);
            case 16 -> Optional.of(HEARTBEAT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
