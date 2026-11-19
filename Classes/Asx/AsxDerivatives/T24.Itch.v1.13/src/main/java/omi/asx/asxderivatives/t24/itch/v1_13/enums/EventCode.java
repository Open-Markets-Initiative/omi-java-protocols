package omi.asx.asxderivatives.t24.itch.v1_13.enums;

import java.util.Optional;

/**
 * See System Event Code Explanation below
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * New Trade Date is opening
     */
    OPEN('O', "New Trade Date is opening"),

    /**
     * Messages will start for this Trade Date
     */
    START('S', "Messages will start for this Trade Date"),

    /**
     * Trade Date has Ended
     */
    END('C', "Trade Date has Ended"),

    /**
     * System is Paused, note applies to all trade dates
     */
    PAUSED('P', "System is Paused, note applies to all trade dates"),

    /**
     * System is Resumed, note applies to all trade dates
     */
    RESUMED('R', "System is Resumed, note applies to all trade dates");

    private final char wire;

    private final String description;

    EventCode(char wire, String description) {
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
    public static Optional<EventCode> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPEN);
            case 'S' -> Optional.of(START);
            case 'C' -> Optional.of(END);
            case 'P' -> Optional.of(PAUSED);
            case 'R' -> Optional.of(RESUMED);
            default -> Optional.empty();
        };
    }
}
