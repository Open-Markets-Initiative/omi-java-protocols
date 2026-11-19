package omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.CorporateActionField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.CouponField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.ExpirationDateField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.IdentificationNumberField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.IssueDateField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.IssuedQuantityField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.IssuerField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.NanosecondField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.OptionTypeField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.SegmentField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.StrikePriceField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.SubBookFlagsField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.SymbolDirectoryFlagsField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.SymbolField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.SymbolStatusField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.UnderlyingField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.Field;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.Message;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.PrintOptions;

/**
 * Represents the SymbolDirectoryMessage message from the Replay protocol.
 *
 * <p>Used to disseminate information (e.g. symbol, segment, ISIN, underlying, etc.) on each instrument.</p>
 */
public final class SymbolDirectoryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 87;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Symbol Directory Message";

    /**
     * Nanoseconds offset from the last Time message.
     */
    private final NanosecondField nanosecond = new NanosecondField();

    /**
     * Instrument's symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Status of the instrument. This field will contain a space if the instrument is active.
     */
    private final SymbolStatusField symbolStatus = new SymbolStatusField();

    /**
     * Instrument identification number (e.g. ISIN, CUSIP, etc.)
     */
    private final IdentificationNumberField identificationNumber = new IdentificationNumberField();

    /**
     * Segment the instrument is assigned to.
     */
    private final SegmentField segment = new SegmentField();

    /**
     * Date an instrument expires or matures. This field will contain only spaces if the instrument is not a derivative or fixed income instrument.
     */
    private final ExpirationDateField expirationDate = new ExpirationDateField();

    /**
     * Symbol of the underlying instrument. This field will contain only spaces if the instrument is not a derivative.
     */
    private final UnderlyingField underlying = new UnderlyingField();

    /**
     * Strike price of an option. The price will be zero if the instrument is not an option.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Call or put. This field will contain a space if the instrument is not an option.
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Issuer of the instrument. This field will contain all spaces if the instrument is not an equity or fixed income instrument.
     */
    private final IssuerField issuer = new IssuerField();

    /**
     * Date instrument was issued. This field will contain all spaces if the instrument is not a fixed income instrument.
     */
    private final IssueDateField issueDate = new IssueDateField();

    /**
     * Rate of interest applied to the face value. This is a percentage field (e.g. 0.05 represents 5%). The price will be zero if the instrument is not a fixed income instrument.
     */
    private final CouponField coupon = new CouponField();

    /**
     * Instrument flags of the Symbol Directory message, which the document labels Flags.
     */
    private final SymbolDirectoryFlagsField symbolDirectoryFlags = new SymbolDirectoryFlagsField();

    /**
     * Order books a message relates to, one bit per book. The document labels this field Sub Book, the label it also gives the single valued order book code of the trade and statistics messages; the two are different encodings.
     */
    private final SubBookFlagsField subBookFlags = new SubBookFlagsField();

    /**
     * Pipe separated field. Identifies the type of Corporate Actions applicable on the instrument for the current Trading day.
     */
    private final CorporateActionField corporateAction = new CorporateActionField();

    /**
     * Issued Quantity of the instrument.
     */
    private final IssuedQuantityField issuedQuantity = new IssuedQuantityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanosecond, symbol, symbolStatus, identificationNumber, segment, expirationDate, underlying, strikePrice, optionType, issuer, issueDate, coupon, symbolDirectoryFlags, subBookFlags, corporateAction, issuedQuantity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds offset from the last Time message.
     *
     * @return the Nanosecond field
     */
    public NanosecondField nanosecond() {
        return nanosecond;
    }

    /**
     * Instrument's symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Status of the instrument. This field will contain a space if the instrument is active.
     *
     * @return the SymbolStatus field
     */
    public SymbolStatusField symbolStatus() {
        return symbolStatus;
    }

    /**
     * Instrument identification number (e.g. ISIN, CUSIP, etc.)
     *
     * @return the IdentificationNumber field
     */
    public IdentificationNumberField identificationNumber() {
        return identificationNumber;
    }

    /**
     * Segment the instrument is assigned to.
     *
     * @return the Segment field
     */
    public SegmentField segment() {
        return segment;
    }

    /**
     * Date an instrument expires or matures. This field will contain only spaces if the instrument is not a derivative or fixed income instrument.
     *
     * @return the ExpirationDate field
     */
    public ExpirationDateField expirationDate() {
        return expirationDate;
    }

    /**
     * Symbol of the underlying instrument. This field will contain only spaces if the instrument is not a derivative.
     *
     * @return the Underlying field
     */
    public UnderlyingField underlying() {
        return underlying;
    }

    /**
     * Strike price of an option. The price will be zero if the instrument is not an option.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Call or put. This field will contain a space if the instrument is not an option.
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Issuer of the instrument. This field will contain all spaces if the instrument is not an equity or fixed income instrument.
     *
     * @return the Issuer field
     */
    public IssuerField issuer() {
        return issuer;
    }

    /**
     * Date instrument was issued. This field will contain all spaces if the instrument is not a fixed income instrument.
     *
     * @return the IssueDate field
     */
    public IssueDateField issueDate() {
        return issueDate;
    }

    /**
     * Rate of interest applied to the face value. This is a percentage field (e.g. 0.05 represents 5%). The price will be zero if the instrument is not a fixed income instrument.
     *
     * @return the Coupon field
     */
    public CouponField coupon() {
        return coupon;
    }

    /**
     * Instrument flags of the Symbol Directory message, which the document labels Flags.
     *
     * @return the SymbolDirectoryFlags field
     */
    public SymbolDirectoryFlagsField symbolDirectoryFlags() {
        return symbolDirectoryFlags;
    }

    /**
     * Order books a message relates to, one bit per book. The document labels this field Sub Book, the label it also gives the single valued order book code of the trade and statistics messages; the two are different encodings.
     *
     * @return the SubBookFlags field
     */
    public SubBookFlagsField subBookFlags() {
        return subBookFlags;
    }

    /**
     * Pipe separated field. Identifies the type of Corporate Actions applicable on the instrument for the current Trading day.
     *
     * @return the CorporateAction field
     */
    public CorporateActionField corporateAction() {
        return corporateAction;
    }

    /**
     * Issued Quantity of the instrument.
     *
     * @return the IssuedQuantity field
     */
    public IssuedQuantityField issuedQuantity() {
        return issuedQuantity;
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
        if (!nanosecond.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!symbolStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolStatusField.BYTE_LENGTH;
        if (!identificationNumber.parse(data, cursor)) {
            return false;
        }
        cursor += IdentificationNumberField.BYTE_LENGTH;
        if (!segment.parse(data, cursor)) {
            return false;
        }
        cursor += SegmentField.BYTE_LENGTH;
        if (!expirationDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationDateField.BYTE_LENGTH;
        if (!underlying.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!issuer.parse(data, cursor)) {
            return false;
        }
        cursor += IssuerField.BYTE_LENGTH;
        if (!issueDate.parse(data, cursor)) {
            return false;
        }
        cursor += IssueDateField.BYTE_LENGTH;
        if (!coupon.parse(data, cursor)) {
            return false;
        }
        cursor += CouponField.BYTE_LENGTH;
        if (!symbolDirectoryFlags.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolDirectoryFlagsField.BYTE_LENGTH;
        if (!subBookFlags.parse(data, cursor)) {
            return false;
        }
        cursor += SubBookFlagsField.BYTE_LENGTH;
        if (!corporateAction.parse(data, cursor)) {
            return false;
        }
        cursor += CorporateActionField.BYTE_LENGTH;
        return issuedQuantity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanosecond.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = symbolStatus.encode(data, cursor);
        cursor = identificationNumber.encode(data, cursor);
        cursor = segment.encode(data, cursor);
        cursor = expirationDate.encode(data, cursor);
        cursor = underlying.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = issuer.encode(data, cursor);
        cursor = issueDate.encode(data, cursor);
        cursor = coupon.encode(data, cursor);
        cursor = symbolDirectoryFlags.encode(data, cursor);
        cursor = subBookFlags.encode(data, cursor);
        cursor = corporateAction.encode(data, cursor);
        cursor = issuedQuantity.encode(data, cursor);
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
            case "Nanosecond" -> Optional.of(nanosecond);
            case "Symbol" -> Optional.of(symbol);
            case "SymbolStatus" -> Optional.of(symbolStatus);
            case "IdentificationNumber" -> Optional.of(identificationNumber);
            case "Segment" -> Optional.of(segment);
            case "ExpirationDate" -> Optional.of(expirationDate);
            case "Underlying" -> Optional.of(underlying);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "OptionType" -> Optional.of(optionType);
            case "Issuer" -> Optional.of(issuer);
            case "IssueDate" -> Optional.of(issueDate);
            case "Coupon" -> Optional.of(coupon);
            case "SymbolDirectoryFlags" -> Optional.of(symbolDirectoryFlags);
            case "SubBookFlags" -> Optional.of(subBookFlags);
            case "CorporateAction" -> Optional.of(corporateAction);
            case "IssuedQuantity" -> Optional.of(issuedQuantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SymbolDirectoryMessage message)) {
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
        if (!(other instanceof SymbolDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
