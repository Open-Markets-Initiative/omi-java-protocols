package omi.iex.iexequities.deep.iextp.v1_06.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexequities.deep.iextp.v1_06.fields.AuctionBookClearingPriceField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.AuctionTypeField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.CollarReferencePriceField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.ExtensionNumberField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.ImbalanceSharesField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.ImbalanceSideField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.IndicativeClearingPriceField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.LowerAuctionCollarField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.PairedSharesField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.ReferencePriceField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.ScheduledAuctionTimeField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.SymbolField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.TimestampField;
import omi.iex.iexequities.deep.iextp.v1_06.fields.UpperAuctionCollarField;
import omi.iex.iexequities.deep.iextp.v1_06.types.Field;
import omi.iex.iexequities.deep.iextp.v1_06.types.Message;
import omi.iex.iexequities.deep.iextp.v1_06.types.PrintOptions;

/**
 * Represents the AuctionInformationMessage message from the Deep protocol.
 *
 * <p>Broadcasts an Auction Information Message every one second between the Lock-in Time and the auction match for Opening and Closing Auctions, and during the Display Only Period for IPO, Halt, and Volatility Auctions.</p>
 */
public final class AuctionInformationMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'A';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 79;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Information Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Auction type identifier
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Time stamp of the system event
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Security identifier
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Number of shares paired at the Reference Price using orders on the Auction Book
     */
    private final PairedSharesField pairedShares = new PairedSharesField();

    /**
     * Clearing price at or within the Reference Price Range using orders on the Auction Book
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * Clearing price using Eligible Auction Orders
     */
    private final IndicativeClearingPriceField indicativeClearingPrice = new IndicativeClearingPriceField();

    /**
     * Number of unpaired shares at the Reference Price using orders on the Auction Book
     */
    private final ImbalanceSharesField imbalanceShares = new ImbalanceSharesField();

    /**
     * Side of the unpaired shares at the Reference Price using orders on the Auction Book
     */
    private final ImbalanceSideField imbalanceSide = new ImbalanceSideField();

    /**
     * Number of extensions an auction received
     */
    private final ExtensionNumberField extensionNumber = new ExtensionNumberField();

    /**
     * Projected time of the auction match
     */
    private final ScheduledAuctionTimeField scheduledAuctionTime = new ScheduledAuctionTimeField();

    /**
     * Clearing price using orders on the Auction Book
     */
    private final AuctionBookClearingPriceField auctionBookClearingPrice = new AuctionBookClearingPriceField();

    /**
     * Reference priced used for the auction collar, if any
     */
    private final CollarReferencePriceField collarReferencePrice = new CollarReferencePriceField();

    /**
     * Lower threshold price of the auction collar, if any
     */
    private final LowerAuctionCollarField lowerAuctionCollar = new LowerAuctionCollarField();

    /**
     * Upper threshold price of the auction collar, if any
     */
    private final UpperAuctionCollarField upperAuctionCollar = new UpperAuctionCollarField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(auctionType, timestampField, symbol, pairedShares, referencePrice, indicativeClearingPrice, imbalanceShares, imbalanceSide, extensionNumber, scheduledAuctionTime, auctionBookClearingPrice, collarReferencePrice, lowerAuctionCollar, upperAuctionCollar);

    private byte[] buffer;

    private int bufferOffset;

    private boolean decoded;

    /**
     * Auction type identifier
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Time stamp of the system event
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Security identifier
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Number of shares paired at the Reference Price using orders on the Auction Book
     *
     * @return the PairedShares field
     */
    public PairedSharesField pairedShares() {
        return pairedShares;
    }

    /**
     * Clearing price at or within the Reference Price Range using orders on the Auction Book
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * Clearing price using Eligible Auction Orders
     *
     * @return the IndicativeClearingPrice field
     */
    public IndicativeClearingPriceField indicativeClearingPrice() {
        return indicativeClearingPrice;
    }

    /**
     * Number of unpaired shares at the Reference Price using orders on the Auction Book
     *
     * @return the ImbalanceShares field
     */
    public ImbalanceSharesField imbalanceShares() {
        return imbalanceShares;
    }

    /**
     * Side of the unpaired shares at the Reference Price using orders on the Auction Book
     *
     * @return the ImbalanceSide field
     */
    public ImbalanceSideField imbalanceSide() {
        return imbalanceSide;
    }

    /**
     * Number of extensions an auction received
     *
     * @return the ExtensionNumber field
     */
    public ExtensionNumberField extensionNumber() {
        return extensionNumber;
    }

    /**
     * Projected time of the auction match
     *
     * @return the ScheduledAuctionTime field
     */
    public ScheduledAuctionTimeField scheduledAuctionTime() {
        return scheduledAuctionTime;
    }

    /**
     * Clearing price using orders on the Auction Book
     *
     * @return the AuctionBookClearingPrice field
     */
    public AuctionBookClearingPriceField auctionBookClearingPrice() {
        return auctionBookClearingPrice;
    }

    /**
     * Reference priced used for the auction collar, if any
     *
     * @return the CollarReferencePrice field
     */
    public CollarReferencePriceField collarReferencePrice() {
        return collarReferencePrice;
    }

    /**
     * Lower threshold price of the auction collar, if any
     *
     * @return the LowerAuctionCollar field
     */
    public LowerAuctionCollarField lowerAuctionCollar() {
        return lowerAuctionCollar;
    }

    /**
     * Upper threshold price of the auction collar, if any
     *
     * @return the UpperAuctionCollar field
     */
    public UpperAuctionCollarField upperAuctionCollar() {
        return upperAuctionCollar;
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
     * <p>Padding carries no value: decode advances over it and encode writes it as zero. Use this to check that a received message's padding is zero where the specification requires it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(timestampField.value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        clear();
        this.buffer = data;
        this.bufferOffset = offset;

        if (offset < 0 || offset + BYTE_LENGTH > data.length) {
            return false;
        }

        int cursor = offset;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!pairedShares.parse(data, cursor)) {
            return false;
        }
        cursor += PairedSharesField.BYTE_LENGTH;
        if (!referencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceField.BYTE_LENGTH;
        if (!indicativeClearingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativeClearingPriceField.BYTE_LENGTH;
        if (!imbalanceShares.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceSharesField.BYTE_LENGTH;
        if (!imbalanceSide.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceSideField.BYTE_LENGTH;
        if (!extensionNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ExtensionNumberField.BYTE_LENGTH;
        if (!scheduledAuctionTime.parse(data, cursor)) {
            return false;
        }
        cursor += ScheduledAuctionTimeField.BYTE_LENGTH;
        if (!auctionBookClearingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionBookClearingPriceField.BYTE_LENGTH;
        if (!collarReferencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += CollarReferencePriceField.BYTE_LENGTH;
        if (!lowerAuctionCollar.parse(data, cursor)) {
            return false;
        }
        cursor += LowerAuctionCollarField.BYTE_LENGTH;
        if (!upperAuctionCollar.parse(data, cursor)) {
            return false;
        }
        cursor += UpperAuctionCollarField.BYTE_LENGTH;

        this.decoded = true;
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = auctionType.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = pairedShares.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = indicativeClearingPrice.encode(data, cursor);
        cursor = imbalanceShares.encode(data, cursor);
        cursor = imbalanceSide.encode(data, cursor);
        cursor = extensionNumber.encode(data, cursor);
        cursor = scheduledAuctionTime.encode(data, cursor);
        cursor = auctionBookClearingPrice.encode(data, cursor);
        cursor = collarReferencePrice.encode(data, cursor);
        cursor = lowerAuctionCollar.encode(data, cursor);
        cursor = upperAuctionCollar.encode(data, cursor);
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
        this.bufferOffset = 0;
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
        int end = Math.min(buffer.length, bufferOffset + BYTE_LENGTH);
        int start = Math.min(Math.max(bufferOffset, 0), end);
        return Optional.of(Arrays.copyOfRange(buffer, start, end));
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
            case "AuctionType" -> Optional.of(auctionType);
            case "Timestamp" -> Optional.of(timestampField);
            case "Symbol" -> Optional.of(symbol);
            case "PairedShares" -> Optional.of(pairedShares);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "IndicativeClearingPrice" -> Optional.of(indicativeClearingPrice);
            case "ImbalanceShares" -> Optional.of(imbalanceShares);
            case "ImbalanceSide" -> Optional.of(imbalanceSide);
            case "ExtensionNumber" -> Optional.of(extensionNumber);
            case "ScheduledAuctionTime" -> Optional.of(scheduledAuctionTime);
            case "AuctionBookClearingPrice" -> Optional.of(auctionBookClearingPrice);
            case "CollarReferencePrice" -> Optional.of(collarReferencePrice);
            case "LowerAuctionCollar" -> Optional.of(lowerAuctionCollar);
            case "UpperAuctionCollar" -> Optional.of(upperAuctionCollar);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionInformationMessage message)) {
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
        if (!(other instanceof AuctionInformationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
