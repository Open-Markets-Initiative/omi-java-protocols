package omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.BidPxField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.BidSizeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.CapacityField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.ClearingFirmField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.CurrencyField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.IdSourceField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.OfferPxField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.OfferSizeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield10Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield11Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield12Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield13Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield14Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield1Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield2Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield3Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield4Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield5Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield6Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield7Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield8Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.QuoteRejectV2ReturnBitfield9Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.ReasonField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.SecurityExchangeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.SecurityIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.SymbolField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TextField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.types.Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.types.Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.types.PrintOptions;

/**
 * Represents the QuoteRejectV2Message message from the TradeReporting protocol.
 *
 * <p>Quote Reject V2 Message.</p>
 */
public final class QuoteRejectV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 83;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Reject V 2 Message";

    /**
     * Corresponds to QuoteID (117) in Bats FIX. Mandatory unique ID chosen by client for a Quote or QuoteCancel. 18 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. Please note that the last two bytes are for inter- nal use. Note: Bats only enforces the uniqueness of QuoteID values among currently live quotes. However, we strongly recommend that you keep your QuoteID values day unique.
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Reason for a Trade Capture Report reject or decline. See Reason Codes (§ 8, p. 61) for a list of possible reasons.
     */
    private final ReasonField reason = new ReasonField();

    /**
     * Human readable text with more information about the reject reason.
     */
    private final TextField text = new TextField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet QuoteRejectV2 byte 1.
     */
    private final QuoteRejectV2ReturnBitfield1Field quoteRejectV2ReturnBitfield1 = new QuoteRejectV2ReturnBitfield1Field();

    /**
     * BitSet QuoteRejectV2 byte 2.
     */
    private final QuoteRejectV2ReturnBitfield2Field quoteRejectV2ReturnBitfield2 = new QuoteRejectV2ReturnBitfield2Field();

    /**
     * BitSet QuoteRejectV2 byte 3.
     */
    private final QuoteRejectV2ReturnBitfield3Field quoteRejectV2ReturnBitfield3 = new QuoteRejectV2ReturnBitfield3Field();

    /**
     * BitSet QuoteRejectV2 byte 4.
     */
    private final QuoteRejectV2ReturnBitfield4Field quoteRejectV2ReturnBitfield4 = new QuoteRejectV2ReturnBitfield4Field();

    /**
     * BitSet QuoteRejectV2 byte 5.
     */
    private final QuoteRejectV2ReturnBitfield5Field quoteRejectV2ReturnBitfield5 = new QuoteRejectV2ReturnBitfield5Field();

    /**
     * BitSet QuoteRejectV2 byte 6.
     */
    private final QuoteRejectV2ReturnBitfield6Field quoteRejectV2ReturnBitfield6 = new QuoteRejectV2ReturnBitfield6Field();

    /**
     * BitSet QuoteRejectV2 byte 7.
     */
    private final QuoteRejectV2ReturnBitfield7Field quoteRejectV2ReturnBitfield7 = new QuoteRejectV2ReturnBitfield7Field();

    /**
     * BitSet QuoteRejectV2 byte 8.
     */
    private final QuoteRejectV2ReturnBitfield8Field quoteRejectV2ReturnBitfield8 = new QuoteRejectV2ReturnBitfield8Field();

    /**
     * BitSet QuoteRejectV2 byte 9.
     */
    private final QuoteRejectV2ReturnBitfield9Field quoteRejectV2ReturnBitfield9 = new QuoteRejectV2ReturnBitfield9Field();

    /**
     * BitSet QuoteRejectV2 byte 10.
     */
    private final QuoteRejectV2ReturnBitfield10Field quoteRejectV2ReturnBitfield10 = new QuoteRejectV2ReturnBitfield10Field();

    /**
     * BitSet QuoteRejectV2 byte 11.
     */
    private final QuoteRejectV2ReturnBitfield11Field quoteRejectV2ReturnBitfield11 = new QuoteRejectV2ReturnBitfield11Field();

    /**
     * BitSet QuoteRejectV2 byte 12.
     */
    private final QuoteRejectV2ReturnBitfield12Field quoteRejectV2ReturnBitfield12 = new QuoteRejectV2ReturnBitfield12Field();

    /**
     * BitSet QuoteRejectV2 byte 13.
     */
    private final QuoteRejectV2ReturnBitfield13Field quoteRejectV2ReturnBitfield13 = new QuoteRejectV2ReturnBitfield13Field();

    /**
     * BitSet QuoteRejectV2 byte 14.
     */
    private final QuoteRejectV2ReturnBitfield14Field quoteRejectV2ReturnBitfield14 = new QuoteRejectV2ReturnBitfield14Field();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Id Source
     */
    private final IdSourceField idSource = new IdSourceField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Security Exchange
     */
    private final SecurityExchangeField securityExchange = new SecurityExchangeField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Bid Px
     */
    private final BidPxField bidPx = new BidPxField();

    /**
     * Bid Size
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Offer Px
     */
    private final OfferPxField offerPx = new OfferPxField();

    /**
     * Offer Size
     */
    private final OfferSizeField offerSize = new OfferSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(quoteId, reason, text, numberOfReturnBitfields, quoteRejectV2ReturnBitfield1, quoteRejectV2ReturnBitfield2, quoteRejectV2ReturnBitfield3, quoteRejectV2ReturnBitfield4, quoteRejectV2ReturnBitfield5, quoteRejectV2ReturnBitfield6, quoteRejectV2ReturnBitfield7, quoteRejectV2ReturnBitfield8, quoteRejectV2ReturnBitfield9, quoteRejectV2ReturnBitfield10, quoteRejectV2ReturnBitfield11, quoteRejectV2ReturnBitfield12, quoteRejectV2ReturnBitfield13, quoteRejectV2ReturnBitfield14, symbol, currency, idSource, securityId, securityExchange, capacity, clearingFirm, bidPx, bidSize, offerPx, offerSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to QuoteID (117) in Bats FIX. Mandatory unique ID chosen by client for a Quote or QuoteCancel. 18 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. Please note that the last two bytes are for inter- nal use. Note: Bats only enforces the uniqueness of QuoteID values among currently live quotes. However, we strongly recommend that you keep your QuoteID values day unique.
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * Reason for a Trade Capture Report reject or decline. See Reason Codes (§ 8, p. 61) for a list of possible reasons.
     *
     * @return the Reason field
     */
    public ReasonField reason() {
        return reason;
    }

    /**
     * Human readable text with more information about the reject reason.
     *
     * @return the Text field
     */
    public TextField text() {
        return text;
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
     * BitSet QuoteRejectV2 byte 1.
     *
     * @return the QuoteRejectV2ReturnBitfield1 field
     */
    public QuoteRejectV2ReturnBitfield1Field quoteRejectV2ReturnBitfield1() {
        return quoteRejectV2ReturnBitfield1;
    }

    /**
     * BitSet QuoteRejectV2 byte 2.
     *
     * @return the QuoteRejectV2ReturnBitfield2 field
     */
    public QuoteRejectV2ReturnBitfield2Field quoteRejectV2ReturnBitfield2() {
        return quoteRejectV2ReturnBitfield2;
    }

    /**
     * BitSet QuoteRejectV2 byte 3.
     *
     * @return the QuoteRejectV2ReturnBitfield3 field
     */
    public QuoteRejectV2ReturnBitfield3Field quoteRejectV2ReturnBitfield3() {
        return quoteRejectV2ReturnBitfield3;
    }

    /**
     * BitSet QuoteRejectV2 byte 4.
     *
     * @return the QuoteRejectV2ReturnBitfield4 field
     */
    public QuoteRejectV2ReturnBitfield4Field quoteRejectV2ReturnBitfield4() {
        return quoteRejectV2ReturnBitfield4;
    }

    /**
     * BitSet QuoteRejectV2 byte 5.
     *
     * @return the QuoteRejectV2ReturnBitfield5 field
     */
    public QuoteRejectV2ReturnBitfield5Field quoteRejectV2ReturnBitfield5() {
        return quoteRejectV2ReturnBitfield5;
    }

    /**
     * BitSet QuoteRejectV2 byte 6.
     *
     * @return the QuoteRejectV2ReturnBitfield6 field
     */
    public QuoteRejectV2ReturnBitfield6Field quoteRejectV2ReturnBitfield6() {
        return quoteRejectV2ReturnBitfield6;
    }

    /**
     * BitSet QuoteRejectV2 byte 7.
     *
     * @return the QuoteRejectV2ReturnBitfield7 field
     */
    public QuoteRejectV2ReturnBitfield7Field quoteRejectV2ReturnBitfield7() {
        return quoteRejectV2ReturnBitfield7;
    }

    /**
     * BitSet QuoteRejectV2 byte 8.
     *
     * @return the QuoteRejectV2ReturnBitfield8 field
     */
    public QuoteRejectV2ReturnBitfield8Field quoteRejectV2ReturnBitfield8() {
        return quoteRejectV2ReturnBitfield8;
    }

    /**
     * BitSet QuoteRejectV2 byte 9.
     *
     * @return the QuoteRejectV2ReturnBitfield9 field
     */
    public QuoteRejectV2ReturnBitfield9Field quoteRejectV2ReturnBitfield9() {
        return quoteRejectV2ReturnBitfield9;
    }

    /**
     * BitSet QuoteRejectV2 byte 10.
     *
     * @return the QuoteRejectV2ReturnBitfield10 field
     */
    public QuoteRejectV2ReturnBitfield10Field quoteRejectV2ReturnBitfield10() {
        return quoteRejectV2ReturnBitfield10;
    }

    /**
     * BitSet QuoteRejectV2 byte 11.
     *
     * @return the QuoteRejectV2ReturnBitfield11 field
     */
    public QuoteRejectV2ReturnBitfield11Field quoteRejectV2ReturnBitfield11() {
        return quoteRejectV2ReturnBitfield11;
    }

    /**
     * BitSet QuoteRejectV2 byte 12.
     *
     * @return the QuoteRejectV2ReturnBitfield12 field
     */
    public QuoteRejectV2ReturnBitfield12Field quoteRejectV2ReturnBitfield12() {
        return quoteRejectV2ReturnBitfield12;
    }

    /**
     * BitSet QuoteRejectV2 byte 13.
     *
     * @return the QuoteRejectV2ReturnBitfield13 field
     */
    public QuoteRejectV2ReturnBitfield13Field quoteRejectV2ReturnBitfield13() {
        return quoteRejectV2ReturnBitfield13;
    }

    /**
     * BitSet QuoteRejectV2 byte 14.
     *
     * @return the QuoteRejectV2ReturnBitfield14 field
     */
    public QuoteRejectV2ReturnBitfield14Field quoteRejectV2ReturnBitfield14() {
        return quoteRejectV2ReturnBitfield14;
    }

    /**
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Currency
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Id Source
     *
     * @return the IdSource field
     */
    public IdSourceField idSource() {
        return idSource;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Security Exchange
     *
     * @return the SecurityExchange field
     */
    public SecurityExchangeField securityExchange() {
        return securityExchange;
    }

    /**
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
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
     * Bid Px
     *
     * @return the BidPx field
     */
    public BidPxField bidPx() {
        return bidPx;
    }

    /**
     * Bid Size
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Offer Px
     *
     * @return the OfferPx field
     */
    public OfferPxField offerPx() {
        return offerPx;
    }

    /**
     * Offer Size
     *
     * @return the OfferSize field
     */
    public OfferSizeField offerSize() {
        return offerSize;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield1 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield2 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield3 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield4 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield5 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield6 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield7 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield8 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield9 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield10 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield11 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield12 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield13 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the QuoteRejectV2ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the QuoteRejectV2ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteRejectV2ReturnBitfield14 is on the wire
     */
    public boolean quoteRejectV2ReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (quoteRejectV2ReturnBitfield2Present() && quoteRejectV2ReturnBitfield2.quoteRejectV2ReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Currency put it on the wire.
     *
     * <p>Decode reads the Currency where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Currency is on the wire
     */
    public boolean currencyPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (quoteRejectV2ReturnBitfield2Present() && quoteRejectV2ReturnBitfield2.quoteRejectV2ReturnBitfield2Currency());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (quoteRejectV2ReturnBitfield2Present() && quoteRejectV2ReturnBitfield2.quoteRejectV2ReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (quoteRejectV2ReturnBitfield2Present() && quoteRejectV2ReturnBitfield2.quoteRejectV2ReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the SecurityExchange put it on the wire.
     *
     * <p>Decode reads the SecurityExchange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityExchange is on the wire
     */
    public boolean securityExchangePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (quoteRejectV2ReturnBitfield2Present() && quoteRejectV2ReturnBitfield2.quoteRejectV2ReturnBitfield2SecurityExchange());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (quoteRejectV2ReturnBitfield2Present() && quoteRejectV2ReturnBitfield2.quoteRejectV2ReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (quoteRejectV2ReturnBitfield3Present() && quoteRejectV2ReturnBitfield3.quoteRejectV2ReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the BidPx put it on the wire.
     *
     * <p>Decode reads the BidPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BidPx is on the wire
     */
    public boolean bidPxPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (quoteRejectV2ReturnBitfield7Present() && quoteRejectV2ReturnBitfield7.quoteRejectV2ReturnBitfield7Bid());
    }

    /**
     * Returns whether the fields before the BidSize put it on the wire.
     *
     * <p>Decode reads the BidSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BidSize is on the wire
     */
    public boolean bidSizePresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (quoteRejectV2ReturnBitfield7Present() && quoteRejectV2ReturnBitfield7.quoteRejectV2ReturnBitfield7Bid());
    }

    /**
     * Returns whether the fields before the OfferPx put it on the wire.
     *
     * <p>Decode reads the OfferPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OfferPx is on the wire
     */
    public boolean offerPxPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (quoteRejectV2ReturnBitfield7Present() && quoteRejectV2ReturnBitfield7.quoteRejectV2ReturnBitfield7Offer());
    }

    /**
     * Returns whether the fields before the OfferSize put it on the wire.
     *
     * <p>Decode reads the OfferSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OfferSize is on the wire
     */
    public boolean offerSizePresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (quoteRejectV2ReturnBitfield7Present() && quoteRejectV2ReturnBitfield7.quoteRejectV2ReturnBitfield7Offer());
    }

    private boolean onWire(Field field) {
        return (field != quoteRejectV2ReturnBitfield1 || quoteRejectV2ReturnBitfield1Present()) && (field != quoteRejectV2ReturnBitfield2 || quoteRejectV2ReturnBitfield2Present()) && (field != quoteRejectV2ReturnBitfield3 || quoteRejectV2ReturnBitfield3Present()) && (field != quoteRejectV2ReturnBitfield4 || quoteRejectV2ReturnBitfield4Present()) && (field != quoteRejectV2ReturnBitfield5 || quoteRejectV2ReturnBitfield5Present()) && (field != quoteRejectV2ReturnBitfield6 || quoteRejectV2ReturnBitfield6Present()) && (field != quoteRejectV2ReturnBitfield7 || quoteRejectV2ReturnBitfield7Present()) && (field != quoteRejectV2ReturnBitfield8 || quoteRejectV2ReturnBitfield8Present()) && (field != quoteRejectV2ReturnBitfield9 || quoteRejectV2ReturnBitfield9Present()) && (field != quoteRejectV2ReturnBitfield10 || quoteRejectV2ReturnBitfield10Present()) && (field != quoteRejectV2ReturnBitfield11 || quoteRejectV2ReturnBitfield11Present()) && (field != quoteRejectV2ReturnBitfield12 || quoteRejectV2ReturnBitfield12Present()) && (field != quoteRejectV2ReturnBitfield13 || quoteRejectV2ReturnBitfield13Present()) && (field != quoteRejectV2ReturnBitfield14 || quoteRejectV2ReturnBitfield14Present()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent()) && (field != capacity || capacityPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != bidPx || bidPxPresent()) && (field != bidSize || bidSizePresent()) && (field != offerPx || offerPxPresent()) && (field != offerSize || offerSizePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (quoteRejectV2ReturnBitfield1Present() ? QuoteRejectV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield2Present() ? QuoteRejectV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield3Present() ? QuoteRejectV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield4Present() ? QuoteRejectV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield5Present() ? QuoteRejectV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield6Present() ? QuoteRejectV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield7Present() ? QuoteRejectV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield8Present() ? QuoteRejectV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield9Present() ? QuoteRejectV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield10Present() ? QuoteRejectV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield11Present() ? QuoteRejectV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield12Present() ? QuoteRejectV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield13Present() ? QuoteRejectV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (quoteRejectV2ReturnBitfield14Present() ? QuoteRejectV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (bidPxPresent() ? BidPxField.BYTE_LENGTH : 0) + (bidSizePresent() ? BidSizeField.BYTE_LENGTH : 0) + (offerPxPresent() ? OfferPxField.BYTE_LENGTH : 0) + (offerSizePresent() ? OfferSizeField.BYTE_LENGTH : 0);
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
        cursor += 20;
        cursor += 1;
        cursor += 60;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (quoteRejectV2ReturnBitfield1Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield2Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield3Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield4Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield5Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield6Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield7Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield8Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield9Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield10Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield11Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield12Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield13Present()) {
            cursor += 1;
        }
        if (quoteRejectV2ReturnBitfield14Present()) {
            cursor += 1;
        }
        if (symbolPresent()) {
            cursor += 8;
        }
        if (currencyPresent()) {
            cursor += 3;
        }
        if (idSourcePresent()) {
            cursor += 1;
        }
        if (securityIdPresent()) {
            cursor += 16;
        }
        if (securityExchangePresent()) {
            cursor += 4;
        }
        if (capacityPresent()) {
            cursor += 1;
        }
        if (clearingFirmPresent()) {
            cursor += 4;
        }
        if (bidPxPresent()) {
            cursor += 8;
        }
        if (bidSizePresent()) {
            cursor += 4;
        }
        if (offerPxPresent()) {
            cursor += 8;
        }
        if (offerSizePresent()) {
            cursor += 4;
        }
        return cursor;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!reason.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonField.BYTE_LENGTH;
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (quoteRejectV2ReturnBitfield1Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield1Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield2Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield2Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield3Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield3Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield4Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield4Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield5Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield5Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield6Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield6Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield7Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield7Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield8Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield8Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield9Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield9Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield10Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield10Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield11Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield11Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield12Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield12Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield13Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield13Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (quoteRejectV2ReturnBitfield14Present()) {
            if (end - cursor < QuoteRejectV2ReturnBitfield14Field.BYTE_LENGTH || !quoteRejectV2ReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteRejectV2ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolPresent()) {
            if (end - cursor < SymbolField.BYTE_LENGTH || !symbol.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (currencyPresent()) {
            if (end - cursor < CurrencyField.BYTE_LENGTH || !currency.parse(data, cursor)) {
                return false;
            }
            cursor += CurrencyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (idSourcePresent()) {
            if (end - cursor < IdSourceField.BYTE_LENGTH || !idSource.parse(data, cursor)) {
                return false;
            }
            cursor += IdSourceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (securityIdPresent()) {
            if (end - cursor < SecurityIdField.BYTE_LENGTH || !securityId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (securityExchangePresent()) {
            if (end - cursor < SecurityExchangeField.BYTE_LENGTH || !securityExchange.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityExchangeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (capacityPresent()) {
            if (end - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (bidPxPresent()) {
            if (end - cursor < BidPxField.BYTE_LENGTH || !bidPx.parse(data, cursor)) {
                return false;
            }
            cursor += BidPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (bidSizePresent()) {
            if (end - cursor < BidSizeField.BYTE_LENGTH || !bidSize.parse(data, cursor)) {
                return false;
            }
            cursor += BidSizeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (offerPxPresent()) {
            if (end - cursor < OfferPxField.BYTE_LENGTH || !offerPx.parse(data, cursor)) {
                return false;
            }
            cursor += OfferPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (offerSizePresent()) {
            if (end - cursor < OfferSizeField.BYTE_LENGTH || !offerSize.parse(data, cursor)) {
                return false;
            }
            cursor += OfferSizeField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (quoteRejectV2ReturnBitfield1Present() != quoteRejectV2ReturnBitfield1.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield1.hasValue() ? "quoteRejectV2ReturnBitfield1 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield2Present() != quoteRejectV2ReturnBitfield2.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield2.hasValue() ? "quoteRejectV2ReturnBitfield2 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield3Present() != quoteRejectV2ReturnBitfield3.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield3.hasValue() ? "quoteRejectV2ReturnBitfield3 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield4Present() != quoteRejectV2ReturnBitfield4.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield4.hasValue() ? "quoteRejectV2ReturnBitfield4 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield5Present() != quoteRejectV2ReturnBitfield5.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield5.hasValue() ? "quoteRejectV2ReturnBitfield5 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield6Present() != quoteRejectV2ReturnBitfield6.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield6.hasValue() ? "quoteRejectV2ReturnBitfield6 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield7Present() != quoteRejectV2ReturnBitfield7.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield7.hasValue() ? "quoteRejectV2ReturnBitfield7 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield8Present() != quoteRejectV2ReturnBitfield8.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield8.hasValue() ? "quoteRejectV2ReturnBitfield8 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield9Present() != quoteRejectV2ReturnBitfield9.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield9.hasValue() ? "quoteRejectV2ReturnBitfield9 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield10Present() != quoteRejectV2ReturnBitfield10.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield10.hasValue() ? "quoteRejectV2ReturnBitfield10 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield11Present() != quoteRejectV2ReturnBitfield11.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield11.hasValue() ? "quoteRejectV2ReturnBitfield11 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield12Present() != quoteRejectV2ReturnBitfield12.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield12.hasValue() ? "quoteRejectV2ReturnBitfield12 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield13Present() != quoteRejectV2ReturnBitfield13.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield13.hasValue() ? "quoteRejectV2ReturnBitfield13 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (quoteRejectV2ReturnBitfield14Present() != quoteRejectV2ReturnBitfield14.hasValue()) {
            throw new IllegalStateException(quoteRejectV2ReturnBitfield14.hasValue() ? "quoteRejectV2ReturnBitfield14 holds a value the fields before it leave off the wire" : "quoteRejectV2ReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (symbolPresent() != symbol.hasValue()) {
            throw new IllegalStateException(symbol.hasValue() ? "symbol holds a value the fields before it leave off the wire" : "symbol holds no value, though the fields before it put it on the wire");
        }
        if (currencyPresent() != currency.hasValue()) {
            throw new IllegalStateException(currency.hasValue() ? "currency holds a value the fields before it leave off the wire" : "currency holds no value, though the fields before it put it on the wire");
        }
        if (idSourcePresent() != idSource.hasValue()) {
            throw new IllegalStateException(idSource.hasValue() ? "idSource holds a value the fields before it leave off the wire" : "idSource holds no value, though the fields before it put it on the wire");
        }
        if (securityIdPresent() != securityId.hasValue()) {
            throw new IllegalStateException(securityId.hasValue() ? "securityId holds a value the fields before it leave off the wire" : "securityId holds no value, though the fields before it put it on the wire");
        }
        if (securityExchangePresent() != securityExchange.hasValue()) {
            throw new IllegalStateException(securityExchange.hasValue() ? "securityExchange holds a value the fields before it leave off the wire" : "securityExchange holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (bidPxPresent() != bidPx.hasValue()) {
            throw new IllegalStateException(bidPx.hasValue() ? "bidPx holds a value the fields before it leave off the wire" : "bidPx holds no value, though the fields before it put it on the wire");
        }
        if (bidSizePresent() != bidSize.hasValue()) {
            throw new IllegalStateException(bidSize.hasValue() ? "bidSize holds a value the fields before it leave off the wire" : "bidSize holds no value, though the fields before it put it on the wire");
        }
        if (offerPxPresent() != offerPx.hasValue()) {
            throw new IllegalStateException(offerPx.hasValue() ? "offerPx holds a value the fields before it leave off the wire" : "offerPx holds no value, though the fields before it put it on the wire");
        }
        if (offerSizePresent() != offerSize.hasValue()) {
            throw new IllegalStateException(offerSize.hasValue() ? "offerSize holds a value the fields before it leave off the wire" : "offerSize holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = quoteId.encode(data, cursor);
        cursor = reason.encode(data, cursor);
        cursor = text.encode(data, cursor);
        if (buffer != null && buffer.length >= 82) {
            System.arraycopy(buffer, 81, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (quoteRejectV2ReturnBitfield1Present()) {
            cursor = quoteRejectV2ReturnBitfield1.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield2Present()) {
            cursor = quoteRejectV2ReturnBitfield2.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield3Present()) {
            cursor = quoteRejectV2ReturnBitfield3.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield4Present()) {
            cursor = quoteRejectV2ReturnBitfield4.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield5Present()) {
            cursor = quoteRejectV2ReturnBitfield5.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield6Present()) {
            cursor = quoteRejectV2ReturnBitfield6.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield7Present()) {
            cursor = quoteRejectV2ReturnBitfield7.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield8Present()) {
            cursor = quoteRejectV2ReturnBitfield8.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield9Present()) {
            cursor = quoteRejectV2ReturnBitfield9.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield10Present()) {
            cursor = quoteRejectV2ReturnBitfield10.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield11Present()) {
            cursor = quoteRejectV2ReturnBitfield11.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield12Present()) {
            cursor = quoteRejectV2ReturnBitfield12.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield13Present()) {
            cursor = quoteRejectV2ReturnBitfield13.encode(data, cursor);
        }
        if (quoteRejectV2ReturnBitfield14Present()) {
            cursor = quoteRejectV2ReturnBitfield14.encode(data, cursor);
        }
        if (symbolPresent()) {
            cursor = symbol.encode(data, cursor);
        }
        if (currencyPresent()) {
            cursor = currency.encode(data, cursor);
        }
        if (idSourcePresent()) {
            cursor = idSource.encode(data, cursor);
        }
        if (securityIdPresent()) {
            cursor = securityId.encode(data, cursor);
        }
        if (securityExchangePresent()) {
            cursor = securityExchange.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (bidPxPresent()) {
            cursor = bidPx.encode(data, cursor);
        }
        if (bidSizePresent()) {
            cursor = bidSize.encode(data, cursor);
        }
        if (offerPxPresent()) {
            cursor = offerPx.encode(data, cursor);
        }
        if (offerSizePresent()) {
            cursor = offerSize.encode(data, cursor);
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
            case "QuoteId" -> Optional.of(quoteId);
            case "Reason" -> Optional.of(reason);
            case "Text" -> Optional.of(text);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "QuoteRejectV2ReturnBitfield1" -> Optional.of(quoteRejectV2ReturnBitfield1);
            case "QuoteRejectV2ReturnBitfield2" -> Optional.of(quoteRejectV2ReturnBitfield2);
            case "QuoteRejectV2ReturnBitfield3" -> Optional.of(quoteRejectV2ReturnBitfield3);
            case "QuoteRejectV2ReturnBitfield4" -> Optional.of(quoteRejectV2ReturnBitfield4);
            case "QuoteRejectV2ReturnBitfield5" -> Optional.of(quoteRejectV2ReturnBitfield5);
            case "QuoteRejectV2ReturnBitfield6" -> Optional.of(quoteRejectV2ReturnBitfield6);
            case "QuoteRejectV2ReturnBitfield7" -> Optional.of(quoteRejectV2ReturnBitfield7);
            case "QuoteRejectV2ReturnBitfield8" -> Optional.of(quoteRejectV2ReturnBitfield8);
            case "QuoteRejectV2ReturnBitfield9" -> Optional.of(quoteRejectV2ReturnBitfield9);
            case "QuoteRejectV2ReturnBitfield10" -> Optional.of(quoteRejectV2ReturnBitfield10);
            case "QuoteRejectV2ReturnBitfield11" -> Optional.of(quoteRejectV2ReturnBitfield11);
            case "QuoteRejectV2ReturnBitfield12" -> Optional.of(quoteRejectV2ReturnBitfield12);
            case "QuoteRejectV2ReturnBitfield13" -> Optional.of(quoteRejectV2ReturnBitfield13);
            case "QuoteRejectV2ReturnBitfield14" -> Optional.of(quoteRejectV2ReturnBitfield14);
            case "Symbol" -> Optional.of(symbol);
            case "Currency" -> Optional.of(currency);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "Capacity" -> Optional.of(capacity);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "BidPx" -> Optional.of(bidPx);
            case "BidSize" -> Optional.of(bidSize);
            case "OfferPx" -> Optional.of(offerPx);
            case "OfferSize" -> Optional.of(offerSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteRejectV2Message message)) {
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
        if (!(other instanceof QuoteRejectV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
