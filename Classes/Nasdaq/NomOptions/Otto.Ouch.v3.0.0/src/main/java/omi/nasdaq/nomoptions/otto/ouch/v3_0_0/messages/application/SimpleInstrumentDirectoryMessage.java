package omi.nasdaq.nomoptions.otto.ouch.v3_0_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.ClosingOnlyField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.ClosingTypeField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.ContractSizeField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.ExpirDayField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.ExpirMonField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.ExpirYearField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.InstrumentIdField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.MpvField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.OptionTypeField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.ProductIdField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.ProductNameField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.SecuritySymbolField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.StrikePriceField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.TimestampField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.fields.TradableField;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.types.Message;
import omi.nasdaq.nomoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * Represents the SimpleInstrumentDirectoryMessage message from the Otto protocol.
 *
 * <p>At the start of each trading day and during intra-day market state changes, the system disseminates directory messages for all symbols trading on the system.</p>
 */
public final class SimpleInstrumentDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'o';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 69;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Simple Instrument Directory Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 53, 16 };

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Product (Underlying) ID, as specified by Option Directory notifications. Must be populated if Scope=P and UnderlyingSymbol not populated.
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * Product (Underlying) name
     */
    private final ProductNameField productName = new ProductNameField();

    /**
     * Instrument ID, as specified by Option Directory notifications
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Expiration Year (less 2000)
     */
    private final ExpirYearField expirYear = new ExpirYearField();

    /**
     * Expiration Month (1-12)
     */
    private final ExpirMonField expirMon = new ExpirMonField();

    /**
     * Expiration Day (1-31)
     */
    private final ExpirDayField expirDay = new ExpirDayField();

    /**
     * Strike Price
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * C=Call, P=Put
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * N=Normal Hours, L=Late Hours, W=WCO Early Closing at 12:00 Noon, E=Extended Close (extended trading hours edition)
     */
    private final ClosingTypeField closingType = new ClosingTypeField();

    /**
     * Y=Tradable, N=Not Tradable
     */
    private final TradableField tradable = new TradableField();

    /**
     * N=Unrestricted, Y=Option is Closing Position Only. Only MM origin orders can have open position in the series
     */
    private final ClosingOnlyField closingOnly = new ClosingOnlyField();

    /**
     * Underlying Deliverable size
     */
    private final ContractSizeField contractSize = new ContractSizeField();

    /**
     * E=Penny Everywhere, S=Scaled, P=Penny Pilot
     */
    private final MpvField mpv = new MpvField();

    /**
     * Industry assigned security symbol for the option contract
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, productId, productName, instrumentId, expirYear, expirMon, expirDay, strikePrice, optionType, closingType, tradable, closingOnly, contractSize, mpv, securitySymbol);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Product (Underlying) ID, as specified by Option Directory notifications. Must be populated if Scope=P and UnderlyingSymbol not populated.
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
    }

    /**
     * Product (Underlying) name
     *
     * @return the ProductName field
     */
    public ProductNameField productName() {
        return productName;
    }

    /**
     * Instrument ID, as specified by Option Directory notifications
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Expiration Year (less 2000)
     *
     * @return the ExpirYear field
     */
    public ExpirYearField expirYear() {
        return expirYear;
    }

    /**
     * Expiration Month (1-12)
     *
     * @return the ExpirMon field
     */
    public ExpirMonField expirMon() {
        return expirMon;
    }

    /**
     * Expiration Day (1-31)
     *
     * @return the ExpirDay field
     */
    public ExpirDayField expirDay() {
        return expirDay;
    }

    /**
     * Strike Price
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * C=Call, P=Put
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * N=Normal Hours, L=Late Hours, W=WCO Early Closing at 12:00 Noon, E=Extended Close (extended trading hours edition)
     *
     * @return the ClosingType field
     */
    public ClosingTypeField closingType() {
        return closingType;
    }

    /**
     * Y=Tradable, N=Not Tradable
     *
     * @return the Tradable field
     */
    public TradableField tradable() {
        return tradable;
    }

    /**
     * N=Unrestricted, Y=Option is Closing Position Only. Only MM origin orders can have open position in the series
     *
     * @return the ClosingOnly field
     */
    public ClosingOnlyField closingOnly() {
        return closingOnly;
    }

    /**
     * Underlying Deliverable size
     *
     * @return the ContractSize field
     */
    public ContractSizeField contractSize() {
        return contractSize;
    }

    /**
     * E=Penny Everywhere, S=Scaled, P=Penny Pilot
     *
     * @return the Mpv field
     */
    public MpvField mpv() {
        return mpv;
    }

    /**
     * Industry assigned security symbol for the option contract
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!productName.parse(data, cursor)) {
            return false;
        }
        cursor += ProductNameField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!expirYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirYearField.BYTE_LENGTH;
        if (!expirMon.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirMonField.BYTE_LENGTH;
        if (!expirDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirDayField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!closingType.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingTypeField.BYTE_LENGTH;
        if (!tradable.parse(data, cursor)) {
            return false;
        }
        cursor += TradableField.BYTE_LENGTH;
        if (!closingOnly.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingOnlyField.BYTE_LENGTH;
        if (!contractSize.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSizeField.BYTE_LENGTH;
        if (!mpv.parse(data, cursor)) {
            return false;
        }
        cursor += MpvField.BYTE_LENGTH;
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = productName.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = expirYear.encode(data, cursor);
        cursor = expirMon.encode(data, cursor);
        cursor = expirDay.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = closingType.encode(data, cursor);
        cursor = tradable.encode(data, cursor);
        cursor = closingOnly.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        cursor = mpv.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        if (buffer != null && buffer.length >= 69) {
            System.arraycopy(buffer, 53, data, cursor, 16); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 16, (byte) 0); // padding
        }
        cursor += 16;
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
            case "Timestamp" -> Optional.of(timestampField);
            case "ProductId" -> Optional.of(productId);
            case "ProductName" -> Optional.of(productName);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "ExpirYear" -> Optional.of(expirYear);
            case "ExpirMon" -> Optional.of(expirMon);
            case "ExpirDay" -> Optional.of(expirDay);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "OptionType" -> Optional.of(optionType);
            case "ClosingType" -> Optional.of(closingType);
            case "Tradable" -> Optional.of(tradable);
            case "ClosingOnly" -> Optional.of(closingOnly);
            case "ContractSize" -> Optional.of(contractSize);
            case "Mpv" -> Optional.of(mpv);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SimpleInstrumentDirectoryMessage message)) {
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
        if (!(other instanceof SimpleInstrumentDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
