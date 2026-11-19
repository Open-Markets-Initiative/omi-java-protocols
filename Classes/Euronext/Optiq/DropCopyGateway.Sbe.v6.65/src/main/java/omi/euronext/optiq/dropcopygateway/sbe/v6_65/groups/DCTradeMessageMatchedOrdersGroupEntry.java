package omi.euronext.optiq.dropcopygateway.sbe.v6_65.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.AccountTypeInternalOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.BookInOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.ClearingAccountField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.ClearingFirmIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.ClearingInstructionField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.ClientIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.ClientOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.CrossOrderIndicatorOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.FirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.FreeTextField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.LogicalAccessIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.LpRoleOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.OePartitionIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.OpenCloseField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.OrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.OrderPxField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.OrderSideField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.OrderTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.OriginalInvestorIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.TechnicalOriginField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.TimeInForceField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.TradeQualifierOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.fields.TraderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.types.GroupEntry;
import omi.euronext.optiq.dropcopygateway.sbe.v6_65.types.PrintOptions;

/**
 * One entry of the DCTradeMessageMatchedOrdersGroup repeating group.
 *
 * <p>MatchedOrders</p>
 */
public final class DCTradeMessageMatchedOrdersGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 140;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 140;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "DCTradeMessageMatchedOrdersGroup";

    /**
     * orderID
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * orderSide
     */
    private final OrderSideField orderSide = new OrderSideField();

    /**
     * orderType
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * timeInForce
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * orderPx
     */
    private final OrderPxField orderPx = new OrderPxField();

    /**
     * clientID
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * technicalOrigin
     */
    private final TechnicalOriginField technicalOrigin = new TechnicalOriginField();

    /**
     * OpenClose_set bit set
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * oEPartitionID
     */
    private final OePartitionIdOptionalField oePartitionIdOptional = new OePartitionIdOptionalField();

    /**
     * logicalAccessID
     */
    private final LogicalAccessIdOptionalField logicalAccessIdOptional = new LogicalAccessIdOptionalField();

    /**
     * bookIn
     */
    private final BookInOptionalField bookInOptional = new BookInOptionalField();

    /**
     * TradeQualifier_set bit set
     */
    private final TradeQualifierOptionalField tradeQualifierOptional = new TradeQualifierOptionalField();

    /**
     * accountTypeInternal
     */
    private final AccountTypeInternalOptionalField accountTypeInternalOptional = new AccountTypeInternalOptionalField();

    /**
     * lPRole
     */
    private final LpRoleOptionalField lpRoleOptional = new LpRoleOptionalField();

    /**
     * clearingAccount
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * freeText
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * clearingFirmID
     */
    private final ClearingFirmIdOptionalField clearingFirmIdOptional = new ClearingFirmIdOptionalField();

    /**
     * traderID
     */
    private final TraderIdField traderId = new TraderIdField();

    /**
     * originalInvestorID
     */
    private final OriginalInvestorIdField originalInvestorId = new OriginalInvestorIdField();

    /**
     * crossOrderIndicator
     */
    private final CrossOrderIndicatorOptionalField crossOrderIndicatorOptional = new CrossOrderIndicatorOptionalField();

    /**
     * clearingInstruction
     */
    private final ClearingInstructionField clearingInstruction = new ClearingInstructionField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderId, orderSide, orderType, timeInForce, orderPx, clientId, technicalOrigin, openClose, clientOrderId, firmId, oePartitionIdOptional, logicalAccessIdOptional, bookInOptional, tradeQualifierOptional, accountTypeInternalOptional, lpRoleOptional, clearingAccount, freeText, clearingFirmIdOptional, traderId, originalInvestorId, crossOrderIndicatorOptional, clearingInstruction);

    private byte[] buffer;

    private boolean decoded;

    /**
     * orderID
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * orderSide
     *
     * @return the OrderSide field
     */
    public OrderSideField orderSide() {
        return orderSide;
    }

    /**
     * orderType
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * timeInForce
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * orderPx
     *
     * @return the OrderPx field
     */
    public OrderPxField orderPx() {
        return orderPx;
    }

    /**
     * clientID
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
    }

    /**
     * technicalOrigin
     *
     * @return the TechnicalOrigin field
     */
    public TechnicalOriginField technicalOrigin() {
        return technicalOrigin;
    }

    /**
     * OpenClose_set bit set
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * clientOrderID
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * firmID
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * oEPartitionID
     *
     * @return the OePartitionIdOptional field
     */
    public OePartitionIdOptionalField oePartitionIdOptional() {
        return oePartitionIdOptional;
    }

    /**
     * logicalAccessID
     *
     * @return the LogicalAccessIdOptional field
     */
    public LogicalAccessIdOptionalField logicalAccessIdOptional() {
        return logicalAccessIdOptional;
    }

    /**
     * bookIn
     *
     * @return the BookInOptional field
     */
    public BookInOptionalField bookInOptional() {
        return bookInOptional;
    }

    /**
     * TradeQualifier_set bit set
     *
     * @return the TradeQualifierOptional field
     */
    public TradeQualifierOptionalField tradeQualifierOptional() {
        return tradeQualifierOptional;
    }

    /**
     * accountTypeInternal
     *
     * @return the AccountTypeInternalOptional field
     */
    public AccountTypeInternalOptionalField accountTypeInternalOptional() {
        return accountTypeInternalOptional;
    }

    /**
     * lPRole
     *
     * @return the LpRoleOptional field
     */
    public LpRoleOptionalField lpRoleOptional() {
        return lpRoleOptional;
    }

    /**
     * clearingAccount
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * freeText
     *
     * @return the FreeText field
     */
    public FreeTextField freeText() {
        return freeText;
    }

    /**
     * clearingFirmID
     *
     * @return the ClearingFirmIdOptional field
     */
    public ClearingFirmIdOptionalField clearingFirmIdOptional() {
        return clearingFirmIdOptional;
    }

    /**
     * traderID
     *
     * @return the TraderId field
     */
    public TraderIdField traderId() {
        return traderId;
    }

    /**
     * originalInvestorID
     *
     * @return the OriginalInvestorId field
     */
    public OriginalInvestorIdField originalInvestorId() {
        return originalInvestorId;
    }

    /**
     * crossOrderIndicator
     *
     * @return the CrossOrderIndicatorOptional field
     */
    public CrossOrderIndicatorOptionalField crossOrderIndicatorOptional() {
        return crossOrderIndicatorOptional;
    }

    /**
     * clearingInstruction
     *
     * @return the ClearingInstruction field
     */
    public ClearingInstructionField clearingInstruction() {
        return clearingInstruction;
    }

    private int wireBlock = ROOT_BYTE_LENGTH;

    private byte[] blockTrailer = new byte[0];

    /**
     * Sets the width the wire gives this entry's fixed part, as the list holding it states.
     *
     * @param wireBlock the width in bytes
     */
    public void wireBlock(int wireBlock) {
        this.wireBlock = wireBlock;
    }

    /**
     * Returns the bytes of this entry's known fields that lie wholly inside its block.
     *
     * @return the width in bytes; a field past it is absent
     */
    public int knownBytes() {
        if (wireBlock >= 140) {
            return 140;
        }
        if (wireBlock >= 138) {
            return 138;
        }
        if (wireBlock >= 137) {
            return 137;
        }
        if (wireBlock >= 121) {
            return 121;
        }
        if (wireBlock >= 105) {
            return 105;
        }
        if (wireBlock >= 97) {
            return 97;
        }
        if (wireBlock >= 79) {
            return 79;
        }
        if (wireBlock >= 63) {
            return 63;
        }
        if (wireBlock >= 62) {
            return 62;
        }
        if (wireBlock >= 61) {
            return 61;
        }
        if (wireBlock >= 60) {
            return 60;
        }
        if (wireBlock >= 52) {
            return 52;
        }
        if (wireBlock >= 48) {
            return 48;
        }
        if (wireBlock >= 46) {
            return 46;
        }
        if (wireBlock >= 38) {
            return 38;
        }
        if (wireBlock >= 30) {
            return 30;
        }
        if (wireBlock >= 28) {
            return 28;
        }
        if (wireBlock >= 27) {
            return 27;
        }
        if (wireBlock >= 19) {
            return 19;
        }
        if (wireBlock >= 11) {
            return 11;
        }
        if (wireBlock >= 10) {
            return 10;
        }
        if (wireBlock >= 9) {
            return 9;
        }
        if (wireBlock >= 8) {
            return 8;
        }
        return 0;
    }

    /**
     * Returns what this entry's block held past the fields this class knows.
     *
     * @return a copy of those bytes, empty when the block held no more
     */
    public byte[] blockTrailer() {
        return blockTrailer.clone();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH - ROOT_BYTE_LENGTH + wireBlock;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        return parseBlock(data, offset, end, ROOT_BYTE_LENGTH);
    }

    /**
     * Decodes this entry given the width the wire states for its fixed part.
     *
     * @param data   the buffer to decode from
     * @param offset the index of this entry's first byte
     * @param end    the index just past the last byte this entry may read
     * @param block  the width of the fixed part
     * @return true when every field inside the block, and what follows it, decoded
     */
    public boolean parseBlock(byte[] data, int offset, int end, int block) {
        clear();
        this.wireBlock = block;
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH - ROOT_BYTE_LENGTH + wireBlock) {
            return false;
        }

        int cursor = offset;
        int known = knownBytes();
        if (known >= 8) {
            if (!orderId.parse(data, cursor)) {
                return false;
            }
            cursor += OrderIdField.BYTE_LENGTH;
        }
        if (known >= 9) {
            if (!orderSide.parse(data, cursor)) {
                return false;
            }
            cursor += OrderSideField.BYTE_LENGTH;
        }
        if (known >= 10) {
            if (!orderType.parse(data, cursor)) {
                return false;
            }
            cursor += OrderTypeField.BYTE_LENGTH;
        }
        if (known >= 11) {
            if (!timeInForce.parse(data, cursor)) {
                return false;
            }
            cursor += TimeInForceField.BYTE_LENGTH;
        }
        if (known >= 19) {
            if (!orderPx.parse(data, cursor)) {
                return false;
            }
            cursor += OrderPxField.BYTE_LENGTH;
        }
        if (known >= 27) {
            if (!clientId.parse(data, cursor)) {
                return false;
            }
            cursor += ClientIdField.BYTE_LENGTH;
        }
        if (known >= 28) {
            if (!technicalOrigin.parse(data, cursor)) {
                return false;
            }
            cursor += TechnicalOriginField.BYTE_LENGTH;
        }
        if (known >= 30) {
            if (!openClose.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseField.BYTE_LENGTH;
        }
        if (known >= 38) {
            if (!clientOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += ClientOrderIdField.BYTE_LENGTH;
        }
        if (known >= 46) {
            if (!firmId.parse(data, cursor)) {
                return false;
            }
            cursor += FirmIdField.BYTE_LENGTH;
        }
        if (known >= 48) {
            if (!oePartitionIdOptional.parse(data, cursor)) {
                return false;
            }
            cursor += OePartitionIdOptionalField.BYTE_LENGTH;
        }
        if (known >= 52) {
            if (!logicalAccessIdOptional.parse(data, cursor)) {
                return false;
            }
            cursor += LogicalAccessIdOptionalField.BYTE_LENGTH;
        }
        if (known >= 60) {
            if (!bookInOptional.parse(data, cursor)) {
                return false;
            }
            cursor += BookInOptionalField.BYTE_LENGTH;
        }
        if (known >= 61) {
            if (!tradeQualifierOptional.parse(data, cursor)) {
                return false;
            }
            cursor += TradeQualifierOptionalField.BYTE_LENGTH;
        }
        if (known >= 62) {
            if (!accountTypeInternalOptional.parse(data, cursor)) {
                return false;
            }
            cursor += AccountTypeInternalOptionalField.BYTE_LENGTH;
        }
        if (known >= 63) {
            if (!lpRoleOptional.parse(data, cursor)) {
                return false;
            }
            cursor += LpRoleOptionalField.BYTE_LENGTH;
        }
        if (known >= 79) {
            if (!clearingAccount.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountField.BYTE_LENGTH;
        }
        if (known >= 97) {
            if (!freeText.parse(data, cursor)) {
                return false;
            }
            cursor += FreeTextField.BYTE_LENGTH;
        }
        if (known >= 105) {
            if (!clearingFirmIdOptional.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmIdOptionalField.BYTE_LENGTH;
        }
        if (known >= 121) {
            if (!traderId.parse(data, cursor)) {
                return false;
            }
            cursor += TraderIdField.BYTE_LENGTH;
        }
        if (known >= 137) {
            if (!originalInvestorId.parse(data, cursor)) {
                return false;
            }
            cursor += OriginalInvestorIdField.BYTE_LENGTH;
        }
        if (known >= 138) {
            if (!crossOrderIndicatorOptional.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderIndicatorOptionalField.BYTE_LENGTH;
        }
        if (known >= 140) {
            if (!clearingInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingInstructionField.BYTE_LENGTH;
        }
        if (wireBlock > known) {
            this.blockTrailer = Arrays.copyOfRange(data, offset + known, offset + wireBlock);
        }
        cursor = offset + wireBlock;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        int known = knownBytes();
        if (known >= 8) {
            cursor = orderId.encode(data, cursor);
        }
        if (known >= 9) {
            cursor = orderSide.encode(data, cursor);
        }
        if (known >= 10) {
            cursor = orderType.encode(data, cursor);
        }
        if (known >= 11) {
            cursor = timeInForce.encode(data, cursor);
        }
        if (known >= 19) {
            cursor = orderPx.encode(data, cursor);
        }
        if (known >= 27) {
            cursor = clientId.encode(data, cursor);
        }
        if (known >= 28) {
            cursor = technicalOrigin.encode(data, cursor);
        }
        if (known >= 30) {
            cursor = openClose.encode(data, cursor);
        }
        if (known >= 38) {
            cursor = clientOrderId.encode(data, cursor);
        }
        if (known >= 46) {
            cursor = firmId.encode(data, cursor);
        }
        if (known >= 48) {
            cursor = oePartitionIdOptional.encode(data, cursor);
        }
        if (known >= 52) {
            cursor = logicalAccessIdOptional.encode(data, cursor);
        }
        if (known >= 60) {
            cursor = bookInOptional.encode(data, cursor);
        }
        if (known >= 61) {
            cursor = tradeQualifierOptional.encode(data, cursor);
        }
        if (known >= 62) {
            cursor = accountTypeInternalOptional.encode(data, cursor);
        }
        if (known >= 63) {
            cursor = lpRoleOptional.encode(data, cursor);
        }
        if (known >= 79) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (known >= 97) {
            cursor = freeText.encode(data, cursor);
        }
        if (known >= 105) {
            cursor = clearingFirmIdOptional.encode(data, cursor);
        }
        if (known >= 121) {
            cursor = traderId.encode(data, cursor);
        }
        if (known >= 137) {
            cursor = originalInvestorId.encode(data, cursor);
        }
        if (known >= 138) {
            cursor = crossOrderIndicatorOptional.encode(data, cursor);
        }
        if (known >= 140) {
            cursor = clearingInstruction.encode(data, cursor);
        }
        int kept = Math.min(blockTrailer.length, wireBlock - known);
        System.arraycopy(blockTrailer, 0, data, offset + known, kept);
        Arrays.fill(data, offset + known + kept, offset + wireBlock, (byte) 0);
        cursor = offset + wireBlock;
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
        this.blockTrailer = new byte[0];
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
            if ((!decoded || field.hasValue()) && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if ((!decoded || field.hasValue()) && !field.isValid()) {
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
            case "OrderId" -> Optional.of(orderId);
            case "OrderSide" -> Optional.of(orderSide);
            case "OrderType" -> Optional.of(orderType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "OrderPx" -> Optional.of(orderPx);
            case "ClientId" -> Optional.of(clientId);
            case "TechnicalOrigin" -> Optional.of(technicalOrigin);
            case "OpenClose" -> Optional.of(openClose);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "FirmId" -> Optional.of(firmId);
            case "OePartitionIdOptional" -> Optional.of(oePartitionIdOptional);
            case "LogicalAccessIdOptional" -> Optional.of(logicalAccessIdOptional);
            case "BookInOptional" -> Optional.of(bookInOptional);
            case "TradeQualifierOptional" -> Optional.of(tradeQualifierOptional);
            case "AccountTypeInternalOptional" -> Optional.of(accountTypeInternalOptional);
            case "LpRoleOptional" -> Optional.of(lpRoleOptional);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "FreeText" -> Optional.of(freeText);
            case "ClearingFirmIdOptional" -> Optional.of(clearingFirmIdOptional);
            case "TraderId" -> Optional.of(traderId);
            case "OriginalInvestorId" -> Optional.of(originalInvestorId);
            case "CrossOrderIndicatorOptional" -> Optional.of(crossOrderIndicatorOptional);
            case "ClearingInstruction" -> Optional.of(clearingInstruction);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof DCTradeMessageMatchedOrdersGroupEntry message)) {
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
        if (!(other instanceof DCTradeMessageMatchedOrdersGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
