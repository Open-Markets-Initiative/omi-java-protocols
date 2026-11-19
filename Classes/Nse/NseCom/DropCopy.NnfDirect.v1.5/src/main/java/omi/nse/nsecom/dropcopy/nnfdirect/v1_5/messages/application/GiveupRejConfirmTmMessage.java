package omi.nse.nsecom.dropcopy.nnfdirect.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.BookTypeShortField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.BrokerIdField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.BuySellField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.CaLevelField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.DeletedField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.ExpiryDateField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.FillNumberField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.FillPriceField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.FillVolumeField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.FillerField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.GiveupFlagField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.InitiatedByControlField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.InstrumentNameField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.LastModifiedDateTimeField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.OpenCloseField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.OptionTypeField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.OrderNumberField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.ParticipantField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.ReasonCodeField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.StrikePriceField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.SymbolField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.types.Field;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.types.Message;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.types.PrintOptions;

/**
 * Represents the GiveupRejConfirmTmMessage message from the DropCopy protocol.
 *
 * <p>Rejects a give up</p>
 */
public final class GiveupRejConfirmTmMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 82;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Giveup Rej Confirm Tm Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 66, 1, 81, 1 };

    /**
     * Reason code for the give up packet
     */
    private final ReasonCodeField reasonCode = new ReasonCodeField();

    /**
     * Order number of the order
     */
    private final OrderNumberField orderNumber = new OrderNumberField();

    /**
     * Trade number
     */
    private final FillNumberField fillNumber = new FillNumberField();

    /**
     * Instrument name of the contract
     */
    private final InstrumentNameField instrumentName = new InstrumentNameField();

    /**
     * Symbol of the underlying
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Expiry date of the contract
     */
    private final ExpiryDateField expiryDate = new ExpiryDateField();

    /**
     * Valid strike for an options contract, and -1 for a futures contract
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Option type identifier
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Corporate action level
     */
    private final CaLevelField caLevel = new CaLevelField();

    /**
     * Traded volume
     */
    private final FillVolumeField fillVolume = new FillVolumeField();

    /**
     * Price at which the order traded, to be divided by 100 to get the price in rupees
     */
    private final FillPriceField fillPrice = new FillPriceField();

    /**
     * Trading member Id
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * Filler
     */
    private final FillerField filler = new FillerField();

    /**
     * Whether the order taking part is a buy or a sell
     */
    private final BuySellField buySell = new BuySellField();

    /**
     * Book the order belongs to
     */
    private final BookTypeShortField bookTypeShort = new BookTypeShortField();

    /**
     * Time the order was last modified
     */
    private final LastModifiedDateTimeField lastModifiedDateTime = new LastModifiedDateTimeField();

    /**
     * Whether the give up was initiated by Nse Control
     */
    private final InitiatedByControlField initiatedByControl = new InitiatedByControlField();

    /**
     * Whether the trade opens or closes a position
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Participant's name
     */
    private final ParticipantField participant = new ParticipantField();

    /**
     * Give up flag
     */
    private final GiveupFlagField giveupFlag = new GiveupFlagField();

    /**
     * Whether the give up was deleted
     */
    private final DeletedField deleted = new DeletedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(reasonCode, orderNumber, fillNumber, instrumentName, symbol, expiryDate, strikePrice, optionType, caLevel, fillVolume, fillPrice, brokerId, filler, buySell, bookTypeShort, lastModifiedDateTime, initiatedByControl, openClose, participant, giveupFlag, deleted);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Reason code for the give up packet
     *
     * @return the ReasonCode field
     */
    public ReasonCodeField reasonCode() {
        return reasonCode;
    }

    /**
     * Order number of the order
     *
     * @return the OrderNumber field
     */
    public OrderNumberField orderNumber() {
        return orderNumber;
    }

    /**
     * Trade number
     *
     * @return the FillNumber field
     */
    public FillNumberField fillNumber() {
        return fillNumber;
    }

    /**
     * Instrument name of the contract
     *
     * @return the InstrumentName field
     */
    public InstrumentNameField instrumentName() {
        return instrumentName;
    }

    /**
     * Symbol of the underlying
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Expiry date of the contract
     *
     * @return the ExpiryDate field
     */
    public ExpiryDateField expiryDate() {
        return expiryDate;
    }

    /**
     * Valid strike for an options contract, and -1 for a futures contract
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Option type identifier
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Corporate action level
     *
     * @return the CaLevel field
     */
    public CaLevelField caLevel() {
        return caLevel;
    }

    /**
     * Traded volume
     *
     * @return the FillVolume field
     */
    public FillVolumeField fillVolume() {
        return fillVolume;
    }

    /**
     * Price at which the order traded, to be divided by 100 to get the price in rupees
     *
     * @return the FillPrice field
     */
    public FillPriceField fillPrice() {
        return fillPrice;
    }

    /**
     * Trading member Id
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * Filler
     *
     * @return the Filler field
     */
    public FillerField filler() {
        return filler;
    }

    /**
     * Whether the order taking part is a buy or a sell
     *
     * @return the BuySell field
     */
    public BuySellField buySell() {
        return buySell;
    }

    /**
     * Book the order belongs to
     *
     * @return the BookTypeShort field
     */
    public BookTypeShortField bookTypeShort() {
        return bookTypeShort;
    }

    /**
     * Time the order was last modified
     *
     * @return the LastModifiedDateTime field
     */
    public LastModifiedDateTimeField lastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Whether the give up was initiated by Nse Control
     *
     * @return the InitiatedByControl field
     */
    public InitiatedByControlField initiatedByControl() {
        return initiatedByControl;
    }

    /**
     * Whether the trade opens or closes a position
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Participant's name
     *
     * @return the Participant field
     */
    public ParticipantField participant() {
        return participant;
    }

    /**
     * Give up flag
     *
     * @return the GiveupFlag field
     */
    public GiveupFlagField giveupFlag() {
        return giveupFlag;
    }

    /**
     * Whether the give up was deleted
     *
     * @return the Deleted field
     */
    public DeletedField deleted() {
        return deleted;
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
        if (!reasonCode.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeField.BYTE_LENGTH;
        if (!orderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberField.BYTE_LENGTH;
        if (!fillNumber.parse(data, cursor)) {
            return false;
        }
        cursor += FillNumberField.BYTE_LENGTH;
        if (!instrumentName.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentNameField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!expiryDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDateField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!caLevel.parse(data, cursor)) {
            return false;
        }
        cursor += CaLevelField.BYTE_LENGTH;
        if (!fillVolume.parse(data, cursor)) {
            return false;
        }
        cursor += FillVolumeField.BYTE_LENGTH;
        if (!fillPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FillPriceField.BYTE_LENGTH;
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        if (!filler.parse(data, cursor)) {
            return false;
        }
        cursor += FillerField.BYTE_LENGTH;
        if (!buySell.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellField.BYTE_LENGTH;
        if (!bookTypeShort.parse(data, cursor)) {
            return false;
        }
        cursor += BookTypeShortField.BYTE_LENGTH;
        if (!lastModifiedDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastModifiedDateTimeField.BYTE_LENGTH;
        if (!initiatedByControl.parse(data, cursor)) {
            return false;
        }
        cursor += InitiatedByControlField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!participant.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantField.BYTE_LENGTH;
        if (!giveupFlag.parse(data, cursor)) {
            return false;
        }
        cursor += GiveupFlagField.BYTE_LENGTH;
        if (!deleted.parse(data, cursor)) {
            return false;
        }
        cursor += DeletedField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = reasonCode.encode(data, cursor);
        cursor = orderNumber.encode(data, cursor);
        cursor = fillNumber.encode(data, cursor);
        cursor = instrumentName.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = expiryDate.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = caLevel.encode(data, cursor);
        cursor = fillVolume.encode(data, cursor);
        cursor = fillPrice.encode(data, cursor);
        cursor = brokerId.encode(data, cursor);
        cursor = filler.encode(data, cursor);
        cursor = buySell.encode(data, cursor);
        cursor = bookTypeShort.encode(data, cursor);
        cursor = lastModifiedDateTime.encode(data, cursor);
        cursor = initiatedByControl.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        if (buffer != null && buffer.length >= 67) {
            System.arraycopy(buffer, 66, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = participant.encode(data, cursor);
        cursor = giveupFlag.encode(data, cursor);
        cursor = deleted.encode(data, cursor);
        if (buffer != null && buffer.length >= 82) {
            System.arraycopy(buffer, 81, data, cursor, 1); // padding
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
            case "ReasonCode" -> Optional.of(reasonCode);
            case "OrderNumber" -> Optional.of(orderNumber);
            case "FillNumber" -> Optional.of(fillNumber);
            case "InstrumentName" -> Optional.of(instrumentName);
            case "Symbol" -> Optional.of(symbol);
            case "ExpiryDate" -> Optional.of(expiryDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "OptionType" -> Optional.of(optionType);
            case "CaLevel" -> Optional.of(caLevel);
            case "FillVolume" -> Optional.of(fillVolume);
            case "FillPrice" -> Optional.of(fillPrice);
            case "BrokerId" -> Optional.of(brokerId);
            case "Filler" -> Optional.of(filler);
            case "BuySell" -> Optional.of(buySell);
            case "BookTypeShort" -> Optional.of(bookTypeShort);
            case "LastModifiedDateTime" -> Optional.of(lastModifiedDateTime);
            case "InitiatedByControl" -> Optional.of(initiatedByControl);
            case "OpenClose" -> Optional.of(openClose);
            case "Participant" -> Optional.of(participant);
            case "GiveupFlag" -> Optional.of(giveupFlag);
            case "Deleted" -> Optional.of(deleted);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof GiveupRejConfirmTmMessage message)) {
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
        if (!(other instanceof GiveupRejConfirmTmMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
