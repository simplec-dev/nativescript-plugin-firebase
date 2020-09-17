package org.nativescript.plugins.firebase;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseInstanceIDService extends FirebaseMessagingService {

  @Override
  public void onNewToken(String refreshedToken) {
    // Send to client
    FirebasePlugin.executeOnPushTokenReceivedCallback(refreshedToken);
  }
}
