package omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.AccountTypeField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.AdditionalClientMemoField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.AdditionalFirmField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ClientAccountNumberField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ClientMemoField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.CmtaBrokerField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.GiveUpFirmField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.OpenCloseField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ReferenceTradeNumberField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ReferenceTransactionIdField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.SubTraderIdField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.VolumeField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.Field;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.Message;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.PrintOptions;

/**
 * Represents the NewGiveUp message from the SolaTradeReporting protocol.
 *
 * <p>The guide states this message as having the same structure as message type 42, whose fields are written out here. The guide heads this message 106 bytes, while the fields it states measure 122 including the 28 byte header.</p>
 */
public final class NewGiveUp implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 94;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Give Up";

    /**
     * For Message Type 42 – New Allocation Identifies the Unique Transaction ID of the parent Trade under which the Allocation is to be created. For Message Type 43 – Modify Allocation Identifies the Unique Transaction ID of the original Allocation which is to be modified. For Message Type 52 – New Give-Up Identifies the Unique Transaction ID of the parent Trade under which the Give-Up is to be created. For Message Type 53 – Modify Give-Up Identifies the Unique Transaction ID of the original Give- Up which is to be modified.
     */
    private final ReferenceTransactionIdField referenceTransactionId = new ReferenceTransactionIdField();

    /**
     * Identification of the Trade received from the Message Type 30 - Trade This refers to the Trade Number under which a New Allocation (or Give-Up) is to be created or under which an existing Allocation (or Give-Up) is to be modified.
     */
    private final ReferenceTradeNumberField referenceTradeNumber = new ReferenceTradeNumberField();

    /**
     * Contains the Give-Up Firm Applies only for Message Type 52 (New Give-Up) or Message Type 53 (Modify Give-Up), otherwise leave blank. The guide states no data type for this field; read as alphabetic, as every other firm field of this width is.
     */
    private final GiveUpFirmField giveUpFirm = new GiveUpFirmField();

    /**
     * Volume of the trade Right justified, Zero padded
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Account type of the Executing Broker of the trade 6: Public Customer 7: Broker Dealer 8: Market Maker T: Professional Customer V: Floor Broker Customer W: Broker Dealer cleared as Customer X: Away Market Maker Y: Floor Broker Dealer Z: Floor Market Maker FLEX Symbology: Symbol is prefixed by one of the following: ‘1’ (American FLEX Option, Physical-Settled) ‘2’ (European FLEX Option, Physical-Settled) ‘3’ (American FLEX Option, Cash-Settled) ‘4’ (European FLEX Option, Cash-Settled)
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * Position of the trade O: Open C: Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Left justified, right blank filled Used with Client Order ID and Client Memo for Order Identification
     */
    private final ClientAccountNumberField clientAccountNumber = new ClientAccountNumberField();

    /**
     * For Allocation (40) and Allocation Cancel (41) messages, the 'Sub-trader ID' field contains the Market Maker OCC sub-account. For Trade (30) and Trade Cancel (31) messages, the ‘Sub-trader ID’ field contains the last 2 digits of the Trader ID.
     */
    private final SubTraderIdField subTraderId = new SubTraderIdField();

    /**
     * Contains the numeric portion of the Firm ID who will receive the trade in a CMTA
     */
    private final CmtaBrokerField cmtaBroker = new CmtaBrokerField();

    /**
     * Left justified, right blank filled Used with Client Account Number and Client Order ID for Order Identification
     */
    private final ClientMemoField clientMemo = new ClientMemoField();

    /**
     * Contains the numeric portion of the BOX Participant ID (FirmID) to which this message is to be drop-copied In the [0001,9999] range Right justified, zero padded
     */
    private final AdditionalFirmField additionalFirm = new AdditionalFirmField();

    /**
     * Left justified, right blank filled Free text field
     */
    private final AdditionalClientMemoField additionalClientMemo = new AdditionalClientMemoField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(referenceTransactionId, referenceTradeNumber, giveUpFirm, volume, accountType, openClose, clientAccountNumber, subTraderId, cmtaBroker, clientMemo, additionalFirm, additionalClientMemo);

    private byte[] buffer;

    private boolean decoded;

    /**
     * For Message Type 42 – New Allocation Identifies the Unique Transaction ID of the parent Trade under which the Allocation is to be created. For Message Type 43 – Modify Allocation Identifies the Unique Transaction ID of the original Allocation which is to be modified. For Message Type 52 – New Give-Up Identifies the Unique Transaction ID of the parent Trade under which the Give-Up is to be created. For Message Type 53 – Modify Give-Up Identifies the Unique Transaction ID of the original Give- Up which is to be modified.
     *
     * @return the ReferenceTransactionId field
     */
    public ReferenceTransactionIdField referenceTransactionId() {
        return referenceTransactionId;
    }

    /**
     * Identification of the Trade received from the Message Type 30 - Trade This refers to the Trade Number under which a New Allocation (or Give-Up) is to be created or under which an existing Allocation (or Give-Up) is to be modified.
     *
     * @return the ReferenceTradeNumber field
     */
    public ReferenceTradeNumberField referenceTradeNumber() {
        return referenceTradeNumber;
    }

    /**
     * Contains the Give-Up Firm Applies only for Message Type 52 (New Give-Up) or Message Type 53 (Modify Give-Up), otherwise leave blank. The guide states no data type for this field; read as alphabetic, as every other firm field of this width is.
     *
     * @return the GiveUpFirm field
     */
    public GiveUpFirmField giveUpFirm() {
        return giveUpFirm;
    }

    /**
     * Volume of the trade Right justified, Zero padded
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Account type of the Executing Broker of the trade 6: Public Customer 7: Broker Dealer 8: Market Maker T: Professional Customer V: Floor Broker Customer W: Broker Dealer cleared as Customer X: Away Market Maker Y: Floor Broker Dealer Z: Floor Market Maker FLEX Symbology: Symbol is prefixed by one of the following: ‘1’ (American FLEX Option, Physical-Settled) ‘2’ (European FLEX Option, Physical-Settled) ‘3’ (American FLEX Option, Cash-Settled) ‘4’ (European FLEX Option, Cash-Settled)
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * Position of the trade O: Open C: Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Left justified, right blank filled Used with Client Order ID and Client Memo for Order Identification
     *
     * @return the ClientAccountNumber field
     */
    public ClientAccountNumberField clientAccountNumber() {
        return clientAccountNumber;
    }

    /**
     * For Allocation (40) and Allocation Cancel (41) messages, the 'Sub-trader ID' field contains the Market Maker OCC sub-account. For Trade (30) and Trade Cancel (31) messages, the ‘Sub-trader ID’ field contains the last 2 digits of the Trader ID.
     *
     * @return the SubTraderId field
     */
    public SubTraderIdField subTraderId() {
        return subTraderId;
    }

    /**
     * Contains the numeric portion of the Firm ID who will receive the trade in a CMTA
     *
     * @return the CmtaBroker field
     */
    public CmtaBrokerField cmtaBroker() {
        return cmtaBroker;
    }

    /**
     * Left justified, right blank filled Used with Client Account Number and Client Order ID for Order Identification
     *
     * @return the ClientMemo field
     */
    public ClientMemoField clientMemo() {
        return clientMemo;
    }

    /**
     * Contains the numeric portion of the BOX Participant ID (FirmID) to which this message is to be drop-copied In the [0001,9999] range Right justified, zero padded
     *
     * @return the AdditionalFirm field
     */
    public AdditionalFirmField additionalFirm() {
        return additionalFirm;
    }

    /**
     * Left justified, right blank filled Free text field
     *
     * @return the AdditionalClientMemo field
     */
    public AdditionalClientMemoField additionalClientMemo() {
        return additionalClientMemo;
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
        if (!referenceTransactionId.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceTransactionIdField.BYTE_LENGTH;
        if (!referenceTradeNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceTradeNumberField.BYTE_LENGTH;
        if (!giveUpFirm.parse(data, cursor)) {
            return false;
        }
        cursor += GiveUpFirmField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!clientAccountNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ClientAccountNumberField.BYTE_LENGTH;
        if (!subTraderId.parse(data, cursor)) {
            return false;
        }
        cursor += SubTraderIdField.BYTE_LENGTH;
        if (!cmtaBroker.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaBrokerField.BYTE_LENGTH;
        if (!clientMemo.parse(data, cursor)) {
            return false;
        }
        cursor += ClientMemoField.BYTE_LENGTH;
        if (!additionalFirm.parse(data, cursor)) {
            return false;
        }
        cursor += AdditionalFirmField.BYTE_LENGTH;
        return additionalClientMemo.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = referenceTransactionId.encode(data, cursor);
        cursor = referenceTradeNumber.encode(data, cursor);
        cursor = giveUpFirm.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = clientAccountNumber.encode(data, cursor);
        cursor = subTraderId.encode(data, cursor);
        cursor = cmtaBroker.encode(data, cursor);
        cursor = clientMemo.encode(data, cursor);
        cursor = additionalFirm.encode(data, cursor);
        cursor = additionalClientMemo.encode(data, cursor);
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
            case "ReferenceTransactionId" -> Optional.of(referenceTransactionId);
            case "ReferenceTradeNumber" -> Optional.of(referenceTradeNumber);
            case "GiveUpFirm" -> Optional.of(giveUpFirm);
            case "Volume" -> Optional.of(volume);
            case "AccountType" -> Optional.of(accountType);
            case "OpenClose" -> Optional.of(openClose);
            case "ClientAccountNumber" -> Optional.of(clientAccountNumber);
            case "SubTraderId" -> Optional.of(subTraderId);
            case "CmtaBroker" -> Optional.of(cmtaBroker);
            case "ClientMemo" -> Optional.of(clientMemo);
            case "AdditionalFirm" -> Optional.of(additionalFirm);
            case "AdditionalClientMemo" -> Optional.of(additionalClientMemo);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewGiveUp message)) {
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
        if (!(other instanceof NewGiveUp message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
