package com.fsck.k9;

import android.util.TypedValue;
import android.widget.TextView;

import com.fsck.k9.preferences.Storage;
import com.fsck.k9.preferences.StorageEditor;


/**
 * Manage font size of the information displayed in the message list and in the message view.
 */
public class FontSizes {
    private static final String MESSAGE_LIST_SUBJECT = "fontSizeMessageListSubject";
    private static final String MESSAGE_LIST_SENDER = "fontSizeMessageListSender";
    private static final String MESSAGE_LIST_DATE = "fontSizeMessageListDate";
    private static final String MESSAGE_LIST_PREVIEW = "fontSizeMessageListPreview";
    private static final String MESSAGE_VIEW_SENDER = "fontSizeMessageViewSender";
    private static final String MESSAGE_VIEW_TO = "fontSizeMessageViewTo";
    private static final String MESSAGE_VIEW_CC = "fontSizeMessageViewCC";
    private static final String MESSAGE_VIEW_BCC = "fontSizeMessageViewBCC";
    private static final String MESSAGE_VIEW_ADDITIONAL_HEADERS = "fontSizeMessageViewAdditionalHeaders";
    private static final String MESSAGE_VIEW_SUBJECT = "fontSizeMessageViewSubject";
    private static final String MESSAGE_VIEW_DATE = "fontSizeMessageViewDate";
    private static final String MESSAGE_VIEW_CONTENT_PERCENT = "fontSizeMessageViewContentPercent";
    private static final String MESSAGE_COMPOSE_INPUT = "fontSizeMessageComposeInput";

    public static final int FONT_DEFAULT = -1;   // Don't force-reset the size of this setting
    public static final int FONT_10SP = 10;
    public static final int FONT_12SP = 12;
    public static final int SMALL = 14;         // ?android:attr/textAppearanceSmall
    public static final int FONT_16SP = 16;
    public static final int MEDIUM = 18;        // ?android:attr/textAppearanceMedium
    public static final int FONT_20SP = 20;
    public static final int LARGE = 22;         // ?android:attr/textAppearanceLarge


    private int messageListSubject;
    private int messageListSender;
    private int messageListDate;
    private int messageListPreview;
    private int messageViewSender;
    private int messageViewTo;
    private int messageViewCC;
    private int messageViewBCC;
    private int messageViewAdditionalHeaders;
    private int messageViewSubject;
    private int messageViewDate;
    private int messageViewContentPercent;
    private int messageComposeInput;


    public FontSizes() {
        messageListSubject = FONT_DEFAULT;
        messageListSender = FONT_DEFAULT;
        messageListDate = FONT_DEFAULT;
        messageListPreview = FONT_DEFAULT;

        messageViewSender = FONT_DEFAULT;
        messageViewTo = FONT_DEFAULT;
        messageViewCC = FONT_DEFAULT;
        messageViewBCC = FONT_DEFAULT;
        messageViewAdditionalHeaders = FONT_DEFAULT;
        messageViewSubject = FONT_DEFAULT;
        messageViewDate = FONT_DEFAULT;
        messageViewContentPercent = 100;

        messageComposeInput = MEDIUM;
    }

    public void save(StorageEditor editor) {
        editor.putInt(MESSAGE_LIST_SUBJECT, messageListSubject);
        editor.putInt(MESSAGE_LIST_SENDER, messageListSender);
        editor.putInt(MESSAGE_LIST_DATE, messageListDate);
        editor.putInt(MESSAGE_LIST_PREVIEW, messageListPreview);

        editor.putInt(MESSAGE_VIEW_SENDER, messageViewSender);
        editor.putInt(MESSAGE_VIEW_TO, messageViewTo);
        editor.putInt(MESSAGE_VIEW_CC, messageViewCC);
        editor.putInt(MESSAGE_VIEW_BCC, messageViewBCC);
        editor.putInt(MESSAGE_VIEW_ADDITIONAL_HEADERS, messageViewAdditionalHeaders);
        editor.putInt(MESSAGE_VIEW_SUBJECT, messageViewSubject);
        editor.putInt(MESSAGE_VIEW_DATE, messageViewDate);
        editor.putInt(MESSAGE_VIEW_CONTENT_PERCENT, getMessageViewContentAsPercent());

        editor.putInt(MESSAGE_COMPOSE_INPUT, messageComposeInput);
    }

