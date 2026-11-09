package omi.siac.cts.output.cta.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.cts.output.cta.v2_10.fields.FinancialStatusIndicatorField;
import omi.siac.cts.output.cta.v2_10.fields.InstrumentTypeField;
import omi.siac.cts.output.cta.v2_10.fields.MessageIdField;
import omi.siac.cts.output.cta.v2_10.fields.OriginalParticipantReferenceNumberField;
import omi.siac.cts.output.cta.v2_10.fields.ParticipantIdField;
import omi.siac.cts.output.cta.v2_10.fields.ParticipantReferenceNumberField;
import omi.siac.cts.output.cta.v2_10.fields.PrimaryListingMarketParticipantIdField;
import omi.siac.cts.output.cta.v2_10.fields.SecuritySymbolField;
import omi.siac.cts.output.cta.v2_10.fields.TradeReportingFacilityIdField;
import omi.siac.cts.output.cta.v2_10.fields.TransactionIdField;
import omi.siac.cts.output.cta.v2_10.structs.FractionalConsolidatedData;
import omi.siac.cts.output.cta.v2_10.structs.FractionalCorrectedTrade;
import omi.siac.cts.output.cta.v2_10.structs.FractionalOriginalTrade;
import omi.siac.cts.output.cta.v2_10.structs.FractionalParticipantData;
import omi.siac.cts.output.cta.v2_10.structs.Timestamp1;
import omi.siac.cts.output.cta.v2_10.structs.Timestamp2;
import omi.siac.cts.output.cta.v2_10.types.Field;
import omi.siac.cts.output.cta.v2_10.types.Message;
import omi.siac.cts.output.cta.v2_10.types.PrintOptions;

/**
 * Represents the FractionalTradeCorrectionMessage message from the Output protocol.
 *
 * <p>The Trade Correction message is used to correct Cta eligible Equity, Local Issue or Bond information.</p>
 */
