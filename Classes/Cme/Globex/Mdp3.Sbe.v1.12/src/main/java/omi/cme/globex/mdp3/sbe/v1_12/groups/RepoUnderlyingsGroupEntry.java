package omi.cme.globex.mdp3.sbe.v1_12.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingCountryOfIssueField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingFinancialInstrumentFullNameField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingInstrumentGuidOptionalField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingIssuerField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingMaturityDateField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingMaxLifeTimeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingMinDaysToMaturityField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingSecurityAltIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingSecurityAltIdSourceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingSecurityIdOptionalField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingSecurityTypeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingSymbolField;
import omi.cme.globex.mdp3.sbe.v1_12.types.Field;
import omi.cme.globex.mdp3.sbe.v1_12.types.GroupEntry;
import omi.cme.globex.mdp3.sbe.v1_12.types.PrintOptions;

/**
 * One entry of the RepoUnderlyingsGroup repeating group.
 *
 * <p>Number of underlying entries</p>
 */
public final class RepoUnderlyingsGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 118;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 118;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "RepoUnderlyingsGroup";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Underlying Instrument Symbol (Contract Name)
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Underlying Security ID as qualified by tag 305-UnderlyingSecurityIDSource. Provided only if the underlying is a Globex listed instrument, this value will be the same as that contained in Security Definition Tag 48-SecurityID.
     */
    private final UnderlyingSecurityIdOptionalField underlyingSecurityIdOptional = new UnderlyingSecurityIdOptionalField();

    /**
     * Underlying Alternate Security identifier value as qualified by Tag 305-UnderlyingSecuityAltIDSource (e.g. CUSIP, ISIN, etc). For Repo special will contain underlying CUSIP or ISIN. For GC Repo may contain a synthetic CUSIP or ISIN representing a basket
     */
    private final UnderlyingSecurityAltIdField underlyingSecurityAltId = new UnderlyingSecurityAltIdField();

    /**
     * Identifies class or source of the UnderlyingSecurityAltID (458) value
     */
    private final UnderlyingSecurityAltIdSourceField underlyingSecurityAltIdSource = new UnderlyingSecurityAltIdSourceField();

    /**
     * Long Name of the Underlying Instrument. For the instruments listed on Globex this value will be the same as of that contained in Security Definition Tag 2714-FinancialInstrumentFullName
     */
    private final UnderlyingFinancialInstrumentFullNameField underlyingFinancialInstrumentFullName = new UnderlyingFinancialInstrumentFullNameField();

    /**
     * Underlying Security Type
     */
    private final UnderlyingSecurityTypeField underlyingSecurityType = new UnderlyingSecurityTypeField();

    /**
     * Underlying Security's CountryOfIssue. See CountryOfIssue (470) field for description
     */
    private final UnderlyingCountryOfIssueField underlyingCountryOfIssue = new UnderlyingCountryOfIssueField();

    /**
     * Underlying Security's Issuer. See Tag 106-Issuer field for description
     */
    private final UnderlyingIssuerField underlyingIssuer = new UnderlyingIssuerField();

    /**
     * Max life time of the underlying instruments qualifying for the GC basket in number of year. Will contain null value for Repo specials
     */
    private final UnderlyingMaxLifeTimeField underlyingMaxLifeTime = new UnderlyingMaxLifeTimeField();

    /**
     * Minimum days to maturity remaining of the underlying instruments to qualify for GC basket. Will contain null value for Repo specials
     */
    private final UnderlyingMinDaysToMaturityField underlyingMinDaysToMaturity = new UnderlyingMinDaysToMaturityField();

    /**
     * Underlying GUID. For Repo specials populated with individual instrument GUID of the underlying security
     */
    private final UnderlyingInstrumentGuidOptionalField underlyingInstrumentGuidOptional = new UnderlyingInstrumentGuidOptionalField();

    /**
     * Underlying Security's Maturity Date. Will be populated with Maturity Date of the underlying security instrument for Repo Specials only
     */
    private final UnderlyingMaturityDateField underlyingMaturityDate = new UnderlyingMaturityDateField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(underlyingSymbol, underlyingSecurityIdOptional, underlyingSecurityAltId, underlyingSecurityAltIdSource, underlyingFinancialInstrumentFullName, underlyingSecurityType, underlyingCountryOfIssue, underlyingIssuer, underlyingMaxLifeTime, underlyingMinDaysToMaturity, underlyingInstrumentGuidOptional, underlyingMaturityDate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Underlying Instrument Symbol (Contract Name)
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Underlying Security ID as qualified by tag 305-UnderlyingSecurityIDSource. Provided only if the underlying is a Globex listed instrument, this value will be the same as that contained in Security Definition Tag 48-SecurityID.
     *
     * @return the UnderlyingSecurityIdOptional field
     */
    public UnderlyingSecurityIdOptionalField underlyingSecurityIdOptional() {
        return underlyingSecurityIdOptional;
    }

    /**
     * Underlying Alternate Security identifier value as qualified by Tag 305-UnderlyingSecuityAltIDSource (e.g. CUSIP, ISIN, etc). For Repo special will contain underlying CUSIP or ISIN. For GC Repo may contain a synthetic CUSIP or ISIN representing a basket
     *
     * @return the UnderlyingSecurityAltId field
     */
    public UnderlyingSecurityAltIdField underlyingSecurityAltId() {
        return underlyingSecurityAltId;
    }

    /**
     * Identifies class or source of the UnderlyingSecurityAltID (458) value
     *
     * @return the UnderlyingSecurityAltIdSource field
     */
    public UnderlyingSecurityAltIdSourceField underlyingSecurityAltIdSource() {
        return underlyingSecurityAltIdSource;
    }

    /**
     * Long Name of the Underlying Instrument. For the instruments listed on Globex this value will be the same as of that contained in Security Definition Tag 2714-FinancialInstrumentFullName
     *
     * @return the UnderlyingFinancialInstrumentFullName field
     */
    public UnderlyingFinancialInstrumentFullNameField underlyingFinancialInstrumentFullName() {
        return underlyingFinancialInstrumentFullName;
    }

    /**
     * Underlying Security Type
     *
     * @return the UnderlyingSecurityType field
     */
    public UnderlyingSecurityTypeField underlyingSecurityType() {
        return underlyingSecurityType;
    }

    /**
     * Underlying Security's CountryOfIssue. See CountryOfIssue (470) field for description
     *
     * @return the UnderlyingCountryOfIssue field
     */
    public UnderlyingCountryOfIssueField underlyingCountryOfIssue() {
        return underlyingCountryOfIssue;
    }

    /**
     * Underlying Security's Issuer. See Tag 106-Issuer field for description
     *
     * @return the UnderlyingIssuer field
     */
    public UnderlyingIssuerField underlyingIssuer() {
        return underlyingIssuer;
    }

    /**
     * Max life time of the underlying instruments qualifying for the GC basket in number of year. Will contain null value for Repo specials
     *
     * @return the UnderlyingMaxLifeTime field
     */
    public UnderlyingMaxLifeTimeField underlyingMaxLifeTime() {
        return underlyingMaxLifeTime;
    }

    /**
     * Minimum days to maturity remaining of the underlying instruments to qualify for GC basket. Will contain null value for Repo specials
     *
     * @return the UnderlyingMinDaysToMaturity field
     */
    public UnderlyingMinDaysToMaturityField underlyingMinDaysToMaturity() {
        return underlyingMinDaysToMaturity;
    }

    /**
     * Underlying GUID. For Repo specials populated with individual instrument GUID of the underlying security
     *
     * @return the UnderlyingInstrumentGuidOptional field
     */
    public UnderlyingInstrumentGuidOptionalField underlyingInstrumentGuidOptional() {
        return underlyingInstrumentGuidOptional;
    }

    /**
     * Underlying Security's Maturity Date. Will be populated with Maturity Date of the underlying security instrument for Repo Specials only
     *
     * @return the UnderlyingMaturityDate field
     */
    public UnderlyingMaturityDateField underlyingMaturityDate() {
        return underlyingMaturityDate;
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
        if (wireBlock >= 118) {
            return 118;
        }
        if (wireBlock >= 116) {
            return 116;
        }
        if (wireBlock >= 108) {
            return 108;
        }
        if (wireBlock >= 106) {
            return 106;
        }
        if (wireBlock >= 105) {
            return 105;
        }
        if (wireBlock >= 80) {
            return 80;
        }
        if (wireBlock >= 78) {
            return 78;
        }
        if (wireBlock >= 72) {
            return 72;
        }
        if (wireBlock >= 37) {
            return 37;
        }
        if (wireBlock >= 36) {
            return 36;
        }
        if (wireBlock >= 24) {
            return 24;
        }
        if (wireBlock >= 20) {
            return 20;
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
        return PADDING.clone();
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
        if (known >= 20) {
            if (!underlyingSymbol.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingSymbolField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!underlyingSecurityIdOptional.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingSecurityIdOptionalField.BYTE_LENGTH;
        }
        if (known >= 36) {
            if (!underlyingSecurityAltId.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingSecurityAltIdField.BYTE_LENGTH;
        }
        if (known >= 37) {
            if (!underlyingSecurityAltIdSource.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingSecurityAltIdSourceField.BYTE_LENGTH;
        }
        if (known >= 72) {
            if (!underlyingFinancialInstrumentFullName.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingFinancialInstrumentFullNameField.BYTE_LENGTH;
        }
        if (known >= 78) {
            if (!underlyingSecurityType.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingSecurityTypeField.BYTE_LENGTH;
        }
        if (known >= 80) {
            if (!underlyingCountryOfIssue.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingCountryOfIssueField.BYTE_LENGTH;
        }
        if (known >= 105) {
            if (!underlyingIssuer.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingIssuerField.BYTE_LENGTH;
        }
        if (known >= 106) {
            if (!underlyingMaxLifeTime.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingMaxLifeTimeField.BYTE_LENGTH;
        }
        if (known >= 108) {
            if (!underlyingMinDaysToMaturity.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingMinDaysToMaturityField.BYTE_LENGTH;
        }
        if (known >= 116) {
            if (!underlyingInstrumentGuidOptional.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingInstrumentGuidOptionalField.BYTE_LENGTH;
        }
        if (known >= 118) {
            if (!underlyingMaturityDate.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingMaturityDateField.BYTE_LENGTH;
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
        if (known >= 20) {
            cursor = underlyingSymbol.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = underlyingSecurityIdOptional.encode(data, cursor);
        }
        if (known >= 36) {
            cursor = underlyingSecurityAltId.encode(data, cursor);
        }
        if (known >= 37) {
            cursor = underlyingSecurityAltIdSource.encode(data, cursor);
        }
        if (known >= 72) {
            cursor = underlyingFinancialInstrumentFullName.encode(data, cursor);
        }
        if (known >= 78) {
            cursor = underlyingSecurityType.encode(data, cursor);
        }
        if (known >= 80) {
            cursor = underlyingCountryOfIssue.encode(data, cursor);
        }
        if (known >= 105) {
            cursor = underlyingIssuer.encode(data, cursor);
        }
        if (known >= 106) {
            cursor = underlyingMaxLifeTime.encode(data, cursor);
        }
        if (known >= 108) {
            cursor = underlyingMinDaysToMaturity.encode(data, cursor);
        }
        if (known >= 116) {
            cursor = underlyingInstrumentGuidOptional.encode(data, cursor);
        }
        if (known >= 118) {
            cursor = underlyingMaturityDate.encode(data, cursor);
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
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "UnderlyingSecurityIdOptional" -> Optional.of(underlyingSecurityIdOptional);
            case "UnderlyingSecurityAltId" -> Optional.of(underlyingSecurityAltId);
            case "UnderlyingSecurityAltIdSource" -> Optional.of(underlyingSecurityAltIdSource);
            case "UnderlyingFinancialInstrumentFullName" -> Optional.of(underlyingFinancialInstrumentFullName);
            case "UnderlyingSecurityType" -> Optional.of(underlyingSecurityType);
            case "UnderlyingCountryOfIssue" -> Optional.of(underlyingCountryOfIssue);
            case "UnderlyingIssuer" -> Optional.of(underlyingIssuer);
            case "UnderlyingMaxLifeTime" -> Optional.of(underlyingMaxLifeTime);
            case "UnderlyingMinDaysToMaturity" -> Optional.of(underlyingMinDaysToMaturity);
            case "UnderlyingInstrumentGuidOptional" -> Optional.of(underlyingInstrumentGuidOptional);
            case "UnderlyingMaturityDate" -> Optional.of(underlyingMaturityDate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof RepoUnderlyingsGroupEntry message)) {
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
        if (!(other instanceof RepoUnderlyingsGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
