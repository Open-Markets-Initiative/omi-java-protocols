package omi.siac.cts.output.cta.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.cts.output.cta.v2_10.fields.InstrumentTypeField;
import omi.siac.cts.output.cta.v2_10.fields.MessageIdField;
import omi.siac.cts.output.cta.v2_10.fields.ParticipantIdField;
import omi.siac.cts.output.cta.v2_10.fields.ParticipantReferenceNumberField;
import omi.siac.cts.output.cta.v2_10.fields.SecuritySymbolField;
import omi.siac.cts.output.cta.v2_10.fields.SellersSaleDaysField;
import omi.siac.cts.output.cta.v2_10.fields.ShortSaleRestrictionIndicatorField;
import omi.siac.cts.output.cta.v2_10.fields.StopStockIndicatorField;
import omi.siac.cts.output.cta.v2_10.fields.TradePriceField;
import omi.siac.cts.output.cta.v2_10.fields.TradeReportingFacilityIdField;
import omi.siac.cts.output.cta.v2_10.fields.TradeThroughExemptIndicatorField;
import omi.siac.cts.output.cta.v2_10.fields.TradeVolumeField;
import omi.siac.cts.output.cta.v2_10.fields.TransactionIdField;
import omi.siac.cts.output.cta.v2_10.structs.PriorDayTradeDateAndTime;
import omi.siac.cts.output.cta.v2_10.structs.SaleConditions;
import omi.siac.cts.output.cta.v2_10.structs.Timestamp;
import omi.siac.cts.output.cta.v2_10.types.Field;
import omi.siac.cts.output.cta.v2_10.types.Message;
import omi.siac.cts.output.cta.v2_10.types.PrintOptions;

/**
 * Represents the PriorDayTradeMessage message from the Output protocol.
 *
 * <p>The Prior Day Trade message is used to report a Cta Equity, Local Issue or Bond transaction which occurred earlier than the current trading day and was not reported.</p>
 */
