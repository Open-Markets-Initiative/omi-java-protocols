package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum SymbolStatusRegulatoryHaltReason.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum SymbolStatusRegulatoryHaltReason {

    /**
     * Reason not available or not applicable (CTA: Space, UTP: Space).
     */
    REASON_NOT_AVAILABLE((byte) 0, "Reason not available or not applicable (CTA: Space, UTP: Space)."),

    /**
     * Trading halted pending release of material news (CTA: P, UTP: T1).
     */
    NEWS_PENDING((byte) 1, "Trading halted pending release of material news (CTA: P, UTP: T1)."),

    /**
     * Trading halted for dissemination of material news (CTA: D, UTP: T2).
     */
    NEWS_DISSEMINATION((byte) 2, "Trading halted for dissemination of material news (CTA: D, UTP: T2)."),

    /**
     * Additional information requested by the listing exchange (CTA: A, UTP: T12).
     */
    INFO_REQUESTED((byte) 3, "Additional information requested by the listing exchange (CTA: A, UTP: T12)."),

    /**
     * Order imbalance (CTA: I).
     */
    ORDER_IMBALANCE((byte) 4, "Order imbalance (CTA: I)."),

    /**
     * Extraordinary market activity (UTP: T6).
     */
    EXTRAORDINARY_MARKET_ACTIVITY((byte) 5, "Extraordinary market activity (UTP: T6)."),

    /**
     * Limit Up-Limit Down pause (CTA: M, UTP: LUDP).
     */
    LULD_PAUSE((byte) 6, "Limit Up-Limit Down pause (CTA: M, UTP: LUDP)."),

    /**
     * Non-compliance with listing standards (UTP: H4).
     */
    NON_COMPLIANCE((byte) 7, "Non-compliance with listing standards (UTP: H4)."),

    /**
     * Required filings not current (UTP: H9).
     */
    FILINGS_NOT_CURRENT((byte) 8, "Required filings not current (UTP: H9)."),

    /**
     * SEC trading suspension (UTP: H10).
     */
    SEC_SUSPENSION((byte) 9, "SEC trading suspension (UTP: H10)."),

    /**
     * Regulatory concern from other markets (CTA: C, UTP: H11).
     */
    REGULATORY_CONCERN((byte) 10, "Regulatory concern from other markets (CTA: C, UTP: H11)."),

    /**
     * Sub-penny trading violation (CTA: Y).
     */
    SUB_PENNY_TRADING((byte) 11, "Sub-penny trading violation (CTA: Y)."),

    /**
     * ETF-specific halt (CTA: F, UTP: T8).
     */
    ETF((byte) 12, "ETF-specific halt (CTA: F, UTP: T8)."),

    /**
     * IPO not yet trading (UTP: IPO1).
     */
    IPO_NOT_TRADING((byte) 13, "IPO not yet trading (UTP: IPO1)."),

    /**
     * Corporate action in progress (CTA: N, UTP: M1).
     */
    CORPORATE_ACTION((byte) 14, "Corporate action in progress (CTA: N, UTP: M1)."),

    /**
     * Market-wide circuit breaker Level 1 (CTA: 1, UTP: MWC1).
     */
    CIRCUIT_BREAKER_L1((byte) 15, "Market-wide circuit breaker Level 1 (CTA: 1, UTP: MWC1)."),

    /**
     * Market-wide circuit breaker Level 2 (CTA: 2, UTP: MWC2).
     */
    CIRCUIT_BREAKER_L2((byte) 16, "Market-wide circuit breaker Level 2 (CTA: 2, UTP: MWC2)."),

    /**
     * Market-wide circuit breaker Level 3 (CTA: 3, UTP: MWC3).
     */
    CIRCUIT_BREAKER_L3((byte) 17, "Market-wide circuit breaker Level 3 (CTA: 3, UTP: MWC3)."),

    /**
     * Market-wide circuit breaker halt carried over from previous trading day (UTP: MWC0).
     */
    CIRCUIT_BREAKER_CARRYOVER((byte) 18, "Market-wide circuit breaker halt carried over from previous trading day (UTP: MWC0)."),

    /**
     * Merger effective (CTA: E).
     */
    MERGER_EFFECTIVE((byte) 19, "Merger effective (CTA: E)."),

    /**
     * New security offering (CTA: O).
     */
    NEW_SECURITY_OFFERING((byte) 20, "New security offering (CTA: O)."),

    /**
     * Intraday indicative value not available (CTA: V).
     */
    INDICATIVE_VALUE_NOT_AVAILABLE((byte) 21, "Intraday indicative value not available (CTA: V)."),

    /**
     * Quotation not available (UTP: M2).
     */
    QUOTATION_NOT_AVAILABLE((byte) 22, "Quotation not available (UTP: M2)."),

    /**
     * Single stock trading pause (UTP: T5).
     */
    SINGLE_STOCK_TRADING_PAUSE((byte) 23, "Single stock trading pause (UTP: T5)."),

    /**
     * Non-regulatory halt due to technical or operational reasons (CTA: X, UTP: O1).
     */
    OPERATIONAL((byte) 24, "Non-regulatory halt due to technical or operational reasons (CTA: X, UTP: O1)."),

    /**
     * Limit Up-Limit Down volatility pause - straddle condition (bid/offer crosses a band) (UTP: LUDS).
     */
    LULD_PAUSE_STRADDLE((byte) 25, "Limit Up-Limit Down volatility pause - straddle condition (bid/offer crosses a band) (UTP: LUDS)."),

    /**
     * News and resumption times announced (UTP: T3).
     */
    NEWS_RESUMPTION_TIMES((byte) 26, "News and resumption times announced (UTP: T3)."),

    /**
     * Single stock trading pause (UTP: T7).
     */
    SINGLE_STOCK_TRADING_PAUSE_QUOTING((byte) 27, "Single stock trading pause (UTP: T7)."),

    /**
     * Qualifications issues reviewed/resolved; quotations/trading to resume (UTP: R4).
     */
    QUALIFICATIONS_ISSUES_RESOLVED((byte) 28, "Qualifications issues reviewed/resolved; quotations/trading to resume (UTP: R4)."),

    /**
     * Filing requirements satisfied/resolved; quotations/trading to resume (UTP: R9).
     */
    FILING_REQUIREMENTS_SATISFIED((byte) 29, "Filing requirements satisfied/resolved; quotations/trading to resume (UTP: R9)."),

    /**
     * Issuer news not forthcoming; quotations/trading to resume (UTP: C3).
     */
    ISSUER_NEWS_NOT_FORTHCOMING((byte) 30, "Issuer news not forthcoming; quotations/trading to resume (UTP: C3)."),

    /**
     * Qualifications halt ended; maintenance requirements met; resume (UTP: C4).
     */
    QUALIFICATIONS_HALT_ENDED((byte) 31, "Qualifications halt ended; maintenance requirements met; resume (UTP: C4)."),

    /**
     * Qualifications halt concluded; filings met; quotes/trades to resume (UTP: C9).
     */
    QUALIFICATIONS_HALT_CONCLUDED((byte) 32, "Qualifications halt concluded; filings met; quotes/trades to resume (UTP: C9)."),

    /**
     * Trade halt concluded by other regulatory authority; quotes/trades to resume (UTP: C11).
     */
    REGULATORY_AUTHORITY_HALT_CONCLUDED((byte) 33, "Trade halt concluded by other regulatory authority; quotes/trades to resume (UTP: C11)."),

    /**
     * New issue available (UTP: R1).
     */
    NEW_ISSUE_AVAILABLE((byte) 34, "New issue available (UTP: R1)."),

    /**
     * Issue available (UTP: R2).
     */
    ISSUE_AVAILABLE((byte) 35, "Issue available (UTP: R2)."),

    /**
     * IPO security released for quotation (UTP: IPOQ).
     */
    IPO_QUOTATION_RELEASED((byte) 36, "IPO security released for quotation (UTP: IPOQ)."),

    /**
     * IPO security - positioning window extension (UTP: IPOE).
     */
    IPO_POSITIONING_WINDOW_EXTENSION((byte) 37, "IPO security - positioning window extension (UTP: IPOE)."),

    /**
     * Market-wide circuit breaker quotation resumption (UTP: MWCQ).
     */
    CIRCUIT_BREAKER_QUOTATION_RESUMPTION((byte) 38, "Market-wide circuit breaker quotation resumption (UTP: MWCQ).");

    private final byte wire;

    private final String description;

    SymbolStatusRegulatoryHaltReason(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<SymbolStatusRegulatoryHaltReason> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(REASON_NOT_AVAILABLE);
            case 1 -> Optional.of(NEWS_PENDING);
            case 2 -> Optional.of(NEWS_DISSEMINATION);
            case 3 -> Optional.of(INFO_REQUESTED);
            case 4 -> Optional.of(ORDER_IMBALANCE);
            case 5 -> Optional.of(EXTRAORDINARY_MARKET_ACTIVITY);
            case 6 -> Optional.of(LULD_PAUSE);
            case 7 -> Optional.of(NON_COMPLIANCE);
            case 8 -> Optional.of(FILINGS_NOT_CURRENT);
            case 9 -> Optional.of(SEC_SUSPENSION);
            case 10 -> Optional.of(REGULATORY_CONCERN);
            case 11 -> Optional.of(SUB_PENNY_TRADING);
            case 12 -> Optional.of(ETF);
            case 13 -> Optional.of(IPO_NOT_TRADING);
            case 14 -> Optional.of(CORPORATE_ACTION);
            case 15 -> Optional.of(CIRCUIT_BREAKER_L1);
            case 16 -> Optional.of(CIRCUIT_BREAKER_L2);
            case 17 -> Optional.of(CIRCUIT_BREAKER_L3);
            case 18 -> Optional.of(CIRCUIT_BREAKER_CARRYOVER);
            case 19 -> Optional.of(MERGER_EFFECTIVE);
            case 20 -> Optional.of(NEW_SECURITY_OFFERING);
            case 21 -> Optional.of(INDICATIVE_VALUE_NOT_AVAILABLE);
            case 22 -> Optional.of(QUOTATION_NOT_AVAILABLE);
            case 23 -> Optional.of(SINGLE_STOCK_TRADING_PAUSE);
            case 24 -> Optional.of(OPERATIONAL);
            case 25 -> Optional.of(LULD_PAUSE_STRADDLE);
            case 26 -> Optional.of(NEWS_RESUMPTION_TIMES);
            case 27 -> Optional.of(SINGLE_STOCK_TRADING_PAUSE_QUOTING);
            case 28 -> Optional.of(QUALIFICATIONS_ISSUES_RESOLVED);
            case 29 -> Optional.of(FILING_REQUIREMENTS_SATISFIED);
            case 30 -> Optional.of(ISSUER_NEWS_NOT_FORTHCOMING);
            case 31 -> Optional.of(QUALIFICATIONS_HALT_ENDED);
            case 32 -> Optional.of(QUALIFICATIONS_HALT_CONCLUDED);
            case 33 -> Optional.of(REGULATORY_AUTHORITY_HALT_CONCLUDED);
            case 34 -> Optional.of(NEW_ISSUE_AVAILABLE);
            case 35 -> Optional.of(ISSUE_AVAILABLE);
            case 36 -> Optional.of(IPO_QUOTATION_RELEASED);
            case 37 -> Optional.of(IPO_POSITIONING_WINDOW_EXTENSION);
            case 38 -> Optional.of(CIRCUIT_BREAKER_QUOTATION_RESUMPTION);
            default -> Optional.empty();
        };
    }
}
