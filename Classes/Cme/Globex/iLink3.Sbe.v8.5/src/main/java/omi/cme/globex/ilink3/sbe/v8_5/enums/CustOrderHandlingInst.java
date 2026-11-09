package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer. Defines source of the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustOrderHandlingInst {

    /**
     * FCM provided screen
     */
    FC_MPROVIDEDSCREEN('C', "FCM provided screen"),

    /**
     * Other provided screen
     */
    OTHERPROVIDEDSCREEN('D', "Other provided screen"),

    /**
     * FCM API or FIX
     */
    FCMAPI_CTA_IX('G', "FCM API or FIX"),

    /**
     * Algo Engine
     */
    ALGO_ENGINE('H', "Algo Engine"),

    /**
     * Desk Electronic
     */
    DESK_ELECTRONIC('W', "Desk Electronic"),

    /**
     * Client Electronic
     */
    CLIENT_ELECTRONIC('Y', "Client Electronic");

    private final char wire;

    private final String description;

    CustOrderHandlingInst(char wire, String description) {
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
    public static Optional<CustOrderHandlingInst> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(FC_MPROVIDEDSCREEN);
            case 'D' -> Optional.of(OTHERPROVIDEDSCREEN);
            case 'G' -> Optional.of(FCMAPI_CTA_IX);
            case 'H' -> Optional.of(ALGO_ENGINE);
            case 'W' -> Optional.of(DESK_ELECTRONIC);
            case 'Y' -> Optional.of(CLIENT_ELECTRONIC);
            default -> Optional.empty();
        };
    }
}
