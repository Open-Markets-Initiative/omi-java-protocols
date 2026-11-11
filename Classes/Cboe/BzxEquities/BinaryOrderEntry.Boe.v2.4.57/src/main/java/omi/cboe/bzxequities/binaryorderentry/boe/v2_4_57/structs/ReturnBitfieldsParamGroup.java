package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MessageTypeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield10Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield11Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield12Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield13Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield14Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield15Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield16Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield17Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield18Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield19Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield20Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield21Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield22Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield3Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield4Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield5Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield6Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield7Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield8Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield9Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.GroupEntry;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

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
     * Return message type for which the bitfields are being specified (e.g., 0x25 for an Order Acknowledgment message).
     */
    private final MessageTypeField messageType = new MessageTypeField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderAcknowledgment byte 1.
     */
    private final OrderAcknowledgmentReturnBitfield1Field orderAcknowledgmentReturnBitfield1 = new OrderAcknowledgmentReturnBitfield1Field();

    /**
     * BitSet OrderAcknowledgment byte 2.
     */
    private final OrderAcknowledgmentReturnBitfield2Field orderAcknowledgmentReturnBitfield2 = new OrderAcknowledgmentReturnBitfield2Field();

    /**
     * BitSet OrderAcknowledgment byte 3.
     */
    private final OrderAcknowledgmentReturnBitfield3Field orderAcknowledgmentReturnBitfield3 = new OrderAcknowledgmentReturnBitfield3Field();

    /**
     * BitSet OrderAcknowledgment byte 4.
     */
    private final OrderAcknowledgmentReturnBitfield4Field orderAcknowledgmentReturnBitfield4 = new OrderAcknowledgmentReturnBitfield4Field();

    /**
     * BitSet OrderAcknowledgment byte 5.
     */
    private final OrderAcknowledgmentReturnBitfield5Field orderAcknowledgmentReturnBitfield5 = new OrderAcknowledgmentReturnBitfield5Field();

    /**
     * BitSet OrderAcknowledgment byte 6.
     */
    private final OrderAcknowledgmentReturnBitfield6Field orderAcknowledgmentReturnBitfield6 = new OrderAcknowledgmentReturnBitfield6Field();

    /**
     * BitSet OrderAcknowledgment byte 7.
     */
    private final OrderAcknowledgmentReturnBitfield7Field orderAcknowledgmentReturnBitfield7 = new OrderAcknowledgmentReturnBitfield7Field();

    /**
     * BitSet OrderAcknowledgment byte 8.
     */
    private final OrderAcknowledgmentReturnBitfield8Field orderAcknowledgmentReturnBitfield8 = new OrderAcknowledgmentReturnBitfield8Field();

    /**
     * BitSet OrderAcknowledgment byte 9.
     */
    private final OrderAcknowledgmentReturnBitfield9Field orderAcknowledgmentReturnBitfield9 = new OrderAcknowledgmentReturnBitfield9Field();

    /**
     * BitSet OrderAcknowledgment byte 10.
     */
    private final OrderAcknowledgmentReturnBitfield10Field orderAcknowledgmentReturnBitfield10 = new OrderAcknowledgmentReturnBitfield10Field();

    /**
     * BitSet OrderAcknowledgment byte 11.
     */
    private final OrderAcknowledgmentReturnBitfield11Field orderAcknowledgmentReturnBitfield11 = new OrderAcknowledgmentReturnBitfield11Field();

    /**
     * BitSet OrderAcknowledgment byte 12.
     */
    private final OrderAcknowledgmentReturnBitfield12Field orderAcknowledgmentReturnBitfield12 = new OrderAcknowledgmentReturnBitfield12Field();

    /**
     * BitSet OrderAcknowledgment byte 13.
     */
    private final OrderAcknowledgmentReturnBitfield13Field orderAcknowledgmentReturnBitfield13 = new OrderAcknowledgmentReturnBitfield13Field();

    /**
     * BitSet OrderAcknowledgment byte 14.
     */
    private final OrderAcknowledgmentReturnBitfield14Field orderAcknowledgmentReturnBitfield14 = new OrderAcknowledgmentReturnBitfield14Field();

    /**
     * BitSet OrderAcknowledgment byte 15.
     */
    private final OrderAcknowledgmentReturnBitfield15Field orderAcknowledgmentReturnBitfield15 = new OrderAcknowledgmentReturnBitfield15Field();

    /**
     * BitSet OrderAcknowledgment byte 16.
     */
    private final OrderAcknowledgmentReturnBitfield16Field orderAcknowledgmentReturnBitfield16 = new OrderAcknowledgmentReturnBitfield16Field();

    /**
     * BitSet OrderAcknowledgment byte 17.
     */
    private final OrderAcknowledgmentReturnBitfield17Field orderAcknowledgmentReturnBitfield17 = new OrderAcknowledgmentReturnBitfield17Field();

    /**
     * BitSet OrderAcknowledgment byte 18.
     */
    private final OrderAcknowledgmentReturnBitfield18Field orderAcknowledgmentReturnBitfield18 = new OrderAcknowledgmentReturnBitfield18Field();

    /**
     * BitSet OrderAcknowledgment byte 19.
     */
    private final OrderAcknowledgmentReturnBitfield19Field orderAcknowledgmentReturnBitfield19 = new OrderAcknowledgmentReturnBitfield19Field();

    /**
     * BitSet OrderAcknowledgment byte 20.
     */
    private final OrderAcknowledgmentReturnBitfield20Field orderAcknowledgmentReturnBitfield20 = new OrderAcknowledgmentReturnBitfield20Field();

    /**
     * BitSet OrderAcknowledgment byte 21.
     */
    private final OrderAcknowledgmentReturnBitfield21Field orderAcknowledgmentReturnBitfield21 = new OrderAcknowledgmentReturnBitfield21Field();

    /**
     * BitSet OrderAcknowledgment byte 22.
     */
    private final OrderAcknowledgmentReturnBitfield22Field orderAcknowledgmentReturnBitfield22 = new OrderAcknowledgmentReturnBitfield22Field();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(messageType, numberOfReturnBitfields, orderAcknowledgmentReturnBitfield1, orderAcknowledgmentReturnBitfield2, orderAcknowledgmentReturnBitfield3, orderAcknowledgmentReturnBitfield4, orderAcknowledgmentReturnBitfield5, orderAcknowledgmentReturnBitfield6, orderAcknowledgmentReturnBitfield7, orderAcknowledgmentReturnBitfield8, orderAcknowledgmentReturnBitfield9, orderAcknowledgmentReturnBitfield10, orderAcknowledgmentReturnBitfield11, orderAcknowledgmentReturnBitfield12, orderAcknowledgmentReturnBitfield13, orderAcknowledgmentReturnBitfield14, orderAcknowledgmentReturnBitfield15, orderAcknowledgmentReturnBitfield16, orderAcknowledgmentReturnBitfield17, orderAcknowledgmentReturnBitfield18, orderAcknowledgmentReturnBitfield19, orderAcknowledgmentReturnBitfield20, orderAcknowledgmentReturnBitfield21, orderAcknowledgmentReturnBitfield22);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Return message type for which the bitfields are being specified (e.g., 0x25 for an Order Acknowledgment message).
     *
     * @return the MessageType field
     */
    public MessageTypeField messageType() {
        return messageType;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfReturnBitfields field
     */
    public NumberOfReturnBitfieldsField numberOfReturnBitfields() {
        return numberOfReturnBitfields;
    }

    /**
     * BitSet OrderAcknowledgment byte 1.
     *
     * @return the OrderAcknowledgmentReturnBitfield1 field
     */
    public OrderAcknowledgmentReturnBitfield1Field orderAcknowledgmentReturnBitfield1() {
        return orderAcknowledgmentReturnBitfield1;
    }

    /**
     * BitSet OrderAcknowledgment byte 2.
     *
     * @return the OrderAcknowledgmentReturnBitfield2 field
     */
    public OrderAcknowledgmentReturnBitfield2Field orderAcknowledgmentReturnBitfield2() {
        return orderAcknowledgmentReturnBitfield2;
    }

    /**
     * BitSet OrderAcknowledgment byte 3.
     *
     * @return the OrderAcknowledgmentReturnBitfield3 field
     */
    public OrderAcknowledgmentReturnBitfield3Field orderAcknowledgmentReturnBitfield3() {
        return orderAcknowledgmentReturnBitfield3;
    }

    /**
     * BitSet OrderAcknowledgment byte 4.
     *
     * @return the OrderAcknowledgmentReturnBitfield4 field
     */
    public OrderAcknowledgmentReturnBitfield4Field orderAcknowledgmentReturnBitfield4() {
        return orderAcknowledgmentReturnBitfield4;
    }

    /**
     * BitSet OrderAcknowledgment byte 5.
     *
     * @return the OrderAcknowledgmentReturnBitfield5 field
     */
    public OrderAcknowledgmentReturnBitfield5Field orderAcknowledgmentReturnBitfield5() {
        return orderAcknowledgmentReturnBitfield5;
    }

    /**
     * BitSet OrderAcknowledgment byte 6.
     *
     * @return the OrderAcknowledgmentReturnBitfield6 field
     */
    public OrderAcknowledgmentReturnBitfield6Field orderAcknowledgmentReturnBitfield6() {
        return orderAcknowledgmentReturnBitfield6;
    }

    /**
     * BitSet OrderAcknowledgment byte 7.
     *
     * @return the OrderAcknowledgmentReturnBitfield7 field
     */
    public OrderAcknowledgmentReturnBitfield7Field orderAcknowledgmentReturnBitfield7() {
        return orderAcknowledgmentReturnBitfield7;
    }

    /**
     * BitSet OrderAcknowledgment byte 8.
     *
     * @return the OrderAcknowledgmentReturnBitfield8 field
     */
    public OrderAcknowledgmentReturnBitfield8Field orderAcknowledgmentReturnBitfield8() {
        return orderAcknowledgmentReturnBitfield8;
    }

    /**
     * BitSet OrderAcknowledgment byte 9.
     *
     * @return the OrderAcknowledgmentReturnBitfield9 field
     */
    public OrderAcknowledgmentReturnBitfield9Field orderAcknowledgmentReturnBitfield9() {
        return orderAcknowledgmentReturnBitfield9;
    }

    /**
     * BitSet OrderAcknowledgment byte 10.
     *
     * @return the OrderAcknowledgmentReturnBitfield10 field
     */
    public OrderAcknowledgmentReturnBitfield10Field orderAcknowledgmentReturnBitfield10() {
        return orderAcknowledgmentReturnBitfield10;
    }

    /**
     * BitSet OrderAcknowledgment byte 11.
     *
     * @return the OrderAcknowledgmentReturnBitfield11 field
     */
    public OrderAcknowledgmentReturnBitfield11Field orderAcknowledgmentReturnBitfield11() {
        return orderAcknowledgmentReturnBitfield11;
    }

    /**
     * BitSet OrderAcknowledgment byte 12.
     *
     * @return the OrderAcknowledgmentReturnBitfield12 field
     */
    public OrderAcknowledgmentReturnBitfield12Field orderAcknowledgmentReturnBitfield12() {
        return orderAcknowledgmentReturnBitfield12;
    }

    /**
     * BitSet OrderAcknowledgment byte 13.
     *
     * @return the OrderAcknowledgmentReturnBitfield13 field
     */
    public OrderAcknowledgmentReturnBitfield13Field orderAcknowledgmentReturnBitfield13() {
        return orderAcknowledgmentReturnBitfield13;
    }

    /**
     * BitSet OrderAcknowledgment byte 14.
     *
     * @return the OrderAcknowledgmentReturnBitfield14 field
     */
    public OrderAcknowledgmentReturnBitfield14Field orderAcknowledgmentReturnBitfield14() {
        return orderAcknowledgmentReturnBitfield14;
    }

    /**
     * BitSet OrderAcknowledgment byte 15.
     *
     * @return the OrderAcknowledgmentReturnBitfield15 field
     */
    public OrderAcknowledgmentReturnBitfield15Field orderAcknowledgmentReturnBitfield15() {
        return orderAcknowledgmentReturnBitfield15;
    }

    /**
     * BitSet OrderAcknowledgment byte 16.
     *
     * @return the OrderAcknowledgmentReturnBitfield16 field
     */
    public OrderAcknowledgmentReturnBitfield16Field orderAcknowledgmentReturnBitfield16() {
        return orderAcknowledgmentReturnBitfield16;
    }

    /**
     * BitSet OrderAcknowledgment byte 17.
     *
     * @return the OrderAcknowledgmentReturnBitfield17 field
     */
    public OrderAcknowledgmentReturnBitfield17Field orderAcknowledgmentReturnBitfield17() {
        return orderAcknowledgmentReturnBitfield17;
    }

    /**
     * BitSet OrderAcknowledgment byte 18.
     *
     * @return the OrderAcknowledgmentReturnBitfield18 field
     */
    public OrderAcknowledgmentReturnBitfield18Field orderAcknowledgmentReturnBitfield18() {
        return orderAcknowledgmentReturnBitfield18;
    }

    /**
     * BitSet OrderAcknowledgment byte 19.
     *
     * @return the OrderAcknowledgmentReturnBitfield19 field
     */
    public OrderAcknowledgmentReturnBitfield19Field orderAcknowledgmentReturnBitfield19() {
        return orderAcknowledgmentReturnBitfield19;
    }

    /**
     * BitSet OrderAcknowledgment byte 20.
     *
     * @return the OrderAcknowledgmentReturnBitfield20 field
     */
    public OrderAcknowledgmentReturnBitfield20Field orderAcknowledgmentReturnBitfield20() {
        return orderAcknowledgmentReturnBitfield20;
    }

    /**
     * BitSet OrderAcknowledgment byte 21.
     *
     * @return the OrderAcknowledgmentReturnBitfield21 field
     */
    public OrderAcknowledgmentReturnBitfield21Field orderAcknowledgmentReturnBitfield21() {
        return orderAcknowledgmentReturnBitfield21;
    }

    /**
     * BitSet OrderAcknowledgment byte 22.
     *
     * @return the OrderAcknowledgmentReturnBitfield22 field
     */
    public OrderAcknowledgmentReturnBitfield22Field orderAcknowledgmentReturnBitfield22() {
        return orderAcknowledgmentReturnBitfield22;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield1 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield2 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield3 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield4 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield5 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield6 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield7 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield8 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield9 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield10 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield11 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield12 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield13 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield14 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield15 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield16 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield17 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield18 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield19 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield20 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield21 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield21Present() {
        return numberOfReturnBitfields.value() >= 21L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield22 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield22 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield22 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield22Present() {
        return numberOfReturnBitfields.value() >= 22L;
    }

    private boolean onWire(Field field) {
        return (field != orderAcknowledgmentReturnBitfield1 || orderAcknowledgmentReturnBitfield1Present()) && (field != orderAcknowledgmentReturnBitfield2 || orderAcknowledgmentReturnBitfield2Present()) && (field != orderAcknowledgmentReturnBitfield3 || orderAcknowledgmentReturnBitfield3Present()) && (field != orderAcknowledgmentReturnBitfield4 || orderAcknowledgmentReturnBitfield4Present()) && (field != orderAcknowledgmentReturnBitfield5 || orderAcknowledgmentReturnBitfield5Present()) && (field != orderAcknowledgmentReturnBitfield6 || orderAcknowledgmentReturnBitfield6Present()) && (field != orderAcknowledgmentReturnBitfield7 || orderAcknowledgmentReturnBitfield7Present()) && (field != orderAcknowledgmentReturnBitfield8 || orderAcknowledgmentReturnBitfield8Present()) && (field != orderAcknowledgmentReturnBitfield9 || orderAcknowledgmentReturnBitfield9Present()) && (field != orderAcknowledgmentReturnBitfield10 || orderAcknowledgmentReturnBitfield10Present()) && (field != orderAcknowledgmentReturnBitfield11 || orderAcknowledgmentReturnBitfield11Present()) && (field != orderAcknowledgmentReturnBitfield12 || orderAcknowledgmentReturnBitfield12Present()) && (field != orderAcknowledgmentReturnBitfield13 || orderAcknowledgmentReturnBitfield13Present()) && (field != orderAcknowledgmentReturnBitfield14 || orderAcknowledgmentReturnBitfield14Present()) && (field != orderAcknowledgmentReturnBitfield15 || orderAcknowledgmentReturnBitfield15Present()) && (field != orderAcknowledgmentReturnBitfield16 || orderAcknowledgmentReturnBitfield16Present()) && (field != orderAcknowledgmentReturnBitfield17 || orderAcknowledgmentReturnBitfield17Present()) && (field != orderAcknowledgmentReturnBitfield18 || orderAcknowledgmentReturnBitfield18Present()) && (field != orderAcknowledgmentReturnBitfield19 || orderAcknowledgmentReturnBitfield19Present()) && (field != orderAcknowledgmentReturnBitfield20 || orderAcknowledgmentReturnBitfield20Present()) && (field != orderAcknowledgmentReturnBitfield21 || orderAcknowledgmentReturnBitfield21Present()) && (field != orderAcknowledgmentReturnBitfield22 || orderAcknowledgmentReturnBitfield22Present());
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderAcknowledgmentReturnBitfield1Present() ? OrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield2Present() ? OrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield3Present() ? OrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield4Present() ? OrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield5Present() ? OrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield6Present() ? OrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield7Present() ? OrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield8Present() ? OrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield9Present() ? OrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield10Present() ? OrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield11Present() ? OrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield12Present() ? OrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield13Present() ? OrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield14Present() ? OrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield15Present() ? OrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield16Present() ? OrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield17Present() ? OrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield18Present() ? OrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield19Present() ? OrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield20Present() ? OrderAcknowledgmentReturnBitfield20Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield21Present() ? OrderAcknowledgmentReturnBitfield21Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield22Present() ? OrderAcknowledgmentReturnBitfield22Field.BYTE_LENGTH : 0);
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
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
        if (orderAcknowledgmentReturnBitfield1Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield2Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield3Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield4Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield5Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield6Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield7Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield8Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield9Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield10Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield11Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield12Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield13Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield14Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield15Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield16Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield17Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield18Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield19Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield20Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield20Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield21Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield21Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield21Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield22Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield22Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield22.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield22Field.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderAcknowledgmentReturnBitfield1Present() != orderAcknowledgmentReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield1.hasValue() ? "orderAcknowledgmentReturnBitfield1 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield2Present() != orderAcknowledgmentReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield2.hasValue() ? "orderAcknowledgmentReturnBitfield2 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield3Present() != orderAcknowledgmentReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield3.hasValue() ? "orderAcknowledgmentReturnBitfield3 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield4Present() != orderAcknowledgmentReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield4.hasValue() ? "orderAcknowledgmentReturnBitfield4 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield5Present() != orderAcknowledgmentReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield5.hasValue() ? "orderAcknowledgmentReturnBitfield5 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield6Present() != orderAcknowledgmentReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield6.hasValue() ? "orderAcknowledgmentReturnBitfield6 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield7Present() != orderAcknowledgmentReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield7.hasValue() ? "orderAcknowledgmentReturnBitfield7 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield8Present() != orderAcknowledgmentReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield8.hasValue() ? "orderAcknowledgmentReturnBitfield8 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield9Present() != orderAcknowledgmentReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield9.hasValue() ? "orderAcknowledgmentReturnBitfield9 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield10Present() != orderAcknowledgmentReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield10.hasValue() ? "orderAcknowledgmentReturnBitfield10 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield11Present() != orderAcknowledgmentReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield11.hasValue() ? "orderAcknowledgmentReturnBitfield11 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield12Present() != orderAcknowledgmentReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield12.hasValue() ? "orderAcknowledgmentReturnBitfield12 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield13Present() != orderAcknowledgmentReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield13.hasValue() ? "orderAcknowledgmentReturnBitfield13 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield14Present() != orderAcknowledgmentReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield14.hasValue() ? "orderAcknowledgmentReturnBitfield14 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield15Present() != orderAcknowledgmentReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield15.hasValue() ? "orderAcknowledgmentReturnBitfield15 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield16Present() != orderAcknowledgmentReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield16.hasValue() ? "orderAcknowledgmentReturnBitfield16 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield17Present() != orderAcknowledgmentReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield17.hasValue() ? "orderAcknowledgmentReturnBitfield17 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield18Present() != orderAcknowledgmentReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield18.hasValue() ? "orderAcknowledgmentReturnBitfield18 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield19Present() != orderAcknowledgmentReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield19.hasValue() ? "orderAcknowledgmentReturnBitfield19 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield20Present() != orderAcknowledgmentReturnBitfield20.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield20.hasValue() ? "orderAcknowledgmentReturnBitfield20 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield21Present() != orderAcknowledgmentReturnBitfield21.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield21.hasValue() ? "orderAcknowledgmentReturnBitfield21 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield21 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield22Present() != orderAcknowledgmentReturnBitfield22.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield22.hasValue() ? "orderAcknowledgmentReturnBitfield22 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield22 holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = messageType.encode(data, cursor);
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderAcknowledgmentReturnBitfield1Present()) {
            cursor = orderAcknowledgmentReturnBitfield1.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield2Present()) {
            cursor = orderAcknowledgmentReturnBitfield2.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield3Present()) {
            cursor = orderAcknowledgmentReturnBitfield3.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield4Present()) {
            cursor = orderAcknowledgmentReturnBitfield4.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield5Present()) {
            cursor = orderAcknowledgmentReturnBitfield5.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield6Present()) {
            cursor = orderAcknowledgmentReturnBitfield6.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield7Present()) {
            cursor = orderAcknowledgmentReturnBitfield7.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield8Present()) {
            cursor = orderAcknowledgmentReturnBitfield8.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield9Present()) {
            cursor = orderAcknowledgmentReturnBitfield9.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield10Present()) {
            cursor = orderAcknowledgmentReturnBitfield10.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield11Present()) {
            cursor = orderAcknowledgmentReturnBitfield11.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield12Present()) {
            cursor = orderAcknowledgmentReturnBitfield12.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield13Present()) {
            cursor = orderAcknowledgmentReturnBitfield13.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield14Present()) {
            cursor = orderAcknowledgmentReturnBitfield14.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield15Present()) {
            cursor = orderAcknowledgmentReturnBitfield15.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield16Present()) {
            cursor = orderAcknowledgmentReturnBitfield16.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield17Present()) {
            cursor = orderAcknowledgmentReturnBitfield17.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield18Present()) {
            cursor = orderAcknowledgmentReturnBitfield18.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield19Present()) {
            cursor = orderAcknowledgmentReturnBitfield19.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield20Present()) {
            cursor = orderAcknowledgmentReturnBitfield20.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield21Present()) {
            cursor = orderAcknowledgmentReturnBitfield21.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield22Present()) {
            cursor = orderAcknowledgmentReturnBitfield22.encode(data, cursor);
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
            case "OrderAcknowledgmentReturnBitfield1" -> Optional.of(orderAcknowledgmentReturnBitfield1);
            case "OrderAcknowledgmentReturnBitfield2" -> Optional.of(orderAcknowledgmentReturnBitfield2);
            case "OrderAcknowledgmentReturnBitfield3" -> Optional.of(orderAcknowledgmentReturnBitfield3);
            case "OrderAcknowledgmentReturnBitfield4" -> Optional.of(orderAcknowledgmentReturnBitfield4);
            case "OrderAcknowledgmentReturnBitfield5" -> Optional.of(orderAcknowledgmentReturnBitfield5);
            case "OrderAcknowledgmentReturnBitfield6" -> Optional.of(orderAcknowledgmentReturnBitfield6);
            case "OrderAcknowledgmentReturnBitfield7" -> Optional.of(orderAcknowledgmentReturnBitfield7);
            case "OrderAcknowledgmentReturnBitfield8" -> Optional.of(orderAcknowledgmentReturnBitfield8);
            case "OrderAcknowledgmentReturnBitfield9" -> Optional.of(orderAcknowledgmentReturnBitfield9);
            case "OrderAcknowledgmentReturnBitfield10" -> Optional.of(orderAcknowledgmentReturnBitfield10);
            case "OrderAcknowledgmentReturnBitfield11" -> Optional.of(orderAcknowledgmentReturnBitfield11);
            case "OrderAcknowledgmentReturnBitfield12" -> Optional.of(orderAcknowledgmentReturnBitfield12);
            case "OrderAcknowledgmentReturnBitfield13" -> Optional.of(orderAcknowledgmentReturnBitfield13);
            case "OrderAcknowledgmentReturnBitfield14" -> Optional.of(orderAcknowledgmentReturnBitfield14);
            case "OrderAcknowledgmentReturnBitfield15" -> Optional.of(orderAcknowledgmentReturnBitfield15);
            case "OrderAcknowledgmentReturnBitfield16" -> Optional.of(orderAcknowledgmentReturnBitfield16);
            case "OrderAcknowledgmentReturnBitfield17" -> Optional.of(orderAcknowledgmentReturnBitfield17);
            case "OrderAcknowledgmentReturnBitfield18" -> Optional.of(orderAcknowledgmentReturnBitfield18);
            case "OrderAcknowledgmentReturnBitfield19" -> Optional.of(orderAcknowledgmentReturnBitfield19);
            case "OrderAcknowledgmentReturnBitfield20" -> Optional.of(orderAcknowledgmentReturnBitfield20);
            case "OrderAcknowledgmentReturnBitfield21" -> Optional.of(orderAcknowledgmentReturnBitfield21);
            case "OrderAcknowledgmentReturnBitfield22" -> Optional.of(orderAcknowledgmentReturnBitfield22);
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
