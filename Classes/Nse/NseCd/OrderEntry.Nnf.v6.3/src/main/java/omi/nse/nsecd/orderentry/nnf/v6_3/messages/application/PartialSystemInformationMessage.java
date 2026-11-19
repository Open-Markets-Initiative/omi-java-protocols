package omi.nse.nsecd.orderentry.nnf.v6_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BoardLotQuantityField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.CFillerField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.CompetitorPeriodField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.DefaultSettlementPeriodAuctionField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.DefaultSettlementPeriodNormalField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.DefaultSettlementPeriodSpotField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.DisclosedQuantityPercentAllowedField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.MarketIndexField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.MaximumGtcDaysField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.RiskFreeInterestRateField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.SnapQuoteTimeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.SolicitorPeriodField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.StStockEligibleIndicatorsField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TickSizeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.UpdatePortfolioField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.VolumeFreezePercentField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.WarningPercentField;
import omi.nse.nsecd.orderentry.nnf.v6_3.structs.StExMarketStatus;
import omi.nse.nsecd.orderentry.nnf.v6_3.structs.StMarketStatus;
import omi.nse.nsecd.orderentry.nnf.v6_3.structs.StPlMarketStatus;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Message;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * Represents the PartialSystemInformationMessage message from the OrderEntry protocol.
 *
 * <p>7321 MS_SYSTEM_INFO_DATA 106 I Confidential Currency Derivatives Trading System - Protocol for Non-Neat Front End, carried in the MS_SYSTEM_INFO_DATA structure</p>
 */
