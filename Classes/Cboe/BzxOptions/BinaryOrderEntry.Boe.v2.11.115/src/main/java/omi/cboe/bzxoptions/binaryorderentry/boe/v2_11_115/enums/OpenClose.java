package omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the OpenClose values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpenClose {

    /**
     * Open
     */
    OPEN('O', "Open"),

    /**
     * Close
     */
    CLOSE('C', "Close"),

    /**
     * None* *Orders with Capacity = M or N will not be required to specify OpenClose on their orders. A value of N may optionally be specified unless the series is limited to closing only. If the series is limited to closing only transactions, only Capacity = M will be permitted to submit OpenClose = O if the order has TimeInForce = 3 (IOC) and RoutingInst = B, or the order has RoutingInst = P. An Open position cannot trade with an Open position for series limited to Closing Only transactions, even if the inbound IOC from the aggressing market maker is sent with that combination of tags.
     */
    NONE('N', "None* *Orders with Capacity = M or N will not be required to specify OpenClose on their orders. A value of N may optionally be specified unless the series is limited to closing only. If the series is limited to closing only transactions, only Capacity = M will be permitted to submit OpenClose = O if the order has TimeInForce = 3 (IOC) and RoutingInst = B, or the order has RoutingInst = P. An Open position cannot trade with an Open position for series limited to Closing Only transactions, even if the inbound IOC from the aggressing market maker is sent with that combination of tags.");

    private final char wire;

    private final String description;

    OpenClose(char wire, String description) {
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
    public static Optional<OpenClose> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPEN);
            case 'C' -> Optional.of(CLOSE);
            case 'N' -> Optional.of(NONE);
            default -> Optional.empty();
        };
    }
}