    public void load(Storage storage) {
        messageListSubject = storage.getInt(MESSAGE_LIST_SUBJECT, messageListSubject);
        messageListSender = storage.getInt(MESSAGE_LIST_SENDER, messageListSender);
        messageListDate = storage.getInt(MESSAGE_LIST_DATE, messageListDate);
        messageListPreview = storage.getInt(MESSAGE_LIST_PREVIEW, messageListPreview);

        messageViewSender = storage.getInt(MESSAGE_VIEW_SENDER, messageViewSender);
        messageViewTo = storage.getInt(MESSAGE_VIEW_TO, messageViewTo);
        messageViewCC = storage.getInt(MESSAGE_VIEW_CC, messageViewCC);
        messageViewBCC = storage.getInt(MESSAGE_VIEW_BCC, messageViewBCC);
        messageViewAdditionalHeaders = storage.getInt(MESSAGE_VIEW_ADDITIONAL_HEADERS, messageViewAdditionalHeaders);
        messageViewSubject = storage.getInt(MESSAGE_VIEW_SUBJECT, messageViewSubject);
        messageViewDate = storage.getInt(MESSAGE_VIEW_DATE, messageViewDate);

        loadMessageViewContentPercent(storage);

        messageComposeInput = storage.getInt(MESSAGE_COMPOSE_INPUT, messageComposeInput);
    }

    private void loadMessageViewContentPercent(Storage storage) {
        setMessageViewContentAsPercent(storage.getInt(MESSAGE_VIEW_CONTENT_PERCENT, 100));
    }

    public int getMessageListSubject() {
        return messageListSubject;
    }

    public void setMessageListSubject(int messageListSubject) {
        this.messageListSubject = messageListSubject;
    }

    public int getMessageListSender() {
        return messageListSender;
    }

    public void setMessageListSender(int messageListSender) {
        this.messageListSender = messageListSender;
    }

    public int getMessageListDate() {
        return messageListDate;
    }

    public void setMessageListDate(int messageListDate) {
        this.messageListDate = messageListDate;
    }

    public int getMessageListPreview() {
        return messageListPreview;
    }

    public void setMessageListPreview(int messageListPreview) {
        this.messageListPreview = messageListPreview;
    }

    public int getMessageViewSender() {
        return messageViewSender;
    }

    public void setMessageViewSender(int messageViewSender) {
        this.messageViewSender = messageViewSender;
    }

    public int getMessageViewTo() {
        return messageViewTo;
    }

    public void setMessageViewTo(int messageViewTo) {
        this.messageViewTo = messageViewTo;
    }

    public int getMessageViewCC() {
        return messageViewCC;
    }

    public void setMessageViewCC(int messageViewCC) {
        this.messageViewCC = messageViewCC;
    }

    public int getMessageViewBCC() {
        return messageViewBCC;
    }

    public void setMessageViewBCC(int messageViewBCC) {
        this.messageViewBCC = messageViewBCC;
    }

    public int getMessageViewAdditionalHeaders() {
        return messageViewAdditionalHeaders;
    }

    public void setMessageViewAdditionalHeaders(int messageViewAdditionalHeaders) {
        this.messageViewAdditionalHeaders = messageViewAdditionalHeaders;
    }

    public int getMessageViewSubject() {
        return messageViewSubject;
    }

    public void setMessageViewSubject(int messageViewSubject) {
        this.messageViewSubject = messageViewSubject;
    }

    public int getMessageViewDate() {
        return messageViewDate;
    }

    public void setMessageViewDate(int messageViewDate) {
        this.messageViewDate = messageViewDate;
    }

    public int getMessageViewContentAsPercent() {
        return messageViewContentPercent;
    }

    public void setMessageViewContentAsPercent(int size) {
        messageViewContentPercent = size;
    }

    public int getMessageComposeInput() {
        return messageComposeInput;
    }

    public void setMessageComposeInput(int messageComposeInput) {
        this.messageComposeInput = messageComposeInput;
    }

    // This, arguably, should live somewhere in a view class, but since we call it from activities, fragments
    // and views, where isn't exactly clear.
    public void setViewTextSize(TextView v, int fontSize) {
        if (fontSize != FONT_DEFAULT) {
            v.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize);
        }
    }
}