public final class PriorDayTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'T';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 63;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Prior Day Trade Message";

    /**
     * Participant or Processor that generated the message
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * The Message ID identifies the individual message within the block beginning with number one
     */
    private final MessageIdField messageId = new MessageIdField();

    /**
     * The Transaction Id will be populated by CQS and is Reserved for Internal Use only
     */
    private final TransactionIdField transactionId = new TransactionIdField();

    /**
     * Participant Reference Number is a pass-thru of the inbound Participant Reference number assigned to a transaction
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * Contains the security symbol
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Identifies the instrument type relevant to the trade
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * The Trade Price is the monetary value of an individual share of security at the time of the trade
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Contains the total number of shares traded in a single transaction for an individual security
     */
    private final TradeVolumeField tradeVolume = new TradeVolumeField();

    /**
     * Specifies the number of days that may elapse before delivery of the security
     */
    private final SellersSaleDaysField sellersSaleDays = new SellersSaleDaysField();

    /**
     * The transaction that constituted the trade-through was the execution by a trading center of an order for which, at the time of receipt of the order, the trading center had guaranteed an execution at no worse than a specified price
     */
    private final StopStockIndicatorField stopStockIndicator = new StopStockIndicatorField();

    /**
     * Denotes whether or not a trade is exempt (Rule 611) and when used jointly with certain Sale Conditions, will more fully describe the characteristics of a particular trade
     */
    private final TradeThroughExemptIndicatorField tradeThroughExemptIndicator = new TradeThroughExemptIndicatorField();

    /**
     * Identifies whether or not a Short Sale Restriction is in effect for a security
     */
    private final ShortSaleRestrictionIndicatorField shortSaleRestrictionIndicator = new ShortSaleRestrictionIndicatorField();

    /**
     * Identifies the Participant with whom a Trade Reporting Facility has been formed
     */
    private final TradeReportingFacilityIdField tradeReportingFacilityId = new TradeReportingFacilityIdField();

    /**
     * Timestamp 1
     */
    private final Timestamp timestampField = new Timestamp();

    /**
     * Sale Conditions
     */
    private final SaleConditions saleConditions = new SaleConditions();

    /**
     * Prior Day Trade Date and Time
     */
    private final PriorDayTradeDateAndTime priorDayTradeDateAndTime = new PriorDayTradeDateAndTime();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), timestampField.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbol), List.<Field>of(instrumentType), saleConditions.fields(), List.<Field>of(tradePrice), List.<Field>of(tradeVolume), List.<Field>of(sellersSaleDays), List.<Field>of(stopStockIndicator), List.<Field>of(tradeThroughExemptIndicator), List.<Field>of(shortSaleRestrictionIndicator), List.<Field>of(tradeReportingFacilityId), priorDayTradeDateAndTime.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Participant or Processor that generated the message
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
     * The Transaction Id will be populated by CQS and is Reserved for Internal Use only
     *
     * @return the TransactionId field
     */
    public TransactionIdField transactionId() {
        return transactionId;
    }

    /**
     * Participant Reference Number is a pass-thru of the inbound Participant Reference number assigned to a transaction
     *
     * @return the ParticipantReferenceNumber field
     */
    public ParticipantReferenceNumberField participantReferenceNumber() {
        return participantReferenceNumber;
    }

    /**
     * Contains the security symbol
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
     * The Trade Price is the monetary value of an individual share of security at the time of the trade
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Contains the total number of shares traded in a single transaction for an individual security
     *
     * @return the TradeVolume field
     */
    public TradeVolumeField tradeVolume() {
        return tradeVolume;
    }

    /**
     * Specifies the number of days that may elapse before delivery of the security
     *
     * @return the SellersSaleDays field
     */
    public SellersSaleDaysField sellersSaleDays() {
        return sellersSaleDays;
    }

    /**
     * The transaction that constituted the trade-through was the execution by a trading center of an order for which, at the time of receipt of the order, the trading center had guaranteed an execution at no worse than a specified price
     *
     * @return the StopStockIndicator field
     */
    public StopStockIndicatorField stopStockIndicator() {
        return stopStockIndicator;
    }

    /**
     * Denotes whether or not a trade is exempt (Rule 611) and when used jointly with certain Sale Conditions, will more fully describe the characteristics of a particular trade
     *
     * @return the TradeThroughExemptIndicator field
     */
    public TradeThroughExemptIndicatorField tradeThroughExemptIndicator() {
        return tradeThroughExemptIndicator;
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
     * Identifies the Participant with whom a Trade Reporting Facility has been formed
     *
     * @return the TradeReportingFacilityId field
     */
    public TradeReportingFacilityIdField tradeReportingFacilityId() {
        return tradeReportingFacilityId;
    }

    /**
     * Timestamp 1
     *
     * @return the Timestamp record
     */
    public Timestamp timestampField() {
        return timestampField;
    }

    /**
     * Sale Conditions
     *
     * @return the SaleConditions record
     */
    public SaleConditions saleConditions() {
        return saleConditions;
    }

    /**
     * Prior Day Trade Date and Time
     *
     * @return the PriorDayTradeDateAndTime record
     */
    public PriorDayTradeDateAndTime priorDayTradeDateAndTime() {
        return priorDayTradeDateAndTime;
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
        return new int[0];
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
        if (!timestampField.parseFrom(data, cursor, end - 54)) {
            return false;
        }
        cursor += timestampField.byteLength();
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
        if (!saleConditions.parseFrom(data, cursor, end - 25)) {
            return false;
        }
        cursor += saleConditions.byteLength();
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!tradeVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TradeVolumeField.BYTE_LENGTH;
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
        if (!shortSaleRestrictionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSaleRestrictionIndicatorField.BYTE_LENGTH;
        if (!tradeReportingFacilityId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportingFacilityIdField.BYTE_LENGTH;
        return priorDayTradeDateAndTime.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = participantId.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = messageId.encode(data, cursor);
        cursor = transactionId.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = saleConditions.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradeVolume.encode(data, cursor);
        cursor = sellersSaleDays.encode(data, cursor);
        cursor = stopStockIndicator.encode(data, cursor);
        cursor = tradeThroughExemptIndicator.encode(data, cursor);
        cursor = shortSaleRestrictionIndicator.encode(data, cursor);
        cursor = tradeReportingFacilityId.encode(data, cursor);
        cursor = priorDayTradeDateAndTime.encode(data, cursor);
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
        timestampField.clear();
        saleConditions.clear();
        priorDayTradeDateAndTime.clear();
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
            case "TradeVolume" -> Optional.of(tradeVolume);
            case "SellersSaleDays" -> Optional.of(sellersSaleDays);
            case "StopStockIndicator" -> Optional.of(stopStockIndicator);
            case "TradeThroughExemptIndicator" -> Optional.of(tradeThroughExemptIndicator);
            case "ShortSaleRestrictionIndicator" -> Optional.of(shortSaleRestrictionIndicator);
            case "TradeReportingFacilityId" -> Optional.of(tradeReportingFacilityId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PriorDayTradeMessage message)) {
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
        if (!(other instanceof PriorDayTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
