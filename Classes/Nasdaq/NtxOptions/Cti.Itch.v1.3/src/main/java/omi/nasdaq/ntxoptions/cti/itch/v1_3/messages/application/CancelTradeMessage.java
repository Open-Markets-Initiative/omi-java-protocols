package omi.nasdaq.ntxoptions.cti.itch.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.CorrectionNumberField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.CrossIdField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.ExpirationField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.NanosecondsField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.OptionIdField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.OptionKindField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.SecondsField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.SecuritySymbolField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.SendTypeField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.StrikePriceField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.TradeIdField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.TradeSideField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.fields.UnderlyingSymbolField;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.types.Field;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.types.Message;
import omi.nasdaq.ntxoptions.cti.itch.v1_3.types.PrintOptions;

/**
 * Represents the CancelTradeMessage message from the Cti protocol.
 *
 * <p>By default CTI sends trade cancels using this message; alternatively a firm and connection block can be configured to send extended cancels with all the trade information using the Trade message with Transaction Type Z. 50 bytes.</p>
 */
public final class CancelTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'V';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 49;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cancel Trade Message";

    /**
     * Seconds portion of timestamp: whole seconds after midnight US Eastern Time (0 to 86400)
     */
    private final SecondsField seconds = new SecondsField();

    /**
     * Nanoseconds portion of timestamp (0 to 999999999)
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * S = Send (original transmission), P = Possible duplicate (unsolicited retransmission)
     */
    private final SendTypeField sendType = new SendTypeField();

    /**
     * Option id assigned by exchange daily
     */
    private final OptionIdField optionId = new OptionIdField();

    /**
     * Underlying stock symbol (left justified, space filled)
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Option root symbol
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Expiration date of the option packed into 2 bytes: Bits 0-6 = Year (0-99), Bits 7-10 = Month (1-12), Bits 11-15 = Day (1-31); bit 15 is the least significant bit
     */
    private final ExpirationField expiration = new ExpirationField();

    /**
     * Strike price of the option: fixed point with 4 decimal digits
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * C = Call, P = Put
     */
    private final OptionKindField optionKind = new OptionKindField();

    /**
     * Clearing trade Id. Coupled with correction number and trade side uniquely identifies a clearing trade for a given day.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Trade correction number. 0 for new trades. Used to identify version of the trade being corrected; increments by 1 for each subsequent correction.
     */
    private final CorrectionNumberField correctionNumber = new CorrectionNumberField();

    /**
     * Trade Group Id. Ties together all clearing trades of a given atomic transaction in the matching engine. 0 if cross id is not available.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * B = Buy, S = Sell
     */
    private final TradeSideField tradeSide = new TradeSideField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seconds, nanoseconds, sendType, optionId, underlyingSymbol, securitySymbol, expiration, strikePrice, optionKind, tradeId, correctionNumber, crossId, tradeSide);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Seconds portion of timestamp: whole seconds after midnight US Eastern Time (0 to 86400)
     *
     * @return the Seconds field
     */
    public SecondsField seconds() {
        return seconds;
    }

    /**
     * Nanoseconds portion of timestamp (0 to 999999999)
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * S = Send (original transmission), P = Possible duplicate (unsolicited retransmission)
     *
     * @return the SendType field
     */
    public SendTypeField sendType() {
        return sendType;
    }

    /**
     * Option id assigned by exchange daily
     *
     * @return the OptionId field
     */
    public OptionIdField optionId() {
        return optionId;
    }

    /**
     * Underlying stock symbol (left justified, space filled)
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Option root symbol
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * Expiration date of the option packed into 2 bytes: Bits 0-6 = Year (0-99), Bits 7-10 = Month (1-12), Bits 11-15 = Day (1-31); bit 15 is the least significant bit
     *
     * @return the Expiration field
     */
    public ExpirationField expiration() {
        return expiration;
    }

    /**
     * Strike price of the option: fixed point with 4 decimal digits
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * C = Call, P = Put
     *
     * @return the OptionKind field
     */
    public OptionKindField optionKind() {
        return optionKind;
    }

    /**
     * Clearing trade Id. Coupled with correction number and trade side uniquely identifies a clearing trade for a given day.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Trade correction number. 0 for new trades. Used to identify version of the trade being corrected; increments by 1 for each subsequent correction.
     *
     * @return the CorrectionNumber field
     */
    public CorrectionNumberField correctionNumber() {
        return correctionNumber;
    }

    /**
     * Trade Group Id. Ties together all clearing trades of a given atomic transaction in the matching engine. 0 if cross id is not available.
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * B = Buy, S = Sell
     *
     * @return the TradeSide field
     */
    public TradeSideField tradeSide() {
        return tradeSide;
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
        if (!seconds.parse(data, cursor)) {
            return false;
        }
        cursor += SecondsField.BYTE_LENGTH;
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!sendType.parse(data, cursor)) {
            return false;
        }
        cursor += SendTypeField.BYTE_LENGTH;
        if (!optionId.parse(data, cursor)) {
            return false;
        }
        cursor += OptionIdField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!expiration.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!optionKind.parse(data, cursor)) {
            return false;
        }
        cursor += OptionKindField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!correctionNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectionNumberField.BYTE_LENGTH;
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        return tradeSide.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = seconds.encode(data, cursor);
        cursor = nanoseconds.encode(data, cursor);
        cursor = sendType.encode(data, cursor);
        cursor = optionId.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = expiration.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = optionKind.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = correctionNumber.encode(data, cursor);
        cursor = crossId.encode(data, cursor);
        cursor = tradeSide.encode(data, cursor);
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
            case "Seconds" -> Optional.of(seconds);
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "SendType" -> Optional.of(sendType);
            case "OptionId" -> Optional.of(optionId);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "Expiration" -> Optional.of(expiration);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "OptionKind" -> Optional.of(optionKind);
            case "TradeId" -> Optional.of(tradeId);
            case "CorrectionNumber" -> Optional.of(correctionNumber);
            case "CrossId" -> Optional.of(crossId);
            case "TradeSide" -> Optional.of(tradeSide);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CancelTradeMessage message)) {
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
        if (!(other instanceof CancelTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
