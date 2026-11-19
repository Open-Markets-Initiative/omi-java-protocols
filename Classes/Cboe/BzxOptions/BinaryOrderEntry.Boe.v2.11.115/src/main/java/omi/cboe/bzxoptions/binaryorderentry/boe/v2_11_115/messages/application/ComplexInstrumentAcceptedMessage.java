package omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ClOrdIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield10Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield11Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield12Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield13Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield14Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield15Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield16Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield17Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield18Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield19Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield1Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield20Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield21Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield2Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield3Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield4Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield5Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield6Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield7Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield8Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ComplexInstrumentAcceptedReturnBitfield9Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.LegCfiCodeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.LegMaturityDateField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.LegStrikePriceField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.NoLegsField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.NoOfSecuritiesField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.NumberOfReturnBitfField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.RevisedLegsField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.SymbolAlphanumericField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.TransactionTimeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.groups.ComplexLegEntry;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.groups.ComplexLegList;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Represents the ComplexInstrumentAcceptedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Complex Instrument Accepted Message.</p>
 */
public final class ComplexInstrumentAcceptedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 45;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Instrument Accepted Message";

    /**
     * Report send time (for audit).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField symbolAlphanumeric = new SymbolAlphanumericField();

    /**
     * Indicates if the legs on the created complex strategy have been reordered from the original request. If the legs were reordered, the order of the Open- Close fields on a New Complex Order must be the order returned by the exchange, not the order from the original request. 1 = Legs were not reordered 2 = Legs were reordered
     */
    private final RevisedLegsField revisedLegs = new RevisedLegsField();

    /**
     * Corresponds to NoOfSecurities (8641) in Cboe FIX. Indicates the number of securities created by the member in the trading session.
     */
    private final NoOfSecuritiesField noOfSecurities = new NoOfSecuritiesField();

    /**
     * Number of bitfields to follow.
     */
    private final NumberOfReturnBitfField numberOfReturnBitf = new NumberOfReturnBitfField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet ComplexInstrumentAccepted byte 1.
     */
    private final ComplexInstrumentAcceptedReturnBitfield1Field complexInstrumentAcceptedReturnBitfield1 = new ComplexInstrumentAcceptedReturnBitfield1Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 2.
     */
    private final ComplexInstrumentAcceptedReturnBitfield2Field complexInstrumentAcceptedReturnBitfield2 = new ComplexInstrumentAcceptedReturnBitfield2Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 3.
     */
    private final ComplexInstrumentAcceptedReturnBitfield3Field complexInstrumentAcceptedReturnBitfield3 = new ComplexInstrumentAcceptedReturnBitfield3Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 4.
     */
    private final ComplexInstrumentAcceptedReturnBitfield4Field complexInstrumentAcceptedReturnBitfield4 = new ComplexInstrumentAcceptedReturnBitfield4Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 5.
     */
    private final ComplexInstrumentAcceptedReturnBitfield5Field complexInstrumentAcceptedReturnBitfield5 = new ComplexInstrumentAcceptedReturnBitfield5Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 6.
     */
    private final ComplexInstrumentAcceptedReturnBitfield6Field complexInstrumentAcceptedReturnBitfield6 = new ComplexInstrumentAcceptedReturnBitfield6Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 7.
     */
    private final ComplexInstrumentAcceptedReturnBitfield7Field complexInstrumentAcceptedReturnBitfield7 = new ComplexInstrumentAcceptedReturnBitfield7Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 8.
     */
    private final ComplexInstrumentAcceptedReturnBitfield8Field complexInstrumentAcceptedReturnBitfield8 = new ComplexInstrumentAcceptedReturnBitfield8Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 9.
     */
    private final ComplexInstrumentAcceptedReturnBitfield9Field complexInstrumentAcceptedReturnBitfield9 = new ComplexInstrumentAcceptedReturnBitfield9Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 10.
     */
    private final ComplexInstrumentAcceptedReturnBitfield10Field complexInstrumentAcceptedReturnBitfield10 = new ComplexInstrumentAcceptedReturnBitfield10Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 11.
     */
    private final ComplexInstrumentAcceptedReturnBitfield11Field complexInstrumentAcceptedReturnBitfield11 = new ComplexInstrumentAcceptedReturnBitfield11Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 12.
     */
    private final ComplexInstrumentAcceptedReturnBitfield12Field complexInstrumentAcceptedReturnBitfield12 = new ComplexInstrumentAcceptedReturnBitfield12Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 13.
     */
    private final ComplexInstrumentAcceptedReturnBitfield13Field complexInstrumentAcceptedReturnBitfield13 = new ComplexInstrumentAcceptedReturnBitfield13Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 14.
     */
    private final ComplexInstrumentAcceptedReturnBitfield14Field complexInstrumentAcceptedReturnBitfield14 = new ComplexInstrumentAcceptedReturnBitfield14Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 15.
     */
    private final ComplexInstrumentAcceptedReturnBitfield15Field complexInstrumentAcceptedReturnBitfield15 = new ComplexInstrumentAcceptedReturnBitfield15Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 16.
     */
    private final ComplexInstrumentAcceptedReturnBitfield16Field complexInstrumentAcceptedReturnBitfield16 = new ComplexInstrumentAcceptedReturnBitfield16Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 17.
     */
    private final ComplexInstrumentAcceptedReturnBitfield17Field complexInstrumentAcceptedReturnBitfield17 = new ComplexInstrumentAcceptedReturnBitfield17Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 18.
     */
    private final ComplexInstrumentAcceptedReturnBitfield18Field complexInstrumentAcceptedReturnBitfield18 = new ComplexInstrumentAcceptedReturnBitfield18Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 19.
     */
    private final ComplexInstrumentAcceptedReturnBitfield19Field complexInstrumentAcceptedReturnBitfield19 = new ComplexInstrumentAcceptedReturnBitfield19Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 20.
     */
    private final ComplexInstrumentAcceptedReturnBitfield20Field complexInstrumentAcceptedReturnBitfield20 = new ComplexInstrumentAcceptedReturnBitfield20Field();

    /**
     * BitSet ComplexInstrumentAccepted byte 21.
     */
    private final ComplexInstrumentAcceptedReturnBitfield21Field complexInstrumentAcceptedReturnBitfield21 = new ComplexInstrumentAcceptedReturnBitfield21Field();

    /**
     * Corresponds to NoLegs (555) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be a minimum of 2 and a maximum of 16.
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * Corresponds to LegCFICode (608) in Cboe FIX. (Optional) CFI Code for leg. Required if LegSymbol is in OSI format. OP = Options Put OC = Options Call E = Equity
     */
    private final LegCfiCodeField legCfiCode = new LegCfiCodeField();

    /**
     * Corresponds to LegMaturityDate (611) in Cboe FIX. (Optional) Required if LegSymbol is in OSI format.
     */
    private final LegMaturityDateField legMaturityDate = new LegMaturityDateField();

    /**
     * Corresponds to LegStrikePrice (612) in Cboe FIX. (Optional) Option strike price. System maximum is 99,999,999. Must be non-negative. Required if LegSymbol is in OSI format.
     */
    private final LegStrikePriceField legStrikePrice = new LegStrikePriceField();

    /**
     * Repeating group stated NoLegs times.
     */
    private final ComplexLegList complexLeg = new ComplexLegList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, symbolAlphanumeric, revisedLegs, noOfSecurities, numberOfReturnBitf, numberOfReturnBitfields, complexInstrumentAcceptedReturnBitfield1, complexInstrumentAcceptedReturnBitfield2, complexInstrumentAcceptedReturnBitfield3, complexInstrumentAcceptedReturnBitfield4, complexInstrumentAcceptedReturnBitfield5, complexInstrumentAcceptedReturnBitfield6, complexInstrumentAcceptedReturnBitfield7, complexInstrumentAcceptedReturnBitfield8, complexInstrumentAcceptedReturnBitfield9, complexInstrumentAcceptedReturnBitfield10, complexInstrumentAcceptedReturnBitfield11, complexInstrumentAcceptedReturnBitfield12, complexInstrumentAcceptedReturnBitfield13, complexInstrumentAcceptedReturnBitfield14, complexInstrumentAcceptedReturnBitfield15, complexInstrumentAcceptedReturnBitfield16, complexInstrumentAcceptedReturnBitfield17, complexInstrumentAcceptedReturnBitfield18, complexInstrumentAcceptedReturnBitfield19, complexInstrumentAcceptedReturnBitfield20, complexInstrumentAcceptedReturnBitfield21, noLegs, legCfiCode, legMaturityDate, legStrikePrice);

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
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField symbolAlphanumeric() {
        return symbolAlphanumeric;
    }

    /**
     * Indicates if the legs on the created complex strategy have been reordered from the original request. If the legs were reordered, the order of the Open- Close fields on a New Complex Order must be the order returned by the exchange, not the order from the original request. 1 = Legs were not reordered 2 = Legs were reordered
     *
     * @return the RevisedLegs field
     */
    public RevisedLegsField revisedLegs() {
        return revisedLegs;
    }

    /**
     * Corresponds to NoOfSecurities (8641) in Cboe FIX. Indicates the number of securities created by the member in the trading session.
     *
     * @return the NoOfSecurities field
     */
    public NoOfSecuritiesField noOfSecurities() {
        return noOfSecurities;
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
     * BitSet ComplexInstrumentAccepted byte 1.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield1 field
     */
    public ComplexInstrumentAcceptedReturnBitfield1Field complexInstrumentAcceptedReturnBitfield1() {
        return complexInstrumentAcceptedReturnBitfield1;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 2.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield2 field
     */
    public ComplexInstrumentAcceptedReturnBitfield2Field complexInstrumentAcceptedReturnBitfield2() {
        return complexInstrumentAcceptedReturnBitfield2;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 3.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield3 field
     */
    public ComplexInstrumentAcceptedReturnBitfield3Field complexInstrumentAcceptedReturnBitfield3() {
        return complexInstrumentAcceptedReturnBitfield3;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 4.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield4 field
     */
    public ComplexInstrumentAcceptedReturnBitfield4Field complexInstrumentAcceptedReturnBitfield4() {
        return complexInstrumentAcceptedReturnBitfield4;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 5.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield5 field
     */
    public ComplexInstrumentAcceptedReturnBitfield5Field complexInstrumentAcceptedReturnBitfield5() {
        return complexInstrumentAcceptedReturnBitfield5;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 6.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield6 field
     */
    public ComplexInstrumentAcceptedReturnBitfield6Field complexInstrumentAcceptedReturnBitfield6() {
        return complexInstrumentAcceptedReturnBitfield6;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 7.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield7 field
     */
    public ComplexInstrumentAcceptedReturnBitfield7Field complexInstrumentAcceptedReturnBitfield7() {
        return complexInstrumentAcceptedReturnBitfield7;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 8.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield8 field
     */
    public ComplexInstrumentAcceptedReturnBitfield8Field complexInstrumentAcceptedReturnBitfield8() {
        return complexInstrumentAcceptedReturnBitfield8;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 9.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield9 field
     */
    public ComplexInstrumentAcceptedReturnBitfield9Field complexInstrumentAcceptedReturnBitfield9() {
        return complexInstrumentAcceptedReturnBitfield9;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 10.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield10 field
     */
    public ComplexInstrumentAcceptedReturnBitfield10Field complexInstrumentAcceptedReturnBitfield10() {
        return complexInstrumentAcceptedReturnBitfield10;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 11.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield11 field
     */
    public ComplexInstrumentAcceptedReturnBitfield11Field complexInstrumentAcceptedReturnBitfield11() {
        return complexInstrumentAcceptedReturnBitfield11;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 12.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield12 field
     */
    public ComplexInstrumentAcceptedReturnBitfield12Field complexInstrumentAcceptedReturnBitfield12() {
        return complexInstrumentAcceptedReturnBitfield12;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 13.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield13 field
     */
    public ComplexInstrumentAcceptedReturnBitfield13Field complexInstrumentAcceptedReturnBitfield13() {
        return complexInstrumentAcceptedReturnBitfield13;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 14.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield14 field
     */
    public ComplexInstrumentAcceptedReturnBitfield14Field complexInstrumentAcceptedReturnBitfield14() {
        return complexInstrumentAcceptedReturnBitfield14;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 15.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield15 field
     */
    public ComplexInstrumentAcceptedReturnBitfield15Field complexInstrumentAcceptedReturnBitfield15() {
        return complexInstrumentAcceptedReturnBitfield15;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 16.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield16 field
     */
    public ComplexInstrumentAcceptedReturnBitfield16Field complexInstrumentAcceptedReturnBitfield16() {
        return complexInstrumentAcceptedReturnBitfield16;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 17.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield17 field
     */
    public ComplexInstrumentAcceptedReturnBitfield17Field complexInstrumentAcceptedReturnBitfield17() {
        return complexInstrumentAcceptedReturnBitfield17;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 18.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield18 field
     */
    public ComplexInstrumentAcceptedReturnBitfield18Field complexInstrumentAcceptedReturnBitfield18() {
        return complexInstrumentAcceptedReturnBitfield18;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 19.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield19 field
     */
    public ComplexInstrumentAcceptedReturnBitfield19Field complexInstrumentAcceptedReturnBitfield19() {
        return complexInstrumentAcceptedReturnBitfield19;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 20.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield20 field
     */
    public ComplexInstrumentAcceptedReturnBitfield20Field complexInstrumentAcceptedReturnBitfield20() {
        return complexInstrumentAcceptedReturnBitfield20;
    }

    /**
     * BitSet ComplexInstrumentAccepted byte 21.
     *
     * @return the ComplexInstrumentAcceptedReturnBitfield21 field
     */
    public ComplexInstrumentAcceptedReturnBitfield21Field complexInstrumentAcceptedReturnBitfield21() {
        return complexInstrumentAcceptedReturnBitfield21;
    }

    /**
     * Corresponds to NoLegs (555) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be a minimum of 2 and a maximum of 16.
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * Corresponds to LegCFICode (608) in Cboe FIX. (Optional) CFI Code for leg. Required if LegSymbol is in OSI format. OP = Options Put OC = Options Call E = Equity
     *
     * @return the LegCfiCode field
     */
    public LegCfiCodeField legCfiCode() {
        return legCfiCode;
    }

    /**
     * Corresponds to LegMaturityDate (611) in Cboe FIX. (Optional) Required if LegSymbol is in OSI format.
     *
     * @return the LegMaturityDate field
     */
    public LegMaturityDateField legMaturityDate() {
        return legMaturityDate;
    }

    /**
     * Corresponds to LegStrikePrice (612) in Cboe FIX. (Optional) Option strike price. System maximum is 99,999,999. Must be non-negative. Required if LegSymbol is in OSI format.
     *
     * @return the LegStrikePrice field
     */
    public LegStrikePriceField legStrikePrice() {
        return legStrikePrice;
    }

    /**
     * Repeating group stated NoLegs times.
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the ComplexLeg entries
     */
    public ComplexLegList complexLeg() {
        return complexLeg;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield1 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield2 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield3 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield4 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield5 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield6 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield7 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield8 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield9 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield10 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield11 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield12 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield13 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield14 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield15 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield16 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield17 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield18 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield19 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield20 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentAcceptedReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentAcceptedReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentAcceptedReturnBitfield21 is on the wire
     */
    public boolean complexInstrumentAcceptedReturnBitfield21Present() {
        return numberOfReturnBitfields.value() >= 21L;
    }

    /**
     * Returns whether the fields before the LegCfiCode put it on the wire.
     *
     * <p>Decode reads the LegCfiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LegCfiCode is on the wire
     */
    public boolean legCfiCodePresent() {
        return (numberOfReturnBitfields.value() >= 14L) && (complexInstrumentAcceptedReturnBitfield14Present() && complexInstrumentAcceptedReturnBitfield14.complexInstrumentAcceptedReturnBitfield14LegCfiCode());
    }

    /**
     * Returns whether the fields before the LegMaturityDate put it on the wire.
     *
     * <p>Decode reads the LegMaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LegMaturityDate is on the wire
     */
    public boolean legMaturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 14L) && (complexInstrumentAcceptedReturnBitfield14Present() && complexInstrumentAcceptedReturnBitfield14.complexInstrumentAcceptedReturnBitfield14LegMaturityDate());
    }

    /**
     * Returns whether the fields before the LegStrikePrice put it on the wire.
     *
     * <p>Decode reads the LegStrikePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LegStrikePrice is on the wire
     */
    public boolean legStrikePricePresent() {
        return (numberOfReturnBitfields.value() >= 14L) && (complexInstrumentAcceptedReturnBitfield14Present() && complexInstrumentAcceptedReturnBitfield14.complexInstrumentAcceptedReturnBitfield14LegStrikePrice());
    }

    private boolean onWire(Field field) {
        return (field != complexInstrumentAcceptedReturnBitfield1 || complexInstrumentAcceptedReturnBitfield1Present()) && (field != complexInstrumentAcceptedReturnBitfield2 || complexInstrumentAcceptedReturnBitfield2Present()) && (field != complexInstrumentAcceptedReturnBitfield3 || complexInstrumentAcceptedReturnBitfield3Present()) && (field != complexInstrumentAcceptedReturnBitfield4 || complexInstrumentAcceptedReturnBitfield4Present()) && (field != complexInstrumentAcceptedReturnBitfield5 || complexInstrumentAcceptedReturnBitfield5Present()) && (field != complexInstrumentAcceptedReturnBitfield6 || complexInstrumentAcceptedReturnBitfield6Present()) && (field != complexInstrumentAcceptedReturnBitfield7 || complexInstrumentAcceptedReturnBitfield7Present()) && (field != complexInstrumentAcceptedReturnBitfield8 || complexInstrumentAcceptedReturnBitfield8Present()) && (field != complexInstrumentAcceptedReturnBitfield9 || complexInstrumentAcceptedReturnBitfield9Present()) && (field != complexInstrumentAcceptedReturnBitfield10 || complexInstrumentAcceptedReturnBitfield10Present()) && (field != complexInstrumentAcceptedReturnBitfield11 || complexInstrumentAcceptedReturnBitfield11Present()) && (field != complexInstrumentAcceptedReturnBitfield12 || complexInstrumentAcceptedReturnBitfield12Present()) && (field != complexInstrumentAcceptedReturnBitfield13 || complexInstrumentAcceptedReturnBitfield13Present()) && (field != complexInstrumentAcceptedReturnBitfield14 || complexInstrumentAcceptedReturnBitfield14Present()) && (field != complexInstrumentAcceptedReturnBitfield15 || complexInstrumentAcceptedReturnBitfield15Present()) && (field != complexInstrumentAcceptedReturnBitfield16 || complexInstrumentAcceptedReturnBitfield16Present()) && (field != complexInstrumentAcceptedReturnBitfield17 || complexInstrumentAcceptedReturnBitfield17Present()) && (field != complexInstrumentAcceptedReturnBitfield18 || complexInstrumentAcceptedReturnBitfield18Present()) && (field != complexInstrumentAcceptedReturnBitfield19 || complexInstrumentAcceptedReturnBitfield19Present()) && (field != complexInstrumentAcceptedReturnBitfield20 || complexInstrumentAcceptedReturnBitfield20Present()) && (field != complexInstrumentAcceptedReturnBitfield21 || complexInstrumentAcceptedReturnBitfield21Present()) && (field != legCfiCode || legCfiCodePresent()) && (field != legMaturityDate || legMaturityDatePresent()) && (field != legStrikePrice || legStrikePricePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (complexInstrumentAcceptedReturnBitfield1Present() ? ComplexInstrumentAcceptedReturnBitfield1Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield2Present() ? ComplexInstrumentAcceptedReturnBitfield2Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield3Present() ? ComplexInstrumentAcceptedReturnBitfield3Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield4Present() ? ComplexInstrumentAcceptedReturnBitfield4Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield5Present() ? ComplexInstrumentAcceptedReturnBitfield5Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield6Present() ? ComplexInstrumentAcceptedReturnBitfield6Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield7Present() ? ComplexInstrumentAcceptedReturnBitfield7Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield8Present() ? ComplexInstrumentAcceptedReturnBitfield8Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield9Present() ? ComplexInstrumentAcceptedReturnBitfield9Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield10Present() ? ComplexInstrumentAcceptedReturnBitfield10Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield11Present() ? ComplexInstrumentAcceptedReturnBitfield11Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield12Present() ? ComplexInstrumentAcceptedReturnBitfield12Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield13Present() ? ComplexInstrumentAcceptedReturnBitfield13Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield14Present() ? ComplexInstrumentAcceptedReturnBitfield14Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield15Present() ? ComplexInstrumentAcceptedReturnBitfield15Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield16Present() ? ComplexInstrumentAcceptedReturnBitfield16Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield17Present() ? ComplexInstrumentAcceptedReturnBitfield17Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield18Present() ? ComplexInstrumentAcceptedReturnBitfield18Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield19Present() ? ComplexInstrumentAcceptedReturnBitfield19Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield20Present() ? ComplexInstrumentAcceptedReturnBitfield20Field.BYTE_LENGTH : 0) + (complexInstrumentAcceptedReturnBitfield21Present() ? ComplexInstrumentAcceptedReturnBitfield21Field.BYTE_LENGTH : 0) + complexLeg.byteLength() + (legCfiCodePresent() ? LegCfiCodeField.BYTE_LENGTH : 0) + (legMaturityDatePresent() ? LegMaturityDateField.BYTE_LENGTH : 0) + (legStrikePricePresent() ? LegStrikePriceField.BYTE_LENGTH : 0);
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
        cursor += 8;
        cursor += 1;
        cursor += 4;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        cursor += 1;
        if (complexInstrumentAcceptedReturnBitfield1Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield2Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield3Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield4Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield5Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield6Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield7Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield8Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield9Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield10Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield11Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield12Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield13Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield14Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield15Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield16Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield17Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield18Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield19Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield20Present()) {
            cursor += 1;
        }
        if (complexInstrumentAcceptedReturnBitfield21Present()) {
            cursor += 1;
        }
        cursor += 1;
        cursor += complexLeg.byteLength();
        if (legCfiCodePresent()) {
            cursor += 6;
        }
        if (legMaturityDatePresent()) {
            cursor += 4;
        }
        if (legStrikePricePresent()) {
            cursor += 8;
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!symbolAlphanumeric.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolAlphanumericField.BYTE_LENGTH;
        if (!revisedLegs.parse(data, cursor)) {
            return false;
        }
        cursor += RevisedLegsField.BYTE_LENGTH;
        if (!noOfSecurities.parse(data, cursor)) {
            return false;
        }
        cursor += NoOfSecuritiesField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitf.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfField.BYTE_LENGTH;
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (complexInstrumentAcceptedReturnBitfield1Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield1Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield2Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield2Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield3Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield3Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield4Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield4Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield5Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield5Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield6Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield6Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield7Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield7Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield8Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield8Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield9Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield9Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield10Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield10Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield11Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield11Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield12Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield12Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield13Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield13Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield14Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield14Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield15Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield15Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield16Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield16Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield17Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield17Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield18Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield18Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield19Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield19Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield20Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield20Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (complexInstrumentAcceptedReturnBitfield21Present()) {
            if (end - 1 - cursor < ComplexInstrumentAcceptedReturnBitfield21Field.BYTE_LENGTH || !complexInstrumentAcceptedReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentAcceptedReturnBitfield21Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!complexLeg.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += complexLeg.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (legCfiCodePresent()) {
            if (end - cursor < LegCfiCodeField.BYTE_LENGTH || !legCfiCode.parse(data, cursor)) {
                return false;
            }
            cursor += LegCfiCodeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (legMaturityDatePresent()) {
            if (end - cursor < LegMaturityDateField.BYTE_LENGTH || !legMaturityDate.parse(data, cursor)) {
                return false;
            }
            cursor += LegMaturityDateField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (legStrikePricePresent()) {
            if (end - cursor < LegStrikePriceField.BYTE_LENGTH || !legStrikePrice.parse(data, cursor)) {
                return false;
            }
            cursor += LegStrikePriceField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexLeg.size() > 255) {
            throw new IllegalStateException("complexLeg holds " + complexLeg.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) complexLeg.size());
        if (complexInstrumentAcceptedReturnBitfield1Present() != complexInstrumentAcceptedReturnBitfield1.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield1.hasValue() ? "complexInstrumentAcceptedReturnBitfield1 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield2Present() != complexInstrumentAcceptedReturnBitfield2.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield2.hasValue() ? "complexInstrumentAcceptedReturnBitfield2 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield3Present() != complexInstrumentAcceptedReturnBitfield3.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield3.hasValue() ? "complexInstrumentAcceptedReturnBitfield3 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield4Present() != complexInstrumentAcceptedReturnBitfield4.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield4.hasValue() ? "complexInstrumentAcceptedReturnBitfield4 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield5Present() != complexInstrumentAcceptedReturnBitfield5.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield5.hasValue() ? "complexInstrumentAcceptedReturnBitfield5 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield6Present() != complexInstrumentAcceptedReturnBitfield6.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield6.hasValue() ? "complexInstrumentAcceptedReturnBitfield6 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield7Present() != complexInstrumentAcceptedReturnBitfield7.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield7.hasValue() ? "complexInstrumentAcceptedReturnBitfield7 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield8Present() != complexInstrumentAcceptedReturnBitfield8.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield8.hasValue() ? "complexInstrumentAcceptedReturnBitfield8 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield9Present() != complexInstrumentAcceptedReturnBitfield9.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield9.hasValue() ? "complexInstrumentAcceptedReturnBitfield9 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield10Present() != complexInstrumentAcceptedReturnBitfield10.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield10.hasValue() ? "complexInstrumentAcceptedReturnBitfield10 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield11Present() != complexInstrumentAcceptedReturnBitfield11.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield11.hasValue() ? "complexInstrumentAcceptedReturnBitfield11 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield12Present() != complexInstrumentAcceptedReturnBitfield12.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield12.hasValue() ? "complexInstrumentAcceptedReturnBitfield12 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield13Present() != complexInstrumentAcceptedReturnBitfield13.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield13.hasValue() ? "complexInstrumentAcceptedReturnBitfield13 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield14Present() != complexInstrumentAcceptedReturnBitfield14.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield14.hasValue() ? "complexInstrumentAcceptedReturnBitfield14 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield15Present() != complexInstrumentAcceptedReturnBitfield15.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield15.hasValue() ? "complexInstrumentAcceptedReturnBitfield15 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield16Present() != complexInstrumentAcceptedReturnBitfield16.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield16.hasValue() ? "complexInstrumentAcceptedReturnBitfield16 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield17Present() != complexInstrumentAcceptedReturnBitfield17.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield17.hasValue() ? "complexInstrumentAcceptedReturnBitfield17 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield18Present() != complexInstrumentAcceptedReturnBitfield18.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield18.hasValue() ? "complexInstrumentAcceptedReturnBitfield18 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield19Present() != complexInstrumentAcceptedReturnBitfield19.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield19.hasValue() ? "complexInstrumentAcceptedReturnBitfield19 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield20Present() != complexInstrumentAcceptedReturnBitfield20.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield20.hasValue() ? "complexInstrumentAcceptedReturnBitfield20 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentAcceptedReturnBitfield21Present() != complexInstrumentAcceptedReturnBitfield21.hasValue()) {
            throw new IllegalStateException(complexInstrumentAcceptedReturnBitfield21.hasValue() ? "complexInstrumentAcceptedReturnBitfield21 holds a value the fields before it leave off the wire" : "complexInstrumentAcceptedReturnBitfield21 holds no value, though the fields before it put it on the wire");
        }
        if (legCfiCodePresent() != legCfiCode.hasValue()) {
            throw new IllegalStateException(legCfiCode.hasValue() ? "legCfiCode holds a value the fields before it leave off the wire" : "legCfiCode holds no value, though the fields before it put it on the wire");
        }
        if (legMaturityDatePresent() != legMaturityDate.hasValue()) {
            throw new IllegalStateException(legMaturityDate.hasValue() ? "legMaturityDate holds a value the fields before it leave off the wire" : "legMaturityDate holds no value, though the fields before it put it on the wire");
        }
        if (legStrikePricePresent() != legStrikePrice.hasValue()) {
            throw new IllegalStateException(legStrikePrice.hasValue() ? "legStrikePrice holds a value the fields before it leave off the wire" : "legStrikePrice holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = symbolAlphanumeric.encode(data, cursor);
        cursor = revisedLegs.encode(data, cursor);
        cursor = noOfSecurities.encode(data, cursor);
        if (buffer != null && buffer.length >= 42) {
            System.arraycopy(buffer, 41, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitf.encode(data, cursor);
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (complexInstrumentAcceptedReturnBitfield1Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield1.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield2Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield2.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield3Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield3.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield4Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield4.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield5Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield5.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield6Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield6.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield7Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield7.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield8Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield8.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield9Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield9.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield10Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield10.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield11Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield11.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield12Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield12.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield13Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield13.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield14Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield14.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield15Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield15.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield16Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield16.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield17Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield17.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield18Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield18.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield19Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield19.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield20Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield20.encode(data, cursor);
        }
        if (complexInstrumentAcceptedReturnBitfield21Present()) {
            cursor = complexInstrumentAcceptedReturnBitfield21.encode(data, cursor);
        }
        cursor = noLegs.encode(data, cursor);
        cursor = complexLeg.encode(data, cursor);
        if (legCfiCodePresent()) {
            cursor = legCfiCode.encode(data, cursor);
        }
        if (legMaturityDatePresent()) {
            cursor = legMaturityDate.encode(data, cursor);
        }
        if (legStrikePricePresent()) {
            cursor = legStrikePrice.encode(data, cursor);
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
        complexLeg.clear();
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
        for (Field field : fields()) {
            if (field != noLegs && !field.isRecognized()) {
                return false;
            }
        }
        return complexLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != noLegs && !field.isValid()) {
                return false;
            }
        }
        if (!complexLeg.isValid()) {
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
        if (!transactionTime.isDecoded()) {
            return Optional.of(transactionTime);
        }
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!symbolAlphanumeric.isDecoded()) {
            return Optional.of(symbolAlphanumeric);
        }
        if (!revisedLegs.isDecoded()) {
            return Optional.of(revisedLegs);
        }
        if (!noOfSecurities.isDecoded()) {
            return Optional.of(noOfSecurities);
        }
        if (!numberOfReturnBitf.isDecoded()) {
            return Optional.of(numberOfReturnBitf);
        }
        if (!numberOfReturnBitfields.isDecoded()) {
            return Optional.of(numberOfReturnBitfields);
        }
        if (complexInstrumentAcceptedReturnBitfield1Present() && !complexInstrumentAcceptedReturnBitfield1.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield1);
        }
        if (complexInstrumentAcceptedReturnBitfield2Present() && !complexInstrumentAcceptedReturnBitfield2.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield2);
        }
        if (complexInstrumentAcceptedReturnBitfield3Present() && !complexInstrumentAcceptedReturnBitfield3.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield3);
        }
        if (complexInstrumentAcceptedReturnBitfield4Present() && !complexInstrumentAcceptedReturnBitfield4.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield4);
        }
        if (complexInstrumentAcceptedReturnBitfield5Present() && !complexInstrumentAcceptedReturnBitfield5.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield5);
        }
        if (complexInstrumentAcceptedReturnBitfield6Present() && !complexInstrumentAcceptedReturnBitfield6.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield6);
        }
        if (complexInstrumentAcceptedReturnBitfield7Present() && !complexInstrumentAcceptedReturnBitfield7.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield7);
        }
        if (complexInstrumentAcceptedReturnBitfield8Present() && !complexInstrumentAcceptedReturnBitfield8.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield8);
        }
        if (complexInstrumentAcceptedReturnBitfield9Present() && !complexInstrumentAcceptedReturnBitfield9.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield9);
        }
        if (complexInstrumentAcceptedReturnBitfield10Present() && !complexInstrumentAcceptedReturnBitfield10.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield10);
        }
        if (complexInstrumentAcceptedReturnBitfield11Present() && !complexInstrumentAcceptedReturnBitfield11.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield11);
        }
        if (complexInstrumentAcceptedReturnBitfield12Present() && !complexInstrumentAcceptedReturnBitfield12.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield12);
        }
        if (complexInstrumentAcceptedReturnBitfield13Present() && !complexInstrumentAcceptedReturnBitfield13.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield13);
        }
        if (complexInstrumentAcceptedReturnBitfield14Present() && !complexInstrumentAcceptedReturnBitfield14.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield14);
        }
        if (complexInstrumentAcceptedReturnBitfield15Present() && !complexInstrumentAcceptedReturnBitfield15.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield15);
        }
        if (complexInstrumentAcceptedReturnBitfield16Present() && !complexInstrumentAcceptedReturnBitfield16.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield16);
        }
        if (complexInstrumentAcceptedReturnBitfield17Present() && !complexInstrumentAcceptedReturnBitfield17.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield17);
        }
        if (complexInstrumentAcceptedReturnBitfield18Present() && !complexInstrumentAcceptedReturnBitfield18.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield18);
        }
        if (complexInstrumentAcceptedReturnBitfield19Present() && !complexInstrumentAcceptedReturnBitfield19.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield19);
        }
        if (complexInstrumentAcceptedReturnBitfield20Present() && !complexInstrumentAcceptedReturnBitfield20.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield20);
        }
        if (complexInstrumentAcceptedReturnBitfield21Present() && !complexInstrumentAcceptedReturnBitfield21.isDecoded()) {
            return Optional.of(complexInstrumentAcceptedReturnBitfield21);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!complexLeg.isDecoded()) {
            return Optional.of(complexLeg.failedEntry().flatMap(ComplexLegEntry::failedAt).orElse(noLegs));
        }
        if (legCfiCodePresent() && !legCfiCode.isDecoded()) {
            return Optional.of(legCfiCode);
        }
        if (legMaturityDatePresent() && !legMaturityDate.isDecoded()) {
            return Optional.of(legMaturityDate);
        }
        if (legStrikePricePresent() && !legStrikePrice.isDecoded()) {
            return Optional.of(legStrikePrice);
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "RevisedLegs" -> Optional.of(revisedLegs);
            case "NoOfSecurities" -> Optional.of(noOfSecurities);
            case "NumberOfReturnBitf" -> Optional.of(numberOfReturnBitf);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "ComplexInstrumentAcceptedReturnBitfield1" -> Optional.of(complexInstrumentAcceptedReturnBitfield1);
            case "ComplexInstrumentAcceptedReturnBitfield2" -> Optional.of(complexInstrumentAcceptedReturnBitfield2);
            case "ComplexInstrumentAcceptedReturnBitfield3" -> Optional.of(complexInstrumentAcceptedReturnBitfield3);
            case "ComplexInstrumentAcceptedReturnBitfield4" -> Optional.of(complexInstrumentAcceptedReturnBitfield4);
            case "ComplexInstrumentAcceptedReturnBitfield5" -> Optional.of(complexInstrumentAcceptedReturnBitfield5);
            case "ComplexInstrumentAcceptedReturnBitfield6" -> Optional.of(complexInstrumentAcceptedReturnBitfield6);
            case "ComplexInstrumentAcceptedReturnBitfield7" -> Optional.of(complexInstrumentAcceptedReturnBitfield7);
            case "ComplexInstrumentAcceptedReturnBitfield8" -> Optional.of(complexInstrumentAcceptedReturnBitfield8);
            case "ComplexInstrumentAcceptedReturnBitfield9" -> Optional.of(complexInstrumentAcceptedReturnBitfield9);
            case "ComplexInstrumentAcceptedReturnBitfield10" -> Optional.of(complexInstrumentAcceptedReturnBitfield10);
            case "ComplexInstrumentAcceptedReturnBitfield11" -> Optional.of(complexInstrumentAcceptedReturnBitfield11);
            case "ComplexInstrumentAcceptedReturnBitfield12" -> Optional.of(complexInstrumentAcceptedReturnBitfield12);
            case "ComplexInstrumentAcceptedReturnBitfield13" -> Optional.of(complexInstrumentAcceptedReturnBitfield13);
            case "ComplexInstrumentAcceptedReturnBitfield14" -> Optional.of(complexInstrumentAcceptedReturnBitfield14);
            case "ComplexInstrumentAcceptedReturnBitfield15" -> Optional.of(complexInstrumentAcceptedReturnBitfield15);
            case "ComplexInstrumentAcceptedReturnBitfield16" -> Optional.of(complexInstrumentAcceptedReturnBitfield16);
            case "ComplexInstrumentAcceptedReturnBitfield17" -> Optional.of(complexInstrumentAcceptedReturnBitfield17);
            case "ComplexInstrumentAcceptedReturnBitfield18" -> Optional.of(complexInstrumentAcceptedReturnBitfield18);
            case "ComplexInstrumentAcceptedReturnBitfield19" -> Optional.of(complexInstrumentAcceptedReturnBitfield19);
            case "ComplexInstrumentAcceptedReturnBitfield20" -> Optional.of(complexInstrumentAcceptedReturnBitfield20);
            case "ComplexInstrumentAcceptedReturnBitfield21" -> Optional.of(complexInstrumentAcceptedReturnBitfield21);
            case "NoLegs" -> Optional.of(noLegs);
            case "LegCfiCode" -> Optional.of(legCfiCode);
            case "LegMaturityDate" -> Optional.of(legMaturityDate);
            case "LegStrikePrice" -> Optional.of(legStrikePrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexInstrumentAcceptedMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(complexLeg.diffFields(message.complexLeg));
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            complexLeg.toFormattedString(builder, options);
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
        complexLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexInstrumentAcceptedMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && complexLeg.equals(message.complexLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexLeg);
    }
}
