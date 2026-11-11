package omi.siac.cts.output.cta.v1_91.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.cts.output.cta.v1_91.fields.ConsolidatedHighLowLastIndicatorField;
import omi.siac.cts.output.cta.v1_91.fields.MessageIdField;
import omi.siac.cts.output.cta.v1_91.fields.ParticipantIdField;
import omi.siac.cts.output.cta.v1_91.fields.ParticipantOpenHighLowLastIndicatorField;
import omi.siac.cts.output.cta.v1_91.fields.ParticipantReferenceNumberField;
import omi.siac.cts.output.cta.v1_91.fields.PrimaryListingMarketParticipantIdField;
import omi.siac.cts.output.cta.v1_91.fields.SaleConditionCategoryField;
import omi.siac.cts.output.cta.v1_91.fields.SaleConditionField;
import omi.siac.cts.output.cta.v1_91.fields.SecuritySymbolShortField;
import omi.siac.cts.output.cta.v1_91.fields.TradePriceShortField;
import omi.siac.cts.output.cta.v1_91.fields.TradeVolumeShortField;
import omi.siac.cts.output.cta.v1_91.fields.TransactionIdField;
import omi.siac.cts.output.cta.v1_91.structs.Timestamp;
import omi.siac.cts.output.cta.v1_91.types.Field;
import omi.siac.cts.output.cta.v1_91.types.Message;
import omi.siac.cts.output.cta.v1_91.types.PrintOptions;

/**
 * Represents the ShortTradeMessage message from the Output protocol.
 *
 * <p>The Short Trade message is used to report trade information for Cta eligible Equity only (not used for Local Issues or Bonds) if the trade meets message format requirements otherwise Long Trade message is used.</p>
 */
public final class ShortTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'T';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Short Trade Message";

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
    private final SecuritySymbolShortField securitySymbolShort = new SecuritySymbolShortField();

    /**
     * Denotes the sale condition associated with a trade
     */
    private final SaleConditionField saleCondition = new SaleConditionField();

    /**
     * In the Short Trade format, identifies the Sale Condition Category level associated with a trade
     */
    private final SaleConditionCategoryField saleConditionCategory = new SaleConditionCategoryField();

    /**
     * The Trade Price is the monetary value of an individual share of security at the time of the trade
     */
    private final TradePriceShortField tradePriceShort = new TradePriceShortField();

    /**
     * Contains the total number of shares traded in a single transaction for an individual security
     */
    private final TradeVolumeShortField tradeVolumeShort = new TradeVolumeShortField();

    /**
     * Identifies the Primary Listing Market of the security symbol
     */
    private final PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId = new PrimaryListingMarketParticipantIdField();

    /**
     * Identifies the Consolidated High/Low/Last Price applicable to the trade.
     */
    private final ConsolidatedHighLowLastIndicatorField consolidatedHighLowLastIndicator = new ConsolidatedHighLowLastIndicatorField();

    /**
     * Identifies the Participant Open/High/Low/Last applicable to the transaction
     */
    private final ParticipantOpenHighLowLastIndicatorField participantOpenHighLowLastIndicator = new ParticipantOpenHighLowLastIndicatorField();

    /**
     * Timestamp 1
     */
    private final Timestamp timestampField = new Timestamp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), timestampField.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbolShort), List.<Field>of(saleCondition), List.<Field>of(saleConditionCategory), List.<Field>of(tradePriceShort), List.<Field>of(tradeVolumeShort), List.<Field>of(primaryListingMarketParticipantId), List.<Field>of(consolidatedHighLowLastIndicator), List.<Field>of(participantOpenHighLowLastIndicator)).flatMap(List::stream).toList();

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
     * @return the SecuritySymbolShort field
     */
    public SecuritySymbolShortField securitySymbolShort() {
        return securitySymbolShort;
    }

    /**
     * Denotes the sale condition associated with a trade
     *
     * @return the SaleCondition field
     */
    public SaleConditionField saleCondition() {
        return saleCondition;
    }

    /**
     * In the Short Trade format, identifies the Sale Condition Category level associated with a trade
     *
     * @return the SaleConditionCategory field
     */
    public SaleConditionCategoryField saleConditionCategory() {
        return saleConditionCategory;
    }

    /**
     * The Trade Price is the monetary value of an individual share of security at the time of the trade
     *
     * @return the TradePriceShort field
     */
    public TradePriceShortField tradePriceShort() {
        return tradePriceShort;
    }

    /**
     * Contains the total number of shares traded in a single transaction for an individual security
     *
     * @return the TradeVolumeShort field
     */
    public TradeVolumeShortField tradeVolumeShort() {
        return tradeVolumeShort;
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
     * Identifies the Consolidated High/Low/Last Price applicable to the trade.
     *
     * @return the ConsolidatedHighLowLastIndicator field
     */
    public ConsolidatedHighLowLastIndicatorField consolidatedHighLowLastIndicator() {
        return consolidatedHighLowLastIndicator;
    }

    /**
     * Identifies the Participant Open/High/Low/Last applicable to the transaction
     *
     * @return the ParticipantOpenHighLowLastIndicator field
     */
    public ParticipantOpenHighLowLastIndicatorField participantOpenHighLowLastIndicator() {
        return participantOpenHighLowLastIndicator;
    }

    /**
     * Timestamp 1
     *
     * @return the Timestamp record
     */
    public Timestamp timestampField() {
        return timestampField;
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
        if (!timestampField.parseFrom(data, cursor, end - 27)) {
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
        if (!securitySymbolShort.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolShortField.BYTE_LENGTH;
        if (!saleCondition.parse(data, cursor)) {
            return false;
        }
        cursor += SaleConditionField.BYTE_LENGTH;
        if (!saleConditionCategory.parse(data, cursor)) {
            return false;
        }
        cursor += SaleConditionCategoryField.BYTE_LENGTH;
        if (!tradePriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceShortField.BYTE_LENGTH;
        if (!tradeVolumeShort.parse(data, cursor)) {
            return false;
        }
        cursor += TradeVolumeShortField.BYTE_LENGTH;
        if (!primaryListingMarketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryListingMarketParticipantIdField.BYTE_LENGTH;
        if (!consolidatedHighLowLastIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedHighLowLastIndicatorField.BYTE_LENGTH;
        return participantOpenHighLowLastIndicator.parse(data, cursor);
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
        cursor = securitySymbolShort.encode(data, cursor);
        cursor = saleCondition.encode(data, cursor);
        cursor = saleConditionCategory.encode(data, cursor);
        cursor = tradePriceShort.encode(data, cursor);
        cursor = tradeVolumeShort.encode(data, cursor);
        cursor = primaryListingMarketParticipantId.encode(data, cursor);
        cursor = consolidatedHighLowLastIndicator.encode(data, cursor);
        cursor = participantOpenHighLowLastIndicator.encode(data, cursor);
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
            case "SecuritySymbolShort" -> Optional.of(securitySymbolShort);
            case "SaleCondition" -> Optional.of(saleCondition);
            case "SaleConditionCategory" -> Optional.of(saleConditionCategory);
            case "TradePriceShort" -> Optional.of(tradePriceShort);
            case "TradeVolumeShort" -> Optional.of(tradeVolumeShort);
            case "PrimaryListingMarketParticipantId" -> Optional.of(primaryListingMarketParticipantId);
            case "ConsolidatedHighLowLastIndicator" -> Optional.of(consolidatedHighLowLastIndicator);
            case "ParticipantOpenHighLowLastIndicator" -> Optional.of(participantOpenHighLowLastIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ShortTradeMessage message)) {
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
        if (!(other instanceof ShortTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
