package omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.AskPriceQuote;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.BidPriceQuote;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.StrikePriceInstrumentFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.AskSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.BidSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.CallPutCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ContractMonthCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryDayField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryYearField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.InstrumentStatusMarkerField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the FutureOptionsQuoteMessage message from the SolaMulticast protocol.
 *
 * <p>Future Options Quote message</p>
 */
public final class FutureOptionsQuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 47;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Future Options Quote Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 46, 1 };

    /**
     * Exchange on which the quote occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Option base symbol (symbol of the underlying)
     */
    private final RootSymbolField rootSymbol = new RootSymbolField();

    /**
     * Option month code
     */
    private final ContractMonthCodeField contractMonthCode = new ContractMonthCodeField();

    /**
     * Last two digits of the option expiry year
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Expiry day of the option
     */
    private final ExpiryDayField expiryDay = new ExpiryDayField();

    /**
     * C = Call, P = Put
     */
    private final CallPutCodeField callPutCode = new CallPutCodeField();

    /**
     * Number of option contracts represented by the Bid Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Number of option contracts represented by the Ask Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Indicates instrument status
     */
    private final InstrumentStatusMarkerField instrumentStatusMarker = new InstrumentStatusMarkerField();

    /**
     * Branch
     */
    private final StrikePriceInstrumentFractionPair strikePriceInstrumentFractionPair = new StrikePriceInstrumentFractionPair();

    /**
     * Bid price for the option series
     */
    private final BidPriceQuote bidPriceQuote = new BidPriceQuote();

    /**
     * Ask price for the option series
     */
    private final AskPriceQuote askPriceQuote = new AskPriceQuote();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbol, contractMonthCode, expiryYear, expiryDay, callPutCode, bidSize, askSize, instrumentStatusMarker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the quote occurred Q = Montreal
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Option base symbol (symbol of the underlying)
     *
     * @return the RootSymbol field
     */
    public RootSymbolField rootSymbol() {
        return rootSymbol;
    }

    /**
     * Option month code
     *
     * @return the ContractMonthCode field
     */
    public ContractMonthCodeField contractMonthCode() {
        return contractMonthCode;
    }

    /**
     * Last two digits of the option expiry year
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Expiry day of the option
     *
     * @return the ExpiryDay field
     */
    public ExpiryDayField expiryDay() {
        return expiryDay;
    }

    /**
     * C = Call, P = Put
     *
     * @return the CallPutCode field
     */
    public CallPutCodeField callPutCode() {
        return callPutCode;
    }

    /**
     * Number of option contracts represented by the Bid Price. If size is greater than 99999, the 5th character becomes an exponent
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Number of option contracts represented by the Ask Price. If size is greater than 99999, the 5th character becomes an exponent
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * Indicates instrument status
     *
     * @return the InstrumentStatusMarker field
     */
    public InstrumentStatusMarkerField instrumentStatusMarker() {
        return instrumentStatusMarker;
    }

    /**
     * Branch
     *
     * @return the StrikePriceInstrumentFractionPair record
     */
    public StrikePriceInstrumentFractionPair strikePriceInstrumentFractionPair() {
        return strikePriceInstrumentFractionPair;
    }

    /**
     * Bid price for the option series
     *
     * @return the BidPriceQuote record
     */
    public BidPriceQuote bidPriceQuote() {
        return bidPriceQuote;
    }

    /**
     * Ask price for the option series
     *
     * @return the AskPriceQuote record
     */
    public AskPriceQuote askPriceQuote() {
        return askPriceQuote;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!rootSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += RootSymbolField.BYTE_LENGTH;
        if (!contractMonthCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMonthCodeField.BYTE_LENGTH;
        if (!expiryYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryYearField.BYTE_LENGTH;
        if (!expiryDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDayField.BYTE_LENGTH;
        if (!callPutCode.parse(data, cursor)) {
            return false;
        }
        cursor += CallPutCodeField.BYTE_LENGTH;
        if (!strikePriceInstrumentFractionPair.parseFrom(data, cursor, end - 26)) {
            return false;
        }
        cursor += strikePriceInstrumentFractionPair.byteLength();
        if (!bidPriceQuote.parseFrom(data, cursor, end - 19)) {
            return false;
        }
        cursor += bidPriceQuote.byteLength();
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPriceQuote.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += askPriceQuote.byteLength();
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!instrumentStatusMarker.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentStatusMarkerField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbol.encode(data, cursor);
        cursor = contractMonthCode.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = callPutCode.encode(data, cursor);
        cursor = strikePriceInstrumentFractionPair.encode(data, cursor);
        cursor = bidPriceQuote.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPriceQuote.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = instrumentStatusMarker.encode(data, cursor);
        if (buffer != null && buffer.length >= 47) {
            System.arraycopy(buffer, 46, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
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
        strikePriceInstrumentFractionPair.clear();
        bidPriceQuote.clear();
        askPriceQuote.clear();
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
        if (!strikePriceInstrumentFractionPair.isRecognized()) {
            return false;
        }
        if (!bidPriceQuote.isRecognized()) {
            return false;
        }
        return askPriceQuote.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!strikePriceInstrumentFractionPair.isValid()) {
            return false;
        }
        if (!bidPriceQuote.isValid()) {
            return false;
        }
        if (!askPriceQuote.isValid()) {
            return false;
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "RootSymbol" -> Optional.of(rootSymbol);
            case "ContractMonthCode" -> Optional.of(contractMonthCode);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "ExpiryDay" -> Optional.of(expiryDay);
            case "CallPutCode" -> Optional.of(callPutCode);
            case "BidSize" -> Optional.of(bidSize);
            case "AskSize" -> Optional.of(askSize);
            case "InstrumentStatusMarker" -> Optional.of(instrumentStatusMarker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FutureOptionsQuoteMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(strikePriceInstrumentFractionPair.diffFields(message.strikePriceInstrumentFractionPair));
        changed.addAll(bidPriceQuote.diffFields(message.bidPriceQuote));
        changed.addAll(askPriceQuote.diffFields(message.askPriceQuote));
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
            builder.append(", ");
            strikePriceInstrumentFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            bidPriceQuote.toFormattedString(builder, options);
            builder.append(", ");
            askPriceQuote.toFormattedString(builder, options);
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
        strikePriceInstrumentFractionPair.toFormattedString(builder, nested);
        bidPriceQuote.toFormattedString(builder, nested);
        askPriceQuote.toFormattedString(builder, nested);
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
        if (!(other instanceof FutureOptionsQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && strikePriceInstrumentFractionPair.equals(message.strikePriceInstrumentFractionPair) && bidPriceQuote.equals(message.bidPriceQuote) && askPriceQuote.equals(message.askPriceQuote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, strikePriceInstrumentFractionPair, bidPriceQuote, askPriceQuote);
    }
}