public final class FractionalTradeCorrectionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'O';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 184;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Fractional Trade Correction Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

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
     * Identifies the Participant with whom a Trade Reporting Facility has been formed
     */
    private final TradeReportingFacilityIdField tradeReportingFacilityId = new TradeReportingFacilityIdField();

    /**
     * Contains the Participant Reference Number of transaction to be corrected, cancelled or error
     */
    private final OriginalParticipantReferenceNumberField originalParticipantReferenceNumber = new OriginalParticipantReferenceNumberField();

    /**
     * Identifies the Primary Listing Market of the security symbol
     */
    private final PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId = new PrimaryListingMarketParticipantIdField();

    /**
     * Identifies the financial status of the security.
     */
    private final FinancialStatusIndicatorField financialStatusIndicator = new FinancialStatusIndicatorField();

    /**
     * Timestamp 1
     */
    private final Timestamp1 timestamp1 = new Timestamp1();

    /**
     * Fractional Corrected Trade
     */
    private final FractionalCorrectedTrade fractionalCorrectedTrade = new FractionalCorrectedTrade();

    /**
     * Timestamp 2
     */
    private final Timestamp2 timestamp2 = new Timestamp2();

    /**
     * Fractional Original Trade
     */
    private final FractionalOriginalTrade fractionalOriginalTrade = new FractionalOriginalTrade();

    /**
     * Fractional Consolidated Data
     */
    private final FractionalConsolidatedData fractionalConsolidatedData = new FractionalConsolidatedData();

    /**
     * Fractional Participant Data
     */
    private final FractionalParticipantData fractionalParticipantData = new FractionalParticipantData();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), timestamp1.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbol), List.<Field>of(instrumentType), fractionalCorrectedTrade.fields(), List.<Field>of(tradeReportingFacilityId), timestamp2.fields(), List.<Field>of(originalParticipantReferenceNumber), fractionalOriginalTrade.fields(), List.<Field>of(primaryListingMarketParticipantId), List.<Field>of(financialStatusIndicator), fractionalConsolidatedData.fields(), fractionalParticipantData.fields()).flatMap(List::stream).toList();

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
     * Identifies the Participant with whom a Trade Reporting Facility has been formed
     *
     * @return the TradeReportingFacilityId field
     */
    public TradeReportingFacilityIdField tradeReportingFacilityId() {
        return tradeReportingFacilityId;
    }

    /**
     * Contains the Participant Reference Number of transaction to be corrected, cancelled or error
     *
     * @return the OriginalParticipantReferenceNumber field
     */
    public OriginalParticipantReferenceNumberField originalParticipantReferenceNumber() {
        return originalParticipantReferenceNumber;
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
     * Identifies the financial status of the security.
     *
     * @return the FinancialStatusIndicator field
     */
    public FinancialStatusIndicatorField financialStatusIndicator() {
        return financialStatusIndicator;
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
     * Fractional Corrected Trade
     *
     * @return the FractionalCorrectedTrade record
     */
    public FractionalCorrectedTrade fractionalCorrectedTrade() {
        return fractionalCorrectedTrade;
    }

    /**
     * Timestamp 2
     *
     * @return the Timestamp2 record
     */
    public Timestamp2 timestamp2() {
        return timestamp2;
    }

    /**
     * Fractional Original Trade
     *
     * @return the FractionalOriginalTrade record
     */
    public FractionalOriginalTrade fractionalOriginalTrade() {
        return fractionalOriginalTrade;
    }

    /**
     * Fractional Consolidated Data
     *
     * @return the FractionalConsolidatedData record
     */
    public FractionalConsolidatedData fractionalConsolidatedData() {
        return fractionalConsolidatedData;
    }

    /**
     * Fractional Participant Data
     *
     * @return the FractionalParticipantData record
     */
    public FractionalParticipantData fractionalParticipantData() {
        return fractionalParticipantData;
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
        if (!timestamp1.parseFrom(data, cursor, end - 175)) {
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
        if (!fractionalCorrectedTrade.parseFrom(data, cursor, end - 126)) {
            return false;
        }
        cursor += fractionalCorrectedTrade.byteLength();
        if (!tradeReportingFacilityId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportingFacilityIdField.BYTE_LENGTH;
        if (!timestamp2.parseFrom(data, cursor, end - 117)) {
            return false;
        }
        cursor += timestamp2.byteLength();
        if (!originalParticipantReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalParticipantReferenceNumberField.BYTE_LENGTH;
        if (!fractionalOriginalTrade.parseFrom(data, cursor, end - 85)) {
            return false;
        }
        cursor += fractionalOriginalTrade.byteLength();
        if (!primaryListingMarketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryListingMarketParticipantIdField.BYTE_LENGTH;
        if (!financialStatusIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialStatusIndicatorField.BYTE_LENGTH;
        if (!fractionalConsolidatedData.parseFrom(data, cursor, end - 45)) {
            return false;
        }
        cursor += fractionalConsolidatedData.byteLength();
        if (!fractionalParticipantData.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += fractionalParticipantData.byteLength();

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
        cursor = fractionalCorrectedTrade.encode(data, cursor);
        cursor = tradeReportingFacilityId.encode(data, cursor);
        cursor = timestamp2.encode(data, cursor);
        cursor = originalParticipantReferenceNumber.encode(data, cursor);
        cursor = fractionalOriginalTrade.encode(data, cursor);
        cursor = primaryListingMarketParticipantId.encode(data, cursor);
        cursor = financialStatusIndicator.encode(data, cursor);
        cursor = fractionalConsolidatedData.encode(data, cursor);
        cursor = fractionalParticipantData.encode(data, cursor);
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
        fractionalCorrectedTrade.clear();
        timestamp2.clear();
        fractionalOriginalTrade.clear();
        fractionalConsolidatedData.clear();
        fractionalParticipantData.clear();
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
            case "TradeReportingFacilityId" -> Optional.of(tradeReportingFacilityId);
            case "OriginalParticipantReferenceNumber" -> Optional.of(originalParticipantReferenceNumber);
            case "PrimaryListingMarketParticipantId" -> Optional.of(primaryListingMarketParticipantId);
            case "FinancialStatusIndicator" -> Optional.of(financialStatusIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FractionalTradeCorrectionMessage message)) {
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
        if (!(other instanceof FractionalTradeCorrectionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