public final class PartialSystemInformationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 66;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Partial System Information Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 46, 2 };

    /**
     * Not used
     */
    private final UpdatePortfolioField updatePortfolio = new UpdatePortfolioField();

    /**
     * cFiller
     */
    private final CFillerField cFiller = new CFillerField();

    /**
     * This value will be set to thousand and of no use
     */
    private final MarketIndexField marketIndex = new MarketIndexField();

    /**
     * DefaultSettlementPeriod (Normal)
     */
    private final DefaultSettlementPeriodNormalField defaultSettlementPeriodNormal = new DefaultSettlementPeriodNormalField();

    /**
     * DefaultSettlementPeriod (Spot)
     */
    private final DefaultSettlementPeriodSpotField defaultSettlementPeriodSpot = new DefaultSettlementPeriodSpotField();

    /**
     * DefaultSettlementPeriod (Auction)
     */
    private final DefaultSettlementPeriodAuctionField defaultSettlementPeriodAuction = new DefaultSettlementPeriodAuctionField();

    /**
     * This field contains the default competitor period for auction
     */
    private final CompetitorPeriodField competitorPeriod = new CompetitorPeriodField();

    /**
     * This field contains the default solicitor period for auction
     */
    private final SolicitorPeriodField solicitorPeriod = new SolicitorPeriodField();

    /**
     * This field contains the warning percentage. (Refer to Turnover Limit Exceeded or Broker Reactivated in Chapter 9) Note: - If a broker exceeds his turnover by this value in percent, then a warning message is broadcast to all traders
     */
    private final WarningPercentField warningPercent = new WarningPercentField();

    /**
     * VolumeFreezePercent
     */
    private final VolumeFreezePercentField volumeFreezePercent = new VolumeFreezePercentField();

    /**
     * This field contains the snap quote time
     */
    private final SnapQuoteTimeField snapQuoteTime = new SnapQuoteTimeField();

    /**
     * This field contains the board lot quantity
     */
    private final BoardLotQuantityField boardLotQuantity = new BoardLotQuantityField();

    /**
     * This field contains the tick size
     */
    private final TickSizeField tickSize = new TickSizeField();

    /**
     * This field contains the maximum number of days after which a Good Till Canceled order will be canceled
     */
    private final MaximumGtcDaysField maximumGtcDays = new MaximumGtcDaysField();

    /**
     * St Stock Eligible Indicators
     */
    private final StStockEligibleIndicatorsField stStockEligibleIndicators = new StStockEligibleIndicatorsField();

    /**
     * DisclosedQuantityPercentAllowed
     */
    private final DisclosedQuantityPercentAllowedField disclosedQuantityPercentAllowed = new DisclosedQuantityPercentAllowedField();

    /**
     * This field contains the risk free interest rate
     */
    private final RiskFreeInterestRateField riskFreeInterestRate = new RiskFreeInterestRateField();

    /**
     * ST_MARKET_STATUS
     */
    private final StMarketStatus stMarketStatus = new StMarketStatus();

    /**
     * ST_EX_MARKET_STATUS
     */
    private final StExMarketStatus stExMarketStatus = new StExMarketStatus();

    /**
     * ST_PL_MARKET_STATUS
     */
    private final StPlMarketStatus stPlMarketStatus = new StPlMarketStatus();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(stMarketStatus.fields(), stExMarketStatus.fields(), stPlMarketStatus.fields(), List.<Field>of(updatePortfolio), List.<Field>of(cFiller), List.<Field>of(marketIndex), List.<Field>of(defaultSettlementPeriodNormal), List.<Field>of(defaultSettlementPeriodSpot), List.<Field>of(defaultSettlementPeriodAuction), List.<Field>of(competitorPeriod), List.<Field>of(solicitorPeriod), List.<Field>of(warningPercent), List.<Field>of(volumeFreezePercent), List.<Field>of(snapQuoteTime), List.<Field>of(boardLotQuantity), List.<Field>of(tickSize), List.<Field>of(maximumGtcDays), List.<Field>of(stStockEligibleIndicators), List.<Field>of(disclosedQuantityPercentAllowed), List.<Field>of(riskFreeInterestRate)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Not used
     *
     * @return the UpdatePortfolio field
     */
    public UpdatePortfolioField updatePortfolio() {
        return updatePortfolio;
    }

    /**
     * cFiller
     *
     * @return the CFiller field
     */
    public CFillerField cFiller() {
        return cFiller;
    }

    /**
     * This value will be set to thousand and of no use
     *
     * @return the MarketIndex field
     */
    public MarketIndexField marketIndex() {
        return marketIndex;
    }

    /**
     * DefaultSettlementPeriod (Normal)
     *
     * @return the DefaultSettlementPeriodNormal field
     */
    public DefaultSettlementPeriodNormalField defaultSettlementPeriodNormal() {
        return defaultSettlementPeriodNormal;
    }

    /**
     * DefaultSettlementPeriod (Spot)
     *
     * @return the DefaultSettlementPeriodSpot field
     */
    public DefaultSettlementPeriodSpotField defaultSettlementPeriodSpot() {
        return defaultSettlementPeriodSpot;
    }

    /**
     * DefaultSettlementPeriod (Auction)
     *
     * @return the DefaultSettlementPeriodAuction field
     */
    public DefaultSettlementPeriodAuctionField defaultSettlementPeriodAuction() {
        return defaultSettlementPeriodAuction;
    }

    /**
     * This field contains the default competitor period for auction
     *
     * @return the CompetitorPeriod field
     */
    public CompetitorPeriodField competitorPeriod() {
        return competitorPeriod;
    }

    /**
     * This field contains the default solicitor period for auction
     *
     * @return the SolicitorPeriod field
     */
    public SolicitorPeriodField solicitorPeriod() {
        return solicitorPeriod;
    }

    /**
     * This field contains the warning percentage. (Refer to Turnover Limit Exceeded or Broker Reactivated in Chapter 9) Note: - If a broker exceeds his turnover by this value in percent, then a warning message is broadcast to all traders
     *
     * @return the WarningPercent field
     */
    public WarningPercentField warningPercent() {
        return warningPercent;
    }

    /**
     * VolumeFreezePercent
     *
     * @return the VolumeFreezePercent field
     */
    public VolumeFreezePercentField volumeFreezePercent() {
        return volumeFreezePercent;
    }

    /**
     * This field contains the snap quote time
     *
     * @return the SnapQuoteTime field
     */
    public SnapQuoteTimeField snapQuoteTime() {
        return snapQuoteTime;
    }

    /**
     * This field contains the board lot quantity
     *
     * @return the BoardLotQuantity field
     */
    public BoardLotQuantityField boardLotQuantity() {
        return boardLotQuantity;
    }

    /**
     * This field contains the tick size
     *
     * @return the TickSize field
     */
    public TickSizeField tickSize() {
        return tickSize;
    }

    /**
     * This field contains the maximum number of days after which a Good Till Canceled order will be canceled
     *
     * @return the MaximumGtcDays field
     */
    public MaximumGtcDaysField maximumGtcDays() {
        return maximumGtcDays;
    }

    /**
     * St Stock Eligible Indicators
     *
     * @return the StStockEligibleIndicators field
     */
    public StStockEligibleIndicatorsField stStockEligibleIndicators() {
        return stStockEligibleIndicators;
    }

    /**
     * DisclosedQuantityPercentAllowed
     *
     * @return the DisclosedQuantityPercentAllowed field
     */
    public DisclosedQuantityPercentAllowedField disclosedQuantityPercentAllowed() {
        return disclosedQuantityPercentAllowed;
    }

    /**
     * This field contains the risk free interest rate
     *
     * @return the RiskFreeInterestRate field
     */
    public RiskFreeInterestRateField riskFreeInterestRate() {
        return riskFreeInterestRate;
    }

    /**
     * ST_MARKET_STATUS
     *
     * @return the StMarketStatus record
     */
    public StMarketStatus stMarketStatus() {
        return stMarketStatus;
    }

    /**
     * ST_EX_MARKET_STATUS
     *
     * @return the StExMarketStatus record
     */
    public StExMarketStatus stExMarketStatus() {
        return stExMarketStatus;
    }

    /**
     * ST_PL_MARKET_STATUS
     *
     * @return the StPlMarketStatus record
     */
    public StPlMarketStatus stPlMarketStatus() {
        return stPlMarketStatus;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!stMarketStatus.parseFrom(data, cursor, end - 58)) {
            return false;
        }
        cursor += stMarketStatus.byteLength();
        if (!stExMarketStatus.parseFrom(data, cursor, end - 50)) {
            return false;
        }
        cursor += stExMarketStatus.byteLength();
        if (!stPlMarketStatus.parseFrom(data, cursor, end - 42)) {
            return false;
        }
        cursor += stPlMarketStatus.byteLength();
        if (!updatePortfolio.parse(data, cursor)) {
            return false;
        }
        cursor += UpdatePortfolioField.BYTE_LENGTH;
        if (!cFiller.parse(data, cursor)) {
            return false;
        }
        cursor += CFillerField.BYTE_LENGTH;
        if (!marketIndex.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIndexField.BYTE_LENGTH;
        if (!defaultSettlementPeriodNormal.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultSettlementPeriodNormalField.BYTE_LENGTH;
        if (!defaultSettlementPeriodSpot.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultSettlementPeriodSpotField.BYTE_LENGTH;
        if (!defaultSettlementPeriodAuction.parse(data, cursor)) {
            return false;
        }
        cursor += DefaultSettlementPeriodAuctionField.BYTE_LENGTH;
        if (!competitorPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += CompetitorPeriodField.BYTE_LENGTH;
        if (!solicitorPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += SolicitorPeriodField.BYTE_LENGTH;
        if (!warningPercent.parse(data, cursor)) {
            return false;
        }
        cursor += WarningPercentField.BYTE_LENGTH;
        if (!volumeFreezePercent.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeFreezePercentField.BYTE_LENGTH;
        if (!snapQuoteTime.parse(data, cursor)) {
            return false;
        }
        cursor += SnapQuoteTimeField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!boardLotQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += BoardLotQuantityField.BYTE_LENGTH;
        if (!tickSize.parse(data, cursor)) {
            return false;
        }
        cursor += TickSizeField.BYTE_LENGTH;
        if (!maximumGtcDays.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumGtcDaysField.BYTE_LENGTH;
        if (!stStockEligibleIndicators.parse(data, cursor)) {
            return false;
        }
        cursor += StStockEligibleIndicatorsField.BYTE_LENGTH;
        if (!disclosedQuantityPercentAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosedQuantityPercentAllowedField.BYTE_LENGTH;
        return riskFreeInterestRate.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = stMarketStatus.encode(data, cursor);
        cursor = stExMarketStatus.encode(data, cursor);
        cursor = stPlMarketStatus.encode(data, cursor);
        cursor = updatePortfolio.encode(data, cursor);
        cursor = cFiller.encode(data, cursor);
        cursor = marketIndex.encode(data, cursor);
        cursor = defaultSettlementPeriodNormal.encode(data, cursor);
        cursor = defaultSettlementPeriodSpot.encode(data, cursor);
        cursor = defaultSettlementPeriodAuction.encode(data, cursor);
        cursor = competitorPeriod.encode(data, cursor);
        cursor = solicitorPeriod.encode(data, cursor);
        cursor = warningPercent.encode(data, cursor);
        cursor = volumeFreezePercent.encode(data, cursor);
        cursor = snapQuoteTime.encode(data, cursor);
        if (buffer != null && buffer.length >= 48) {
            System.arraycopy(buffer, 46, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = boardLotQuantity.encode(data, cursor);
        cursor = tickSize.encode(data, cursor);
        cursor = maximumGtcDays.encode(data, cursor);
        cursor = stStockEligibleIndicators.encode(data, cursor);
        cursor = disclosedQuantityPercentAllowed.encode(data, cursor);
        cursor = riskFreeInterestRate.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        stMarketStatus.clear();
        stExMarketStatus.clear();
        stPlMarketStatus.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "UpdatePortfolio" -> Optional.of(updatePortfolio);
            case "CFiller" -> Optional.of(cFiller);
            case "MarketIndex" -> Optional.of(marketIndex);
            case "DefaultSettlementPeriodNormal" -> Optional.of(defaultSettlementPeriodNormal);
            case "DefaultSettlementPeriodSpot" -> Optional.of(defaultSettlementPeriodSpot);
            case "DefaultSettlementPeriodAuction" -> Optional.of(defaultSettlementPeriodAuction);
            case "CompetitorPeriod" -> Optional.of(competitorPeriod);
            case "SolicitorPeriod" -> Optional.of(solicitorPeriod);
            case "WarningPercent" -> Optional.of(warningPercent);
            case "VolumeFreezePercent" -> Optional.of(volumeFreezePercent);
            case "SnapQuoteTime" -> Optional.of(snapQuoteTime);
            case "BoardLotQuantity" -> Optional.of(boardLotQuantity);
            case "TickSize" -> Optional.of(tickSize);
            case "MaximumGtcDays" -> Optional.of(maximumGtcDays);
            case "StStockEligibleIndicators" -> Optional.of(stStockEligibleIndicators);
            case "DisclosedQuantityPercentAllowed" -> Optional.of(disclosedQuantityPercentAllowed);
            case "RiskFreeInterestRate" -> Optional.of(riskFreeInterestRate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PartialSystemInformationMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartialSystemInformationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
