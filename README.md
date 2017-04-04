# PermissionManager

Permission manager for Android Runtime Permissions.

This module allow to easy handling permissions in android for all the versions. Includng pre-runtime permission versions.
Androir version 5.1 sdk 22 or lower
Android verion 6.0 sdk 23 or upper.

# How to use

Implement the Listener interface:

```java
public class MainActivity extends AppCompatActivity implements PermissionManagerListener {
...
```

Create the object and attach the listener:

```java
...
PermissionManager mPermissionManager = new PermissionManager(this);
PermissionManager mPermissionManager.onAttach(this);
...
```

Override onRequestPermissionsResult and call PermissionManager method:

```java
@Override
public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    mPermissionManager.onRequestPermissionsResult(requestCode, permissions, grantResults);
}
```

Override onPermissionsGranted and onPermissionsDenied to handle permission response:

```java
@Override
public void onPermissionsGranted(int requestCode) {
    switch (requestCode) {
        case PermissionManager.PERMISSION_READ_EXTERNAL_STORAGE_CODE:
            // action
            break;
        case PermissionManager.PERMISSION_READ_CONTACTS_CODE:
            // action
            break;
        case PermissionManager.PERMISSION_CAMERA_CODE:
            // action
            break;
            
        ...
            
    }
}
    
@Override
public void onPermissionsDenied(int requestCode) {
    switch (requestCode) {
        case PermissionManager.PERMISSION_READ_EXTERNAL_STORAGE_CODE:
            // action
            break;
        case PermissionManager.PERMISSION_READ_CONTACTS_CODE:
            // action
            break;
        case PermissionManager.PERMISSION_CAMERA_CODE:
            // action
            break;

        ...
            
    }
}
```

And finally, to use it, ask for the permission you want to use.

```java
mPermissionManager.askForReadExternalStorage();
```

Don´t forget to add permissions in manifest.xml

```xml
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
```

# More info about runtime permissions
https://developer.android.com/training/permissions/requesting.html
