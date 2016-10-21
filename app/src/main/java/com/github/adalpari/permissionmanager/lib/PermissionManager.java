package com.github.adalpari.permissionmanager.lib;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

/**
 * Created by plaza.a on 21/10/2016.
 */

public class PermissionManager {

    public final static int PERMISSION_READ_CALENDAR_CODE              = 1;
    public final static int PERMISSION_WRITE_CALENDAR_CODE             = 2;
    public final static int PERMISSION_CAMERA_CODE                     = 3;
    public final static int PERMISSION_READ_CONTACTS_CODE              = 4;
    public final static int PERMISSION_WRITE_CONTACTS_CODE             = 5;
    public final static int PERMISSION_GET_ACCOUNTS_CODE               = 6;
    public final static int PERMISSION_ACCESS_FINE_LOCATION_CODE       = 7;
    public final static int PERMISSION_ACCESS_COARSE_LOCATION_CODE     = 8;
    public final static int PERMISSION_RECORD_AUDIO_CODE               = 9;
    public final static int PERMISSION_READ_PHONE_STATE_CODE           = 10;
    public final static int PERMISSION_CALL_PHONE_CODE                 = 11;
    public final static int PERMISSION_READ_CALL_LOG_CODE              = 12;
    public final static int PERMISSION_WRITE_CALL_LOG_CODE             = 13;
    public final static int PERMISSION_ADD_VOICEMAIL_CODE              = 14;
    public final static int PERMISSION_USE_SIP_CODE                    = 15;
    public final static int PERMISSION_PROCESS_OUTGOING_CALLS_CODE     = 16;
    public final static int PERMISSION_BODY_SENSORS_CODE               = 17;
    public final static int PERMISSION_SEND_SMS_CODE                   = 18;
    public final static int PERMISSION_RECEIVE_SMS_CODE                = 19;
    public final static int PERMISSION_READ_SMS_CODE                   = 20;
    public final static int PERMISSION_RECEIVE_WAP_PUSH_CODE           = 21;
    public final static int PERMISSION_RECEIVE_MMS_CODE                = 22;
    public final static int PERMISSION_READ_EXTERNAL_STORAGE_CODE      = 23;
    public final static int PERMISSION_WRITE_EXTERNAL_STORAGE_CODE     = 24;

    private Activity activity;
    private PermissionManagerListener listener;

    public PermissionManager(Activity activity) {
        this.activity = activity;
    }

    public void onAttach(PermissionManagerListener listener) {
        this.listener = listener;
    }

    /**
     *  Public methods to ask for permissions
     */

    public void askForReadCalendar() {
        String permissionName = Manifest.permission.READ_CALENDAR;
        int permissionCode = PERMISSION_READ_CALENDAR_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForWriteCalendar() {
        String permissionName = Manifest.permission.WRITE_CALENDAR;
        int permissionCode = PERMISSION_WRITE_CALENDAR_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForCamera() {
        String permissionName = Manifest.permission.CAMERA;
        int permissionCode = PERMISSION_CAMERA_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForReadContacts() {
        String permissionName = Manifest.permission.READ_CONTACTS;
        int permissionCode = PERMISSION_READ_CONTACTS_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForWriteContects() {
        String permissionName = Manifest.permission.WRITE_CONTACTS;
        int permissionCode = PERMISSION_WRITE_CONTACTS_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForGetAccounts() {
        String permissionName = Manifest.permission.GET_ACCOUNTS;
        int permissionCode = PERMISSION_GET_ACCOUNTS_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForAccessFineLocation() {
        String permissionName = Manifest.permission.ACCESS_FINE_LOCATION;
        int permissionCode = PERMISSION_ACCESS_FINE_LOCATION_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForAccessCoarseLocation() {
        String permissionName = Manifest.permission.ACCESS_COARSE_LOCATION;
        int permissionCode = PERMISSION_ACCESS_COARSE_LOCATION_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForRecordAudio() {
        String permissionName = Manifest.permission.RECORD_AUDIO;
        int permissionCode = PERMISSION_RECORD_AUDIO_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForReadPhoneState() {
        String permissionName = Manifest.permission.READ_PHONE_STATE;
        int permissionCode = PERMISSION_READ_PHONE_STATE_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForCallPhone() {
        String permissionName = Manifest.permission.CALL_PHONE;
        int permissionCode = PERMISSION_CALL_PHONE_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForReadCallLog() {
        String permissionName = Manifest.permission.READ_CALL_LOG;
        int permissionCode = PERMISSION_READ_CALL_LOG_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForWriteCallLog() {
        String permissionName = Manifest.permission.WRITE_CALL_LOG;
        int permissionCode = PERMISSION_WRITE_CALL_LOG_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForAddVoicemail() {
        String permissionName = Manifest.permission.ADD_VOICEMAIL;
        int permissionCode = PERMISSION_ADD_VOICEMAIL_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForUseSip() {
        String permissionName = Manifest.permission.USE_SIP;
        int permissionCode = PERMISSION_USE_SIP_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForProcessOutgoingCalls() {
        String permissionName = Manifest.permission.PROCESS_OUTGOING_CALLS;
        int permissionCode = PERMISSION_PROCESS_OUTGOING_CALLS_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForBodySensors() {
        String permissionName = Manifest.permission.BODY_SENSORS;
        int permissionCode = PERMISSION_BODY_SENSORS_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForSendSMS() {
        String permissionName = Manifest.permission.SEND_SMS;
        int permissionCode = PERMISSION_SEND_SMS_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForReceiveSMS() {
        String permissionName = Manifest.permission.RECEIVE_SMS;
        int permissionCode = PERMISSION_RECEIVE_SMS_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForReadSMS() {
        String permissionName = Manifest.permission.READ_SMS;
        int permissionCode = PERMISSION_READ_SMS_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForReceiveWAPPush() {
        String permissionName = Manifest.permission.RECEIVE_WAP_PUSH;
        int permissionCode = PERMISSION_RECEIVE_WAP_PUSH_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForReceiveMMS() {
        String permissionName = Manifest.permission.RECEIVE_MMS;
        int permissionCode = PERMISSION_RECEIVE_MMS_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForReadExternalStorage() {
        String permissionName = Manifest.permission.READ_EXTERNAL_STORAGE;
        int permissionCode = PERMISSION_READ_EXTERNAL_STORAGE_CODE;

        callPermission(permissionName, permissionCode);
    }

    public void askForWriteExternalStorage() {
        String permissionName = Manifest.permission.WRITE_EXTERNAL_STORAGE;
        int permissionCode = PERMISSION_WRITE_EXTERNAL_STORAGE_CODE;

        callPermission(permissionName, permissionCode);
    }

    /**
     *  Private methods to check if permission are granted orn ot
     */

    private void callPermission(String permissionName, int permissionCode) {
        // Check permissions to write external store
        if (hasPermissionsTo(activity, permissionName)) {
            listener.onPermissionsGranted(permissionCode);
        } else {
            ActivityCompat.requestPermissions(activity,
                    new String[]{permissionName}, permissionCode);
        }
    }

    private boolean hasPermissionsTo(Context context, String permissionType) {
        return ContextCompat.checkSelfPermission(context, permissionType)
                == PackageManager.PERMISSION_GRANTED;
    }

    /**
     *  Method to handle permissions
     *  It shold be called in Actitity's onRequestPermissionsResult
     */
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {

        // If request is cancelled, the result arrays are empty.
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            // permission was granted
            listener.onPermissionsGranted(requestCode);
        } else {
            // permission denied
            listener.onPermissionsDenied(requestCode);
        }
    }
}
