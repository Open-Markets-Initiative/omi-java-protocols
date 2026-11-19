package omi.iex.iexequities.tops.snap.v1_6.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexequities.tops.snap.v1_6.enums.IexTpMessageType;
import omi.iex.iexequities.tops.snap.v1_6.fields.IexTpMessageTypeField;
import omi.iex.iexequities.tops.snap.v1_6.structs.AuctionInformationMessageStruct;
import omi.iex.iexequities.tops.snap.v1_6.structs.OfficialPriceMessageStruct;
import omi.iex.iexequities.tops.snap.v1_6.structs.OperationalHaltStatusMessageStruct;
import omi.iex.iexequities.tops.snap.v1_6.structs.QuoteUpdateMessageStruct;
import omi.iex.iexequities.tops.snap.v1_6.structs.RetailLiquidityIndicatorMessageStruct;
import omi.iex.iexequities.tops.snap.v1_6.structs.SecurityDirectoryMessageStruct;
import omi.iex.iexequities.tops.snap.v1_6.structs.ShortSalePriceTestStatusMessageStruct;
import omi.iex.iexequities.tops.snap.v1_6.structs.SystemEventMessageStruct;
import omi.iex.iexequities.tops.snap.v1_6.structs.TradeBreakMessageStruct;
import omi.iex.iexequities.tops.snap.v1_6.structs.TradeReportMessageStruct;
import omi.iex.iexequities.tops.snap.v1_6.structs.TradingStatusMessageStruct;
import omi.iex.iexequities.tops.snap.v1_6.types.Field;
import omi.iex.iexequities.tops.snap.v1_6.types.GroupEntry;
import omi.iex.iexequities.tops.snap.v1_6.types.PrintOptions;
import omi.iex.iexequities.tops.snap.v1_6.types.RawRecord;

