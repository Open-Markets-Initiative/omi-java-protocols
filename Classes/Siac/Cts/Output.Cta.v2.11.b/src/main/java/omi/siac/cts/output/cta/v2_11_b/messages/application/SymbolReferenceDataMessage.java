package omi.siac.cts.output.cta.v2_11_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.cts.output.cta.v2_11_b.fields.ConsolidatedClosingPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.FinancialStatusIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.HaltReasonField;
import omi.siac.cts.output.cta.v2_11_b.fields.InstrumentTypeField;
import omi.siac.cts.output.cta.v2_11_b.fields.IpoField;
import omi.siac.cts.output.cta.v2_11_b.fields.LuldLeverageRatioField;
import omi.siac.cts.output.cta.v2_11_b.fields.LuldTierField;
import omi.siac.cts.output.cta.v2_11_b.fields.MessageIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.MinimumPriceIncrementIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantReferenceNumberField;
import omi.siac.cts.output.cta.v2_11_b.fields.PrimaryListingMarketParticipantIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.PrimaryListingMarketPreviousClosingPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.PriorSecuritySymbolField;
import omi.siac.cts.output.cta.v2_11_b.fields.Reserved128Field;
import omi.siac.cts.output.cta.v2_11_b.fields.ReservedField2;
import omi.siac.cts.output.cta.v2_11_b.fields.RoundLotSizeField;
import omi.siac.cts.output.cta.v2_11_b.fields.SecondReservedField;
import omi.siac.cts.output.cta.v2_11_b.fields.SecuritySymbolField;
import omi.siac.cts.output.cta.v2_11_b.fields.ShortSaleRestrictionIndicatorField;
import omi.siac.cts.output.cta.v2_11_b.fields.TestField;
import omi.siac.cts.output.cta.v2_11_b.fields.TransactionIdField;
import omi.siac.cts.output.cta.v2_11_b.structs.Timestamp;
import omi.siac.cts.output.cta.v2_11_b.types.Field;
import omi.siac.cts.output.cta.v2_11_b.types.Message;
import omi.siac.cts.output.cta.v2_11_b.types.PrintOptions;

/**
 * Represents the SymbolReferenceDataMessage message from the Output protocol.
 *
 * <p>Symbol Reference Data message</p>
 */
