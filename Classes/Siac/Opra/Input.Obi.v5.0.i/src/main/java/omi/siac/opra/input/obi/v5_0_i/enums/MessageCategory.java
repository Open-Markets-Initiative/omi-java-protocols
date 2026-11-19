package omi.siac.opra.input.obi.v5_0_i.enums;

import java.util.Optional;

/**
 * Identifies the message category, drives first level dispatch
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageCategory {

    /**
     * Equity And Index Last Sale Message Used To Report Equity And Index Options Last Sale Information
     */
    EQUITY_AND_INDEX_LAST_SALE('a', "Equity And Index Last Sale Message Used To Report Equity And Index Options Last Sale Information"),

    /**
     * Equity And Index End Of Day Summary Message Providing Per Symbol Open High Low Last Net Change And Underlying Information
     */
    EQUITY_AND_INDEX_END_OF_DAY_SUMMARY('f', "Equity And Index End Of Day Summary Message Providing Per Symbol Open High Low Last Net Change And Underlying Information"),

    /**
     * Long Equity And Index Quote Message Containing A Full Quote Using Four Byte Integers For Prices And Sizes
     */
    LONG_EQUITY_AND_INDEX_QUOTE('k', "Long Equity And Index Quote Message Containing A Full Quote Using Four Byte Integers For Prices And Sizes"),

    /**
     * Short Equity And Index Quote Message Containing A Short Quote Using Two Byte Unsigned Integers For Prices And Sizes
     */
    SHORT_EQUITY_AND_INDEX_QUOTE('q', "Short Equity And Index Quote Message Containing A Short Quote Using Two Byte Unsigned Integers For Prices And Sizes"),

    /**
     * Administrative Unformatted Message Carrying Free Form Printable Ascii Text Up To 200 Characters
     */
    ADMINISTRATIVE('C', "Administrative Unformatted Message Carrying Free Form Printable Ascii Text Up To 200 Characters"),

    /**
     * Control Message Performs Specified Control Functions Consists Of Standard Message Header Only
     */
    CONTROL('H', "Control Message Performs Specified Control Functions Consists Of Standard Message Header Only"),

    /**
     * Sequence Number Status Messages Synchronize Block Sequence Numbers And Retrieve Message Counts
     */
    SEQUENCE_NUMBER_STATUS('N', "Sequence Number Status Messages Synchronize Block Sequence Numbers And Retrieve Message Counts"),

    /**
     * Underlying Value Message Containing Index Values For The Underlying Security
     */
    UNDERLYING_VALUE_MESSAGE('Y', "Underlying Value Message Containing Index Values For The Underlying Security");

    private final char wire;

    private final String description;

    MessageCategory(char wire, String description) {
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
    public static Optional<MessageCategory> fromWire(char wire) {
        return switch (wire) {
            case 'a' -> Optional.of(EQUITY_AND_INDEX_LAST_SALE);
            case 'f' -> Optional.of(EQUITY_AND_INDEX_END_OF_DAY_SUMMARY);
            case 'k' -> Optional.of(LONG_EQUITY_AND_INDEX_QUOTE);
            case 'q' -> Optional.of(SHORT_EQUITY_AND_INDEX_QUOTE);
            case 'C' -> Optional.of(ADMINISTRATIVE);
            case 'H' -> Optional.of(CONTROL);
            case 'N' -> Optional.of(SEQUENCE_NUMBER_STATUS);
            case 'Y' -> Optional.of(UNDERLYING_VALUE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