/**
 * The IexTpMessageData branch: one of 11 records, each as wide as its own fields, chosen by the IexTpMessageType its holder reads before it.
 *
 * <p>One complete Iex Tops formatted message, may be any Tops message type, see the Iex Transport specification</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class IexTpMessageData implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "IexTpMessageData";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's IexTpMessageType is S.
         */
        SYSTEM_EVENT_MESSAGE,
        /**
         * Selected when its holder's IexTpMessageType is D.
         */
        SECURITY_DIRECTORY_MESSAGE,
        /**
         * Selected when its holder's IexTpMessageType is H.
         */
        TRADING_STATUS_MESSAGE,
        /**
         * Selected when its holder's IexTpMessageType is I.
         */
        RETAIL_LIQUIDITY_INDICATOR_MESSAGE,
        /**
         * Selected when its holder's IexTpMessageType is O.
         */
        OPERATIONAL_HALT_STATUS_MESSAGE,
        /**
         * Selected when its holder's IexTpMessageType is P.
         */
        SHORT_SALE_PRICE_TEST_STATUS_MESSAGE,
        /**
         * Selected when its holder's IexTpMessageType is Q.
         */
        QUOTE_UPDATE_MESSAGE,
        /**
         * Selected when its holder's IexTpMessageType is T.
         */
        TRADE_REPORT_MESSAGE,
        /**
         * Selected when its holder's IexTpMessageType is X.
         */
        OFFICIAL_PRICE_MESSAGE,
        /**
         * Selected when its holder's IexTpMessageType is B.
         */
        TRADE_BREAK_MESSAGE,
        /**
         * Selected when its holder's IexTpMessageType is A.
         */
        AUCTION_INFORMATION_MESSAGE,
        /**
         * Selected when its holder's IexTpMessageType names no case above: the bytes the wire states for it, kept whole.
         */
        UNKNOWN
    }

    private final SystemEventMessageStruct systemEventMessage = new SystemEventMessageStruct();
    private final SecurityDirectoryMessageStruct securityDirectoryMessage = new SecurityDirectoryMessageStruct();
    private final TradingStatusMessageStruct tradingStatusMessage = new TradingStatusMessageStruct();
    private final RetailLiquidityIndicatorMessageStruct retailLiquidityIndicatorMessage = new RetailLiquidityIndicatorMessageStruct();
    private final OperationalHaltStatusMessageStruct operationalHaltStatusMessage = new OperationalHaltStatusMessageStruct();
    private final ShortSalePriceTestStatusMessageStruct shortSalePriceTestStatusMessage = new ShortSalePriceTestStatusMessageStruct();
    private final QuoteUpdateMessageStruct quoteUpdateMessage = new QuoteUpdateMessageStruct();
    private final TradeReportMessageStruct tradeReportMessage = new TradeReportMessageStruct();
    private final OfficialPriceMessageStruct officialPriceMessage = new OfficialPriceMessageStruct();
    private final TradeBreakMessageStruct tradeBreakMessage = new TradeBreakMessageStruct();
    private final AuctionInformationMessageStruct auctionInformationMessage = new AuctionInformationMessageStruct();
    private final RawRecord unknown = new RawRecord();
    private Case selected = Case.SYSTEM_EVENT_MESSAGE;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the IexTpMessageType that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a IexTpMessageType selects, rules tried in order.
     *
     * @param iexTpMessageType the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(IexTpMessageTypeField iexTpMessageType) {
        if (iexTpMessageType.value() == IexTpMessageType.SYSTEM_EVENT_MESSAGE) {
            return Case.SYSTEM_EVENT_MESSAGE;
        }
        if (iexTpMessageType.value() == IexTpMessageType.SECURITY_DIRECTORY_MESSAGE) {
            return Case.SECURITY_DIRECTORY_MESSAGE;
        }
        if (iexTpMessageType.value() == IexTpMessageType.TRADING_STATUS_MESSAGE) {
            return Case.TRADING_STATUS_MESSAGE;
        }
        if (iexTpMessageType.value() == IexTpMessageType.RETAIL_LIQUIDITY_INDICATOR_MESSAGE) {
            return Case.RETAIL_LIQUIDITY_INDICATOR_MESSAGE;
        }
        if (iexTpMessageType.value() == IexTpMessageType.OPERATIONAL_HALT_STATUS_MESSAGE) {
            return Case.OPERATIONAL_HALT_STATUS_MESSAGE;
        }
        if (iexTpMessageType.value() == IexTpMessageType.SHORT_SALE_PRICE_TEST_STATUS_MESSAGE) {
            return Case.SHORT_SALE_PRICE_TEST_STATUS_MESSAGE;
        }
        if (iexTpMessageType.value() == IexTpMessageType.QUOTE_UPDATE_MESSAGE) {
            return Case.QUOTE_UPDATE_MESSAGE;
        }
        if (iexTpMessageType.value() == IexTpMessageType.TRADE_REPORT_MESSAGE) {
            return Case.TRADE_REPORT_MESSAGE;
        }
        if (iexTpMessageType.value() == IexTpMessageType.OFFICIAL_PRICE_MESSAGE) {
            return Case.OFFICIAL_PRICE_MESSAGE;
        }
        if (iexTpMessageType.value() == IexTpMessageType.TRADE_BREAK_MESSAGE) {
            return Case.TRADE_BREAK_MESSAGE;
        }
        if (iexTpMessageType.value() == IexTpMessageType.AUCTION_INFORMATION_MESSAGE) {
            return Case.AUCTION_INFORMATION_MESSAGE;
        }
        return null;
    }

    /**
     * Writes the IexTpMessageType that selects the case this branch holds.
     *
     * @param iexTpMessageType the field its holder writes before this branch
     */
    public void writeKey(IexTpMessageTypeField iexTpMessageType) {
        switch (selected) {
            case SYSTEM_EVENT_MESSAGE -> iexTpMessageType.value(IexTpMessageType.SYSTEM_EVENT_MESSAGE);
            case SECURITY_DIRECTORY_MESSAGE -> iexTpMessageType.value(IexTpMessageType.SECURITY_DIRECTORY_MESSAGE);
            case TRADING_STATUS_MESSAGE -> iexTpMessageType.value(IexTpMessageType.TRADING_STATUS_MESSAGE);
            case RETAIL_LIQUIDITY_INDICATOR_MESSAGE -> iexTpMessageType.value(IexTpMessageType.RETAIL_LIQUIDITY_INDICATOR_MESSAGE);
            case OPERATIONAL_HALT_STATUS_MESSAGE -> iexTpMessageType.value(IexTpMessageType.OPERATIONAL_HALT_STATUS_MESSAGE);
            case SHORT_SALE_PRICE_TEST_STATUS_MESSAGE -> iexTpMessageType.value(IexTpMessageType.SHORT_SALE_PRICE_TEST_STATUS_MESSAGE);
            case QUOTE_UPDATE_MESSAGE -> iexTpMessageType.value(IexTpMessageType.QUOTE_UPDATE_MESSAGE);
            case TRADE_REPORT_MESSAGE -> iexTpMessageType.value(IexTpMessageType.TRADE_REPORT_MESSAGE);
            case OFFICIAL_PRICE_MESSAGE -> iexTpMessageType.value(IexTpMessageType.OFFICIAL_PRICE_MESSAGE);
            case TRADE_BREAK_MESSAGE -> iexTpMessageType.value(IexTpMessageType.TRADE_BREAK_MESSAGE);
            case AUCTION_INFORMATION_MESSAGE -> iexTpMessageType.value(IexTpMessageType.AUCTION_INFORMATION_MESSAGE);
            case UNKNOWN -> { }
        }
    }

    /**
     * Decodes the case a IexTpMessageType selects.
     *
     * @param iexTpMessageType the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when its record decoded; a key naming no declared case keeps the bytes the wire states
     */
    public boolean parseFrom(IexTpMessageTypeField iexTpMessageType, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(iexTpMessageType);
        if (chosen == null) {
            chosen = Case.UNKNOWN;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    /**
     * Returns the SystemEventMessage case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SystemEventMessageStruct systemEventMessage() {
        return systemEventMessage;
    }

    /**
     * Returns the SecurityDirectoryMessage case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SecurityDirectoryMessageStruct securityDirectoryMessage() {
        return securityDirectoryMessage;
    }

    /**
     * Returns the TradingStatusMessage case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradingStatusMessageStruct tradingStatusMessage() {
        return tradingStatusMessage;
    }

    /**
     * Returns the RetailLiquidityIndicatorMessage case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public RetailLiquidityIndicatorMessageStruct retailLiquidityIndicatorMessage() {
        return retailLiquidityIndicatorMessage;
    }

    /**
     * Returns the OperationalHaltStatusMessage case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OperationalHaltStatusMessageStruct operationalHaltStatusMessage() {
        return operationalHaltStatusMessage;
    }

    /**
     * Returns the ShortSalePriceTestStatusMessage case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ShortSalePriceTestStatusMessageStruct shortSalePriceTestStatusMessage() {
        return shortSalePriceTestStatusMessage;
    }

    /**
     * Returns the QuoteUpdateMessage case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public QuoteUpdateMessageStruct quoteUpdateMessage() {
        return quoteUpdateMessage;
    }

    /**
     * Returns the TradeReportMessage case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradeReportMessageStruct tradeReportMessage() {
        return tradeReportMessage;
    }

    /**
     * Returns the OfficialPriceMessage case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OfficialPriceMessageStruct officialPriceMessage() {
        return officialPriceMessage;
    }

    /**
     * Returns the TradeBreakMessage case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradeBreakMessageStruct tradeBreakMessage() {
        return tradeBreakMessage;
    }

    /**
     * Returns the AuctionInformationMessage case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AuctionInformationMessageStruct auctionInformationMessage() {
        return auctionInformationMessage;
    }

    /**
     * Returns the bytes of an undeclared case, which holds them when it is selected.
     *
     * @return the undeclared case's record
     */
    public RawRecord unknown() {
        return unknown;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case SYSTEM_EVENT_MESSAGE -> systemEventMessage;
            case SECURITY_DIRECTORY_MESSAGE -> securityDirectoryMessage;
            case TRADING_STATUS_MESSAGE -> tradingStatusMessage;
            case RETAIL_LIQUIDITY_INDICATOR_MESSAGE -> retailLiquidityIndicatorMessage;
            case OPERATIONAL_HALT_STATUS_MESSAGE -> operationalHaltStatusMessage;
            case SHORT_SALE_PRICE_TEST_STATUS_MESSAGE -> shortSalePriceTestStatusMessage;
            case QUOTE_UPDATE_MESSAGE -> quoteUpdateMessage;
            case TRADE_REPORT_MESSAGE -> tradeReportMessage;
            case OFFICIAL_PRICE_MESSAGE -> officialPriceMessage;
            case TRADE_BREAK_MESSAGE -> tradeBreakMessage;
            case AUCTION_INFORMATION_MESSAGE -> auctionInformationMessage;
            case UNKNOWN -> unknown;
        };
    }

    /**
     * Returns the declared padding runs: none, as no case of a branch holds padding.
     *
     * @return an empty array
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public int byteLength() {
        return entry().byteLength();
    }

    @Override
    public Optional<byte[]> raw() {
        return entry().raw();
    }

    @Override
    public boolean isDecoded() {
        return entry().isDecoded();
    }

    @Override
    public boolean isRecognized() {
        return entry().isRecognized();
    }

    @Override
    public boolean isValid() {
        return entry().isValid();
    }

    @Override
    public Optional<Field> failedAt() {
        return entry().failedAt();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        Case chosen = selected;
        clear();
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        return entry().encode(data, offset);
    }

    @Override
    public byte[] toBytes() {
        return entry().toBytes();
    }

    @Override
    public void clear() {
        systemEventMessage.clear();
        securityDirectoryMessage.clear();
        tradingStatusMessage.clear();
        retailLiquidityIndicatorMessage.clear();
        operationalHaltStatusMessage.clear();
        shortSalePriceTestStatusMessage.clear();
        quoteUpdateMessage.clear();
        tradeReportMessage.clear();
        officialPriceMessage.clear();
        tradeBreakMessage.clear();
        auctionInformationMessage.clear();
        unknown.clear();
        selected = Case.SYSTEM_EVENT_MESSAGE;
    }

    @Override
    public List<Field> fields() {
        return entry().fields();
    }

    @Override
    public Optional<Field> field(String name) {
        return entry().field(name);
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        return other instanceof IexTpMessageData branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }
        entry().toFormattedString(builder, options);
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        return this == other || other instanceof IexTpMessageData branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
