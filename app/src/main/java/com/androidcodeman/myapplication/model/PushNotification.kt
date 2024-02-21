package com.androidcodeman.myapplication.model

import com.androidcodeman.myapplication.model.NotificationData

data class PushNotification(
    var data: NotificationData,
    var to:String
)