package omi.nse.nsecom.dropcopy.nnfdirect.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.AccountNumField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.ActivityTimeField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.ActivityTypeField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.AdditionalOrderFlagsField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.AlgoIdField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.BookTypeCharField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.BrokerIdField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.BuySellField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.DisclosedVolField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.DisclosedVolRemainingField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.FillNumberField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.FillPriceField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.FillQtyField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.GiveUpTradeField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.GtdField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.LastActivityReferenceField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.NewVolumeField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.NnfFieldField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.OldAccountNumberField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.OldOpenCloseField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.OldPanField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.OldParticipantField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.OpBrokerIdField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.OpOrderNumberField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.OpenCloseField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.OriginalVolField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.PanField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.ParticipantField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.PriceField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.RemainingVolField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.ResponseOrderNumberField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.StOrderFlagsField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.TokenField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.TraderNumField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.fields.VolFilledTodayField;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.structs.ContractDesc;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.types.Field;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.types.Message;
import omi.nse.nsecom.dropcopy.nnfdirect.v1_5.types.PrintOptions;

/**
 * Represents the TradeCancelRejectMessage message from the DropCopy protocol.
 *
 * <p>Rejects a trade cancellation</p>
 */
public final class TradeCancelRejectMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 256;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Cancel Reject Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 13, 1, 91, 1, 127, 1, 167, 1, 169, 1, 194, 2, 212, 44 };

    /**
     * Order number of the order taking part in the trade
     */
    private final ResponseOrderNumberField responseOrderNumber = new ResponseOrderNumberField();

    /**
     * Trading member Id
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * Trader or user Id
     */
    private final TraderNumField traderNum = new TraderNumField();

    /**
     * Account number or client code
     */
    private final AccountNumField accountNum = new AccountNumField();

    /**
     * Whether the order taking part is a buy or a sell
     */
    private final BuySellField buySell = new BuySellField();

    /**
     * Original traded volume
     */
    private final OriginalVolField originalVol = new OriginalVolField();

    /**
     * Quantity disclosed to the market
     */
    private final DisclosedVolField disclosedVol = new DisclosedVolField();

    /**
     * Volume remaining after the trade
     */
    private final RemainingVolField remainingVol = new RemainingVolField();

    /**
     * Disclosed volume remaining after the trade
     */
    private final DisclosedVolRemainingField disclosedVolRemaining = new DisclosedVolRemainingField();

    /**
     * Order price
     */
    private final PriceField price = new PriceField();

    /**
     * Terms attached to the order
     */
    private final StOrderFlagsField stOrderFlags = new StOrderFlagsField();

    /**
     * Date until when the GTD order is retained in the system, as an absolute date in seconds from midnight 1 January 1980, and no later than the contract's expiry date
     */
    private final GtdField gtd = new GtdField();

    /**
     * Trade number
     */
    private final FillNumberField fillNumber = new FillNumberField();

    /**
     * Traded volume
     */
    private final FillQtyField fillQty = new FillQtyField();

    /**
     * Price at which the order traded, to be divided by 100 to get the price in rupees
     */
    private final FillPriceField fillPrice = new FillPriceField();

    /**
     * Quantity traded today
     */
    private final VolFilledTodayField volFilledToday = new VolFilledTodayField();

    /**
     * Type of activity being confirmed
     */
    private final ActivityTypeField activityType = new ActivityTypeField();

    /**
     * Time the activity occurred
     */
    private final ActivityTimeField activityTime = new ActivityTimeField();

    /**
     * Order number on the counter party side
     */
    private final OpOrderNumberField opOrderNumber = new OpOrderNumberField();

    /**
     * Trading member Id of the counter party
     */
    private final OpBrokerIdField opBrokerId = new OpBrokerIdField();

    /**
     * Token number of the contract
     */
    private final TokenField token = new TokenField();

    /**
     * Whether the trade opens or closes a position
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Previous open or close indicator
     */
    private final OldOpenCloseField oldOpenClose = new OldOpenCloseField();

    /**
     * Book the order belongs to
     */
    private final BookTypeCharField bookTypeChar = new BookTypeCharField();

    /**
     * Revised volume
     */
    private final NewVolumeField newVolume = new NewVolumeField();

    /**
     * Previous account number
     */
    private final OldAccountNumberField oldAccountNumber = new OldAccountNumberField();

    /**
     * Participant's name
     */
    private final ParticipantField participant = new ParticipantField();

    /**
     * Previous participant's name
     */
    private final OldParticipantField oldParticipant = new OldParticipantField();

    /**
     * Further terms attached to the order
     */
    private final AdditionalOrderFlagsField additionalOrderFlags = new AdditionalOrderFlagsField();

    /**
     * Whether the trade is a give up
     */
    private final GiveUpTradeField giveUpTrade = new GiveUpTradeField();

    /**
     * Permanent Account Number
     */
    private final PanField pan = new PanField();

    /**
     * Previous Permanent Account Number
     */
    private final OldPanField oldPan = new OldPanField();

    /**
     * Algo Id issued by the exchange, zero for a non algo order
     */
    private final AlgoIdField algoId = new AlgoIdField();

    /**
     * Unique value for the activity, currently in nanoseconds
     */
    private final LastActivityReferenceField lastActivityReference = new LastActivityReferenceField();

    /**
     * Fifteen digit unique identifier for the product
     */
    private final NnfFieldField nnfField = new NnfFieldField();

    /**
     * CONTRACT_DESC
     */
    private final ContractDesc contractDesc = new ContractDesc();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(responseOrderNumber), List.<Field>of(brokerId), List.<Field>of(traderNum), List.<Field>of(accountNum), List.<Field>of(buySell), List.<Field>of(originalVol), List.<Field>of(disclosedVol), List.<Field>of(remainingVol), List.<Field>of(disclosedVolRemaining), List.<Field>of(price), List.<Field>of(stOrderFlags), List.<Field>of(gtd), List.<Field>of(fillNumber), List.<Field>of(fillQty), List.<Field>of(fillPrice), List.<Field>of(volFilledToday), List.<Field>of(activityType), List.<Field>of(activityTime), List.<Field>of(opOrderNumber), List.<Field>of(opBrokerId), List.<Field>of(token), contractDesc.fields(), List.<Field>of(openClose), List.<Field>of(oldOpenClose), List.<Field>of(bookTypeChar), List.<Field>of(newVolume), List.<Field>of(oldAccountNumber), List.<Field>of(participant), List.<Field>of(oldParticipant), List.<Field>of(additionalOrderFlags), List.<Field>of(giveUpTrade), List.<Field>of(pan), List.<Field>of(oldPan), List.<Field>of(algoId), List.<Field>of(lastActivityReference), List.<Field>of(nnfField)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Order number of the order taking part in the trade
     *
     * @return the ResponseOrderNumber field
     */
    public ResponseOrderNumberField responseOrderNumber() {
        return responseOrderNumber;
    }

    /**
     * Trading member Id
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * Trader or user Id
     *
     * @return the TraderNum field
     */
    public TraderNumField traderNum() {
        return traderNum;
    }

    /**
     * Account number or client code
     *
     * @return the AccountNum field
     */
    public AccountNumField accountNum() {
        return accountNum;
    }

    /**
     * Whether the order taking part is a buy or a sell
     *
     * @return the BuySell field
     */
    public BuySellField buySell() {
        return buySell;
    }

    /**
     * Original traded volume
     *
     * @return the OriginalVol field
     */
    public OriginalVolField originalVol() {
        return originalVol;
    }

    /**
     * Quantity disclosed to the market
     *
     * @return the DisclosedVol field
     */
    public DisclosedVolField disclosedVol() {
        return disclosedVol;
    }

    /**
     * Volume remaining after the trade
     *
     * @return the RemainingVol field
     */
    public RemainingVolField remainingVol() {
        return remainingVol;
    }

    /**
     * Disclosed volume remaining after the trade
     *
     * @return the DisclosedVolRemaining field
     */
    public DisclosedVolRemainingField disclosedVolRemaining() {
        return disclosedVolRemaining;
    }

    /**
     * Order price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Terms attached to the order
     *
     * @return the StOrderFlags field
     */
    public StOrderFlagsField stOrderFlags() {
        return stOrderFlags;
    }

    /**
     * Date until when the GTD order is retained in the system, as an absolute date in seconds from midnight 1 January 1980, and no later than the contract's expiry date
     *
     * @return the Gtd field
     */
    public GtdField gtd() {
        return gtd;
    }

    /**
     * Trade number
     *
     * @return the FillNumber field
     */
    public FillNumberField fillNumber() {
        return fillNumber;
    }

    /**
     * Traded volume
     *
     * @return the FillQty field
     */
    public FillQtyField fillQty() {
        return fillQty;
    }

    /**
     * Price at which the order traded, to be divided by 100 to get the price in rupees
     *
     * @return the FillPrice field
     */
    public FillPriceField fillPrice() {
        return fillPrice;
    }

    /**
     * Quantity traded today
     *
     * @return the VolFilledToday field
     */
    public VolFilledTodayField volFilledToday() {
        return volFilledToday;
    }

    /**
     * Type of activity being confirmed
     *
     * @return the ActivityType field
     */
    public ActivityTypeField activityType() {
        return activityType;
    }

    /**
     * Time the activity occurred
     *
     * @return the ActivityTime field
     */
    public ActivityTimeField activityTime() {
        return activityTime;
    }

    /**
     * Order number on the counter party side
     *
     * @return the OpOrderNumber field
     */
    public OpOrderNumberField opOrderNumber() {
        return opOrderNumber;
    }

    /**
     * Trading member Id of the counter party
     *
     * @return the OpBrokerId field
     */
    public OpBrokerIdField opBrokerId() {
        return opBrokerId;
    }

    /**
     * Token number of the contract
     *
     * @return the Token field
     */
    public TokenField token() {
        return token;
    }

    /**
     * Whether the trade opens or closes a position
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Previous open or close indicator
     *
     * @return the OldOpenClose field
     */
    public OldOpenCloseField oldOpenClose() {
        return oldOpenClose;
    }

    /**
     * Book the order belongs to
     *
     * @return the BookTypeChar field
     */
    public BookTypeCharField bookTypeChar() {
        return bookTypeChar;
    }

    /**
     * Revised volume
     *
     * @return the NewVolume field
     */
    public NewVolumeField newVolume() {
        return newVolume;
    }

    /**
     * Previous account number
     *
     * @return the OldAccountNumber field
     */
    public OldAccountNumberField oldAccountNumber() {
        return oldAccountNumber;
    }

    /**
     * Participant's name
     *
     * @return the Participant field
     */
    public ParticipantField participant() {
        return participant;
    }

    /**
     * Previous participant's name
     *
     * @return the OldParticipant field
     */
    public OldParticipantField oldParticipant() {
        return oldParticipant;
    }

    /**
     * Further terms attached to the order
     *
     * @return the AdditionalOrderFlags field
     */
    public AdditionalOrderFlagsField additionalOrderFlags() {
        return additionalOrderFlags;
    }

    /**
     * Whether the trade is a give up
     *
     * @return the GiveUpTrade field
     */
    public GiveUpTradeField giveUpTrade() {
        return giveUpTrade;
    }

    /**
     * Permanent Account Number
     *
     * @return the Pan field
     */
    public PanField pan() {
        return pan;
    }

    /**
     * Previous Permanent Account Number
     *
     * @return the OldPan field
     */
    public OldPanField oldPan() {
        return oldPan;
    }

    /**
     * Algo Id issued by the exchange, zero for a non algo order
     *
     * @return the AlgoId field
     */
    public AlgoIdField algoId() {
        return algoId;
    }

    /**
     * Unique value for the activity, currently in nanoseconds
     *
     * @return the LastActivityReference field
     */
    public LastActivityReferenceField lastActivityReference() {
        return lastActivityReference;
    }

    /**
     * Fifteen digit unique identifier for the product
     *
     * @return the NnfField field
     */
    public NnfFieldField nnfField() {
        return nnfField;
    }

    /**
     * CONTRACT_DESC
     *
     * @return the ContractDesc record
     */
    public ContractDesc contractDesc() {
        return contractDesc;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!responseOrderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ResponseOrderNumberField.BYTE_LENGTH;
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!traderNum.parse(data, cursor)) {
            return false;
        }
        cursor += TraderNumField.BYTE_LENGTH;
        if (!accountNum.parse(data, cursor)) {
            return false;
        }
        cursor += AccountNumField.BYTE_LENGTH;
        if (!buySell.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellField.BYTE_LENGTH;
        if (!originalVol.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalVolField.BYTE_LENGTH;
        if (!disclosedVol.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosedVolField.BYTE_LENGTH;
        if (!remainingVol.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingVolField.BYTE_LENGTH;
        if (!disclosedVolRemaining.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosedVolRemainingField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!stOrderFlags.parse(data, cursor)) {
            return false;
        }
        cursor += StOrderFlagsField.BYTE_LENGTH;
        if (!gtd.parse(data, cursor)) {
            return false;
        }
        cursor += GtdField.BYTE_LENGTH;
        if (!fillNumber.parse(data, cursor)) {
            return false;
        }
        cursor += FillNumberField.BYTE_LENGTH;
        if (!fillQty.parse(data, cursor)) {
            return false;
        }
        cursor += FillQtyField.BYTE_LENGTH;
        if (!fillPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FillPriceField.BYTE_LENGTH;
        if (!volFilledToday.parse(data, cursor)) {
            return false;
        }
        cursor += VolFilledTodayField.BYTE_LENGTH;
        if (!activityType.parse(data, cursor)) {
            return false;
        }
        cursor += ActivityTypeField.BYTE_LENGTH;
        if (!activityTime.parse(data, cursor)) {
            return false;
        }
        cursor += ActivityTimeField.BYTE_LENGTH;
        if (!opOrderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OpOrderNumberField.BYTE_LENGTH;
        if (!opBrokerId.parse(data, cursor)) {
            return false;
        }
        cursor += OpBrokerIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!token.parse(data, cursor)) {
            return false;
        }
        cursor += TokenField.BYTE_LENGTH;
        if (!contractDesc.parseFrom(data, cursor, end - 132)) {
            return false;
        }
        cursor += contractDesc.byteLength();
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!oldOpenClose.parse(data, cursor)) {
            return false;
        }
        cursor += OldOpenCloseField.BYTE_LENGTH;
        if (!bookTypeChar.parse(data, cursor)) {
            return false;
        }
        cursor += BookTypeCharField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!newVolume.parse(data, cursor)) {
            return false;
        }
        cursor += NewVolumeField.BYTE_LENGTH;
        if (!oldAccountNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OldAccountNumberField.BYTE_LENGTH;
        if (!participant.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantField.BYTE_LENGTH;
        if (!oldParticipant.parse(data, cursor)) {
            return false;
        }
        cursor += OldParticipantField.BYTE_LENGTH;
        if (!additionalOrderFlags.parse(data, cursor)) {
            return false;
        }
        cursor += AdditionalOrderFlagsField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!giveUpTrade.parse(data, cursor)) {
            return false;
        }
        cursor += GiveUpTradeField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!pan.parse(data, cursor)) {
            return false;
        }
        cursor += PanField.BYTE_LENGTH;
        if (!oldPan.parse(data, cursor)) {
            return false;
        }
        cursor += OldPanField.BYTE_LENGTH;
        if (!algoId.parse(data, cursor)) {
            return false;
        }
        cursor += AlgoIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!lastActivityReference.parse(data, cursor)) {
            return false;
        }
        cursor += LastActivityReferenceField.BYTE_LENGTH;
        if (!nnfField.parse(data, cursor)) {
            return false;
        }
        cursor += NnfFieldField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = responseOrderNumber.encode(data, cursor);
        cursor = brokerId.encode(data, cursor);
        if (buffer != null && buffer.length >= 14) {
            System.arraycopy(buffer, 13, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = traderNum.encode(data, cursor);
        cursor = accountNum.encode(data, cursor);
        cursor = buySell.encode(data, cursor);
        cursor = originalVol.encode(data, cursor);
        cursor = disclosedVol.encode(data, cursor);
        cursor = remainingVol.encode(data, cursor);
        cursor = disclosedVolRemaining.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = stOrderFlags.encode(data, cursor);
        cursor = gtd.encode(data, cursor);
        cursor = fillNumber.encode(data, cursor);
        cursor = fillQty.encode(data, cursor);
        cursor = fillPrice.encode(data, cursor);
        cursor = volFilledToday.encode(data, cursor);
        cursor = activityType.encode(data, cursor);
        cursor = activityTime.encode(data, cursor);
        cursor = opOrderNumber.encode(data, cursor);
        cursor = opBrokerId.encode(data, cursor);
        if (buffer != null && buffer.length >= 92) {
            System.arraycopy(buffer, 91, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = token.encode(data, cursor);
        cursor = contractDesc.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = oldOpenClose.encode(data, cursor);
        cursor = bookTypeChar.encode(data, cursor);
        if (buffer != null && buffer.length >= 128) {
            System.arraycopy(buffer, 127, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = newVolume.encode(data, cursor);
        cursor = oldAccountNumber.encode(data, cursor);
        cursor = participant.encode(data, cursor);
        cursor = oldParticipant.encode(data, cursor);
        cursor = additionalOrderFlags.encode(data, cursor);
        if (buffer != null && buffer.length >= 168) {
            System.arraycopy(buffer, 167, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = giveUpTrade.encode(data, cursor);
        if (buffer != null && buffer.length >= 170) {
            System.arraycopy(buffer, 169, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = pan.encode(data, cursor);
        cursor = oldPan.encode(data, cursor);
        cursor = algoId.encode(data, cursor);
        if (buffer != null && buffer.length >= 196) {
            System.arraycopy(buffer, 194, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = lastActivityReference.encode(data, cursor);
        cursor = nnfField.encode(data, cursor);
        if (buffer != null && buffer.length >= 256) {
            System.arraycopy(buffer, 212, data, cursor, 44); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 44, (byte) 0); // padding
        }
        cursor += 44;
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
        contractDesc.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
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
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "ResponseOrderNumber" -> Optional.of(responseOrderNumber);
            case "BrokerId" -> Optional.of(brokerId);
            case "TraderNum" -> Optional.of(traderNum);
            case "AccountNum" -> Optional.of(accountNum);
            case "BuySell" -> Optional.of(buySell);
            case "OriginalVol" -> Optional.of(originalVol);
            case "DisclosedVol" -> Optional.of(disclosedVol);
            case "RemainingVol" -> Optional.of(remainingVol);
            case "DisclosedVolRemaining" -> Optional.of(disclosedVolRemaining);
            case "Price" -> Optional.of(price);
            case "StOrderFlags" -> Optional.of(stOrderFlags);
            case "Gtd" -> Optional.of(gtd);
            case "FillNumber" -> Optional.of(fillNumber);
            case "FillQty" -> Optional.of(fillQty);
            case "FillPrice" -> Optional.of(fillPrice);
            case "VolFilledToday" -> Optional.of(volFilledToday);
            case "ActivityType" -> Optional.of(activityType);
            case "ActivityTime" -> Optional.of(activityTime);
            case "OpOrderNumber" -> Optional.of(opOrderNumber);
            case "OpBrokerId" -> Optional.of(opBrokerId);
            case "Token" -> Optional.of(token);
            case "OpenClose" -> Optional.of(openClose);
            case "OldOpenClose" -> Optional.of(oldOpenClose);
            case "BookTypeChar" -> Optional.of(bookTypeChar);
            case "NewVolume" -> Optional.of(newVolume);
            case "OldAccountNumber" -> Optional.of(oldAccountNumber);
            case "Participant" -> Optional.of(participant);
            case "OldParticipant" -> Optional.of(oldParticipant);
            case "AdditionalOrderFlags" -> Optional.of(additionalOrderFlags);
            case "GiveUpTrade" -> Optional.of(giveUpTrade);
            case "Pan" -> Optional.of(pan);
            case "OldPan" -> Optional.of(oldPan);
            case "AlgoId" -> Optional.of(algoId);
            case "LastActivityReference" -> Optional.of(lastActivityReference);
            case "NnfField" -> Optional.of(nnfField);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCancelRejectMessage message)) {
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
        if (!(other instanceof TradeCancelRejectMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
