package omi.eurex.t7.eobi.fbe.v13_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v13_0.fields.FastMarketIndicatorField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.InstrumentScopeProductComplexField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.LastFragmentField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.MassMarketConditionField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.MassSoldOutIndicatorField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.NoRelatedSymField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityMassStatusField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityMassTradingEventField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityMassTradingStatusField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TesSecurityMassStatusField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TransactTimeField;
import omi.eurex.t7.eobi.fbe.v13_0.groups.SecMassStatGrpCompEntry;
import omi.eurex.t7.eobi.fbe.v13_0.groups.SecMassStatGrpCompList;
import omi.eurex.t7.eobi.fbe.v13_0.types.Field;
import omi.eurex.t7.eobi.fbe.v13_0.types.Message;
import omi.eurex.t7.eobi.fbe.v13_0.types.PrintOptions;

/**
 * Represents the MassInstrumentStateChange message from the Eobi protocol.
 */
public final class MassInstrumentStateChange implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 792;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Instrument State Change";

    /**
     * The number of slots that SecMassStatGrpComp carries on the wire.
     */
    public static final int SEC_MASS_STAT_GRP_COMP_COUNT = 24;

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 18, 6, 54, 2, 86, 2, 118, 2, 150, 2, 182, 2, 214, 2, 246, 2, 278, 2, 310, 2, 342, 2, 374, 2, 406, 2, 438, 2, 470, 2, 502, 2, 534, 2, 566, 2, 598, 2, 630, 2, 662, 2, 694, 2, 726, 2, 758, 2, 790, 2 };

    /**
     * Instrument Scope Product Complex
     */
    private final InstrumentScopeProductComplexField instrumentScopeProductComplex = new InstrumentScopeProductComplexField();

    /**
     * Security Mass Status
     */
    private final SecurityMassStatusField securityMassStatus = new SecurityMassStatusField();

    /**
     * Security Mass Trading Status
     */
    private final SecurityMassTradingStatusField securityMassTradingStatus = new SecurityMassTradingStatusField();

    /**
     * Mass Market Condition
     */
    private final MassMarketConditionField massMarketCondition = new MassMarketConditionField();

    /**
     * Fast Market Indicator
     */
    private final FastMarketIndicatorField fastMarketIndicator = new FastMarketIndicatorField();

    /**
     * Security Mass Trading Event
     */
    private final SecurityMassTradingEventField securityMassTradingEvent = new SecurityMassTradingEventField();

    /**
     * Mass Sold Out Indicator
     */
    private final MassSoldOutIndicatorField massSoldOutIndicator = new MassSoldOutIndicatorField();

    /**
     * Tes Security Mass Status
     */
    private final TesSecurityMassStatusField tesSecurityMassStatus = new TesSecurityMassStatusField();

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Last Fragment
     */
    private final LastFragmentField lastFragment = new LastFragmentField();

    /**
     * No Related Sym
     */
    private final NoRelatedSymField noRelatedSym = new NoRelatedSymField();

    /**
     * Sec Mass Stat Grp Comp
     */
    private final SecMassStatGrpCompList secMassStatGrpComp = new SecMassStatGrpCompList(SEC_MASS_STAT_GRP_COMP_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentScopeProductComplex, securityMassStatus, securityMassTradingStatus, massMarketCondition, fastMarketIndicator, securityMassTradingEvent, massSoldOutIndicator, tesSecurityMassStatus, transactTime, lastFragment, noRelatedSym);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Instrument Scope Product Complex
     *
     * @return the InstrumentScopeProductComplex field
     */
    public InstrumentScopeProductComplexField instrumentScopeProductComplex() {
        return instrumentScopeProductComplex;
    }

    /**
     * Security Mass Status
     *
     * @return the SecurityMassStatus field
     */
    public SecurityMassStatusField securityMassStatus() {
        return securityMassStatus;
    }

    /**
     * Security Mass Trading Status
     *
     * @return the SecurityMassTradingStatus field
     */
    public SecurityMassTradingStatusField securityMassTradingStatus() {
        return securityMassTradingStatus;
    }

    /**
     * Mass Market Condition
     *
     * @return the MassMarketCondition field
     */
    public MassMarketConditionField massMarketCondition() {
        return massMarketCondition;
    }

    /**
     * Fast Market Indicator
     *
     * @return the FastMarketIndicator field
     */
    public FastMarketIndicatorField fastMarketIndicator() {
        return fastMarketIndicator;
    }

    /**
     * Security Mass Trading Event
     *
     * @return the SecurityMassTradingEvent field
     */
    public SecurityMassTradingEventField securityMassTradingEvent() {
        return securityMassTradingEvent;
    }

    /**
     * Mass Sold Out Indicator
     *
     * @return the MassSoldOutIndicator field
     */
    public MassSoldOutIndicatorField massSoldOutIndicator() {
        return massSoldOutIndicator;
    }

    /**
     * Tes Security Mass Status
     *
     * @return the TesSecurityMassStatus field
     */
    public TesSecurityMassStatusField tesSecurityMassStatus() {
        return tesSecurityMassStatus;
    }

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Last Fragment
     *
     * @return the LastFragment field
     */
    public LastFragmentField lastFragment() {
        return lastFragment;
    }

    /**
     * No Related Sym
     *
     * @return the NoRelatedSym field
     */
    public NoRelatedSymField noRelatedSym() {
        return noRelatedSym;
    }

    /**
     * Sec Mass Stat Grp Comp
     *
     * <p>The wire always carries 24 slots, and this list holds those in use: encode writes its size to the NoRelatedSym field and fills the rest.</p>
     *
     * @return the SecMassStatGrpComp entries
     */
    public SecMassStatGrpCompList secMassStatGrpComp() {
        return secMassStatGrpComp;
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
        return Optional.ofNullable(transactTime.value());
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
        if (decoded) {
            secMassStatGrpComp.keep(buffer, offset);
        }
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!instrumentScopeProductComplex.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentScopeProductComplexField.BYTE_LENGTH;
        if (!securityMassStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityMassStatusField.BYTE_LENGTH;
        if (!securityMassTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityMassTradingStatusField.BYTE_LENGTH;
        if (!massMarketCondition.parse(data, cursor)) {
            return false;
        }
        cursor += MassMarketConditionField.BYTE_LENGTH;
        if (!fastMarketIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FastMarketIndicatorField.BYTE_LENGTH;
        if (!securityMassTradingEvent.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityMassTradingEventField.BYTE_LENGTH;
        if (!massSoldOutIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MassSoldOutIndicatorField.BYTE_LENGTH;
        if (!tesSecurityMassStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TesSecurityMassStatusField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!lastFragment.parse(data, cursor)) {
            return false;
        }
        cursor += LastFragmentField.BYTE_LENGTH;
        if (!noRelatedSym.parse(data, cursor)) {
            return false;
        }
        cursor += NoRelatedSymField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!secMassStatGrpComp.parse(data, cursor, end, noRelatedSym.value())) {
            return false;
        }
        cursor += secMassStatGrpComp.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        if (secMassStatGrpComp.size() > 255) {
            throw new IllegalStateException("secMassStatGrpComp holds " + secMassStatGrpComp.size() + " entries, more than its count field can state");
        }
        noRelatedSym.value((short) secMassStatGrpComp.size());
        int cursor = offset;
        cursor = instrumentScopeProductComplex.encode(data, cursor);
        cursor = securityMassStatus.encode(data, cursor);
        cursor = securityMassTradingStatus.encode(data, cursor);
        cursor = massMarketCondition.encode(data, cursor);
        cursor = fastMarketIndicator.encode(data, cursor);
        cursor = securityMassTradingEvent.encode(data, cursor);
        cursor = massSoldOutIndicator.encode(data, cursor);
        cursor = tesSecurityMassStatus.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = lastFragment.encode(data, cursor);
        cursor = noRelatedSym.encode(data, cursor);
        if (buffer != null && buffer.length >= 24) {
            System.arraycopy(buffer, 18, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = secMassStatGrpComp.encode(data, cursor);
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
        secMassStatGrpComp.clear();
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
            if (field != noRelatedSym && !field.isRecognized()) {
                return false;
            }
        }
        return secMassStatGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noRelatedSym && !field.isValid()) {
                return false;
            }
        }
        if (!secMassStatGrpComp.isValid()) {
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
        if (!instrumentScopeProductComplex.isDecoded()) {
            return Optional.of(instrumentScopeProductComplex);
        }
        if (!securityMassStatus.isDecoded()) {
            return Optional.of(securityMassStatus);
        }
        if (!securityMassTradingStatus.isDecoded()) {
            return Optional.of(securityMassTradingStatus);
        }
        if (!massMarketCondition.isDecoded()) {
            return Optional.of(massMarketCondition);
        }
        if (!fastMarketIndicator.isDecoded()) {
            return Optional.of(fastMarketIndicator);
        }
        if (!securityMassTradingEvent.isDecoded()) {
            return Optional.of(securityMassTradingEvent);
        }
        if (!massSoldOutIndicator.isDecoded()) {
            return Optional.of(massSoldOutIndicator);
        }
        if (!tesSecurityMassStatus.isDecoded()) {
            return Optional.of(tesSecurityMassStatus);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!lastFragment.isDecoded()) {
            return Optional.of(lastFragment);
        }
        if (!noRelatedSym.isDecoded()) {
            return Optional.of(noRelatedSym);
        }
        if (!secMassStatGrpComp.isDecoded()) {
            return Optional.of(secMassStatGrpComp.failedEntry().flatMap(SecMassStatGrpCompEntry::failedAt).orElse(noRelatedSym));
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
            case "InstrumentScopeProductComplex" -> Optional.of(instrumentScopeProductComplex);
            case "SecurityMassStatus" -> Optional.of(securityMassStatus);
            case "SecurityMassTradingStatus" -> Optional.of(securityMassTradingStatus);
            case "MassMarketCondition" -> Optional.of(massMarketCondition);
            case "FastMarketIndicator" -> Optional.of(fastMarketIndicator);
            case "SecurityMassTradingEvent" -> Optional.of(securityMassTradingEvent);
            case "MassSoldOutIndicator" -> Optional.of(massSoldOutIndicator);
            case "TesSecurityMassStatus" -> Optional.of(tesSecurityMassStatus);
            case "TransactTime" -> Optional.of(transactTime);
            case "LastFragment" -> Optional.of(lastFragment);
            case "NoRelatedSym" -> Optional.of(noRelatedSym);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassInstrumentStateChange message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(secMassStatGrpComp.diffFields(message.secMassStatGrpComp));
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
            secMassStatGrpComp.toFormattedString(builder, options);
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
        secMassStatGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof MassInstrumentStateChange message)) {
            return false;
        }
        return fields.equals(message.fields) && secMassStatGrpComp.equals(message.secMassStatGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, secMassStatGrpComp);
    }
}
