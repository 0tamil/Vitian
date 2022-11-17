package com.dexterous.flutterlocalnotifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.Keep;
import androidx.core.app.j;
import androidx.core.app.m;
import androidx.core.app.n;
import androidx.core.graphics.drawable.IconCompat;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import f.b.c.e;
import f.b.c.f;
import h.a.d.a.d;
import h.a.d.a.k;
import h.a.d.a.n;
import h.a.d.a.o;
import io.flutter.embedding.engine.i.a;
import io.flutter.embedding.engine.i.c.c;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.a.a.g;
import k.a.a.q;
import k.a.a.t;
@Keep
/* loaded from: classes.dex */
public class FlutterLocalNotificationsPlugin implements k.c, n, io.flutter.embedding.engine.i.a, io.flutter.embedding.engine.i.c.a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    private static final String CANCEL_TAG = "tag";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DRAWABLE = "drawable";
    private static final String GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE = "GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE";
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_CODE = "GET_ACTIVE_NOTIFICATIONS_ERROR_CODE";
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "GET_NOTIFICATION_CHANNELS_ERROR_CODE";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "INVALID_BIG_PICTURE";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "INVALID_ICON";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "INVALID_LARGE_ICON";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "INVALID_LED_DETAILS";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "INVALID_SOUND";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    static String NOTIFICATION_DETAILS = "notificationDetails";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    private static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SCHEDULE_METHOD = "schedule";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_DAILY_AT_TIME_METHOD = "showDailyAtTime";
    private static final String SHOW_METHOD = "show";
    private static final String SHOW_WEEKLY_AT_DAY_AND_TIME_METHOD = "showWeeklyAtDayAndTime";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    static e gson;
    private Context applicationContext;
    private k channel;
    private Intent launchIntent;
    private Activity mainActivity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f.b.c.a0.a<ArrayList<NotificationDetails>> {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[NotificationStyle.values().length];
            c = iArr;
            try {
                iArr[NotificationStyle.BigPicture.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[NotificationStyle.BigText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[NotificationStyle.Inbox.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[NotificationStyle.Messaging.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[NotificationStyle.Media.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[IconSource.values().length];
            b = iArr2;
            try {
                iArr2[IconSource.DrawableResource.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[IconSource.BitmapFilePath.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[IconSource.ContentUri.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[IconSource.FlutterBitmapAsset.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[IconSource.ByteArray.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[RepeatInterval.values().length];
            a = iArr3;
            try {
                iArr3[RepeatInterval.EveryMinute.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[RepeatInterval.Hourly.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[RepeatInterval.Daily.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[RepeatInterval.Weekly.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private static void applyGrouping(NotificationDetails notificationDetails, j.e eVar) {
        boolean z;
        if (!StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            eVar.x(notificationDetails.groupKey);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
                eVar.z(true);
            }
            eVar.y(notificationDetails.groupAlertBehavior.intValue());
        }
    }

    private void areNotificationsEnabled(k.d dVar) {
        dVar.b(Boolean.valueOf(getNotificationManager(this.applicationContext).a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e buildGson() {
        if (gson == null) {
            RuntimeTypeAdapterFactory registerSubtype = RuntimeTypeAdapterFactory.of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class);
            f fVar = new f();
            fVar.c(registerSubtype);
            gson = fVar.b();
        }
        return gson;
    }

    private static androidx.core.app.n buildPerson(Context context, PersonDetails personDetails) {
        IconSource iconSource;
        if (personDetails == null) {
            return null;
        }
        n.a aVar = new n.a();
        aVar.b(BooleanUtils.getValue(personDetails.bot));
        Object obj = personDetails.icon;
        if (!(obj == null || (iconSource = personDetails.iconBitmapSource) == null)) {
            aVar.c(getIconFromSource(context, obj, iconSource));
        }
        aVar.d(BooleanUtils.getValue(personDetails.important));
        String str = personDetails.key;
        if (str != null) {
            aVar.e(str);
        }
        String str2 = personDetails.name;
        if (str2 != null) {
            aVar.f(str2);
        }
        String str3 = personDetails.uri;
        if (str3 != null) {
            aVar.g(str3);
        }
        return aVar.a();
    }

    private static long calculateNextNotificationTrigger(long j2, long j3) {
        while (j2 < System.currentTimeMillis()) {
            j2 += j3;
        }
        return j2;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        int i2 = b.a[notificationDetails.repeatInterval.ordinal()];
        if (i2 == 1) {
            return 60000L;
        }
        if (i2 == 2) {
            return 3600000L;
        }
        if (i2 != 3) {
            return i2 != 4 ? 0L : 604800000L;
        }
        return 86400000L;
    }

    private static Boolean canCreateNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        NotificationChannelAction notificationChannelAction;
        if (Build.VERSION.SDK_INT < 26) {
            return Boolean.FALSE;
        }
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(notificationChannelDetails.id);
        return Boolean.valueOf((notificationChannel == null && ((notificationChannelAction = notificationChannelDetails.channelAction) == null || notificationChannelAction == NotificationChannelAction.CreateIfNotExists)) || (notificationChannel != null && notificationChannelDetails.channelAction == NotificationChannelAction.Update));
    }

    private void cancel(h.a.d.a.j jVar, k.d dVar) {
        Map map = (Map) jVar.b();
        cancelNotification((Integer) map.get(CANCEL_ID), (String) map.get(CANCEL_TAG));
        dVar.b(null);
    }

    private void cancelAllNotifications(k.d dVar) {
        getNotificationManager(this.applicationContext).d();
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (loadScheduledNotifications == null || loadScheduledNotifications.isEmpty()) {
            dVar.b(null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        dVar.b(null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, ScheduledNotificationReceiver.class)));
        m notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.b(num.intValue());
        } else {
            notificationManager.c(str, num.intValue());
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bArr[i2] = (byte) ((Double) arrayList.get(i2)).intValue();
        }
        return bArr;
    }

    private static j.h.a createMessage(Context context, MessageDetails messageDetails) {
        String str;
        j.h.a aVar = new j.h.a(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (!(str2 == null || (str = messageDetails.dataMimeType) == null)) {
            aVar.j(str, Uri.parse(str2));
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        NotificationChannelDetails fromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context, fromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context, fromNotificationDetails);
        }
        Intent launchIntent = getLaunchIntent(context);
        launchIntent.setAction(SELECT_NOTIFICATION);
        launchIntent.putExtra(PAYLOAD, notificationDetails.payload);
        int i2 = 134217728;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 201326592;
        }
        PendingIntent activity = PendingIntent.getActivity(context, notificationDetails.id.intValue(), launchIntent, i2);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails.styleInformation;
        j.e eVar = new j.e(context, notificationDetails.channelId);
        eVar.s(defaultStyleInformation.htmlFormatTitle.booleanValue() ? fromHtml(notificationDetails.title) : notificationDetails.title);
        eVar.r(defaultStyleInformation.htmlFormatBody.booleanValue() ? fromHtml(notificationDetails.body) : notificationDetails.body);
        eVar.O(notificationDetails.ticker);
        eVar.l(BooleanUtils.getValue(notificationDetails.autoCancel));
        eVar.q(activity);
        eVar.G(notificationDetails.priority.intValue());
        eVar.E(BooleanUtils.getValue(notificationDetails.ongoing));
        eVar.F(BooleanUtils.getValue(notificationDetails.onlyAlertOnce));
        setSmallIcon(context, notificationDetails, eVar);
        eVar.A(getBitmapFromSource(context, notificationDetails.largeIcon, notificationDetails.largeIconBitmapSource));
        Integer num = notificationDetails.color;
        if (num != null) {
            eVar.o(num.intValue());
        }
        Boolean bool = notificationDetails.colorized;
        if (bool != null) {
            eVar.p(bool.booleanValue());
        }
        Boolean bool2 = notificationDetails.showWhen;
        if (bool2 != null) {
            eVar.J(BooleanUtils.getValue(bool2));
        }
        Long l = notificationDetails.when;
        if (l != null) {
            eVar.T(l.longValue());
        }
        Boolean bool3 = notificationDetails.usesChronometer;
        if (bool3 != null) {
            eVar.Q(bool3.booleanValue());
        }
        if (BooleanUtils.getValue(notificationDetails.fullScreenIntent)) {
            eVar.w(activity, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.shortcutId).booleanValue()) {
            eVar.I(notificationDetails.shortcutId);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.subText).booleanValue()) {
            eVar.N(notificationDetails.subText);
        }
        setVisibility(notificationDetails, eVar);
        applyGrouping(notificationDetails, eVar);
        setSound(context, notificationDetails, eVar);
        setVibrationPattern(notificationDetails, eVar);
        setLights(notificationDetails, eVar);
        setStyle(context, notificationDetails, eVar);
        setProgress(notificationDetails, eVar);
        setCategory(notificationDetails, eVar);
        setTimeoutAfter(notificationDetails, eVar);
        Notification b2 = eVar.b();
        int[] iArr = notificationDetails.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            for (int i3 : iArr) {
                b2.flags = i3 | b2.flags;
            }
        }
        return b2;
    }

    private void createNotificationChannel(h.a.d.a.j jVar, k.d dVar) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) jVar.b()));
        dVar.b(null);
    }

    private void createNotificationChannelGroup(h.a.d.a.j jVar, k.d dVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            NotificationChannelGroupDetails from = NotificationChannelGroupDetails.from((Map) jVar.b());
            NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
            NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(from.id, from.name);
            if (i2 >= 28) {
                notificationChannelGroup.setDescription(from.description);
            }
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
        dVar.b(null);
    }

    private void deleteNotificationChannel(h.a.d.a.j jVar, k.d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannel((String) jVar.b());
        }
        dVar.b(null);
    }

    private void deleteNotificationChannelGroup(h.a.d.a.j jVar, k.d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannelGroup((String) jVar.b());
        }
        dVar.b(null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        String str;
        IconSource iconSource;
        if (iconCompat == null) {
            return null;
        }
        int s = iconCompat.s();
        if (s == 2) {
            iconSource = IconSource.DrawableResource;
            str = this.applicationContext.getResources().getResourceEntryName(iconCompat.n());
        } else if (s != 4) {
            return null;
        } else {
            iconSource = IconSource.ContentUri;
            str = iconCompat.u().toString();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source", Integer.valueOf(iconSource.ordinal()));
        hashMap.put("data", str);
        return hashMap;
    }

    private Map<String, Object> describePerson(androidx.core.app.n nVar) {
        if (nVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("key", nVar.d());
        hashMap.put("name", nVar.e());
        hashMap.put("uri", nVar.f());
        hashMap.put("bot", Boolean.valueOf(nVar.g()));
        hashMap.put("important", Boolean.valueOf(nVar.h()));
        hashMap.put("icon", describeIcon(nVar.c()));
        return hashMap;
    }

    private NotificationDetails extractNotificationDetails(k.d dVar, Map<String, Object> map) {
        NotificationDetails from = NotificationDetails.from(map);
        if (hasInvalidIcon(dVar, from.icon) || hasInvalidLargeIcon(dVar, from.largeIcon, from.largeIconBitmapSource) || hasInvalidBigPictureResources(dVar, from) || hasInvalidRawSoundResource(dVar, from) || hasInvalidLedDetails(dVar, from)) {
            return null;
        }
        return from;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    private void getActiveNotificationMessagingStyle(h.a.d.a.j jVar, k.d dVar) {
        StatusBarNotification[] activeNotifications;
        Notification notification;
        if (Build.VERSION.SDK_INT < 23) {
            dVar.a(GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE, "Android version must be 6.0 or newer to use getActiveNotificationMessagingStyle", null);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        try {
            Map map = (Map) jVar.b();
            int intValue = ((Integer) map.get(CANCEL_ID)).intValue();
            String str = (String) map.get(CANCEL_TAG);
            for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
                if (statusBarNotification.getId() == intValue && (str == null || str.equals(statusBarNotification.getTag()))) {
                    notification = statusBarNotification.getNotification();
                    break;
                }
            }
            notification = null;
            if (notification == null) {
                dVar.b(null);
                return;
            }
            j.h y = j.h.y(notification);
            if (y == null) {
                dVar.b(null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("groupConversation", Boolean.valueOf(y.E()));
            hashMap.put("person", describePerson(y.C()));
            hashMap.put("conversationTitle", y.A());
            ArrayList arrayList = new ArrayList();
            for (j.h.a aVar : y.B()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("text", aVar.h());
                hashMap2.put("timestamp", Long.valueOf(aVar.i()));
                hashMap2.put("person", describePerson(aVar.g()));
                arrayList.add(hashMap2);
            }
            hashMap.put("messages", arrayList);
            dVar.b(hashMap);
        } catch (Throwable th) {
            dVar.a(GET_ACTIVE_MESSAGING_STYLE_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private void getActiveNotifications(k.d dVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            dVar.a(GET_ACTIVE_NOTIFICATIONS_ERROR_CODE, GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE, null);
            return;
        }
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService("notification")).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap hashMap = new HashMap();
                hashMap.put(CANCEL_ID, Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                if (i2 >= 26) {
                    hashMap.put("channelId", notification.getChannelId());
                }
                hashMap.put("groupKey", notification.getGroup());
                hashMap.put(CANCEL_TAG, statusBarNotification.getTag());
                hashMap.put("title", notification.extras.getCharSequence("android.title"));
                hashMap.put("body", notification.extras.getCharSequence("android.text"));
                arrayList.add(hashMap);
            }
            dVar.b(arrayList);
        } catch (Throwable th) {
            dVar.a(GET_ACTIVE_NOTIFICATIONS_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private static PendingIntent getActivityPendingIntent(Context context, int i2, Intent intent) {
        return PendingIntent.getActivity(context, i2, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] castObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(castObjectToByteArray, 0, castObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i2, Intent intent) {
        return PendingIntent.getBroadcast(context, i2, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        int i2 = b.b[iconSource.ordinal()];
        if (i2 == 1) {
            return IconCompat.k(context, getDrawableResourceId(context, (String) obj));
        }
        if (i2 == 2) {
            return IconCompat.g(BitmapFactory.decodeFile((String) obj));
        }
        if (i2 == 3) {
            return IconCompat.i((String) obj);
        }
        if (i2 == 4) {
            try {
                AssetFileDescriptor openFd = context.getAssets().openFd(h.a.a.e().c().i((String) obj));
                FileInputStream createInputStream = openFd.createInputStream();
                IconCompat g2 = IconCompat.g(BitmapFactory.decodeStream(createInputStream));
                createInputStream.close();
                openFd.close();
                return g2;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else if (i2 != 5) {
            return null;
        } else {
            byte[] castObjectToByteArray = castObjectToByteArray(obj);
            return IconCompat.j(castObjectToByteArray, 0, castObjectToByteArray.length);
        }
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        if (Build.VERSION.SDK_INT >= 26) {
            hashMap.put(CANCEL_ID, notificationChannel.getId());
            hashMap.put("name", notificationChannel.getName());
            hashMap.put("description", notificationChannel.getDescription());
            hashMap.put("groupId", notificationChannel.getGroup());
            hashMap.put("showBadge", Boolean.valueOf(notificationChannel.canShowBadge()));
            hashMap.put("importance", Integer.valueOf(notificationChannel.getImportance()));
            Uri sound = notificationChannel.getSound();
            if (sound == null) {
                hashMap.put("sound", null);
                hashMap.put("playSound", Boolean.FALSE);
            } else {
                hashMap.put("playSound", Boolean.TRUE);
                List asList = Arrays.asList(SoundSource.values());
                if (sound.getScheme().equals("android.resource")) {
                    String[] split = sound.toString().split("/");
                    str = split[split.length - 1];
                    Integer tryParseInt = tryParseInt(str);
                    if (tryParseInt == null || (str = this.applicationContext.getResources().getResourceEntryName(tryParseInt.intValue())) != null) {
                        hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                    }
                } else {
                    hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.Uri)));
                    str = sound.toString();
                }
                hashMap.put("sound", str);
            }
            hashMap.put("enableVibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
            hashMap.put("vibrationPattern", notificationChannel.getVibrationPattern());
            hashMap.put("enableLights", Boolean.valueOf(notificationChannel.shouldShowLights()));
            hashMap.put("ledColor", Integer.valueOf(notificationChannel.getLightColor()));
        }
        return hashMap;
    }

    static String getNextFireDate(NotificationDetails notificationDetails) {
        if (Build.VERSION.SDK_INT >= 26) {
            ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
            if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1L));
            } else if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
                return null;
            } else {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1L));
            }
        } else {
            ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency2 = notificationDetails.scheduledNotificationRepeatFrequency;
            if (scheduledNotificationRepeatFrequency2 == ScheduledNotificationRepeatFrequency.Daily) {
                return k.a.a.v.b.f3626j.b(g.X(notificationDetails.scheduledDateTime).a0(1L));
            } else if (scheduledNotificationRepeatFrequency2 != ScheduledNotificationRepeatFrequency.Weekly) {
                return null;
            } else {
                return k.a.a.v.b.f3626j.b(g.X(notificationDetails.scheduledDateTime).f0(1L));
            }
        }
    }

    static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        if (Build.VERSION.SDK_INT >= 26) {
            ZoneId of = ZoneId.of(notificationDetails.timeZoneName);
            ZonedDateTime of2 = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), of);
            ZonedDateTime now = ZonedDateTime.now(of);
            ZonedDateTime of3 = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), of2.getHour(), of2.getMinute(), of2.getSecond(), of2.getNano(), of);
            while (of3.isBefore(now)) {
                of3 = of3.plusDays(1L);
            }
            DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
            if (dateTimeComponents == DateTimeComponents.Time) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
            }
            if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
                while (of3.getDayOfWeek() != of2.getDayOfWeek()) {
                    of3 = of3.plusDays(1L);
                }
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
            } else if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
                while (of3.getDayOfMonth() != of2.getDayOfMonth()) {
                    of3 = of3.plusDays(1L);
                }
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
            } else if (dateTimeComponents != DateTimeComponents.DateAndTime) {
                return null;
            } else {
                while (true) {
                    if (of3.getMonthValue() == of2.getMonthValue() && of3.getDayOfMonth() == of2.getDayOfMonth()) {
                        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
                    }
                    of3 = of3.plusDays(1L);
                }
            }
        } else {
            q t = q.t(notificationDetails.timeZoneName);
            t V = t.V(g.X(notificationDetails.scheduledDateTime), t);
            t T = t.T(t);
            t U = t.U(T.Q(), T.N(), T.J(), V.L(), V.M(), V.P(), V.O(), t);
            while (U.x(T)) {
                U = U.b0(1L);
            }
            DateTimeComponents dateTimeComponents2 = notificationDetails.matchDateTimeComponents;
            if (dateTimeComponents2 == DateTimeComponents.Time) {
                return k.a.a.v.b.f3626j.b(U);
            }
            if (dateTimeComponents2 == DateTimeComponents.DayOfWeekAndTime) {
                while (U.K() != V.K()) {
                    U = U.b0(1L);
                }
                return k.a.a.v.b.f3626j.b(U);
            } else if (dateTimeComponents2 == DateTimeComponents.DayOfMonthAndTime) {
                while (U.J() != V.J()) {
                    U = U.b0(1L);
                }
                return k.a.a.v.b.f3626j.b(U);
            } else if (dateTimeComponents2 != DateTimeComponents.DateAndTime) {
                return null;
            } else {
                while (true) {
                    if (U.N() == V.N() && U.J() == V.J()) {
                        return k.a.a.v.b.f3626j.b(U);
                    }
                    U = U.b0(1L);
                }
            }
        }
    }

    private void getNotificationAppLaunchDetails(k.d dVar) {
        HashMap hashMap = new HashMap();
        Activity activity = this.mainActivity;
        Boolean valueOf = Boolean.valueOf(activity != null && SELECT_NOTIFICATION.equals(activity.getIntent().getAction()) && !launchedActivityFromHistory(this.mainActivity.getIntent()));
        hashMap.put(NOTIFICATION_LAUNCHED_APP, valueOf);
        hashMap.put(PAYLOAD, valueOf.booleanValue() ? this.launchIntent.getStringExtra(PAYLOAD) : null);
        dVar.b(hashMap);
    }

    private void getNotificationChannels(k.d dVar) {
        try {
            List<NotificationChannel> g2 = getNotificationManager(this.applicationContext).g();
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel notificationChannel : g2) {
                arrayList.add(getMappedNotificationChannel(notificationChannel));
            }
            dVar.b(arrayList);
        } catch (Throwable th) {
            dVar.a(GET_NOTIFICATION_CHANNELS_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private static m getNotificationManager(Context context) {
        return m.e(context);
    }

    private boolean hasInvalidBigPictureResources(k.d dVar, NotificationDetails notificationDetails) {
        if (notificationDetails.style != NotificationStyle.BigPicture) {
            return false;
        }
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        if (hasInvalidLargeIcon(dVar, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
            return true;
        }
        BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
        if (bitmapSource == BitmapSource.DrawableResource) {
            String str = (String) bigPictureStyleInformation.bigPicture;
            return StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, dVar, INVALID_BIG_PICTURE_ERROR_CODE);
        } else if (bitmapSource == BitmapSource.FilePath) {
            return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
        } else {
            if (bitmapSource != BitmapSource.ByteArray) {
                return false;
            }
            byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
            return bArr == null || bArr.length == 0;
        }
    }

    private boolean hasInvalidIcon(k.d dVar, String str) {
        return !StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, dVar, INVALID_ICON_ERROR_CODE);
    }

    private boolean hasInvalidLargeIcon(k.d dVar, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource != bitmapSource2 && bitmapSource != BitmapSource.FilePath) {
            return bitmapSource == BitmapSource.ByteArray && ((byte[]) obj).length == 0;
        }
        String str = (String) obj;
        return !StringUtils.isNullOrEmpty(str).booleanValue() && bitmapSource == bitmapSource2 && !isValidDrawableResource(this.applicationContext, str, dVar, INVALID_LARGE_ICON_ERROR_CODE);
    }

    private boolean hasInvalidLedDetails(k.d dVar, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return false;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return false;
        }
        dVar.a(INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE, null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(k.d dVar, NotificationDetails notificationDetails) {
        SoundSource soundSource;
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue() || (((soundSource = notificationDetails.soundSource) != null && soundSource != SoundSource.RawResource) || this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) != 0)) {
            return false;
        }
        dVar.a(INVALID_SOUND_ERROR_CODE, String.format(INVALID_RAW_RESOURCE_ERROR_MESSAGE, notificationDetails.sound), null);
        return true;
    }

    private static void initAndroidThreeTen(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            f.d.a.a.a(context);
        }
    }

    private void initialize(h.a.d.a.j jVar, k.d dVar) {
        String str = (String) ((Map) jVar.b()).get(DEFAULT_ICON);
        if (isValidDrawableResource(this.applicationContext, str, dVar, INVALID_ICON_ERROR_CODE)) {
            initAndroidThreeTen(this.applicationContext);
            this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
            dVar.b(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, k.d dVar, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) != 0) {
            return true;
        }
        dVar.a(str2, String.format(INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE, str), null);
        return false;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        return intent != null && (intent.getFlags() & 1048576) == 1048576;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, null);
        return string != null ? (ArrayList) buildGson().i(string, new a().e()) : arrayList;
    }

    private void onAttachedToEngine(Context context, d dVar) {
        this.applicationContext = context;
        k kVar = new k(dVar, METHOD_CHANNEL);
        this.channel = kVar;
        kVar.e(this);
    }

    private void pendingNotificationRequests(k.d dVar) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put(CANCEL_ID, next.id);
            hashMap.put("title", next.title);
            hashMap.put("body", next.body);
            hashMap.put(PAYLOAD, next.payload);
            arrayList.add(hashMap);
        }
        dVar.b(arrayList);
    }

    public static void registerWith(o oVar) {
        FlutterLocalNotificationsPlugin flutterLocalNotificationsPlugin = new FlutterLocalNotificationsPlugin();
        flutterLocalNotificationsPlugin.setActivity(oVar.b());
        oVar.d(flutterLocalNotificationsPlugin);
        flutterLocalNotificationsPlugin.onAttachedToEngine(oVar.a(), oVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().id.equals(num)) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        saveScheduledNotifications(context, loadScheduledNotifications);
    }

    private void repeat(h.a.d.a.j jVar, k.d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) jVar.b());
        if (extractNotificationDetails != null) {
            repeatNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
            dVar.b(null);
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long calculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long longValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, notificationDetails.repeatTime.hour.intValue());
            calendar.set(12, notificationDetails.repeatTime.minute.intValue());
            calendar.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                calendar.set(7, num.intValue());
            }
            longValue = calendar.getTimeInMillis();
        }
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(longValue, calculateRepeatIntervalMilliseconds);
        String q = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, q);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (BooleanUtils.getValue(notificationDetails.allowWhileIdle)) {
            androidx.core.app.d.b(alarmManager, 0, calculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, calculateNextNotificationTrigger, calculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void rescheduleNotifications(Context context) {
        Boolean bool = Boolean.FALSE;
        initAndroidThreeTen(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications(context).iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (next.repeatInterval != null) {
                repeatNotification(context, next, bool);
            } else if (next.timeZoneName == null) {
                scheduleNotification(context, next, bool);
            } else {
                zonedScheduleNotification(context, next, bool);
            }
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource == null || soundSource == SoundSource.RawResource) {
            return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
        } else if (soundSource == SoundSource.Uri) {
            return Uri.parse(str);
        } else {
            return null;
        }
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (!next.id.equals(notificationDetails.id)) {
                arrayList.add(next);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().q(arrayList)).apply();
    }

    private void schedule(h.a.d.a.j jVar, k.d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) jVar.b());
        if (extractNotificationDetails != null) {
            scheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
            dVar.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String q = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, q);
        androidx.core.app.d.b(getAlarmManager(context), 0, calculateNextNotificationTrigger, getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String q = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, q);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (BooleanUtils.getValue(notificationDetails.allowWhileIdle)) {
            androidx.core.app.d.b(alarmManager, 0, notificationDetails.millisecondsSinceEpoch.longValue(), broadcastPendingIntent);
        } else {
            androidx.core.app.d.a(alarmManager, 0, notificationDetails.millisecondsSinceEpoch.longValue(), broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        this.channel.c("selectNotification", intent.getStringExtra(PAYLOAD));
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
        if (activity != null) {
            this.launchIntent = activity.getIntent();
        }
    }

    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, j.e eVar) {
        Bitmap bitmapFromSource;
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        j.b bVar = new j.b();
        if (bigPictureStyleInformation.contentTitle != null) {
            bVar.A(bigPictureStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigPictureStyleInformation.contentTitle) : bigPictureStyleInformation.contentTitle);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            bVar.B(bigPictureStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigPictureStyleInformation.summaryText) : bigPictureStyleInformation.summaryText);
        }
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            bitmapFromSource = null;
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                bitmapFromSource = getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource);
            }
            bVar.z(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
            eVar.M(bVar);
        }
        bVar.y(bitmapFromSource);
        bVar.z(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
        eVar.M(bVar);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, j.e eVar) {
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        j.c cVar = new j.c();
        if (bigTextStyleInformation.bigText != null) {
            cVar.x(bigTextStyleInformation.htmlFormatBigText.booleanValue() ? fromHtml(bigTextStyleInformation.bigText) : bigTextStyleInformation.bigText);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            cVar.y(bigTextStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigTextStyleInformation.contentTitle) : bigTextStyleInformation.contentTitle);
        }
        if (bigTextStyleInformation.summaryText != null) {
            boolean booleanValue = bigTextStyleInformation.htmlFormatSummaryText.booleanValue();
            String str = bigTextStyleInformation.summaryText;
            Spanned spanned = str;
            if (booleanValue) {
                spanned = fromHtml(str);
            }
            cVar.z(spanned);
        }
        eVar.M(cVar);
    }

    private static void setCategory(NotificationDetails notificationDetails, j.e eVar) {
        String str = notificationDetails.category;
        if (str != null) {
            eVar.m(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.j$i, androidx.core.app.j$g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.text.Spanned] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.core.app.j$e] */
    private static void setInboxStyle(NotificationDetails notificationDetails, j.e eVar) {
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        ?? gVar = new j.g();
        if (inboxStyleInformation.contentTitle != null) {
            gVar.y(inboxStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(inboxStyleInformation.contentTitle) : inboxStyleInformation.contentTitle);
        }
        if (inboxStyleInformation.summaryText != null) {
            gVar.z(inboxStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(inboxStyleInformation.summaryText) : inboxStyleInformation.summaryText);
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (inboxStyleInformation.htmlFormatLines.booleanValue()) {
                    next = fromHtml(next);
                }
                gVar.x(next);
            }
        }
        eVar.M(gVar);
    }

    private static void setLights(NotificationDetails notificationDetails, j.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.enableLights) && notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            eVar.B(notificationDetails.ledColor.intValue(), notificationDetails.ledOnMs.intValue(), notificationDetails.ledOffMs.intValue());
        }
    }

    private static void setMediaStyle(j.e eVar) {
        eVar.M(new androidx.media.d.a());
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, j.e eVar) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        j.h hVar = new j.h(buildPerson(context, messagingStyleInformation.person));
        hVar.I(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            hVar.H(str);
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                hVar.x(createMessage(context, it.next()));
            }
        }
        eVar.M(hVar);
    }

    private static void setProgress(NotificationDetails notificationDetails, j.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            eVar.H(notificationDetails.maxProgress.intValue(), notificationDetails.progress.intValue(), notificationDetails.indeterminate.booleanValue());
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, j.e eVar) {
        int intValue;
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            intValue = getDrawableResourceId(context, notificationDetails.icon);
        } else {
            String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, null);
            intValue = StringUtils.isNullOrEmpty(string).booleanValue() ? notificationDetails.iconResourceId.intValue() : getDrawableResourceId(context, string);
        }
        eVar.K(intValue);
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, j.e eVar) {
        eVar.L(BooleanUtils.getValue(notificationDetails.playSound) ? retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource) : null);
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, j.e eVar) {
        int i2 = b.c[notificationDetails.style.ordinal()];
        if (i2 == 1) {
            setBigPictureStyle(context, notificationDetails, eVar);
        } else if (i2 == 2) {
            setBigTextStyle(notificationDetails, eVar);
        } else if (i2 == 3) {
            setInboxStyle(notificationDetails, eVar);
        } else if (i2 == 4) {
            setMessagingStyle(context, notificationDetails, eVar);
        } else if (i2 == 5) {
            setMediaStyle(eVar);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, j.e eVar) {
        Long l = notificationDetails.timeoutAfter;
        if (l != null) {
            eVar.P(l.longValue());
        }
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, j.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.enableVibration)) {
            long[] jArr = notificationDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                eVar.R(jArr);
                return;
            }
            return;
        }
        eVar.R(new long[]{0});
    }

    private static void setVisibility(NotificationDetails notificationDetails, j.e eVar) {
        Integer num = notificationDetails.visibility;
        if (num != null) {
            int intValue = num.intValue();
            int i2 = 1;
            if (intValue == 0) {
                i2 = 0;
            } else if (intValue != 1) {
                if (intValue == 2) {
                    i2 = -1;
                } else {
                    throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
                }
            }
            eVar.S(i2);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel(notificationChannelDetails.id, notificationChannelDetails.name, notificationChannelDetails.importance.intValue());
            notificationChannel.setDescription(notificationChannelDetails.description);
            notificationChannel.setGroup(notificationChannelDetails.groupId);
            if (notificationChannelDetails.playSound.booleanValue()) {
                notificationChannel.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(5).build());
            } else {
                notificationChannel.setSound(null, null);
            }
            notificationChannel.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
            long[] jArr = notificationChannelDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                notificationChannel.setVibrationPattern(jArr);
            }
            boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
            notificationChannel.enableLights(value);
            if (value && (num = notificationChannelDetails.ledColor) != null) {
                notificationChannel.setLightColor(num.intValue());
            }
            notificationChannel.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private void show(h.a.d.a.j jVar, k.d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) jVar.b());
        if (extractNotificationDetails != null) {
            showNotification(this.applicationContext, extractNotificationDetails);
            dVar.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification createNotification = createNotification(context, notificationDetails);
        m notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        int intValue = notificationDetails.id.intValue();
        if (str != null) {
            notificationManager.i(str, intValue, createNotification);
        } else {
            notificationManager.h(intValue, createNotification);
        }
    }

    private void startForegroundService(h.a.d.a.j jVar, k.d dVar) {
        String str;
        Map<String, Object> map = (Map) jVar.a("notificationData");
        Integer num = (Integer) jVar.a("startType");
        ArrayList arrayList = (ArrayList) jVar.a("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            str = "If foregroundServiceTypes is non-null it must not be empty!";
        } else if (map == null || num == null) {
            str = "An argument passed to startForegroundService was null!";
        } else {
            NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, map);
            if (extractNotificationDetails == null) {
                return;
            }
            if (extractNotificationDetails.id.intValue() != 0) {
                com.dexterous.flutterlocalnotifications.b bVar = new com.dexterous.flutterlocalnotifications.b(extractNotificationDetails, num.intValue(), arrayList);
                Intent intent = new Intent(this.applicationContext, com.dexterous.flutterlocalnotifications.a.class);
                intent.putExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", bVar);
                androidx.core.content.a.m(this.applicationContext, intent);
                dVar.b(null);
                return;
            }
            str = "The id of the notification for a foreground service must not be 0!";
        }
        dVar.a("ARGUMENT_ERROR", str, null);
    }

    private void stopForegroundService(k.d dVar) {
        this.applicationContext.stopService(new Intent(this.applicationContext, com.dexterous.flutterlocalnotifications.a.class));
        dVar.b(null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(h.a.d.a.j jVar, k.d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) jVar.b());
        if (extractNotificationDetails != null) {
            if (extractNotificationDetails.matchDateTimeComponents != null) {
                extractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(extractNotificationDetails);
            }
            zonedScheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
            dVar.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        initAndroidThreeTen(context);
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate != null) {
            notificationDetails.scheduledDateTime = nextFireDate;
            zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        initAndroidThreeTen(context);
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents != null) {
            notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
            zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
        }
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String q = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, q);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        long epochMilli = Build.VERSION.SDK_INT >= 26 ? ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli() : t.V(g.X(notificationDetails.scheduledDateTime), q.t(notificationDetails.timeZoneName)).B().I();
        if (BooleanUtils.getValue(notificationDetails.allowWhileIdle)) {
            androidx.core.app.d.b(alarmManager, 0, epochMilli, broadcastPendingIntent);
        } else {
            androidx.core.app.d.a(alarmManager, 0, epochMilli, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onAttachedToActivity(c cVar) {
        cVar.b(this);
        Activity d2 = cVar.d();
        this.mainActivity = d2;
        this.launchIntent = d2.getIntent();
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        onAttachedToEngine(bVar.a(), bVar.b());
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(h.a.d.a.j jVar, k.d dVar) {
        String str = jVar.a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2096263152:
                if (str.equals(STOP_FOREGROUND_SERVICE)) {
                    c = 0;
                    break;
                }
                break;
            case -2041662895:
                if (str.equals(GET_NOTIFICATION_CHANNELS_METHOD)) {
                    c = 1;
                    break;
                }
                break;
            case -1889739879:
                if (str.equals(SHOW_WEEKLY_AT_DAY_AND_TIME_METHOD)) {
                    c = 2;
                    break;
                }
                break;
            case -1873731438:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c = 3;
                    break;
                }
                break;
            case -1367724422:
                if (str.equals(CANCEL_METHOD)) {
                    c = 4;
                    break;
                }
                break;
            case -799130106:
                if (str.equals(PENDING_NOTIFICATION_REQUESTS_METHOD)) {
                    c = 5;
                    break;
                }
                break;
            case -697920873:
                if (str.equals(SCHEDULE_METHOD)) {
                    c = 6;
                    break;
                }
                break;
            case -208611345:
                if (str.equals(GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD)) {
                    c = 7;
                    break;
                }
                break;
            case 3529469:
                if (str.equals(SHOW_METHOD)) {
                    c = '\b';
                    break;
                }
                break;
            case 6625712:
                if (str.equals(PERIODICALLY_SHOW_METHOD)) {
                    c = '\t';
                    break;
                }
                break;
            case 116003316:
                if (str.equals(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD)) {
                    c = '\n';
                    break;
                }
                break;
            case 476547271:
                if (str.equals(CANCEL_ALL_METHOD)) {
                    c = 11;
                    break;
                }
                break;
            case 548573423:
                if (str.equals(ZONED_SCHEDULE_METHOD)) {
                    c = '\f';
                    break;
                }
                break;
            case 767006947:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c = '\r';
                    break;
                }
                break;
            case 871091088:
                if (str.equals(INITIALIZE_METHOD)) {
                    c = 14;
                    break;
                }
                break;
            case 891942317:
                if (str.equals(ARE_NOTIFICATIONS_ENABLED_METHOD)) {
                    c = 15;
                    break;
                }
                break;
            case 1008472557:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_METHOD)) {
                    c = 16;
                    break;
                }
                break;
            case 1207771056:
                if (str.equals(START_FOREGROUND_SERVICE)) {
                    c = 17;
                    break;
                }
                break;
            case 1408864732:
                if (str.equals(SHOW_DAILY_AT_TIME_METHOD)) {
                    c = 18;
                    break;
                }
                break;
            case 1594833996:
                if (str.equals(GET_ACTIVE_NOTIFICATIONS_METHOD)) {
                    c = 19;
                    break;
                }
                break;
            case 1653467900:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_METHOD)) {
                    c = 20;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                stopForegroundService(dVar);
                return;
            case 1:
                getNotificationChannels(dVar);
                return;
            case 2:
            case '\t':
            case 18:
                repeat(jVar, dVar);
                return;
            case 3:
                deleteNotificationChannelGroup(jVar, dVar);
                return;
            case 4:
                cancel(jVar, dVar);
                return;
            case 5:
                pendingNotificationRequests(dVar);
                return;
            case 6:
                schedule(jVar, dVar);
                return;
            case 7:
                getNotificationAppLaunchDetails(dVar);
                return;
            case '\b':
                show(jVar, dVar);
                return;
            case '\n':
                getActiveNotificationMessagingStyle(jVar, dVar);
                return;
            case 11:
                cancelAllNotifications(dVar);
                return;
            case '\f':
                zonedSchedule(jVar, dVar);
                return;
            case '\r':
                createNotificationChannelGroup(jVar, dVar);
                return;
            case 14:
                initialize(jVar, dVar);
                return;
            case 15:
                areNotificationsEnabled(dVar);
                return;
            case 16:
                deleteNotificationChannel(jVar, dVar);
                return;
            case 17:
                startForegroundService(jVar, dVar);
                return;
            case 19:
                getActiveNotifications(dVar);
                return;
            case 20:
                createNotificationChannel(jVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }

    @Override // h.a.d.a.n
    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean booleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (booleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return booleanValue;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        cVar.b(this);
        this.mainActivity = cVar.d();
    }
}
