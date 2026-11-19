package omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.enums;

import java.util.Optional;

/**
 * Allows for an order to be attributed to a firm's Executing Broker ID in Cboe market data feeds
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AttributedQuote {

    /**
     * Do Not Attribute Firm Executing Broker Id To This Order
     */
    DO_NOT_ATTRIBUTE_FIRM_EXECUTING_BROKER_ID_TO_THIS_ORDER('N', "Do Not Attribute Firm Executing Broker Id To This Order"),

    /**
     * Attribute Firm Executing Broker Id To This Order
     */
    ATTRIBUTE_FIRM_EXECUTING_BROKER_ID_TO_THIS_ORDER('Y', "Attribute Firm Executing Broker Id To This Order"),

    /**
     * Attribute Client Id Only
     */
    ATTRIBUTE_CLIENT_ID_ONLY('C', "Attribute Client Id Only"),

    /**
     * Attribute Both Clearing Firm Efid And Client Id
     */
    ATTRIBUTE_BOTH_CLEARING_FIRM_EFID_AND_CLIENT_ID('Z', "Attribute Both Clearing Firm Efid And Client Id");

    private final char wire;

    private final String description;

    AttributedQuote(char wire, String description) {
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
    public static Optional<AttributedQuote> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(DO_NOT_ATTRIBUTE_FIRM_EXECUTING_BROKER_ID_TO_THIS_ORDER);
            case 'Y' -> Optional.of(ATTRIBUTE_FIRM_EXECUTING_BROKER_ID_TO_THIS_ORDER);
            case 'C' -> Optional.of(ATTRIBUTE_CLIENT_ID_ONLY);
            case 'Z' -> Optional.of(ATTRIBUTE_BOTH_CLEARING_FIRM_EFID_AND_CLIENT_ID);
            default -> Optional.empty();
        };
    }
}
