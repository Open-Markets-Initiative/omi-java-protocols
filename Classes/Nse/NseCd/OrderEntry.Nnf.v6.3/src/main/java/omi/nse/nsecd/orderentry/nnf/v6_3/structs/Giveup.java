package omi.nse.nsecd.orderentry.nnf.v6_3.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BookTypeShortField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BrokerIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BuySellField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.CaLevelField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.DeletedField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ExpiryDateField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillPriceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillVolumeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillerField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.GiveupFlagField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.InitiatedByControlField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.InstrumentNameField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.LastModifiedDateTimeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OpenCloseField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OptionTypeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OrderNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ParticipantField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.StrikePriceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.SymbolField;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.GroupEntry;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * The Giveup record a message holds.
 *
 * <p>GIVEUP</p>
 */
public final class Giveup implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 79;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "Giveup";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 64, 1 };

    /**
     * This field must be sent as blank for the order entry request
     */
    private final OrderNumberField orderNumber = new OrderNumberField();

    /**
     * This field should contain the trade number of the trade to be modified
     */
    private final FillNumberField fillNumber = new FillNumberField();

    /**
     * This field contains the type of the instrument
     */
    private final InstrumentNameField instrumentName = new InstrumentNameField();

    /**
     * This field contains the Symbol of the security
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * This field contains the last date of trading before any corporate action
     */
    private final ExpiryDateField expiryDate = new ExpiryDateField();

    /**
     * This field will contain a valid strike for Options Contract and for Futures Contract it will be -1
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * This field contains the OptionType identifier
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * This field should contain the Corporate Action Level
     */
    private final CaLevelField caLevel = new CaLevelField();

    /**
     * This field contains the quantity of security traded
     */
    private final FillVolumeField fillVolume = new FillVolumeField();

    /**
     * This field should contain the price at which the trade took place
     */
    private final FillPriceField fillPrice = new FillPriceField();

    /**
     * This field should contain the trading member ID
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * Reserved
     */
    private final FillerField filler = new FillerField();

    /**
     * This field should contain one of the following values to specify whether the order is a buy or sell order. ‘1’ denotes Buy order ‘2’ denotes Sell order Note: - Must follow same rules as mentioned in Order Modification section in Currency NN
     */
    private final BuySellField buySell = new BuySellField();

    /**
     * This field should contain the type of order
     */
    private final BookTypeShortField bookTypeShort = new BookTypeShortField();

    /**
     * LastModifiedDateTime
     */
    private final LastModifiedDateTimeField lastModifiedDateTime = new LastModifiedDateTimeField();

    /**
     * InitiatedByControl
     */
    private final InitiatedByControlField initiatedByControl = new InitiatedByControlField();

    /**
     * Open/Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * No NA
     */
    private final ParticipantField participant = new ParticipantField();

    /**
     * This field should contain Give up flag
     */
    private final GiveupFlagField giveupFlag = new GiveupFlagField();

    /**
     * Host should send N is this field
     */
    private final DeletedField deleted = new DeletedField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderNumber, fillNumber, instrumentName, symbol, expiryDate, strikePrice, optionType, caLevel, fillVolume, fillPrice, brokerId, filler, buySell, bookTypeShort, lastModifiedDateTime, initiatedByControl, openClose, participant, giveupFlag, deleted);

    private byte[] buffer;

    private boolean decoded;

    /**
     * This field must be sent as blank for the order entry request
     *
     * @return the OrderNumber field
     */
    public OrderNumberField orderNumber() {
        return orderNumber;
    }

    /**
     * This field should contain the trade number of the trade to be modified
     *
     * @return the FillNumber field
     */
    public FillNumberField fillNumber() {
        return fillNumber;
    }

    /**
     * This field contains the type of the instrument
     *
     * @return the InstrumentName field
     */
    public InstrumentNameField instrumentName() {
        return instrumentName;
    }

    /**
     * This field contains the Symbol of the security
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * This field contains the last date of trading before any corporate action
     *
     * @return the ExpiryDate field
     */
    public ExpiryDateField expiryDate() {
        return expiryDate;
    }

    /**
     * This field will contain a valid strike for Options Contract and for Futures Contract it will be -1
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * This field contains the OptionType identifier
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * This field should contain the Corporate Action Level
     *
     * @return the CaLevel field
     */
    public CaLevelField caLevel() {
        return caLevel;
    }

    /**
     * This field contains the quantity of security traded
     *
     * @return the FillVolume field
     */
    public FillVolumeField fillVolume() {
        return fillVolume;
    }

    /**
     * This field should contain the price at which the trade took place
     *
     * @return the FillPrice field
     */
    public FillPriceField fillPrice() {
        return fillPrice;
    }

    /**
     * This field should contain the trading member ID
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * Reserved
     *
     * @return the Filler field
     */
    public FillerField filler() {
        return filler;
    }

    /**
     * This field should contain one of the following values to specify whether the order is a buy or sell order. ‘1’ denotes Buy order ‘2’ denotes Sell order Note: - Must follow same rules as mentioned in Order Modification section in Currency NN
     *
     * @return the BuySell field
     */
    public BuySellField buySell() {
        return buySell;
    }

    /**
     * This field should contain the type of order
     *
     * @return the BookTypeShort field
     */
    public BookTypeShortField bookTypeShort() {
        return bookTypeShort;
    }

    /**
     * LastModifiedDateTime
     *
     * @return the LastModifiedDateTime field
     */
    public LastModifiedDateTimeField lastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * InitiatedByControl
     *
     * @return the InitiatedByControl field
     */
    public InitiatedByControlField initiatedByControl() {
        return initiatedByControl;
    }

    /**
     * Open/Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * No NA
     *
     * @return the Participant field
     */
    public ParticipantField participant() {
        return participant;
    }

    /**
     * This field should contain Give up flag
     *
     * @return the GiveupFlag field
     */
    public GiveupFlagField giveupFlag() {
        return giveupFlag;
    }

    /**
     * Host should send N is this field
     *
     * @return the Deleted field
     */
    public DeletedField deleted() {
        return deleted;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
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
        return deleted.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
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
        if (buffer != null && buffer.length >= 65) {
            System.arraycopy(buffer, 64, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = participant.encode(data, cursor);
        cursor = giveupFlag.encode(data, cursor);
        cursor = deleted.encode(data, cursor);
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof Giveup message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof Giveup message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
