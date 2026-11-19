package omi.euronext.optiq.dropcopygateway.sbe.v5_56.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.AccountTypeOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.BookInOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.ClearingAccountField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.ClearingFirmIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.ClientOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.CrossOrderIndicatorOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.DeclarationIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.FirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.FreeTextField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.InvestorIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.LogicalAccessIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.OePartitionIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.OperationTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.PrincipalCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.SideField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.TraderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.types.GroupEntry;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.types.PrintOptions;

/**
 * One entry of the DCTradeMessageMatchedDeclarationsGroup repeating group.
 *
 * <p>MatchedDeclarations</p>
 */
public final class DCTradeMessageMatchedDeclarationsGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 124;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 124;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "DCTradeMessageMatchedDeclarationsGroup";

    /**
     * declarationID
     */
    private final DeclarationIdField declarationId = new DeclarationIdField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * operationType
     */
    private final OperationTypeField operationType = new OperationTypeField();

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
     * accountType
     */
    private final AccountTypeOptionalField accountTypeOptional = new AccountTypeOptionalField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * freeText
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * clearingFirmID
     */
    private final ClearingFirmIdOptionalField clearingFirmIdOptional = new ClearingFirmIdOptionalField();

    /**
     * clearingAccount
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * principalCode
     */
    private final PrincipalCodeField principalCode = new PrincipalCodeField();

    /**
     * crossOrderIndicator
     */
    private final CrossOrderIndicatorOptionalField crossOrderIndicatorOptional = new CrossOrderIndicatorOptionalField();

    /**
     * traderID
     */
    private final TraderIdField traderId = new TraderIdField();

    /**
     * investorID
     */
    private final InvestorIdField investorId = new InvestorIdField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(declarationId, side, operationType, firmId, oePartitionIdOptional, logicalAccessIdOptional, bookInOptional, accountTypeOptional, clientOrderId, freeText, clearingFirmIdOptional, clearingAccount, principalCode, crossOrderIndicatorOptional, traderId, investorId);

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
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * accountType
     *
     * @return the AccountTypeOptional field
     */
    public AccountTypeOptionalField accountTypeOptional() {
        return accountTypeOptional;
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
     * principalCode
     *
     * @return the PrincipalCode field
     */
    public PrincipalCodeField principalCode() {
        return principalCode;
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
        if (wireBlock >= 124) {
            return 124;
        }
        if (wireBlock >= 108) {
            return 108;
        }
        if (wireBlock >= 92) {
            return 92;
        }
        if (wireBlock >= 91) {
            return 91;
        }
        if (wireBlock >= 83) {
            return 83;
        }
        if (wireBlock >= 67) {
            return 67;
        }
        if (wireBlock >= 59) {
            return 59;
        }
        if (wireBlock >= 41) {
            return 41;
        }
        if (wireBlock >= 33) {
            return 33;
        }
        if (wireBlock >= 32) {
            return 32;
        }
        if (wireBlock >= 24) {
            return 24;
        }
        if (wireBlock >= 20) {
            return 20;
        }
        if (wireBlock >= 18) {
            return 18;
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
            if (!declarationId.parse(data, cursor)) {
                return false;
            }
            cursor += DeclarationIdField.BYTE_LENGTH;
        }
        if (known >= 9) {
            if (!side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (known >= 10) {
            if (!operationType.parse(data, cursor)) {
                return false;
            }
            cursor += OperationTypeField.BYTE_LENGTH;
        }
        if (known >= 18) {
            if (!firmId.parse(data, cursor)) {
                return false;
            }
            cursor += FirmIdField.BYTE_LENGTH;
        }
        if (known >= 20) {
            if (!oePartitionIdOptional.parse(data, cursor)) {
                return false;
            }
            cursor += OePartitionIdOptionalField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!logicalAccessIdOptional.parse(data, cursor)) {
                return false;
            }
            cursor += LogicalAccessIdOptionalField.BYTE_LENGTH;
        }
        if (known >= 32) {
            if (!bookInOptional.parse(data, cursor)) {
                return false;
            }
            cursor += BookInOptionalField.BYTE_LENGTH;
        }
        if (known >= 33) {
            if (!accountTypeOptional.parse(data, cursor)) {
                return false;
            }
            cursor += AccountTypeOptionalField.BYTE_LENGTH;
        }
        if (known >= 41) {
            if (!clientOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += ClientOrderIdField.BYTE_LENGTH;
        }
        if (known >= 59) {
            if (!freeText.parse(data, cursor)) {
                return false;
            }
            cursor += FreeTextField.BYTE_LENGTH;
        }
        if (known >= 67) {
            if (!clearingFirmIdOptional.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmIdOptionalField.BYTE_LENGTH;
        }
        if (known >= 83) {
            if (!clearingAccount.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountField.BYTE_LENGTH;
        }
        if (known >= 91) {
            if (!principalCode.parse(data, cursor)) {
                return false;
            }
            cursor += PrincipalCodeField.BYTE_LENGTH;
        }
        if (known >= 92) {
            if (!crossOrderIndicatorOptional.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderIndicatorOptionalField.BYTE_LENGTH;
        }
        if (known >= 108) {
            if (!traderId.parse(data, cursor)) {
                return false;
            }
            cursor += TraderIdField.BYTE_LENGTH;
        }
        if (known >= 124) {
            if (!investorId.parse(data, cursor)) {
                return false;
            }
            cursor += InvestorIdField.BYTE_LENGTH;
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
        if (known >= 9) {
            cursor = side.encode(data, cursor);
        }
        if (known >= 10) {
            cursor = operationType.encode(data, cursor);
        }
        if (known >= 18) {
            cursor = firmId.encode(data, cursor);
        }
        if (known >= 20) {
            cursor = oePartitionIdOptional.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = logicalAccessIdOptional.encode(data, cursor);
        }
        if (known >= 32) {
            cursor = bookInOptional.encode(data, cursor);
        }
        if (known >= 33) {
            cursor = accountTypeOptional.encode(data, cursor);
        }
        if (known >= 41) {
            cursor = clientOrderId.encode(data, cursor);
        }
        if (known >= 59) {
            cursor = freeText.encode(data, cursor);
        }
        if (known >= 67) {
            cursor = clearingFirmIdOptional.encode(data, cursor);
        }
        if (known >= 83) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (known >= 91) {
            cursor = principalCode.encode(data, cursor);
        }
        if (known >= 92) {
            cursor = crossOrderIndicatorOptional.encode(data, cursor);
        }
        if (known >= 108) {
            cursor = traderId.encode(data, cursor);
        }
        if (known >= 124) {
            cursor = investorId.encode(data, cursor);
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
            case "Side" -> Optional.of(side);
            case "OperationType" -> Optional.of(operationType);
            case "FirmId" -> Optional.of(firmId);
            case "OePartitionIdOptional" -> Optional.of(oePartitionIdOptional);
            case "LogicalAccessIdOptional" -> Optional.of(logicalAccessIdOptional);
            case "BookInOptional" -> Optional.of(bookInOptional);
            case "AccountTypeOptional" -> Optional.of(accountTypeOptional);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "FreeText" -> Optional.of(freeText);
            case "ClearingFirmIdOptional" -> Optional.of(clearingFirmIdOptional);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "PrincipalCode" -> Optional.of(principalCode);
            case "CrossOrderIndicatorOptional" -> Optional.of(crossOrderIndicatorOptional);
            case "TraderId" -> Optional.of(traderId);
            case "InvestorId" -> Optional.of(investorId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof DCTradeMessageMatchedDeclarationsGroupEntry message)) {
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
        if (!(other instanceof DCTradeMessageMatchedDeclarationsGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
