package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * newsSource
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum NewsSource {

    /**
     * Other news source.
     */
    OTHER((short) 0, "Other news source."),

    /**
     * DCM.
     */
    DCM((short) 1, "DCM."),

    /**
     * BBMNet.
     */
    BBMNET((short) 2, "BBMNet."),

    /**
     * MarketSurveillance.
     */
    MARKET_SURVEILLANCE((short) 3, "MarketSurveillance."),

    /**
     * Internet.
     */
    INTERNET((short) 4, "Internet."),

    /**
     * DPR-VE.
     */
    DPR_VE((short) 5, "DPR-VE."),

    /**
     * Mkt Ops FX Agency.
     */
    MKT_OPS_FX_AGENCY((short) 19, "Mkt Ops FX Agency."),

    /**
     * Mkt Ops Derivatives Agency.
     */
    MKT_OPS_DERIVATIVES_AGENCY((short) 20, "Mkt Ops Derivatives Agency."),

    /**
     * Over-the-counter News Agency.
     */
    OVER_THE_COUNTER_NEWS_AGENCY((short) 11, "Over-the-counter News Agency."),

    /**
     * Electronic Purchase Exchange.
     */
    ELECTRONIC_PURCHASE_EXCHANGE((short) 13, "Electronic Purchase Exchange."),

    /**
     * CBLC News Agency.
     */
    CBLC_NEWS_AGENCY((short) 14, "CBLC News Agency."),

    /**
     * BOVESPA – Index Agency.
     */
    BOVESPA_INDEX_AGENCY((short) 15, "BOVESPA \u2013 Index Agency."),

    /**
     * BOVESPA – Institutional Agency.
     */
    BOVESPA_INSTITUTIONAL_AGENCY((short) 16, "BOVESPA \u2013 Institutional Agency."),

    /**
     * Mkt Ops Equities Agency.
     */
    MKT_OPS_EQUITIES_AGENCY((short) 17, "Mkt Ops Equities Agency."),

    /**
     * BOVESPA – Companies Agency.
     */
    BOVESPA_COMPANIES_AGENCY((short) 18, "BOVESPA \u2013 Companies Agency.");

    private final short wire;

    private final String description;

    NewsSource(short wire, String description) {
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
    public static Optional<NewsSource> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(OTHER);
            case 1 -> Optional.of(DCM);
            case 2 -> Optional.of(BBMNET);
            case 3 -> Optional.of(MARKET_SURVEILLANCE);
            case 4 -> Optional.of(INTERNET);
            case 5 -> Optional.of(DPR_VE);
            case 19 -> Optional.of(MKT_OPS_FX_AGENCY);
            case 20 -> Optional.of(MKT_OPS_DERIVATIVES_AGENCY);
            case 11 -> Optional.of(OVER_THE_COUNTER_NEWS_AGENCY);
            case 13 -> Optional.of(ELECTRONIC_PURCHASE_EXCHANGE);
            case 14 -> Optional.of(CBLC_NEWS_AGENCY);
            case 15 -> Optional.of(BOVESPA_INDEX_AGENCY);
            case 16 -> Optional.of(BOVESPA_INSTITUTIONAL_AGENCY);
            case 17 -> Optional.of(MKT_OPS_EQUITIES_AGENCY);
            case 18 -> Optional.of(BOVESPA_COMPANIES_AGENCY);
            default -> Optional.empty();
        };
    }
}
