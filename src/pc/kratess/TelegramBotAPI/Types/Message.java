package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONArray;
import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Enums.ReplyMarkup.InlineKeyboard.InlineKeyboardMarkup;
import pc.kratess.TelegramBotAPI.Passport.PassportData;
import pc.kratess.TelegramBotAPI.Payments.SuccessfulPayment;
import pc.kratess.TelegramBotAPI.Updating.Sticker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Message {

    private int message_id;

    private User from;

    private int date;
    private Chat chat;

    private User forwardFrom;
    private Chat forwardFromChat;
    private int forwardFromMessageId;
    private String forwardSignature;
    private String forwardSenderName;
    private int forwardDate;
    private Message replyToMessage;
    private int editDate;
    private String mediaGroupId;
    private String authorSignature;
    private String text;
    private ArrayList<MessageEntity> entities;
    private ArrayList<MessageEntity> captionEntities;
    private Audio audio;
    private Document document;
    private Animation animation;
    private Game game;
    private ArrayList<PhotoSize> photo;
    private Sticker sticker;
    private Video video;
    private Voice voice;
    private VideoNote videoNote;
    private String caption;
    private Contact contact;
    private Location location;
    private Venue venue;
    private Poll poll;
    private ArrayList<User> newChatMembers;
    private User leftChatMember;
    private String newChatTitle;
    private ArrayList<PhotoSize> newChatPhoto;
    private boolean deleteChatPhoto;
    private boolean groupChatCreated;
    private boolean supergroupChatCreated;
    private boolean channelChatCreated;
    private int migrateToChatId;
    private int migrateFromChatId;
    private Message pinnedMessage;
    private SuccessfulPayment successfulPayment;
    private String connectedWebsite;
    private PassportData passportData;
    private InlineKeyboardMarkup replyMarkup;

    public Message(JSONObject messageObject) {
        this.message_id = messageObject.getInt("message_id");
        this.date = messageObject.getInt("date");
        this.chat = new Chat(messageObject.getJSONObject("chat"));

        if (!messageObject.isNull("from")) {
            this.from = new User(messageObject.getJSONObject("from"));
        }

        if (!messageObject.isNull("forward_from")) {
            this.forwardFrom = new User(messageObject.getJSONObject("forward_from"));
        }

        if (!messageObject.isNull("forward_from_chat")) {
            this.forwardFromChat = new Chat(messageObject.getJSONObject("forward_from_chat"));
        }

        if (!messageObject.isNull("forward_from_message_id")) {
            this.forwardFromMessageId = messageObject.getInt("forward_from_message_id");
        }

        if (!messageObject.isNull("forward_signature")) {
            this.forwardSignature = messageObject.getString("forward_signature");
        }

        if (!messageObject.isNull("forward_sender_name")) {
            this.forwardSenderName = messageObject.getString("forward_sender_name");
        }

        if (!messageObject.isNull("forward_date")) {
            this.forwardDate = messageObject.getInt("forward_date");
        }

        if (!messageObject.isNull("reply_to_message")) {
            this.replyToMessage = new Message(messageObject.getJSONObject("reply_to_message"));
        }

        if (!messageObject.isNull("edit_date")) {
            this.editDate = messageObject.getInt("edit_date");
        }

        if (!messageObject.isNull("media_group_id")) {
            this.mediaGroupId = messageObject.getString("media_group_id");
        }

        if (!messageObject.isNull("author_signature")) {
            this.authorSignature = messageObject.getString("author_signature");
        }

        if (!messageObject.isNull("text")) {
            this.text = messageObject.getString("text");
        }

        if (!messageObject.isNull("entities")) {
            JSONArray array = messageObject.getJSONArray("entities");
            this.entities = (ArrayList<MessageEntity>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(MessageEntity::new).collect(Collectors.toList());
        }

        if (!messageObject.isNull("caption_entities")) {
            JSONArray array = messageObject.getJSONArray("caption_entities");
            this.captionEntities = (ArrayList<MessageEntity>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(MessageEntity::new).collect(Collectors.toList());
        }

        if (!messageObject.isNull("audio")) {
            this.audio = new Audio(messageObject.getJSONObject("audio"));
        }

        if (!messageObject.isNull("document")) {
            this.document = new Document(messageObject.getJSONObject("document"));
        }

        if (!messageObject.isNull("animation")) {
            this.animation = new Animation(messageObject.getJSONObject("animation"));
        }

        if (!messageObject.isNull("game")) {
            this.game = new Game(messageObject.getJSONObject("game"));
        }

        if (!messageObject.isNull("photo")) {
            JSONArray array = messageObject.getJSONArray("photo");
            this.photo = (ArrayList<PhotoSize>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(PhotoSize::new).collect(Collectors.toList());
        }

        if (!messageObject.isNull("sticker")) {
            this.sticker = new Sticker(messageObject.getJSONObject("sticker"));
        }

        if (!messageObject.isNull("video")) {
            this.video = new Video(messageObject.getJSONObject("video"));
        }

        if (!messageObject.isNull("video_note")) {
            this.videoNote = new VideoNote(messageObject.getJSONObject("video_note"));
        }

        if (!messageObject.isNull("caption")) {
            this.caption = messageObject.getString("caption");
        }

        if (!messageObject.isNull("contact")) {
            this.contact = new Contact(messageObject.getJSONObject("contact"));
        }

        if (!messageObject.isNull("location")) {
            this.location = new Location(messageObject.getJSONObject("location"));
        }

        if (!messageObject.isNull("venue")) {
            this.venue = new Venue(messageObject.getJSONObject("venue"));
        }

        if (!messageObject.isNull("poll")) {
            this.poll = new Poll(messageObject.getJSONObject("poll"));
        }

        if (!messageObject.isNull("new_chat_members")) {
            JSONArray array = messageObject.getJSONArray("new_chat_members");
            this.newChatMembers = (ArrayList<User>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(User::new).collect(Collectors.toList());
        }

        if (!messageObject.isNull("left_chat_member")) {
            this.leftChatMember = new User(messageObject.getJSONObject("left_chat_member"));
        }

        if (!messageObject.isNull("new_chat_title")) {
            this.newChatTitle = messageObject.getString("new_chat_title");
        }

        if (!messageObject.isNull("new_chat_photo")) {
            JSONArray array = messageObject.getJSONArray("new_chat_photo");
            this.newChatPhoto = (ArrayList<PhotoSize>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(PhotoSize::new).collect(Collectors.toList());
        }

        if (!messageObject.isNull("delete_chat_photo")) {
            this.deleteChatPhoto = messageObject.getBoolean("delete_chat_photo");
        }

        if (!messageObject.isNull("group_chat_created")) {
            this.groupChatCreated = messageObject.getBoolean("group_chat_created");
        }

        if (!messageObject.isNull("supergroup_chat_created")) {
            this.supergroupChatCreated = messageObject.getBoolean("supergroup_chat_created");
        }

        if (!messageObject.isNull("channel_chat_created")) {
            this.channelChatCreated = messageObject.getBoolean("channel_chat_created");
        }

        if (!messageObject.isNull("migrate_to_chat_id")) {
            this.migrateToChatId = messageObject.getInt("migrate_to_chat_id");
        }

        if (!messageObject.isNull("migrate_from_chat_id")) {
            this.migrateFromChatId = messageObject.getInt("migrate_from_chat_id");
        }

        if (!messageObject.isNull("pinned_message")) {
            this.pinnedMessage = new Message(messageObject.getJSONObject("pinned_message"));
        }

        if (!messageObject.isNull("successful_payment")) {
            this.successfulPayment = new SuccessfulPayment(messageObject.getJSONObject("successful_payment"));
        }

        if (!messageObject.isNull("connected_website")) {
            this.connectedWebsite = messageObject.getString("connected_website");
        }

        if (!messageObject.isNull("passport_data")) {
            this.passportData = new PassportData(messageObject.getJSONObject("passport_data"));
        }

        /*if (!messageObject.isNull("reply_markup")) {
            this.replyMarkup = new InlineKeyboardMarkup(messageObject.getJSONObject("reply_markup"));
        }*/
    }

    public Message(int message_id, int date, Chat chat) {
        this.message_id = message_id;
        this.date = date;
        this.chat = chat;
    }

    public Message from(User from) {
        this.from = from;

        return this;
    }

    public Message forwardFrom(User forwardFrom) {
        this.forwardFrom = forwardFrom;

        return this;
    }

    public Message forwardFromChat(Chat forwardFromChat) {
        this.forwardFromChat = forwardFromChat;

        return this;
    }

    public Message forwardFromMessageId(int forwardFromMessageId) {
        this.forwardFromMessageId = forwardFromMessageId;

        return this;
    }

    public Message forwardSignature(String forwardSignature) {
        this.forwardSignature = forwardSignature;

        return this;
    }

    public Message forwardSenderName(String forwardSenderName) {
        this.forwardSenderName = forwardSenderName;

        return this;
    }

    public Message forwardDate(int forwardDate) {
        this.forwardDate = forwardDate;

        return this;
    }

    public Message replyToMessage(Message replyToMessage) {
        this.replyToMessage = replyToMessage;

        return this;
    }

    public Message editDate(int editDate) {
        this.editDate = editDate;

        return this;
    }

    public Message mediaGroupId(String mediaGroupId) {
        this.mediaGroupId = mediaGroupId;

        return this;
    }

    public Message authorSignature(String authorSignature) {
        this.authorSignature = authorSignature;

        return this;
    }

    public Message text(String text) {
        this.text = text;

        return this;
    }

    public Message entities(ArrayList<MessageEntity> entities) {
        this.entities = entities;

        return this;
    }

    public Message captionEntities(ArrayList<MessageEntity> captionEntities) {
        this.captionEntities = captionEntities;

        return this;
    }

    public Message audio(Audio audio) {
        this.audio = audio;

        return this;
    }

    public Message document(Document document) {
        this.document = document;

        return this;
    }

    public Message animation(Animation animation) {
        this.animation = animation;

        return this;
    }

    public Message game(Game game) {
        this.game = game;

        return this;
    }

    public Message photo(ArrayList<PhotoSize> photo) {
        this.photo = photo;

        return this;
    }

    public Message sticker(Sticker sticker) {
        this.sticker = sticker;

        return this;
    }

    public Message video(Video video) {
        this.video = video;

        return this;
    }

    public Message voice(Voice voice) {
        this.voice = voice;

        return this;
    }

    public Message videoNote(VideoNote videoNote) {
        this.videoNote = videoNote;

        return this;
    }

    public Message caption(String caption) {
        this.caption = caption;

        return this;
    }

    public Message contact(Contact contact) {
        this.contact = contact;

        return this;
    }

    public Message location(Location location) {
        this.location = location;

        return this;
    }

    public Message venue(Venue venue) {
        this.venue = venue;

        return this;
    }

    public Message poll(Poll poll) {
        this.poll = poll;

        return this;
    }

    public Message newChatMembers(ArrayList<User> newChatMembers) {
        this.newChatMembers = newChatMembers;

        return this;
    }

    public Message leftChatMember(User leftChatMember) {
        this.leftChatMember = leftChatMember;

        return this;
    }

    public Message newChatTitle(String newChatTitle) {
        this.newChatTitle = newChatTitle;

        return this;
    }

    public Message newChatPhoto(ArrayList<PhotoSize> newChatPhoto) {
        this.newChatPhoto = newChatPhoto;

        return this;
    }

    public Message deleteChatPhoto(boolean deleteChatPhoto) {
        this.deleteChatPhoto = deleteChatPhoto;

        return this;
    }

    public Message groupChatCreated(boolean groupChatCreated) {
        this.groupChatCreated = groupChatCreated;

        return this;
    }

    public Message supergroupChatCreated(boolean supergroupChatCreated) {
        this.supergroupChatCreated = supergroupChatCreated;

        return this;
    }

    public Message channelChatCreated(boolean channelChatCreated) {
        this.channelChatCreated = channelChatCreated;

        return this;
    }

    public Message migrateToChatId(int migrateToChatId) {
        this.migrateToChatId = migrateToChatId;

        return this;
    }

    public Message migrateFromChatId(int migrateFromChatId) {
        this.migrateFromChatId = migrateFromChatId;

        return this;
    }

    public Message pinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;

        return this;
    }

    public Message successfulPayment(SuccessfulPayment successfulPayment) {
        this.successfulPayment = successfulPayment;

        return this;
    }

    public Message connectedWebsite(String connectedWebsite) {
        this.connectedWebsite = connectedWebsite;

        return this;
    }

    public Message passportData(PassportData passportData) {
        this.passportData = passportData;

        return this;
    }

    public Message replyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public int getMessage_id() {
        return message_id;
    }

    public User getFrom() {
        return from;
    }

    public int getDate() {
        return date;
    }

    public User getForwardFrom() {
        return forwardFrom;
    }

    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    public int getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    public String getForwardSignature() {
        return forwardSignature;
    }

    public String getForwardSenderName() {
        return forwardSenderName;
    }

    public int getForwardDate() {
        return forwardDate;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public int getEditDate() {
        return editDate;
    }

    public String getMediaGroupId() {
        return mediaGroupId;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public String getText() {
        return text;
    }

    public ArrayList<MessageEntity> getEntities() {
        return entities;
    }

    public ArrayList<MessageEntity> getCaptionEntities() {
        return captionEntities;
    }

    public Audio getAudio() {
        return audio;
    }

    public Document getDocument() {
        return document;
    }

    public Animation getAnimation() {
        return animation;
    }

    public Game getGame() {
        return game;
    }

    public ArrayList<PhotoSize> getPhoto() {
        return photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Video getVideo() {
        return video;
    }

    public Voice getVoice() {
        return voice;
    }

    public VideoNote getVideoNote() {
        return videoNote;
    }

    public String getCaption() {
        return caption;
    }

    public Contact getContact() {
        return contact;
    }

    public Location getLocation() {
        return location;
    }

    public Venue getVenue() {
        return venue;
    }

    public Poll getPoll() {
        return poll;
    }

    public ArrayList<User> getNewChatMembers() {
        return newChatMembers;
    }

    public User getLeftChatMember() {
        return leftChatMember;
    }

    public String getNewChatTitle() {
        return newChatTitle;
    }

    public ArrayList<PhotoSize> getNewChatPhoto() {
        return newChatPhoto;
    }

    public boolean isDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    public boolean isGroupChatCreated() {
        return groupChatCreated;
    }

    public boolean isSupergroupChatCreated() {
        return supergroupChatCreated;
    }

    public boolean isChannelChatCreated() {
        return channelChatCreated;
    }

    public int getMigrateToChatId() {
        return migrateToChatId;
    }

    public int getMigrateFromChatId() {
        return migrateFromChatId;
    }

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public SuccessfulPayment getSuccessfulPayment() {
        return successfulPayment;
    }

    public String getConnectedWebsite() {
        return connectedWebsite;
    }

    public PassportData getPassportData() {
        return passportData;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public JSONObject toObject() {
        JSONObject object = new JSONObject();

        object.put("text", text);
        object.put("message_id", message_id);
        object.put("date", date);

        return object;
    }

    @Override
    public String toString() {
        return toObject().toString(4);
    }
}
