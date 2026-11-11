package omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.AppendageLengthField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.CapacityField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.ClordidField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.CrossTypeField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.DisplayField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.InterMarketSweepEligibilityField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.PriceField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.QuantityField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.SideField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.SymbolField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.TimeInForceField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.UserRefNumField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.EnterOrderAppendageEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.EnterOrderAppendageList;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;

/**
 * Represents the EnterOrderMessage message from the Orders protocol.
 *
 * <p>Enter Order Message</p>
 */
public final class EnterOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'O';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 46;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Enter Order Message";

    /**
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Total number of shares. Must be greater than zero and less than 1,000,000.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Stock Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * The price of the order.
     */
    private final PriceField price = new PriceField();

    /**
     * Corresponds to TimeInForce (59) in Nasdaq FIX
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Display
     */
    private final DisplayField display = new DisplayField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * InterMarket Sweep Eligibility
     */
    private final InterMarketSweepEligibilityField interMarketSweepEligibility = new InterMarketSweepEligibilityField();

    /**
     * CrossType
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Customer order identifier. ClOrdID will not be checked for day-uniqueness for each OUCH account.
     */
    private final ClordidField clordid = new ClordidField();

    /**
     * The length of the remaining Optional Appendage field.
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * Enter Order Appendage
     */
    private final EnterOrderAppendageList enterOrderAppendage = new EnterOrderAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(userRefNum, side, quantity, symbol, price, timeInForce, display, capacity, interMarketSweepEligibility, crossType, clordid, appendageLength);

    private byte[] buffer;

    private boolean decoded;

    /**
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Total number of shares. Must be greater than zero and less than 1,000,000.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Stock Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * The price of the order.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Corresponds to TimeInForce (59) in Nasdaq FIX
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Display
     *
     * @return the Display field
     */
    public DisplayField display() {
        return display;
    }

    /**
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * InterMarket Sweep Eligibility
     *
     * @return the InterMarketSweepEligibility field
     */
    public InterMarketSweepEligibilityField interMarketSweepEligibility() {
        return interMarketSweepEligibility;
    }

    /**
     * CrossType
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * Customer order identifier. ClOrdID will not be checked for day-uniqueness for each OUCH account.
     *
     * @return the Clordid field
     */
    public ClordidField clordid() {
        return clordid;
    }

    /**
     * The length of the remaining Optional Appendage field.
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * Enter Order Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the EnterOrderAppendage entries
     */
    public EnterOrderAppendageList enterOrderAppendage() {
        return enterOrderAppendage;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + enterOrderAppendage.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!userRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += UserRefNumField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!display.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!interMarketSweepEligibility.parse(data, cursor)) {
            return false;
        }
        cursor += InterMarketSweepEligibilityField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!clordid.parse(data, cursor)) {
            return false;
        }
        cursor += ClordidField.BYTE_LENGTH;
        if (!appendageLength.parse(data, cursor)) {
            return false;
        }
        cursor += AppendageLengthField.BYTE_LENGTH;
        long enterOrderAppendageBudget = appendageLength.value();
        if (enterOrderAppendageBudget < 0 || enterOrderAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!enterOrderAppendage.parse(data, cursor, cursor + (int) enterOrderAppendageBudget)) {
            return false;
        }
        cursor += enterOrderAppendage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (enterOrderAppendage.byteLength() > 65535) {
            throw new IllegalStateException("enterOrderAppendage holds " + enterOrderAppendage.byteLength() + " bytes, more than its length field can state");
        }
        appendageLength.value((enterOrderAppendage.byteLength()));
        int cursor = offset;
        cursor = userRefNum.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = display.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = interMarketSweepEligibility.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = clordid.encode(data, cursor);
        cursor = appendageLength.encode(data, cursor);
        cursor = enterOrderAppendage.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        enterOrderAppendage.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != appendageLength && !field.isRecognized()) {
                return false;
            }
        }
        return enterOrderAppendage.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != appendageLength && !field.isValid()) {
                return false;
            }
        }
        if (!enterOrderAppendage.isValid()) {
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
        if (!userRefNum.isDecoded()) {
            return Optional.of(userRefNum);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!quantity.isDecoded()) {
            return Optional.of(quantity);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!display.isDecoded()) {
            return Optional.of(display);
        }
        if (!capacity.isDecoded()) {
            return Optional.of(capacity);
        }
        if (!interMarketSweepEligibility.isDecoded()) {
            return Optional.of(interMarketSweepEligibility);
        }
        if (!crossType.isDecoded()) {
            return Optional.of(crossType);
        }
        if (!clordid.isDecoded()) {
            return Optional.of(clordid);
        }
        if (!appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!enterOrderAppendage.isDecoded()) {
            return Optional.of(enterOrderAppendage.failedEntry().flatMap(EnterOrderAppendageEntry::failedAt).orElse(appendageLength));
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
            case "UserRefNum" -> Optional.of(userRefNum);
            case "Side" -> Optional.of(side);
            case "Quantity" -> Optional.of(quantity);
            case "Symbol" -> Optional.of(symbol);
            case "Price" -> Optional.of(price);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "Display" -> Optional.of(display);
            case "Capacity" -> Optional.of(capacity);
            case "InterMarketSweepEligibility" -> Optional.of(interMarketSweepEligibility);
            case "CrossType" -> Optional.of(crossType);
            case "Clordid" -> Optional.of(clordid);
            case "AppendageLength" -> Optional.of(appendageLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EnterOrderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(enterOrderAppendage.diffFields(message.enterOrderAppendage));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            enterOrderAppendage.toFormattedString(builder, options);
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
        enterOrderAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof EnterOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && enterOrderAppendage.equals(message.enterOrderAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, enterOrderAppendage);
    }
}
