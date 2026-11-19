package omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.CallPutIndicatorField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.FeedSymbolField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.FuturesExpirationField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.FuturesProductField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.FuturesSymbolField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.OptionsExpirationField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.OptionsOnFuturesNameField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.StrikePriceField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.SymbolConditionField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.TimeOffsetField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.types.Field;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.types.Message;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.types.PrintOptions;

/**
 * Represents the OofSymbolMappingMessage message from the OofMulticastTop protocol.
 *
 * <p>An OOF Symbol Mapping message is used to map the 6 character multicast feed symbol field and options on futures name to the option contract and future underlying. The option contract is comprised of the strike price, put/call flag, options expiration date, and future underlying. The future underlying is comprised of the futures product and futures expiration date, which map to a futures symbol. This message can be sent either as a sequenced message or as an unsequenced message. It is sent as a sequenced message at system startup upon the beginning of a trading session or if an instrument is created or modified during a trading day. A new sequenced message may also be sent for a symbol that does not visibly change any attribute. A continuous loop of unsequenced symbol mapping messages (sequence = 0) is sent throughout the day at variable rates as bandwidth allows. The Time Offset field should be ignored on unsequenced messages. OOF Symbol Mapping messages are included in a spin response and will be disseminated before Complex Instrument Definition Expanded messages.</p>
 */
public final class OofSymbolMappingMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 58;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Oof Symbol Mapping Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Option symbol. Six character, base 62.
     */
    private final FeedSymbolField feedSymbol = new FeedSymbolField();

    /**
     * Underlying futures contract product name.
     */
    private final FuturesProductField futuresProduct = new FuturesProductField();

    /**
     * Underlying futures contract expiration date.
     */
    private final FuturesExpirationField futuresExpiration = new FuturesExpirationField();

    /**
     * Underlying Cboe-formatted futures contract symbol. Six character, base 62.
     */
    private final FuturesSymbolField futuresSymbol = new FuturesSymbolField();

    /**
     * Option contract strike price.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * C = Call P = Put
     */
    private final CallPutIndicatorField callPutIndicator = new CallPutIndicatorField();

    /**
     * Options contract expiration date.
     */
    private final OptionsExpirationField optionsExpiration = new OptionsExpirationField();

    /**
     * Textual symbol description comprising options product symbol, underlying futures expiration, put/call and the option strike price with two digits to the right of the decimal point. For example "UX1A/X4 C2000" represents the 20.00 strike Call option on the UX1A product with underlying futures expiration X4".
     */
    private final OptionsOnFuturesNameField optionsOnFuturesName = new OptionsOnFuturesNameField();

    /**
     * N = Normal C = Closing Only
     */
    private final SymbolConditionField symbolCondition = new SymbolConditionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, feedSymbol, futuresProduct, futuresExpiration, futuresSymbol, strikePrice, callPutIndicator, optionsExpiration, optionsOnFuturesName, symbolCondition);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Option symbol. Six character, base 62.
     *
     * @return the FeedSymbol field
     */
    public FeedSymbolField feedSymbol() {
        return feedSymbol;
    }

    /**
     * Underlying futures contract product name.
     *
     * @return the FuturesProduct field
     */
    public FuturesProductField futuresProduct() {
        return futuresProduct;
    }

    /**
     * Underlying futures contract expiration date.
     *
     * @return the FuturesExpiration field
     */
    public FuturesExpirationField futuresExpiration() {
        return futuresExpiration;
    }

    /**
     * Underlying Cboe-formatted futures contract symbol. Six character, base 62.
     *
     * @return the FuturesSymbol field
     */
    public FuturesSymbolField futuresSymbol() {
        return futuresSymbol;
    }

    /**
     * Option contract strike price.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * C = Call P = Put
     *
     * @return the CallPutIndicator field
     */
    public CallPutIndicatorField callPutIndicator() {
        return callPutIndicator;
    }

    /**
     * Options contract expiration date.
     *
     * @return the OptionsExpiration field
     */
    public OptionsExpirationField optionsExpiration() {
        return optionsExpiration;
    }

    /**
     * Textual symbol description comprising options product symbol, underlying futures expiration, put/call and the option strike price with two digits to the right of the decimal point. For example "UX1A/X4 C2000" represents the 20.00 strike Call option on the UX1A product with underlying futures expiration X4".
     *
     * @return the OptionsOnFuturesName field
     */
    public OptionsOnFuturesNameField optionsOnFuturesName() {
        return optionsOnFuturesName;
    }

    /**
     * N = Normal C = Closing Only
     *
     * @return the SymbolCondition field
     */
    public SymbolConditionField symbolCondition() {
        return symbolCondition;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!feedSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += FeedSymbolField.BYTE_LENGTH;
        if (!futuresProduct.parse(data, cursor)) {
            return false;
        }
        cursor += FuturesProductField.BYTE_LENGTH;
        if (!futuresExpiration.parse(data, cursor)) {
            return false;
        }
        cursor += FuturesExpirationField.BYTE_LENGTH;
        if (!futuresSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += FuturesSymbolField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!callPutIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CallPutIndicatorField.BYTE_LENGTH;
        if (!optionsExpiration.parse(data, cursor)) {
            return false;
        }
        cursor += OptionsExpirationField.BYTE_LENGTH;
        if (!optionsOnFuturesName.parse(data, cursor)) {
            return false;
        }
        cursor += OptionsOnFuturesNameField.BYTE_LENGTH;
        return symbolCondition.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = feedSymbol.encode(data, cursor);
        cursor = futuresProduct.encode(data, cursor);
        cursor = futuresExpiration.encode(data, cursor);
        cursor = futuresSymbol.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = callPutIndicator.encode(data, cursor);
        cursor = optionsExpiration.encode(data, cursor);
        cursor = optionsOnFuturesName.encode(data, cursor);
        cursor = symbolCondition.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "FeedSymbol" -> Optional.of(feedSymbol);
            case "FuturesProduct" -> Optional.of(futuresProduct);
            case "FuturesExpiration" -> Optional.of(futuresExpiration);
            case "FuturesSymbol" -> Optional.of(futuresSymbol);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "CallPutIndicator" -> Optional.of(callPutIndicator);
            case "OptionsExpiration" -> Optional.of(optionsExpiration);
            case "OptionsOnFuturesName" -> Optional.of(optionsOnFuturesName);
            case "SymbolCondition" -> Optional.of(symbolCondition);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OofSymbolMappingMessage message)) {
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
        if (!(other instanceof OofSymbolMappingMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
