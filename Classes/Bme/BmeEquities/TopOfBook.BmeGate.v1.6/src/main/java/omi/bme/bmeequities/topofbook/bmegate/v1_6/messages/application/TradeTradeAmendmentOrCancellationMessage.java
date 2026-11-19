package omi.bme.bmeequities.topofbook.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.AlgoFlagField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.AmendedTradeDateField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.AmendedTradeTypeField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.BencRfptFlagField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.BuyerBolsaCodeField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.DeferralWaiverField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.DesignationField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.ExecRefIdField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.GrossTradeAmtField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.LastChangeFlagField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.LastPxField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.LastQtyField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.MarketMechanismField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.MarketSegmentIdField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.PreTradeTransparencyWaiverField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.PublishDateAndTimeField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.SettlDateField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.SicavFundCounterpartySideField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.TradeDateField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.TradePriceConditionField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.TradeSessionDateField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.TradeTypeField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.TradingSessionIdField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.TransactionCategoryField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.TransactionDateAndTimeField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.TrdMatchIdField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.fields.VolumeFloatField;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.types.Field;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.types.Message;
import omi.bme.bmeequities.topofbook.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the TradeTradeAmendmentOrCancellationMessage message from the TopOfBook protocol.
 *
 * <p>Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. In this message, all fields with the suffix 2 refer to the sell order, and the ones without the suffix refer either to both legs or the buy order</p>
 */
public final class TradeTradeAmendmentOrCancellationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 98;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Trade Amendment Or Cancellation Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     */
    private final TransactionDateAndTimeField transactionDateAndTime = new TransactionDateAndTimeField();

    /**
     * Segment MIC Code
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Trading mode
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * System Trade Number
     */
    private final TrdMatchIdField trdMatchId = new TrdMatchIdField();

    /**
     * Trade type
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Trade price
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Current trade volume
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Premium / Trade amount
     */
    private final GrossTradeAmtField grossTradeAmt = new GrossTradeAmtField();

    /**
     * Trade situation
     */
    private final DesignationField designation = new DesignationField();

    /**
     * Market Mechanism
     */
    private final MarketMechanismField marketMechanism = new MarketMechanismField();

    /**
     * Algorithmic flag indicator
     */
    private final AlgoFlagField algoFlag = new AlgoFlagField();

    /**
     * Stock Exchange code of the buyer
     */
    private final BuyerBolsaCodeField buyerBolsaCode = new BuyerBolsaCodeField();

    /**
     * Settlement date
     */
    private final SettlDateField settlDate = new SettlDateField();

    /**
     * Transaction Category
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * Indicates if this trade changes the instrument Last price
     */
    private final LastChangeFlagField lastChangeFlag = new LastChangeFlagField();

    /**
     * Benchmark or Reference Price Indicator MMT
     */
    private final BencRfptFlagField bencRfptFlag = new BencRfptFlagField();

    /**
     * MMT 3.8
     */
    private final TradePriceConditionField tradePriceCondition = new TradePriceConditionField();

    /**
     * Pre-trade transparency waiver
     */
    private final PreTradeTransparencyWaiverField preTradeTransparencyWaiver = new PreTradeTransparencyWaiverField();

    /**
     * Deferral Waiver
     */
    private final DeferralWaiverField deferralWaiver = new DeferralWaiverField();

    /**
     * Publication Date and Time in nanoseconds since 1-jan-1970 UTC
     */
    private final PublishDateAndTimeField publishDateAndTime = new PublishDateAndTimeField();

    /**
     * Trade date and time
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Trade Session Date
     */
    private final TradeSessionDateField tradeSessionDate = new TradeSessionDateField();

    /**
     * Volume with decimal places
     */
    private final VolumeFloatField volumeFloat = new VolumeFloatField();

    /**
     * Indicates the side of the Counterparty member in a SICAV or Mutual Fund
     */
    private final SicavFundCounterpartySideField sicavFundCounterpartySide = new SicavFundCounterpartySideField();

    /**
     * Trade type of the amended/cancelled trade
     */
    private final AmendedTradeTypeField amendedTradeType = new AmendedTradeTypeField();

    /**
     * System Trade Number of the amended/cancelled trade
     */
    private final ExecRefIdField execRefId = new ExecRefIdField();

    /**
     * Date of the amended/cancelled trade
     */
    private final AmendedTradeDateField amendedTradeDate = new AmendedTradeDateField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, securityCode, transactionDateAndTime, marketSegmentId, tradingSessionId, trdMatchId, tradeType, lastPx, lastQty, grossTradeAmt, designation, marketMechanism, algoFlag, buyerBolsaCode, settlDate, transactionCategory, lastChangeFlag, bencRfptFlag, tradePriceCondition, preTradeTransparencyWaiver, deferralWaiver, publishDateAndTime, tradeDate, tradeSessionDate, volumeFloat, sicavFundCounterpartySide, amendedTradeType, execRefId, amendedTradeDate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     *
     * @return the TransactionDateAndTime field
     */
    public TransactionDateAndTimeField transactionDateAndTime() {
        return transactionDateAndTime;
    }

    /**
     * Segment MIC Code
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Trading mode
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * System Trade Number
     *
     * @return the TrdMatchId field
     */
    public TrdMatchIdField trdMatchId() {
        return trdMatchId;
    }

    /**
     * Trade type
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Trade price
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Current trade volume
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Premium / Trade amount
     *
     * @return the GrossTradeAmt field
     */
    public GrossTradeAmtField grossTradeAmt() {
        return grossTradeAmt;
    }

    /**
     * Trade situation
     *
     * @return the Designation field
     */
    public DesignationField designation() {
        return designation;
    }

    /**
     * Market Mechanism
     *
     * @return the MarketMechanism field
     */
    public MarketMechanismField marketMechanism() {
        return marketMechanism;
    }

    /**
     * Algorithmic flag indicator
     *
     * @return the AlgoFlag field
     */
    public AlgoFlagField algoFlag() {
        return algoFlag;
    }

    /**
     * Stock Exchange code of the buyer
     *
     * @return the BuyerBolsaCode field
     */
    public BuyerBolsaCodeField buyerBolsaCode() {
        return buyerBolsaCode;
    }

    /**
     * Settlement date
     *
     * @return the SettlDate field
     */
    public SettlDateField settlDate() {
        return settlDate;
    }

    /**
     * Transaction Category
     *
     * @return the TransactionCategory field
     */
    public TransactionCategoryField transactionCategory() {
        return transactionCategory;
    }

    /**
     * Indicates if this trade changes the instrument Last price
     *
     * @return the LastChangeFlag field
     */
    public LastChangeFlagField lastChangeFlag() {
        return lastChangeFlag;
    }

    /**
     * Benchmark or Reference Price Indicator MMT
     *
     * @return the BencRfptFlag field
     */
    public BencRfptFlagField bencRfptFlag() {
        return bencRfptFlag;
    }

    /**
     * MMT 3.8
     *
     * @return the TradePriceCondition field
     */
    public TradePriceConditionField tradePriceCondition() {
        return tradePriceCondition;
    }

    /**
     * Pre-trade transparency waiver
     *
     * @return the PreTradeTransparencyWaiver field
     */
    public PreTradeTransparencyWaiverField preTradeTransparencyWaiver() {
        return preTradeTransparencyWaiver;
    }

    /**
     * Deferral Waiver
     *
     * @return the DeferralWaiver field
     */
    public DeferralWaiverField deferralWaiver() {
        return deferralWaiver;
    }

    /**
     * Publication Date and Time in nanoseconds since 1-jan-1970 UTC
     *
     * @return the PublishDateAndTime field
     */
    public PublishDateAndTimeField publishDateAndTime() {
        return publishDateAndTime;
    }

    /**
     * Trade date and time
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Trade Session Date
     *
     * @return the TradeSessionDate field
     */
    public TradeSessionDateField tradeSessionDate() {
        return tradeSessionDate;
    }

    /**
     * Volume with decimal places
     *
     * @return the VolumeFloat field
     */
    public VolumeFloatField volumeFloat() {
        return volumeFloat;
    }

    /**
     * Indicates the side of the Counterparty member in a SICAV or Mutual Fund
     *
     * @return the SicavFundCounterpartySide field
     */
    public SicavFundCounterpartySideField sicavFundCounterpartySide() {
        return sicavFundCounterpartySide;
    }

    /**
     * Trade type of the amended/cancelled trade
     *
     * @return the AmendedTradeType field
     */
    public AmendedTradeTypeField amendedTradeType() {
        return amendedTradeType;
    }

    /**
     * System Trade Number of the amended/cancelled trade
     *
     * @return the ExecRefId field
     */
    public ExecRefIdField execRefId() {
        return execRefId;
    }

    /**
     * Date of the amended/cancelled trade
     *
     * @return the AmendedTradeDate field
     */
    public AmendedTradeDateField amendedTradeDate() {
        return amendedTradeDate;
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
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactionDateAndTime.value());
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!transactionDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionDateAndTimeField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!tradingSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionIdField.BYTE_LENGTH;
        if (!trdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += TrdMatchIdField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!grossTradeAmt.parse(data, cursor)) {
            return false;
        }
        cursor += GrossTradeAmtField.BYTE_LENGTH;
        if (!designation.parse(data, cursor)) {
            return false;
        }
        cursor += DesignationField.BYTE_LENGTH;
        if (!marketMechanism.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMechanismField.BYTE_LENGTH;
        if (!algoFlag.parse(data, cursor)) {
            return false;
        }
        cursor += AlgoFlagField.BYTE_LENGTH;
        if (!buyerBolsaCode.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerBolsaCodeField.BYTE_LENGTH;
        if (!settlDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlDateField.BYTE_LENGTH;
        if (!transactionCategory.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionCategoryField.BYTE_LENGTH;
        if (!lastChangeFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LastChangeFlagField.BYTE_LENGTH;
        if (!bencRfptFlag.parse(data, cursor)) {
            return false;
        }
        cursor += BencRfptFlagField.BYTE_LENGTH;
        if (!tradePriceCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceConditionField.BYTE_LENGTH;
        if (!preTradeTransparencyWaiver.parse(data, cursor)) {
            return false;
        }
        cursor += PreTradeTransparencyWaiverField.BYTE_LENGTH;
        if (!deferralWaiver.parse(data, cursor)) {
            return false;
        }
        cursor += DeferralWaiverField.BYTE_LENGTH;
        if (!publishDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += PublishDateAndTimeField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!tradeSessionDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSessionDateField.BYTE_LENGTH;
        if (!volumeFloat.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeFloatField.BYTE_LENGTH;
        if (!sicavFundCounterpartySide.parse(data, cursor)) {
            return false;
        }
        cursor += SicavFundCounterpartySideField.BYTE_LENGTH;
        if (!amendedTradeType.parse(data, cursor)) {
            return false;
        }
        cursor += AmendedTradeTypeField.BYTE_LENGTH;
        if (!execRefId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecRefIdField.BYTE_LENGTH;
        return amendedTradeDate.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = transactionDateAndTime.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
        cursor = trdMatchId.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = grossTradeAmt.encode(data, cursor);
        cursor = designation.encode(data, cursor);
        cursor = marketMechanism.encode(data, cursor);
        cursor = algoFlag.encode(data, cursor);
        cursor = buyerBolsaCode.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = transactionCategory.encode(data, cursor);
        cursor = lastChangeFlag.encode(data, cursor);
        cursor = bencRfptFlag.encode(data, cursor);
        cursor = tradePriceCondition.encode(data, cursor);
        cursor = preTradeTransparencyWaiver.encode(data, cursor);
        cursor = deferralWaiver.encode(data, cursor);
        cursor = publishDateAndTime.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = tradeSessionDate.encode(data, cursor);
        cursor = volumeFloat.encode(data, cursor);
        cursor = sicavFundCounterpartySide.encode(data, cursor);
        cursor = amendedTradeType.encode(data, cursor);
        cursor = execRefId.encode(data, cursor);
        cursor = amendedTradeDate.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "SecurityCode" -> Optional.of(securityCode);
            case "TransactionDateAndTime" -> Optional.of(transactionDateAndTime);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "TrdMatchId" -> Optional.of(trdMatchId);
            case "TradeType" -> Optional.of(tradeType);
            case "LastPx" -> Optional.of(lastPx);
            case "LastQty" -> Optional.of(lastQty);
            case "GrossTradeAmt" -> Optional.of(grossTradeAmt);
            case "Designation" -> Optional.of(designation);
            case "MarketMechanism" -> Optional.of(marketMechanism);
            case "AlgoFlag" -> Optional.of(algoFlag);
            case "BuyerBolsaCode" -> Optional.of(buyerBolsaCode);
            case "SettlDate" -> Optional.of(settlDate);
            case "TransactionCategory" -> Optional.of(transactionCategory);
            case "LastChangeFlag" -> Optional.of(lastChangeFlag);
            case "BencRfptFlag" -> Optional.of(bencRfptFlag);
            case "TradePriceCondition" -> Optional.of(tradePriceCondition);
            case "PreTradeTransparencyWaiver" -> Optional.of(preTradeTransparencyWaiver);
            case "DeferralWaiver" -> Optional.of(deferralWaiver);
            case "PublishDateAndTime" -> Optional.of(publishDateAndTime);
            case "TradeDate" -> Optional.of(tradeDate);
            case "TradeSessionDate" -> Optional.of(tradeSessionDate);
            case "VolumeFloat" -> Optional.of(volumeFloat);
            case "SicavFundCounterpartySide" -> Optional.of(sicavFundCounterpartySide);
            case "AmendedTradeType" -> Optional.of(amendedTradeType);
            case "ExecRefId" -> Optional.of(execRefId);
            case "AmendedTradeDate" -> Optional.of(amendedTradeDate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeTradeAmendmentOrCancellationMessage message)) {
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
        if (!(other instanceof TradeTradeAmendmentOrCancellationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
