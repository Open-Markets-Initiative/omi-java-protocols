package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.MessageTypeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield10Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield11Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield12Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield13Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield14Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield15Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield16Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield17Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield1Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield2Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield3Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield4Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield5Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield6Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield7Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield8Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ReturnBitfield9Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.GroupEntry;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * The ReturnBitfieldsParamGroup record a message holds.
 *
 * <p>ReturnBitfieldsParamGroup</p>
 */
public final class ReturnBitfieldsParamGroup implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 2;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "ReturnBitfieldsParamGroup";

    /**
     * Return message type the bitfields are being specified for (e.g. 0x25 for an Order Acknowledgment).
     */
    private final MessageTypeField messageType = new MessageTypeField();

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderAcknowledgment byte 1.
     */
    private final ReturnBitfield1Field returnBitfield1 = new ReturnBitfield1Field();

    /**
     * BitSet OrderAcknowledgment byte 2.
     */
    private final ReturnBitfield2Field returnBitfield2 = new ReturnBitfield2Field();

    /**
     * BitSet OrderAcknowledgment byte 3.
     */
    private final ReturnBitfield3Field returnBitfield3 = new ReturnBitfield3Field();

    /**
     * BitSet OrderAcknowledgment byte 4.
     */
    private final ReturnBitfield4Field returnBitfield4 = new ReturnBitfield4Field();

    /**
     * BitSet OrderAcknowledgment byte 5.
     */
    private final ReturnBitfield5Field returnBitfield5 = new ReturnBitfield5Field();

    /**
     * BitSet OrderAcknowledgment byte 6.
     */
    private final ReturnBitfield6Field returnBitfield6 = new ReturnBitfield6Field();

    /**
     * BitSet OrderAcknowledgment byte 7.
     */
    private final ReturnBitfield7Field returnBitfield7 = new ReturnBitfield7Field();

    /**
     * BitSet OrderAcknowledgment byte 8.
     */
    private final ReturnBitfield8Field returnBitfield8 = new ReturnBitfield8Field();

    /**
     * BitSet OrderAcknowledgment byte 9.
     */
    private final ReturnBitfield9Field returnBitfield9 = new ReturnBitfield9Field();

    /**
     * BitSet OrderAcknowledgment byte 10.
     */
    private final ReturnBitfield10Field returnBitfield10 = new ReturnBitfield10Field();

    /**
     * BitSet OrderAcknowledgment byte 11.
     */
    private final ReturnBitfield11Field returnBitfield11 = new ReturnBitfield11Field();

    /**
     * BitSet OrderAcknowledgment byte 12.
     */
    private final ReturnBitfield12Field returnBitfield12 = new ReturnBitfield12Field();

    /**
     * BitSet OrderAcknowledgment byte 13.
     */
    private final ReturnBitfield13Field returnBitfield13 = new ReturnBitfield13Field();

    /**
     * BitSet OrderAcknowledgment byte 14.
     */
    private final ReturnBitfield14Field returnBitfield14 = new ReturnBitfield14Field();

    /**
     * BitSet OrderAcknowledgment byte 15.
     */
    private final ReturnBitfield15Field returnBitfield15 = new ReturnBitfield15Field();

    /**
     * BitSet OrderAcknowledgment byte 16.
     */
    private final ReturnBitfield16Field returnBitfield16 = new ReturnBitfield16Field();

    /**
     * BitSet OrderAcknowledgment byte 17.
     */
    private final ReturnBitfield17Field returnBitfield17 = new ReturnBitfield17Field();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(messageType, numberOfReturnBitfields, returnBitfield1, returnBitfield2, returnBitfield3, returnBitfield4, returnBitfield5, returnBitfield6, returnBitfield7, returnBitfield8, returnBitfield9, returnBitfield10, returnBitfield11, returnBitfield12, returnBitfield13, returnBitfield14, returnBitfield15, returnBitfield16, returnBitfield17);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Return message type the bitfields are being specified for (e.g. 0x25 for an Order Acknowledgment).
     *
     * @return the MessageType field
     */
    public MessageTypeField messageType() {
        return messageType;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     *
     * @return the NumberOfReturnBitfields field
     */
    public NumberOfReturnBitfieldsField numberOfReturnBitfields() {
        return numberOfReturnBitfields;
    }

    /**
     * BitSet OrderAcknowledgment byte 1.
     *
     * @return the ReturnBitfield1 field
     */
    public ReturnBitfield1Field returnBitfield1() {
        return returnBitfield1;
    }

    /**
     * BitSet OrderAcknowledgment byte 2.
     *
     * @return the ReturnBitfield2 field
     */
    public ReturnBitfield2Field returnBitfield2() {
        return returnBitfield2;
    }

    /**
     * BitSet OrderAcknowledgment byte 3.
     *
     * @return the ReturnBitfield3 field
     */
    public ReturnBitfield3Field returnBitfield3() {
        return returnBitfield3;
    }

    /**
     * BitSet OrderAcknowledgment byte 4.
     *
     * @return the ReturnBitfield4 field
     */
    public ReturnBitfield4Field returnBitfield4() {
        return returnBitfield4;
    }

    /**
     * BitSet OrderAcknowledgment byte 5.
     *
     * @return the ReturnBitfield5 field
     */
    public ReturnBitfield5Field returnBitfield5() {
        return returnBitfield5;
    }

    /**
     * BitSet OrderAcknowledgment byte 6.
     *
     * @return the ReturnBitfield6 field
     */
    public ReturnBitfield6Field returnBitfield6() {
        return returnBitfield6;
    }

    /**
     * BitSet OrderAcknowledgment byte 7.
     *
     * @return the ReturnBitfield7 field
     */
    public ReturnBitfield7Field returnBitfield7() {
        return returnBitfield7;
    }

    /**
     * BitSet OrderAcknowledgment byte 8.
     *
     * @return the ReturnBitfield8 field
     */
    public ReturnBitfield8Field returnBitfield8() {
        return returnBitfield8;
    }

    /**
     * BitSet OrderAcknowledgment byte 9.
     *
     * @return the ReturnBitfield9 field
     */
    public ReturnBitfield9Field returnBitfield9() {
        return returnBitfield9;
    }

    /**
     * BitSet OrderAcknowledgment byte 10.
     *
     * @return the ReturnBitfield10 field
     */
    public ReturnBitfield10Field returnBitfield10() {
        return returnBitfield10;
    }

    /**
     * BitSet OrderAcknowledgment byte 11.
     *
     * @return the ReturnBitfield11 field
     */
    public ReturnBitfield11Field returnBitfield11() {
        return returnBitfield11;
    }

    /**
     * BitSet OrderAcknowledgment byte 12.
     *
     * @return the ReturnBitfield12 field
     */
    public ReturnBitfield12Field returnBitfield12() {
        return returnBitfield12;
    }

    /**
     * BitSet OrderAcknowledgment byte 13.
     *
     * @return the ReturnBitfield13 field
     */
    public ReturnBitfield13Field returnBitfield13() {
        return returnBitfield13;
    }

    /**
     * BitSet OrderAcknowledgment byte 14.
     *
     * @return the ReturnBitfield14 field
     */
    public ReturnBitfield14Field returnBitfield14() {
        return returnBitfield14;
    }

    /**
     * BitSet OrderAcknowledgment byte 15.
     *
     * @return the ReturnBitfield15 field
     */
    public ReturnBitfield15Field returnBitfield15() {
        return returnBitfield15;
    }

    /**
     * BitSet OrderAcknowledgment byte 16.
     *
     * @return the ReturnBitfield16 field
     */
    public ReturnBitfield16Field returnBitfield16() {
        return returnBitfield16;
    }

    /**
     * BitSet OrderAcknowledgment byte 17.
     *
     * @return the ReturnBitfield17 field
     */
    public ReturnBitfield17Field returnBitfield17() {
        return returnBitfield17;
    }

    /**
     * Returns whether the fields before the ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield1 is on the wire
     */
    public boolean returnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield2 is on the wire
     */
    public boolean returnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield3 is on the wire
     */
    public boolean returnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield4 is on the wire
     */
    public boolean returnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield5 is on the wire
     */
    public boolean returnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield6 is on the wire
     */
    public boolean returnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield7 is on the wire
     */
    public boolean returnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield8 is on the wire
     */
    public boolean returnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield9 is on the wire
     */
    public boolean returnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield10 is on the wire
     */
    public boolean returnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield11 is on the wire
     */
    public boolean returnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield12 is on the wire
     */
    public boolean returnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield13 is on the wire
     */
    public boolean returnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield14 is on the wire
     */
    public boolean returnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield15 is on the wire
     */
    public boolean returnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield16 is on the wire
     */
    public boolean returnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield17 is on the wire
     */
    public boolean returnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    private boolean onWire(Field field) {
        return (field != returnBitfield1 || returnBitfield1Present()) && (field != returnBitfield2 || returnBitfield2Present()) && (field != returnBitfield3 || returnBitfield3Present()) && (field != returnBitfield4 || returnBitfield4Present()) && (field != returnBitfield5 || returnBitfield5Present()) && (field != returnBitfield6 || returnBitfield6Present()) && (field != returnBitfield7 || returnBitfield7Present()) && (field != returnBitfield8 || returnBitfield8Present()) && (field != returnBitfield9 || returnBitfield9Present()) && (field != returnBitfield10 || returnBitfield10Present()) && (field != returnBitfield11 || returnBitfield11Present()) && (field != returnBitfield12 || returnBitfield12Present()) && (field != returnBitfield13 || returnBitfield13Present()) && (field != returnBitfield14 || returnBitfield14Present()) && (field != returnBitfield15 || returnBitfield15Present()) && (field != returnBitfield16 || returnBitfield16Present()) && (field != returnBitfield17 || returnBitfield17Present());
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (returnBitfield1Present() ? ReturnBitfield1Field.BYTE_LENGTH : 0) + (returnBitfield2Present() ? ReturnBitfield2Field.BYTE_LENGTH : 0) + (returnBitfield3Present() ? ReturnBitfield3Field.BYTE_LENGTH : 0) + (returnBitfield4Present() ? ReturnBitfield4Field.BYTE_LENGTH : 0) + (returnBitfield5Present() ? ReturnBitfield5Field.BYTE_LENGTH : 0) + (returnBitfield6Present() ? ReturnBitfield6Field.BYTE_LENGTH : 0) + (returnBitfield7Present() ? ReturnBitfield7Field.BYTE_LENGTH : 0) + (returnBitfield8Present() ? ReturnBitfield8Field.BYTE_LENGTH : 0) + (returnBitfield9Present() ? ReturnBitfield9Field.BYTE_LENGTH : 0) + (returnBitfield10Present() ? ReturnBitfield10Field.BYTE_LENGTH : 0) + (returnBitfield11Present() ? ReturnBitfield11Field.BYTE_LENGTH : 0) + (returnBitfield12Present() ? ReturnBitfield12Field.BYTE_LENGTH : 0) + (returnBitfield13Present() ? ReturnBitfield13Field.BYTE_LENGTH : 0) + (returnBitfield14Present() ? ReturnBitfield14Field.BYTE_LENGTH : 0) + (returnBitfield15Present() ? ReturnBitfield15Field.BYTE_LENGTH : 0) + (returnBitfield16Present() ? ReturnBitfield16Field.BYTE_LENGTH : 0) + (returnBitfield17Present() ? ReturnBitfield17Field.BYTE_LENGTH : 0);
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 1;
        cursor += 1;
        if (returnBitfield1Present()) {
            cursor += 1;
        }
        if (returnBitfield2Present()) {
            cursor += 1;
        }
        if (returnBitfield3Present()) {
            cursor += 1;
        }
        if (returnBitfield4Present()) {
            cursor += 1;
        }
        if (returnBitfield5Present()) {
            cursor += 1;
        }
        if (returnBitfield6Present()) {
            cursor += 1;
        }
        if (returnBitfield7Present()) {
            cursor += 1;
        }
        if (returnBitfield8Present()) {
            cursor += 1;
        }
        if (returnBitfield9Present()) {
            cursor += 1;
        }
        if (returnBitfield10Present()) {
            cursor += 1;
        }
        if (returnBitfield11Present()) {
            cursor += 1;
        }
        if (returnBitfield12Present()) {
            cursor += 1;
        }
        if (returnBitfield13Present()) {
            cursor += 1;
        }
        if (returnBitfield14Present()) {
            cursor += 1;
        }
        if (returnBitfield15Present()) {
            cursor += 1;
        }
        if (returnBitfield16Present()) {
            cursor += 1;
        }
        if (returnBitfield17Present()) {
            cursor += 1;
        }
        return cursor;
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
        if (!messageType.parse(data, cursor)) {
            return false;
        }
        cursor += MessageTypeField.BYTE_LENGTH;
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (returnBitfield1Present()) {
            if (end - cursor < ReturnBitfield1Field.BYTE_LENGTH || !returnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield2Present()) {
            if (end - cursor < ReturnBitfield2Field.BYTE_LENGTH || !returnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield3Present()) {
            if (end - cursor < ReturnBitfield3Field.BYTE_LENGTH || !returnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield4Present()) {
            if (end - cursor < ReturnBitfield4Field.BYTE_LENGTH || !returnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield5Present()) {
            if (end - cursor < ReturnBitfield5Field.BYTE_LENGTH || !returnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield6Present()) {
            if (end - cursor < ReturnBitfield6Field.BYTE_LENGTH || !returnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield7Present()) {
            if (end - cursor < ReturnBitfield7Field.BYTE_LENGTH || !returnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield8Present()) {
            if (end - cursor < ReturnBitfield8Field.BYTE_LENGTH || !returnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield9Present()) {
            if (end - cursor < ReturnBitfield9Field.BYTE_LENGTH || !returnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield10Present()) {
            if (end - cursor < ReturnBitfield10Field.BYTE_LENGTH || !returnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield11Present()) {
            if (end - cursor < ReturnBitfield11Field.BYTE_LENGTH || !returnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield12Present()) {
            if (end - cursor < ReturnBitfield12Field.BYTE_LENGTH || !returnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield13Present()) {
            if (end - cursor < ReturnBitfield13Field.BYTE_LENGTH || !returnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield14Present()) {
            if (end - cursor < ReturnBitfield14Field.BYTE_LENGTH || !returnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield15Present()) {
            if (end - cursor < ReturnBitfield15Field.BYTE_LENGTH || !returnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield16Present()) {
            if (end - cursor < ReturnBitfield16Field.BYTE_LENGTH || !returnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield17Present()) {
            if (end - cursor < ReturnBitfield17Field.BYTE_LENGTH || !returnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (returnBitfield1Present() != returnBitfield1.hasValue()) {
            throw new IllegalStateException(returnBitfield1.hasValue() ? "returnBitfield1 holds a value the fields before it leave off the wire" : "returnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield2Present() != returnBitfield2.hasValue()) {
            throw new IllegalStateException(returnBitfield2.hasValue() ? "returnBitfield2 holds a value the fields before it leave off the wire" : "returnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield3Present() != returnBitfield3.hasValue()) {
            throw new IllegalStateException(returnBitfield3.hasValue() ? "returnBitfield3 holds a value the fields before it leave off the wire" : "returnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield4Present() != returnBitfield4.hasValue()) {
            throw new IllegalStateException(returnBitfield4.hasValue() ? "returnBitfield4 holds a value the fields before it leave off the wire" : "returnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield5Present() != returnBitfield5.hasValue()) {
            throw new IllegalStateException(returnBitfield5.hasValue() ? "returnBitfield5 holds a value the fields before it leave off the wire" : "returnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield6Present() != returnBitfield6.hasValue()) {
            throw new IllegalStateException(returnBitfield6.hasValue() ? "returnBitfield6 holds a value the fields before it leave off the wire" : "returnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield7Present() != returnBitfield7.hasValue()) {
            throw new IllegalStateException(returnBitfield7.hasValue() ? "returnBitfield7 holds a value the fields before it leave off the wire" : "returnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield8Present() != returnBitfield8.hasValue()) {
            throw new IllegalStateException(returnBitfield8.hasValue() ? "returnBitfield8 holds a value the fields before it leave off the wire" : "returnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield9Present() != returnBitfield9.hasValue()) {
            throw new IllegalStateException(returnBitfield9.hasValue() ? "returnBitfield9 holds a value the fields before it leave off the wire" : "returnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield10Present() != returnBitfield10.hasValue()) {
            throw new IllegalStateException(returnBitfield10.hasValue() ? "returnBitfield10 holds a value the fields before it leave off the wire" : "returnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield11Present() != returnBitfield11.hasValue()) {
            throw new IllegalStateException(returnBitfield11.hasValue() ? "returnBitfield11 holds a value the fields before it leave off the wire" : "returnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield12Present() != returnBitfield12.hasValue()) {
            throw new IllegalStateException(returnBitfield12.hasValue() ? "returnBitfield12 holds a value the fields before it leave off the wire" : "returnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield13Present() != returnBitfield13.hasValue()) {
            throw new IllegalStateException(returnBitfield13.hasValue() ? "returnBitfield13 holds a value the fields before it leave off the wire" : "returnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield14Present() != returnBitfield14.hasValue()) {
            throw new IllegalStateException(returnBitfield14.hasValue() ? "returnBitfield14 holds a value the fields before it leave off the wire" : "returnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield15Present() != returnBitfield15.hasValue()) {
            throw new IllegalStateException(returnBitfield15.hasValue() ? "returnBitfield15 holds a value the fields before it leave off the wire" : "returnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield16Present() != returnBitfield16.hasValue()) {
            throw new IllegalStateException(returnBitfield16.hasValue() ? "returnBitfield16 holds a value the fields before it leave off the wire" : "returnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield17Present() != returnBitfield17.hasValue()) {
            throw new IllegalStateException(returnBitfield17.hasValue() ? "returnBitfield17 holds a value the fields before it leave off the wire" : "returnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = messageType.encode(data, cursor);
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (returnBitfield1Present()) {
            cursor = returnBitfield1.encode(data, cursor);
        }
        if (returnBitfield2Present()) {
            cursor = returnBitfield2.encode(data, cursor);
        }
        if (returnBitfield3Present()) {
            cursor = returnBitfield3.encode(data, cursor);
        }
        if (returnBitfield4Present()) {
            cursor = returnBitfield4.encode(data, cursor);
        }
        if (returnBitfield5Present()) {
            cursor = returnBitfield5.encode(data, cursor);
        }
        if (returnBitfield6Present()) {
            cursor = returnBitfield6.encode(data, cursor);
        }
        if (returnBitfield7Present()) {
            cursor = returnBitfield7.encode(data, cursor);
        }
        if (returnBitfield8Present()) {
            cursor = returnBitfield8.encode(data, cursor);
        }
        if (returnBitfield9Present()) {
            cursor = returnBitfield9.encode(data, cursor);
        }
        if (returnBitfield10Present()) {
            cursor = returnBitfield10.encode(data, cursor);
        }
        if (returnBitfield11Present()) {
            cursor = returnBitfield11.encode(data, cursor);
        }
        if (returnBitfield12Present()) {
            cursor = returnBitfield12.encode(data, cursor);
        }
        if (returnBitfield13Present()) {
            cursor = returnBitfield13.encode(data, cursor);
        }
        if (returnBitfield14Present()) {
            cursor = returnBitfield14.encode(data, cursor);
        }
        if (returnBitfield15Present()) {
            cursor = returnBitfield15.encode(data, cursor);
        }
        if (returnBitfield16Present()) {
            cursor = returnBitfield16.encode(data, cursor);
        }
        if (returnBitfield17Present()) {
            cursor = returnBitfield17.encode(data, cursor);
        }
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
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
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
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "MessageType" -> Optional.of(messageType);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "ReturnBitfield1" -> Optional.of(returnBitfield1);
            case "ReturnBitfield2" -> Optional.of(returnBitfield2);
            case "ReturnBitfield3" -> Optional.of(returnBitfield3);
            case "ReturnBitfield4" -> Optional.of(returnBitfield4);
            case "ReturnBitfield5" -> Optional.of(returnBitfield5);
            case "ReturnBitfield6" -> Optional.of(returnBitfield6);
            case "ReturnBitfield7" -> Optional.of(returnBitfield7);
            case "ReturnBitfield8" -> Optional.of(returnBitfield8);
            case "ReturnBitfield9" -> Optional.of(returnBitfield9);
            case "ReturnBitfield10" -> Optional.of(returnBitfield10);
            case "ReturnBitfield11" -> Optional.of(returnBitfield11);
            case "ReturnBitfield12" -> Optional.of(returnBitfield12);
            case "ReturnBitfield13" -> Optional.of(returnBitfield13);
            case "ReturnBitfield14" -> Optional.of(returnBitfield14);
            case "ReturnBitfield15" -> Optional.of(returnBitfield15);
            case "ReturnBitfield16" -> Optional.of(returnBitfield16);
            case "ReturnBitfield17" -> Optional.of(returnBitfield17);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof ReturnBitfieldsParamGroup message)) {
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
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
        if (!(other instanceof ReturnBitfieldsParamGroup message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
