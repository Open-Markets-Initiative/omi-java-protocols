package omi.siac.cts.output.cta.v2_11_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.cts.output.cta.v2_11_b.fields.CorrectedSaleConditionField;
import omi.siac.cts.output.cta.v2_11_b.fields.CorrectedSellersSaleDaysField;
import omi.siac.cts.output.cta.v2_11_b.fields.CorrectedShortSaleRestrictionIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.CorrectedStopStockIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.CorrectedTradePriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.CorrectedTradeThroughExemptIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.CorrectedTradeVolumeField;
import omi.siac.cts.output.cta.v2_11_b.fields.InstrumentTypeField;
import omi.siac.cts.output.cta.v2_11_b.fields.MessageIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.OriginalSaleConditionField;
import omi.siac.cts.output.cta.v2_11_b.fields.OriginalSellersSaleDaysField;
import omi.siac.cts.output.cta.v2_11_b.fields.OriginalShortSaleRestrictionIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.OriginalStopStockIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.OriginalTradePriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.OriginalTradeThroughExemptIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.OriginalTradeVolumeField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantReferenceNumberField;
import omi.siac.cts.output.cta.v2_11_b.fields.SecuritySymbolField;
import omi.siac.cts.output.cta.v2_11_b.fields.TradeReportingFacilityIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.TransactionIdField;
import omi.siac.cts.output.cta.v2_11_b.structs.CorrectedPriorDayTradeDateAndTime;
import omi.siac.cts.output.cta.v2_11_b.structs.OriginalPriorDayTradeDateAndTime;
import omi.siac.cts.output.cta.v2_11_b.structs.Timestamp;
import omi.siac.cts.output.cta.v2_11_b.types.Field;
import omi.siac.cts.output.cta.v2_11_b.types.Message;
import omi.siac.cts.output.cta.v2_11_b.types.PrintOptions;

/**
 * Represents the PriorDayTradeCorrectionMessage message from the Output protocol.
 *
 * <p>Used to correct a transaction originally reported on a trading day earlier than the current trading day. To be descoped when Fractional Trade Volume publication is activated</p>
 */
public final class PriorDayTradeCorrectionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'C';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Prior Day Trade Correction Message";

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
     * Corrected sale condition associated with a trade
     */
    private final CorrectedSaleConditionField correctedSaleCondition = new CorrectedSaleConditionField();

    /**
     * Corrected monetary value of an individual share of security. Has implied 6 decimal places
     */
    private final CorrectedTradePriceField correctedTradePrice = new CorrectedTradePriceField();

    /**
     * Corrected total number of shares which traded in a single transaction for an individual security
     */
    private final CorrectedTradeVolumeField correctedTradeVolume = new CorrectedTradeVolumeField();

    /**
     * Corrected number of days that may elapse before delivery of the security
     */
    private final CorrectedSellersSaleDaysField correctedSellersSaleDays = new CorrectedSellersSaleDaysField();

    /**
     * Corrected stop stock indicator
     */
    private final CorrectedStopStockIndicatorField correctedStopStockIndicator = new CorrectedStopStockIndicatorField();

    /**
     * Corrected trade through exempt indicator
     */
    private final CorrectedTradeThroughExemptIndicatorField correctedTradeThroughExemptIndicator = new CorrectedTradeThroughExemptIndicatorField();

    /**
     * Corrected short sale restriction indicator
     */
    private final CorrectedShortSaleRestrictionIndicatorField correctedShortSaleRestrictionIndicator = new CorrectedShortSaleRestrictionIndicatorField();

    /**
     * Identifies the Participant with whom a Trade Reporting Facility (TRF) has been formed. Space-filled
     */
    private final TradeReportingFacilityIdField tradeReportingFacilityId = new TradeReportingFacilityIdField();

    /**
     * Original sale condition associated with a trade
     */
    private final OriginalSaleConditionField originalSaleCondition = new OriginalSaleConditionField();

    /**
     * Original monetary value of an individual share of security. Has implied 6 decimal places
     */
    private final OriginalTradePriceField originalTradePrice = new OriginalTradePriceField();

    /**
     * Original total number of shares which traded in a single transaction for an individual security
     */
    private final OriginalTradeVolumeField originalTradeVolume = new OriginalTradeVolumeField();

    /**
     * Original number of days that may elapse before delivery of the security
     */
    private final OriginalSellersSaleDaysField originalSellersSaleDays = new OriginalSellersSaleDaysField();

    /**
     * Original stop stock indicator
     */
    private final OriginalStopStockIndicatorField originalStopStockIndicator = new OriginalStopStockIndicatorField();

    /**
     * Original trade through exempt indicator
     */
    private final OriginalTradeThroughExemptIndicatorField originalTradeThroughExemptIndicator = new OriginalTradeThroughExemptIndicatorField();

    /**
     * Original short sale restriction indicator
     */
    private final OriginalShortSaleRestrictionIndicatorField originalShortSaleRestrictionIndicator = new OriginalShortSaleRestrictionIndicatorField();

    /**
     * Timestamp 1
     */
    private final Timestamp timestampField = new Timestamp();

    /**
     * The corrected prior day trade date and time
     */
    private final CorrectedPriorDayTradeDateAndTime correctedPriorDayTradeDateAndTime = new CorrectedPriorDayTradeDateAndTime();

    /**
     * The original prior day trade date and time
     */
    private final OriginalPriorDayTradeDateAndTime originalPriorDayTradeDateAndTime = new OriginalPriorDayTradeDateAndTime();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), timestampField.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbol), List.<Field>of(instrumentType), List.<Field>of(correctedSaleCondition), List.<Field>of(correctedTradePrice), List.<Field>of(correctedTradeVolume), List.<Field>of(correctedSellersSaleDays), List.<Field>of(correctedStopStockIndicator), List.<Field>of(correctedTradeThroughExemptIndicator), List.<Field>of(correctedShortSaleRestrictionIndicator), correctedPriorDayTradeDateAndTime.fields(), List.<Field>of(tradeReportingFacilityId), List.<Field>of(originalSaleCondition), List.<Field>of(originalTradePrice), List.<Field>of(originalTradeVolume), List.<Field>of(originalSellersSaleDays), List.<Field>of(originalStopStockIndicator), List.<Field>of(originalTradeThroughExemptIndicator), List.<Field>of(originalShortSaleRestrictionIndicator), originalPriorDayTradeDateAndTime.fields()).flatMap(List::stream).toList();

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
     * Corrected sale condition associated with a trade
     *
     * @return the CorrectedSaleCondition field
     */
    public CorrectedSaleConditionField correctedSaleCondition() {
        return correctedSaleCondition;
    }

    /**
     * Corrected monetary value of an individual share of security. Has implied 6 decimal places
     *
     * @return the CorrectedTradePrice field
     */
    public CorrectedTradePriceField correctedTradePrice() {
        return correctedTradePrice;
    }

    /**
     * Corrected total number of shares which traded in a single transaction for an individual security
     *
     * @return the CorrectedTradeVolume field
     */
    public CorrectedTradeVolumeField correctedTradeVolume() {
        return correctedTradeVolume;
    }

    /**
     * Corrected number of days that may elapse before delivery of the security
     *
     * @return the CorrectedSellersSaleDays field
     */
    public CorrectedSellersSaleDaysField correctedSellersSaleDays() {
        return correctedSellersSaleDays;
    }

    /**
     * Corrected stop stock indicator
     *
     * @return the CorrectedStopStockIndicator field
     */
    public CorrectedStopStockIndicatorField correctedStopStockIndicator() {
        return correctedStopStockIndicator;
    }

    /**
     * Corrected trade through exempt indicator
     *
     * @return the CorrectedTradeThroughExemptIndicator field
     */
    public CorrectedTradeThroughExemptIndicatorField correctedTradeThroughExemptIndicator() {
        return correctedTradeThroughExemptIndicator;
    }

    /**
     * Corrected short sale restriction indicator
     *
     * @return the CorrectedShortSaleRestrictionIndicator field
     */
    public CorrectedShortSaleRestrictionIndicatorField correctedShortSaleRestrictionIndicator() {
        return correctedShortSaleRestrictionIndicator;
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
     * Original sale condition associated with a trade
     *
     * @return the OriginalSaleCondition field
     */
    public OriginalSaleConditionField originalSaleCondition() {
        return originalSaleCondition;
    }

    /**
     * Original monetary value of an individual share of security. Has implied 6 decimal places
     *
     * @return the OriginalTradePrice field
     */
    public OriginalTradePriceField originalTradePrice() {
        return originalTradePrice;
    }

    /**
     * Original total number of shares which traded in a single transaction for an individual security
     *
     * @return the OriginalTradeVolume field
     */
    public OriginalTradeVolumeField originalTradeVolume() {
        return originalTradeVolume;
    }

    /**
     * Original number of days that may elapse before delivery of the security
     *
     * @return the OriginalSellersSaleDays field
     */
    public OriginalSellersSaleDaysField originalSellersSaleDays() {
        return originalSellersSaleDays;
    }

    /**
     * Original stop stock indicator
     *
     * @return the OriginalStopStockIndicator field
     */
    public OriginalStopStockIndicatorField originalStopStockIndicator() {
        return originalStopStockIndicator;
    }

    /**
     * Original trade through exempt indicator
     *
     * @return the OriginalTradeThroughExemptIndicator field
     */
    public OriginalTradeThroughExemptIndicatorField originalTradeThroughExemptIndicator() {
        return originalTradeThroughExemptIndicator;
    }

    /**
     * Original short sale restriction indicator
     *
     * @return the OriginalShortSaleRestrictionIndicator field
     */
    public OriginalShortSaleRestrictionIndicatorField originalShortSaleRestrictionIndicator() {
        return originalShortSaleRestrictionIndicator;
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
     * The corrected prior day trade date and time
     *
     * @return the CorrectedPriorDayTradeDateAndTime record
     */
    public CorrectedPriorDayTradeDateAndTime correctedPriorDayTradeDateAndTime() {
        return correctedPriorDayTradeDateAndTime;
    }

    /**
     * The original prior day trade date and time
     *
     * @return the OriginalPriorDayTradeDateAndTime record
     */
    public OriginalPriorDayTradeDateAndTime originalPriorDayTradeDateAndTime() {
        return originalPriorDayTradeDateAndTime;
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
        if (!timestampField.parseFrom(data, cursor, end - 82)) {
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
        if (!correctedSaleCondition.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSaleConditionField.BYTE_LENGTH;
        if (!correctedTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradePriceField.BYTE_LENGTH;
        if (!correctedTradeVolume.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradeVolumeField.BYTE_LENGTH;
        if (!correctedSellersSaleDays.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSellersSaleDaysField.BYTE_LENGTH;
        if (!correctedStopStockIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedStopStockIndicatorField.BYTE_LENGTH;
        if (!correctedTradeThroughExemptIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradeThroughExemptIndicatorField.BYTE_LENGTH;
        if (!correctedShortSaleRestrictionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedShortSaleRestrictionIndicatorField.BYTE_LENGTH;
        if (!correctedPriorDayTradeDateAndTime.parseFrom(data, cursor, end - 29)) {
            return false;
        }
        cursor += correctedPriorDayTradeDateAndTime.byteLength();
        if (!tradeReportingFacilityId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportingFacilityIdField.BYTE_LENGTH;
        if (!originalSaleCondition.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSaleConditionField.BYTE_LENGTH;
        if (!originalTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradePriceField.BYTE_LENGTH;
        if (!originalTradeVolume.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeVolumeField.BYTE_LENGTH;
        if (!originalSellersSaleDays.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSellersSaleDaysField.BYTE_LENGTH;
        if (!originalStopStockIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalStopStockIndicatorField.BYTE_LENGTH;
        if (!originalTradeThroughExemptIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeThroughExemptIndicatorField.BYTE_LENGTH;
        if (!originalShortSaleRestrictionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalShortSaleRestrictionIndicatorField.BYTE_LENGTH;
        return originalPriorDayTradeDateAndTime.parseFrom(data, cursor, end);
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
        cursor = correctedSaleCondition.encode(data, cursor);
        cursor = correctedTradePrice.encode(data, cursor);
        cursor = correctedTradeVolume.encode(data, cursor);
        cursor = correctedSellersSaleDays.encode(data, cursor);
        cursor = correctedStopStockIndicator.encode(data, cursor);
        cursor = correctedTradeThroughExemptIndicator.encode(data, cursor);
        cursor = correctedShortSaleRestrictionIndicator.encode(data, cursor);
        cursor = correctedPriorDayTradeDateAndTime.encode(data, cursor);
        cursor = tradeReportingFacilityId.encode(data, cursor);
        cursor = originalSaleCondition.encode(data, cursor);
        cursor = originalTradePrice.encode(data, cursor);
        cursor = originalTradeVolume.encode(data, cursor);
        cursor = originalSellersSaleDays.encode(data, cursor);
        cursor = originalStopStockIndicator.encode(data, cursor);
        cursor = originalTradeThroughExemptIndicator.encode(data, cursor);
        cursor = originalShortSaleRestrictionIndicator.encode(data, cursor);
        cursor = originalPriorDayTradeDateAndTime.encode(data, cursor);
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
        correctedPriorDayTradeDateAndTime.clear();
        originalPriorDayTradeDateAndTime.clear();
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
            case "CorrectedSaleCondition" -> Optional.of(correctedSaleCondition);
            case "CorrectedTradePrice" -> Optional.of(correctedTradePrice);
            case "CorrectedTradeVolume" -> Optional.of(correctedTradeVolume);
            case "CorrectedSellersSaleDays" -> Optional.of(correctedSellersSaleDays);
            case "CorrectedStopStockIndicator" -> Optional.of(correctedStopStockIndicator);
            case "CorrectedTradeThroughExemptIndicator" -> Optional.of(correctedTradeThroughExemptIndicator);
            case "CorrectedShortSaleRestrictionIndicator" -> Optional.of(correctedShortSaleRestrictionIndicator);
            case "TradeReportingFacilityId" -> Optional.of(tradeReportingFacilityId);
            case "OriginalSaleCondition" -> Optional.of(originalSaleCondition);
            case "OriginalTradePrice" -> Optional.of(originalTradePrice);
            case "OriginalTradeVolume" -> Optional.of(originalTradeVolume);
            case "OriginalSellersSaleDays" -> Optional.of(originalSellersSaleDays);
            case "OriginalStopStockIndicator" -> Optional.of(originalStopStockIndicator);
            case "OriginalTradeThroughExemptIndicator" -> Optional.of(originalTradeThroughExemptIndicator);
            case "OriginalShortSaleRestrictionIndicator" -> Optional.of(originalShortSaleRestrictionIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PriorDayTradeCorrectionMessage message)) {
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
        if (!(other instanceof PriorDayTradeCorrectionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
