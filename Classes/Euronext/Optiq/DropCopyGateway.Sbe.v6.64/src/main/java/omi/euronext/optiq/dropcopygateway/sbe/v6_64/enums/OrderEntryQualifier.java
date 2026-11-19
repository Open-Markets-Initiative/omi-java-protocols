package omi.euronext.optiq.dropcopygateway.sbe.v6_64.enums;

import java.util.Optional;

/**
 * orderEntryQualifier
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderEntryQualifier {

    /**
     * Order_EntryCancelModify_Disabled
     */
    ORDER_ENTRY_CANCEL_MODIFY_DISABLED((short) 0, "Order_EntryCancelModify_Disabled"),

    /**
     * Order_EntryCancelModify_Enabled
     */
    ORDER_ENTRY_CANCEL_MODIFY_ENABLED((short) 1, "Order_EntryCancelModify_Enabled"),

    /**
     * Cancel_and_Modify_Only
     */
    CANCELAND_MODIFY_ONLY((short) 2, "Cancel_and_Modify_Only"),

    /**
     * Cancel_Only
     */
    CANCEL_ONLY((short) 3, "Cancel_Only"),

    /**
     * orderEntryQualifier
     */
    NO_VALUE((short) 255, "orderEntryQualifier");

    private final short wire;

    private final String description;

    OrderEntryQualifier(short wire, String description) {
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
    public static Optional<OrderEntryQualifier> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ORDER_ENTRY_CANCEL_MODIFY_DISABLED);
            case 1 -> Optional.of(ORDER_ENTRY_CANCEL_MODIFY_ENABLED);
            case 2 -> Optional.of(CANCELAND_MODIFY_ONLY);
            case 3 -> Optional.of(CANCEL_ONLY);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