public final class SymbolReferenceDataMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'S';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 205;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Symbol Reference Data Message";

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
     * Contains the prior Security Symbol
     */
    private final PriorSecuritySymbolField priorSecuritySymbol = new PriorSecuritySymbolField();

    /**
     * Identifies the Primary Listing Market of the security symbol
     */
    private final PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId = new PrimaryListingMarketParticipantIdField();

    /**
     * Represents the previous closing price for the primary listing market. Has implied 6 decimal places
     */
    private final PrimaryListingMarketPreviousClosingPriceField primaryListingMarketPreviousClosingPrice = new PrimaryListingMarketPreviousClosingPriceField();

    /**
     * Represents the consolidated closing price. Has implied 6 decimal places
     */
    private final ConsolidatedClosingPriceField consolidatedClosingPrice = new ConsolidatedClosingPriceField();

    /**
     * Round-lot size for a symbol can consist of 1, 10, 40 or 100 shares
     */
    private final RoundLotSizeField roundLotSize = new RoundLotSizeField();

    /**
     * Identifies the applicable tick size for a symbol
     */
    private final MinimumPriceIncrementIndicatorField minimumPriceIncrementIndicator = new MinimumPriceIncrementIndicatorField();

    /**
     * Identifies the Limit Up Limit Down tier of the security symbol
     */
    private final LuldTierField luldTier = new LuldTierField();

    /**
     * Represents the Leverage ratio associated with the LULD Tier of the security symbol. Has implied 6 decimal places
     */
    private final LuldLeverageRatioField luldLeverageRatio = new LuldLeverageRatioField();

    /**
     * Identifies whether the security symbol is a test symbol
     */
    private final TestField test = new TestField();

    /**
     * Identifies whether the security symbol is an IPO
     */
    private final IpoField ipo = new IpoField();

    /**
     * Identifies the financial status of the security
     */
    private final FinancialStatusIndicatorField financialStatusIndicator = new FinancialStatusIndicatorField();

    /**
     * Identifies whether or not a Short Sale Restriction is in effect for a security
     */
    private final ShortSaleRestrictionIndicatorField shortSaleRestrictionIndicator = new ShortSaleRestrictionIndicatorField();

    /**
     * Denotes the reason for the Trading Halt
     */
    private final HaltReasonField haltReason = new HaltReasonField();

    /**
     * Identifies the instrument type relevant to the trade
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * Space-filled. Field is reserved for future use
     */
    private final ReservedField2 reserved = new ReservedField2();

    /**
     * Space-filled. Field is reserved for future use
     */
    private final SecondReservedField secondReserved = new SecondReservedField();

    /**
     * Space-filled. Field is reserved for future use
     */
    private final Reserved128Field reserved128 = new Reserved128Field();

    /**
     * Timestamp 1
     */
    private final Timestamp timestampField = new Timestamp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), timestampField.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbol), List.<Field>of(priorSecuritySymbol), List.<Field>of(primaryListingMarketParticipantId), List.<Field>of(primaryListingMarketPreviousClosingPrice), List.<Field>of(consolidatedClosingPrice), List.<Field>of(roundLotSize), List.<Field>of(minimumPriceIncrementIndicator), List.<Field>of(luldTier), List.<Field>of(luldLeverageRatio), List.<Field>of(test), List.<Field>of(ipo), List.<Field>of(financialStatusIndicator), List.<Field>of(shortSaleRestrictionIndicator), List.<Field>of(haltReason), List.<Field>of(instrumentType), List.<Field>of(reserved), List.<Field>of(secondReserved), List.<Field>of(reserved128)).flatMap(List::stream).toList();

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
     * Contains the prior Security Symbol
     *
     * @return the PriorSecuritySymbol field
     */
    public PriorSecuritySymbolField priorSecuritySymbol() {
        return priorSecuritySymbol;
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
     * Represents the previous closing price for the primary listing market. Has implied 6 decimal places
     *
     * @return the PrimaryListingMarketPreviousClosingPrice field
     */
    public PrimaryListingMarketPreviousClosingPriceField primaryListingMarketPreviousClosingPrice() {
        return primaryListingMarketPreviousClosingPrice;
    }

    /**
     * Represents the consolidated closing price. Has implied 6 decimal places
     *
     * @return the ConsolidatedClosingPrice field
     */
    public ConsolidatedClosingPriceField consolidatedClosingPrice() {
        return consolidatedClosingPrice;
    }

    /**
     * Round-lot size for a symbol can consist of 1, 10, 40 or 100 shares
     *
     * @return the RoundLotSize field
     */
    public RoundLotSizeField roundLotSize() {
        return roundLotSize;
    }

    /**
     * Identifies the applicable tick size for a symbol
     *
     * @return the MinimumPriceIncrementIndicator field
     */
    public MinimumPriceIncrementIndicatorField minimumPriceIncrementIndicator() {
        return minimumPriceIncrementIndicator;
    }

    /**
     * Identifies the Limit Up Limit Down tier of the security symbol
     *
     * @return the LuldTier field
     */
    public LuldTierField luldTier() {
        return luldTier;
    }

    /**
     * Represents the Leverage ratio associated with the LULD Tier of the security symbol. Has implied 6 decimal places
     *
     * @return the LuldLeverageRatio field
     */
    public LuldLeverageRatioField luldLeverageRatio() {
        return luldLeverageRatio;
    }

    /**
     * Identifies whether the security symbol is a test symbol
     *
     * @return the Test field
     */
    public TestField test() {
        return test;
    }

    /**
     * Identifies whether the security symbol is an IPO
     *
     * @return the Ipo field
     */
    public IpoField ipo() {
        return ipo;
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
     * Identifies whether or not a Short Sale Restriction is in effect for a security
     *
     * @return the ShortSaleRestrictionIndicator field
     */
    public ShortSaleRestrictionIndicatorField shortSaleRestrictionIndicator() {
        return shortSaleRestrictionIndicator;
    }

    /**
     * Denotes the reason for the Trading Halt
     *
     * @return the HaltReason field
     */
    public HaltReasonField haltReason() {
        return haltReason;
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
     * Space-filled. Field is reserved for future use
     *
     * @return the Reserved field
     */
    public ReservedField2 reserved() {
        return reserved;
    }

    /**
     * Space-filled. Field is reserved for future use
     *
     * @return the SecondReserved field
     */
    public SecondReservedField secondReserved() {
        return secondReserved;
    }

    /**
     * Space-filled. Field is reserved for future use
     *
     * @return the Reserved128 field
     */
    public Reserved128Field reserved128() {
        return reserved128;
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
        if (!timestampField.parseFrom(data, cursor, end - 196)) {
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
        if (!priorSecuritySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += PriorSecuritySymbolField.BYTE_LENGTH;
        if (!primaryListingMarketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryListingMarketParticipantIdField.BYTE_LENGTH;
        if (!primaryListingMarketPreviousClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryListingMarketPreviousClosingPriceField.BYTE_LENGTH;
        if (!consolidatedClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedClosingPriceField.BYTE_LENGTH;
        if (!roundLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += RoundLotSizeField.BYTE_LENGTH;
        if (!minimumPriceIncrementIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumPriceIncrementIndicatorField.BYTE_LENGTH;
        if (!luldTier.parse(data, cursor)) {
            return false;
        }
        cursor += LuldTierField.BYTE_LENGTH;
        if (!luldLeverageRatio.parse(data, cursor)) {
            return false;
        }
        cursor += LuldLeverageRatioField.BYTE_LENGTH;
        if (!test.parse(data, cursor)) {
            return false;
        }
        cursor += TestField.BYTE_LENGTH;
        if (!ipo.parse(data, cursor)) {
            return false;
        }
        cursor += IpoField.BYTE_LENGTH;
        if (!financialStatusIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialStatusIndicatorField.BYTE_LENGTH;
        if (!shortSaleRestrictionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSaleRestrictionIndicatorField.BYTE_LENGTH;
        if (!haltReason.parse(data, cursor)) {
            return false;
        }
        cursor += HaltReasonField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!reserved.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedField2.BYTE_LENGTH;
        if (!secondReserved.parse(data, cursor)) {
            return false;
        }
        cursor += SecondReservedField.BYTE_LENGTH;
        return reserved128.parse(data, cursor);
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
        cursor = priorSecuritySymbol.encode(data, cursor);
        cursor = primaryListingMarketParticipantId.encode(data, cursor);
        cursor = primaryListingMarketPreviousClosingPrice.encode(data, cursor);
        cursor = consolidatedClosingPrice.encode(data, cursor);
        cursor = roundLotSize.encode(data, cursor);
        cursor = minimumPriceIncrementIndicator.encode(data, cursor);
        cursor = luldTier.encode(data, cursor);
        cursor = luldLeverageRatio.encode(data, cursor);
        cursor = test.encode(data, cursor);
        cursor = ipo.encode(data, cursor);
        cursor = financialStatusIndicator.encode(data, cursor);
        cursor = shortSaleRestrictionIndicator.encode(data, cursor);
        cursor = haltReason.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
        cursor = secondReserved.encode(data, cursor);
        cursor = reserved128.encode(data, cursor);
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
            case "PriorSecuritySymbol" -> Optional.of(priorSecuritySymbol);
            case "PrimaryListingMarketParticipantId" -> Optional.of(primaryListingMarketParticipantId);
            case "PrimaryListingMarketPreviousClosingPrice" -> Optional.of(primaryListingMarketPreviousClosingPrice);
            case "ConsolidatedClosingPrice" -> Optional.of(consolidatedClosingPrice);
            case "RoundLotSize" -> Optional.of(roundLotSize);
            case "MinimumPriceIncrementIndicator" -> Optional.of(minimumPriceIncrementIndicator);
            case "LuldTier" -> Optional.of(luldTier);
            case "LuldLeverageRatio" -> Optional.of(luldLeverageRatio);
            case "Test" -> Optional.of(test);
            case "Ipo" -> Optional.of(ipo);
            case "FinancialStatusIndicator" -> Optional.of(financialStatusIndicator);
            case "ShortSaleRestrictionIndicator" -> Optional.of(shortSaleRestrictionIndicator);
            case "HaltReason" -> Optional.of(haltReason);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "Reserved" -> Optional.of(reserved);
            case "SecondReserved" -> Optional.of(secondReserved);
            case "Reserved128" -> Optional.of(reserved128);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SymbolReferenceDataMessage message)) {
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
        if (!(other instanceof SymbolReferenceDataMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
