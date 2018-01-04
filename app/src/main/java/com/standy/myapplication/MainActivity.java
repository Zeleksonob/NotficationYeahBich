package com.standy.myapplication;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RemoteViews;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sasda(View view) {

        createNotification("Sitting For X minutes","dsfdfsdf","",this,1,"1");

    }

    public static void createNotification(String title, String body, String image_url, Context context, int notificationsId, String single_id) {
        Intent nxotificationIntent;

        long when = System.currentTimeMillis();
        int id = (int) System.currentTimeMillis();

     //   Bitmap bitmap = getBitmapFromURL(image_url);
        RemoteViews contentView = new RemoteViews(context.getPackageName(), R.layout.notexpanded);
        RemoteViews contentView2 = new RemoteViews(context.getPackageName(), R.layout.expanded);

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setStyle(new android.support.v4.app.NotificationCompat.DecoratedCustomViewStyle())
                .setCustomContentView(contentView)
                .setCustomBigContentView(contentView2);

contentView.setTextColor(R.id.content_title,context.getResources().getColor(R.color.red));


        NotificationManager mNotificationManager = (NotificationManager) context
                .getSystemService(Context.NOTIFICATION_SERVICE);

//        notificationIntent = new Intent(context, SinglePost.class);
//        notificationIntent.putExtra("single_id",single_id);
//        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
//        PendingIntent contentIntent = PendingIntent.getActivity(context, id, notificationIntent, 0);
//
//        Notification notification = mBuilder.build();
//        notification.contentIntent = contentIntent;
//        notification.flags |= Notification.FLAG_AUTO_CANCEL;
//        notification.defaults |= Notification.DEFAULT_SOUND;
//        notification.defaults |= Notification.DEFAULT_VIBRATE;


        mNotificationManager.notify(notificationsId, mBuilder.build());

    }
}
