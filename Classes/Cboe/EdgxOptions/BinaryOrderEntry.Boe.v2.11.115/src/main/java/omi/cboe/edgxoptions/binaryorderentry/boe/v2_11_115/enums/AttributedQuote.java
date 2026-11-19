package omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the AttributedQuote values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AttributedQuote {

    /**
     * Do not attribute firm Executing Broker ID to this order (Default)
     */
    DO_NOT_ATTRIBUTE_FIRM_EXECUTING_BROKER_ID_TO_THIS_ORDER('N', "Do not attribute firm Executing Broker ID to this order (Default)"),

    /**
     * Attribute firm Executing Broker ID to this order
     */
    ATTRIBUTE_FIRM_EXECUTING_BROKER_ID_TO_THIS_ORDER('Y', "Attribute firm Executing Broker ID to this order"),

    /**
     * Attribute ClientID only.
     */
    ATTRIBUTE_CLIENT_ID_ONLY('C', "Attribute ClientID only."),

    /**
     * Attribute both ClearingFirm (EFID) and ClientID
     */
    ATTRIBUTE_BOTH_CLEARING_FIRM('Z', "Attribute both ClearingFirm (EFID) and ClientID");

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
            case 'Z' -> Optional.of(ATTRIBUTE_BOTH_CLEARING_FIRM);
            default -> Optional.empty();
        };
    }
}
