package com.github.adalpari.permissionmanager.exampleapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.adalpari.permissionmanager.R;
import com.github.adalpari.permissionmanager.lib.PermissionManager;
import com.github.adalpari.permissionmanager.lib.PermissionManagerListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements PermissionManagerListener {

    @BindView(R.id.button_read_external_storage)
    Button bReadStorageead;
    @BindView(R.id.textView_read_external_storage)
    TextView tvReadStorage;

    @BindView(R.id.button_access_coarse_location)
    Button bAccessLocation;
    @BindView(R.id.textView_access_coarse_location)
    TextView tvAccessLocation;

    @BindView(R.id.button_camera)
    Button bCamera;
    @BindView(R.id.textView_camera)
    TextView tvCamera;

    @BindView(R.id.button_read_sms)
    Button bSMS;
    @BindView(R.id.textView_read_sms)
    TextView tvSMS;

    @BindView(R.id.button_read_contacts)
    Button bReadContacts;
    @BindView(R.id.textView_read_contacts)
    TextView tvReadContacts;

    PermissionManager mPermissionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mPermissionManager = new PermissionManager(this);
        mPermissionManager.onAttach(this);
    }

    @OnClick({R.id.button_read_external_storage, R.id.button_read_contacts, R.id.button_read_sms,
                R.id.button_camera, R.id.button_access_coarse_location})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_read_external_storage:
                mPermissionManager.askForReadExternalStorage();
                break;
            case R.id.button_read_contacts:
                mPermissionManager.askForReadContacts();
                break;
            case R.id.button_read_sms:
                mPermissionManager.askForReadSMS();
                break;
            case R.id.button_camera:
                mPermissionManager.askForCamera();
                break;
            case R.id.button_access_coarse_location:
                mPermissionManager.askForAccessCoarseLocation();
                break;
        }

    }

    @Override
    public void onPermissionsGranted(int requestCode) {
        switch (requestCode) {
            case PermissionManager.PERMISSION_READ_EXTERNAL_STORAGE_CODE:
                tvReadStorage.setTextColor(getResources().getColor(R.color.green));
                tvReadStorage.setText(R.string.allowed);
                break;
            case PermissionManager.PERMISSION_READ_CONTACTS_CODE:
                tvReadContacts.setTextColor(getResources().getColor(R.color.green));
                tvReadContacts.setText(R.string.allowed);
                break;
            case PermissionManager.PERMISSION_READ_SMS_CODE:
                tvSMS.setTextColor(getResources().getColor(R.color.green));
                tvSMS.setText(R.string.allowed);
                break;
            case PermissionManager.PERMISSION_CAMERA_CODE:
                tvCamera.setTextColor(getResources().getColor(R.color.green));
                tvCamera.setText(R.string.allowed);
                break;
            case PermissionManager.PERMISSION_ACCESS_COARSE_LOCATION_CODE:
                tvAccessLocation.setTextColor(getResources().getColor(R.color.green));
                tvAccessLocation.setText(R.string.allowed);
                break;
        }
    }

    @Override
    public void onPermissionsDenied(int requestCode) {
        switch (requestCode) {
            case PermissionManager.PERMISSION_READ_EXTERNAL_STORAGE_CODE:
                tvReadStorage.setTextColor(getResources().getColor(R.color.red));
                tvReadStorage.setText(R.string.denied);
                break;
            case PermissionManager.PERMISSION_READ_CONTACTS_CODE:
                tvReadContacts.setTextColor(getResources().getColor(R.color.red));
                tvReadContacts.setText(R.string.denied);
                break;
            case PermissionManager.PERMISSION_READ_SMS_CODE:
                tvSMS.setTextColor(getResources().getColor(R.color.red));
                tvSMS.setText(R.string.denied);
                break;
            case PermissionManager.PERMISSION_CAMERA_CODE:
                tvCamera.setTextColor(getResources().getColor(R.color.red));
                tvCamera.setText(R.string.denied);
                break;
            case PermissionManager.PERMISSION_ACCESS_COARSE_LOCATION_CODE:
                tvAccessLocation.setTextColor(getResources().getColor(R.color.red));
                tvAccessLocation.setText(R.string.denied);
                break;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        mPermissionManager.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
