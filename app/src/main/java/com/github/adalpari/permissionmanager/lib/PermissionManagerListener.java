package com.github.adalpari.permissionmanager.lib;

/**
 * Created by plaza.a on 21/10/2016.
 */

public interface PermissionManagerListener {
    void onPermissionsGranted(int requestCode);

    void onPermissionsDenied(int requestCode);
}
