package omi.nasdaq.nomoptions.cti.itch.v3_0.enums;

import java.util.Optional;

/**
 * Time In Force for the order/quote/sweep. FOK orders are returned with TIF = IOC.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Tif {

    /**
     * IOC or FOK
     */
    IOC_OR_FOK('I', "IOC or FOK"),

    /**
     * DAY
     */
    DAY('D', "DAY"),

    /**
     * GTC
     */
    GTC('G', "GTC"),

    /**
     * OPG
     */
    OPG('O', "OPG"),

    /**
     * GTD
     */
    GTD('T', "GTD"),

    /**
     * Not Applicable (quotes, manual trades)
     */
    NOT_APPLICABLE(' ', "Not Applicable (quotes, manual trades)");

    private final char wire;

    private final String description;

    Tif(char wire, String description) {
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
    public static Optional<Tif> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(IOC_OR_FOK);
            case 'D' -> Optional.of(DAY);
            case 'G' -> Optional.of(GTC);
            case 'O' -> Optional.of(OPG);
            case 'T' -> Optional.of(GTD);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
