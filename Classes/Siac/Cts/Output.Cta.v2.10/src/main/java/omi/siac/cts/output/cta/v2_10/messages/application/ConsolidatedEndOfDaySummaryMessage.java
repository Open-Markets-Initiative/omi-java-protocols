package omi.siac.cts.output.cta.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.cts.output.cta.v2_10.fields.FinancialStatusIndicatorField;
import omi.siac.cts.output.cta.v2_10.fields.HighPriceField;
import omi.siac.cts.output.cta.v2_10.fields.InstrumentTypeField;
import omi.siac.cts.output.cta.v2_10.fields.LastParticipantIdField;
import omi.siac.cts.output.cta.v2_10.fields.LastPriceField;
import omi.siac.cts.output.cta.v2_10.fields.LowPriceField;
import omi.siac.cts.output.cta.v2_10.fields.MessageIdField;
import omi.siac.cts.output.cta.v2_10.fields.NumberOfParticipantsField;
import omi.siac.cts.output.cta.v2_10.fields.ParticipantIdField;
import omi.siac.cts.output.cta.v2_10.fields.ParticipantReferenceNumberField;
import omi.siac.cts.output.cta.v2_10.fields.PreviousClosePriceDateField;
import omi.siac.cts.output.cta.v2_10.fields.PrimaryListingMarketParticipantIdField;
import omi.siac.cts.output.cta.v2_10.fields.SecuritySymbolField;
import omi.siac.cts.output.cta.v2_10.fields.ShortSaleRestrictionIndicatorField;
import omi.siac.cts.output.cta.v2_10.fields.TotalVolumeField;
import omi.siac.cts.output.cta.v2_10.fields.TransactionIdField;
import omi.siac.cts.output.cta.v2_10.structs.Timestamp;
import omi.siac.cts.output.cta.v2_10.types.Field;
import omi.siac.cts.output.cta.v2_10.types.Message;
import omi.siac.cts.output.cta.v2_10.types.PrintOptions;

/**
 * Represents the ConsolidatedEndOfDaySummaryMessage message from the Output protocol.
 *
 * <p>The Consolidated End of Day Summary messages are transmitted shortly before the "Goodnight" messages</p>
 */
public final class ConsolidatedEndOfDaySummaryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'C';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 75;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Consolidated End Of Day Summary Message";

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
     * Refer to Participant ID field description for Participant codes
     */
    private final LastParticipantIdField lastParticipantId = new LastParticipantIdField();

    /**
     * Represents the date the security last traded
     */
    private final PreviousClosePriceDateField previousClosePriceDate = new PreviousClosePriceDateField();

    /**
     * The Last Price represents the last price for that security either on a Consolidated or an individual Participant basis at the time it is disseminated
     */
    private final LastPriceField lastPrice = new LastPriceField();

    /**
     * The High Price represents the highest price paid for a security during the trading day
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * The Low Price represents the lowest price paid for a security during the trading day
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * Contains Total Volume of shares traded in a security either on a Consolidated or an individual Participant basis at the time it is disseminated
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * Identifies whether or not a Short Sale Restriction is in effect for a security
     */
    private final ShortSaleRestrictionIndicatorField shortSaleRestrictionIndicator = new ShortSaleRestrictionIndicatorField();

    /**
     * Identifies the Primary Listing Market of the security symbol
     */
    private final PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId = new PrimaryListingMarketParticipantIdField();

    /**
     * Identifies the financial status of the security.
     */
    private final FinancialStatusIndicatorField financialStatusIndicator = new FinancialStatusIndicatorField();

    /**
     * Represents the actual number of Participants for which an issue will be reported.
     */
    private final NumberOfParticipantsField numberOfParticipants = new NumberOfParticipantsField();

    /**
     * Timestamp 1
     */
    private final Timestamp timestampField = new Timestamp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), timestampField.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbol), List.<Field>of(instrumentType), List.<Field>of(lastParticipantId), List.<Field>of(previousClosePriceDate), List.<Field>of(lastPrice), List.<Field>of(highPrice), List.<Field>of(lowPrice), List.<Field>of(totalVolume), List.<Field>of(shortSaleRestrictionIndicator), List.<Field>of(primaryListingMarketParticipantId), List.<Field>of(financialStatusIndicator), List.<Field>of(numberOfParticipants)).flatMap(List::stream).toList();

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
     * Refer to Participant ID field description for Participant codes
     *
     * @return the LastParticipantId field
     */
    public LastParticipantIdField lastParticipantId() {
        return lastParticipantId;
    }

    /**
     * Represents the date the security last traded
     *
     * @return the PreviousClosePriceDate field
     */
    public PreviousClosePriceDateField previousClosePriceDate() {
        return previousClosePriceDate;
    }

    /**
     * The Last Price represents the last price for that security either on a Consolidated or an individual Participant basis at the time it is disseminated
     *
     * @return the LastPrice field
     */
    public LastPriceField lastPrice() {
        return lastPrice;
    }

    /**
     * The High Price represents the highest price paid for a security during the trading day
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * The Low Price represents the lowest price paid for a security during the trading day
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * Contains Total Volume of shares traded in a security either on a Consolidated or an individual Participant basis at the time it is disseminated
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
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
     * Identifies the financial status of the security.
     *
     * @return the FinancialStatusIndicator field
     */
    public FinancialStatusIndicatorField financialStatusIndicator() {
        return financialStatusIndicator;
    }

    /**
     * Represents the actual number of Participants for which an issue will be reported.
     *
     * @return the NumberOfParticipants field
     */
    public NumberOfParticipantsField numberOfParticipants() {
        return numberOfParticipants;
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
        if (!timestampField.parseFrom(data, cursor, end - 66)) {
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
        if (!lastParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += LastParticipantIdField.BYTE_LENGTH;
        if (!previousClosePriceDate.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousClosePriceDateField.BYTE_LENGTH;
        if (!lastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
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
        return numberOfParticipants.parse(data, cursor);
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
        cursor = lastParticipantId.encode(data, cursor);
        cursor = previousClosePriceDate.encode(data, cursor);
        cursor = lastPrice.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = shortSaleRestrictionIndicator.encode(data, cursor);
        cursor = primaryListingMarketParticipantId.encode(data, cursor);
        cursor = financialStatusIndicator.encode(data, cursor);
        cursor = numberOfParticipants.encode(data, cursor);
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
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "LastParticipantId" -> Optional.of(lastParticipantId);
            case "PreviousClosePriceDate" -> Optional.of(previousClosePriceDate);
            case "LastPrice" -> Optional.of(lastPrice);
            case "HighPrice" -> Optional.of(highPrice);
            case "LowPrice" -> Optional.of(lowPrice);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "ShortSaleRestrictionIndicator" -> Optional.of(shortSaleRestrictionIndicator);
            case "PrimaryListingMarketParticipantId" -> Optional.of(primaryListingMarketParticipantId);
            case "FinancialStatusIndicator" -> Optional.of(financialStatusIndicator);
            case "NumberOfParticipants" -> Optional.of(numberOfParticipants);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ConsolidatedEndOfDaySummaryMessage message)) {
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
        if (!(other instanceof ConsolidatedEndOfDaySummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
