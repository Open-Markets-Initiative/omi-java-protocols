package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

import java.util.Optional;

/**
 * Treatment of Post Only orders on entry if creating a locked NBBO
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DisplayIndicator {

    /**
     * Default
     */
    POST_ONLY_ORDERS_WHICH_WOULD_LOCK_THE_NBBO_ON_ENTRY_ARE_ALLOWED_TO_DO_SO('V', "Default"),

    /**
     * Cancel Back A Post Only Order On Entry If It Were To Create A Locked Nbbo
     */
    CANCEL_BACK_A_POST_ONLY_ORDER_ON_ENTRY_IF_IT_WERE_TO_CREATE_A_LOCKED_NBBO('R', "Cancel Back A Post Only Order On Entry If It Were To Create A Locked Nbbo");

    private final char wire;

    private final String description;

    DisplayIndicator(char wire, String description) {
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
    public static Optional<DisplayIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'V' -> Optional.of(POST_ONLY_ORDERS_WHICH_WOULD_LOCK_THE_NBBO_ON_ENTRY_ARE_ALLOWED_TO_DO_SO);
            case 'R' -> Optional.of(CANCEL_BACK_A_POST_ONLY_ORDER_ON_ENTRY_IF_IT_WERE_TO_CREATE_A_LOCKED_NBBO);
            default -> Optional.empty();
        };
    }
}
