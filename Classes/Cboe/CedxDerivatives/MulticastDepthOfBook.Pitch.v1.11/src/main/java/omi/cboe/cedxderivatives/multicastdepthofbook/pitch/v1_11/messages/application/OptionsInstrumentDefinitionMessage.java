package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.CallPutField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.ContractSizeField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.ExpirationDateField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.ListingStateField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.PriceIncrementField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.ProductCodeLongField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.StrikePriceField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.SymbolField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.TimeOffsetField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.types.Field;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.types.Message;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.types.PrintOptions;

/**
 * Represents the OptionsInstrumentDefinitionMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>Options Instrument Definition</p>
 */
public final class OptionsInstrumentDefinitionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Options Instrument Definition Message";

    /**
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Cboe Symbol for underlying Product
     */
    private final ProductCodeLongField productCodeLong = new ProductCodeLongField();

    /**
     * Call/Put
     */
    private final CallPutField callPut = new CallPutField();

    /**
     * Expiration Date of Instrument
     */
    private final ExpirationDateField expirationDate = new ExpirationDateField();

    /**
     * Strike Price of Instrument
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Contract size of Instrument
     */
    private final ContractSizeField contractSize = new ContractSizeField();

    /**
     * Listing State
     */
    private final ListingStateField listingState = new ListingStateField();

    /**
     * Minimum Price Increment
     */
    private final PriceIncrementField priceIncrement = new PriceIncrementField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, symbol, productCodeLong, callPut, expirationDate, strikePrice, contractSize, listingState, priceIncrement);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Cboe Symbol for underlying Product
     *
     * @return the ProductCodeLong field
     */
    public ProductCodeLongField productCodeLong() {
        return productCodeLong;
    }

    /**
     * Call/Put
     *
     * @return the CallPut field
     */
    public CallPutField callPut() {
        return callPut;
    }

    /**
     * Expiration Date of Instrument
     *
     * @return the ExpirationDate field
     */
    public ExpirationDateField expirationDate() {
        return expirationDate;
    }

    /**
     * Strike Price of Instrument
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Contract size of Instrument
     *
     * @return the ContractSize field
     */
    public ContractSizeField contractSize() {
        return contractSize;
    }

    /**
     * Listing State
     *
     * @return the ListingState field
     */
    public ListingStateField listingState() {
        return listingState;
    }

    /**
     * Minimum Price Increment
     *
     * @return the PriceIncrement field
     */
    public PriceIncrementField priceIncrement() {
        return priceIncrement;
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
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!productCodeLong.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeLongField.BYTE_LENGTH;
        if (!callPut.parse(data, cursor)) {
            return false;
        }
        cursor += CallPutField.BYTE_LENGTH;
        if (!expirationDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationDateField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!contractSize.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSizeField.BYTE_LENGTH;
        if (!listingState.parse(data, cursor)) {
            return false;
        }
        cursor += ListingStateField.BYTE_LENGTH;
        return priceIncrement.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = productCodeLong.encode(data, cursor);
        cursor = callPut.encode(data, cursor);
        cursor = expirationDate.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        cursor = listingState.encode(data, cursor);
        cursor = priceIncrement.encode(data, cursor);
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
            case "Symbol" -> Optional.of(symbol);
            case "ProductCodeLong" -> Optional.of(productCodeLong);
            case "CallPut" -> Optional.of(callPut);
            case "ExpirationDate" -> Optional.of(expirationDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "ContractSize" -> Optional.of(contractSize);
            case "ListingState" -> Optional.of(listingState);
            case "PriceIncrement" -> Optional.of(priceIncrement);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionsInstrumentDefinitionMessage message)) {
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
        if (!(other instanceof OptionsInstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
