package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * The Message Category represents the message classification
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageCategory {

    /**
     * Administrative Category
     */
    ADMINISTRATIVE('A', "Administrative Category"),

    /**
     * Control Category
     */
    CONTROL('C', "Control Category"),

    /**
     * Index Category Index Messages Are Used To Provide Index Value Information Of A Security
     */
    INDEX('I', "Index Category Index Messages Are Used To Provide Index Value Information Of A Security"),

    /**
     * Market Status Category Market Status Messages Are Used To Provide Market Data Information
     */
    MARKET_STATUS('M', "Market Status Category Market Status Messages Are Used To Provide Market Data Information"),

    /**
     * Prior Day Category Prior Day Messages Are Used To Report Cta Eligible Equity Local Issue Or Bond Trades Corrections Cancels Or Errors For Transactions That Occurred Earlier Than The Current Trading Day And Had Not Been Reported
     */
    PRIOR_DAY('P', "Prior Day Category Prior Day Messages Are Used To Report Cta Eligible Equity Local Issue Or Bond Trades Corrections Cancels Or Errors For Transactions That Occurred Earlier Than The Current Trading Day And Had Not Been Reported"),

    /**
     * Summary Category Summary Messages Are Used To Provide Cta Eligible Equity Local Issue And Bond Summary Information By Security
     */
    SUMMARY('S', "Summary Category Summary Messages Are Used To Provide Cta Eligible Equity Local Issue And Bond Summary Information By Security"),

    /**
     * Trade Category Trade Messages Are Used To Report Cta Eligible Equity Local Issue Or Bond Information
     */
    TRADE('T', "Trade Category Trade Messages Are Used To Report Cta Eligible Equity Local Issue Or Bond Information");

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
            case 'A' -> Optional.of(ADMINISTRATIVE);
            case 'C' -> Optional.of(CONTROL);
            case 'I' -> Optional.of(INDEX);
            case 'M' -> Optional.of(MARKET_STATUS);
            case 'P' -> Optional.of(PRIOR_DAY);
            case 'S' -> Optional.of(SUMMARY);
            case 'T' -> Optional.of(TRADE);
            default -> Optional.empty();
        };
    }
}
