package omi.euronext.optiq.dropcopygateway.sbe.v6_69.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.AccountTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.BookInField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.ClearingAccountField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.ClearingFirmIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.ClientOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.DeclarationIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.FirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.FreeTextField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.InvestorIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.LogicalAccessIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.OePartitionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.OperationTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.PriceOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.PrincipalCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.QuantityOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.SideField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.TraderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.types.GroupEntry;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.types.PrintOptions;

/**
 * One entry of the DCShortTradeDeclarationMessageShortTradeDeclarationsGroup repeating group.
 *
 * <p>ShortTradeDeclarations</p>
 */
public final class DCShortTradeDeclarationMessageShortTradeDeclarationsGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 139;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 139;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "DCShortTradeDeclarationMessageShortTradeDeclarationsGroup";

    /**
     * declarationID
     */
    private final DeclarationIdField declarationId = new DeclarationIdField();

    /**
     * price
     */
    private final PriceOptionalField priceOptional = new PriceOptionalField();

    /**
     * quantity
     */
    private final QuantityOptionalField quantityOptional = new QuantityOptionalField();

    /**
     * operationType
     */
    private final OperationTypeField operationType = new OperationTypeField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * oEPartitionID
     */
    private final OePartitionIdField oePartitionId = new OePartitionIdField();

    /**
     * logicalAccessID
     */
    private final LogicalAccessIdField logicalAccessId = new LogicalAccessIdField();

    /**
     * bookIn
     */
    private final BookInField bookIn = new BookInField();

    /**
     * traderID
     */
    private final TraderIdField traderId = new TraderIdField();

    /**
     * investorID
     */
    private final InvestorIdField investorId = new InvestorIdField();

    /**
     * principalCode
     */
    private final PrincipalCodeField principalCode = new PrincipalCodeField();

    /**
     * clearingFirmID
     */
    private final ClearingFirmIdOptionalField clearingFirmIdOptional = new ClearingFirmIdOptionalField();

    /**
     * clearingAccount
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * accountType
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * freeText
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(declarationId, priceOptional, quantityOptional, operationType, side, firmId, oePartitionId, logicalAccessId, bookIn, traderId, investorId, principalCode, clearingFirmIdOptional, clearingAccount, accountType, clientOrderId, freeText);

    private byte[] buffer;

    private boolean decoded;

    /**
     * declarationID
     *
     * @return the DeclarationId field
     */
    public DeclarationIdField declarationId() {
        return declarationId;
    }

    /**
     * price
     *
     * @return the PriceOptional field
     */
    public PriceOptionalField priceOptional() {
        return priceOptional;
    }

    /**
     * quantity
     *
     * @return the QuantityOptional field
     */
    public QuantityOptionalField quantityOptional() {
        return quantityOptional;
    }

    /**
     * operationType
     *
     * @return the OperationType field
     */
    public OperationTypeField operationType() {
        return operationType;
    }

    /**
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * @return the OePartitionId field
     */
    public OePartitionIdField oePartitionId() {
        return oePartitionId;
    }

    /**
     * logicalAccessID
     *
     * @return the LogicalAccessId field
     */
    public LogicalAccessIdField logicalAccessId() {
        return logicalAccessId;
    }

    /**
     * bookIn
     *
     * @return the BookIn field
     */
    public BookInField bookIn() {
        return bookIn;
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
     * investorID
     *
     * @return the InvestorId field
     */
    public InvestorIdField investorId() {
        return investorId;
    }

    /**
     * principalCode
     *
     * @return the PrincipalCode field
     */
    public PrincipalCodeField principalCode() {
        return principalCode;
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
     * clearingAccount
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * accountType
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
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
     * freeText
     *
     * @return the FreeText field
     */
    public FreeTextField freeText() {
        return freeText;
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
        if (wireBlock >= 139) {
            return 139;
        }
        if (wireBlock >= 121) {
            return 121;
        }
        if (wireBlock >= 113) {
            return 113;
        }
        if (wireBlock >= 112) {
            return 112;
        }
        if (wireBlock >= 96) {
            return 96;
        }
        if (wireBlock >= 88) {
            return 88;
        }
        if (wireBlock >= 80) {
            return 80;
        }
        if (wireBlock >= 64) {
            return 64;
        }
        if (wireBlock >= 48) {
            return 48;
        }
        if (wireBlock >= 40) {
            return 40;
        }
        if (wireBlock >= 36) {
            return 36;
        }
        if (wireBlock >= 34) {
            return 34;
        }
        if (wireBlock >= 26) {
            return 26;
        }
        if (wireBlock >= 25) {
            return 25;
        }
        if (wireBlock >= 24) {
            return 24;
        }
        if (wireBlock >= 16) {
            return 16;
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
            if (!declarationId.parse(data, cursor)) {
                return false;
            }
            cursor += DeclarationIdField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!priceOptional.parse(data, cursor)) {
                return false;
            }
            cursor += PriceOptionalField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!quantityOptional.parse(data, cursor)) {
                return false;
            }
            cursor += QuantityOptionalField.BYTE_LENGTH;
        }
        if (known >= 25) {
            if (!operationType.parse(data, cursor)) {
                return false;
            }
            cursor += OperationTypeField.BYTE_LENGTH;
        }
        if (known >= 26) {
            if (!side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (known >= 34) {
            if (!firmId.parse(data, cursor)) {
                return false;
            }
            cursor += FirmIdField.BYTE_LENGTH;
        }
        if (known >= 36) {
            if (!oePartitionId.parse(data, cursor)) {
                return false;
            }
            cursor += OePartitionIdField.BYTE_LENGTH;
        }
        if (known >= 40) {
            if (!logicalAccessId.parse(data, cursor)) {
                return false;
            }
            cursor += LogicalAccessIdField.BYTE_LENGTH;
        }
        if (known >= 48) {
            if (!bookIn.parse(data, cursor)) {
                return false;
            }
            cursor += BookInField.BYTE_LENGTH;
        }
        if (known >= 64) {
            if (!traderId.parse(data, cursor)) {
                return false;
            }
            cursor += TraderIdField.BYTE_LENGTH;
        }
        if (known >= 80) {
            if (!investorId.parse(data, cursor)) {
                return false;
            }
            cursor += InvestorIdField.BYTE_LENGTH;
        }
        if (known >= 88) {
            if (!principalCode.parse(data, cursor)) {
                return false;
            }
            cursor += PrincipalCodeField.BYTE_LENGTH;
        }
        if (known >= 96) {
            if (!clearingFirmIdOptional.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmIdOptionalField.BYTE_LENGTH;
        }
        if (known >= 112) {
            if (!clearingAccount.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountField.BYTE_LENGTH;
        }
        if (known >= 113) {
            if (!accountType.parse(data, cursor)) {
                return false;
            }
            cursor += AccountTypeField.BYTE_LENGTH;
        }
        if (known >= 121) {
            if (!clientOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += ClientOrderIdField.BYTE_LENGTH;
        }
        if (known >= 139) {
            if (!freeText.parse(data, cursor)) {
                return false;
            }
            cursor += FreeTextField.BYTE_LENGTH;
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
            cursor = declarationId.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = priceOptional.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = quantityOptional.encode(data, cursor);
        }
        if (known >= 25) {
            cursor = operationType.encode(data, cursor);
        }
        if (known >= 26) {
            cursor = side.encode(data, cursor);
        }
        if (known >= 34) {
            cursor = firmId.encode(data, cursor);
        }
        if (known >= 36) {
            cursor = oePartitionId.encode(data, cursor);
        }
        if (known >= 40) {
            cursor = logicalAccessId.encode(data, cursor);
        }
        if (known >= 48) {
            cursor = bookIn.encode(data, cursor);
        }
        if (known >= 64) {
            cursor = traderId.encode(data, cursor);
        }
        if (known >= 80) {
            cursor = investorId.encode(data, cursor);
        }
        if (known >= 88) {
            cursor = principalCode.encode(data, cursor);
        }
        if (known >= 96) {
            cursor = clearingFirmIdOptional.encode(data, cursor);
        }
        if (known >= 112) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (known >= 113) {
            cursor = accountType.encode(data, cursor);
        }
        if (known >= 121) {
            cursor = clientOrderId.encode(data, cursor);
        }
        if (known >= 139) {
            cursor = freeText.encode(data, cursor);
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
            case "DeclarationId" -> Optional.of(declarationId);
            case "PriceOptional" -> Optional.of(priceOptional);
            case "QuantityOptional" -> Optional.of(quantityOptional);
            case "OperationType" -> Optional.of(operationType);
            case "Side" -> Optional.of(side);
            case "FirmId" -> Optional.of(firmId);
            case "OePartitionId" -> Optional.of(oePartitionId);
            case "LogicalAccessId" -> Optional.of(logicalAccessId);
            case "BookIn" -> Optional.of(bookIn);
            case "TraderId" -> Optional.of(traderId);
            case "InvestorId" -> Optional.of(investorId);
            case "PrincipalCode" -> Optional.of(principalCode);
            case "ClearingFirmIdOptional" -> Optional.of(clearingFirmIdOptional);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "AccountType" -> Optional.of(accountType);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "FreeText" -> Optional.of(freeText);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof DCShortTradeDeclarationMessageShortTradeDeclarationsGroupEntry message)) {
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
        if (!(other instanceof DCShortTradeDeclarationMessageShortTradeDeclarationsGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
