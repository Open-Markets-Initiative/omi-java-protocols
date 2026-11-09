package omi.siac.cts.output.cta.v2_11_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.cts.output.cta.v2_11_b.fields.CancelErrorActionField;
import omi.siac.cts.output.cta.v2_11_b.fields.ConsolidatedFractionalTotalVolumeField;
import omi.siac.cts.output.cta.v2_11_b.fields.ConsolidatedHighPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.ConsolidatedLastParticipantIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.ConsolidatedLastPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.ConsolidatedLowPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.ConsolidatedPreviousClosePriceDateField;
import omi.siac.cts.output.cta.v2_11_b.fields.ConsolidatedTickField;
import omi.siac.cts.output.cta.v2_11_b.fields.FinancialStatusIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.FractionalTradeVolumeField;
import omi.siac.cts.output.cta.v2_11_b.fields.InstrumentTypeField;
import omi.siac.cts.output.cta.v2_11_b.fields.MessageIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.OriginalParticipantReferenceNumberField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantFractionalTotalVolumeField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantHighPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantLastPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantLowPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantOpenPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantPreviousClosePriceDateField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantReferenceNumberField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantTickField;
import omi.siac.cts.output.cta.v2_11_b.fields.PrimaryListingMarketParticipantIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.SecuritySymbolField;
import omi.siac.cts.output.cta.v2_11_b.fields.SellersSaleDaysField;
import omi.siac.cts.output.cta.v2_11_b.fields.ShortSaleRestrictionIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.StopStockIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.TradePriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.TradeReportingFacilityIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.TradeThroughExemptIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.TransactionIdField;
import omi.siac.cts.output.cta.v2_11_b.structs.SaleCondition;
import omi.siac.cts.output.cta.v2_11_b.structs.Timestamp1;
import omi.siac.cts.output.cta.v2_11_b.structs.Timestamp2;
import omi.siac.cts.output.cta.v2_11_b.types.Field;
import omi.siac.cts.output.cta.v2_11_b.types.Message;
import omi.siac.cts.output.cta.v2_11_b.types.PrintOptions;

/**
 * Represents the FractionalTradeCancelErrorMessage message from the Output protocol.
 *
 * <p>Used to cancel or error CTA eligible securities, Local Issues or Bond information. Volume is represented as a fractional value</p>
 */
public final class FractionalTradeCancelErrorMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'E';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 161;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Fractional Trade Cancel Error Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Identifies the Participant or Processor that initiated the message
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * The Message ID identifies the individual message within the block beginning with number one
     */
    private final MessageIdField messageId = new MessageIdField();

    /**
     * Identifies the transaction
     */
    private final TransactionIdField transactionId = new TransactionIdField();

    /**
     * Contains the Participant Reference Number
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * Identifies the Security Symbol. Left justified, space-filled
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Identifies the instrument type relevant to the trade
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * Represents the monetary value of an individual share of security at the time of the trade. Has implied 6 decimal places
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Contains the total number of shares which traded in a single transaction for an individual security. Has implied 6 decimal places
     */
    private final FractionalTradeVolumeField fractionalTradeVolume = new FractionalTradeVolumeField();

    /**
     * Specifies the number of days that may elapse before delivery of the security. Allowed values 2 through 60 days
     */
    private final SellersSaleDaysField sellersSaleDays = new SellersSaleDaysField();

    /**
     * Identifies whether the transaction constituted a stopped order
     */
    private final StopStockIndicatorField stopStockIndicator = new StopStockIndicatorField();

    /**
     * Denotes whether or not a trade is exempt (Rule 611)
     */
    private final TradeThroughExemptIndicatorField tradeThroughExemptIndicator = new TradeThroughExemptIndicatorField();

    /**
     * Identifies the Participant with whom a Trade Reporting Facility (TRF) has been formed. Space-filled
     */
    private final TradeReportingFacilityIdField tradeReportingFacilityId = new TradeReportingFacilityIdField();

    /**
     * Contains the Participant Reference Number of transaction to be corrected, cancelled or errored
     */
    private final OriginalParticipantReferenceNumberField originalParticipantReferenceNumber = new OriginalParticipantReferenceNumberField();

    /**
     * Denotes whether the referenced transaction is to be cancelled or errored
     */
    private final CancelErrorActionField cancelErrorAction = new CancelErrorActionField();

    /**
     * Identifies whether or not a Short Sale Restriction is in effect for a security
     */
    private final ShortSaleRestrictionIndicatorField shortSaleRestrictionIndicator = new ShortSaleRestrictionIndicatorField();

    /**
     * Identifies the Primary Listing Market of the security symbol
     */
    private final PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId = new PrimaryListingMarketParticipantIdField();

    /**
     * Identifies the financial status of the security
     */
    private final FinancialStatusIndicatorField financialStatusIndicator = new FinancialStatusIndicatorField();

    /**
     * Consolidated date the security last traded. Represented in seconds since Epoch
     */
    private final ConsolidatedPreviousClosePriceDateField consolidatedPreviousClosePriceDate = new ConsolidatedPreviousClosePriceDateField();

    /**
     * Consolidated last participant ID
     */
    private final ConsolidatedLastParticipantIdField consolidatedLastParticipantId = new ConsolidatedLastParticipantIdField();

    /**
     * Consolidated last price. Has implied 6 decimal places
     */
    private final ConsolidatedLastPriceField consolidatedLastPrice = new ConsolidatedLastPriceField();

    /**
     * Consolidated highest price paid during the trading day. Has implied 6 decimal places
     */
    private final ConsolidatedHighPriceField consolidatedHighPrice = new ConsolidatedHighPriceField();

    /**
     * Consolidated lowest price paid during the trading day. Has implied 6 decimal places
     */
    private final ConsolidatedLowPriceField consolidatedLowPrice = new ConsolidatedLowPriceField();

    /**
     * Consolidated total volume of shares traded. Has implied 6 decimal places
     */
    private final ConsolidatedFractionalTotalVolumeField consolidatedFractionalTotalVolume = new ConsolidatedFractionalTotalVolumeField();

    /**
     * Consolidated tick direction
     */
    private final ConsolidatedTickField consolidatedTick = new ConsolidatedTickField();

    /**
     * Participant date the security last traded. Represented in seconds since Epoch
     */
    private final ParticipantPreviousClosePriceDateField participantPreviousClosePriceDate = new ParticipantPreviousClosePriceDateField();

    /**
     * Participant last price. Has implied 6 decimal places
     */
    private final ParticipantLastPriceField participantLastPrice = new ParticipantLastPriceField();

    /**
     * Participant highest price paid during the trading day. Has implied 6 decimal places
     */
    private final ParticipantHighPriceField participantHighPrice = new ParticipantHighPriceField();

    /**
     * Participant lowest price paid during the trading day. Has implied 6 decimal places
     */
    private final ParticipantLowPriceField participantLowPrice = new ParticipantLowPriceField();

    /**
     * Participant first qualifying price paid during the trading day. Has implied 6 decimal places
     */
    private final ParticipantOpenPriceField participantOpenPrice = new ParticipantOpenPriceField();

    /**
     * Participant total volume of shares traded. Has implied 6 decimal places
     */
    private final ParticipantFractionalTotalVolumeField participantFractionalTotalVolume = new ParticipantFractionalTotalVolumeField();

    /**
     * Participant tick direction
     */
    private final ParticipantTickField participantTick = new ParticipantTickField();

    /**
     * Timestamp 1
     */
    private final Timestamp1 timestamp1 = new Timestamp1();

    /**
     * Sale Condition 4
     */
    private final SaleCondition saleCondition = new SaleCondition();

    /**
     * Timestamp 2
     */
    private final Timestamp2 timestamp2 = new Timestamp2();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), timestamp1.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbol), List.<Field>of(instrumentType), saleCondition.fields(), List.<Field>of(tradePrice), List.<Field>of(fractionalTradeVolume), List.<Field>of(sellersSaleDays), List.<Field>of(stopStockIndicator), List.<Field>of(tradeThroughExemptIndicator), List.<Field>of(tradeReportingFacilityId), List.<Field>of(originalParticipantReferenceNumber), timestamp2.fields(), List.<Field>of(cancelErrorAction), List.<Field>of(shortSaleRestrictionIndicator), List.<Field>of(primaryListingMarketParticipantId), List.<Field>of(financialStatusIndicator), List.<Field>of(consolidatedPreviousClosePriceDate), List.<Field>of(consolidatedLastParticipantId), List.<Field>of(consolidatedLastPrice), List.<Field>of(consolidatedHighPrice), List.<Field>of(consolidatedLowPrice), List.<Field>of(consolidatedFractionalTotalVolume), List.<Field>of(consolidatedTick), List.<Field>of(participantPreviousClosePriceDate), List.<Field>of(participantLastPrice), List.<Field>of(participantHighPrice), List.<Field>of(participantLowPrice), List.<Field>of(participantOpenPrice), List.<Field>of(participantFractionalTotalVolume), List.<Field>of(participantTick)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identifies the Participant or Processor that initiated the message
     *
     * @return the ParticipantId field
     */
    public ParticipantIdField participantId() {
        return participantId;
    }

    /**
     * The Message ID identifies the individual message within the block beginning with number one
     *
     * @return the MessageId field
     */
    public MessageIdField messageId() {
        return messageId;
    }

    /**
     * Identifies the transaction
     *
     * @return the TransactionId field
     */
    public TransactionIdField transactionId() {
        return transactionId;
    }

    /**
     * Contains the Participant Reference Number
     *
     * @return the ParticipantReferenceNumber field
     */
    public ParticipantReferenceNumberField participantReferenceNumber() {
        return participantReferenceNumber;
    }

    /**
     * Identifies the Security Symbol. Left justified, space-filled
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * Identifies the instrument type relevant to the trade
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * Represents the monetary value of an individual share of security at the time of the trade. Has implied 6 decimal places
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Contains the total number of shares which traded in a single transaction for an individual security. Has implied 6 decimal places
     *
     * @return the FractionalTradeVolume field
     */
    public FractionalTradeVolumeField fractionalTradeVolume() {
        return fractionalTradeVolume;
    }

    /**
     * Specifies the number of days that may elapse before delivery of the security. Allowed values 2 through 60 days
     *
     * @return the SellersSaleDays field
     */
    public SellersSaleDaysField sellersSaleDays() {
        return sellersSaleDays;
    }

    /**
     * Identifies whether the transaction constituted a stopped order
     *
     * @return the StopStockIndicator field
     */
    public StopStockIndicatorField stopStockIndicator() {
        return stopStockIndicator;
    }

    /**
     * Denotes whether or not a trade is exempt (Rule 611)
     *
     * @return the TradeThroughExemptIndicator field
     */
    public TradeThroughExemptIndicatorField tradeThroughExemptIndicator() {
        return tradeThroughExemptIndicator;
    }

    /**
     * Identifies the Participant with whom a Trade Reporting Facility (TRF) has been formed. Space-filled
     *
     * @return the TradeReportingFacilityId field
     */
    public TradeReportingFacilityIdField tradeReportingFacilityId() {
        return tradeReportingFacilityId;
    }

    /**
     * Contains the Participant Reference Number of transaction to be corrected, cancelled or errored
     *
     * @return the OriginalParticipantReferenceNumber field
     */
    public OriginalParticipantReferenceNumberField originalParticipantReferenceNumber() {
        return originalParticipantReferenceNumber;
    }

    /**
     * Denotes whether the referenced transaction is to be cancelled or errored
     *
     * @return the CancelErrorAction field
     */
    public CancelErrorActionField cancelErrorAction() {
        return cancelErrorAction;
    }

    /**
     * Identifies whether or not a Short Sale Restriction is in effect for a security
     *
     * @return the ShortSaleRestrictionIndicator field
     */
    public ShortSaleRestrictionIndicatorField shortSaleRestrictionIndicator() {
        return shortSaleRestrictionIndicator;
    }

    /**
     * Identifies the Primary Listing Market of the security symbol
     *
     * @return the PrimaryListingMarketParticipantId field
     */
    public PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId() {
        return primaryListingMarketParticipantId;
    }

    /**
     * Identifies the financial status of the security
     *
     * @return the FinancialStatusIndicator field
     */
    public FinancialStatusIndicatorField financialStatusIndicator() {
        return financialStatusIndicator;
    }

    /**
     * Consolidated date the security last traded. Represented in seconds since Epoch
     *
     * @return the ConsolidatedPreviousClosePriceDate field
     */
    public ConsolidatedPreviousClosePriceDateField consolidatedPreviousClosePriceDate() {
        return consolidatedPreviousClosePriceDate;
    }

    /**
     * Consolidated last participant ID
     *
     * @return the ConsolidatedLastParticipantId field
     */
    public ConsolidatedLastParticipantIdField consolidatedLastParticipantId() {
        return consolidatedLastParticipantId;
    }

    /**
     * Consolidated last price. Has implied 6 decimal places
     *
     * @return the ConsolidatedLastPrice field
     */
    public ConsolidatedLastPriceField consolidatedLastPrice() {
        return consolidatedLastPrice;
    }

    /**
     * Consolidated highest price paid during the trading day. Has implied 6 decimal places
     *
     * @return the ConsolidatedHighPrice field
     */
    public ConsolidatedHighPriceField consolidatedHighPrice() {
        return consolidatedHighPrice;
    }

    /**
     * Consolidated lowest price paid during the trading day. Has implied 6 decimal places
     *
     * @return the ConsolidatedLowPrice field
     */
    public ConsolidatedLowPriceField consolidatedLowPrice() {
        return consolidatedLowPrice;
    }

    /**
     * Consolidated total volume of shares traded. Has implied 6 decimal places
     *
     * @return the ConsolidatedFractionalTotalVolume field
     */
    public ConsolidatedFractionalTotalVolumeField consolidatedFractionalTotalVolume() {
        return consolidatedFractionalTotalVolume;
    }

    /**
     * Consolidated tick direction
     *
     * @return the ConsolidatedTick field
     */
    public ConsolidatedTickField consolidatedTick() {
        return consolidatedTick;
    }

    /**
     * Participant date the security last traded. Represented in seconds since Epoch
     *
     * @return the ParticipantPreviousClosePriceDate field
     */
    public ParticipantPreviousClosePriceDateField participantPreviousClosePriceDate() {
        return participantPreviousClosePriceDate;
    }

    /**
     * Participant last price. Has implied 6 decimal places
     *
     * @return the ParticipantLastPrice field
     */
    public ParticipantLastPriceField participantLastPrice() {
        return participantLastPrice;
    }

    /**
     * Participant highest price paid during the trading day. Has implied 6 decimal places
     *
     * @return the ParticipantHighPrice field
     */
    public ParticipantHighPriceField participantHighPrice() {
        return participantHighPrice;
    }

    /**
     * Participant lowest price paid during the trading day. Has implied 6 decimal places
     *
     * @return the ParticipantLowPrice field
     */
    public ParticipantLowPriceField participantLowPrice() {
        return participantLowPrice;
    }

    /**
     * Participant first qualifying price paid during the trading day. Has implied 6 decimal places
     *
     * @return the ParticipantOpenPrice field
     */
    public ParticipantOpenPriceField participantOpenPrice() {
        return participantOpenPrice;
    }

    /**
     * Participant total volume of shares traded. Has implied 6 decimal places
     *
     * @return the ParticipantFractionalTotalVolume field
     */
    public ParticipantFractionalTotalVolumeField participantFractionalTotalVolume() {
        return participantFractionalTotalVolume;
    }

    /**
     * Participant tick direction
     *
     * @return the ParticipantTick field
     */
    public ParticipantTickField participantTick() {
        return participantTick;
    }

    /**
     * Timestamp 1
     *
     * @return the Timestamp1 record
     */
    public Timestamp1 timestamp1() {
        return timestamp1;
    }

    /**
     * Sale Condition 4
     *
     * @return the SaleCondition record
     */
    public SaleCondition saleCondition() {
        return saleCondition;
    }

    /**
     * Timestamp 2
     *
     * @return the Timestamp2 record
     */
    public Timestamp2 timestamp2() {
        return timestamp2;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!participantId.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantIdField.BYTE_LENGTH;
        if (!timestamp1.parseFrom(data, cursor, end - 152)) {
            return false;
        }
        cursor += timestamp1.byteLength();
        if (!messageId.parse(data, cursor)) {
            return false;
        }
        cursor += MessageIdField.BYTE_LENGTH;
        if (!transactionId.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdField.BYTE_LENGTH;
        if (!participantReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantReferenceNumberField.BYTE_LENGTH;
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!saleCondition.parseFrom(data, cursor, end - 123)) {
            return false;
        }
        cursor += saleCondition.byteLength();
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!fractionalTradeVolume.parse(data, cursor)) {
            return false;
        }
        cursor += FractionalTradeVolumeField.BYTE_LENGTH;
        if (!sellersSaleDays.parse(data, cursor)) {
            return false;
        }
        cursor += SellersSaleDaysField.BYTE_LENGTH;
        if (!stopStockIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += StopStockIndicatorField.BYTE_LENGTH;
        if (!tradeThroughExemptIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradeThroughExemptIndicatorField.BYTE_LENGTH;
        if (!tradeReportingFacilityId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportingFacilityIdField.BYTE_LENGTH;
        if (!originalParticipantReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalParticipantReferenceNumberField.BYTE_LENGTH;
        if (!timestamp2.parseFrom(data, cursor, end - 87)) {
            return false;
        }
        cursor += timestamp2.byteLength();
        if (!cancelErrorAction.parse(data, cursor)) {
            return false;
        }
        cursor += CancelErrorActionField.BYTE_LENGTH;
        if (!shortSaleRestrictionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSaleRestrictionIndicatorField.BYTE_LENGTH;
        if (!primaryListingMarketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryListingMarketParticipantIdField.BYTE_LENGTH;
        if (!financialStatusIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialStatusIndicatorField.BYTE_LENGTH;
        if (!consolidatedPreviousClosePriceDate.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedPreviousClosePriceDateField.BYTE_LENGTH;
        if (!consolidatedLastParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedLastParticipantIdField.BYTE_LENGTH;
        if (!consolidatedLastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedLastPriceField.BYTE_LENGTH;
        if (!consolidatedHighPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedHighPriceField.BYTE_LENGTH;
        if (!consolidatedLowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedLowPriceField.BYTE_LENGTH;
        if (!consolidatedFractionalTotalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedFractionalTotalVolumeField.BYTE_LENGTH;
        if (!consolidatedTick.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedTickField.BYTE_LENGTH;
        if (!participantPreviousClosePriceDate.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantPreviousClosePriceDateField.BYTE_LENGTH;
        if (!participantLastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantLastPriceField.BYTE_LENGTH;
        if (!participantHighPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantHighPriceField.BYTE_LENGTH;
        if (!participantLowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantLowPriceField.BYTE_LENGTH;
        if (!participantOpenPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantOpenPriceField.BYTE_LENGTH;
        if (!participantFractionalTotalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantFractionalTotalVolumeField.BYTE_LENGTH;
        if (!participantTick.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantTickField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = participantId.encode(data, cursor);
        cursor = timestamp1.encode(data, cursor);
        cursor = messageId.encode(data, cursor);
        cursor = transactionId.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = saleCondition.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = fractionalTradeVolume.encode(data, cursor);
        cursor = sellersSaleDays.encode(data, cursor);
        cursor = stopStockIndicator.encode(data, cursor);
        cursor = tradeThroughExemptIndicator.encode(data, cursor);
        cursor = tradeReportingFacilityId.encode(data, cursor);
        cursor = originalParticipantReferenceNumber.encode(data, cursor);
        cursor = timestamp2.encode(data, cursor);
        cursor = cancelErrorAction.encode(data, cursor);
        cursor = shortSaleRestrictionIndicator.encode(data, cursor);
        cursor = primaryListingMarketParticipantId.encode(data, cursor);
        cursor = financialStatusIndicator.encode(data, cursor);
        cursor = consolidatedPreviousClosePriceDate.encode(data, cursor);
        cursor = consolidatedLastParticipantId.encode(data, cursor);
        cursor = consolidatedLastPrice.encode(data, cursor);
        cursor = consolidatedHighPrice.encode(data, cursor);
        cursor = consolidatedLowPrice.encode(data, cursor);
        cursor = consolidatedFractionalTotalVolume.encode(data, cursor);
        cursor = consolidatedTick.encode(data, cursor);
        cursor = participantPreviousClosePriceDate.encode(data, cursor);
        cursor = participantLastPrice.encode(data, cursor);
        cursor = participantHighPrice.encode(data, cursor);
        cursor = participantLowPrice.encode(data, cursor);
        cursor = participantOpenPrice.encode(data, cursor);
        cursor = participantFractionalTotalVolume.encode(data, cursor);
        cursor = participantTick.encode(data, cursor);
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
        timestamp1.clear();
        saleCondition.clear();
        timestamp2.clear();
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
            case "ParticipantId" -> Optional.of(participantId);
            case "MessageId" -> Optional.of(messageId);
            case "TransactionId" -> Optional.of(transactionId);
            case "ParticipantReferenceNumber" -> Optional.of(participantReferenceNumber);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "TradePrice" -> Optional.of(tradePrice);
            case "FractionalTradeVolume" -> Optional.of(fractionalTradeVolume);
            case "SellersSaleDays" -> Optional.of(sellersSaleDays);
            case "StopStockIndicator" -> Optional.of(stopStockIndicator);
            case "TradeThroughExemptIndicator" -> Optional.of(tradeThroughExemptIndicator);
            case "TradeReportingFacilityId" -> Optional.of(tradeReportingFacilityId);
            case "OriginalParticipantReferenceNumber" -> Optional.of(originalParticipantReferenceNumber);
            case "CancelErrorAction" -> Optional.of(cancelErrorAction);
            case "ShortSaleRestrictionIndicator" -> Optional.of(shortSaleRestrictionIndicator);
            case "PrimaryListingMarketParticipantId" -> Optional.of(primaryListingMarketParticipantId);
            case "FinancialStatusIndicator" -> Optional.of(financialStatusIndicator);
            case "ConsolidatedPreviousClosePriceDate" -> Optional.of(consolidatedPreviousClosePriceDate);
            case "ConsolidatedLastParticipantId" -> Optional.of(consolidatedLastParticipantId);
            case "ConsolidatedLastPrice" -> Optional.of(consolidatedLastPrice);
            case "ConsolidatedHighPrice" -> Optional.of(consolidatedHighPrice);
            case "ConsolidatedLowPrice" -> Optional.of(consolidatedLowPrice);
            case "ConsolidatedFractionalTotalVolume" -> Optional.of(consolidatedFractionalTotalVolume);
            case "ConsolidatedTick" -> Optional.of(consolidatedTick);
            case "ParticipantPreviousClosePriceDate" -> Optional.of(participantPreviousClosePriceDate);
            case "ParticipantLastPrice" -> Optional.of(participantLastPrice);
            case "ParticipantHighPrice" -> Optional.of(participantHighPrice);
            case "ParticipantLowPrice" -> Optional.of(participantLowPrice);
            case "ParticipantOpenPrice" -> Optional.of(participantOpenPrice);
            case "ParticipantFractionalTotalVolume" -> Optional.of(participantFractionalTotalVolume);
            case "ParticipantTick" -> Optional.of(participantTick);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FractionalTradeCancelErrorMessage message)) {
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
        if (!(other instanceof FractionalTradeCancelErrorMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
