package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CancelledOrderCountField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClearingFirmField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MassCancelIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MassCancelLockOutField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NumberOfReturnBitfField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NumberOfReturnBitfieldsField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield10Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield11Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield12Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield13Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield14Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield15Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield16Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield17Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield18Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield19Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield1Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield2Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield3Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield4Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield5Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield6Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield7Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield8Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PurgeNotificationReturnBitfield9Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.RiskRootField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SourceMatchingUnitField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TransactionTimeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Represents the PurgeNotificationMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Purge Notification Message.</p>
 */
public final class PurgeNotificationMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 47;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Purge Notification Message";

    /**
     * Report send time (for audit).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Mass Cancel Id
     */
    private final MassCancelIdField massCancelId = new MassCancelIdField();

    /**
     * Number of orders cancelled. This field corresponds to CancelledOrderCount (7696) in Cboe FIX.
     */
    private final CancelledOrderCountField cancelledOrderCount = new CancelledOrderCountField();

    /**
     * Matching unit number on which orders were cancelled by Purge Orders. The default value of this field is '0' unless MassCancelInst, 2nd character = ‘I'. This field corresponds to MatchingUnit (25017) in Cboe FIX.
     */
    private final SourceMatchingUnitField sourceMatchingUnit = new SourceMatchingUnitField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Risk Root
     */
    private final RiskRootField riskRoot = new RiskRootField();

    /**
     * Reported back with the following possible values. Y = Lockout N = No Lockout This field corresponds to Lockout (7697) in Cboe FIX.
     */
    private final MassCancelLockOutField massCancelLockOut = new MassCancelLockOutField();

    /**
     * Number of bitfields to follow.
     */
    private final NumberOfReturnBitfField numberOfReturnBitf = new NumberOfReturnBitfField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet PurgeNotification byte 1.
     */
    private final PurgeNotificationReturnBitfield1Field purgeNotificationReturnBitfield1 = new PurgeNotificationReturnBitfield1Field();

    /**
     * BitSet PurgeNotification byte 2.
     */
    private final PurgeNotificationReturnBitfield2Field purgeNotificationReturnBitfield2 = new PurgeNotificationReturnBitfield2Field();

    /**
     * BitSet PurgeNotification byte 3.
     */
    private final PurgeNotificationReturnBitfield3Field purgeNotificationReturnBitfield3 = new PurgeNotificationReturnBitfield3Field();

    /**
     * BitSet PurgeNotification byte 4.
     */
    private final PurgeNotificationReturnBitfield4Field purgeNotificationReturnBitfield4 = new PurgeNotificationReturnBitfield4Field();

    /**
     * BitSet PurgeNotification byte 5.
     */
    private final PurgeNotificationReturnBitfield5Field purgeNotificationReturnBitfield5 = new PurgeNotificationReturnBitfield5Field();

    /**
     * BitSet PurgeNotification byte 6.
     */
    private final PurgeNotificationReturnBitfield6Field purgeNotificationReturnBitfield6 = new PurgeNotificationReturnBitfield6Field();

    /**
     * BitSet PurgeNotification byte 7.
     */
    private final PurgeNotificationReturnBitfield7Field purgeNotificationReturnBitfield7 = new PurgeNotificationReturnBitfield7Field();

    /**
     * BitSet PurgeNotification byte 8.
     */
    private final PurgeNotificationReturnBitfield8Field purgeNotificationReturnBitfield8 = new PurgeNotificationReturnBitfield8Field();

    /**
     * BitSet PurgeNotification byte 9.
     */
    private final PurgeNotificationReturnBitfield9Field purgeNotificationReturnBitfield9 = new PurgeNotificationReturnBitfield9Field();

    /**
     * BitSet PurgeNotification byte 10.
     */
    private final PurgeNotificationReturnBitfield10Field purgeNotificationReturnBitfield10 = new PurgeNotificationReturnBitfield10Field();

    /**
     * BitSet PurgeNotification byte 11.
     */
    private final PurgeNotificationReturnBitfield11Field purgeNotificationReturnBitfield11 = new PurgeNotificationReturnBitfield11Field();

    /**
     * BitSet PurgeNotification byte 12.
     */
    private final PurgeNotificationReturnBitfield12Field purgeNotificationReturnBitfield12 = new PurgeNotificationReturnBitfield12Field();

    /**
     * BitSet PurgeNotification byte 13.
     */
    private final PurgeNotificationReturnBitfield13Field purgeNotificationReturnBitfield13 = new PurgeNotificationReturnBitfield13Field();

    /**
     * BitSet PurgeNotification byte 14.
     */
    private final PurgeNotificationReturnBitfield14Field purgeNotificationReturnBitfield14 = new PurgeNotificationReturnBitfield14Field();

    /**
     * BitSet PurgeNotification byte 15.
     */
    private final PurgeNotificationReturnBitfield15Field purgeNotificationReturnBitfield15 = new PurgeNotificationReturnBitfield15Field();

    /**
     * BitSet PurgeNotification byte 16.
     */
    private final PurgeNotificationReturnBitfield16Field purgeNotificationReturnBitfield16 = new PurgeNotificationReturnBitfield16Field();

    /**
     * BitSet PurgeNotification byte 17.
     */
    private final PurgeNotificationReturnBitfield17Field purgeNotificationReturnBitfield17 = new PurgeNotificationReturnBitfield17Field();

    /**
     * BitSet PurgeNotification byte 18.
     */
    private final PurgeNotificationReturnBitfield18Field purgeNotificationReturnBitfield18 = new PurgeNotificationReturnBitfield18Field();

    /**
     * BitSet PurgeNotification byte 19.
     */
    private final PurgeNotificationReturnBitfield19Field purgeNotificationReturnBitfield19 = new PurgeNotificationReturnBitfield19Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, massCancelId, cancelledOrderCount, sourceMatchingUnit, clearingFirm, riskRoot, massCancelLockOut, numberOfReturnBitf, numberOfReturnBitfields, purgeNotificationReturnBitfield1, purgeNotificationReturnBitfield2, purgeNotificationReturnBitfield3, purgeNotificationReturnBitfield4, purgeNotificationReturnBitfield5, purgeNotificationReturnBitfield6, purgeNotificationReturnBitfield7, purgeNotificationReturnBitfield8, purgeNotificationReturnBitfield9, purgeNotificationReturnBitfield10, purgeNotificationReturnBitfield11, purgeNotificationReturnBitfield12, purgeNotificationReturnBitfield13, purgeNotificationReturnBitfield14, purgeNotificationReturnBitfield15, purgeNotificationReturnBitfield16, purgeNotificationReturnBitfield17, purgeNotificationReturnBitfield18, purgeNotificationReturnBitfield19);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Report send time (for audit).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Mass Cancel Id
     *
     * @return the MassCancelId field
     */
    public MassCancelIdField massCancelId() {
        return massCancelId;
    }

    /**
     * Number of orders cancelled. This field corresponds to CancelledOrderCount (7696) in Cboe FIX.
     *
     * @return the CancelledOrderCount field
     */
    public CancelledOrderCountField cancelledOrderCount() {
        return cancelledOrderCount;
    }

    /**
     * Matching unit number on which orders were cancelled by Purge Orders. The default value of this field is '0' unless MassCancelInst, 2nd character = ‘I'. This field corresponds to MatchingUnit (25017) in Cboe FIX.
     *
     * @return the SourceMatchingUnit field
     */
    public SourceMatchingUnitField sourceMatchingUnit() {
        return sourceMatchingUnit;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Risk Root
     *
     * @return the RiskRoot field
     */
    public RiskRootField riskRoot() {
        return riskRoot;
    }

    /**
     * Reported back with the following possible values. Y = Lockout N = No Lockout This field corresponds to Lockout (7697) in Cboe FIX.
     *
     * @return the MassCancelLockOut field
     */
    public MassCancelLockOutField massCancelLockOut() {
        return massCancelLockOut;
    }

    /**
     * Number of bitfields to follow.
     *
     * @return the NumberOfReturnBitf field
     */
    public NumberOfReturnBitfField numberOfReturnBitf() {
        return numberOfReturnBitf;
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
     * BitSet PurgeNotification byte 1.
     *
     * @return the PurgeNotificationReturnBitfield1 field
     */
    public PurgeNotificationReturnBitfield1Field purgeNotificationReturnBitfield1() {
        return purgeNotificationReturnBitfield1;
    }

    /**
     * BitSet PurgeNotification byte 2.
     *
     * @return the PurgeNotificationReturnBitfield2 field
     */
    public PurgeNotificationReturnBitfield2Field purgeNotificationReturnBitfield2() {
        return purgeNotificationReturnBitfield2;
    }

    /**
     * BitSet PurgeNotification byte 3.
     *
     * @return the PurgeNotificationReturnBitfield3 field
     */
    public PurgeNotificationReturnBitfield3Field purgeNotificationReturnBitfield3() {
        return purgeNotificationReturnBitfield3;
    }

    /**
     * BitSet PurgeNotification byte 4.
     *
     * @return the PurgeNotificationReturnBitfield4 field
     */
    public PurgeNotificationReturnBitfield4Field purgeNotificationReturnBitfield4() {
        return purgeNotificationReturnBitfield4;
    }

    /**
     * BitSet PurgeNotification byte 5.
     *
     * @return the PurgeNotificationReturnBitfield5 field
     */
    public PurgeNotificationReturnBitfield5Field purgeNotificationReturnBitfield5() {
        return purgeNotificationReturnBitfield5;
    }

    /**
     * BitSet PurgeNotification byte 6.
     *
     * @return the PurgeNotificationReturnBitfield6 field
     */
    public PurgeNotificationReturnBitfield6Field purgeNotificationReturnBitfield6() {
        return purgeNotificationReturnBitfield6;
    }

    /**
     * BitSet PurgeNotification byte 7.
     *
     * @return the PurgeNotificationReturnBitfield7 field
     */
    public PurgeNotificationReturnBitfield7Field purgeNotificationReturnBitfield7() {
        return purgeNotificationReturnBitfield7;
    }

    /**
     * BitSet PurgeNotification byte 8.
     *
     * @return the PurgeNotificationReturnBitfield8 field
     */
    public PurgeNotificationReturnBitfield8Field purgeNotificationReturnBitfield8() {
        return purgeNotificationReturnBitfield8;
    }

    /**
     * BitSet PurgeNotification byte 9.
     *
     * @return the PurgeNotificationReturnBitfield9 field
     */
    public PurgeNotificationReturnBitfield9Field purgeNotificationReturnBitfield9() {
        return purgeNotificationReturnBitfield9;
    }

    /**
     * BitSet PurgeNotification byte 10.
     *
     * @return the PurgeNotificationReturnBitfield10 field
     */
    public PurgeNotificationReturnBitfield10Field purgeNotificationReturnBitfield10() {
        return purgeNotificationReturnBitfield10;
    }

    /**
     * BitSet PurgeNotification byte 11.
     *
     * @return the PurgeNotificationReturnBitfield11 field
     */
    public PurgeNotificationReturnBitfield11Field purgeNotificationReturnBitfield11() {
        return purgeNotificationReturnBitfield11;
    }

    /**
     * BitSet PurgeNotification byte 12.
     *
     * @return the PurgeNotificationReturnBitfield12 field
     */
    public PurgeNotificationReturnBitfield12Field purgeNotificationReturnBitfield12() {
        return purgeNotificationReturnBitfield12;
    }

    /**
     * BitSet PurgeNotification byte 13.
     *
     * @return the PurgeNotificationReturnBitfield13 field
     */
    public PurgeNotificationReturnBitfield13Field purgeNotificationReturnBitfield13() {
        return purgeNotificationReturnBitfield13;
    }

    /**
     * BitSet PurgeNotification byte 14.
     *
     * @return the PurgeNotificationReturnBitfield14 field
     */
    public PurgeNotificationReturnBitfield14Field purgeNotificationReturnBitfield14() {
        return purgeNotificationReturnBitfield14;
    }

    /**
     * BitSet PurgeNotification byte 15.
     *
     * @return the PurgeNotificationReturnBitfield15 field
     */
    public PurgeNotificationReturnBitfield15Field purgeNotificationReturnBitfield15() {
        return purgeNotificationReturnBitfield15;
    }

    /**
     * BitSet PurgeNotification byte 16.
     *
     * @return the PurgeNotificationReturnBitfield16 field
     */
    public PurgeNotificationReturnBitfield16Field purgeNotificationReturnBitfield16() {
        return purgeNotificationReturnBitfield16;
    }

    /**
     * BitSet PurgeNotification byte 17.
     *
     * @return the PurgeNotificationReturnBitfield17 field
     */
    public PurgeNotificationReturnBitfield17Field purgeNotificationReturnBitfield17() {
        return purgeNotificationReturnBitfield17;
    }

    /**
     * BitSet PurgeNotification byte 18.
     *
     * @return the PurgeNotificationReturnBitfield18 field
     */
    public PurgeNotificationReturnBitfield18Field purgeNotificationReturnBitfield18() {
        return purgeNotificationReturnBitfield18;
    }

    /**
     * BitSet PurgeNotification byte 19.
     *
     * @return the PurgeNotificationReturnBitfield19 field
     */
    public PurgeNotificationReturnBitfield19Field purgeNotificationReturnBitfield19() {
        return purgeNotificationReturnBitfield19;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield1 is on the wire
     */
    public boolean purgeNotificationReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield2 is on the wire
     */
    public boolean purgeNotificationReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield3 is on the wire
     */
    public boolean purgeNotificationReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield4 is on the wire
     */
    public boolean purgeNotificationReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield5 is on the wire
     */
    public boolean purgeNotificationReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield6 is on the wire
     */
    public boolean purgeNotificationReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield7 is on the wire
     */
    public boolean purgeNotificationReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield8 is on the wire
     */
    public boolean purgeNotificationReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield9 is on the wire
     */
    public boolean purgeNotificationReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield10 is on the wire
     */
    public boolean purgeNotificationReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield11 is on the wire
     */
    public boolean purgeNotificationReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield12 is on the wire
     */
    public boolean purgeNotificationReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield13 is on the wire
     */
    public boolean purgeNotificationReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield14 is on the wire
     */
    public boolean purgeNotificationReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield15 is on the wire
     */
    public boolean purgeNotificationReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield16 is on the wire
     */
    public boolean purgeNotificationReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield17 is on the wire
     */
    public boolean purgeNotificationReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield18 is on the wire
     */
    public boolean purgeNotificationReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the PurgeNotificationReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the PurgeNotificationReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeNotificationReturnBitfield19 is on the wire
     */
    public boolean purgeNotificationReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    private boolean onWire(Field field) {
        return (field != purgeNotificationReturnBitfield1 || purgeNotificationReturnBitfield1Present()) && (field != purgeNotificationReturnBitfield2 || purgeNotificationReturnBitfield2Present()) && (field != purgeNotificationReturnBitfield3 || purgeNotificationReturnBitfield3Present()) && (field != purgeNotificationReturnBitfield4 || purgeNotificationReturnBitfield4Present()) && (field != purgeNotificationReturnBitfield5 || purgeNotificationReturnBitfield5Present()) && (field != purgeNotificationReturnBitfield6 || purgeNotificationReturnBitfield6Present()) && (field != purgeNotificationReturnBitfield7 || purgeNotificationReturnBitfield7Present()) && (field != purgeNotificationReturnBitfield8 || purgeNotificationReturnBitfield8Present()) && (field != purgeNotificationReturnBitfield9 || purgeNotificationReturnBitfield9Present()) && (field != purgeNotificationReturnBitfield10 || purgeNotificationReturnBitfield10Present()) && (field != purgeNotificationReturnBitfield11 || purgeNotificationReturnBitfield11Present()) && (field != purgeNotificationReturnBitfield12 || purgeNotificationReturnBitfield12Present()) && (field != purgeNotificationReturnBitfield13 || purgeNotificationReturnBitfield13Present()) && (field != purgeNotificationReturnBitfield14 || purgeNotificationReturnBitfield14Present()) && (field != purgeNotificationReturnBitfield15 || purgeNotificationReturnBitfield15Present()) && (field != purgeNotificationReturnBitfield16 || purgeNotificationReturnBitfield16Present()) && (field != purgeNotificationReturnBitfield17 || purgeNotificationReturnBitfield17Present()) && (field != purgeNotificationReturnBitfield18 || purgeNotificationReturnBitfield18Present()) && (field != purgeNotificationReturnBitfield19 || purgeNotificationReturnBitfield19Present());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (purgeNotificationReturnBitfield1Present() ? PurgeNotificationReturnBitfield1Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield2Present() ? PurgeNotificationReturnBitfield2Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield3Present() ? PurgeNotificationReturnBitfield3Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield4Present() ? PurgeNotificationReturnBitfield4Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield5Present() ? PurgeNotificationReturnBitfield5Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield6Present() ? PurgeNotificationReturnBitfield6Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield7Present() ? PurgeNotificationReturnBitfield7Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield8Present() ? PurgeNotificationReturnBitfield8Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield9Present() ? PurgeNotificationReturnBitfield9Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield10Present() ? PurgeNotificationReturnBitfield10Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield11Present() ? PurgeNotificationReturnBitfield11Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield12Present() ? PurgeNotificationReturnBitfield12Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield13Present() ? PurgeNotificationReturnBitfield13Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield14Present() ? PurgeNotificationReturnBitfield14Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield15Present() ? PurgeNotificationReturnBitfield15Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield16Present() ? PurgeNotificationReturnBitfield16Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield17Present() ? PurgeNotificationReturnBitfield17Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield18Present() ? PurgeNotificationReturnBitfield18Field.BYTE_LENGTH : 0) + (purgeNotificationReturnBitfield19Present() ? PurgeNotificationReturnBitfield19Field.BYTE_LENGTH : 0);
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
        cursor += 8;
        cursor += 20;
        cursor += 4;
        cursor += 1;
        cursor += 4;
        cursor += 6;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        cursor += 1;
        if (purgeNotificationReturnBitfield1Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield2Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield3Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield4Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield5Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield6Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield7Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield8Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield9Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield10Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield11Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield12Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield13Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield14Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield15Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield16Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield17Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield18Present()) {
            cursor += 1;
        }
        if (purgeNotificationReturnBitfield19Present()) {
            cursor += 1;
        }
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactionTime.value());
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
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!massCancelId.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelIdField.BYTE_LENGTH;
        if (!cancelledOrderCount.parse(data, cursor)) {
            return false;
        }
        cursor += CancelledOrderCountField.BYTE_LENGTH;
        if (!sourceMatchingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += SourceMatchingUnitField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!riskRoot.parse(data, cursor)) {
            return false;
        }
        cursor += RiskRootField.BYTE_LENGTH;
        if (!massCancelLockOut.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelLockOutField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitf.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfField.BYTE_LENGTH;
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (purgeNotificationReturnBitfield1Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield1Field.BYTE_LENGTH || !purgeNotificationReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield2Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield2Field.BYTE_LENGTH || !purgeNotificationReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield3Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield3Field.BYTE_LENGTH || !purgeNotificationReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield4Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield4Field.BYTE_LENGTH || !purgeNotificationReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield5Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield5Field.BYTE_LENGTH || !purgeNotificationReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield6Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield6Field.BYTE_LENGTH || !purgeNotificationReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield7Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield7Field.BYTE_LENGTH || !purgeNotificationReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield8Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield8Field.BYTE_LENGTH || !purgeNotificationReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield9Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield9Field.BYTE_LENGTH || !purgeNotificationReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield10Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield10Field.BYTE_LENGTH || !purgeNotificationReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield11Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield11Field.BYTE_LENGTH || !purgeNotificationReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield12Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield12Field.BYTE_LENGTH || !purgeNotificationReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield13Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield13Field.BYTE_LENGTH || !purgeNotificationReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield14Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield14Field.BYTE_LENGTH || !purgeNotificationReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield15Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield15Field.BYTE_LENGTH || !purgeNotificationReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield16Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield16Field.BYTE_LENGTH || !purgeNotificationReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield17Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield17Field.BYTE_LENGTH || !purgeNotificationReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield18Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield18Field.BYTE_LENGTH || !purgeNotificationReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeNotificationReturnBitfield19Present()) {
            if (end - cursor < PurgeNotificationReturnBitfield19Field.BYTE_LENGTH || !purgeNotificationReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeNotificationReturnBitfield19Field.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (purgeNotificationReturnBitfield1Present() != purgeNotificationReturnBitfield1.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield1.hasValue() ? "purgeNotificationReturnBitfield1 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield2Present() != purgeNotificationReturnBitfield2.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield2.hasValue() ? "purgeNotificationReturnBitfield2 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield3Present() != purgeNotificationReturnBitfield3.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield3.hasValue() ? "purgeNotificationReturnBitfield3 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield4Present() != purgeNotificationReturnBitfield4.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield4.hasValue() ? "purgeNotificationReturnBitfield4 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield5Present() != purgeNotificationReturnBitfield5.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield5.hasValue() ? "purgeNotificationReturnBitfield5 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield6Present() != purgeNotificationReturnBitfield6.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield6.hasValue() ? "purgeNotificationReturnBitfield6 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield7Present() != purgeNotificationReturnBitfield7.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield7.hasValue() ? "purgeNotificationReturnBitfield7 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield8Present() != purgeNotificationReturnBitfield8.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield8.hasValue() ? "purgeNotificationReturnBitfield8 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield9Present() != purgeNotificationReturnBitfield9.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield9.hasValue() ? "purgeNotificationReturnBitfield9 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield10Present() != purgeNotificationReturnBitfield10.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield10.hasValue() ? "purgeNotificationReturnBitfield10 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield11Present() != purgeNotificationReturnBitfield11.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield11.hasValue() ? "purgeNotificationReturnBitfield11 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield12Present() != purgeNotificationReturnBitfield12.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield12.hasValue() ? "purgeNotificationReturnBitfield12 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield13Present() != purgeNotificationReturnBitfield13.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield13.hasValue() ? "purgeNotificationReturnBitfield13 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield14Present() != purgeNotificationReturnBitfield14.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield14.hasValue() ? "purgeNotificationReturnBitfield14 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield15Present() != purgeNotificationReturnBitfield15.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield15.hasValue() ? "purgeNotificationReturnBitfield15 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield16Present() != purgeNotificationReturnBitfield16.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield16.hasValue() ? "purgeNotificationReturnBitfield16 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield17Present() != purgeNotificationReturnBitfield17.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield17.hasValue() ? "purgeNotificationReturnBitfield17 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield18Present() != purgeNotificationReturnBitfield18.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield18.hasValue() ? "purgeNotificationReturnBitfield18 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (purgeNotificationReturnBitfield19Present() != purgeNotificationReturnBitfield19.hasValue()) {
            throw new IllegalStateException(purgeNotificationReturnBitfield19.hasValue() ? "purgeNotificationReturnBitfield19 holds a value the fields before it leave off the wire" : "purgeNotificationReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = massCancelId.encode(data, cursor);
        cursor = cancelledOrderCount.encode(data, cursor);
        cursor = sourceMatchingUnit.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = riskRoot.encode(data, cursor);
        cursor = massCancelLockOut.encode(data, cursor);
        if (buffer != null && buffer.length >= 45) {
            System.arraycopy(buffer, 44, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitf.encode(data, cursor);
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (purgeNotificationReturnBitfield1Present()) {
            cursor = purgeNotificationReturnBitfield1.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield2Present()) {
            cursor = purgeNotificationReturnBitfield2.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield3Present()) {
            cursor = purgeNotificationReturnBitfield3.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield4Present()) {
            cursor = purgeNotificationReturnBitfield4.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield5Present()) {
            cursor = purgeNotificationReturnBitfield5.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield6Present()) {
            cursor = purgeNotificationReturnBitfield6.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield7Present()) {
            cursor = purgeNotificationReturnBitfield7.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield8Present()) {
            cursor = purgeNotificationReturnBitfield8.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield9Present()) {
            cursor = purgeNotificationReturnBitfield9.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield10Present()) {
            cursor = purgeNotificationReturnBitfield10.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield11Present()) {
            cursor = purgeNotificationReturnBitfield11.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield12Present()) {
            cursor = purgeNotificationReturnBitfield12.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield13Present()) {
            cursor = purgeNotificationReturnBitfield13.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield14Present()) {
            cursor = purgeNotificationReturnBitfield14.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield15Present()) {
            cursor = purgeNotificationReturnBitfield15.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield16Present()) {
            cursor = purgeNotificationReturnBitfield16.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield17Present()) {
            cursor = purgeNotificationReturnBitfield17.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield18Present()) {
            cursor = purgeNotificationReturnBitfield18.encode(data, cursor);
        }
        if (purgeNotificationReturnBitfield19Present()) {
            cursor = purgeNotificationReturnBitfield19.encode(data, cursor);
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
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "TransactionTime" -> Optional.of(transactionTime);
            case "MassCancelId" -> Optional.of(massCancelId);
            case "CancelledOrderCount" -> Optional.of(cancelledOrderCount);
            case "SourceMatchingUnit" -> Optional.of(sourceMatchingUnit);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "RiskRoot" -> Optional.of(riskRoot);
            case "MassCancelLockOut" -> Optional.of(massCancelLockOut);
            case "NumberOfReturnBitf" -> Optional.of(numberOfReturnBitf);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "PurgeNotificationReturnBitfield1" -> Optional.of(purgeNotificationReturnBitfield1);
            case "PurgeNotificationReturnBitfield2" -> Optional.of(purgeNotificationReturnBitfield2);
            case "PurgeNotificationReturnBitfield3" -> Optional.of(purgeNotificationReturnBitfield3);
            case "PurgeNotificationReturnBitfield4" -> Optional.of(purgeNotificationReturnBitfield4);
            case "PurgeNotificationReturnBitfield5" -> Optional.of(purgeNotificationReturnBitfield5);
            case "PurgeNotificationReturnBitfield6" -> Optional.of(purgeNotificationReturnBitfield6);
            case "PurgeNotificationReturnBitfield7" -> Optional.of(purgeNotificationReturnBitfield7);
            case "PurgeNotificationReturnBitfield8" -> Optional.of(purgeNotificationReturnBitfield8);
            case "PurgeNotificationReturnBitfield9" -> Optional.of(purgeNotificationReturnBitfield9);
            case "PurgeNotificationReturnBitfield10" -> Optional.of(purgeNotificationReturnBitfield10);
            case "PurgeNotificationReturnBitfield11" -> Optional.of(purgeNotificationReturnBitfield11);
            case "PurgeNotificationReturnBitfield12" -> Optional.of(purgeNotificationReturnBitfield12);
            case "PurgeNotificationReturnBitfield13" -> Optional.of(purgeNotificationReturnBitfield13);
            case "PurgeNotificationReturnBitfield14" -> Optional.of(purgeNotificationReturnBitfield14);
            case "PurgeNotificationReturnBitfield15" -> Optional.of(purgeNotificationReturnBitfield15);
            case "PurgeNotificationReturnBitfield16" -> Optional.of(purgeNotificationReturnBitfield16);
            case "PurgeNotificationReturnBitfield17" -> Optional.of(purgeNotificationReturnBitfield17);
            case "PurgeNotificationReturnBitfield18" -> Optional.of(purgeNotificationReturnBitfield18);
            case "PurgeNotificationReturnBitfield19" -> Optional.of(purgeNotificationReturnBitfield19);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PurgeNotificationMessage message)) {
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
        if (!(other instanceof PurgeNotificationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
