package omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.BidPxField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.BidSizeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.ClearingFirmField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.CurrencyField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.IdSourceField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.NumberOfQuoteV2BitfieldsField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.OfferPxField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.OfferSizeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.QuoteIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.QuoteV2BitfieldField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.SecurityExchangeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.SecurityIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.fields.SymbolField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.types.Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.types.Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.types.PrintOptions;

/**
 * Represents the QuoteV2Message message from the TradeReporting protocol.
 *
 * <p>Quote V2 Message.</p>
 */
public final class QuoteV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 21;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote V 2 Message";

    /**
     * Corresponds to QuoteID (117) in Cboe FIX. Mandatory unique ID chosen by client for a Quote or QuoteCancel. 18 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. Please note that the last two bytes are for inter- nal use. Note: Cboe only enforces the uniqueness of QuoteID values among currently live quotes. However, we strongly recommend that you keep your QuoteID values day unique.
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfQuoteV2BitfieldsField numberOfQuoteV2Bitfields = new NumberOfQuoteV2BitfieldsField();

    /**
     * BitSet QuoteV2 byte 1.
     */
    private final QuoteV2BitfieldField quoteV2Bitfield = new QuoteV2BitfieldField();

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
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(quoteId, numberOfQuoteV2Bitfields, quoteV2Bitfield, symbol, currency, idSource, securityId, securityExchange, bidPx, bidSize, offerPx, offerSize, clearingFirm);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to QuoteID (117) in Cboe FIX. Mandatory unique ID chosen by client for a Quote or QuoteCancel. 18 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. Please note that the last two bytes are for inter- nal use. Note: Cboe only enforces the uniqueness of QuoteID values among currently live quotes. However, we strongly recommend that you keep your QuoteID values day unique.
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfQuoteV2Bitfields field
     */
    public NumberOfQuoteV2BitfieldsField numberOfQuoteV2Bitfields() {
        return numberOfQuoteV2Bitfields;
    }

    /**
     * BitSet QuoteV2 byte 1.
     *
     * @return the QuoteV2Bitfield field
     */
    public QuoteV2BitfieldField quoteV2Bitfield() {
        return quoteV2Bitfield;
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
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Returns whether the fields before the QuoteV2Bitfield put it on the wire.
     *
     * <p>Decode reads the QuoteV2Bitfield where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the QuoteV2Bitfield is on the wire
     */
    public boolean quoteV2BitfieldPresent() {
        return numberOfQuoteV2Bitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfQuoteV2Bitfields.value() >= 1L) && (quoteV2BitfieldPresent() && quoteV2Bitfield.quoteV2Bitfield1Symbol());
    }

    /**
     * Returns whether the fields before the Currency put it on the wire.
     *
     * <p>Decode reads the Currency where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Currency is on the wire
     */
    public boolean currencyPresent() {
        return (numberOfQuoteV2Bitfields.value() >= 1L) && (quoteV2BitfieldPresent() && quoteV2Bitfield.quoteV2Bitfield1Currency());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfQuoteV2Bitfields.value() >= 1L) && (quoteV2BitfieldPresent() && quoteV2Bitfield.quoteV2Bitfield1IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfQuoteV2Bitfields.value() >= 1L) && (quoteV2BitfieldPresent() && quoteV2Bitfield.quoteV2Bitfield1SecurityId());
    }

    /**
     * Returns whether the fields before the SecurityExchange put it on the wire.
     *
     * <p>Decode reads the SecurityExchange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityExchange is on the wire
     */
    public boolean securityExchangePresent() {
        return (numberOfQuoteV2Bitfields.value() >= 1L) && (quoteV2BitfieldPresent() && quoteV2Bitfield.quoteV2Bitfield1SecurityExchange());
    }

    /**
     * Returns whether the fields before the BidPx put it on the wire.
     *
     * <p>Decode reads the BidPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BidPx is on the wire
     */
    public boolean bidPxPresent() {
        return (numberOfQuoteV2Bitfields.value() >= 1L) && (quoteV2BitfieldPresent() && quoteV2Bitfield.quoteV2Bitfield1Bid());
    }

    /**
     * Returns whether the fields before the BidSize put it on the wire.
     *
     * <p>Decode reads the BidSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BidSize is on the wire
     */
    public boolean bidSizePresent() {
        return (numberOfQuoteV2Bitfields.value() >= 1L) && (quoteV2BitfieldPresent() && quoteV2Bitfield.quoteV2Bitfield1Bid());
    }

    /**
     * Returns whether the fields before the OfferPx put it on the wire.
     *
     * <p>Decode reads the OfferPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OfferPx is on the wire
     */
    public boolean offerPxPresent() {
        return (numberOfQuoteV2Bitfields.value() >= 1L) && (quoteV2BitfieldPresent() && quoteV2Bitfield.quoteV2Bitfield1Offer());
    }

    /**
     * Returns whether the fields before the OfferSize put it on the wire.
     *
     * <p>Decode reads the OfferSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OfferSize is on the wire
     */
    public boolean offerSizePresent() {
        return (numberOfQuoteV2Bitfields.value() >= 1L) && (quoteV2BitfieldPresent() && quoteV2Bitfield.quoteV2Bitfield1Offer());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfQuoteV2Bitfields.value() >= 1L) && (quoteV2BitfieldPresent() && quoteV2Bitfield.quoteV2Bitfield1ClearingFirm());
    }

    private boolean onWire(Field field) {
        return (field != quoteV2Bitfield || quoteV2BitfieldPresent()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent()) && (field != bidPx || bidPxPresent()) && (field != bidSize || bidSizePresent()) && (field != offerPx || offerPxPresent()) && (field != offerSize || offerSizePresent()) && (field != clearingFirm || clearingFirmPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (quoteV2BitfieldPresent() ? QuoteV2BitfieldField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0) + (bidPxPresent() ? BidPxField.BYTE_LENGTH : 0) + (bidSizePresent() ? BidSizeField.BYTE_LENGTH : 0) + (offerPxPresent() ? OfferPxField.BYTE_LENGTH : 0) + (offerSizePresent() ? OfferSizeField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0);
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
        if (!numberOfQuoteV2Bitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfQuoteV2BitfieldsField.BYTE_LENGTH;
        if (quoteV2BitfieldPresent()) {
            if (end - cursor < QuoteV2BitfieldField.BYTE_LENGTH || !quoteV2Bitfield.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteV2BitfieldField.BYTE_LENGTH;
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
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (quoteV2BitfieldPresent() != quoteV2Bitfield.hasValue()) {
            throw new IllegalStateException(quoteV2Bitfield.hasValue() ? "quoteV2Bitfield holds a value the fields before it leave off the wire" : "quoteV2Bitfield holds no value, though the fields before it put it on the wire");
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
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = quoteId.encode(data, cursor);
        cursor = numberOfQuoteV2Bitfields.encode(data, cursor);
        if (quoteV2BitfieldPresent()) {
            cursor = quoteV2Bitfield.encode(data, cursor);
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
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
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
            case "NumberOfQuoteV2Bitfields" -> Optional.of(numberOfQuoteV2Bitfields);
            case "QuoteV2Bitfield" -> Optional.of(quoteV2Bitfield);
            case "Symbol" -> Optional.of(symbol);
            case "Currency" -> Optional.of(currency);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "BidPx" -> Optional.of(bidPx);
            case "BidSize" -> Optional.of(bidSize);
            case "OfferPx" -> Optional.of(offerPx);
            case "OfferSize" -> Optional.of(offerSize);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteV2Message message)) {
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
        if (!(other instanceof QuoteV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
