package omi.databento.marketdata.normalized.dbn.v1.enums;

import java.util.Optional;

/**
 * Additional details about the cause of the status change
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum StatusReason {

    /**
     * None
     */
    NONE(0, "None"),

    /**
     * Scheduled
     */
    SCHEDULED(1, "Scheduled"),

    /**
     * Surveillance Intervention
     */
    SURVEILLANCE_INTERVENTION(2, "Surveillance Intervention"),

    /**
     * Market Event
     */
    MARKET_EVENT(3, "Market Event"),

    /**
     * Instrument Activation
     */
    INSTRUMENT_ACTIVATION(4, "Instrument Activation"),

    /**
     * Instrument Expiration
     */
    INSTRUMENT_EXPIRATION(5, "Instrument Expiration"),

    /**
     * Recovery In Process
     */
    RECOVERY_IN_PROCESS(6, "Recovery In Process"),

    /**
     * Regulatory
     */
    REGULATORY(10, "Regulatory"),

    /**
     * Administrative
     */
    ADMINISTRATIVE(11, "Administrative"),

    /**
     * Non Compliance
     */
    NON_COMPLIANCE(12, "Non Compliance"),

    /**
     * Filings Not Current
     */
    FILINGS_NOT_CURRENT(13, "Filings Not Current"),

    /**
     * Sec Trading Suspension
     */
    SEC_TRADING_SUSPENSION(14, "Sec Trading Suspension"),

    /**
     * New Issue
     */
    NEW_ISSUE(15, "New Issue"),

    /**
     * Issue Available
     */
    ISSUE_AVAILABLE(16, "Issue Available"),

    /**
     * Issues Reviewed
     */
    ISSUES_REVIEWED(17, "Issues Reviewed"),

    /**
     * Filing Reqs Satisfied
     */
    FILING_REQS_SATISFIED(18, "Filing Reqs Satisfied"),

    /**
     * News Pending
     */
    NEWS_PENDING(30, "News Pending"),

    /**
     * News Released
     */
    NEWS_RELEASED(31, "News Released"),

    /**
     * News And Resumption Times
     */
    NEWS_AND_RESUMPTION_TIMES(32, "News And Resumption Times"),

    /**
     * News Not Forthcoming
     */
    NEWS_NOT_FORTHCOMING(33, "News Not Forthcoming"),

    /**
     * Order Imbalance
     */
    ORDER_IMBALANCE(40, "Order Imbalance"),

    /**
     * Luld Pause
     */
    LULD_PAUSE(50, "Luld Pause"),

    /**
     * Operational
     */
    OPERATIONAL(60, "Operational"),

    /**
     * Additional Information Requested
     */
    ADDITIONAL_INFORMATION_REQUESTED(70, "Additional Information Requested"),

    /**
     * Merger Effective
     */
    MERGER_EFFECTIVE(80, "Merger Effective"),

    /**
     * Etf
     */
    ETF(90, "Etf"),

    /**
     * Corporate Action
     */
    CORPORATE_ACTION(100, "Corporate Action"),

    /**
     * New Security Offering
     */
    NEW_SECURITY_OFFERING(110, "New Security Offering"),

    /**
     * Market Wide Halt Level1
     */
    MARKET_WIDE_HALT_LEVEL_1(120, "Market Wide Halt Level1"),

    /**
     * Market Wide Halt Level2
     */
    MARKET_WIDE_HALT_LEVEL_2(121, "Market Wide Halt Level2"),

    /**
     * Market Wide Halt Level3
     */
    MARKET_WIDE_HALT_LEVEL_3(122, "Market Wide Halt Level3"),

    /**
     * Market Wide Halt Carryover
     */
    MARKET_WIDE_HALT_CARRYOVER(123, "Market Wide Halt Carryover"),

    /**
     * Market Wide Halt Resumption
     */
    MARKET_WIDE_HALT_RESUMPTION(124, "Market Wide Halt Resumption"),

    /**
     * Quotation Not Available
     */
    QUOTATION_NOT_AVAILABLE(130, "Quotation Not Available");

    private final int wire;

    private final String description;

    StatusReason(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<StatusReason> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(SCHEDULED);
            case 2 -> Optional.of(SURVEILLANCE_INTERVENTION);
            case 3 -> Optional.of(MARKET_EVENT);
            case 4 -> Optional.of(INSTRUMENT_ACTIVATION);
            case 5 -> Optional.of(INSTRUMENT_EXPIRATION);
            case 6 -> Optional.of(RECOVERY_IN_PROCESS);
            case 10 -> Optional.of(REGULATORY);
            case 11 -> Optional.of(ADMINISTRATIVE);
            case 12 -> Optional.of(NON_COMPLIANCE);
            case 13 -> Optional.of(FILINGS_NOT_CURRENT);
            case 14 -> Optional.of(SEC_TRADING_SUSPENSION);
            case 15 -> Optional.of(NEW_ISSUE);
            case 16 -> Optional.of(ISSUE_AVAILABLE);
            case 17 -> Optional.of(ISSUES_REVIEWED);
            case 18 -> Optional.of(FILING_REQS_SATISFIED);
            case 30 -> Optional.of(NEWS_PENDING);
            case 31 -> Optional.of(NEWS_RELEASED);
            case 32 -> Optional.of(NEWS_AND_RESUMPTION_TIMES);
            case 33 -> Optional.of(NEWS_NOT_FORTHCOMING);
            case 40 -> Optional.of(ORDER_IMBALANCE);
            case 50 -> Optional.of(LULD_PAUSE);
            case 60 -> Optional.of(OPERATIONAL);
            case 70 -> Optional.of(ADDITIONAL_INFORMATION_REQUESTED);
            case 80 -> Optional.of(MERGER_EFFECTIVE);
            case 90 -> Optional.of(ETF);
            case 100 -> Optional.of(CORPORATE_ACTION);
            case 110 -> Optional.of(NEW_SECURITY_OFFERING);
            case 120 -> Optional.of(MARKET_WIDE_HALT_LEVEL_1);
            case 121 -> Optional.of(MARKET_WIDE_HALT_LEVEL_2);
            case 122 -> Optional.of(MARKET_WIDE_HALT_LEVEL_3);
            case 123 -> Optional.of(MARKET_WIDE_HALT_CARRYOVER);
            case 124 -> Optional.of(MARKET_WIDE_HALT_RESUMPTION);
            case 130 -> Optional.of(QUOTATION_NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
